IMAGE_FEATURES += "ssh-server-openssh package-management"

PREFERRED_VERSION_gnupg = "2.%"

IMAGE_INSTALL += "\
    packagegroup-core-boot \
    u-boot-fw-utils \
    mtd-utils mtd-utils-ubifs \
    coreutils \
    can-utils \
    \
    unzip \
    mpack \
    gnupg \
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
    i2c-tools \
    iproute2 \
"

inherit core-image
