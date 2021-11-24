SUMMARY = "A web based management, configuration and control platform for Homebridge"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=00fb6de61c1c297ddbef0e1baa47427d"

SRC_URI = " \
    npm://registry.npmjs.org/;package=homebridge-config-ui-x;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

DEPENDS = "libuv"
RDEPENDS:${PN} = "bash"

inherit npm

LICENSE:${PN} = "MIT"

do_install:append() {
     # Remove prebuild binaries
    rm -rf ${D}/${libdir}/node_modules/${BPN}/node_modules/node-pty-prebuilt-multiarch/prebuilds/linux-x64
    rm -rf ${D}/${libdir}/node_modules/${BPN}/node_modules/node-pty-prebuilt-multiarch/prebuilds/linux-ia32
    rm -rf ${D}/${libdir}/node_modules/${BPN}/node_modules/node-pty-prebuilt-multiarch/prebuilds/linux-arm64
    rm -rf ${D}/${libdir}/node_modules/${BPN}/node_modules/node-pty-prebuilt-multiarch/prebuilds/linux-arm
}