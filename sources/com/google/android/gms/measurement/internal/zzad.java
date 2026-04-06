package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfn;

final class zzad extends zzaa {

    /* renamed from: g  reason: collision with root package name */
    public zzfn.zze f26172g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ zzv f26173h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzad(zzv zzv, String str, int i2, zzfn.zze zze) {
        super(str, i2);
        this.f26173h = zzv;
        this.f26172g = zze;
    }

    public final int a() {
        return this.f26172g.n();
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.zzgn.zzo r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = com.google.android.gms.internal.measurement.zzqb.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.zzv r0 = r10.f26173h
            com.google.android.gms.measurement.internal.zzah r0 = r0.d()
            java.lang.String r3 = r10.f26164a
            com.google.android.gms.measurement.internal.zzfz r4 = com.google.android.gms.measurement.internal.zzbj.n0
            boolean r0 = r0.J(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = r2
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            com.google.android.gms.internal.measurement.zzfn$zze r3 = r10.f26172g
            boolean r3 = r3.O()
            com.google.android.gms.internal.measurement.zzfn$zze r4 = r10.f26172g
            boolean r4 = r4.P()
            com.google.android.gms.internal.measurement.zzfn$zze r5 = r10.f26172g
            boolean r5 = r5.R()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = r1
            goto L_0x0037
        L_0x0036:
            r3 = r2
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.zzv r11 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgi r11 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r11 = r11.K()
            int r12 = r10.f26165b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.zzfn$zze r13 = r10.f26172g
            boolean r13 = r13.S()
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.measurement.zzfn$zze r13 = r10.f26172g
            int r13 = r13.n()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.c(r13, r12, r4)
            return r2
        L_0x0064:
            com.google.android.gms.internal.measurement.zzfn$zze r6 = r10.f26172g
            com.google.android.gms.internal.measurement.zzfn$zzc r6 = r6.K()
            boolean r7 = r6.P()
            boolean r8 = r13.c0()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.S()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.zzv r6 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            com.google.android.gms.measurement.internal.zzgk r6 = r6.L()
            com.google.android.gms.measurement.internal.zzv r7 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgh r7 = r7.h()
            java.lang.String r8 = r13.Y()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0099:
            long r8 = r13.T()
            com.google.android.gms.internal.measurement.zzfn$zzd r4 = r6.M()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.c(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.d(r4, r7)
            goto L_0x0189
        L_0x00ab:
            boolean r8 = r13.a0()
            if (r8 == 0) goto L_0x00e8
            boolean r8 = r6.S()
            if (r8 != 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.zzv r6 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            com.google.android.gms.measurement.internal.zzgk r6 = r6.L()
            com.google.android.gms.measurement.internal.zzv r7 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgh r7 = r7.h()
            java.lang.String r8 = r13.Y()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x00d6:
            double r8 = r13.J()
            com.google.android.gms.internal.measurement.zzfn$zzd r4 = r6.M()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.b(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.d(r4, r7)
            goto L_0x0189
        L_0x00e8:
            boolean r8 = r13.e0()
            if (r8 == 0) goto L_0x016c
            boolean r8 = r6.U()
            if (r8 != 0) goto L_0x0155
            boolean r8 = r6.S()
            if (r8 != 0) goto L_0x0118
            com.google.android.gms.measurement.internal.zzv r6 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            com.google.android.gms.measurement.internal.zzgk r6 = r6.L()
            com.google.android.gms.measurement.internal.zzv r7 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgh r7 = r7.h()
            java.lang.String r8 = r13.Y()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0118:
            java.lang.String r8 = r13.Z()
            boolean r8 = com.google.android.gms.measurement.internal.zzol.h0(r8)
            if (r8 == 0) goto L_0x0133
            java.lang.String r4 = r13.Z()
            com.google.android.gms.internal.measurement.zzfn$zzd r6 = r6.M()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.e(r4, r6)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.d(r4, r7)
            goto L_0x0189
        L_0x0133:
            com.google.android.gms.measurement.internal.zzv r6 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            com.google.android.gms.measurement.internal.zzgk r6 = r6.L()
            com.google.android.gms.measurement.internal.zzv r7 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgh r7 = r7.h()
            java.lang.String r8 = r13.Y()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = r13.Z()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0189
        L_0x0155:
            java.lang.String r4 = r13.Z()
            com.google.android.gms.internal.measurement.zzfn$zzf r6 = r6.N()
            com.google.android.gms.measurement.internal.zzv r8 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgi r8 = r8.m()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.g(r4, r6, r8)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.d(r4, r7)
            goto L_0x0189
        L_0x016c:
            com.google.android.gms.measurement.internal.zzv r6 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            com.google.android.gms.measurement.internal.zzgk r6 = r6.L()
            com.google.android.gms.measurement.internal.zzv r7 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgh r7 = r7.h()
            java.lang.String r8 = r13.Y()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.b(r8, r7)
        L_0x0189:
            com.google.android.gms.measurement.internal.zzv r6 = r10.f26173h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            com.google.android.gms.measurement.internal.zzgk r6 = r6.K()
            if (r4 != 0) goto L_0x0198
            java.lang.String r7 = "null"
            goto L_0x0199
        L_0x0198:
            r7 = r4
        L_0x0199:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r4 != 0) goto L_0x01a1
            return r1
        L_0x01a1:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.f26166c = r1
            if (r5 == 0) goto L_0x01ae
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x01ae
            return r2
        L_0x01ae:
            if (r14 == 0) goto L_0x01b8
            com.google.android.gms.internal.measurement.zzfn$zze r14 = r10.f26172g
            boolean r14 = r14.O()
            if (r14 == 0) goto L_0x01ba
        L_0x01b8:
            r10.f26167d = r4
        L_0x01ba:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01ff
            if (r3 == 0) goto L_0x01ff
            boolean r14 = r13.d0()
            if (r14 == 0) goto L_0x01ff
            long r13 = r13.V()
            if (r11 == 0) goto L_0x01d2
            long r13 = r11.longValue()
        L_0x01d2:
            if (r0 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.zzfn$zze r11 = r10.f26172g
            boolean r11 = r11.O()
            if (r11 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.zzfn$zze r11 = r10.f26172g
            boolean r11 = r11.P()
            if (r11 != 0) goto L_0x01ea
            if (r12 == 0) goto L_0x01ea
            long r13 = r12.longValue()
        L_0x01ea:
            com.google.android.gms.internal.measurement.zzfn$zze r11 = r10.f26172g
            boolean r11 = r11.P()
            if (r11 == 0) goto L_0x01f9
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f26169f = r11
            goto L_0x01ff
        L_0x01f9:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f26168e = r11
        L_0x01ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzad.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzgn$zzo, boolean):boolean");
    }
}
