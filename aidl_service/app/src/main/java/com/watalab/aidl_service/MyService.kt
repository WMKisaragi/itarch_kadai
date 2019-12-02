package com.watalab.aidl_service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.watalab.IMyService


class MyService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return binder
    }

    private val binder: IMyService.Stub = object : IMyService.Stub() {
        override fun getResult(pen: String, pine: String, apple: String): String {
            return pen+pine+apple+pen
        }
    }
}