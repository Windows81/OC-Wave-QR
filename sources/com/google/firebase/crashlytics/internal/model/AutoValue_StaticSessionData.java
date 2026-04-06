package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

final class AutoValue_StaticSessionData extends StaticSessionData {

    /* renamed from: a  reason: collision with root package name */
    public final StaticSessionData.AppData f30576a;

    /* renamed from: b  reason: collision with root package name */
    public final StaticSessionData.OsData f30577b;

    /* renamed from: c  reason: collision with root package name */
    public final StaticSessionData.DeviceData f30578c;

    public AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        if (appData != null) {
            this.f30576a = appData;
            if (osData != null) {
                this.f30577b = osData;
                if (deviceData != null) {
                    this.f30578c = deviceData;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    public StaticSessionData.AppData a() {
        return this.f30576a;
    }

    public StaticSessionData.DeviceData c() {
        return this.f30578c;
    }

    public StaticSessionData.OsData d() {
        return this.f30577b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        return this.f30576a.equals(staticSessionData.a()) && this.f30577b.equals(staticSessionData.d()) && this.f30578c.equals(staticSessionData.c());
    }

    public int hashCode() {
        return ((((this.f30576a.hashCode() ^ 1000003) * 1000003) ^ this.f30577b.hashCode()) * 1000003) ^ this.f30578c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f30576a + ", osData=" + this.f30577b + ", deviceData=" + this.f30578c + "}";
    }
}
