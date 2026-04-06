package com.google.common.math;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
public final class Stats implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final double f29067A;

    /* renamed from: B  reason: collision with root package name */
    public final double f29068B;
    public final double C;
    public final double D;

    /* renamed from: z  reason: collision with root package name */
    public final long f29069z;

    public long a() {
        return this.f29069z;
    }

    public double b() {
        return Math.sqrt(c());
    }

    public double c() {
        Preconditions.w(this.f29069z > 0);
        if (Double.isNaN(this.f29068B)) {
            return Double.NaN;
        }
        if (this.f29069z == 1) {
            return 0.0d;
        }
        return DoubleUtils.a(this.f29068B) / ((double) a());
    }

    public boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.f29069z == stats.f29069z && Double.doubleToLongBits(this.f29067A) == Double.doubleToLongBits(stats.f29067A) && Double.doubleToLongBits(this.f29068B) == Double.doubleToLongBits(stats.f29068B) && Double.doubleToLongBits(this.C) == Double.doubleToLongBits(stats.C) && Double.doubleToLongBits(this.D) == Double.doubleToLongBits(stats.D);
    }

    public int hashCode() {
        return Objects.b(Long.valueOf(this.f29069z), Double.valueOf(this.f29067A), Double.valueOf(this.f29068B), Double.valueOf(this.C), Double.valueOf(this.D));
    }

    public String toString() {
        return a() > 0 ? MoreObjects.c(this).c("count", this.f29069z).a("mean", this.f29067A).a("populationStandardDeviation", b()).a("min", this.C).a("max", this.D).toString() : MoreObjects.c(this).c("count", this.f29069z).toString();
    }
}
