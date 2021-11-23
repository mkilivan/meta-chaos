inherit core-image

IMAGE_INSTALL:append = " \
    homebridge \
    homebridge-config-ui-x \
    node-red \
    mosquitto \
    filesystem-expand \
    wifi-connect \
  "
