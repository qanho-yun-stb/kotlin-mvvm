package `in`.squrlabs.kmm

import `in`.squrlabs.kmm.di.dataModule
import `in`.squrlabs.kmm.di.networkModule
import `in`.squrlabs.kmm.di.viewModelModule
import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(
                networkModule,
                dataModule,
                viewModelModule
            ))
            Fresco.initialize(this@App)
        }
    }
}