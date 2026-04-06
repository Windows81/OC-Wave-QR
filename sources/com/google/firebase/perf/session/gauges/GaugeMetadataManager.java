package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Utils;

class GaugeMetadataManager {

    /* renamed from: e  reason: collision with root package name */
    public static final AndroidLogger f31045e = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final Runtime f31046a;

    /* renamed from: b  reason: collision with root package name */
    public final ActivityManager f31047b;

    /* renamed from: c  reason: collision with root package name */
    public final ActivityManager.MemoryInfo f31048c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f31049d;

    public GaugeMetadataManager(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return Utils.c(StorageUnit.BYTES.f(this.f31048c.totalMem));
    }

    public int b() {
        return Utils.c(StorageUnit.BYTES.f(this.f31046a.maxMemory()));
    }

    public int c() {
        return Utils.c(StorageUnit.MEGABYTES.f((long) this.f31047b.getMemoryClass()));
    }

    public GaugeMetadataManager(Runtime runtime, Context context) {
        this.f31046a = runtime;
        this.f31049d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f31047b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f31048c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
