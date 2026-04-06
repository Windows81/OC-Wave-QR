package com.google.firebase.sessions;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidApplicationInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f31431a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31432b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31433c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31434d;

    /* renamed from: e  reason: collision with root package name */
    public final ProcessDetails f31435e;

    /* renamed from: f  reason: collision with root package name */
    public final List f31436f;

    public AndroidApplicationInfo(String str, String str2, String str3, String str4, ProcessDetails processDetails, List list) {
        Intrinsics.i(str, "packageName");
        Intrinsics.i(str2, "versionName");
        Intrinsics.i(str3, "appBuildVersion");
        Intrinsics.i(str4, "deviceManufacturer");
        Intrinsics.i(processDetails, "currentProcessDetails");
        Intrinsics.i(list, "appProcessDetails");
        this.f31431a = str;
        this.f31432b = str2;
        this.f31433c = str3;
        this.f31434d = str4;
        this.f31435e = processDetails;
        this.f31436f = list;
    }

    public final String a() {
        return this.f31433c;
    }

    public final List b() {
        return this.f31436f;
    }

    public final ProcessDetails c() {
        return this.f31435e;
    }

    public final String d() {
        return this.f31434d;
    }

    public final String e() {
        return this.f31431a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        return Intrinsics.d(this.f31431a, androidApplicationInfo.f31431a) && Intrinsics.d(this.f31432b, androidApplicationInfo.f31432b) && Intrinsics.d(this.f31433c, androidApplicationInfo.f31433c) && Intrinsics.d(this.f31434d, androidApplicationInfo.f31434d) && Intrinsics.d(this.f31435e, androidApplicationInfo.f31435e) && Intrinsics.d(this.f31436f, androidApplicationInfo.f31436f);
    }

    public final String f() {
        return this.f31432b;
    }

    public int hashCode() {
        return (((((((((this.f31431a.hashCode() * 31) + this.f31432b.hashCode()) * 31) + this.f31433c.hashCode()) * 31) + this.f31434d.hashCode()) * 31) + this.f31435e.hashCode()) * 31) + this.f31436f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f31431a + ", versionName=" + this.f31432b + ", appBuildVersion=" + this.f31433c + ", deviceManufacturer=" + this.f31434d + ", currentProcessDetails=" + this.f31435e + ", appProcessDetails=" + this.f31436f + ')';
    }
}
