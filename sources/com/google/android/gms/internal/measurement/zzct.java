package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public final class zzct {

    /* renamed from: a  reason: collision with root package name */
    public static final int f25407a = (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);

    public static PendingIntent a(Context context, int i2, Intent intent, int i3) {
        return PendingIntent.getBroadcast(context, 0, intent, i3);
    }
}
