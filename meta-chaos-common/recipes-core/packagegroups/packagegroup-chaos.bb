SUMMARY = "Chaos Package Group"
LICENSE = "Apache-2.0"

PR = "r1"

inherit packagegroup

include packagegroup-chaos.inc

# Additional packages
RDEPENDS_${PN} += " \
    docker-ce \
    "
