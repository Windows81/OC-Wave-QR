package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {

    /* renamed from: a  reason: collision with root package name */
    public final int f30585a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30586b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30587c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30588d;

    /* renamed from: e  reason: collision with root package name */
    public final long f30589e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f30590f;

    /* renamed from: g  reason: collision with root package name */
    public final int f30591g;

    /* renamed from: h  reason: collision with root package name */
    public final String f30592h;

    /* renamed from: i  reason: collision with root package name */
    public final String f30593i;

    public AutoValue_StaticSessionData_DeviceData(int i2, String str, int i3, long j2, long j3, boolean z2, int i4, String str2, String str3) {
        this.f30585a = i2;
        if (str != null) {
            this.f30586b = str;
            this.f30587c = i3;
            this.f30588d = j2;
            this.f30589e = j3;
            this.f30590f = z2;
            this.f30591g = i4;
            if (str2 != null) {
                this.f30592h = str2;
                if (str3 != null) {
                    this.f30593i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public int a() {
        return this.f30585a;
    }

    public int b() {
        return this.f30587c;
    }

    public long d() {
        return this.f30589e;
    }

    public boolean e() {
        return this.f30590f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        return this.f30585a == deviceData.a() && this.f30586b.equals(deviceData.g()) && this.f30587c == deviceData.b() && this.f30588d == deviceData.j() && this.f30589e == deviceData.d() && this.f30590f == deviceData.e() && this.f30591g == deviceData.i() && this.f30592h.equals(deviceData.f()) && this.f30593i.equals(deviceData.h());
    }

    public String f() {
        return this.f30592h;
    }

    public String g() {
        return this.f30586b;
    }

    public String h() {
        return this.f30593i;
    }

    public int hashCode() {
        long j2 = this.f30588d;
        long j3 = this.f30589e;
        return ((((((((((((((((this.f30585a ^ 1000003) * 1000003) ^ this.f30586b.hashCode()) * 1000003) ^ this.f30587c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f30590f ? 1231 : 1237)) * 1000003) ^ this.f30591g) * 1000003) ^ this.f30592h.hashCode()) * 1000003) ^ this.f30593i.hashCode();
    }

    public int i() {
        return this.f30591g;
    }

    public long j() {
        return this.f30588d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f30585a + ", model=" + this.f30586b + ", availableProcessors=" + this.f30587c + ", totalRam=" + this.f30588d + ", diskSpace=" + this.f30589e + ", isEmulator=" + this.f30590f + ", state=" + this.f30591g + ", manufacturer=" + this.f30592h + ", modelClass=" + this.f30593i + "}";
    }
}
