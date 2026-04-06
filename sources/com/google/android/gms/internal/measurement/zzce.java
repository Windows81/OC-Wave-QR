package com.google.android.gms.internal.measurement;

final class zzce extends zzcm {

    /* renamed from: c  reason: collision with root package name */
    public final String f25384c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f25385d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f25386e;

    /* renamed from: f  reason: collision with root package name */
    public final zzcc f25387f;

    /* renamed from: g  reason: collision with root package name */
    public final zzcb f25388g;

    /* renamed from: h  reason: collision with root package name */
    public final zzco f25389h;

    public /* synthetic */ zzce(String str, boolean z2, boolean z3, zzcc zzcc, zzcb zzcb, zzco zzco, zzcg zzcg) {
        this(str, false, z3, (zzcc) null, (zzcb) null, zzco);
    }

    public final zzcc a() {
        return this.f25387f;
    }

    public final zzcb b() {
        return this.f25388g;
    }

    public final zzco c() {
        return this.f25389h;
    }

    public final String d() {
        return this.f25384c;
    }

    public final boolean e() {
        return this.f25385d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r1 = r4.f25387f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r1 = r4.f25388g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.zzcm
            r2 = 0
            if (r1 == 0) goto L_0x005e
            com.google.android.gms.internal.measurement.zzcm r5 = (com.google.android.gms.internal.measurement.zzcm) r5
            java.lang.String r1 = r4.f25384c
            java.lang.String r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            boolean r1 = r4.f25385d
            boolean r3 = r5.e()
            if (r1 != r3) goto L_0x005e
            boolean r1 = r4.f25386e
            boolean r3 = r5.f()
            if (r1 != r3) goto L_0x005e
            com.google.android.gms.internal.measurement.zzcc r1 = r4.f25387f
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.internal.measurement.zzcc r1 = r5.a()
            if (r1 != 0) goto L_0x005e
            goto L_0x003c
        L_0x0032:
            com.google.android.gms.internal.measurement.zzcc r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
        L_0x003c:
            com.google.android.gms.internal.measurement.zzcb r1 = r4.f25388g
            if (r1 != 0) goto L_0x0047
            com.google.android.gms.internal.measurement.zzcb r1 = r5.b()
            if (r1 != 0) goto L_0x005e
            goto L_0x0051
        L_0x0047:
            com.google.android.gms.internal.measurement.zzcb r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
        L_0x0051:
            com.google.android.gms.internal.measurement.zzco r1 = r4.f25389h
            com.google.android.gms.internal.measurement.zzco r5 = r5.c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzce.equals(java.lang.Object):boolean");
    }

    public final boolean f() {
        return this.f25386e;
    }

    public final int hashCode() {
        int i2 = 1237;
        int hashCode = (((this.f25384c.hashCode() ^ 1000003) * 1000003) ^ (this.f25385d ? 1231 : 1237)) * 1000003;
        if (this.f25386e) {
            i2 = 1231;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        zzcc zzcc = this.f25387f;
        int i4 = 0;
        int hashCode2 = (i3 ^ (zzcc == null ? 0 : zzcc.hashCode())) * 1000003;
        zzcb zzcb = this.f25388g;
        if (zzcb != null) {
            i4 = zzcb.hashCode();
        }
        return ((hashCode2 ^ i4) * 1000003) ^ this.f25389h.hashCode();
    }

    public final String toString() {
        String str = this.f25384c;
        boolean z2 = this.f25385d;
        boolean z3 = this.f25386e;
        String valueOf = String.valueOf(this.f25387f);
        String valueOf2 = String.valueOf(this.f25388g);
        String valueOf3 = String.valueOf(this.f25389h);
        return "FileComplianceOptions{fileOwner=" + str + ", hasDifferentDmaOwner=" + z2 + ", skipChecks=" + z3 + ", dataForwardingNotAllowedResolver=" + valueOf + ", multipleProductIdGroupsResolver=" + valueOf2 + ", filePurpose=" + valueOf3 + "}";
    }

    public zzce(String str, boolean z2, boolean z3, zzcc zzcc, zzcb zzcb, zzco zzco) {
        this.f25384c = str;
        this.f25385d = z2;
        this.f25386e = z3;
        this.f25387f = null;
        this.f25388g = null;
        this.f25389h = zzco;
    }
}
