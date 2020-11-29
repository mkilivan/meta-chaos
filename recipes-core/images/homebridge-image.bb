# Base this image on core-image-base
include recipes-core/images/core-image-base.bb

IMAGE_INSTALL_append = " homebridge"
IMAGE_INSTALL_append_rpi = " homebridge-energenie-ener314rt"