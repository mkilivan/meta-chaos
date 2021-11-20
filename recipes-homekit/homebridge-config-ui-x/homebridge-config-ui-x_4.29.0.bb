SUMMARY = "A web based management, configuration and control platform for Homebridge"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2f5618b67f78cd9367c0886e001ce27a"

SRC_URI = " \
    npm://registry.npmjs.org/;package=homebridge-config-ui-x;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

S = "${WORKDIR}/npm"

DEPENDS = "libuv"
RDEPENDS:${PN} = "bash"

inherit npm

LICENSE:${PN} = "MIT"
