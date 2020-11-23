# What is meta-chaos?
meta-chaos is a set of recipes for the poky build system, which enables cross-building GNU/Linux images for home automation projects. By enabling meta-chaos, you can cross-build some of popular projects, such as [Homebridge](https://github.com/homebridge/homebridge) and [wifi-connect](https://github.com/balena-io/wifi-connect).

The main purpose of meta-chaos is to provide reference Linux distribution for home automation systems satisfying the following needs.

* Stability
* Customizability

# Quick Start
This section introduces how to generate the minimal system with meta-chaos and how to run it on a [Raspberry Pi](https://www.raspberrypi.org/) board.
### Setup build environment
The google [repo](https://gerrit.googlesource.com/git-repo/+/refs/heads/master/README.md) tool and associated manifest files are used for managing the list of repositories needed for the build.

The board-specific manifests are defined in [chaos-yocto-manifest](https://github.com/mkilivan/chaos-yocto-manifest) project.

```
$ repo init -u https://github.com/mkilivan/chaos-yocto-manifest \
            -m raspberrypi.xml \
            -b dunfell
$ repo sync
```
### Build target images
```
$ source setup-environment raspberrypi
$ bitbake core-image-minimal
```
### Using the build output
After a successful build, the images and build artifacts are placed in `tmp/deploy/images/raspberrypi3/`. The image will have `.rpi-sdimg` suffix. Use [balenaEtcher](https://www.balena.io/etcher) to write the image on SD card.
