package com.hansecom.abt.data.localDomain;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AutoloadConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f33278a;

    /* renamed from: b  reason: collision with root package name */
    public final BigDecimal f33279b;

    /* renamed from: c  reason: collision with root package name */
    public final BigDecimal f33280c;

    /* renamed from: d  reason: collision with root package name */
    public final BigDecimal f33281d;

    /* renamed from: e  reason: collision with root package name */
    public final BigDecimal f33282e;

    /* renamed from: f  reason: collision with root package name */
    public final List f33283f;

    public AutoloadConfiguration(boolean z2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List list) {
        Intrinsics.i(bigDecimal, "minAutoloadTopUp");
        Intrinsics.i(bigDecimal2, "maxAutoloadTopUp");
        Intrinsics.i(bigDecimal3, "minAutoloadThreshold");
        Intrinsics.i(bigDecimal4, "maxBalance");
        Intrinsics.i(list, "fixedAutoloadAmountOptions");
        this.f33278a = z2;
        this.f33279b = bigDecimal;
        this.f33280c = bigDecimal2;
        this.f33281d = bigDecimal3;
        this.f33282e = bigDecimal4;
        this.f33283f = list;
    }

    public final boolean a() {
        return this.f33278a;
    }

    public final List b() {
        return this.f33283f;
    }

    public final BigDecimal c() {
        return this.f33280c;
    }

    public final BigDecimal d() {
        return this.f33282e;
    }

    public final BigDecimal e() {
        return this.f33281d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoloadConfiguration)) {
            return false;
        }
        AutoloadConfiguration autoloadConfiguration = (AutoloadConfiguration) obj;
        return this.f33278a == autoloadConfiguration.f33278a && Intrinsics.d(this.f33279b, autoloadConfiguration.f33279b) && Intrinsics.d(this.f33280c, autoloadConfiguration.f33280c) && Intrinsics.d(this.f33281d, autoloadConfiguration.f33281d) && Intrinsics.d(this.f33282e, autoloadConfiguration.f33282e) && Intrinsics.d(this.f33283f, autoloadConfiguration.f33283f);
    }

    public final BigDecimal f() {
        return this.f33279b;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f33278a) * 31) + this.f33279b.hashCode()) * 31) + this.f33280c.hashCode()) * 31) + this.f33281d.hashCode()) * 31) + this.f33282e.hashCode()) * 31) + this.f33283f.hashCode();
    }

    public String toString() {
        boolean z2 = this.f33278a;
        BigDecimal bigDecimal = this.f33279b;
        BigDecimal bigDecimal2 = this.f33280c;
        BigDecimal bigDecimal3 = this.f33281d;
        BigDecimal bigDecimal4 = this.f33282e;
        List list = this.f33283f;
        return "AutoloadConfiguration(canInputBalanceThreshold=" + z2 + ", minAutoloadTopUp=" + bigDecimal + ", maxAutoloadTopUp=" + bigDecimal2 + ", minAutoloadThreshold=" + bigDecimal3 + ", maxBalance=" + bigDecimal4 + ", fixedAutoloadAmountOptions=" + list + ")";
    }
}
