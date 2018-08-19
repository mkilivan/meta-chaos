SUMMARY = "chaos image"
IMAGE_LINGUAS = " "
LICENSE = "Apache-2.0"

REQUIRED_DISTRO_FEATURES += " systemd"

inherit core-image distro_features_check

IMAGE_FEATURES_append = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'development-image', 'debug-tweaks', '', d)} \
    splash \
    "
# ${MACHINE_EXTRA_RRECOMMENDS}
IMAGE_INSTALL = " \
    packagegroup-core-boot \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    packagegroup-chaos-connectivity \
    packagegroup-chaos \
    "

