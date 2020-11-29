# meta-chaos

## Description

meta-chaos is a set of recipes for the poky build system, which enables cross-building GNU/Linux images for home automation projects. By enabling meta-chaos, you can cross-build some of popular projects, such as [Homebridge](https://github.com/homebridge/homebridge) and [wifi-connect](https://github.com/balena-io/wifi-connect).

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
$ kas build meta-chaos/kas-poky.yml:board-rpi.yml
```
### Using the build output
After a successful build, the images and build artifacts are placed in `tmp/deploy/images/raspberrypi3/`. The image will have `.rpi-sdimg` suffix. Use [balenaEtcher](https://www.balena.io/etcher) to write the image on SD card.

## Contributing
To contribute send github pull requests targeting [this](https://github.com/mkilivan/meta-chaos) repository.

Please refer to: [Yocto Contribution Guidelines](https://wiki.yoctoproject.org/wiki/Contribution_Guidelines#General_Information) and try to use the commit log format as stated there.
