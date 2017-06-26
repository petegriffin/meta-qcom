DESCRIPTION = "Demo application for v4l2 decoder"
HOMEPAGE = "https://git.linaro.org/people/stanimir.varbanov/v4l2-decode.git/"
LICENSE = "MIT"
SECTION = "graphics"
DEPENDS = "libdrm ffmpeg"

LIC_FILES_CHKSUM = "file://src/main.c;beginline=1;endline=22;md5=9a4ecba211555986cfa69dd5f9f91741"

SRCREV = "580f157b44bd49f26a7d4e64f15224277445c983"
SRC_URI = "git://git.linaro.org/people/stanimir.varbanov/v4l2-decode.git;branch=ffmpeg-autotools;protocol=https"

S = "${WORKDIR}/git"

inherit autotools pkgconfig distro_features_check
