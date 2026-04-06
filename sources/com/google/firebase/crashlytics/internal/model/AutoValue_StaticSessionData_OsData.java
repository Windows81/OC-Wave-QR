package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {

    /* renamed from: a  reason: collision with root package name */
    public final String f30594a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30595b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30596c;

    public AutoValue_StaticSessionData_OsData(String str, String str2, boolean z2) {
        if (str != null) {
            this.f30594a = str;
            if (str2 != null) {
                this.f30595b = str2;
                this.f30596c = z2;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public boolean b() {
        return this.f30596c;
    }

    public String c() {
        return this.f30595b;
    }

    public String d() {
        return this.f30594a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        return this.f30594a.equals(osData.d()) && this.f30595b.equals(osData.c()) && this.f30596c == osData.b();
    }

    public int hashCode() {
        return ((((this.f30594a.hashCode() ^ 1000003) * 1000003) ^ this.f30595b.hashCode()) * 1000003) ^ (this.f30596c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f30594a + ", osCodeName=" + this.f30595b + ", isRooted=" + this.f30596c + "}";
    }
}
