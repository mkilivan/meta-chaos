inherit deploy

FILESEXTRAPATHS:append := ":${THISDIR}/files"

SRC_URI:append = " \
    file://NetworkManager.conf.systemd \
    file://NetworkManager.conf \
    file://nm-tmpfiles.conf \
    "

RDEPENDS:${PN}:append = " \
    chrony \
    chronyc \
    "
FILES:${PN}:append = " ${sysconfdir}/*"
EXTRA_OECONF += " \
    --disable-ovs \
    "
PACKAGECONFIG:append = " modemmanager ppp"

# The external DHCP client doesn't work well with our `ipv4.dhcp-timeout`
# configuration. Switch to the internal one.
PACKAGECONFIG:remove = "dhclient"
EXTRA_OECONF += " \
	--with-config-dhcp-default=internal \
	--with-dhclient=no \
	"

do_install:append() {
    install -d ${D}${sysconfdir}/tmpfiles.d
    install -m 0644 ${WORKDIR}/nm-tmpfiles.conf ${D}${sysconfdir}/tmpfiles.d/

    install -m 0644 ${WORKDIR}/NetworkManager.conf ${D}${sysconfdir}/NetworkManager/
    mkdir -p "${D}${sysconfdir}/NetworkManager/dispatcher.d/"

    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -d ${D}${sysconfdir}/systemd/system/NetworkManager.service.d
        install -m 0644 ${WORKDIR}/NetworkManager.conf.systemd ${D}${sysconfdir}/systemd/system/NetworkManager.service.d/NetworkManager.conf
    fi

    # remove these empty not-used (at this moment) directories so we don't have to package them
    rmdir ${D}${libdir}/NetworkManager/conf.d
    rmdir ${D}${libdir}/NetworkManager/VPN
}

do_deploy() {
    mkdir -p "${DEPLOYDIR}/system-connections/"
}
addtask deploy before do_package after do_install
