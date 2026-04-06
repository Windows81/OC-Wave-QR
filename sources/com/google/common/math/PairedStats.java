package com.google.common.math;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
public final class PairedStats implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Stats f29064A;

    /* renamed from: B  reason: collision with root package name */
    public final double f29065B;

    /* renamed from: z  reason: collision with root package name */
    public final Stats f29066z;

    public long a() {
        return this.f29066z.a();
    }

    public double b() {
        Preconditions.w(a() != 0);
        return this.f29065B / ((double) a());
    }

    public boolean equals(Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.f29066z.equals(pairedStats.f29066z) && this.f29064A.equals(pairedStats.f29064A) && Double.doubleToLongBits(this.f29065B) == Double.doubleToLongBits(pairedStats.f29065B);
    }

    public int hashCode() {
        return Objects.b(this.f29066z, this.f29064A, Double.valueOf(this.f29065B));
    }

    public String toString() {
        return a() > 0 ? MoreObjects.c(this).d("xStats", this.f29066z).d("yStats", this.f29064A).a("populationCovariance", b()).toString() : MoreObjects.c(this).d("xStats", this.f29066z).d("yStats", this.f29064A).toString();
    }
}
