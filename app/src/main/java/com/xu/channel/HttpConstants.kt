package com.xu.channel


/**
 * @author 言吾許
 */
object HttpConstants {
    private const val CHANNEL_XIAOMI = "xiaomi"
    private const val CHANNEL_HUAWEI = "huawei"
    private const val SERVER_URL_XIAOMI_DEV = "http://xiaomi.dev"
    private const val SERVER_URL_XIAOMI_RELEASE = "http://xiaomi.release"
    private const val SERVER_URL_HUAWEI_DEV = "http://huawei.dev"
    private const val SERVER_URL_HUAWEI_RELEASE = "http://huawei.release"

    fun getBaseUrl(): String {
        return when (BuildConfig.FLAVOR) {
            CHANNEL_XIAOMI -> {
                SERVER_URL_XIAOMI_DEV
            }
            CHANNEL_HUAWEI -> {
                SERVER_URL_HUAWEI_RELEASE
            }
            else -> {
                ""
            }
        }
    }

}