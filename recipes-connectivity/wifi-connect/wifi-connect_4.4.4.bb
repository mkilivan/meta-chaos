inherit cargo

SRC_URI = "git://github.com/balena-io/wifi-connect.git;protocol=https"
SRCREV="ac333eb6a809b4daf3ac2e41f6c56799852caddc"
LIC_FILES_CHKSUM="file://LICENSE;md5=3bfd34238ccc26128aef96796a8bbf97"

S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""

SRC_URI += " \
    crate://crates.io/aho-corasick/0.6.10 \
    crate://crates.io/ansi_term/0.11.0 \
    crate://crates.io/ascii/0.8.7 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/0.1.7 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/base64/0.9.3 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/bodyparser/0.8.0 \
    crate://crates.io/buf_redux/0.6.3 \
    crate://crates.io/byteorder/1.3.4 \
    crate://crates.io/bytes/0.4.12 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/clap/2.33.3 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/dbus/0.5.4 \
    crate://crates.io/env_logger/0.4.3 \
    crate://crates.io/error-chain/0.11.0 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/futures-cpupool/0.1.8 \
    crate://crates.io/futures/0.1.30 \
    crate://crates.io/gcc/0.3.55 \
    crate://crates.io/hermit-abi/0.1.17 \
    crate://crates.io/httparse/1.3.4 \
    crate://crates.io/hyper/0.10.16 \
    crate://crates.io/idna/0.1.5 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/iron-cors/0.7.1 \
    crate://crates.io/iron/0.6.1 \
    crate://crates.io/itoa/0.4.6 \
    crate://crates.io/language-tags/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.80 \
    crate://crates.io/libdbus-sys/0.1.5 \
    crate://crates.io/log/0.3.9 \
    crate://crates.io/log/0.4.11 \
    crate://crates.io/matches/0.1.8 \
    crate://crates.io/memchr/1.0.2 \
    crate://crates.io/memchr/2.3.4 \
    crate://crates.io/mime/0.2.6 \
    crate://crates.io/mime_guess/1.8.8 \
    crate://crates.io/modifier/0.1.0 \
    crate://crates.io/mount/0.4.0 \
    crate://crates.io/multipart/0.13.6 \
    crate://crates.io/network-manager/0.11.0 \
    crate://crates.io/nix/0.10.0 \
    crate://crates.io/num-bigint/0.1.44 \
    crate://crates.io/num-complex/0.1.43 \
    crate://crates.io/num-integer/0.1.44 \
    crate://crates.io/num-iter/0.1.42 \
    crate://crates.io/num-rational/0.1.42 \
    crate://crates.io/num-traits/0.2.14 \
    crate://crates.io/num/0.1.42 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/params/0.8.0 \
    crate://crates.io/percent-encoding/1.0.1 \
    crate://crates.io/persistent/0.4.0 \
    crate://crates.io/phf/0.7.24 \
    crate://crates.io/phf_codegen/0.7.24 \
    crate://crates.io/phf_generator/0.7.24 \
    crate://crates.io/phf_shared/0.7.24 \
    crate://crates.io/pkg-config/0.3.19 \
    crate://crates.io/plugin/0.2.6 \
    crate://crates.io/proc-macro2/1.0.24 \
    crate://crates.io/quote/1.0.7 \
    crate://crates.io/rand/0.3.23 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.6.5 \
    crate://crates.io/rand_chacha/0.1.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_hc/0.1.0 \
    crate://crates.io/rand_isaac/0.1.1 \
    crate://crates.io/rand_jitter/0.1.4 \
    crate://crates.io/rand_os/0.1.3 \
    crate://crates.io/rand_pcg/0.1.2 \
    crate://crates.io/rand_xorshift/0.1.1 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/regex-syntax/0.5.6 \
    crate://crates.io/regex/0.2.11 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/route-recognizer/0.1.13 \
    crate://crates.io/router/0.6.0 \
    crate://crates.io/rustc-serialize/0.3.24 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/safemem/0.2.0 \
    crate://crates.io/safemem/0.3.3 \
    crate://crates.io/sequence_trie/0.3.6 \
    crate://crates.io/serde/1.0.117 \
    crate://crates.io/serde_derive/1.0.117 \
    crate://crates.io/serde_json/1.0.59 \
    crate://crates.io/siphasher/0.2.3 \
    crate://crates.io/slab/0.3.0 \
    crate://crates.io/staticfile/0.5.0 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/syn/1.0.48 \
    crate://crates.io/tempdir/0.3.7 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thread_local/0.3.6 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/tinyvec/1.0.1 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-timer/0.1.2 \
    crate://crates.io/traitobject/0.1.0 \
    crate://crates.io/twoway/0.1.8 \
    crate://crates.io/typeable/0.1.2 \
    crate://crates.io/typemap/0.3.3 \
    crate://crates.io/ucd-util/0.1.8 \
    crate://crates.io/unicase/1.4.2 \
    crate://crates.io/unicode-bidi/0.3.4 \
    crate://crates.io/unicode-normalization/0.1.14 \
    crate://crates.io/unicode-width/0.1.8 \
    crate://crates.io/unicode-xid/0.2.1 \
    crate://crates.io/unsafe-any/0.4.2 \
    crate://crates.io/url/1.7.2 \
    crate://crates.io/urlencoded/0.6.0 \
    crate://crates.io/utf8-ranges/1.0.4 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.1.5 \
    crate://crates.io/void/1.0.2 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    file://cargo_update.patch \
    file://start-wifi-connect.sh \
    file://wifi-connect.service \
"

SUMMARY = "Utility for dynamically setting the WiFi configuration via a captive portal"
HOMEPAGE = "https://www.balena.io/blog/resin-wifi-connect/"
LICENSE = "Apache-2.0"

DEPENDS = "libdbus-c++"

RDEPENDS_${PN} += " \
    networkmanager \
    "

do_install_append () {
    install -d ${D}${datadir}/wifi-connect/ui
    cp -r ${S}/ui/build/* ${D}${datadir}/wifi-connect/ui

    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -d ${D}${systemd_unitdir}/system
        install -m 644 ${WORKDIR}/wifi-connect.service ${D}${systemd_unitdir}/system
    fi

    install -c -m 0755 ${WORKDIR}/start-wifi-connect.sh ${D}${bindir}
}

FILES_${PN} += " \
    ${datadir}/ui \
    ${systemd_unitdir}/system/wifi-connect.service \
"

inherit systemd

SYSTEMD_SERVICE_${PN} = "${@bb.utils.contains('DISTRO_FEATURES','systemd','wifi-connect.service','',d)}"


# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include wifi-connect-${PV}.inc
include wifi-connect.inc


