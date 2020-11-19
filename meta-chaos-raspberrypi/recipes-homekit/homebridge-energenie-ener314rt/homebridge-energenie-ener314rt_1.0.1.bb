SUMMARY = "energenie-ener314rt plugin for the Homebridge project"
HOMEPAGE = "https://github.com/mkilivan/homebridge-energenie-ener314rt#readme"

LICENSE = "MIT "
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2c4337a0ba3577ea4e4f747aab23455 \
                    file://node_modules/energenie-ener314rt/LICENSE;md5=fd4d9565864d137ce29e3cf67cec7e61 \
                    file://node_modules/energenie-ener314rt/C/energenie/LICENSE;md5=ee5af031107944229461bd4a90e283d5 \
                    file://package.json;md5=c7c2f1cd0f78324d07e74d0b6ce4397e \
                    file://node_modules/energenie-ener314rt/package.json;md5=29ee3f8933cfd3e9d24d94b9f70e155d"

SRC_URI = " \
    git://github.com/mkilivan/homebridge-energenie-ener314rt;protocol=https;branch=main \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

# Modify these as desired
PV = "1.0.1+git${SRCPV}"
SRCREV = "84736f95f77ff4a4f66c1adcaaeb6abc0c5bfa32"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "homebridge"

inherit npm

LICENSE_${PN} = "MIT"
LICENSE_${PN}-energenie-ener314rt = "MIT"
