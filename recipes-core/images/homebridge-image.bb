inherit core-image

IMAGE_INSTALL:append = " \
    homebridge \
    homebridge-config-ui-x \
    mosquitto \
    filesystem-expand \
    wifi-connect \
  "
