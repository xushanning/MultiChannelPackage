package com.xu.channel

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xu.module.huawei.HuaWei
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_server_url.text = HttpConstants.getBaseUrl()
        tv_key.text = getKey()
        //XiaoMi().sayHello()
        HuaWei().sayHello()
    }

    private fun getKey(): String? {
        return try {
            val appInfo =
                packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
            appInfo.metaData.getString("MY_KEY")
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            ""
        }
    }
}
