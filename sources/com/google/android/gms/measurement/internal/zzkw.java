package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

final class zzkw implements Application.ActivityLifecycleCallbacks {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzjk f26712z;

    public zzkw(zzjk zzjk) {
        this.f26712z = zzjk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0 A[SYNTHETIC, Splitter:B:40:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f A[Catch:{ RuntimeException -> 0x0028 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110 A[Catch:{ RuntimeException -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(com.google.android.gms.measurement.internal.zzkw r16, boolean r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20) {
        /*
            r1 = r16
            r0 = r19
            r2 = r20
            com.google.android.gms.measurement.internal.zzjk r3 = r1.f26712z
            r3.n()
            com.google.android.gms.measurement.internal.zzjk r3 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzop r3 = r3.j()     // Catch:{ RuntimeException -> 0x0028 }
            boolean r4 = com.google.android.gms.internal.measurement.zzqn.a()     // Catch:{ RuntimeException -> 0x0028 }
            r6 = 1
            if (r4 == 0) goto L_0x002b
            com.google.android.gms.measurement.internal.zzjk r4 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzah r4 = r4.d()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzfz r7 = com.google.android.gms.measurement.internal.zzbj.T0     // Catch:{ RuntimeException -> 0x0028 }
            boolean r4 = r4.t(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r4 == 0) goto L_0x002b
            r4 = r6
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            goto L_0x0197
        L_0x002b:
            r4 = 0
        L_0x002c:
            boolean r7 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r8 = "_cis"
            java.lang.String r9 = "Activity created with data 'referrer' without required params"
            java.lang.String r10 = "utm_medium"
            java.lang.String r11 = "utm_source"
            java.lang.String r12 = "utm_campaign"
            r13 = 0
            java.lang.String r14 = "gclid"
            if (r7 == 0) goto L_0x0041
        L_0x003f:
            r3 = r13
            goto L_0x00ac
        L_0x0041:
            boolean r7 = r2.contains(r14)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            if (r4 == 0) goto L_0x0051
            java.lang.String r7 = "gbraid"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
        L_0x0051:
            boolean r7 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            boolean r7 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            boolean r7 = r2.contains(r10)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = "utm_id"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = "dclid"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = "srsltid"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = "sfmc_id"
            boolean r7 = r2.contains(r7)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.zzgi r3 = r3.m()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.F()     // Catch:{ RuntimeException -> 0x0028 }
            r3.a(r9)     // Catch:{ RuntimeException -> 0x0028 }
            goto L_0x003f
        L_0x008f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r15 = "https://google.com/search?"
            r7.<init>(r15)     // Catch:{ RuntimeException -> 0x0028 }
            r7.append(r2)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r7 = r7.toString()     // Catch:{ RuntimeException -> 0x0028 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ RuntimeException -> 0x0028 }
            android.os.Bundle r3 = r3.C(r7, r4)     // Catch:{ RuntimeException -> 0x0028 }
            if (r3 == 0) goto L_0x00ac
            java.lang.String r4 = "referrer"
            r3.putString(r8, r4)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x00ac:
            java.lang.String r4 = "_cmp"
            if (r17 == 0) goto L_0x0109
            com.google.android.gms.measurement.internal.zzjk r7 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzop r7 = r7.j()     // Catch:{ RuntimeException -> 0x0028 }
            boolean r15 = com.google.android.gms.internal.measurement.zzqn.a()     // Catch:{ RuntimeException -> 0x0028 }
            if (r15 == 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.zzjk r15 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzah r15 = r15.d()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.T0     // Catch:{ RuntimeException -> 0x0028 }
            boolean r5 = r15.t(r5)     // Catch:{ RuntimeException -> 0x0028 }
            if (r5 == 0) goto L_0x00ce
            r15 = r18
            r5 = r6
            goto L_0x00d1
        L_0x00ce:
            r15 = r18
            r5 = 0
        L_0x00d1:
            android.os.Bundle r5 = r7.C(r15, r5)     // Catch:{ RuntimeException -> 0x0028 }
            if (r5 == 0) goto L_0x0109
            java.lang.String r7 = "intent"
            r5.putString(r8, r7)     // Catch:{ RuntimeException -> 0x0028 }
            boolean r7 = r5.containsKey(r14)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 != 0) goto L_0x00fd
            if (r3 == 0) goto L_0x00fd
            boolean r7 = r3.containsKey(r14)     // Catch:{ RuntimeException -> 0x0028 }
            if (r7 == 0) goto L_0x00fd
            java.lang.String r7 = "_cer"
            java.lang.String r8 = "gclid=%s"
            java.lang.String r15 = r3.getString(r14)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r8 = java.lang.String.format(r8, r15)     // Catch:{ RuntimeException -> 0x0028 }
            r5.putString(r7, r8)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x00fd:
            com.google.android.gms.measurement.internal.zzjk r7 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            r7.b1(r0, r4, r5)     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzjk r7 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzs r7 = r7.f26636q     // Catch:{ RuntimeException -> 0x0028 }
            r7.b(r0, r5)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x0109:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x0028 }
            if (r5 == 0) goto L_0x0110
            return
        L_0x0110:
            com.google.android.gms.measurement.internal.zzjk r5 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzgi r5 = r5.m()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.F()     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r7 = "Activity created with referrer"
            r5.b(r7, r2)     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzjk r5 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzah r5 = r5.d()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzfz r7 = com.google.android.gms.measurement.internal.zzbj.q0     // Catch:{ RuntimeException -> 0x0028 }
            boolean r5 = r5.t(r7)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r7 = "_ldl"
            java.lang.String r8 = "auto"
            if (r5 == 0) goto L_0x0155
            if (r3 == 0) goto L_0x0140
            com.google.android.gms.measurement.internal.zzjk r2 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            r2.b1(r0, r4, r3)     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzjk r2 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzs r2 = r2.f26636q     // Catch:{ RuntimeException -> 0x0028 }
            r2.b(r0, r3)     // Catch:{ RuntimeException -> 0x0028 }
            goto L_0x014f
        L_0x0140:
            com.google.android.gms.measurement.internal.zzjk r0 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.F()     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.b(r3, r2)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x014f:
            com.google.android.gms.measurement.internal.zzjk r0 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            r0.l0(r8, r7, r13, r6)     // Catch:{ RuntimeException -> 0x0028 }
            return
        L_0x0155:
            boolean r0 = r2.contains(r14)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 == 0) goto L_0x0189
            boolean r0 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x017d
            boolean r0 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x017d
            boolean r0 = r2.contains(r10)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x017d
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x017d
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 == 0) goto L_0x0189
        L_0x017d:
            boolean r0 = android.text.TextUtils.isEmpty(r20)     // Catch:{ RuntimeException -> 0x0028 }
            if (r0 != 0) goto L_0x0188
            com.google.android.gms.measurement.internal.zzjk r0 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            r0.l0(r8, r7, r2, r6)     // Catch:{ RuntimeException -> 0x0028 }
        L_0x0188:
            return
        L_0x0189:
            com.google.android.gms.measurement.internal.zzjk r0 = r1.f26712z     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()     // Catch:{ RuntimeException -> 0x0028 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.F()     // Catch:{ RuntimeException -> 0x0028 }
            r0.a(r9)     // Catch:{ RuntimeException -> 0x0028 }
            return
        L_0x0197:
            com.google.android.gms.measurement.internal.zzjk r1 = r1.f26712z
            com.google.android.gms.measurement.internal.zzgi r1 = r1.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkw.a(com.google.android.gms.measurement.internal.zzkw, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f26712z.m().K().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                this.f26712z.s().F(activity, bundle);
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null) {
                if (uri.isHierarchical()) {
                    this.f26712z.j();
                    this.f26712z.f().D(new zzkz(this, bundle == null, uri, zzop.f0(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    this.f26712z.s().F(activity, bundle);
                    return;
                }
            }
            this.f26712z.s().F(activity, bundle);
        } catch (RuntimeException e2) {
            this.f26712z.m().G().b("Throwable caught in onActivityCreated", e2);
            this.f26712z.s().F(activity, bundle);
        } catch (Throwable th) {
            this.f26712z.s().F(activity, bundle);
            throw th;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f26712z.s().E(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f26712z.s().Q(activity);
        zznb u2 = this.f26712z.u();
        u2.f().D(new zznd(u2, u2.b().c()));
    }

    public final void onActivityResumed(Activity activity) {
        zznb u2 = this.f26712z.u();
        u2.f().D(new zzna(u2, u2.b().c()));
        this.f26712z.s().S(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f26712z.s().R(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
