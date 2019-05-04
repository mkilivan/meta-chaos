# Poky based distro file
require conf/distro/poky.conf

DISTRO = "chaos"
DISTRO_NAME = "CHAOS"
DISTRO_VERSION = "1.0.0"
HOSTOS_VERSION = "${DISTRO_VERSION}"
MAINTAINER = "Murat Kilivan <murat.kilivan@gmail.com>"

# Strip down unneeded features
POKY_DEFAULT_DISTRO_FEATURES_remove = "ptest"
POKY_DEFAULT_DISTRO_FEATURES_remove = "wayland"
DISTRO_FEATURES_DEFAULT_remove = "x11"

# Development image mode
DEVELOPMENT_IMAGE ?= "0"
DISTRO_FEATURES_append = " ${@bb.utils.contains('DEVELOPMENT_IMAGE','1','development-image','',d)}"

# Providers
PREFERRED_PROVIDER_docker ?= "docker"
PREFERRED_PROVIDER_jpeg ?= "jpeg"
PREFERRED_PROVIDER_jpeg-native ?= "jpeg-native"

# defaults to ipk packages
PACKAGE_CLASSES ?= "package_ipk"

BAD_RECOMMENDATIONS += "shared-mime-info"
