require u-boot-atmel.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=22;md5=2687c5ebfd9cb284491c3204b726ea29"

SRCREV = "${AUTOREV}"

PV = "v2017.03-at91+git${SRCPV}"

UBRANCH = "u-boot-2017.03-emerson"
SRC_URI = "git://github.com/zaigor2/u-boot-at91.git;branch=${UBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = '(at91sam9260ek|ipro4)'
