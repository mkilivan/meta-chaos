SUMMARY = "Chaos Package Group"
LICENSE = "Apache-2.0"

PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', bb.utils.contains('DISTRO_FEATURES', 'development-image', 'systemd-analyze', '', d), '', d)} \
    rsync \
    kernel-modules \
    os-release \
    less \
    "
