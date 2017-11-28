require at91bootstrap.inc

DEFAULT_PREFERENCE = "-1"

SRCREV = "${AUTOREV}"

PV = "3.8+git${SRCPV}"

UBRANCH = "emerson"
SRC_URI = "git://github.com/zaigor2/at91bootstrap.git;protocol=git;branch=${UBRANCH}"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://main.c;endline=27;md5=a2a70db58191379e2550cbed95449fbd"
