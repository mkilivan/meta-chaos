
# Customize chaos-img
BOOT_PARTITION_FILES_rpi = " \
    ${KERNEL_IMAGETYPE}${KERNEL_INITRAMFS}-${MACHINE}.bin:/${SDIMG_KERNELIMAGE} \
    "

python overlay_dtbs_handler () {
    # Add all the dtb files programatically
    if d.getVar('SOC_FAMILY', True) == 'rpi':
        kernel_imagetype = d.getVar('KERNEL_IMAGETYPE', True)
        boot_partition_files = d.getVar('BOOT_PARTITION_FILES', True)

        overlay_dtbs = split_overlays(d, 0)
        root_dtbs = split_overlays(d, 1)

        for dtb in root_dtbs.split():
            dtb = os.path.basename(dtb)
            boot_partition_files += "\t%s-%s:/%s" % (kernel_imagetype, dtb, dtb)

        for dtb in overlay_dtbs.split():
            dtb = os.path.basename(dtb)
            boot_partition_files += "\t%s-%s:/overlays/%s" % (kernel_imagetype, dtb, dtb)

        d.setVar('BOOT_PARTITION_FILES', boot_partition_files)
}

addhandler overlay_dtbs_handler
overlay_dtbs_handler[eventmask] = "bb.event.RecipePreFinalise"

