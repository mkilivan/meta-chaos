SUMMARY = "HomeKit support for the impatient"
LICENSE = "Unlicense & MIT & ISC & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34f8c1142fd6208a8be89399cb521df9"

inherit npm

SRC_URI = " \
    npm://registry.npmjs.org/;package=homebridge;version=${PV} \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    file://config.json \
    file://${BPN} \
    file://${BPN}.service \
    "

S = "${WORKDIR}/npm"

RDEPENDS:${PN} += " nodejs-npm"

do_install:append() {
    install -d ${D}/var/lib/homebridge/
	install -m 644 ${WORKDIR}/config.json ${D}/var/lib/homebridge/

    install -d ${D}${sysconfdir}/default/
	install -m 644 ${WORKDIR}/homebridge ${D}${sysconfdir}/default/

    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
		install -d ${D}${systemd_unitdir}/system/
		install -m 644 ${WORKDIR}/${BPN}.service ${D}${systemd_unitdir}/system/
	fi
}

FILES:${PN} += " \
	/var/lib/${BPN}/config.json \
	${sysconfdir}/default/${BPN} \
    ${systemd_unitdir}/system/${BPN}.service \
"

inherit systemd

SYSTEMD_SERVICE:${PN} = "${BPN}.service"
