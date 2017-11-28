DESCRIPTION = "A core image for Emerson sam9260 based boards with wireless support"
LICENSE = "MIT"
PR = "r1"

require emerson-core-image-minimal.inc

#IMAGE_FEATURES += ""

IMAGE_INSTALL += "\
    wpa-supplicant \
    iw \
    hostapd \
    \
    bluez5 \
    bluez5-testtools \
    bluez5-obex \
"
