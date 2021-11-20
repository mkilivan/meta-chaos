DESCRIPTION = "Data partition filesystem expander"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = " \
    file://filesystem-expand \
    file://filesystem-expand.service \
    "
S = "${WORKDIR}"

inherit allarch systemd

SYSTEMD_SERVICE:${PN} = "filesystem-expand.service"

RDEPENDS:${PN} = " \
    coreutils \
    e2fsprogs-resize2fs \
    e2fsprogs-e2fsck \
    parted \
    util-linux \
    "

do_install() {
    install -d ${D}${bindir}
    install -m 0775 ${WORKDIR}/filesystem-expand ${D}${bindir}

    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -d ${D}${systemd_unitdir}/system
        install -c -m 0644 ${WORKDIR}/filesystem-expand.service ${D}${systemd_unitdir}/system
        sed -i -e 's,@BASE_BINDIR@,${base_bindir},g' \
            -e 's,@SBINDIR@,${sbindir},g' \
            -e 's,@BINDIR@,${bindir},g' \
            ${D}${systemd_unitdir}/system/*.service
    fi
}
