package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {

    /* renamed from: a  reason: collision with root package name */
    public final String f30579a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30580b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30581c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30582d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30583e;

    /* renamed from: f  reason: collision with root package name */
    public final DevelopmentPlatformProvider f30584f;

    public AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i2, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str != null) {
            this.f30579a = str;
            if (str2 != null) {
                this.f30580b = str2;
                if (str3 != null) {
                    this.f30581c = str3;
                    if (str4 != null) {
                        this.f30582d = str4;
                        this.f30583e = i2;
                        if (developmentPlatformProvider != null) {
                            this.f30584f = developmentPlatformProvider;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public String a() {
        return this.f30579a;
    }

    public int c() {
        return this.f30583e;
    }

    public DevelopmentPlatformProvider d() {
        return this.f30584f;
    }

    public String e() {
        return this.f30582d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        return this.f30579a.equals(appData.a()) && this.f30580b.equals(appData.f()) && this.f30581c.equals(appData.g()) && this.f30582d.equals(appData.e()) && this.f30583e == appData.c() && this.f30584f.equals(appData.d());
    }

    public String f() {
        return this.f30580b;
    }

    public String g() {
        return this.f30581c;
    }

    public int hashCode() {
        return ((((((((((this.f30579a.hashCode() ^ 1000003) * 1000003) ^ this.f30580b.hashCode()) * 1000003) ^ this.f30581c.hashCode()) * 1000003) ^ this.f30582d.hashCode()) * 1000003) ^ this.f30583e) * 1000003) ^ this.f30584f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f30579a + ", versionCode=" + this.f30580b + ", versionName=" + this.f30581c + ", installUuid=" + this.f30582d + ", deliveryMechanism=" + this.f30583e + ", developmentPlatformProvider=" + this.f30584f + "}";
    }
}
