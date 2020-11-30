![build](https://github.com/mkilivan/meta-chaos/workflows/build/badge.svg)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
# meta-chaos

## Description

meta-chaos is a set of recipes for the poky build system, which enables cross-building GNU/Linux images for home automation projects. By enabling meta-chaos, you can cross-build some of the popular projects, such as [Homebridge](https://github.com/homebridge/homebridge) and [wifi-connect](https://github.com/balena-io/wifi-connect).

The main purpose of meta-chaos is to provide reference Linux distribution for home automation systems satisfying the following needs.

* Stability
* Customizability

## Dependencies

This layer depends on:

    URI: git://git.yoctoproject.org/poky
    branch: master
    revision: HEAD

    URI: git://git.openembedded.org/meta-openembedded
    layers: meta-oe, meta-networking, meta-python
    branch: master
    revision: HEAD

    URI: git://github.com/meta-rust/meta-rust
    branch: master
    revision: HEAD

## Quick Start
This section introduces how to generate the minimal system with meta-chaos and how to run it on a [Raspberry Pi](https://www.raspberrypi.org/) board.
### Setup build environment
The [kas tool](https://github.com/siemens/kas) is used to setup to project and build it.

```
$ sudo pip3 install kas
```
### Build target images
```
$ kas build kas-poky.yml:board-rpi.yml
```
### Using the build output
After a successful build, the images and build artifacts are placed in `tmp/deploy/images/raspberrypi3/`. The image will have `.rpi-sdimg` suffix. Use [balenaEtcher](https://www.balena.io/etcher) to write the image on SD card.

## Credits
<a href="https://github.com/homebridge/homebridge"><img src="https://raw.githubusercontent.com/homebridge/branding/master/logos/homebridge-color-round-stylized.png" height="140"></a>

**Homebridge** allows you to integrate with smart home devices that do not natively support HomeKit.

<a href="https://github.com/balena-io/wifi-connect"><img width="460" src="https://github.com/balena-io/wifi-connect/raw/master/docs/images/wifi-connect.png" /></a>

**WiFi Connect** is a utility for dynamically setting the WiFi configuration on a Linux device via a captive portal. WiFi credentials are specified by connecting with a mobile phone or laptop to the access point that WiFi Connect creates.

## Contributing
To contribute send github pull requests targeting [this](https://github.com/mkilivan/meta-chaos) repository.

Please refer to: [Yocto Contribution Guidelines](https://wiki.yoctoproject.org/wiki/Contribution_Guidelines#General_Information) and try to use the commit log format as stated there.
