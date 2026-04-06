package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Supplier;

final class zzhz extends zziy {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25498a;

    /* renamed from: b  reason: collision with root package name */
    public final Supplier f25499b;

    public zzhz(Context context, Supplier supplier) {
        if (context != null) {
            this.f25498a = context;
            this.f25499b = supplier;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final Context a() {
        return this.f25498a;
    }

    public final Supplier b() {
        return this.f25499b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f25499b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.zziy
            r2 = 0
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.measurement.zziy r5 = (com.google.android.gms.internal.measurement.zziy) r5
            android.content.Context r1 = r4.f25498a
            android.content.Context r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            com.google.common.base.Supplier r1 = r4.f25499b
            if (r1 != 0) goto L_0x0022
            com.google.common.base.Supplier r5 = r5.b()
            if (r5 != 0) goto L_0x002d
            goto L_0x002c
        L_0x0022:
            com.google.common.base.Supplier r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.f25498a.hashCode() ^ 1000003) * 1000003;
        Supplier supplier = this.f25499b;
        return hashCode ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25498a);
        String valueOf2 = String.valueOf(this.f25499b);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }
}
