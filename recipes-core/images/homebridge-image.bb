inherit core-image

IMAGE_INSTALL:append = " \
    homebridge \
    mosquitto \
    filesystem-expand \
    wifi-connect \
  "
