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
    \
    libsodium \
    \
    nginx \
    curl \
    \
    lua \
"
### lighttpd

inherit core-image
