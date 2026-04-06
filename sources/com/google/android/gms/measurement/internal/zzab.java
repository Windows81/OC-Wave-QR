package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfn;

final class zzab extends zzaa {

    /* renamed from: g  reason: collision with root package name */
    public zzfn.zzb f26170g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ zzv f26171h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzab(zzv zzv, String str, int i2, zzfn.zzb zzb) {
        super(str, i2);
        this.f26171h = zzv;
        this.f26170g = zzb;
    }

    public final int a() {
        return this.f26170g.M();
    }

    public final boolean i() {
        return this.f26170g.W();
    }

    public final boolean j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v15, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.zzgn.zzf r18, long r19, com.google.android.gms.measurement.internal.zzbd r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = com.google.android.gms.internal.measurement.zzqb.a()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.measurement.internal.zzv r1 = r0.f26171h
            com.google.android.gms.measurement.internal.zzah r1 = r1.d()
            java.lang.String r4 = r0.f26164a
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.p0
            boolean r1 = r1.J(r4, r5)
            if (r1 == 0) goto L_0x001b
            r1 = r3
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            com.google.android.gms.internal.measurement.zzfn$zzb r4 = r0.f26170g
            boolean r4 = r4.V()
            if (r4 == 0) goto L_0x0029
            r4 = r21
            long r4 = r4.f26245e
            goto L_0x002b
        L_0x0029:
            r4 = r19
        L_0x002b:
            com.google.android.gms.measurement.internal.zzv r6 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            r7 = 2
            boolean r6 = r6.C(r7)
            r7 = 0
            if (r6 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.zzv r6 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            com.google.android.gms.measurement.internal.zzgk r6 = r6.K()
            int r8 = r0.f26165b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.android.gms.internal.measurement.zzfn$zzb r9 = r0.f26170g
            boolean r9 = r9.X()
            if (r9 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.zzfn$zzb r9 = r0.f26170g
            int r9 = r9.M()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005d
        L_0x005c:
            r9 = r7
        L_0x005d:
            com.google.android.gms.measurement.internal.zzv r10 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r10 = r10.h()
            com.google.android.gms.internal.measurement.zzfn$zzb r11 = r0.f26170g
            java.lang.String r11 = r11.R()
            java.lang.String r10 = r10.c(r11)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r6.d(r11, r8, r9, r10)
            com.google.android.gms.measurement.internal.zzv r6 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()
            com.google.android.gms.measurement.internal.zzgk r6 = r6.K()
            com.google.android.gms.measurement.internal.zzv r8 = r0.f26171h
            com.google.android.gms.measurement.internal.zzol r8 = r8.o()
            com.google.android.gms.internal.measurement.zzfn$zzb r9 = r0.f26170g
            java.lang.String r8 = r8.K(r9)
            java.lang.String r9 = "Filter definition"
            r6.b(r9, r8)
        L_0x008d:
            com.google.android.gms.internal.measurement.zzfn$zzb r6 = r0.f26170g
            boolean r6 = r6.X()
            if (r6 == 0) goto L_0x03fd
            com.google.android.gms.internal.measurement.zzfn$zzb r6 = r0.f26170g
            int r6 = r6.M()
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L_0x00a1
            goto L_0x03fd
        L_0x00a1:
            com.google.android.gms.internal.measurement.zzfn$zzb r6 = r0.f26170g
            boolean r6 = r6.T()
            com.google.android.gms.internal.measurement.zzfn$zzb r8 = r0.f26170g
            boolean r8 = r8.U()
            com.google.android.gms.internal.measurement.zzfn$zzb r9 = r0.f26170g
            boolean r9 = r9.V()
            if (r6 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r6 = r2
            goto L_0x00bd
        L_0x00bc:
            r6 = r3
        L_0x00bd:
            if (r22 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.zzv r1 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r1 = r1.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()
            int r2 = r0.f26165b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.zzfn$zzb r4 = r0.f26170g
            boolean r4 = r4.X()
            if (r4 == 0) goto L_0x00e3
            com.google.android.gms.internal.measurement.zzfn$zzb r4 = r0.f26170g
            int r4 = r4.M()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x00e3:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r4, r2, r7)
            return r3
        L_0x00e9:
            com.google.android.gms.internal.measurement.zzfn$zzb r8 = r0.f26170g
            java.lang.String r9 = r18.Y()
            boolean r10 = r8.W()
            if (r10 == 0) goto L_0x010b
            com.google.android.gms.internal.measurement.zzfn$zzd r10 = r8.P()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.zzaa.c(r4, r10)
            if (r4 != 0) goto L_0x0101
            goto L_0x03a2
        L_0x0101:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x010b
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x010b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r8.S()
            java.util.Iterator r5 = r5.iterator()
        L_0x0118:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = r5.next()
            com.google.android.gms.internal.measurement.zzfn$zzc r10 = (com.google.android.gms.internal.measurement.zzfn.zzc) r10
            java.lang.String r11 = r10.O()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            java.lang.String r8 = "null or empty param name in filter. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0149:
            java.lang.String r10 = r10.O()
            r4.add(r10)
            goto L_0x0118
        L_0x0151:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            java.util.List r10 = r18.Z()
            java.util.Iterator r10 = r10.iterator()
        L_0x015e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01eb
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.zzgn$zzh r11 = (com.google.android.gms.internal.measurement.zzgn.zzh) r11
            java.lang.String r12 = r11.a0()
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto L_0x015e
            boolean r12 = r11.f0()
            if (r12 == 0) goto L_0x0192
            java.lang.String r12 = r11.a0()
            boolean r13 = r11.f0()
            if (r13 == 0) goto L_0x018d
            long r13 = r11.W()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x018e
        L_0x018d:
            r11 = r7
        L_0x018e:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x0192:
            boolean r12 = r11.d0()
            if (r12 == 0) goto L_0x01b0
            java.lang.String r12 = r11.a0()
            boolean r13 = r11.d0()
            if (r13 == 0) goto L_0x01ab
            double r13 = r11.J()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ac
        L_0x01ab:
            r11 = r7
        L_0x01ac:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01b0:
            boolean r12 = r11.h0()
            if (r12 == 0) goto L_0x01c2
            java.lang.String r12 = r11.a0()
            java.lang.String r11 = r11.b0()
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01c2:
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.zzv r8 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r8 = r8.h()
            java.lang.String r9 = r11.a0()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x01eb:
            java.util.List r4 = r8.S()
            java.util.Iterator r4 = r4.iterator()
        L_0x01f3:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x03a0
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.zzfn$zzc r8 = (com.google.android.gms.internal.measurement.zzfn.zzc) r8
            boolean r10 = r8.R()
            if (r10 == 0) goto L_0x020d
            boolean r10 = r8.P()
            if (r10 == 0) goto L_0x020d
            r10 = r3
            goto L_0x020e
        L_0x020d:
            r10 = r2
        L_0x020e:
            java.lang.String r11 = r8.O()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0233
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            java.lang.String r8 = "Event has empty param name. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0233:
            java.lang.Object r12 = r5.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0282
            boolean r13 = r8.S()
            if (r13 != 0) goto L_0x0266
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.zzv r8 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r8 = r8.h()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No number filter for long param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0266:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.zzfn$zzd r8 = r8.M()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.zzaa.c(r11, r8)
            if (r8 != 0) goto L_0x0278
            goto L_0x03a2
        L_0x0278:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x0282:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02cd
            boolean r13 = r8.S()
            if (r13 != 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.zzv r8 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r8 = r8.h()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No number filter for double param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x02b1:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.zzfn$zzd r8 = r8.M()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.zzaa.b(r11, r8)
            if (r8 != 0) goto L_0x02c3
            goto L_0x03a2
        L_0x02c3:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x02cd:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0354
            boolean r13 = r8.U()
            if (r13 == 0) goto L_0x02e8
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.zzfn$zzf r8 = r8.N()
            com.google.android.gms.measurement.internal.zzv r11 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r11 = r11.m()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.zzaa.g(r12, r8, r11)
            goto L_0x02fe
        L_0x02e8:
            boolean r13 = r8.S()
            if (r13 == 0) goto L_0x0330
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.zzol.h0(r12)
            if (r13 == 0) goto L_0x030c
            com.google.android.gms.internal.measurement.zzfn$zzd r8 = r8.M()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.zzaa.e(r12, r8)
        L_0x02fe:
            if (r8 != 0) goto L_0x0302
            goto L_0x03a2
        L_0x0302:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x030c:
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.zzv r8 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r8 = r8.h()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0330:
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.zzv r8 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r8 = r8.h()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No filter for String param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0354:
            if (r12 != 0) goto L_0x037c
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.K()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.zzv r7 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r7 = r7.h()
            java.lang.String r7 = r7.f(r11)
            java.lang.String r8 = "Missing param for filter. event, param"
            r4.c(r8, r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x037c:
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()
            com.google.android.gms.measurement.internal.zzv r5 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r5 = r5.h()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.zzv r8 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgh r8 = r8.h()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "Unknown param type. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x03a0:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x03a2:
            com.google.android.gms.measurement.internal.zzv r4 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.K()
            if (r7 != 0) goto L_0x03b1
            java.lang.String r5 = "null"
            goto L_0x03b2
        L_0x03b1:
            r5 = r7
        L_0x03b2:
            java.lang.String r8 = "Event filter result"
            r4.b(r8, r5)
            if (r7 != 0) goto L_0x03ba
            return r2
        L_0x03ba:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f26166c = r2
            boolean r4 = r7.booleanValue()
            if (r4 != 0) goto L_0x03c5
            return r3
        L_0x03c5:
            r0.f26167d = r2
            if (r6 == 0) goto L_0x03fc
            boolean r2 = r18.c0()
            if (r2 == 0) goto L_0x03fc
            long r4 = r18.V()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.measurement.zzfn$zzb r4 = r0.f26170g
            boolean r4 = r4.U()
            if (r4 == 0) goto L_0x03ee
            if (r1 == 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzfn$zzb r1 = r0.f26170g
            boolean r1 = r1.W()
            if (r1 == 0) goto L_0x03eb
            r2 = r16
        L_0x03eb:
            r0.f26169f = r2
            goto L_0x03fc
        L_0x03ee:
            if (r1 == 0) goto L_0x03fa
            com.google.android.gms.internal.measurement.zzfn$zzb r1 = r0.f26170g
            boolean r1 = r1.W()
            if (r1 == 0) goto L_0x03fa
            r2 = r17
        L_0x03fa:
            r0.f26168e = r2
        L_0x03fc:
            return r3
        L_0x03fd:
            com.google.android.gms.measurement.internal.zzv r1 = r0.f26171h
            com.google.android.gms.measurement.internal.zzgi r1 = r1.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.L()
            java.lang.String r3 = r0.f26164a
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgi.v(r3)
            com.google.android.gms.internal.measurement.zzfn$zzb r4 = r0.f26170g
            boolean r4 = r4.X()
            if (r4 == 0) goto L_0x041f
            com.google.android.gms.internal.measurement.zzfn$zzb r4 = r0.f26170g
            int r4 = r4.M()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x041f:
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "Invalid event filter ID. appId, id"
            r1.c(r5, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzab.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzgn$zzf, long, com.google.android.gms.measurement.internal.zzbd, boolean):boolean");
    }
}
