inherit core-image

IMAGE_INSTALL_append = " wifi-connect homebridge filesystem-expand"
IMAGE_INSTALL_append_rpi = " homebridge-energenie-ener314rt"