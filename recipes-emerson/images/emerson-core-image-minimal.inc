IMAGE_FEATURES += "ssh-server-openssh package-management"

IMAGE_INSTALL += "\
    packagegroup-core-boot \
    u-boot-fw-utils \
    mtd-utils mtd-utils-ubifs \
    coreutils \
    can-utils \
    \
    mpack \
    \
    iptables \
    iproute2 \
    ppp \
    msmtp \
    net-snmp \
    \
    libsodium \
    \
    lighttpd \
    curl \
    \
    lua \
    can-utils \
    iproute2 \
"

inherit core-image
