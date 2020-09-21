SUMMARY = "Chaos image"
IMAGE_LINGUAS = " "
LICENSE = "Apache-2.0"

REQUIRED_DISTRO_FEATURES += " systemd"

IMAGE_ROOTFS_SIZE ?= "12288"
IMAGE_ROOTFS_EXTRA_SPACE = "0"

inherit core-image distro_features_check

IMAGE_FEATURES_append = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'development-image', 'debug-tweaks', '', d)} \
    splash \
    ssh-server-openssh \
    "

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    packagegroup-chaos-connectivity \
    packagegroup-chaos \
    e2fsprogs \
    "

