package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ApplicationInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f31437a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31438b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31439c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31440d;

    /* renamed from: e  reason: collision with root package name */
    public final LogEnvironment f31441e;

    /* renamed from: f  reason: collision with root package name */
    public final AndroidApplicationInfo f31442f;

    public ApplicationInfo(String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo) {
        Intrinsics.i(str, "appId");
        Intrinsics.i(str2, "deviceModel");
        Intrinsics.i(str3, "sessionSdkVersion");
        Intrinsics.i(str4, "osVersion");
        Intrinsics.i(logEnvironment, "logEnvironment");
        Intrinsics.i(androidApplicationInfo, "androidAppInfo");
        this.f31437a = str;
        this.f31438b = str2;
        this.f31439c = str3;
        this.f31440d = str4;
        this.f31441e = logEnvironment;
        this.f31442f = androidApplicationInfo;
    }

    public final AndroidApplicationInfo a() {
        return this.f31442f;
    }

    public final String b() {
        return this.f31437a;
    }

    public final String c() {
        return this.f31438b;
    }

    public final LogEnvironment d() {
        return this.f31441e;
    }

    public final String e() {
        return this.f31440d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return Intrinsics.d(this.f31437a, applicationInfo.f31437a) && Intrinsics.d(this.f31438b, applicationInfo.f31438b) && Intrinsics.d(this.f31439c, applicationInfo.f31439c) && Intrinsics.d(this.f31440d, applicationInfo.f31440d) && this.f31441e == applicationInfo.f31441e && Intrinsics.d(this.f31442f, applicationInfo.f31442f);
    }

    public final String f() {
        return this.f31439c;
    }

    public int hashCode() {
        return (((((((((this.f31437a.hashCode() * 31) + this.f31438b.hashCode()) * 31) + this.f31439c.hashCode()) * 31) + this.f31440d.hashCode()) * 31) + this.f31441e.hashCode()) * 31) + this.f31442f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f31437a + ", deviceModel=" + this.f31438b + ", sessionSdkVersion=" + this.f31439c + ", osVersion=" + this.f31440d + ", logEnvironment=" + this.f31441e + ", androidAppInfo=" + this.f31442f + ')';
    }
}
