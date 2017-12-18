IMAGE_FEATURES += "ssh-server-openssh package-management"

IMAGE_INSTALL += "\
    packagegroup-core-boot \
    u-boot-fw-utils \
    mtd-utils mtd-utils-ubifs \
    coreutils \
    \
    mpack \
    \
    iptables \
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
"

inherit core-image
