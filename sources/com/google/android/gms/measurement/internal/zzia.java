package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzpi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzia extends zzga {

    /* renamed from: l  reason: collision with root package name */
    public final zznv f26522l;

    /* renamed from: m  reason: collision with root package name */
    public Boolean f26523m;

    /* renamed from: n  reason: collision with root package name */
    public String f26524n;

    public zzia(zznv zznv) {
        this(zznv, (String) null);
    }

    public final void B0(zzp zzp) {
        Preconditions.g(zzp.f26977z);
        W2(zzp.f26977z, false);
        a3(new zzin(this, zzp));
    }

    public final List D2(String str, String str2, boolean z2, zzp zzp) {
        Z2(zzp, false);
        String str3 = zzp.f26977z;
        Preconditions.m(str3);
        try {
            List<zzom> list = (List) this.f26522l.f().w(new zzij(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzom zzom : list) {
                if (!z2) {
                    if (!zzop.J0(zzom.f26964c)) {
                    }
                }
                arrayList.add(new zzok(zzom));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.f26522l.m().G().c("Failed to query user properties. appId", zzgi.v(zzp.f26977z), e);
            return Collections.emptyList();
        } catch (ExecutionException e3) {
            e = e3;
            this.f26522l.m().G().c("Failed to query user properties. appId", zzgi.v(zzp.f26977z), e);
            return Collections.emptyList();
        }
    }

    public final void G2(zzok zzok, zzp zzp) {
        Preconditions.m(zzok);
        Z2(zzp, false);
        a3(new zzit(this, zzok, zzp));
    }

    public final zzak N0(zzp zzp) {
        Z2(zzp, false);
        Preconditions.g(zzp.f26977z);
        try {
            return (zzak) this.f26522l.f().B(new zzip(this, zzp)).get(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.f26522l.m().G().c("Failed to get consent. appId", zzgi.v(zzp.f26977z), e2);
            return new zzak((Bundle) null);
        }
    }

    public final /* synthetic */ void P(Bundle bundle, String str) {
        boolean t2 = this.f26522l.i0().t(zzbj.j1);
        boolean t3 = this.f26522l.i0().t(zzbj.l1);
        if (!bundle.isEmpty() || !t2 || !t3) {
            this.f26522l.l0().k0(str, bundle);
        } else {
            this.f26522l.l0().c1(str);
        }
    }

    public final void P1(zzp zzp) {
        Z2(zzp, false);
        a3(new zzid(this, zzp));
    }

    public final void R2(zzp zzp) {
        Preconditions.g(zzp.f26977z);
        Preconditions.m(zzp.U);
        u1(new zzib(this, zzp));
    }

    public final List S0(zzp zzp, boolean z2) {
        Z2(zzp, false);
        String str = zzp.f26977z;
        Preconditions.m(str);
        try {
            List<zzom> list = (List) this.f26522l.f().w(new zziv(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzom zzom : list) {
                if (!z2) {
                    if (!zzop.J0(zzom.f26964c)) {
                    }
                }
                arrayList.add(new zzok(zzom));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.f26522l.m().G().c("Failed to get user properties. appId", zzgi.v(zzp.f26977z), e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.f26522l.m().G().c("Failed to get user properties. appId", zzgi.v(zzp.f26977z), e);
            return null;
        }
    }

    public final void V(zzbh zzbh, String str, String str2) {
        Preconditions.m(zzbh);
        Preconditions.g(str);
        W2(str, true);
        a3(new zzir(this, zzbh, str));
    }

    public final void W(Bundle bundle, zzp zzp) {
        Z2(zzp, false);
        String str = zzp.f26977z;
        Preconditions.m(str);
        a3(new zzie(this, bundle, str));
    }

    public final void W2(String str, boolean z2) {
        boolean z3;
        if (!TextUtils.isEmpty(str)) {
            if (z2) {
                try {
                    if (this.f26523m == null) {
                        if (!"com.google.android.gms".equals(this.f26524n) && !UidVerifier.a(this.f26522l.a(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.a(this.f26522l.a()).c(Binder.getCallingUid())) {
                                z3 = false;
                                this.f26523m = Boolean.valueOf(z3);
                            }
                        }
                        z3 = true;
                        this.f26523m = Boolean.valueOf(z3);
                    }
                    if (this.f26523m.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.f26522l.m().G().b("Measurement Service called with invalid calling package. appId", zzgi.v(str));
                    throw e2;
                }
            }
            if (this.f26524n == null && GooglePlayServicesUtilLight.l(this.f26522l.a(), Binder.getCallingUid(), str)) {
                this.f26524n = str;
            }
            if (!str.equals(this.f26524n)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f26522l.m().G().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final byte[] X(zzbh zzbh, String str) {
        Preconditions.g(str);
        Preconditions.m(zzbh);
        W2(str, true);
        this.f26522l.m().F().b("Log and bundle. event", this.f26522l.n0().c(zzbh.f26256z));
        long b2 = this.f26522l.b().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f26522l.f().B(new zziu(this, zzbh, str)).get();
            if (bArr == null) {
                this.f26522l.m().G().b("Log and bundle returned null. appId", zzgi.v(str));
                bArr = new byte[0];
            }
            this.f26522l.m().F().d("Log and bundle processed. event, size, time_ms", this.f26522l.n0().c(zzbh.f26256z), Integer.valueOf(bArr.length), Long.valueOf((this.f26522l.b().b() / 1000000) - b2));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            this.f26522l.m().G().d("Failed to log and bundle. appId, event, error", zzgi.v(str), this.f26522l.n0().c(zzbh.f26256z), e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.f26522l.m().G().d("Failed to log and bundle. appId, event, error", zzgi.v(str), this.f26522l.n0().c(zzbh.f26256z), e);
            return null;
        }
    }

    public final zzbh X2(zzbh zzbh, zzp zzp) {
        zzbc zzbc;
        if (!(!"_cmp".equals(zzbh.f26256z) || (zzbc = zzbh.f26254A) == null || zzbc.H() == 0)) {
            String o0 = zzbh.f26254A.o0("_cis");
            if ("referrer broadcast".equals(o0) || "referrer API".equals(o0)) {
                this.f26522l.m().J().b("Event has been filtered ", zzbh.toString());
                return new zzbh("_cmpx", zzbh.f26254A, zzbh.f26255B, zzbh.C);
            }
        }
        return zzbh;
    }

    public final void Y(zzbh zzbh, zzp zzp) {
        Preconditions.m(zzbh);
        Z2(zzp, false);
        a3(new zzis(this, zzbh, zzp));
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void Y2(android.os.Bundle r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            r13 = r32
            java.lang.String r14 = "_o"
            boolean r0 = r31.isEmpty()
            if (r0 == 0) goto L_0x0018
            com.google.android.gms.measurement.internal.zznv r0 = r1.f26522l
            com.google.android.gms.measurement.internal.zzam r0 = r0.l0()
            r0.c1(r13)
            return
        L_0x0018:
            com.google.android.gms.measurement.internal.zznv r0 = r1.f26522l
            com.google.android.gms.measurement.internal.zzam r0 = r0.l0()
            r0.k0(r13, r2)
            com.google.android.gms.measurement.internal.zznv r0 = r1.f26522l
            com.google.android.gms.measurement.internal.zzam r15 = r0.l0()
            com.google.android.gms.common.internal.Preconditions.m(r31)
            r15.n()
            r15.u()
            r3 = -1
        L_0x0032:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r19 = "app_id = ? and rowid > ?"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String[] r20 = new java.lang.String[]{r13, r0}
            r5 = 0
            r6 = 0
            android.database.sqlite.SQLiteDatabase r16 = r15.B()     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r17 = "raw_events"
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "name"
            java.lang.String r23 = "timestamp"
            java.lang.String r24 = "metadata_fingerprint"
            java.lang.String r25 = "data"
            java.lang.String r26 = "realtime"
            java.lang.String[] r18 = new java.lang.String[]{r21, r22, r23, r24, r25, r26}     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r23 = "rowid"
            java.lang.String r24 = "1000"
            r21 = 0
            r22 = 0
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x00f4 }
            boolean r0 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4 }
            if (r0 != 0) goto L_0x006f
            r6.close()
            return
        L_0x006f:
            long r17 = r6.getLong(r5)     // Catch:{ SQLiteException -> 0x00f4 }
            r0 = 3
            long r19 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            r0 = 5
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            r9 = 1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r7 = 1
            if (r0 != 0) goto L_0x0087
            r21 = r7
            goto L_0x0089
        L_0x0087:
            r21 = r5
        L_0x0089:
            r0 = 4
            byte[] r0 = r6.getBlob(r0)     // Catch:{ SQLiteException -> 0x00f4 }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r8 = com.google.android.gms.internal.measurement.zzgn.zzf.W()     // Catch:{ IOException -> 0x01a3 }
            com.google.android.gms.internal.measurement.zzmk r0 = com.google.android.gms.measurement.internal.zzol.G(r8, r0)     // Catch:{ IOException -> 0x01a3 }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r0 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r0     // Catch:{ IOException -> 0x01a3 }
            java.lang.String r7 = r6.getString(r7)     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r7 = r8
        L_0x00a2:
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r7 = r0.L(r7)     // Catch:{ SQLiteException -> 0x00f4 }
            r9 = 2
            long r9 = r6.getLong(r9)     // Catch:{ SQLiteException -> 0x00f4 }
            r7.N(r9)     // Catch:{ SQLiteException -> 0x00f4 }
            com.google.android.gms.measurement.internal.zzol r7 = r15.o()     // Catch:{ SQLiteException -> 0x00f4 }
            com.google.android.gms.internal.measurement.zzml r9 = r0.F()     // Catch:{ SQLiteException -> 0x00f4 }
            com.google.android.gms.internal.measurement.zzlc r9 = (com.google.android.gms.internal.measurement.zzlc) r9     // Catch:{ SQLiteException -> 0x00f4 }
            com.google.android.gms.internal.measurement.zzgn$zzf r9 = (com.google.android.gms.internal.measurement.zzgn.zzf) r9     // Catch:{ SQLiteException -> 0x00f4 }
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00f4 }
            r10.<init>()     // Catch:{ SQLiteException -> 0x00f4 }
            java.util.List r11 = r9.Z()     // Catch:{ SQLiteException -> 0x00f4 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ SQLiteException -> 0x00f4 }
        L_0x00c7:
            boolean r16 = r11.hasNext()     // Catch:{ SQLiteException -> 0x00f4 }
            if (r16 == 0) goto L_0x0159
            java.lang.Object r16 = r11.next()     // Catch:{ SQLiteException -> 0x00f4 }
            r5 = r16
            com.google.android.gms.internal.measurement.zzgn$zzh r5 = (com.google.android.gms.internal.measurement.zzgn.zzh) r5     // Catch:{ SQLiteException -> 0x00f4 }
            boolean r16 = r5.d0()     // Catch:{ SQLiteException -> 0x00f4 }
            if (r16 == 0) goto L_0x00f9
            java.lang.String r1 = r5.a0()     // Catch:{ SQLiteException -> 0x00f4 }
            r28 = r3
            double r3 = r5.J()     // Catch:{ SQLiteException -> 0x00f1 }
            r10.putDouble(r1, r3)     // Catch:{ SQLiteException -> 0x00f1 }
        L_0x00e8:
            r1 = r30
            r3 = r28
            r5 = 0
            goto L_0x00c7
        L_0x00ee:
            r0 = move-exception
            goto L_0x0229
        L_0x00f1:
            r0 = move-exception
            goto L_0x01c8
        L_0x00f4:
            r0 = move-exception
            r28 = r3
            goto L_0x01c8
        L_0x00f9:
            r28 = r3
            boolean r1 = r5.e0()     // Catch:{ SQLiteException -> 0x00f1 }
            if (r1 == 0) goto L_0x010d
            java.lang.String r1 = r5.a0()     // Catch:{ SQLiteException -> 0x00f1 }
            float r3 = r5.R()     // Catch:{ SQLiteException -> 0x00f1 }
            r10.putFloat(r1, r3)     // Catch:{ SQLiteException -> 0x00f1 }
            goto L_0x00e8
        L_0x010d:
            boolean r1 = r5.f0()     // Catch:{ SQLiteException -> 0x00f1 }
            if (r1 == 0) goto L_0x011f
            java.lang.String r1 = r5.a0()     // Catch:{ SQLiteException -> 0x00f1 }
            long r3 = r5.W()     // Catch:{ SQLiteException -> 0x00f1 }
            r10.putLong(r1, r3)     // Catch:{ SQLiteException -> 0x00f1 }
            goto L_0x00e8
        L_0x011f:
            boolean r1 = r5.h0()     // Catch:{ SQLiteException -> 0x00f1 }
            if (r1 == 0) goto L_0x0131
            java.lang.String r1 = r5.a0()     // Catch:{ SQLiteException -> 0x00f1 }
            java.lang.String r3 = r5.b0()     // Catch:{ SQLiteException -> 0x00f1 }
            r10.putString(r1, r3)     // Catch:{ SQLiteException -> 0x00f1 }
            goto L_0x00e8
        L_0x0131:
            java.util.List r1 = r5.c0()     // Catch:{ SQLiteException -> 0x00f1 }
            boolean r1 = r1.isEmpty()     // Catch:{ SQLiteException -> 0x00f1 }
            if (r1 != 0) goto L_0x014b
            java.lang.String r1 = r5.a0()     // Catch:{ SQLiteException -> 0x00f1 }
            java.util.List r3 = r5.c0()     // Catch:{ SQLiteException -> 0x00f1 }
            android.os.Bundle[] r3 = com.google.android.gms.measurement.internal.zzol.j0(r3)     // Catch:{ SQLiteException -> 0x00f1 }
            r10.putParcelableArray(r1, r3)     // Catch:{ SQLiteException -> 0x00f1 }
            goto L_0x00e8
        L_0x014b:
            com.google.android.gms.measurement.internal.zzgi r1 = r7.m()     // Catch:{ SQLiteException -> 0x00f1 }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()     // Catch:{ SQLiteException -> 0x00f1 }
            java.lang.String r3 = "Unexpected parameter type for parameter"
            r1.b(r3, r5)     // Catch:{ SQLiteException -> 0x00f1 }
            goto L_0x00e8
        L_0x0159:
            r28 = r3
            java.lang.String r1 = r10.getString(r14)     // Catch:{ SQLiteException -> 0x00f1 }
            r10.remove(r14)     // Catch:{ SQLiteException -> 0x00f1 }
            com.google.android.gms.measurement.internal.zzgm r3 = new com.google.android.gms.measurement.internal.zzgm     // Catch:{ SQLiteException -> 0x00f1 }
            java.lang.String r23 = r9.Y()     // Catch:{ SQLiteException -> 0x00f1 }
            if (r1 != 0) goto L_0x016d
            r24 = r8
            goto L_0x016f
        L_0x016d:
            r24 = r1
        L_0x016f:
            long r26 = r9.V()     // Catch:{ SQLiteException -> 0x00f1 }
            r22 = r3
            r25 = r10
            r22.<init>(r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x00f1 }
            com.google.android.gms.measurement.internal.zzop r1 = r15.j()     // Catch:{ SQLiteException -> 0x00f1 }
            android.os.Bundle r4 = r3.f26343d     // Catch:{ SQLiteException -> 0x00f1 }
            r1.N(r4, r2)     // Catch:{ SQLiteException -> 0x00f1 }
            com.google.android.gms.measurement.internal.zzop r1 = r15.j()     // Catch:{ SQLiteException -> 0x00f1 }
            com.google.android.gms.measurement.internal.zzah r4 = r15.d()     // Catch:{ SQLiteException -> 0x00f1 }
            int r4 = r4.x(r13)     // Catch:{ SQLiteException -> 0x00f1 }
            r1.W(r3, r4)     // Catch:{ SQLiteException -> 0x00f1 }
            com.google.android.gms.measurement.internal.zzaq r1 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ SQLiteException -> 0x00f1 }
            long r22 = r0.M()     // Catch:{ SQLiteException -> 0x00f1 }
            r16 = r1
            r24 = r3
            r16.<init>(r17, r19, r21, r22, r24)     // Catch:{ SQLiteException -> 0x00f1 }
            r12.add(r1)     // Catch:{ SQLiteException -> 0x00f1 }
            goto L_0x01b7
        L_0x01a3:
            r0 = move-exception
            r28 = r3
            com.google.android.gms.measurement.internal.zzgi r1 = r15.m()     // Catch:{ SQLiteException -> 0x00f1 }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()     // Catch:{ SQLiteException -> 0x00f1 }
            java.lang.String r3 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r32)     // Catch:{ SQLiteException -> 0x00f1 }
            r1.c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x00f1 }
        L_0x01b7:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x00f1 }
            if (r0 != 0) goto L_0x01c1
            r6.close()
            goto L_0x01de
        L_0x01c1:
            r1 = r30
            r3 = r28
            r5 = 0
            goto L_0x006f
        L_0x01c8:
            com.google.android.gms.measurement.internal.zzgi r1 = r15.m()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = "Data loss. Error querying raw events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r32)     // Catch:{ all -> 0x00ee }
            r1.c(r3, r4, r0)     // Catch:{ all -> 0x00ee }
            if (r6 == 0) goto L_0x01de
            r6.close()
        L_0x01de:
            int r0 = r12.size()
            r5 = 0
        L_0x01e3:
            if (r5 >= r0) goto L_0x0223
            java.lang.Object r1 = r12.get(r5)
            int r16 = r5 + 1
            com.google.android.gms.measurement.internal.zzaq r1 = (com.google.android.gms.measurement.internal.zzaq) r1
            com.google.android.gms.measurement.internal.zzba r17 = new com.google.android.gms.measurement.internal.zzba
            com.google.android.gms.measurement.internal.zzhw r4 = r15.f26587a
            com.google.android.gms.measurement.internal.zzgm r3 = r1.f26205e
            java.lang.String r5 = r3.f26341b
            java.lang.String r7 = r3.f26340a
            long r8 = r3.f26342c
            long r10 = r1.f26204d
            android.os.Bundle r6 = r3.f26343d
            r3 = r17
            r18 = r6
            r6 = r32
            r19 = r12
            r12 = r18
            r3.<init>((com.google.android.gms.measurement.internal.zzhw) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (long) r8, (long) r10, (android.os.Bundle) r12)
            long r4 = r1.f26201a
            long r7 = r1.f26202b
            boolean r9 = r1.f26203c
            r3 = r15
            r6 = r17
            r3.d0(r4, r6, r7, r9)
            long r3 = r1.f26201a
            int r1 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r1 <= 0) goto L_0x021e
            r28 = r3
        L_0x021e:
            r5 = r16
            r12 = r19
            goto L_0x01e3
        L_0x0223:
            r1 = r30
            r3 = r28
            goto L_0x0032
        L_0x0229:
            if (r6 == 0) goto L_0x022e
            r6.close()
        L_0x022e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzia.Y2(android.os.Bundle, java.lang.String):void");
    }

    public final void Z(zzp zzp) {
        Z2(zzp, false);
        a3(new zzif(this, zzp));
    }

    public final void Z2(zzp zzp, boolean z2) {
        Preconditions.m(zzp);
        Preconditions.g(zzp.f26977z);
        W2(zzp.f26977z, false);
        this.f26522l.y0().k0(zzp.f26975A, zzp.P);
    }

    public final void a3(Runnable runnable) {
        Preconditions.m(runnable);
        if (this.f26522l.f().J()) {
            runnable.run();
        } else {
            this.f26522l.f().D(runnable);
        }
    }

    public final void b3(zzbh zzbh, zzp zzp) {
        boolean z2;
        if (!this.f26522l.r0().X(zzp.f26977z)) {
            c3(zzbh, zzp);
            return;
        }
        this.f26522l.m().K().b("EES config found for", zzp.f26977z);
        zzhg r0 = this.f26522l.r0();
        String str = zzp.f26977z;
        zzb zzb = TextUtils.isEmpty(str) ? null : (zzb) r0.f26446j.d(str);
        if (zzb == null) {
            this.f26522l.m().K().b("EES not loaded for", zzp.f26977z);
            c3(zzbh, zzp);
            return;
        }
        try {
            Map Q = this.f26522l.x0().Q(zzbh.f26254A.X(), true);
            String a2 = zzjf.a(zzbh.f26256z);
            if (a2 == null) {
                a2 = zzbh.f26256z;
            }
            z2 = zzb.d(new zzad(a2, zzbh.C, Q));
        } catch (zzc unused) {
            this.f26522l.m().G().c("EES error. appId, eventName", zzp.f26975A, zzbh.f26256z);
            z2 = false;
        }
        if (!z2) {
            this.f26522l.m().K().b("EES was not applied to event", zzbh.f26256z);
            c3(zzbh, zzp);
            return;
        }
        if (zzb.g()) {
            this.f26522l.m().K().b("EES edited event", zzbh.f26256z);
            c3(this.f26522l.x0().H(zzb.a().d()), zzp);
        } else {
            c3(zzbh, zzp);
        }
        if (zzb.f()) {
            for (zzad zzad : zzb.a().f()) {
                this.f26522l.m().K().b("EES logging created event", zzad.e());
                c3(this.f26522l.x0().H(zzad), zzp);
            }
        }
    }

    public final void c3(zzbh zzbh, zzp zzp) {
        this.f26522l.z0();
        this.f26522l.u(zzbh, zzp);
    }

    public final void d0(zzaf zzaf, zzp zzp) {
        Preconditions.m(zzaf);
        Preconditions.m(zzaf.f26175B);
        Z2(zzp, false);
        zzaf zzaf2 = new zzaf(zzaf);
        zzaf2.f26176z = zzp.f26977z;
        a3(new zzih(this, zzaf2, zzp));
    }

    public final /* synthetic */ void d3(zzp zzp) {
        this.f26522l.z0();
        this.f26522l.m0(zzp);
    }

    public final void e1(long j2, String str, String str2, String str3) {
        a3(new zzii(this, str2, str3, str, j2));
    }

    public final /* synthetic */ void e3(zzp zzp) {
        this.f26522l.z0();
        this.f26522l.o0(zzp);
    }

    public final List f1(zzp zzp, Bundle bundle) {
        Z2(zzp, false);
        Preconditions.m(zzp.f26977z);
        try {
            return (List) this.f26522l.f().w(new zziw(this, zzp, bundle)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f26522l.m().G().c("Failed to get trigger URIs. appId", zzgi.v(zzp.f26977z), e2);
            return Collections.emptyList();
        }
    }

    public final void g1(zzaf zzaf) {
        Preconditions.m(zzaf);
        Preconditions.m(zzaf.f26175B);
        Preconditions.g(zzaf.f26176z);
        W2(zzaf.f26176z, true);
        a3(new zzik(this, new zzaf(zzaf)));
    }

    public final String k1(zzp zzp) {
        Z2(zzp, false);
        return this.f26522l.V(zzp);
    }

    public final List l1(String str, String str2, String str3) {
        W2(str, true);
        try {
            return (List) this.f26522l.f().w(new zzio(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f26522l.m().G().b("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    public final void m1(Bundle bundle, zzp zzp) {
        if (zzpi.a() && this.f26522l.i0().t(zzbj.l1)) {
            Z2(zzp, false);
            String str = zzp.f26977z;
            Preconditions.m(str);
            a3(new zzic(this, bundle, str));
        }
    }

    public final void m2(zzp zzp) {
        Preconditions.g(zzp.f26977z);
        Preconditions.m(zzp.U);
        u1(new zzhz(this, zzp));
    }

    public final List n0(String str, String str2, zzp zzp) {
        Z2(zzp, false);
        String str3 = zzp.f26977z;
        Preconditions.m(str3);
        try {
            return (List) this.f26522l.f().w(new zzil(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f26522l.m().G().b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    public final List u0(String str, String str2, String str3, boolean z2) {
        W2(str, true);
        try {
            List<zzom> list = (List) this.f26522l.f().w(new zzim(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzom zzom : list) {
                if (!z2) {
                    if (!zzop.J0(zzom.f26964c)) {
                    }
                }
                arrayList.add(new zzok(zzom));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.f26522l.m().G().c("Failed to get user properties as. appId", zzgi.v(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e3) {
            e = e3;
            this.f26522l.m().G().c("Failed to get user properties as. appId", zzgi.v(str), e);
            return Collections.emptyList();
        }
    }

    public final void u1(Runnable runnable) {
        Preconditions.m(runnable);
        if (this.f26522l.f().J()) {
            runnable.run();
        } else {
            this.f26522l.f().G(runnable);
        }
    }

    public final void z0(zzp zzp) {
        Z2(zzp, false);
        a3(new zzig(this, zzp));
    }

    public final void z2(zzp zzp) {
        Preconditions.g(zzp.f26977z);
        Preconditions.m(zzp.U);
        u1(new zziq(this, zzp));
    }

    public zzia(zznv zznv, String str) {
        Preconditions.m(zznv);
        this.f26522l = zznv;
        this.f26524n = null;
    }
}
