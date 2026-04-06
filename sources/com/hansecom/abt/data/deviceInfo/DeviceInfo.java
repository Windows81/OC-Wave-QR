package com.hansecom.abt.data.deviceInfo;

import android.content.Context;
import android.provider.Settings;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata
public final class DeviceInfo {

    /* renamed from: a  reason: collision with root package name */
    public final Context f33273a;

    public DeviceInfo(Context context) {
        Intrinsics.i(context, "context");
        this.f33273a = context;
    }

    public final String a() {
        String packageName = this.f33273a.getPackageName();
        Intrinsics.h(packageName, "getPackageName(...)");
        return packageName;
    }

    public final String b() {
        String string = Settings.Secure.getString(this.f33273a.getContentResolver(), "android_id");
        Intrinsics.h(string, "getString(...)");
        return string;
    }
}
