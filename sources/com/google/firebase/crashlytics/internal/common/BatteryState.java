package com.google.firebase.crashlytics.internal.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.internal.Logger;

class BatteryState {

    /* renamed from: a  reason: collision with root package name */
    public final Float f29948a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29949b;

    public BatteryState(Float f2, boolean z2) {
        this.f29949b = z2;
        this.f29948a = f2;
    }

    public static BatteryState a(Context context) {
        boolean z2 = false;
        Float f2 = null;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z2 = e(registerReceiver);
                f2 = d(registerReceiver);
            }
        } catch (IllegalStateException e2) {
            Logger.f().e("An error occurred getting battery state.", e2);
        }
        return new BatteryState(f2, z2);
    }

    public static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    public static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f29948a;
    }

    public int c() {
        Float f2;
        if (!this.f29949b || (f2 = this.f29948a) == null) {
            return 1;
        }
        return ((double) f2.floatValue()) < 0.99d ? 2 : 3;
    }
}
