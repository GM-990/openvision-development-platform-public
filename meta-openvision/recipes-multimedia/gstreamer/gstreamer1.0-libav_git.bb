require gstreamer1.0-libav.inc
include gstreamer1.0-common.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

SRC_URI = " git://gitlab.freedesktop.org/gstreamer/gst-libav.git;protocol=https;branch=master \
			file://ignore-ffmpeg-version-check.patch \
"
