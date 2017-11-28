DESCRIPTION = "Simple tools for encoding/decoding MIME messages"
SECTION = "utils"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.unix;md5=051b99a33e90ff77ef0c8992a02fd660"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "http://ftp.andrew.cmu.edu/pub/mpack/mpack-${PV}.tar.gz"

SRC_URI[md5sum] = "a70fa5afa76539a9afb70b9d81568fe8"
SRC_URI[sha256sum] = "274108bb3a39982a4efc14fb3a65298e66c8e71367c3dabf49338162d207a94c"

# Make sure our source directory (for the build) matches the directory
# structure in the tarball
S = "${WORKDIR}/mpack-${PV}"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

# Force C99 in order to prevent implicit declaration of built-in functions
CFLAGS_append = " -std=c99"
