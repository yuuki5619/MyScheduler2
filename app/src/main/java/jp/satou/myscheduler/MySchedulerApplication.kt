package jp.satou.myscheduler

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class MySchedulerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

        val confing=RealmConfiguration.Builder()
            .allowWritesOnUiThread(true).build()
        Realm.setDefaultConfiguration(confing)
    }
}