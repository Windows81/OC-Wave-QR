package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SessionConfigs {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f31600a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f31601b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f31602c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f31603d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f31604e;

    public SessionConfigs(Boolean bool, Double d2, Integer num, Integer num2, Long l2) {
        this.f31600a = bool;
        this.f31601b = d2;
        this.f31602c = num;
        this.f31603d = num2;
        this.f31604e = l2;
    }

    public final Integer a() {
        return this.f31603d;
    }

    public final Long b() {
        return this.f31604e;
    }

    public final Boolean c() {
        return this.f31600a;
    }

    public final Integer d() {
        return this.f31602c;
    }

    public final Double e() {
        return this.f31601b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return Intrinsics.d(this.f31600a, sessionConfigs.f31600a) && Intrinsics.d(this.f31601b, sessionConfigs.f31601b) && Intrinsics.d(this.f31602c, sessionConfigs.f31602c) && Intrinsics.d(this.f31603d, sessionConfigs.f31603d) && Intrinsics.d(this.f31604e, sessionConfigs.f31604e);
    }

    public int hashCode() {
        Boolean bool = this.f31600a;
        int i2 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d2 = this.f31601b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.f31602c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f31603d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.f31604e;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f31600a + ", sessionSamplingRate=" + this.f31601b + ", sessionRestartTimeout=" + this.f31602c + ", cacheDuration=" + this.f31603d + ", cacheUpdatedTime=" + this.f31604e + ')';
    }
}
