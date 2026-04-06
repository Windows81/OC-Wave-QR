package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {

    /* renamed from: a  reason: collision with root package name */
    public final String f29945a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29946b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29947c;

    public AutoValue_InstallIdProvider_InstallIds(String str, String str2, String str3) {
        if (str != null) {
            this.f29945a = str;
            this.f29946b = str2;
            this.f29947c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public String c() {
        return this.f29945a;
    }

    public String d() {
        return this.f29947c;
    }

    public String e() {
        return this.f29946b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallIdProvider.InstallIds)) {
            return false;
        }
        InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
        if (this.f29945a.equals(installIds.c()) && ((str = this.f29946b) != null ? str.equals(installIds.e()) : installIds.e() == null)) {
            String str2 = this.f29947c;
            if (str2 == null) {
                if (installIds.d() == null) {
                    return true;
                }
            } else if (str2.equals(installIds.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f29945a.hashCode() ^ 1000003) * 1000003;
        String str = this.f29946b;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f29947c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f29945a + ", firebaseInstallationId=" + this.f29946b + ", firebaseAuthenticationToken=" + this.f29947c + "}";
    }
}
