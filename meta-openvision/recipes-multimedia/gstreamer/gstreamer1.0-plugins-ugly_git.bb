require gstreamer1.0-plugins-ugly.inc
include gstreamer1.0-common.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
					file://tests/check/elements/xingmux.c;beginline=1;endline=21;md5=4c771b8af188724855cb99cadd390068 \
"

SRC_URI = "git://gitlab.freedesktop.org/gstreamer/gst-plugins-ugly.git;protocol=https"
