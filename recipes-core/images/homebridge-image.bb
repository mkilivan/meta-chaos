inherit core-image

IMAGE_INSTALL_append = " wifi-connect homebridge"
IMAGE_INSTALL_append_rpi = " homebridge-energenie-ener314rt"