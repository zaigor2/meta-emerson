SECTION = "kernel"
DESCRIPTION = "Linux kernel for Emerson boards"
SUMMARY = "Linux kernel for Emerson boards"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel
require recipes-kernel/linux/linux-dtb.inc

RDEPENDS_kernel-base=""
FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRCREV = "${AUTOREV}"

PV = "4.9+git${SRCPV}"

KBRANCH = "linux-4.9-emerson"
SRC_URI = "git://github.com/zaigor2/linux-at91.git;protocol=git;branch=${KBRANCH}"
SRC_URI += "file://defconfig"

S = "${WORKDIR}/git"

python __anonymous () {
	if d.getVar('UBOOT_FIT_IMAGE', True) == 'xyes':
		d.appendVar('DEPENDS', ' u-boot-mkimage-native dtc-native')
}

do_deploy_append() {
	if [ "${UBOOT_FIT_IMAGE}" = "xyes" ]; then
		DTB_PATH="${B}/arch/${ARCH}/boot/dts/"
		if [ ! -e "${DTB_PATH}" ]; then
			DTB_PATH="${B}/arch/${ARCH}/boot/"
		fi

		if [ -e ${S}/arch/${ARCH}/boot/dts/${MACHINE}.its ]; then
			cp ${S}/arch/${ARCH}/boot/dts/${MACHINE}*.its ${DTB_PATH}
			cd ${DTB_PATH}
			mkimage -f ${MACHINE}.its ${MACHINE}.itb
			install -m 0644 ${MACHINE}.itb ${DEPLOYDIR}/${MACHINE}.itb
			cd -
		fi
	fi
}

kernel_do_configure_append() {
	rm -f ${B}/.scmversion ${S}/.scmversion
	cd ${S}; git status; cd -
}

KERNEL_MODULE_AUTOLOAD += "atmel_usba_udc g_serial"

COMPATIBLE_MACHINE = "(at91sam9260ek|ipro4)"
