inherit core-image

IMAGE_INSTALL:append = " wifi-connect homebridge filesystem-expand"
IMAGE_INSTALL:append_rpi = " homebridge-energenie-ener314rt"