SUMMARY = "energenie-ener314rt plugin for the Homebridge project"
HOMEPAGE = "https://github.com/mkilivan/homebridge-energenie-ener314rt#readme"

LICENSE = "MIT "
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2c4337a0ba3577ea4e4f747aab23455 \
                    file://node_modules/energenie-ener314rt/LICENSE;md5=fd4d9565864d137ce29e3cf67cec7e61 \
                    file://node_modules/energenie-ener314rt/C/energenie/LICENSE;md5=ee5af031107944229461bd4a90e283d5 \
                    file://package.json;md5=c6f6d4cbb53bca663dd6a50c0e6d7409 \
                    file://node_modules/energenie-ener314rt/package.json;md5=29ee3f8933cfd3e9d24d94b9f70e155d"

SRC_URI = " \
    git://github.com/mkilivan/homebridge-energenie-ener314rt;protocol=https;branch=main \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "1.0.2+git${SRCPV}"
SRCREV = "1e89697e1498e23b62c1ebe53ec3d636c9af26e9"

S = "${WORKDIR}/git"

RDEPENDS:${PN} += "homebridge"

inherit npm

LICENSE:${PN} = "MIT"
LICENSE:${PN}-energenie-ener314rt = "MIT"
