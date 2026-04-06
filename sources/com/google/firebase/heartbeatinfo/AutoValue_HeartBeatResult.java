package com.google.firebase.heartbeatinfo;

import java.util.List;

final class AutoValue_HeartBeatResult extends HeartBeatResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f30750a;

    /* renamed from: b  reason: collision with root package name */
    public final List f30751b;

    public AutoValue_HeartBeatResult(String str, List list) {
        if (str != null) {
            this.f30750a = str;
            if (list != null) {
                this.f30751b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    public List b() {
        return this.f30751b;
    }

    public String c() {
        return this.f30750a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.f30750a.equals(heartBeatResult.c()) && this.f30751b.equals(heartBeatResult.b());
    }

    public int hashCode() {
        return ((this.f30750a.hashCode() ^ 1000003) * 1000003) ^ this.f30751b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f30750a + ", usedDates=" + this.f30751b + "}";
    }
}
