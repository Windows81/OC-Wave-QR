package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

final class zzz {

    /* renamed from: a  reason: collision with root package name */
    public String f25190a = null;

    /* renamed from: b  reason: collision with root package name */
    public long f25191b = -1;

    /* renamed from: c  reason: collision with root package name */
    public zzag f25192c = zzag.u();

    /* renamed from: d  reason: collision with root package name */
    public zzag f25193d = zzag.u();

    public final zzz a(long j2) {
        this.f25191b = j2;
        return this;
    }

    public final zzz b(List list) {
        Preconditions.m(list);
        this.f25193d = zzag.s(list);
        return this;
    }

    public final zzz c(List list) {
        Preconditions.m(list);
        this.f25192c = zzag.s(list);
        return this;
    }

    public final zzz d(String str) {
        this.f25190a = str;
        return this;
    }

    public final zzab e() {
        if (this.f25190a == null) {
            throw new IllegalStateException("packageName must be defined");
        } else if (this.f25191b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        } else if (!this.f25192c.isEmpty() || !this.f25193d.isEmpty()) {
            return new zzab(this.f25190a, this.f25191b, this.f25192c, this.f25193d, (zzaa) null);
        } else {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
    }
}
