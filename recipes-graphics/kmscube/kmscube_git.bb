DESCRIPTION = "Demo application to showcase 3D graphics using kms and gbm"
HOMEPAGE = "https://cgit.freedesktop.org/mesa/kmscube/"
LICENSE = "MIT"
SECTION = "graphics"
DEPENDS = "virtual/libgles2 virtual/egl libdrm ffmpeg"

LIC_FILES_CHKSUM = "file://kmscube.c;beginline=1;endline=23;md5=8b309d4ee67b7315ff7381270dd631fb"

SRCREV = "651d1f5356408f18b5e64aee6f32d0211548734c"
SRC_URI = "git://github.com/robclark/kmscube.git;branch=v4l2-video;protocol=https"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
