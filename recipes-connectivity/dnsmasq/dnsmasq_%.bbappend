FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
	file://network-manager \
"

inherit update-alternatives

do_install:append () {
    install -d ${D}${sysconfdir}/dnsmasq.d
    install -c -m 0644 ${WORKDIR}/network-manager ${D}${sysconfdir}/dnsmasq.d/
}
