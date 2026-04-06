package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzdt;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzqt;
import com.google.android.gms.internal.measurement.zzrl;
import com.google.android.gms.internal.measurement.zzrw;
import com.google.android.gms.measurement.internal.zzjc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zznv implements zzja {
    public static volatile zznv H;

    /* renamed from: A  reason: collision with root package name */
    public long f26898A;

    /* renamed from: B  reason: collision with root package name */
    public final Map f26899B;
    public final Map C;
    public final Map D;
    public zzlh E;
    public String F;
    public final zzoo G;

    /* renamed from: a  reason: collision with root package name */
    public zzhg f26900a;

    /* renamed from: b  reason: collision with root package name */
    public zzgp f26901b;

    /* renamed from: c  reason: collision with root package name */
    public zzam f26902c;

    /* renamed from: d  reason: collision with root package name */
    public zzgs f26903d;

    /* renamed from: e  reason: collision with root package name */
    public zznm f26904e;

    /* renamed from: f  reason: collision with root package name */
    public zzv f26905f;

    /* renamed from: g  reason: collision with root package name */
    public final zzol f26906g;

    /* renamed from: h  reason: collision with root package name */
    public zzlf f26907h;

    /* renamed from: i  reason: collision with root package name */
    public zzms f26908i;

    /* renamed from: j  reason: collision with root package name */
    public final zznq f26909j;

    /* renamed from: k  reason: collision with root package name */
    public zzhd f26910k;

    /* renamed from: l  reason: collision with root package name */
    public final zzhw f26911l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f26912m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f26913n;

    /* renamed from: o  reason: collision with root package name */
    public long f26914o;

    /* renamed from: p  reason: collision with root package name */
    public List f26915p;

    /* renamed from: q  reason: collision with root package name */
    public final Set f26916q;

    /* renamed from: r  reason: collision with root package name */
    public int f26917r;

    /* renamed from: s  reason: collision with root package name */
    public int f26918s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f26919t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f26920u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f26921v;

    /* renamed from: w  reason: collision with root package name */
    public FileLock f26922w;

    /* renamed from: x  reason: collision with root package name */
    public FileChannel f26923x;

    /* renamed from: y  reason: collision with root package name */
    public List f26924y;

    /* renamed from: z  reason: collision with root package name */
    public List f26925z;

    public class zza implements zzat {

        /* renamed from: a  reason: collision with root package name */
        public zzgn.zzk f26926a;

        /* renamed from: b  reason: collision with root package name */
        public List f26927b;

        /* renamed from: c  reason: collision with root package name */
        public List f26928c;

        /* renamed from: d  reason: collision with root package name */
        public long f26929d;

        public static long c(zzgn.zzf zzf) {
            return ((zzf.V() / 1000) / 60) / 60;
        }

        public final void a(zzgn.zzk zzk) {
            Preconditions.m(zzk);
            this.f26926a = zzk;
        }

        public final boolean b(long j2, zzgn.zzf zzf) {
            Preconditions.m(zzf);
            if (this.f26928c == null) {
                this.f26928c = new ArrayList();
            }
            if (this.f26927b == null) {
                this.f26927b = new ArrayList();
            }
            if (!this.f26928c.isEmpty() && c((zzgn.zzf) this.f26928c.get(0)) != c(zzf)) {
                return false;
            }
            long h2 = this.f26929d + ((long) zzf.h());
            zznv.this.i0();
            if (h2 >= ((long) Math.max(0, ((Integer) zzbj.f26268j.a((Object) null)).intValue()))) {
                return false;
            }
            this.f26929d = h2;
            this.f26928c.add(zzf);
            this.f26927b.add(Long.valueOf(j2));
            int size = this.f26928c.size();
            zznv.this.i0();
            return size < Math.max(1, ((Integer) zzbj.f26269k.a((Object) null)).intValue());
        }

        public zza() {
        }
    }

    public zznv(zzoh zzoh) {
        this(zzoh, (zzhw) null);
    }

    private final void E(String str, zzjc zzjc) {
        f().n();
        A0();
        this.f26899B.put(str, zzjc);
        l0().E0(str, zzjc);
    }

    private final void I(List list) {
        Preconditions.a(!list.isEmpty());
        if (this.f26924y != null) {
            m().G().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f26924y = new ArrayList(list);
        }
    }

    private final void O() {
        f().n();
        if (this.f26919t || this.f26920u || this.f26921v) {
            m().K().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f26919t), Boolean.valueOf(this.f26920u), Boolean.valueOf(this.f26921v));
            return;
        }
        m().K().a("Stopping uploading service(s)");
        List<Runnable> list = this.f26915p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) Preconditions.m(this.f26915p)).clear();
        }
    }

    private final void P() {
        f().n();
        for (String str : this.f26916q) {
            if (zzrl.a() && i0().H(str, zzbj.H0)) {
                m().F().b("Notifying app that trigger URIs are available. App ID", str);
                Intent intent = new Intent();
                intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intent.setPackage(str);
                this.f26911l.a().sendBroadcast(intent);
            }
        }
        this.f26916q.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void Q() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.measurement.internal.zzhp r1 = r21.f()
            r1.n()
            r21.A0()
            long r1 = r0.f26914o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004d
            com.google.android.gms.common.util.Clock r1 = r21.b()
            long r1 = r1.c()
            long r5 = r0.f26914o
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.zzgi r1 = r21.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.zzgs r1 = r21.G0()
            r1.c()
            com.google.android.gms.measurement.internal.zznm r1 = r21.H0()
            r1.z()
            return
        L_0x004b:
            r0.f26914o = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.zzhw r1 = r0.f26911l
            boolean r1 = r1.s()
            if (r1 == 0) goto L_0x024e
            boolean r1 = r21.R()
            if (r1 != 0) goto L_0x005d
            goto L_0x024e
        L_0x005d:
            com.google.android.gms.common.util.Clock r1 = r21.b()
            long r1 = r1.a()
            r21.i0()
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.C
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzam r5 = r21.l0()
            boolean r5 = r5.l1()
            if (r5 != 0) goto L_0x0090
            com.google.android.gms.measurement.internal.zzam r5 = r21.l0()
            boolean r5 = r5.k1()
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r5 = 0
            goto L_0x0091
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.zzah r10 = r21.i0()
            java.lang.String r10 = r10.V()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bd
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bd
            r21.i0()
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.f26282x
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00bd:
            r21.i0()
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.f26281w
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00d1:
            r21.i0()
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.f26280v
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00e4:
            com.google.android.gms.measurement.internal.zzms r12 = r0.f26908i
            com.google.android.gms.measurement.internal.zzgz r12 = r12.f26838h
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.zzms r14 = r0.f26908i
            com.google.android.gms.measurement.internal.zzgz r14 = r14.f26839i
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.zzam r16 = r21.l0()
            r17 = r10
            long r9 = r16.z()
            com.google.android.gms.measurement.internal.zzam r11 = r21.l0()
            r19 = r7
            long r6 = r11.A()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r10 = r3
            goto L_0x018d
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            com.google.android.gms.measurement.internal.zzol r5 = r21.x0()
            r12 = r17
            boolean r5 = r5.d0(r8, r12)
            if (r5 != 0) goto L_0x0147
            long r10 = r8 + r12
        L_0x0147:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018d
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x018d
            r5 = 0
        L_0x0150:
            r21.i0()
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.E
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = 0
            int r6 = java.lang.Math.max(r8, r6)
            r9 = 20
            int r6 = java.lang.Math.min(r9, r6)
            if (r5 >= r6) goto L_0x0110
            r12 = 1
            long r12 = r12 << r5
            r21.i0()
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.D
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r3, r6)
            long r6 = r6 * r12
            long r10 = r10 + r6
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x018a
            goto L_0x018d
        L_0x018a:
            int r5 = r5 + 1
            goto L_0x0150
        L_0x018d:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.zzgi r1 = r21.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.zzgs r1 = r21.G0()
            r1.c()
            com.google.android.gms.measurement.internal.zznm r1 = r21.H0()
            r1.z()
            return
        L_0x01ad:
            com.google.android.gms.measurement.internal.zzgp r1 = r21.p0()
            boolean r1 = r1.B()
            if (r1 != 0) goto L_0x01d3
            com.google.android.gms.measurement.internal.zzgi r1 = r21.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.zzgs r1 = r21.G0()
            r1.b()
            com.google.android.gms.measurement.internal.zznm r1 = r21.H0()
            r1.z()
            return
        L_0x01d3:
            com.google.android.gms.measurement.internal.zzms r1 = r0.f26908i
            com.google.android.gms.measurement.internal.zzgz r1 = r1.f26837g
            long r1 = r1.a()
            r21.i0()
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.f26278t
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzol r7 = r21.x0()
            boolean r7 = r7.d0(r1, r5)
            if (r7 != 0) goto L_0x01fe
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01fe:
            com.google.android.gms.measurement.internal.zzgs r1 = r21.G0()
            r1.c()
            com.google.android.gms.common.util.Clock r1 = r21.b()
            long r1 = r1.a()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0235
            r21.i0()
            com.google.android.gms.measurement.internal.zzfz r1 = com.google.android.gms.measurement.internal.zzbj.f26283y
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzms r1 = r0.f26908i
            com.google.android.gms.measurement.internal.zzgz r1 = r1.f26838h
            com.google.android.gms.common.util.Clock r2 = r21.b()
            long r2 = r2.a()
            r1.b(r2)
        L_0x0235:
            com.google.android.gms.measurement.internal.zzgi r1 = r21.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.zznm r1 = r21.H0()
            r1.y(r10)
            return
        L_0x024e:
            com.google.android.gms.measurement.internal.zzgi r1 = r21.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.zzgs r1 = r21.G0()
            r1.c()
            com.google.android.gms.measurement.internal.zznm r1 = r21.H0()
            r1.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.Q():void");
    }

    private final boolean R() {
        f().n();
        A0();
        return l0().j1() || !TextUtils.isEmpty(l0().C());
    }

    private final boolean S() {
        f().n();
        return this.f26924y != null;
    }

    private final boolean T() {
        f().n();
        FileLock fileLock = this.f26922w;
        if (fileLock == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(zzcf.a().b(this.f26911l.a().getFilesDir(), "google_app_measurement.db")), "rw").getChannel();
                this.f26923x = channel;
                FileLock tryLock = channel.tryLock();
                this.f26922w = tryLock;
                if (tryLock != null) {
                    m().K().a("Storage concurrent access okay");
                    return true;
                }
                m().G().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e2) {
                m().G().b("Failed to acquire storage lock", e2);
                return false;
            } catch (IOException e3) {
                m().G().b("Failed to access storage lock file", e3);
                return false;
            } catch (OverlappingFileLockException e4) {
                m().L().b("Storage lock already acquired", e4);
                return false;
            }
        } else {
            m().K().a("Storage concurrent access okay");
            return true;
        }
    }

    public static zznr k(zznr zznr) {
        if (zznr == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (zznr.w()) {
            return zznr;
        } else {
            String valueOf = String.valueOf(zznr.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public static zznv l(Context context) {
        Preconditions.m(context);
        Preconditions.m(context.getApplicationContext());
        if (H == null) {
            synchronized (zznv.class) {
                try {
                    if (H == null) {
                        H = new zznv((zzoh) Preconditions.m(new zzoh(context)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return H;
    }

    public static void p(zzgn.zzf.zza zza2, int i2, String str) {
        List U = zza2.U();
        int i3 = 0;
        while (i3 < U.size()) {
            if (!"_err".equals(((zzgn.zzh) U.get(i3)).a0())) {
                i3++;
            } else {
                return;
            }
        }
        zza2.J((zzgn.zzh) ((zzlc) zzgn.zzh.Y().I("_err").B((long) i2).F())).J((zzgn.zzh) ((zzlc) zzgn.zzh.Y().I("_ev").K(str).F()));
    }

    public static void q(zzgn.zzf.zza zza2, String str) {
        List U = zza2.U();
        for (int i2 = 0; i2 < U.size(); i2++) {
            if (str.equals(((zzgn.zzh) U.get(i2)).a0())) {
                zza2.z(i2);
                return;
            }
        }
    }

    public static boolean s0(zzp zzp) {
        return !TextUtils.isEmpty(zzp.f26975A) || !TextUtils.isEmpty(zzp.P);
    }

    public static /* synthetic */ void x(zznv zznv, zzoh zzoh) {
        zznv.f().n();
        zznv.f26910k = new zzhd(zznv);
        zzam zzam = new zzam(zznv);
        zzam.v();
        zznv.f26902c = zzam;
        zznv.i0().s((zzaj) Preconditions.m(zznv.f26900a));
        zzms zzms = new zzms(zznv);
        zzms.v();
        zznv.f26908i = zzms;
        zzv zzv = new zzv(zznv);
        zzv.v();
        zznv.f26905f = zzv;
        zzlf zzlf = new zzlf(zznv);
        zzlf.v();
        zznv.f26907h = zzlf;
        zznm zznm = new zznm(zznv);
        zznm.v();
        zznv.f26904e = zznm;
        zznv.f26903d = new zzgs(zznv);
        if (zznv.f26917r != zznv.f26918s) {
            zznv.m().G().c("Not all upload components initialized", Integer.valueOf(zznv.f26917r), Integer.valueOf(zznv.f26918s));
        }
        zznv.f26912m = true;
    }

    public final void A(String str, int i2, Throwable th, byte[] bArr, zzog zzog) {
        zzam l0;
        f().n();
        A0();
        if ((i2 == 200 || i2 == 204) && th == null) {
            if (zzog != null) {
                try {
                    l0 = l0();
                    Long valueOf = Long.valueOf(zzog.a());
                    l0.n();
                    l0.u();
                    Preconditions.m(valueOf);
                    if (zzrw.a()) {
                        if (l0.d().t(zzbj.A0)) {
                        }
                    }
                    if (l0.B().delete("upload_queue", "rowid=?", new String[]{String.valueOf(valueOf)}) != 1) {
                        l0.m().L().a("Deleted fewer rows from upload_queue than expected");
                    }
                } catch (SQLiteException e2) {
                    l0.m().G().b("Failed to delete a MeasurementBatch in a upload_queue table", e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.f26920u = false;
                    O();
                    throw th2;
                }
            }
            m().K().c("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i2));
            if (!i0().t(zzbj.A0) || !p0().B() || !l0().f1(str)) {
                Q();
            } else {
                k0(str);
            }
        } else {
            m().K().c("Network upload failed. Will retry later. appId, status", str, Integer.valueOf(i2));
            if (zzog != null) {
                l0().W(Long.valueOf(zzog.a()));
            }
            Q();
        }
        this.f26920u = false;
        O();
    }

    public final void A0() {
        if (!this.f26912m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void B0() {
        this.f26918s++;
    }

    public final void C(String str, zzgn.zzh.zza zza2, Bundle bundle, String str2) {
        List b2 = CollectionUtils.b("_o", "_sn", "_sc", "_si");
        long z2 = (long) ((zzop.J0(zza2.O()) || zzop.J0(str)) ? i0().z(str2, true) : i0().r(str2, true));
        long codePointCount = (long) zza2.P().codePointCount(0, zza2.P().length());
        y0();
        String O = zza2.O();
        i0();
        String J = zzop.J(O, 40, true);
        if (codePointCount > z2 && !b2.contains(zza2.O())) {
            if ("_ev".equals(zza2.O())) {
                y0();
                bundle.putString("_ev", zzop.J(zza2.P(), i0().z(str2, true), true));
                return;
            }
            m().M().c("Param value is too long; discarded. Name, value length", J, Long.valueOf(codePointCount));
            if (bundle.getLong("_err") == 0) {
                bundle.putLong("_err", 4);
                if (bundle.getString("_ev") == null) {
                    bundle.putString("_ev", J);
                    bundle.putLong("_el", codePointCount);
                }
            }
            bundle.remove(zza2.O());
        }
    }

    public final void C0() {
        this.f26917r++;
    }

    public final void D(String str, zzgn.zzk.zza zza2) {
        int y2;
        int indexOf;
        Set S = r0().S(str);
        if (S != null) {
            zza2.p0(S);
        }
        if (r0().c0(str)) {
            zza2.P0();
        }
        if (r0().f0(str)) {
            String w1 = zza2.w1();
            if (!TextUtils.isEmpty(w1) && (indexOf = w1.indexOf(".")) != -1) {
                zza2.i1(w1.substring(0, indexOf));
            }
        }
        if (r0().g0(str) && (y2 = zzol.y(zza2, "_id")) != -1) {
            zza2.h0(y2);
        }
        if (r0().e0(str)) {
            zza2.T0();
        }
        if (r0().b0(str)) {
            zza2.H0();
            if (!zzpd.a() || !i0().t(zzbj.d1) || U(str).B()) {
                zzb zzb2 = (zzb) this.D.get(str);
                if (zzb2 == null || zzb2.f26932b + i0().C(str, zzbj.X) < b().c()) {
                    zzb2 = new zzb();
                    this.D.put(str, zzb2);
                }
                zza2.X0(zzb2.f26931a);
            }
        }
        if (r0().d0(str)) {
            zza2.n1();
        }
    }

    public final void D0() {
        int delete;
        f().n();
        l0().h1();
        zzam l0 = l0();
        l0.n();
        l0.u();
        if (l0.o0()) {
            zzfz zzfz = zzbj.i0;
            if (((Long) zzfz.a((Object) null)).longValue() != 0 && (delete = l0.B().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(l0.b().a()), String.valueOf(zzfz.a((Object) null))})) > 0) {
                l0.m().K().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
            }
        }
        if (this.f26908i.f26838h.a() == 0) {
            this.f26908i.f26838h.b(b().a());
        }
        Q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        m().G().c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzgi.v(r6), r16.b());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:237:0x05d0 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cb A[SYNTHETIC, Splitter:B:100:0x01cb] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e3 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0328 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03aa A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0577 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0580 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0596 A[Catch:{ MalformedURLException -> 0x05d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x037f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0() {
        /*
            r25 = this;
            r8 = r25
            com.google.android.gms.measurement.internal.zzhp r0 = r25.f()
            r0.n()
            r25.A0()
            r0 = 1
            r8.f26921v = r0
            r9 = 0
            com.google.android.gms.measurement.internal.zzhw r1 = r8.f26911l     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzlp r1 = r1.J()     // Catch:{ all -> 0x021d }
            java.lang.Boolean r1 = r1.X()     // Catch:{ all -> 0x021d }
            if (r1 != 0) goto L_0x0033
            com.google.android.gms.measurement.internal.zzgi r0 = r25.m()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.L()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "Upload data called on the client side before use of service was decided"
            r0.a(r1)     // Catch:{ all -> 0x002f }
            r8.f26921v = r9
            r25.O()
            return
        L_0x002f:
            r0 = move-exception
            r1 = r9
            goto L_0x0612
        L_0x0033:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x021d }
            if (r1 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.zzgi r0 = r25.m()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "Upload called in the client side when service should be used"
            r0.a(r1)     // Catch:{ all -> 0x002f }
            r8.f26921v = r9
            r25.O()
            return
        L_0x004c:
            long r1 = r8.f26914o     // Catch:{ all -> 0x021d }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x005d
            r25.Q()     // Catch:{ all -> 0x002f }
            r8.f26921v = r9
            r25.O()
            return
        L_0x005d:
            boolean r1 = r25.S()     // Catch:{ all -> 0x021d }
            if (r1 == 0) goto L_0x0076
            com.google.android.gms.measurement.internal.zzgi r0 = r25.m()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.K()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "Uploading requested multiple times"
            r0.a(r1)     // Catch:{ all -> 0x002f }
            r8.f26921v = r9
            r25.O()
            return
        L_0x0076:
            com.google.android.gms.measurement.internal.zzgp r1 = r25.p0()     // Catch:{ all -> 0x021d }
            boolean r1 = r1.B()     // Catch:{ all -> 0x021d }
            if (r1 != 0) goto L_0x0096
            com.google.android.gms.measurement.internal.zzgi r0 = r25.m()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.K()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "Network not connected, ignoring upload request"
            r0.a(r1)     // Catch:{ all -> 0x002f }
            r25.Q()     // Catch:{ all -> 0x002f }
            r8.f26921v = r9
            r25.O()
            return
        L_0x0096:
            com.google.android.gms.common.util.Clock r1 = r25.b()     // Catch:{ all -> 0x021d }
            long r1 = r1.a()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzah r5 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.V     // Catch:{ all -> 0x021d }
            r7 = 0
            int r5 = r5.y(r7, r6)     // Catch:{ all -> 0x021d }
            r25.i0()     // Catch:{ all -> 0x021d }
            long r10 = com.google.android.gms.measurement.internal.zzah.M()     // Catch:{ all -> 0x021d }
            long r10 = r1 - r10
            r6 = r9
        L_0x00b3:
            if (r6 >= r5) goto L_0x00be
            boolean r12 = r8.N(r7, r10)     // Catch:{ all -> 0x002f }
            if (r12 == 0) goto L_0x00be
            int r6 = r6 + 1
            goto L_0x00b3
        L_0x00be:
            boolean r5 = com.google.android.gms.internal.measurement.zzrl.a()     // Catch:{ all -> 0x021d }
            if (r5 == 0) goto L_0x00c7
            r25.P()     // Catch:{ all -> 0x002f }
        L_0x00c7:
            com.google.android.gms.measurement.internal.zzms r5 = r8.f26908i     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzgz r5 = r5.f26838h     // Catch:{ all -> 0x021d }
            long r5 = r5.a()     // Catch:{ all -> 0x021d }
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.zzgi r3 = r25.m()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.F()     // Catch:{ all -> 0x002f }
            java.lang.String r4 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x002f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x002f }
            r3.b(r4, r5)     // Catch:{ all -> 0x002f }
        L_0x00ea:
            com.google.android.gms.measurement.internal.zzam r3 = r25.l0()     // Catch:{ all -> 0x021d }
            java.lang.String r6 = r3.C()     // Catch:{ all -> 0x021d }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x021d }
            r4 = -1
            if (r3 != 0) goto L_0x05e6
            long r10 = r8.f26898A     // Catch:{ all -> 0x021d }
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x010a
            com.google.android.gms.measurement.internal.zzam r3 = r25.l0()     // Catch:{ all -> 0x002f }
            long r3 = r3.y()     // Catch:{ all -> 0x002f }
            r8.f26898A = r3     // Catch:{ all -> 0x002f }
        L_0x010a:
            com.google.android.gms.measurement.internal.zzah r3 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r4 = com.google.android.gms.measurement.internal.zzbj.f26266h     // Catch:{ all -> 0x021d }
            int r3 = r3.y(r6, r4)     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzah r4 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.f26267i     // Catch:{ all -> 0x021d }
            int r4 = r4.y(r6, r5)     // Catch:{ all -> 0x021d }
            int r4 = java.lang.Math.max(r9, r4)     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzam r5 = r25.l0()     // Catch:{ all -> 0x021d }
            java.util.List r3 = r5.Q(r6, r3, r4)     // Catch:{ all -> 0x021d }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x021d }
            if (r4 != 0) goto L_0x05ce
            com.google.android.gms.measurement.internal.zzjc r4 = r8.U(r6)     // Catch:{ all -> 0x021d }
            boolean r4 = r4.A()     // Catch:{ all -> 0x021d }
            if (r4 == 0) goto L_0x018d
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x002f }
        L_0x013e:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x015d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x002f }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x002f }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.measurement.zzgn$zzk r5 = (com.google.android.gms.internal.measurement.zzgn.zzk) r5     // Catch:{ all -> 0x002f }
            java.lang.String r10 = r5.l0()     // Catch:{ all -> 0x002f }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x002f }
            if (r10 != 0) goto L_0x013e
            java.lang.String r4 = r5.l0()     // Catch:{ all -> 0x002f }
            goto L_0x015e
        L_0x015d:
            r4 = r7
        L_0x015e:
            if (r4 == 0) goto L_0x018d
            r5 = r9
        L_0x0161:
            int r10 = r3.size()     // Catch:{ all -> 0x002f }
            if (r5 >= r10) goto L_0x018d
            java.lang.Object r10 = r3.get(r5)     // Catch:{ all -> 0x002f }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x002f }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.measurement.zzgn$zzk r10 = (com.google.android.gms.internal.measurement.zzgn.zzk) r10     // Catch:{ all -> 0x002f }
            java.lang.String r11 = r10.l0()     // Catch:{ all -> 0x002f }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x002f }
            if (r11 != 0) goto L_0x018a
            java.lang.String r10 = r10.l0()     // Catch:{ all -> 0x002f }
            boolean r10 = r10.equals(r4)     // Catch:{ all -> 0x002f }
            if (r10 != 0) goto L_0x018a
            java.util.List r3 = r3.subList(r9, r5)     // Catch:{ all -> 0x002f }
            goto L_0x018d
        L_0x018a:
            int r5 = r5 + 1
            goto L_0x0161
        L_0x018d:
            com.google.android.gms.internal.measurement.zzgn$zzj$zza r4 = com.google.android.gms.internal.measurement.zzgn.zzj.O()     // Catch:{ all -> 0x021d }
            int r5 = r3.size()     // Catch:{ all -> 0x021d }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x021d }
            int r11 = r3.size()     // Catch:{ all -> 0x021d }
            r10.<init>(r11)     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzah r11 = r25.i0()     // Catch:{ all -> 0x021d }
            boolean r11 = r11.P(r6)     // Catch:{ all -> 0x021d }
            if (r11 == 0) goto L_0x01b4
            com.google.android.gms.measurement.internal.zzjc r11 = r8.U(r6)     // Catch:{ all -> 0x002f }
            boolean r11 = r11.A()     // Catch:{ all -> 0x002f }
            if (r11 == 0) goto L_0x01b4
            r11 = r0
            goto L_0x01b5
        L_0x01b4:
            r11 = r9
        L_0x01b5:
            com.google.android.gms.measurement.internal.zzjc r12 = r8.U(r6)     // Catch:{ all -> 0x021d }
            boolean r12 = r12.A()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzjc r13 = r8.U(r6)     // Catch:{ all -> 0x021d }
            boolean r13 = r13.B()     // Catch:{ all -> 0x021d }
            boolean r14 = com.google.android.gms.internal.measurement.zzrq.a()     // Catch:{ all -> 0x021d }
            if (r14 == 0) goto L_0x01d9
            com.google.android.gms.measurement.internal.zzah r14 = r25.i0()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.zzfz r15 = com.google.android.gms.measurement.internal.zzbj.w0     // Catch:{ all -> 0x002f }
            boolean r14 = r14.H(r6, r15)     // Catch:{ all -> 0x002f }
            if (r14 == 0) goto L_0x01d9
            r14 = r0
            goto L_0x01da
        L_0x01d9:
            r14 = r9
        L_0x01da:
            com.google.android.gms.measurement.internal.zznq r15 = r8.f26909j     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzns r16 = r15.u(r6)     // Catch:{ all -> 0x021d }
            r15 = r9
        L_0x01e1:
            if (r15 >= r5) goto L_0x0391
            java.lang.Object r17 = r3.get(r15)     // Catch:{ all -> 0x021d }
            r7 = r17
            android.util.Pair r7 = (android.util.Pair) r7     // Catch:{ all -> 0x021d }
            java.lang.Object r7 = r7.first     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk r7 = (com.google.android.gms.internal.measurement.zzgn.zzk) r7     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc$zzb r7 = r7.z()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r7 = (com.google.android.gms.internal.measurement.zzgn.zzk.zza) r7     // Catch:{ all -> 0x021d }
            java.lang.Object r17 = r3.get(r15)     // Catch:{ all -> 0x021d }
            r0 = r17
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x021d }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x021d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x021d }
            r10.add(r0)     // Catch:{ all -> 0x021d }
            r25.i0()     // Catch:{ all -> 0x021d }
            r0 = r10
            r9 = 102001(0x18e71, double:5.0395E-319)
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r9 = r7.a1(r9)     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r9 = r9.V0(r1)     // Catch:{ all -> 0x021d }
            r10 = 0
            r9.r0(r10)     // Catch:{ all -> 0x021d }
            if (r11 != 0) goto L_0x0221
            r7.T0()     // Catch:{ all -> 0x021d }
            goto L_0x0221
        L_0x021d:
            r0 = move-exception
            r1 = 0
            goto L_0x0612
        L_0x0221:
            if (r12 != 0) goto L_0x0229
            r7.l1()     // Catch:{ all -> 0x021d }
            r7.f1()     // Catch:{ all -> 0x021d }
        L_0x0229:
            if (r13 != 0) goto L_0x022e
            r7.H0()     // Catch:{ all -> 0x021d }
        L_0x022e:
            r8.D(r6, r7)     // Catch:{ all -> 0x021d }
            if (r14 != 0) goto L_0x0236
            r7.n1()     // Catch:{ all -> 0x021d }
        L_0x0236:
            boolean r9 = com.google.android.gms.internal.measurement.zzpd.a()     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x024d
            com.google.android.gms.measurement.internal.zzah r9 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.e1     // Catch:{ all -> 0x021d }
            boolean r9 = r9.t(r10)     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x024d
            if (r13 != 0) goto L_0x024d
            r7.L0()     // Catch:{ all -> 0x021d }
        L_0x024d:
            boolean r9 = com.google.android.gms.internal.measurement.zzpo.a()     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x0329
            com.google.android.gms.measurement.internal.zzah r9 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.S0     // Catch:{ all -> 0x021d }
            boolean r9 = r9.t(r10)     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x0329
            java.lang.String r9 = r7.x1()     // Catch:{ all -> 0x021d }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x021d }
            if (r10 != 0) goto L_0x027e
            java.lang.String r10 = "00000000-0000-0000-0000-000000000000"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x0272
            goto L_0x027e
        L_0x0272:
            r18 = r3
            r19 = r11
            r23 = r12
            r22 = r13
            r24 = r14
            goto L_0x0322
        L_0x027e:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x021d }
            java.util.List r10 = r7.U()     // Catch:{ all -> 0x021d }
            r9.<init>(r10)     // Catch:{ all -> 0x021d }
            java.util.Iterator r10 = r9.iterator()     // Catch:{ all -> 0x021d }
            r18 = r3
            r19 = r11
            r3 = 0
            r11 = 0
            r20 = 0
            r21 = 0
        L_0x0295:
            boolean r22 = r10.hasNext()     // Catch:{ all -> 0x021d }
            if (r22 == 0) goto L_0x030a
            java.lang.Object r22 = r10.next()     // Catch:{ all -> 0x021d }
            r23 = r12
            r12 = r22
            com.google.android.gms.internal.measurement.zzgn$zzf r12 = (com.google.android.gms.internal.measurement.zzgn.zzf) r12     // Catch:{ all -> 0x021d }
            r22 = r13
            java.lang.String r13 = "_fx"
            r24 = r14
            java.lang.String r14 = r12.Y()     // Catch:{ all -> 0x021d }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x021d }
            if (r13 == 0) goto L_0x02c3
            r10.remove()     // Catch:{ all -> 0x021d }
            r13 = r22
            r12 = r23
            r14 = r24
            r20 = 1
            r21 = 1
            goto L_0x0295
        L_0x02c3:
            java.lang.String r13 = "_f"
            java.lang.String r14 = r12.Y()     // Catch:{ all -> 0x021d }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x021d }
            if (r13 == 0) goto L_0x0303
            com.google.android.gms.measurement.internal.zzah r13 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r14 = com.google.android.gms.measurement.internal.zzbj.a1     // Catch:{ all -> 0x021d }
            boolean r13 = r13.t(r14)     // Catch:{ all -> 0x021d }
            if (r13 == 0) goto L_0x0301
            r25.x0()     // Catch:{ all -> 0x021d }
            java.lang.String r13 = "_pfo"
            com.google.android.gms.internal.measurement.zzgn$zzh r13 = com.google.android.gms.measurement.internal.zzol.F(r12, r13)     // Catch:{ all -> 0x021d }
            if (r13 == 0) goto L_0x02ee
            long r13 = r13.W()     // Catch:{ all -> 0x021d }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x021d }
        L_0x02ee:
            r25.x0()     // Catch:{ all -> 0x021d }
            java.lang.String r13 = "_uwa"
            com.google.android.gms.internal.measurement.zzgn$zzh r12 = com.google.android.gms.measurement.internal.zzol.F(r12, r13)     // Catch:{ all -> 0x021d }
            if (r12 == 0) goto L_0x0301
            long r11 = r12.W()     // Catch:{ all -> 0x021d }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x021d }
        L_0x0301:
            r21 = 1
        L_0x0303:
            r13 = r22
            r12 = r23
            r14 = r24
            goto L_0x0295
        L_0x030a:
            r23 = r12
            r22 = r13
            r24 = r14
            if (r20 == 0) goto L_0x0318
            r7.Z0()     // Catch:{ all -> 0x021d }
            r7.c0(r9)     // Catch:{ all -> 0x021d }
        L_0x0318:
            if (r21 == 0) goto L_0x0322
            java.lang.String r9 = r7.r1()     // Catch:{ all -> 0x021d }
            r10 = 1
            r8.H(r9, r10, r3, r11)     // Catch:{ all -> 0x021d }
        L_0x0322:
            int r3 = r7.g0()     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x037f
            goto L_0x0333
        L_0x0329:
            r18 = r3
            r19 = r11
            r23 = r12
            r22 = r13
            r24 = r14
        L_0x0333:
            com.google.android.gms.measurement.internal.zzah r3 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r9 = com.google.android.gms.measurement.internal.zzbj.m0     // Catch:{ all -> 0x021d }
            boolean r3 = r3.H(r6, r9)     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x0356
            com.google.android.gms.internal.measurement.zzml r3 = r7.F()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc r3 = (com.google.android.gms.internal.measurement.zzlc) r3     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk r3 = (com.google.android.gms.internal.measurement.zzgn.zzk) r3     // Catch:{ all -> 0x021d }
            byte[] r3 = r3.m()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzol r9 = r25.x0()     // Catch:{ all -> 0x021d }
            long r9 = r9.A(r3)     // Catch:{ all -> 0x021d }
            r7.I(r9)     // Catch:{ all -> 0x021d }
        L_0x0356:
            boolean r3 = com.google.android.gms.internal.measurement.zzrw.a()     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x037c
            com.google.android.gms.measurement.internal.zzah r3 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r9 = com.google.android.gms.measurement.internal.zzbj.x0     // Catch:{ all -> 0x021d }
            boolean r3 = r3.t(r9)     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x037c
            r25.y0()     // Catch:{ all -> 0x021d }
            boolean r3 = com.google.android.gms.measurement.internal.zzop.H0(r6)     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x037c
            com.google.android.gms.measurement.internal.zznt r3 = r16.a()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zznt r9 = com.google.android.gms.measurement.internal.zznt.SGTM     // Catch:{ all -> 0x021d }
            if (r3 != r9) goto L_0x037c
            r7.T0()     // Catch:{ all -> 0x021d }
        L_0x037c:
            r4.z(r7)     // Catch:{ all -> 0x021d }
        L_0x037f:
            int r15 = r15 + 1
            r10 = r0
            r3 = r18
            r11 = r19
            r13 = r22
            r12 = r23
            r14 = r24
            r0 = 1
            r7 = 0
            r9 = 0
            goto L_0x01e1
        L_0x0391:
            r0 = r10
            boolean r3 = com.google.android.gms.internal.measurement.zzpo.a()     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x03c2
            com.google.android.gms.measurement.internal.zzah r3 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r7 = com.google.android.gms.measurement.internal.zzbj.S0     // Catch:{ all -> 0x021d }
            boolean r3 = r3.t(r7)     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x03c2
            int r3 = r4.y()     // Catch:{ all -> 0x021d }
            if (r3 != 0) goto L_0x03c2
            r8.I(r0)     // Catch:{ all -> 0x021d }
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ all -> 0x021d }
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r1 = r25
            r1.K(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x021d }
            r1 = 0
            r8.f26921v = r1
            r25.O()
            return
        L_0x03c2:
            com.google.android.gms.internal.measurement.zzml r3 = r4.F()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc r3 = (com.google.android.gms.internal.measurement.zzlc) r3     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzj r3 = (com.google.android.gms.internal.measurement.zzgn.zzj) r3     // Catch:{ all -> 0x021d }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x021d }
            r7.<init>()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzah r9 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.x0     // Catch:{ all -> 0x021d }
            boolean r9 = r9.t(r10)     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x056b
            r25.y0()     // Catch:{ all -> 0x021d }
            boolean r9 = com.google.android.gms.measurement.internal.zzop.H0(r6)     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x056b
            com.google.android.gms.measurement.internal.zznt r9 = r16.a()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zznt r10 = com.google.android.gms.measurement.internal.zznt.SGTM     // Catch:{ all -> 0x021d }
            if (r9 != r10) goto L_0x056b
            com.google.android.gms.internal.measurement.zzml r3 = r4.F()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc r3 = (com.google.android.gms.internal.measurement.zzlc) r3     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzj r3 = (com.google.android.gms.internal.measurement.zzgn.zzj) r3     // Catch:{ all -> 0x021d }
            java.util.List r3 = r3.V()     // Catch:{ all -> 0x021d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021d }
        L_0x03fc:
            boolean r9 = r3.hasNext()     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x0417
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = (com.google.android.gms.internal.measurement.zzgn.zzk) r9     // Catch:{ all -> 0x021d }
            boolean r9 = r9.O0()     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x03fc
            java.util.UUID r3 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x021d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x021d }
            goto L_0x0418
        L_0x0417:
            r3 = 0
        L_0x0418:
            com.google.android.gms.internal.measurement.zzml r9 = r4.F()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc r9 = (com.google.android.gms.internal.measurement.zzlc) r9     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzj r9 = (com.google.android.gms.internal.measurement.zzgn.zzj) r9     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzhp r10 = r25.f()     // Catch:{ all -> 0x021d }
            r10.n()     // Catch:{ all -> 0x021d }
            r25.A0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzj$zza r10 = com.google.android.gms.internal.measurement.zzgn.zzj.J(r9)     // Catch:{ all -> 0x021d }
            boolean r11 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x021d }
            if (r11 != 0) goto L_0x0437
            r10.G(r3)     // Catch:{ all -> 0x021d }
        L_0x0437:
            com.google.android.gms.measurement.internal.zzhg r11 = r25.r0()     // Catch:{ all -> 0x021d }
            java.lang.String r11 = r11.R(r6)     // Catch:{ all -> 0x021d }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x021d }
            if (r12 != 0) goto L_0x0448
            r10.J(r11)     // Catch:{ all -> 0x021d }
        L_0x0448:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x021d }
            r11.<init>()     // Catch:{ all -> 0x021d }
            java.util.List r9 = r9.V()     // Catch:{ all -> 0x021d }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x021d }
        L_0x0455:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x021d }
            if (r12 == 0) goto L_0x0474
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk r12 = (com.google.android.gms.internal.measurement.zzgn.zzk) r12     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r12 = com.google.android.gms.internal.measurement.zzgn.zzk.K(r12)     // Catch:{ all -> 0x021d }
            r12.T0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzml r12 = r12.F()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc r12 = (com.google.android.gms.internal.measurement.zzlc) r12     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk r12 = (com.google.android.gms.internal.measurement.zzgn.zzk) r12     // Catch:{ all -> 0x021d }
            r11.add(r12)     // Catch:{ all -> 0x021d }
            goto L_0x0455
        L_0x0474:
            r10.I()     // Catch:{ all -> 0x021d }
            r10.B(r11)     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzgi r9 = r25.m()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzgk r9 = r9.K()     // Catch:{ all -> 0x021d }
            java.lang.String r11 = "Processed MeasurementBatch for sGTM with sgtmJoinId"
            java.lang.String r12 = r10.K()     // Catch:{ all -> 0x021d }
            r9.b(r11, r12)     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzml r9 = r10.F()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc r9 = (com.google.android.gms.internal.measurement.zzlc) r9     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzj r9 = (com.google.android.gms.internal.measurement.zzgn.zzj) r9     // Catch:{ all -> 0x021d }
            boolean r10 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x021d }
            if (r10 != 0) goto L_0x0568
            com.google.android.gms.measurement.internal.zzah r10 = r25.i0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r11 = com.google.android.gms.measurement.internal.zzbj.B0     // Catch:{ all -> 0x021d }
            boolean r10 = r10.t(r11)     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x0568
            com.google.android.gms.internal.measurement.zzml r10 = r4.F()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc r10 = (com.google.android.gms.internal.measurement.zzlc) r10     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzj r10 = (com.google.android.gms.internal.measurement.zzgn.zzj) r10     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzhp r11 = r25.f()     // Catch:{ all -> 0x021d }
            r11.n()     // Catch:{ all -> 0x021d }
            r25.A0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzj$zza r11 = com.google.android.gms.internal.measurement.zzgn.zzj.O()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzgi r12 = r25.m()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzgk r12 = r12.K()     // Catch:{ all -> 0x021d }
            java.lang.String r13 = "Processing Google Signal, sgtmJoinId"
            java.lang.String r14 = r10.T()     // Catch:{ all -> 0x021d }
            r12.b(r13, r14)     // Catch:{ all -> 0x021d }
            r11.G(r3)     // Catch:{ all -> 0x021d }
            java.util.List r3 = r10.V()     // Catch:{ all -> 0x021d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021d }
        L_0x04d7:
            boolean r10 = r3.hasNext()     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x04fb
            java.lang.Object r10 = r3.next()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk r10 = (com.google.android.gms.internal.measurement.zzgn.zzk) r10     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r12 = com.google.android.gms.internal.measurement.zzgn.zzk.z2()     // Catch:{ all -> 0x021d }
            java.lang.String r13 = r10.f0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r12 = r12.S0(r13)     // Catch:{ all -> 0x021d }
            int r10 = r10.o1()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r10 = r12.D0(r10)     // Catch:{ all -> 0x021d }
            r11.z(r10)     // Catch:{ all -> 0x021d }
            goto L_0x04d7
        L_0x04fb:
            com.google.android.gms.internal.measurement.zzml r3 = r11.F()     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzlc r3 = (com.google.android.gms.internal.measurement.zzlc) r3     // Catch:{ all -> 0x021d }
            com.google.android.gms.internal.measurement.zzgn$zzj r3 = (com.google.android.gms.internal.measurement.zzgn.zzj) r3     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zznq r10 = r8.f26909j     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzhg r10 = r10.r()     // Catch:{ all -> 0x021d }
            java.lang.String r10 = r10.R(r6)     // Catch:{ all -> 0x021d }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x021d }
            if (r11 != 0) goto L_0x0550
            com.google.android.gms.measurement.internal.zzfz r11 = com.google.android.gms.measurement.internal.zzbj.f26277s     // Catch:{ all -> 0x021d }
            r12 = 0
            java.lang.Object r11 = r11.a(r12)     // Catch:{ all -> 0x021d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x021d }
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x021d }
            android.net.Uri$Builder r12 = r11.buildUpon()     // Catch:{ all -> 0x021d }
            java.lang.String r11 = r11.getAuthority()     // Catch:{ all -> 0x021d }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x021d }
            r13.<init>()     // Catch:{ all -> 0x021d }
            r13.append(r10)     // Catch:{ all -> 0x021d }
            java.lang.String r10 = "."
            r13.append(r10)     // Catch:{ all -> 0x021d }
            r13.append(r11)     // Catch:{ all -> 0x021d }
            java.lang.String r10 = r13.toString()     // Catch:{ all -> 0x021d }
            r12.authority(r10)     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzns r10 = new com.google.android.gms.measurement.internal.zzns     // Catch:{ all -> 0x021d }
            android.net.Uri r11 = r12.build()     // Catch:{ all -> 0x021d }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zznt r12 = com.google.android.gms.measurement.internal.zznt.GOOGLE_SIGNAL     // Catch:{ all -> 0x021d }
            r10.<init>(r11, r12)     // Catch:{ all -> 0x021d }
            r12 = 0
            goto L_0x0560
        L_0x0550:
            com.google.android.gms.measurement.internal.zzns r10 = new com.google.android.gms.measurement.internal.zzns     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzfz r11 = com.google.android.gms.measurement.internal.zzbj.f26277s     // Catch:{ all -> 0x021d }
            r12 = 0
            java.lang.Object r11 = r11.a(r12)     // Catch:{ all -> 0x021d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zznt r13 = com.google.android.gms.measurement.internal.zznt.GOOGLE_SIGNAL     // Catch:{ all -> 0x021d }
            r10.<init>(r11, r13)     // Catch:{ all -> 0x021d }
        L_0x0560:
            android.util.Pair r3 = android.util.Pair.create(r3, r10)     // Catch:{ all -> 0x021d }
            r7.add(r3)     // Catch:{ all -> 0x021d }
            goto L_0x0569
        L_0x0568:
            r12 = 0
        L_0x0569:
            r3 = r9
            goto L_0x056c
        L_0x056b:
            r12 = 0
        L_0x056c:
            com.google.android.gms.measurement.internal.zzgi r9 = r25.m()     // Catch:{ all -> 0x021d }
            r10 = 2
            boolean r9 = r9.C(r10)     // Catch:{ all -> 0x021d }
            if (r9 == 0) goto L_0x0580
            com.google.android.gms.measurement.internal.zzol r9 = r25.x0()     // Catch:{ all -> 0x021d }
            java.lang.String r9 = r9.M(r3)     // Catch:{ all -> 0x021d }
            goto L_0x0581
        L_0x0580:
            r9 = r12
        L_0x0581:
            r25.x0()     // Catch:{ all -> 0x021d }
            byte[] r13 = r3.m()     // Catch:{ all -> 0x021d }
            r8.I(r0)     // Catch:{ MalformedURLException -> 0x05d0 }
            com.google.android.gms.measurement.internal.zzms r0 = r8.f26908i     // Catch:{ MalformedURLException -> 0x05d0 }
            com.google.android.gms.measurement.internal.zzgz r0 = r0.f26839i     // Catch:{ MalformedURLException -> 0x05d0 }
            r0.b(r1)     // Catch:{ MalformedURLException -> 0x05d0 }
            java.lang.String r0 = "?"
            if (r5 <= 0) goto L_0x059f
            r1 = 0
            com.google.android.gms.internal.measurement.zzgn$zzk r0 = r4.H(r1)     // Catch:{ MalformedURLException -> 0x05d0 }
            java.lang.String r0 = r0.C2()     // Catch:{ MalformedURLException -> 0x05d0 }
        L_0x059f:
            com.google.android.gms.measurement.internal.zzgi r1 = r25.m()     // Catch:{ MalformedURLException -> 0x05d0 }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()     // Catch:{ MalformedURLException -> 0x05d0 }
            java.lang.String r2 = "Uploading data. app, uncompressed size, data"
            int r3 = r13.length     // Catch:{ MalformedURLException -> 0x05d0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ MalformedURLException -> 0x05d0 }
            r1.d(r2, r0, r3, r9)     // Catch:{ MalformedURLException -> 0x05d0 }
            r0 = 1
            r8.f26920u = r0     // Catch:{ MalformedURLException -> 0x05d0 }
            com.google.android.gms.measurement.internal.zzgp r10 = r25.p0()     // Catch:{ MalformedURLException -> 0x05d0 }
            java.net.URL r12 = new java.net.URL     // Catch:{ MalformedURLException -> 0x05d0 }
            java.lang.String r0 = r16.b()     // Catch:{ MalformedURLException -> 0x05d0 }
            r12.<init>(r0)     // Catch:{ MalformedURLException -> 0x05d0 }
            java.util.Map r14 = r16.c()     // Catch:{ MalformedURLException -> 0x05d0 }
            com.google.android.gms.measurement.internal.zznw r15 = new com.google.android.gms.measurement.internal.zznw     // Catch:{ MalformedURLException -> 0x05d0 }
            r15.<init>(r8, r6, r7)     // Catch:{ MalformedURLException -> 0x05d0 }
            r11 = r6
            r10.y(r11, r12, r13, r14, r15)     // Catch:{ MalformedURLException -> 0x05d0 }
        L_0x05ce:
            r1 = 0
            goto L_0x060c
        L_0x05d0:
            com.google.android.gms.measurement.internal.zzgi r0 = r25.m()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()     // Catch:{ all -> 0x021d }
            java.lang.String r1 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgi.v(r6)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = r16.b()     // Catch:{ all -> 0x021d }
            r0.c(r1, r2, r3)     // Catch:{ all -> 0x021d }
            goto L_0x05ce
        L_0x05e6:
            r8.f26898A = r4     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzam r0 = r25.l0()     // Catch:{ all -> 0x021d }
            r25.i0()     // Catch:{ all -> 0x021d }
            long r3 = com.google.android.gms.measurement.internal.zzah.M()     // Catch:{ all -> 0x021d }
            long r1 = r1 - r3
            java.lang.String r0 = r0.O(r1)     // Catch:{ all -> 0x021d }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x021d }
            if (r1 != 0) goto L_0x05ce
            com.google.android.gms.measurement.internal.zzam r1 = r25.l0()     // Catch:{ all -> 0x021d }
            com.google.android.gms.measurement.internal.zzh r0 = r1.L0(r0)     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x05ce
            r8.Z(r0)     // Catch:{ all -> 0x021d }
            goto L_0x05ce
        L_0x060c:
            r8.f26921v = r1
            r25.O()
            return
        L_0x0612:
            r8.f26921v = r1
            r25.O()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.E0():void");
    }

    public final void F(String str, zzlh zzlh) {
        f().n();
        String str2 = this.F;
        if (str2 == null || str2.equals(str) || zzlh != null) {
            this.F = str;
            this.E = zzlh;
        }
    }

    public final long F0() {
        long a2 = b().a();
        zzms zzms = this.f26908i;
        zzms.u();
        zzms.n();
        long a3 = zzms.f26840j.a();
        if (a3 == 0) {
            a3 = ((long) zzms.j().W0().nextInt(86400000)) + 1;
            zzms.f26840j.b(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    public final void G(String str, zzp zzp) {
        f().n();
        A0();
        if (s0(zzp)) {
            if (!zzp.G) {
                i(zzp);
                return;
            }
            Boolean q0 = q0(zzp);
            if (!"_npa".equals(str) || q0 == null) {
                m().F().b("Removing user property", this.f26911l.D().g(str));
                l0().b1();
                try {
                    i(zzp);
                    if ("_id".equals(str)) {
                        l0().S0((String) Preconditions.m(zzp.f26977z), "_lair");
                    }
                    l0().S0((String) Preconditions.m(zzp.f26977z), str);
                    l0().i1();
                    m().F().b("User property removed", this.f26911l.D().g(str));
                    l0().g1();
                } catch (Throwable th) {
                    l0().g1();
                    throw th;
                }
            } else {
                m().F().a("Falling back to manifest metadata value for ad personalization");
                y(new zzok("_npa", b().a(), Long.valueOf(q0.booleanValue() ? 1 : 0), "auto"), zzp);
            }
        }
    }

    public final zzgs G0() {
        zzgs zzgs = this.f26903d;
        if (zzgs != null) {
            return zzgs;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final void H(String str, boolean z2, Long l2, Long l3) {
        zzh L0 = l0().L0(str);
        if (L0 != null) {
            L0.T(z2);
            L0.e(l2);
            L0.I(l3);
            if (L0.B()) {
                l0().V(L0, false, false);
            }
        }
    }

    public final zznm H0() {
        return (zznm) k(this.f26904e);
    }

    public final void J(boolean z2) {
        Q();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[Catch:{ all -> 0x0105, SQLiteException -> 0x005b, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d5 A[Catch:{ all -> 0x0105, SQLiteException -> 0x005b, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112 A[Catch:{ all -> 0x0105, SQLiteException -> 0x005b, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0183 A[Catch:{ all -> 0x0105, SQLiteException -> 0x005b, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0187 A[Catch:{ all -> 0x0105, SQLiteException -> 0x005b, all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(boolean r15, int r16, java.lang.Throwable r17, byte[] r18, java.lang.String r19, java.util.List r20) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r2 = r17
            r8 = r19
            com.google.android.gms.measurement.internal.zzhp r3 = r14.f()
            r3.n()
            r14.A0()
            r9 = 0
            if (r18 != 0) goto L_0x001a
            byte[] r3 = new byte[r9]     // Catch:{ all -> 0x0017 }
            goto L_0x001c
        L_0x0017:
            r0 = move-exception
            goto L_0x022f
        L_0x001a:
            r3 = r18
        L_0x001c:
            java.util.List r4 = r1.f26924y     // Catch:{ all -> 0x0017 }
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.m(r4)     // Catch:{ all -> 0x0017 }
            r10 = r4
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0017 }
            r11 = 0
            r1.f26924y = r11     // Catch:{ all -> 0x0017 }
            boolean r4 = com.google.android.gms.internal.measurement.zzpo.a()     // Catch:{ all -> 0x0017 }
            if (r4 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.zzah r4 = r14.i0()     // Catch:{ all -> 0x0017 }
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.S0     // Catch:{ all -> 0x0017 }
            boolean r4 = r4.t(r5)     // Catch:{ all -> 0x0017 }
            if (r4 == 0) goto L_0x003c
            if (r15 == 0) goto L_0x0046
        L_0x003c:
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto L_0x0044
            r4 = 204(0xcc, float:2.86E-43)
            if (r0 != r4) goto L_0x01e8
        L_0x0044:
            if (r2 != 0) goto L_0x01e8
        L_0x0046:
            boolean r2 = com.google.android.gms.internal.measurement.zzpo.a()     // Catch:{ SQLiteException -> 0x005b }
            if (r2 == 0) goto L_0x005e
            com.google.android.gms.measurement.internal.zzah r2 = r14.i0()     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzfz r4 = com.google.android.gms.measurement.internal.zzbj.S0     // Catch:{ SQLiteException -> 0x005b }
            boolean r2 = r2.t(r4)     // Catch:{ SQLiteException -> 0x005b }
            if (r2 == 0) goto L_0x005e
            if (r15 == 0) goto L_0x006d
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            goto L_0x01bd
        L_0x005e:
            com.google.android.gms.measurement.internal.zzms r2 = r1.f26908i     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzgz r2 = r2.f26838h     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.common.util.Clock r4 = r14.b()     // Catch:{ SQLiteException -> 0x005b }
            long r4 = r4.a()     // Catch:{ SQLiteException -> 0x005b }
            r2.b(r4)     // Catch:{ SQLiteException -> 0x005b }
        L_0x006d:
            com.google.android.gms.measurement.internal.zzms r2 = r1.f26908i     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzgz r2 = r2.f26839i     // Catch:{ SQLiteException -> 0x005b }
            r12 = 0
            r2.b(r12)     // Catch:{ SQLiteException -> 0x005b }
            r14.Q()     // Catch:{ SQLiteException -> 0x005b }
            boolean r2 = com.google.android.gms.internal.measurement.zzpo.a()     // Catch:{ SQLiteException -> 0x005b }
            if (r2 == 0) goto L_0x00ac
            com.google.android.gms.measurement.internal.zzah r2 = r14.i0()     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzfz r4 = com.google.android.gms.measurement.internal.zzbj.S0     // Catch:{ SQLiteException -> 0x005b }
            boolean r2 = r2.t(r4)     // Catch:{ SQLiteException -> 0x005b }
            if (r2 == 0) goto L_0x00ac
            if (r15 == 0) goto L_0x008e
            goto L_0x00ac
        L_0x008e:
            boolean r0 = com.google.android.gms.internal.measurement.zzpo.a()     // Catch:{ SQLiteException -> 0x005b }
            if (r0 == 0) goto L_0x00c2
            com.google.android.gms.measurement.internal.zzah r0 = r14.i0()     // Catch:{ SQLiteException -> 0x005b }
            boolean r0 = r0.t(r4)     // Catch:{ SQLiteException -> 0x005b }
            if (r0 == 0) goto L_0x00c2
            com.google.android.gms.measurement.internal.zzgi r0 = r14.m()     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.K()     // Catch:{ SQLiteException -> 0x005b }
            java.lang.String r2 = "Purged empty bundles"
            r0.a(r2)     // Catch:{ SQLiteException -> 0x005b }
            goto L_0x00c2
        L_0x00ac:
            com.google.android.gms.measurement.internal.zzgi r2 = r14.m()     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.K()     // Catch:{ SQLiteException -> 0x005b }
            java.lang.String r4 = "Successful upload. Got network response. code, size"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x005b }
            int r3 = r3.length     // Catch:{ SQLiteException -> 0x005b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x005b }
            r2.c(r4, r0, r3)     // Catch:{ SQLiteException -> 0x005b }
        L_0x00c2:
            com.google.android.gms.measurement.internal.zzam r0 = r14.l0()     // Catch:{ SQLiteException -> 0x005b }
            r0.b1()     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzah r0 = r14.i0()     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.A0     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.t(r2)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0108
            java.util.Iterator r0 = r20.iterator()     // Catch:{ all -> 0x0105 }
        L_0x00d9:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0105 }
            if (r2 == 0) goto L_0x0108
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0105 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0105 }
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x0105 }
            r4 = r3
            com.google.android.gms.internal.measurement.zzgn$zzj r4 = (com.google.android.gms.internal.measurement.zzgn.zzj) r4     // Catch:{ all -> 0x0105 }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.zzns r2 = (com.google.android.gms.measurement.internal.zzns) r2     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.zzam r3 = r14.l0()     // Catch:{ all -> 0x0105 }
            java.lang.String r5 = r2.b()     // Catch:{ all -> 0x0105 }
            java.util.Map r6 = r2.c()     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.zznt r7 = r2.a()     // Catch:{ all -> 0x0105 }
            r2 = r3
            r3 = r19
            r2.l0(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0105 }
            goto L_0x00d9
        L_0x0105:
            r0 = move-exception
            goto L_0x01b5
        L_0x0108:
            java.util.Iterator r2 = r10.iterator()     // Catch:{ all -> 0x0105 }
        L_0x010c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0105 }
            r3 = r0
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.zzam r4 = r14.l0()     // Catch:{ SQLiteException -> 0x0156 }
            long r5 = r3.longValue()     // Catch:{ SQLiteException -> 0x0156 }
            r4.n()     // Catch:{ SQLiteException -> 0x0156 }
            r4.u()     // Catch:{ SQLiteException -> 0x0156 }
            android.database.sqlite.SQLiteDatabase r0 = r4.B()     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r6 = "queue"
            java.lang.String r7 = "rowid=?"
            int r0 = r0.delete(r6, r7, r5)     // Catch:{ SQLiteException -> 0x0147 }
            r5 = 1
            if (r0 != r5) goto L_0x013f
            goto L_0x010c
        L_0x013f:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0147 }
            java.lang.String r5 = "Deleted fewer rows from queue than expected"
            r0.<init>(r5)     // Catch:{ SQLiteException -> 0x0147 }
            throw r0     // Catch:{ SQLiteException -> 0x0147 }
        L_0x0147:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r4 = r4.m()     // Catch:{ SQLiteException -> 0x0156 }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r5 = "Failed to delete a bundle in a queue table"
            r4.b(r5, r0)     // Catch:{ SQLiteException -> 0x0156 }
            throw r0     // Catch:{ SQLiteException -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            java.util.List r4 = r1.f26925z     // Catch:{ all -> 0x0105 }
            if (r4 == 0) goto L_0x0162
            boolean r3 = r4.contains(r3)     // Catch:{ all -> 0x0105 }
            if (r3 == 0) goto L_0x0162
            goto L_0x010c
        L_0x0162:
            throw r0     // Catch:{ all -> 0x0105 }
        L_0x0163:
            com.google.android.gms.measurement.internal.zzam r0 = r14.l0()     // Catch:{ all -> 0x0105 }
            r0.i1()     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.zzam r0 = r14.l0()     // Catch:{ SQLiteException -> 0x005b }
            r0.g1()     // Catch:{ SQLiteException -> 0x005b }
            r1.f26925z = r11     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzgp r0 = r14.p0()     // Catch:{ SQLiteException -> 0x005b }
            boolean r0 = r0.B()     // Catch:{ SQLiteException -> 0x005b }
            if (r0 == 0) goto L_0x0187
            boolean r0 = r14.R()     // Catch:{ SQLiteException -> 0x005b }
            if (r0 == 0) goto L_0x0187
            r14.E0()     // Catch:{ SQLiteException -> 0x005b }
            goto L_0x01b2
        L_0x0187:
            com.google.android.gms.measurement.internal.zzah r0 = r14.i0()     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.A0     // Catch:{ SQLiteException -> 0x005b }
            boolean r0 = r0.t(r2)     // Catch:{ SQLiteException -> 0x005b }
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.measurement.internal.zzgp r0 = r14.p0()     // Catch:{ SQLiteException -> 0x005b }
            boolean r0 = r0.B()     // Catch:{ SQLiteException -> 0x005b }
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.measurement.internal.zzam r0 = r14.l0()     // Catch:{ SQLiteException -> 0x005b }
            boolean r0 = r0.f1(r8)     // Catch:{ SQLiteException -> 0x005b }
            if (r0 == 0) goto L_0x01ab
            r14.k0(r8)     // Catch:{ SQLiteException -> 0x005b }
            goto L_0x01b2
        L_0x01ab:
            r2 = -1
            r1.f26898A = r2     // Catch:{ SQLiteException -> 0x005b }
            r14.Q()     // Catch:{ SQLiteException -> 0x005b }
        L_0x01b2:
            r1.f26914o = r12     // Catch:{ SQLiteException -> 0x005b }
            goto L_0x0229
        L_0x01b5:
            com.google.android.gms.measurement.internal.zzam r2 = r14.l0()     // Catch:{ SQLiteException -> 0x005b }
            r2.g1()     // Catch:{ SQLiteException -> 0x005b }
            throw r0     // Catch:{ SQLiteException -> 0x005b }
        L_0x01bd:
            com.google.android.gms.measurement.internal.zzgi r2 = r14.m()     // Catch:{ all -> 0x0017 }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.G()     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "Database error while trying to delete uploaded bundles"
            r2.b(r3, r0)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.common.util.Clock r0 = r14.b()     // Catch:{ all -> 0x0017 }
            long r2 = r0.c()     // Catch:{ all -> 0x0017 }
            r1.f26914o = r2     // Catch:{ all -> 0x0017 }
            com.google.android.gms.measurement.internal.zzgi r0 = r14.m()     // Catch:{ all -> 0x0017 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.K()     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "Disable upload, time"
            long r3 = r1.f26914o     // Catch:{ all -> 0x0017 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0017 }
            r0.b(r2, r3)     // Catch:{ all -> 0x0017 }
            goto L_0x0229
        L_0x01e8:
            com.google.android.gms.measurement.internal.zzgi r3 = r14.m()     // Catch:{ all -> 0x0017 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.K()     // Catch:{ all -> 0x0017 }
            java.lang.String r4 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0017 }
            r3.c(r4, r5, r2)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.measurement.internal.zzms r2 = r1.f26908i     // Catch:{ all -> 0x0017 }
            com.google.android.gms.measurement.internal.zzgz r2 = r2.f26839i     // Catch:{ all -> 0x0017 }
            com.google.android.gms.common.util.Clock r3 = r14.b()     // Catch:{ all -> 0x0017 }
            long r3 = r3.a()     // Catch:{ all -> 0x0017 }
            r2.b(r3)     // Catch:{ all -> 0x0017 }
            r2 = 503(0x1f7, float:7.05E-43)
            if (r0 == r2) goto L_0x0210
            r2 = 429(0x1ad, float:6.01E-43)
            if (r0 != r2) goto L_0x021f
        L_0x0210:
            com.google.android.gms.measurement.internal.zzms r0 = r1.f26908i     // Catch:{ all -> 0x0017 }
            com.google.android.gms.measurement.internal.zzgz r0 = r0.f26837g     // Catch:{ all -> 0x0017 }
            com.google.android.gms.common.util.Clock r2 = r14.b()     // Catch:{ all -> 0x0017 }
            long r2 = r2.a()     // Catch:{ all -> 0x0017 }
            r0.b(r2)     // Catch:{ all -> 0x0017 }
        L_0x021f:
            com.google.android.gms.measurement.internal.zzam r0 = r14.l0()     // Catch:{ all -> 0x0017 }
            r0.c0(r10)     // Catch:{ all -> 0x0017 }
            r14.Q()     // Catch:{ all -> 0x0017 }
        L_0x0229:
            r1.f26920u = r9
            r14.O()
            return
        L_0x022f:
            r1.f26920u = r9
            r14.O()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.K(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final boolean L(int i2, FileChannel fileChannel) {
        f().n();
        if (fileChannel == null || !fileChannel.isOpen()) {
            m().G().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                m().G().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            m().G().b("Failed to write to channel", e2);
            return false;
        }
    }

    public final boolean M(zzgn.zzf.zza zza2, zzgn.zzf.zza zza3) {
        Preconditions.a("_e".equals(zza2.T()));
        x0();
        zzgn.zzh F2 = zzol.F((zzgn.zzf) ((zzlc) zza2.F()), "_sc");
        String str = null;
        String b0 = F2 == null ? null : F2.b0();
        x0();
        zzgn.zzh F3 = zzol.F((zzgn.zzf) ((zzlc) zza3.F()), "_pc");
        if (F3 != null) {
            str = F3.b0();
        }
        if (str == null || !str.equals(b0)) {
            return false;
        }
        Preconditions.a("_e".equals(zza2.T()));
        x0();
        zzgn.zzh F4 = zzol.F((zzgn.zzf) ((zzlc) zza2.F()), "_et");
        if (F4 == null || !F4.f0() || F4.W() <= 0) {
            return true;
        }
        long W = F4.W();
        x0();
        zzgn.zzh F5 = zzol.F((zzgn.zzf) ((zzlc) zza3.F()), "_et");
        if (F5 != null && F5.W() > 0) {
            W += F5.W();
        }
        x0();
        zzol.T(zza3, "_et", Long.valueOf(W));
        x0();
        zzol.T(zza2, "_fr", 1L);
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v50 */
    /* JADX WARNING: type inference failed for: r10v71 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r1 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r9 = r43;
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r0 = e;
        r10 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0232 A[SYNTHETIC, Splitter:B:114:0x0232] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0239 A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }, ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }]), Splitter:B:4:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x058a A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x064f A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x069c A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0708 A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x080d A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0cff A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0d24 A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0f77 A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x0f7b A[Catch:{ IOException -> 0x0205, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x1093 A[SYNTHETIC, Splitter:B:582:0x1093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean N(java.lang.String r43, long r44) {
        /*
            r42 = this;
            r1 = r42
            java.lang.String r2 = "_ai"
            java.lang.String r3 = "items"
            com.google.android.gms.measurement.internal.zzam r4 = r42.l0()
            r4.b1()
            com.google.android.gms.measurement.internal.zznv$zza r4 = new com.google.android.gms.measurement.internal.zznv$zza     // Catch:{ all -> 0x007f }
            r5 = 0
            r4.<init>()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r6 = r42.l0()     // Catch:{ all -> 0x007f }
            long r7 = r1.f26898A     // Catch:{ all -> 0x007f }
            com.google.android.gms.common.internal.Preconditions.m(r4)     // Catch:{ all -> 0x007f }
            r6.n()     // Catch:{ all -> 0x007f }
            r6.u()     // Catch:{ all -> 0x007f }
            r10 = -1
            r12 = 1
            r13 = 0
            android.database.sqlite.SQLiteDatabase r15 = r6.B()     // Catch:{ SQLiteException -> 0x00b0, all -> 0x0043 }
            boolean r14 = android.text.TextUtils.isEmpty(r43)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x0043 }
            java.lang.String r16 = ""
            if (r14 == 0) goto L_0x009c
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 == 0) goto L_0x004f
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r9 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String[] r5 = new java.lang.String[]{r5, r9}     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            goto L_0x0057
        L_0x0043:
            r0 = move-exception
            r1 = r0
            r5 = 0
            goto L_0x1091
        L_0x0048:
            r0 = move-exception
            r9 = r43
            r7 = r0
        L_0x004c:
            r5 = 0
            goto L_0x021f
        L_0x004f:
            java.lang.String r5 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
        L_0x0057:
            if (r14 == 0) goto L_0x005b
            java.lang.String r16 = "rowid <= ? and "
        L_0x005b:
            r9 = r16
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r10 = "select app_id, metadata_fingerprint from raw_events where "
            r14.<init>(r10)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            r14.append(r9)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r9 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r14.append(r9)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r9 = r14.toString()     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            android.database.Cursor r5 = r15.rawQuery(r9, r5)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0098 }
            if (r9 != 0) goto L_0x0083
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0235
        L_0x007f:
            r0 = move-exception
            r1 = r0
            goto L_0x1097
        L_0x0083:
            java.lang.String r9 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.String r10 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x0094 }
            r5.close()     // Catch:{ SQLiteException -> 0x0094 }
            goto L_0x00ee
        L_0x0090:
            r0 = move-exception
            r1 = r0
            goto L_0x1091
        L_0x0094:
            r0 = move-exception
        L_0x0095:
            r7 = r0
            goto L_0x021f
        L_0x0098:
            r0 = move-exception
            r9 = r43
            goto L_0x0095
        L_0x009c:
            r9 = r10
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00b4
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x0043 }
            r10 = r43
            java.lang.String[] r9 = new java.lang.String[]{r10, r9}     // Catch:{ SQLiteException -> 0x00ac, all -> 0x0043 }
            goto L_0x00ba
        L_0x00ac:
            r0 = move-exception
        L_0x00ad:
            r7 = r0
            r9 = r10
            goto L_0x004c
        L_0x00b0:
            r0 = move-exception
            r10 = r43
            goto L_0x00ad
        L_0x00b4:
            r10 = r43
            java.lang.String[] r9 = new java.lang.String[]{r43}     // Catch:{ SQLiteException -> 0x00ac, all -> 0x0043 }
        L_0x00ba:
            if (r5 == 0) goto L_0x00be
            java.lang.String r16 = " and rowid <= ?"
        L_0x00be:
            r5 = r16
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ac, all -> 0x0043 }
            java.lang.String r14 = "select metadata_fingerprint from raw_events where app_id = ?"
            r11.<init>(r14)     // Catch:{ SQLiteException -> 0x00ac, all -> 0x0043 }
            r11.append(r5)     // Catch:{ SQLiteException -> 0x00ac, all -> 0x0043 }
            java.lang.String r5 = " order by rowid limit 1;"
            r11.append(r5)     // Catch:{ SQLiteException -> 0x00ac, all -> 0x0043 }
            java.lang.String r5 = r11.toString()     // Catch:{ SQLiteException -> 0x00ac, all -> 0x0043 }
            android.database.Cursor r5 = r15.rawQuery(r5, r9)     // Catch:{ SQLiteException -> 0x00ac, all -> 0x0043 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021c }
            if (r9 != 0) goto L_0x00e2
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0235
        L_0x00e2:
            java.lang.String r9 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x021c }
            r5.close()     // Catch:{ SQLiteException -> 0x021c }
            r41 = r10
            r10 = r9
            r9 = r41
        L_0x00ee:
            java.lang.String r11 = "raw_events_metadata"
            java.lang.String r14 = "metadata"
            java.lang.String[] r16 = new java.lang.String[]{r14}     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r17 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r18 = new java.lang.String[]{r9, r10}     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "2"
            r19 = 0
            r20 = 0
            r14 = r15
            r23 = r15
            r15 = r11
            android.database.Cursor r5 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0094 }
            boolean r11 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0094 }
            if (r11 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.zzgi r7 = r6.m()     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.measurement.internal.zzgk r7 = r7.G()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r8 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgi.v(r9)     // Catch:{ SQLiteException -> 0x0094 }
            r7.b(r8, r10)     // Catch:{ SQLiteException -> 0x0094 }
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0235
        L_0x0128:
            byte[] r11 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r14 = com.google.android.gms.internal.measurement.zzgn.zzk.z2()     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzmk r11 = com.google.android.gms.measurement.internal.zzol.G(r14, r11)     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r11 = (com.google.android.gms.internal.measurement.zzgn.zzk.zza) r11     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzml r11 = r11.F()     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzlc r11 = (com.google.android.gms.internal.measurement.zzlc) r11     // Catch:{ IOException -> 0x0205 }
            com.google.android.gms.internal.measurement.zzgn$zzk r11 = (com.google.android.gms.internal.measurement.zzgn.zzk) r11     // Catch:{ IOException -> 0x0205 }
            boolean r14 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0094 }
            if (r14 == 0) goto L_0x0155
            com.google.android.gms.measurement.internal.zzgi r14 = r6.m()     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.measurement.internal.zzgk r14 = r14.L()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r15 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzgi.v(r9)     // Catch:{ SQLiteException -> 0x0094 }
            r14.b(r15, r12)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x0155:
            r5.close()     // Catch:{ SQLiteException -> 0x0094 }
            r4.a(r11)     // Catch:{ SQLiteException -> 0x0094 }
            r11 = -1
            int r14 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r14 == 0) goto L_0x0170
            java.lang.String r11 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String[] r7 = new java.lang.String[]{r9, r10, r7}     // Catch:{ SQLiteException -> 0x0094 }
            r18 = r7
            r17 = r11
            goto L_0x017a
        L_0x0170:
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[]{r9, r10}     // Catch:{ SQLiteException -> 0x0094 }
            r17 = r7
            r18 = r8
        L_0x017a:
            java.lang.String r15 = "raw_events"
            java.lang.String r7 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r10 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r16 = new java.lang.String[]{r7, r8, r10, r11}     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r21 = "rowid"
            r22 = 0
            r19 = 0
            r20 = 0
            r14 = r23
            android.database.Cursor r5 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0094 }
            boolean r7 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0094 }
            if (r7 != 0) goto L_0x01b2
            com.google.android.gms.measurement.internal.zzgi r7 = r6.m()     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.measurement.internal.zzgk r7 = r7.L()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgi.v(r9)     // Catch:{ SQLiteException -> 0x0094 }
            r7.b(r8, r10)     // Catch:{ SQLiteException -> 0x0094 }
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0235
        L_0x01b2:
            long r7 = r5.getLong(r13)     // Catch:{ SQLiteException -> 0x0094 }
            r10 = 3
            byte[] r11 = r5.getBlob(r10)     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r10 = com.google.android.gms.internal.measurement.zzgn.zzf.W()     // Catch:{ IOException -> 0x01e8 }
            com.google.android.gms.internal.measurement.zzmk r10 = com.google.android.gms.measurement.internal.zzol.G(r10, r11)     // Catch:{ IOException -> 0x01e8 }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r10 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r10     // Catch:{ IOException -> 0x01e8 }
            r11 = 1
            java.lang.String r12 = r5.getString(r11)     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r11 = r10.L(r12)     // Catch:{ SQLiteException -> 0x0094 }
            r12 = 2
            long r14 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x0094 }
            r11.N(r14)     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.internal.measurement.zzml r10 = r10.F()     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.internal.measurement.zzlc r10 = (com.google.android.gms.internal.measurement.zzlc) r10     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.internal.measurement.zzgn$zzf r10 = (com.google.android.gms.internal.measurement.zzgn.zzf) r10     // Catch:{ SQLiteException -> 0x0094 }
            boolean r7 = r4.b(r7, r10)     // Catch:{ SQLiteException -> 0x0094 }
            if (r7 != 0) goto L_0x01fb
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0235
        L_0x01e8:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.zzgi r8 = r6.m()     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.measurement.internal.zzgk r8 = r8.G()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgi.v(r9)     // Catch:{ SQLiteException -> 0x0094 }
            r8.c(r10, r11, r7)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x01fb:
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0094 }
            if (r7 != 0) goto L_0x01b2
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0235
        L_0x0205:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.zzgi r8 = r6.m()     // Catch:{ SQLiteException -> 0x0094 }
            com.google.android.gms.measurement.internal.zzgk r8 = r8.G()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgi.v(r9)     // Catch:{ SQLiteException -> 0x0094 }
            r8.c(r10, r11, r7)     // Catch:{ SQLiteException -> 0x0094 }
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0235
        L_0x021c:
            r0 = move-exception
            r7 = r0
            r9 = r10
        L_0x021f:
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.G()     // Catch:{ all -> 0x0090 }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzgi.v(r9)     // Catch:{ all -> 0x0090 }
            r6.c(r8, r9, r7)     // Catch:{ all -> 0x0090 }
            if (r5 == 0) goto L_0x0235
            r5.close()     // Catch:{ all -> 0x007f }
        L_0x0235:
            java.util.List r5 = r4.f26928c     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x1081
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0241
            goto L_0x1081
        L_0x0241:
            com.google.android.gms.internal.measurement.zzgn$zzk r5 = r4.f26926a     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r5 = r5.z()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r5 = (com.google.android.gms.internal.measurement.zzgn.zzk.zza) r5     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r5 = r5.Z0()     // Catch:{ all -> 0x007f }
            r9 = r13
            r10 = r9
            r11 = r10
            r7 = 0
            r8 = 0
            r12 = -1
            r14 = -1
        L_0x0254:
            java.util.List r15 = r4.f26928c     // Catch:{ all -> 0x007f }
            int r15 = r15.size()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = "_et"
            java.lang.String r6 = "_fr"
            r17 = r10
            java.lang.String r10 = "_e"
            r44 = r11
            java.lang.String r11 = "_c"
            r18 = r12
            r45 = r13
            if (r9 >= r15) goto L_0x0831
            java.util.List r15 = r4.f26928c     // Catch:{ all -> 0x007f }
            java.lang.Object r15 = r15.get(r9)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r15 = (com.google.android.gms.internal.measurement.zzgn.zzf) r15     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r15 = r15.z()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r15 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r15     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzhg r12 = r42.r0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r13 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r13 = r13.C2()     // Catch:{ all -> 0x007f }
            r21 = r9
            java.lang.String r9 = r15.T()     // Catch:{ all -> 0x007f }
            boolean r9 = r12.P(r13, r9)     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "_err"
            if (r9 == 0) goto L_0x0307
            com.google.android.gms.measurement.internal.zzgi r6 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.L()     // Catch:{ all -> 0x007f }
            java.lang.String r9 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzgn$zzk r10 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r10 = r10.C2()     // Catch:{ all -> 0x007f }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgi.v(r10)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzhw r11 = r1.f26911l     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgh r11 = r11.D()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = r15.T()     // Catch:{ all -> 0x007f }
            java.lang.String r11 = r11.c(r13)     // Catch:{ all -> 0x007f }
            r6.c(r9, r10, r11)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzhg r6 = r42.r0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r9.C2()     // Catch:{ all -> 0x007f }
            boolean r6 = r6.Y(r9)     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x02fc
            com.google.android.gms.measurement.internal.zzhg r6 = r42.r0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r9.C2()     // Catch:{ all -> 0x007f }
            boolean r6 = r6.a0(r9)     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x02d8
            goto L_0x02fc
        L_0x02d8:
            java.lang.String r6 = r15.T()     // Catch:{ all -> 0x007f }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x02fc
            r42.y0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzoo r6 = r1.G     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r25 = r9.C2()     // Catch:{ all -> 0x007f }
            java.lang.String r27 = "_ev"
            java.lang.String r28 = r15.T()     // Catch:{ all -> 0x007f }
            r29 = 0
            r26 = 11
            r24 = r6
            com.google.android.gms.measurement.internal.zzop.Z(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x007f }
        L_0x02fc:
            r11 = r44
            r23 = r2
            r10 = r3
            r12 = r18
            r13 = r21
            goto L_0x0827
        L_0x0307:
            java.lang.String r9 = r15.T()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = com.google.android.gms.measurement.internal.zzjf.a(r2)     // Catch:{ all -> 0x007f }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x007f }
            if (r9 == 0) goto L_0x0379
            r15.L(r2)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgi r9 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r9 = r9.K()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = "Renaming ad_impression to _ai"
            r9.a(r13)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgi r9 = r42.m()     // Catch:{ all -> 0x007f }
            r13 = 5
            boolean r9 = r9.C(r13)     // Catch:{ all -> 0x007f }
            if (r9 == 0) goto L_0x0379
            r9 = 0
        L_0x0331:
            int r13 = r15.y()     // Catch:{ all -> 0x007f }
            if (r9 >= r13) goto L_0x0379
            java.lang.String r13 = "ad_platform"
            com.google.android.gms.internal.measurement.zzgn$zzh r22 = r15.O(r9)     // Catch:{ all -> 0x007f }
            r23 = r2
            java.lang.String r2 = r22.a0()     // Catch:{ all -> 0x007f }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0374
            com.google.android.gms.internal.measurement.zzgn$zzh r2 = r15.O(r9)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r2.b0()     // Catch:{ all -> 0x007f }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x0374
            java.lang.String r2 = "admob"
            com.google.android.gms.internal.measurement.zzgn$zzh r13 = r15.O(r9)     // Catch:{ all -> 0x007f }
            java.lang.String r13 = r13.b0()     // Catch:{ all -> 0x007f }
            boolean r2 = r2.equalsIgnoreCase(r13)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0374
            com.google.android.gms.measurement.internal.zzgi r2 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.M()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = "AdMob ad impression logged from app. Potentially duplicative."
            r2.a(r13)     // Catch:{ all -> 0x007f }
        L_0x0374:
            int r9 = r9 + 1
            r2 = r23
            goto L_0x0331
        L_0x0379:
            r23 = r2
            com.google.android.gms.measurement.internal.zzhg r2 = r42.r0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r9.C2()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = r15.T()     // Catch:{ all -> 0x007f }
            boolean r2 = r2.N(r9, r13)     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x03b7
            r42.x0()     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r15.T()     // Catch:{ all -> 0x007f }
            com.google.android.gms.common.internal.Preconditions.g(r9)     // Catch:{ all -> 0x007f }
            int r13 = r9.hashCode()     // Catch:{ all -> 0x007f }
            r22 = r3
            r3 = 95027(0x17333, float:1.33161E-40)
            if (r13 == r3) goto L_0x03a5
            goto L_0x03ae
        L_0x03a5:
            java.lang.String r3 = "_ui"
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x03ae
            goto L_0x03b9
        L_0x03ae:
            r25 = r5
            r24 = r7
            r26 = r8
            r9 = r14
            goto L_0x0588
        L_0x03b7:
            r22 = r3
        L_0x03b9:
            r24 = r7
            r3 = 0
            r9 = 0
            r13 = 0
        L_0x03be:
            int r7 = r15.y()     // Catch:{ all -> 0x007f }
            r25 = r5
            java.lang.String r5 = "_r"
            if (r3 >= r7) goto L_0x0428
            com.google.android.gms.internal.measurement.zzgn$zzh r7 = r15.O(r3)     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.a0()     // Catch:{ all -> 0x007f }
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x03f5
            com.google.android.gms.internal.measurement.zzgn$zzh r5 = r15.O(r3)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r5 = r5.z()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r5 = (com.google.android.gms.internal.measurement.zzgn.zzh.zza) r5     // Catch:{ all -> 0x007f }
            r26 = r8
            r7 = 1
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r5 = r5.B(r7)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r5 = r5.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r5 = (com.google.android.gms.internal.measurement.zzlc) r5     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r5 = (com.google.android.gms.internal.measurement.zzgn.zzh) r5     // Catch:{ all -> 0x007f }
            r15.G(r3, r5)     // Catch:{ all -> 0x007f }
            r9 = 1
            goto L_0x0421
        L_0x03f5:
            r26 = r8
            com.google.android.gms.internal.measurement.zzgn$zzh r7 = r15.O(r3)     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.a0()     // Catch:{ all -> 0x007f }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0421
            com.google.android.gms.internal.measurement.zzgn$zzh r5 = r15.O(r3)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r5 = r5.z()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r5 = (com.google.android.gms.internal.measurement.zzgn.zzh.zza) r5     // Catch:{ all -> 0x007f }
            r7 = 1
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r5 = r5.B(r7)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r5 = r5.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r5 = (com.google.android.gms.internal.measurement.zzlc) r5     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r5 = (com.google.android.gms.internal.measurement.zzgn.zzh) r5     // Catch:{ all -> 0x007f }
            r15.G(r3, r5)     // Catch:{ all -> 0x007f }
            r13 = 1
        L_0x0421:
            int r3 = r3 + 1
            r5 = r25
            r8 = r26
            goto L_0x03be
        L_0x0428:
            r26 = r8
            if (r9 != 0) goto L_0x045a
            if (r2 == 0) goto L_0x045a
            com.google.android.gms.measurement.internal.zzgi r3 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.K()     // Catch:{ all -> 0x007f }
            java.lang.String r7 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzhw r8 = r1.f26911l     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgh r8 = r8.D()     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r15.T()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.c(r9)     // Catch:{ all -> 0x007f }
            r3.b(r7, r8)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r3 = com.google.android.gms.internal.measurement.zzgn.zzh.Y()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r3 = r3.I(r11)     // Catch:{ all -> 0x007f }
            r7 = 1
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r3 = r3.B(r7)     // Catch:{ all -> 0x007f }
            r15.I(r3)     // Catch:{ all -> 0x007f }
        L_0x045a:
            if (r13 != 0) goto L_0x0488
            com.google.android.gms.measurement.internal.zzgi r3 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.K()     // Catch:{ all -> 0x007f }
            java.lang.String r7 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzhw r8 = r1.f26911l     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgh r8 = r8.D()     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r15.T()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.c(r9)     // Catch:{ all -> 0x007f }
            r3.b(r7, r8)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r3 = com.google.android.gms.internal.measurement.zzgn.zzh.Y()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r3 = r3.I(r5)     // Catch:{ all -> 0x007f }
            r7 = 1
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r3 = r3.B(r7)     // Catch:{ all -> 0x007f }
            r15.I(r3)     // Catch:{ all -> 0x007f }
        L_0x0488:
            com.google.android.gms.measurement.internal.zzam r27 = r42.l0()     // Catch:{ all -> 0x007f }
            long r28 = r42.F0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r3 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r30 = r3.C2()     // Catch:{ all -> 0x007f }
            r35 = 1
            r36 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            com.google.android.gms.measurement.internal.zzar r3 = r27.J(r28, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x007f }
            long r7 = r3.f26210e     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzah r3 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r9.C2()     // Catch:{ all -> 0x007f }
            int r3 = r3.B(r9)     // Catch:{ all -> 0x007f }
            r9 = r14
            long r13 = (long) r3     // Catch:{ all -> 0x007f }
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x04c0
            q(r15, r5)     // Catch:{ all -> 0x007f }
            goto L_0x04c2
        L_0x04c0:
            r17 = 1
        L_0x04c2:
            java.lang.String r3 = r15.T()     // Catch:{ all -> 0x007f }
            boolean r3 = com.google.android.gms.measurement.internal.zzop.L0(r3)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0588
            if (r2 == 0) goto L_0x0588
            com.google.android.gms.measurement.internal.zzam r27 = r42.l0()     // Catch:{ all -> 0x007f }
            long r28 = r42.F0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r3 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r30 = r3.C2()     // Catch:{ all -> 0x007f }
            r35 = 0
            r36 = 0
            r31 = 0
            r32 = 0
            r33 = 1
            r34 = 0
            com.google.android.gms.measurement.internal.zzar r3 = r27.J(r28, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x007f }
            long r7 = r3.f26208c     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzah r3 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r5 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r5 = r5.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r13 = com.google.android.gms.measurement.internal.zzbj.f26273o     // Catch:{ all -> 0x007f }
            int r3 = r3.y(r5, r13)     // Catch:{ all -> 0x007f }
            long r13 = (long) r3     // Catch:{ all -> 0x007f }
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0588
            com.google.android.gms.measurement.internal.zzgi r3 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.L()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzgn$zzk r7 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.C2()     // Catch:{ all -> 0x007f }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgi.v(r7)     // Catch:{ all -> 0x007f }
            r3.b(r5, r7)     // Catch:{ all -> 0x007f }
            r3 = -1
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x051e:
            int r13 = r15.y()     // Catch:{ all -> 0x007f }
            if (r5 >= r13) goto L_0x0549
            com.google.android.gms.internal.measurement.zzgn$zzh r13 = r15.O(r5)     // Catch:{ all -> 0x007f }
            java.lang.String r14 = r13.a0()     // Catch:{ all -> 0x007f }
            boolean r14 = r11.equals(r14)     // Catch:{ all -> 0x007f }
            if (r14 == 0) goto L_0x053b
            com.google.android.gms.internal.measurement.zzlc$zzb r3 = r13.z()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r3 = (com.google.android.gms.internal.measurement.zzgn.zzh.zza) r3     // Catch:{ all -> 0x007f }
            r7 = r3
            r3 = r5
            goto L_0x0546
        L_0x053b:
            java.lang.String r13 = r13.a0()     // Catch:{ all -> 0x007f }
            boolean r13 = r12.equals(r13)     // Catch:{ all -> 0x007f }
            if (r13 == 0) goto L_0x0546
            r8 = 1
        L_0x0546:
            int r5 = r5 + 1
            goto L_0x051e
        L_0x0549:
            if (r8 == 0) goto L_0x0551
            if (r7 == 0) goto L_0x0551
            r15.z(r3)     // Catch:{ all -> 0x007f }
            goto L_0x0588
        L_0x0551:
            if (r7 == 0) goto L_0x0571
            java.lang.Object r5 = r7.clone()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r5 = (com.google.android.gms.internal.measurement.zzlc.zzb) r5     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r5 = (com.google.android.gms.internal.measurement.zzgn.zzh.zza) r5     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r5 = r5.I(r12)     // Catch:{ all -> 0x007f }
            r7 = 10
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r5 = r5.B(r7)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r5 = r5.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r5 = (com.google.android.gms.internal.measurement.zzlc) r5     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r5 = (com.google.android.gms.internal.measurement.zzgn.zzh) r5     // Catch:{ all -> 0x007f }
            r15.G(r3, r5)     // Catch:{ all -> 0x007f }
            goto L_0x0588
        L_0x0571:
            com.google.android.gms.measurement.internal.zzgi r3 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzgn$zzk r7 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.C2()     // Catch:{ all -> 0x007f }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgi.v(r7)     // Catch:{ all -> 0x007f }
            r3.b(r5, r7)     // Catch:{ all -> 0x007f }
        L_0x0588:
            if (r2 == 0) goto L_0x05f9
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            java.util.List r3 = r15.U()     // Catch:{ all -> 0x007f }
            r2.<init>(r3)     // Catch:{ all -> 0x007f }
            r3 = 0
            r5 = -1
            r7 = -1
        L_0x0596:
            int r8 = r2.size()     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r3 >= r8) goto L_0x05c6
            java.lang.Object r8 = r2.get(r3)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r8 = (com.google.android.gms.internal.measurement.zzgn.zzh) r8     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x007f }
            boolean r8 = r13.equals(r8)     // Catch:{ all -> 0x007f }
            if (r8 == 0) goto L_0x05b2
            r5 = r3
            goto L_0x05c3
        L_0x05b2:
            java.lang.Object r8 = r2.get(r3)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r8 = (com.google.android.gms.internal.measurement.zzgn.zzh) r8     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.a0()     // Catch:{ all -> 0x007f }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x007f }
            if (r8 == 0) goto L_0x05c3
            r7 = r3
        L_0x05c3:
            int r3 = r3 + 1
            goto L_0x0596
        L_0x05c6:
            r3 = -1
            if (r5 == r3) goto L_0x05fa
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r3 = (com.google.android.gms.internal.measurement.zzgn.zzh) r3     // Catch:{ all -> 0x007f }
            boolean r3 = r3.f0()     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x05fc
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r3 = (com.google.android.gms.internal.measurement.zzgn.zzh) r3     // Catch:{ all -> 0x007f }
            boolean r3 = r3.d0()     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x05fc
            com.google.android.gms.measurement.internal.zzgi r2 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.M()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x007f }
            r15.z(r5)     // Catch:{ all -> 0x007f }
            q(r15, r11)     // Catch:{ all -> 0x007f }
            r2 = 18
            p(r15, r2, r13)     // Catch:{ all -> 0x007f }
        L_0x05f9:
            r3 = -1
        L_0x05fa:
            r8 = 3
            goto L_0x0643
        L_0x05fc:
            r3 = -1
            if (r7 != r3) goto L_0x0601
            r8 = 3
            goto L_0x0624
        L_0x0601:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r2 = (com.google.android.gms.internal.measurement.zzgn.zzh) r2     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r2.b0()     // Catch:{ all -> 0x007f }
            int r7 = r2.length()     // Catch:{ all -> 0x007f }
            r8 = 3
            if (r7 == r8) goto L_0x0613
            goto L_0x0624
        L_0x0613:
            r7 = 0
        L_0x0614:
            int r13 = r2.length()     // Catch:{ all -> 0x007f }
            if (r7 >= r13) goto L_0x0643
            int r13 = r2.codePointAt(r7)     // Catch:{ all -> 0x007f }
            boolean r14 = java.lang.Character.isLetter(r13)     // Catch:{ all -> 0x007f }
            if (r14 != 0) goto L_0x063d
        L_0x0624:
            com.google.android.gms.measurement.internal.zzgi r2 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.M()     // Catch:{ all -> 0x007f }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r7)     // Catch:{ all -> 0x007f }
            r15.z(r5)     // Catch:{ all -> 0x007f }
            q(r15, r11)     // Catch:{ all -> 0x007f }
            r2 = 19
            p(r15, r2, r12)     // Catch:{ all -> 0x007f }
            goto L_0x0643
        L_0x063d:
            int r13 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x007f }
            int r7 = r7 + r13
            goto L_0x0614
        L_0x0643:
            java.lang.String r2 = r15.T()     // Catch:{ all -> 0x007f }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x007f }
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x069c
            r42.x0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r2 = r15.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r2 = (com.google.android.gms.internal.measurement.zzlc) r2     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r2 = (com.google.android.gms.internal.measurement.zzgn.zzf) r2     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r2 = com.google.android.gms.measurement.internal.zzol.F(r2, r6)     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x0697
            if (r26 == 0) goto L_0x068f
            long r5 = r26.P()     // Catch:{ all -> 0x007f }
            long r12 = r15.P()     // Catch:{ all -> 0x007f }
            long r5 = r5 - r12
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x007f }
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x068f
            java.lang.Object r2 = r26.clone()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r2 = (com.google.android.gms.internal.measurement.zzlc.zzb) r2     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r2     // Catch:{ all -> 0x007f }
            boolean r5 = r1.M(r15, r2)     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x068f
            r5 = r25
            r5.B(r9, r2)     // Catch:{ all -> 0x007f }
            r14 = r9
            r12 = r18
        L_0x0689:
            r24 = 0
            r26 = 0
            goto L_0x06f0
        L_0x068f:
            r5 = r25
            r12 = r44
            r14 = r9
            r24 = r15
            goto L_0x06f0
        L_0x0697:
            r5 = r25
        L_0x0699:
            r6 = r18
            goto L_0x06ee
        L_0x069c:
            r5 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r15.T()     // Catch:{ all -> 0x007f }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0699
            r42.x0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r2 = r15.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r2 = (com.google.android.gms.internal.measurement.zzlc) r2     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r2 = (com.google.android.gms.internal.measurement.zzgn.zzf) r2     // Catch:{ all -> 0x007f }
            r7 = r45
            com.google.android.gms.internal.measurement.zzgn$zzh r2 = com.google.android.gms.measurement.internal.zzol.F(r2, r7)     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x0699
            if (r24 == 0) goto L_0x06e6
            long r6 = r24.P()     // Catch:{ all -> 0x007f }
            long r12 = r15.P()     // Catch:{ all -> 0x007f }
            long r6 = r6 - r12
            long r6 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x007f }
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x06e6
            java.lang.Object r2 = r24.clone()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r2 = (com.google.android.gms.internal.measurement.zzlc.zzb) r2     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r2     // Catch:{ all -> 0x007f }
            boolean r6 = r1.M(r2, r15)     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x06e6
            r6 = r18
            r5.B(r6, r2)     // Catch:{ all -> 0x007f }
            r12 = r6
            r14 = r9
            goto L_0x0689
        L_0x06e6:
            r6 = r18
            r14 = r44
            r12 = r6
            r26 = r15
            goto L_0x06f0
        L_0x06ee:
            r12 = r6
            r14 = r9
        L_0x06f0:
            boolean r2 = com.google.android.gms.internal.measurement.zzqy.a()     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x080d
            com.google.android.gms.measurement.internal.zzah r2 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.V0     // Catch:{ all -> 0x007f }
            boolean r2 = r2.t(r6)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x080d
            int r2 = r15.y()     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x080d
            r42.x0()     // Catch:{ all -> 0x007f }
            java.util.List r2 = r15.U()     // Catch:{ all -> 0x007f }
            android.os.Bundle r2 = com.google.android.gms.measurement.internal.zzol.B(r2)     // Catch:{ all -> 0x007f }
            r6 = 0
        L_0x0714:
            int r7 = r15.y()     // Catch:{ all -> 0x007f }
            if (r6 >= r7) goto L_0x07bb
            com.google.android.gms.internal.measurement.zzgn$zzh r7 = r15.O(r6)     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r7.a0()     // Catch:{ all -> 0x007f }
            r10 = r22
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x007f }
            if (r9 == 0) goto L_0x0796
            java.util.List r9 = r7.c0()     // Catch:{ all -> 0x007f }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x007f }
            if (r9 != 0) goto L_0x0796
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r9.C2()     // Catch:{ all -> 0x007f }
            java.util.List r7 = r7.c0()     // Catch:{ all -> 0x007f }
            int r11 = r7.size()     // Catch:{ all -> 0x007f }
            android.os.Bundle[] r11 = new android.os.Bundle[r11]     // Catch:{ all -> 0x007f }
            r13 = 0
        L_0x0745:
            int r3 = r7.size()     // Catch:{ all -> 0x007f }
            if (r13 >= r3) goto L_0x0792
            java.lang.Object r3 = r7.get(r13)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r3 = (com.google.android.gms.internal.measurement.zzgn.zzh) r3     // Catch:{ all -> 0x007f }
            r42.x0()     // Catch:{ all -> 0x007f }
            java.util.List r18 = r3.c0()     // Catch:{ all -> 0x007f }
            android.os.Bundle r8 = com.google.android.gms.measurement.internal.zzol.B(r18)     // Catch:{ all -> 0x007f }
            java.util.List r3 = r3.c0()     // Catch:{ all -> 0x007f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007f }
        L_0x0764:
            boolean r18 = r3.hasNext()     // Catch:{ all -> 0x007f }
            if (r18 == 0) goto L_0x0788
            java.lang.Object r18 = r3.next()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r18 = (com.google.android.gms.internal.measurement.zzgn.zzh) r18     // Catch:{ all -> 0x007f }
            r45 = r3
            java.lang.String r3 = r15.T()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r18 = r18.z()     // Catch:{ all -> 0x007f }
            r19 = r7
            r7 = r18
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r7 = (com.google.android.gms.internal.measurement.zzgn.zzh.zza) r7     // Catch:{ all -> 0x007f }
            r1.C(r3, r7, r8, r9)     // Catch:{ all -> 0x007f }
            r3 = r45
            r7 = r19
            goto L_0x0764
        L_0x0788:
            r19 = r7
            r11[r13] = r8     // Catch:{ all -> 0x007f }
            int r13 = r13 + 1
            r7 = r19
            r8 = 3
            goto L_0x0745
        L_0x0792:
            r2.putParcelableArray(r10, r11)     // Catch:{ all -> 0x007f }
            goto L_0x07b3
        L_0x0796:
            java.lang.String r3 = r7.a0()     // Catch:{ all -> 0x007f }
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x07b3
            java.lang.String r3 = r15.T()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r7 = r7.z()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r7 = (com.google.android.gms.internal.measurement.zzgn.zzh.zza) r7     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r8 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.C2()     // Catch:{ all -> 0x007f }
            r1.C(r3, r7, r2, r8)     // Catch:{ all -> 0x007f }
        L_0x07b3:
            int r6 = r6 + 1
            r22 = r10
            r3 = -1
            r8 = 3
            goto L_0x0714
        L_0x07bb:
            r10 = r22
            r15.R()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzol r3 = r42.x0()     // Catch:{ all -> 0x007f }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            java.util.Set r7 = r2.keySet()     // Catch:{ all -> 0x007f }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x007f }
        L_0x07d1:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x007f }
            if (r8 == 0) goto L_0x07fa
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r9 = com.google.android.gms.internal.measurement.zzgn.zzh.Y()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r9 = r9.I(r8)     // Catch:{ all -> 0x007f }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x007f }
            if (r8 == 0) goto L_0x07d1
            r3.U(r9, r8)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r8 = r9.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r8 = (com.google.android.gms.internal.measurement.zzlc) r8     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r8 = (com.google.android.gms.internal.measurement.zzgn.zzh) r8     // Catch:{ all -> 0x007f }
            r6.add(r8)     // Catch:{ all -> 0x007f }
            goto L_0x07d1
        L_0x07fa:
            int r2 = r6.size()     // Catch:{ all -> 0x007f }
            r3 = 0
        L_0x07ff:
            if (r3 >= r2) goto L_0x080f
            java.lang.Object r7 = r6.get(r3)     // Catch:{ all -> 0x007f }
            int r3 = r3 + 1
            com.google.android.gms.internal.measurement.zzgn$zzh r7 = (com.google.android.gms.internal.measurement.zzgn.zzh) r7     // Catch:{ all -> 0x007f }
            r15.J(r7)     // Catch:{ all -> 0x007f }
            goto L_0x07ff
        L_0x080d:
            r10 = r22
        L_0x080f:
            java.util.List r2 = r4.f26928c     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r3 = r15.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r3 = (com.google.android.gms.internal.measurement.zzlc) r3     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r3 = (com.google.android.gms.internal.measurement.zzgn.zzf) r3     // Catch:{ all -> 0x007f }
            r13 = r21
            r2.set(r13, r3)     // Catch:{ all -> 0x007f }
            int r11 = r44 + 1
            r5.L(r15)     // Catch:{ all -> 0x007f }
            r7 = r24
            r8 = r26
        L_0x0827:
            int r9 = r13 + 1
            r3 = r10
            r10 = r17
            r2 = r23
            r13 = 0
            goto L_0x0254
        L_0x0831:
            r7 = r45
            r2 = 0
            r8 = r44
            r12 = r2
            r9 = 0
        L_0x0839:
            if (r9 >= r8) goto L_0x0886
            com.google.android.gms.internal.measurement.zzgn$zzf r14 = r5.z(r9)     // Catch:{ all -> 0x007f }
            java.lang.String r15 = r14.Y()     // Catch:{ all -> 0x007f }
            boolean r15 = r10.equals(r15)     // Catch:{ all -> 0x007f }
            if (r15 == 0) goto L_0x085b
            r42.x0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r15 = com.google.android.gms.measurement.internal.zzol.F(r14, r6)     // Catch:{ all -> 0x007f }
            if (r15 == 0) goto L_0x085b
            r5.a0(r9)     // Catch:{ all -> 0x007f }
            int r8 = r8 + -1
            int r9 = r9 + -1
        L_0x0859:
            r14 = 1
            goto L_0x0884
        L_0x085b:
            r42.x0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r14 = com.google.android.gms.measurement.internal.zzol.F(r14, r7)     // Catch:{ all -> 0x007f }
            if (r14 == 0) goto L_0x0859
            boolean r15 = r14.f0()     // Catch:{ all -> 0x007f }
            if (r15 == 0) goto L_0x0873
            long r14 = r14.W()     // Catch:{ all -> 0x007f }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x007f }
            goto L_0x0874
        L_0x0873:
            r14 = 0
        L_0x0874:
            if (r14 == 0) goto L_0x0859
            long r21 = r14.longValue()     // Catch:{ all -> 0x007f }
            int r15 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0859
            long r14 = r14.longValue()     // Catch:{ all -> 0x007f }
            long r12 = r12 + r14
            goto L_0x0859
        L_0x0884:
            int r9 = r9 + r14
            goto L_0x0839
        L_0x0886:
            r6 = 0
            r1.r(r5, r12, r6)     // Catch:{ all -> 0x007f }
            java.util.List r6 = r5.U()     // Catch:{ all -> 0x007f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x007f }
        L_0x0892:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = "_se"
            if (r7 == 0) goto L_0x08b7
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r7 = (com.google.android.gms.internal.measurement.zzgn.zzf) r7     // Catch:{ all -> 0x007f }
            java.lang.String r9 = "_s"
            java.lang.String r7 = r7.Y()     // Catch:{ all -> 0x007f }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0892
            com.google.android.gms.measurement.internal.zzam r6 = r42.l0()     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r5.r1()     // Catch:{ all -> 0x007f }
            r6.S0(r7, r8)     // Catch:{ all -> 0x007f }
        L_0x08b7:
            java.lang.String r6 = "_sid"
            int r6 = com.google.android.gms.measurement.internal.zzol.y(r5, r6)     // Catch:{ all -> 0x007f }
            if (r6 < 0) goto L_0x08c4
            r6 = 1
            r1.r(r5, r12, r6)     // Catch:{ all -> 0x007f }
            goto L_0x08e4
        L_0x08c4:
            int r6 = com.google.android.gms.measurement.internal.zzol.y(r5, r8)     // Catch:{ all -> 0x007f }
            if (r6 < 0) goto L_0x08e4
            r5.h0(r6)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgi r6 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.G()     // Catch:{ all -> 0x007f }
            java.lang.String r7 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzgn$zzk r8 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.C2()     // Catch:{ all -> 0x007f }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x007f }
            r6.b(r7, r8)     // Catch:{ all -> 0x007f }
        L_0x08e4:
            com.google.android.gms.measurement.internal.zzol r6 = r42.x0()     // Catch:{ all -> 0x007f }
            r6.V(r5)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r6 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r6 = r6.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzhp r7 = r42.f()     // Catch:{ all -> 0x007f }
            r7.n()     // Catch:{ all -> 0x007f }
            r42.A0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r7 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzh r7 = r7.L0(r6)     // Catch:{ all -> 0x007f }
            if (r7 != 0) goto L_0x0917
            com.google.android.gms.measurement.internal.zzgi r7 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r7 = r7.G()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = "Cannot fix consent fields without appInfo. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r6)     // Catch:{ all -> 0x007f }
            r7.b(r8, r6)     // Catch:{ all -> 0x007f }
            goto L_0x091a
        L_0x0917:
            r1.w(r7, r5)     // Catch:{ all -> 0x007f }
        L_0x091a:
            boolean r6 = com.google.android.gms.internal.measurement.zzqn.a()     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x095b
            com.google.android.gms.measurement.internal.zzah r6 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r7 = com.google.android.gms.measurement.internal.zzbj.U0     // Catch:{ all -> 0x007f }
            boolean r6 = r6.t(r7)     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x095b
            com.google.android.gms.internal.measurement.zzgn$zzk r6 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r6 = r6.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzhp r7 = r42.f()     // Catch:{ all -> 0x007f }
            r7.n()     // Catch:{ all -> 0x007f }
            r42.A0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r7 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzh r7 = r7.L0(r6)     // Catch:{ all -> 0x007f }
            if (r7 != 0) goto L_0x0958
            com.google.android.gms.measurement.internal.zzgi r7 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r7 = r7.L()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = "Cannot populate ad_campaign_info without appInfo. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r6)     // Catch:{ all -> 0x007f }
            r7.b(r8, r6)     // Catch:{ all -> 0x007f }
            goto L_0x095b
        L_0x0958:
            r1.a0(r7, r5)     // Catch:{ all -> 0x007f }
        L_0x095b:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r6 = r5.N0(r6)     // Catch:{ all -> 0x007f }
            r7 = -9223372036854775808
            r6.u0(r7)     // Catch:{ all -> 0x007f }
            r6 = 0
        L_0x096a:
            int r7 = r5.g0()     // Catch:{ all -> 0x007f }
            if (r6 >= r7) goto L_0x099d
            com.google.android.gms.internal.measurement.zzgn$zzf r7 = r5.z(r6)     // Catch:{ all -> 0x007f }
            long r8 = r7.V()     // Catch:{ all -> 0x007f }
            long r12 = r5.x0()     // Catch:{ all -> 0x007f }
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0987
            long r8 = r7.V()     // Catch:{ all -> 0x007f }
            r5.N0(r8)     // Catch:{ all -> 0x007f }
        L_0x0987:
            long r8 = r7.V()     // Catch:{ all -> 0x007f }
            long r12 = r5.s0()     // Catch:{ all -> 0x007f }
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x099a
            long r7 = r7.V()     // Catch:{ all -> 0x007f }
            r5.u0(r7)     // Catch:{ all -> 0x007f }
        L_0x099a:
            int r6 = r6 + 1
            goto L_0x096a
        L_0x099d:
            r5.p1()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzjc r6 = com.google.android.gms.measurement.internal.zzjc.f26593c     // Catch:{ all -> 0x007f }
            boolean r7 = com.google.android.gms.internal.measurement.zzpd.a()     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0a35
            com.google.android.gms.measurement.internal.zzah r7 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.d1     // Catch:{ all -> 0x007f }
            boolean r7 = r7.t(r8)     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0a35
            com.google.android.gms.internal.measurement.zzgn$zzk r6 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r6 = r6.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzjc r6 = r1.U(r6)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r7 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.c0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzjc r7 = com.google.android.gms.measurement.internal.zzjc.q(r7)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzjc r6 = r6.h(r7)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r7 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r8 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzjc r7 = r7.R0(r8)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r8 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r9.C2()     // Catch:{ all -> 0x007f }
            r8.Z(r9, r6)     // Catch:{ all -> 0x007f }
            boolean r8 = r6.B()     // Catch:{ all -> 0x007f }
            if (r8 != 0) goto L_0x0a01
            boolean r8 = r7.B()     // Catch:{ all -> 0x007f }
            if (r8 == 0) goto L_0x0a01
            com.google.android.gms.measurement.internal.zzam r7 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r8 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.C2()     // Catch:{ all -> 0x007f }
            r7.d1(r8)     // Catch:{ all -> 0x007f }
            goto L_0x0a1a
        L_0x0a01:
            boolean r8 = r6.B()     // Catch:{ all -> 0x007f }
            if (r8 == 0) goto L_0x0a1a
            boolean r7 = r7.B()     // Catch:{ all -> 0x007f }
            if (r7 != 0) goto L_0x0a1a
            com.google.android.gms.measurement.internal.zzam r7 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r8 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.C2()     // Catch:{ all -> 0x007f }
            r7.e1(r8)     // Catch:{ all -> 0x007f }
        L_0x0a1a:
            boolean r7 = r6.A()     // Catch:{ all -> 0x007f }
            if (r7 != 0) goto L_0x0a29
            r5.l1()     // Catch:{ all -> 0x007f }
            r5.f1()     // Catch:{ all -> 0x007f }
            r5.T0()     // Catch:{ all -> 0x007f }
        L_0x0a29:
            boolean r7 = r6.B()     // Catch:{ all -> 0x007f }
            if (r7 != 0) goto L_0x0a35
            r5.H0()     // Catch:{ all -> 0x007f }
            r5.n1()     // Catch:{ all -> 0x007f }
        L_0x0a35:
            boolean r7 = com.google.android.gms.internal.measurement.zzrl.a()     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0b57
            com.google.android.gms.measurement.internal.zzah r7 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r8 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r8.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r9 = com.google.android.gms.measurement.internal.zzbj.H0     // Catch:{ all -> 0x007f }
            boolean r7 = r7.H(r8, r9)     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0b57
            r42.y0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r7 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.C2()     // Catch:{ all -> 0x007f }
            boolean r7 = com.google.android.gms.measurement.internal.zzop.D0(r7)     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0b57
            com.google.android.gms.internal.measurement.zzgn$zzk r7 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzjc r7 = r1.U(r7)     // Catch:{ all -> 0x007f }
            boolean r7 = r7.A()     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0b57
            com.google.android.gms.internal.measurement.zzgn$zzk r7 = r4.f26926a     // Catch:{ all -> 0x007f }
            boolean r7 = r7.r0()     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0b57
            r7 = 0
        L_0x0a75:
            int r8 = r5.g0()     // Catch:{ all -> 0x007f }
            if (r7 >= r8) goto L_0x0b57
            com.google.android.gms.internal.measurement.zzgn$zzf r8 = r5.z(r7)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r8 = r8.z()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r8 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r8     // Catch:{ all -> 0x007f }
            java.util.List r9 = r8.U()     // Catch:{ all -> 0x007f }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x007f }
        L_0x0a8d:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x007f }
            if (r10 == 0) goto L_0x0b53
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r10 = (com.google.android.gms.internal.measurement.zzgn.zzh) r10     // Catch:{ all -> 0x007f }
            java.lang.String r10 = r10.a0()     // Catch:{ all -> 0x007f }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x007f }
            if (r10 == 0) goto L_0x0a8d
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = r4.f26926a     // Catch:{ all -> 0x007f }
            int r9 = r9.n()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzah r10 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r12 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r12 = r12.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r13 = com.google.android.gms.measurement.internal.zzbj.Y     // Catch:{ all -> 0x007f }
            int r10 = r10.y(r12, r13)     // Catch:{ all -> 0x007f }
            if (r9 < r10) goto L_0x0b48
            com.google.android.gms.measurement.internal.zzah r9 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r10 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r10 = r10.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r12 = com.google.android.gms.measurement.internal.zzbj.J0     // Catch:{ all -> 0x007f }
            boolean r9 = r9.H(r10, r12)     // Catch:{ all -> 0x007f }
            if (r9 == 0) goto L_0x0aef
            com.google.android.gms.measurement.internal.zzop r9 = r42.y0()     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r9.U0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r10 = com.google.android.gms.internal.measurement.zzgn.zzh.Y()     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "_tu"
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r10 = r10.I(r12)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r10 = r10.K(r9)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r10 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r10 = (com.google.android.gms.internal.measurement.zzlc) r10     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r10 = (com.google.android.gms.internal.measurement.zzgn.zzh) r10     // Catch:{ all -> 0x007f }
            r8.J(r10)     // Catch:{ all -> 0x007f }
            goto L_0x0af0
        L_0x0aef:
            r9 = 0
        L_0x0af0:
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r10 = com.google.android.gms.internal.measurement.zzgn.zzh.Y()     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "_tr"
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r10 = r10.I(r12)     // Catch:{ all -> 0x007f }
            r12 = 1
            com.google.android.gms.internal.measurement.zzgn$zzh$zza r10 = r10.B(r12)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r10 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r10 = (com.google.android.gms.internal.measurement.zzlc) r10     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r10 = (com.google.android.gms.internal.measurement.zzgn.zzh) r10     // Catch:{ all -> 0x007f }
            r8.J(r10)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzol r10 = r42.x0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r12 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r12 = r12.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zznk r9 = r10.I(r12, r5, r8, r9)     // Catch:{ all -> 0x007f }
            if (r9 == 0) goto L_0x0b48
            com.google.android.gms.measurement.internal.zzgi r10 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r10 = r10.K()     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "Generated trigger URI. appId, uri"
            com.google.android.gms.internal.measurement.zzgn$zzk r13 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r13 = r13.C2()     // Catch:{ all -> 0x007f }
            java.lang.String r14 = r9.f26882z     // Catch:{ all -> 0x007f }
            r10.c(r12, r13, r14)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r10 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r12 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r12 = r12.C2()     // Catch:{ all -> 0x007f }
            r10.m0(r12, r9)     // Catch:{ all -> 0x007f }
            java.util.Set r9 = r1.f26916q     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r10 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r10 = r10.C2()     // Catch:{ all -> 0x007f }
            r9.add(r10)     // Catch:{ all -> 0x007f }
        L_0x0b48:
            com.google.android.gms.internal.measurement.zzml r8 = r8.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r8 = (com.google.android.gms.internal.measurement.zzlc) r8     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r8 = (com.google.android.gms.internal.measurement.zzgn.zzf) r8     // Catch:{ all -> 0x007f }
            r5.G(r7, r8)     // Catch:{ all -> 0x007f }
        L_0x0b53:
            int r7 = r7 + 1
            goto L_0x0a75
        L_0x0b57:
            boolean r7 = com.google.android.gms.internal.measurement.zzpd.a()     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0b9c
            com.google.android.gms.measurement.internal.zzah r7 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.d1     // Catch:{ all -> 0x007f }
            boolean r7 = r7.t(r8)     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0b9c
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r7 = r5.L0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzv r8 = r42.d0()     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r5.r1()     // Catch:{ all -> 0x007f }
            java.util.List r10 = r5.U()     // Catch:{ all -> 0x007f }
            java.util.List r11 = r5.V()     // Catch:{ all -> 0x007f }
            long r12 = r5.x0()     // Catch:{ all -> 0x007f }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x007f }
            long r13 = r5.s0()     // Catch:{ all -> 0x007f }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x007f }
            boolean r6 = r6.B()     // Catch:{ all -> 0x007f }
            r14 = 1
            r6 = r6 ^ r14
            r14 = r6
            java.util.List r6 = r8.A(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x007f }
            r7.P(r6)     // Catch:{ all -> 0x007f }
            goto L_0x0bc7
        L_0x0b9c:
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r6 = r5.L0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzv r7 = r42.d0()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = r5.r1()     // Catch:{ all -> 0x007f }
            java.util.List r9 = r5.U()     // Catch:{ all -> 0x007f }
            java.util.List r10 = r5.V()     // Catch:{ all -> 0x007f }
            long r11 = r5.x0()     // Catch:{ all -> 0x007f }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x007f }
            long r12 = r5.s0()     // Catch:{ all -> 0x007f }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x007f }
            java.util.List r7 = r7.z(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x007f }
            r6.P(r7)     // Catch:{ all -> 0x007f }
        L_0x0bc7:
            com.google.android.gms.measurement.internal.zzah r6 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r7 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.C2()     // Catch:{ all -> 0x007f }
            boolean r6 = r6.Q(r7)     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x0ecf
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            r7.<init>()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzop r8 = r42.y0()     // Catch:{ all -> 0x007f }
            java.security.SecureRandom r8 = r8.W0()     // Catch:{ all -> 0x007f }
            r9 = 0
        L_0x0bea:
            int r10 = r5.g0()     // Catch:{ all -> 0x007f }
            if (r9 >= r10) goto L_0x0e98
            com.google.android.gms.internal.measurement.zzgn$zzf r10 = r5.z(r9)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc$zzb r10 = r10.z()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r10 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r10     // Catch:{ all -> 0x007f }
            java.lang.String r11 = r10.T()     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "_sr"
            if (r11 == 0) goto L_0x0c87
            r42.x0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r11 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r11 = (com.google.android.gms.internal.measurement.zzlc) r11     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r11 = (com.google.android.gms.internal.measurement.zzgn.zzf) r11     // Catch:{ all -> 0x007f }
            java.lang.String r13 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzol.g0(r11, r13)     // Catch:{ all -> 0x007f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x007f }
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzbd r13 = (com.google.android.gms.measurement.internal.zzbd) r13     // Catch:{ all -> 0x007f }
            if (r13 != 0) goto L_0x0c3c
            com.google.android.gms.measurement.internal.zzam r13 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r14 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r14 = r14.C2()     // Catch:{ all -> 0x007f }
            java.lang.Object r15 = com.google.android.gms.common.internal.Preconditions.m(r11)     // Catch:{ all -> 0x007f }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzbd r13 = r13.K0(r14, r15)     // Catch:{ all -> 0x007f }
            if (r13 == 0) goto L_0x0c3c
            r6.put(r11, r13)     // Catch:{ all -> 0x007f }
        L_0x0c3c:
            if (r13 == 0) goto L_0x0c7b
            java.lang.Long r11 = r13.f26249i     // Catch:{ all -> 0x007f }
            if (r11 != 0) goto L_0x0c7b
            java.lang.Long r11 = r13.f26250j     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0c58
            long r14 = r11.longValue()     // Catch:{ all -> 0x007f }
            r18 = 1
            int r11 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x0c58
            r42.x0()     // Catch:{ all -> 0x007f }
            java.lang.Long r11 = r13.f26250j     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzol.T(r10, r12, r11)     // Catch:{ all -> 0x007f }
        L_0x0c58:
            java.lang.Boolean r11 = r13.f26251k     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0c70
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0c70
            r42.x0()     // Catch:{ all -> 0x007f }
            java.lang.String r11 = "_efs"
            r12 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzol.T(r10, r11, r14)     // Catch:{ all -> 0x007f }
        L_0x0c70:
            com.google.android.gms.internal.measurement.zzml r11 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r11 = (com.google.android.gms.internal.measurement.zzlc) r11     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r11 = (com.google.android.gms.internal.measurement.zzgn.zzf) r11     // Catch:{ all -> 0x007f }
            r7.add(r11)     // Catch:{ all -> 0x007f }
        L_0x0c7b:
            r5.B(r9, r10)     // Catch:{ all -> 0x007f }
        L_0x0c7e:
            r15 = r4
            r1 = r5
            r45 = r8
            r2 = r9
            r8 = 1
            goto L_0x0e8b
        L_0x0c87:
            com.google.android.gms.measurement.internal.zzhg r11 = r42.r0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r13 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r13 = r13.C2()     // Catch:{ all -> 0x007f }
            long r13 = r11.y(r13)     // Catch:{ all -> 0x007f }
            r42.y0()     // Catch:{ all -> 0x007f }
            long r2 = r10.P()     // Catch:{ all -> 0x007f }
            long r2 = com.google.android.gms.measurement.internal.zzop.y(r2, r13)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r11 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r11 = (com.google.android.gms.internal.measurement.zzlc) r11     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r11 = (com.google.android.gms.internal.measurement.zzgn.zzf) r11     // Catch:{ all -> 0x007f }
            java.lang.String r15 = "_dbg"
            r18 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x007f }
            boolean r18 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x007f }
            if (r18 != 0) goto L_0x0cea
            java.util.List r11 = r11.Z()     // Catch:{ all -> 0x007f }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x007f }
        L_0x0cbe:
            boolean r18 = r11.hasNext()     // Catch:{ all -> 0x007f }
            if (r18 == 0) goto L_0x0cea
            java.lang.Object r18 = r11.next()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzh r18 = (com.google.android.gms.internal.measurement.zzgn.zzh) r18     // Catch:{ all -> 0x007f }
            r45 = r11
            java.lang.String r11 = r18.a0()     // Catch:{ all -> 0x007f }
            boolean r11 = r15.equals(r11)     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x0ce7
            long r21 = r18.W()     // Catch:{ all -> 0x007f }
            java.lang.Long r11 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x007f }
            boolean r1 = r1.equals(r11)     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x0ce5
            goto L_0x0cea
        L_0x0ce5:
            r11 = 1
            goto L_0x0cfd
        L_0x0ce7:
            r11 = r45
            goto L_0x0cbe
        L_0x0cea:
            com.google.android.gms.measurement.internal.zzhg r1 = r42.r0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r11 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r11 = r11.C2()     // Catch:{ all -> 0x007f }
            java.lang.String r15 = r10.T()     // Catch:{ all -> 0x007f }
            int r1 = r1.I(r11, r15)     // Catch:{ all -> 0x007f }
            r11 = r1
        L_0x0cfd:
            if (r11 > 0) goto L_0x0d24
            com.google.android.gms.measurement.internal.zzgi r1 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.L()     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "Sample rate must be positive. event, rate"
            java.lang.String r3 = r10.T()     // Catch:{ all -> 0x007f }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007f }
            r1.c(r2, r3, r11)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r1 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r1 = (com.google.android.gms.internal.measurement.zzlc) r1     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r1 = (com.google.android.gms.internal.measurement.zzgn.zzf) r1     // Catch:{ all -> 0x007f }
            r7.add(r1)     // Catch:{ all -> 0x007f }
            r5.B(r9, r10)     // Catch:{ all -> 0x007f }
            goto L_0x0c7e
        L_0x0d24:
            java.lang.String r1 = r10.T()     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r6.get(r1)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzbd r1 = (com.google.android.gms.measurement.internal.zzbd) r1     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x0d83
            com.google.android.gms.measurement.internal.zzam r1 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r15 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r15 = r15.C2()     // Catch:{ all -> 0x007f }
            r21 = r13
            java.lang.String r13 = r10.T()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzbd r1 = r1.K0(r15, r13)     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x0d85
            com.google.android.gms.measurement.internal.zzgi r1 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.L()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzgn$zzk r14 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r14 = r14.C2()     // Catch:{ all -> 0x007f }
            java.lang.String r15 = r10.T()     // Catch:{ all -> 0x007f }
            r1.c(r13, r14, r15)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzbd r1 = new com.google.android.gms.measurement.internal.zzbd     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r13 = r4.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r25 = r13.C2()     // Catch:{ all -> 0x007f }
            java.lang.String r26 = r10.T()     // Catch:{ all -> 0x007f }
            long r33 = r10.P()     // Catch:{ all -> 0x007f }
            r39 = 0
            r40 = 0
            r27 = 1
            r29 = 1
            r31 = 1
            r35 = 0
            r37 = 0
            r38 = 0
            r24 = r1
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x007f }
            goto L_0x0d85
        L_0x0d83:
            r21 = r13
        L_0x0d85:
            r42.x0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r13 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r13 = (com.google.android.gms.internal.measurement.zzlc) r13     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r13 = (com.google.android.gms.internal.measurement.zzgn.zzf) r13     // Catch:{ all -> 0x007f }
            java.lang.String r14 = "_eid"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzol.g0(r13, r14)     // Catch:{ all -> 0x007f }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x007f }
            if (r13 == 0) goto L_0x0d9d
            r14 = 1
        L_0x0d9b:
            r15 = 1
            goto L_0x0d9f
        L_0x0d9d:
            r14 = 0
            goto L_0x0d9b
        L_0x0d9f:
            if (r11 != r15) goto L_0x0dcb
            com.google.android.gms.internal.measurement.zzml r2 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r2 = (com.google.android.gms.internal.measurement.zzlc) r2     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r2 = (com.google.android.gms.internal.measurement.zzgn.zzf) r2     // Catch:{ all -> 0x007f }
            r7.add(r2)     // Catch:{ all -> 0x007f }
            if (r14 == 0) goto L_0x0dc6
            java.lang.Long r2 = r1.f26249i     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x0dba
            java.lang.Long r2 = r1.f26250j     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x0dba
            java.lang.Boolean r2 = r1.f26251k     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0dc6
        L_0x0dba:
            r2 = 0
            com.google.android.gms.measurement.internal.zzbd r1 = r1.c(r2, r2, r2)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r10.T()     // Catch:{ all -> 0x007f }
            r6.put(r2, r1)     // Catch:{ all -> 0x007f }
        L_0x0dc6:
            r5.B(r9, r10)     // Catch:{ all -> 0x007f }
            goto L_0x0c7e
        L_0x0dcb:
            int r15 = r8.nextInt(r11)     // Catch:{ all -> 0x007f }
            if (r15 != 0) goto L_0x0e0d
            r42.x0()     // Catch:{ all -> 0x007f }
            r15 = r4
            r25 = r5
            long r4 = (long) r11     // Catch:{ all -> 0x007f }
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzol.T(r10, r12, r11)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r11 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r11 = (com.google.android.gms.internal.measurement.zzlc) r11     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r11 = (com.google.android.gms.internal.measurement.zzgn.zzf) r11     // Catch:{ all -> 0x007f }
            r7.add(r11)     // Catch:{ all -> 0x007f }
            if (r14 == 0) goto L_0x0df5
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007f }
            r5 = 0
            com.google.android.gms.measurement.internal.zzbd r1 = r1.c(r5, r4, r5)     // Catch:{ all -> 0x007f }
        L_0x0df5:
            java.lang.String r4 = r10.T()     // Catch:{ all -> 0x007f }
            long r11 = r10.P()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzbd r1 = r1.b(r11, r2)     // Catch:{ all -> 0x007f }
            r6.put(r4, r1)     // Catch:{ all -> 0x007f }
            r45 = r8
            r2 = r9
            r1 = r25
            r8 = 1
            goto L_0x0e88
        L_0x0e0d:
            r15 = r4
            r25 = r5
            java.lang.Long r4 = r1.f26248h     // Catch:{ all -> 0x007f }
            if (r4 == 0) goto L_0x0e1d
            long r4 = r4.longValue()     // Catch:{ all -> 0x007f }
            r45 = r8
            r18 = r9
            goto L_0x0e2e
        L_0x0e1d:
            r42.y0()     // Catch:{ all -> 0x007f }
            long r4 = r10.M()     // Catch:{ all -> 0x007f }
            r45 = r8
            r18 = r9
            r8 = r21
            long r4 = com.google.android.gms.measurement.internal.zzop.y(r4, r8)     // Catch:{ all -> 0x007f }
        L_0x0e2e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0e77
            r42.x0()     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "_efs"
            r8 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzol.T(r10, r4, r5)     // Catch:{ all -> 0x007f }
            r42.x0()     // Catch:{ all -> 0x007f }
            long r4 = (long) r11     // Catch:{ all -> 0x007f }
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzol.T(r10, r12, r11)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r11 = r10.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r11 = (com.google.android.gms.internal.measurement.zzlc) r11     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzf r11 = (com.google.android.gms.internal.measurement.zzgn.zzf) r11     // Catch:{ all -> 0x007f }
            r7.add(r11)     // Catch:{ all -> 0x007f }
            if (r14 == 0) goto L_0x0e63
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007f }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x007f }
            r11 = 0
            com.google.android.gms.measurement.internal.zzbd r1 = r1.c(r11, r4, r5)     // Catch:{ all -> 0x007f }
        L_0x0e63:
            java.lang.String r4 = r10.T()     // Catch:{ all -> 0x007f }
            long r11 = r10.P()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzbd r1 = r1.b(r11, r2)     // Catch:{ all -> 0x007f }
            r6.put(r4, r1)     // Catch:{ all -> 0x007f }
        L_0x0e72:
            r2 = r18
            r1 = r25
            goto L_0x0e88
        L_0x0e77:
            r8 = 1
            if (r14 == 0) goto L_0x0e72
            java.lang.String r2 = r10.T()     // Catch:{ all -> 0x007f }
            r3 = 0
            com.google.android.gms.measurement.internal.zzbd r1 = r1.c(r13, r3, r3)     // Catch:{ all -> 0x007f }
            r6.put(r2, r1)     // Catch:{ all -> 0x007f }
            goto L_0x0e72
        L_0x0e88:
            r1.B(r2, r10)     // Catch:{ all -> 0x007f }
        L_0x0e8b:
            int r2 = r2 + 1
            r8 = r45
            r5 = r1
            r9 = r2
            r4 = r15
            r2 = 0
            r1 = r42
            goto L_0x0bea
        L_0x0e98:
            r15 = r4
            r1 = r5
            int r2 = r7.size()     // Catch:{ all -> 0x007f }
            int r3 = r1.g0()     // Catch:{ all -> 0x007f }
            if (r2 >= r3) goto L_0x0eab
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r2 = r1.Z0()     // Catch:{ all -> 0x007f }
            r2.c0(r7)     // Catch:{ all -> 0x007f }
        L_0x0eab:
            java.util.Set r2 = r6.entrySet()     // Catch:{ all -> 0x007f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007f }
        L_0x0eb3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0ecd
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007f }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r4 = r42.l0()     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzbd r3 = (com.google.android.gms.measurement.internal.zzbd) r3     // Catch:{ all -> 0x007f }
            r4.U(r3)     // Catch:{ all -> 0x007f }
            goto L_0x0eb3
        L_0x0ecd:
            r2 = r15
            goto L_0x0ed1
        L_0x0ecf:
            r1 = r5
            r2 = r4
        L_0x0ed1:
            com.google.android.gms.internal.measurement.zzgn$zzk r3 = r2.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r3 = r3.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r4 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzh r4 = r4.L0(r3)     // Catch:{ all -> 0x007f }
            if (r4 != 0) goto L_0x0efa
            com.google.android.gms.measurement.internal.zzgi r4 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzgn$zzk r6 = r2.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r6 = r6.C2()     // Catch:{ all -> 0x007f }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r6)     // Catch:{ all -> 0x007f }
            r4.b(r5, r6)     // Catch:{ all -> 0x007f }
            goto L_0x0f86
        L_0x0efa:
            int r5 = r1.g0()     // Catch:{ all -> 0x007f }
            if (r5 <= 0) goto L_0x0f86
            long r5 = r4.D0()     // Catch:{ all -> 0x007f }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0f0e
            r1.E0(r5)     // Catch:{ all -> 0x007f }
            goto L_0x0f11
        L_0x0f0e:
            r1.h1()     // Catch:{ all -> 0x007f }
        L_0x0f11:
            long r7 = r4.H0()     // Catch:{ all -> 0x007f }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0f1c
            goto L_0x0f1d
        L_0x0f1c:
            r5 = r7
        L_0x0f1d:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0f25
            r1.J0(r5)     // Catch:{ all -> 0x007f }
            goto L_0x0f28
        L_0x0f25:
            r1.j1()     // Catch:{ all -> 0x007f }
        L_0x0f28:
            boolean r5 = com.google.android.gms.internal.measurement.zzrw.a()     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0f58
            com.google.android.gms.measurement.internal.zzah r5 = r42.i0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.x0     // Catch:{ all -> 0x007f }
            boolean r5 = r5.t(r6)     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0f58
            r42.y0()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = r4.l()     // Catch:{ all -> 0x007f }
            boolean r5 = com.google.android.gms.measurement.internal.zzop.H0(r5)     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0f58
            int r5 = r1.g0()     // Catch:{ all -> 0x007f }
            long r5 = (long) r5     // Catch:{ all -> 0x007f }
            r4.c(r5)     // Catch:{ all -> 0x007f }
            long r5 = r4.B0()     // Catch:{ all -> 0x007f }
            int r5 = (int) r5     // Catch:{ all -> 0x007f }
            r1.D0(r5)     // Catch:{ all -> 0x007f }
            goto L_0x0f5b
        L_0x0f58:
            r4.y()     // Catch:{ all -> 0x007f }
        L_0x0f5b:
            long r5 = r4.F0()     // Catch:{ all -> 0x007f }
            int r5 = (int) r5     // Catch:{ all -> 0x007f }
            r1.y0(r5)     // Catch:{ all -> 0x007f }
            long r5 = r1.x0()     // Catch:{ all -> 0x007f }
            r4.C0(r5)     // Catch:{ all -> 0x007f }
            long r5 = r1.s0()     // Catch:{ all -> 0x007f }
            r4.y0(r5)     // Catch:{ all -> 0x007f }
            java.lang.String r5 = r4.k()     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0f7b
            r1.g1(r5)     // Catch:{ all -> 0x007f }
            goto L_0x0f7e
        L_0x0f7b:
            r1.d1()     // Catch:{ all -> 0x007f }
        L_0x0f7e:
            com.google.android.gms.measurement.internal.zzam r5 = r42.l0()     // Catch:{ all -> 0x007f }
            r6 = 0
            r5.V(r4, r6, r6)     // Catch:{ all -> 0x007f }
        L_0x0f86:
            int r4 = r1.g0()     // Catch:{ all -> 0x007f }
            if (r4 <= 0) goto L_0x0fe5
            com.google.android.gms.measurement.internal.zzhg r4 = r42.r0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r5 = r2.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r5 = r5.C2()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzfx$zzd r4 = r4.L(r5)     // Catch:{ all -> 0x007f }
            if (r4 == 0) goto L_0x0fab
            boolean r5 = r4.e0()     // Catch:{ all -> 0x007f }
            if (r5 != 0) goto L_0x0fa3
            goto L_0x0fab
        L_0x0fa3:
            long r4 = r4.N()     // Catch:{ all -> 0x007f }
            r1.b0(r4)     // Catch:{ all -> 0x007f }
            goto L_0x0fd4
        L_0x0fab:
            com.google.android.gms.internal.measurement.zzgn$zzk r4 = r2.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r4 = r4.h0()     // Catch:{ all -> 0x007f }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x007f }
            if (r4 == 0) goto L_0x0fbd
            r4 = -1
            r1.b0(r4)     // Catch:{ all -> 0x007f }
            goto L_0x0fd4
        L_0x0fbd:
            com.google.android.gms.measurement.internal.zzgi r4 = r42.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzgn$zzk r6 = r2.f26926a     // Catch:{ all -> 0x007f }
            java.lang.String r6 = r6.C2()     // Catch:{ all -> 0x007f }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r6)     // Catch:{ all -> 0x007f }
            r4.b(r5, r6)     // Catch:{ all -> 0x007f }
        L_0x0fd4:
            com.google.android.gms.measurement.internal.zzam r4 = r42.l0()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzml r1 = r1.F()     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzlc r1 = (com.google.android.gms.internal.measurement.zzlc) r1     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.measurement.zzgn$zzk r1 = (com.google.android.gms.internal.measurement.zzgn.zzk) r1     // Catch:{ all -> 0x007f }
            r13 = r17
            r4.e0(r1, r13)     // Catch:{ all -> 0x007f }
        L_0x0fe5:
            com.google.android.gms.measurement.internal.zzam r1 = r42.l0()     // Catch:{ all -> 0x007f }
            java.util.List r2 = r2.f26927b     // Catch:{ all -> 0x007f }
            com.google.android.gms.common.internal.Preconditions.m(r2)     // Catch:{ all -> 0x007f }
            r1.n()     // Catch:{ all -> 0x007f }
            r1.u()     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x007f }
            r13 = 0
        L_0x0ffc:
            int r5 = r2.size()     // Catch:{ all -> 0x007f }
            if (r13 >= r5) goto L_0x1019
            if (r13 == 0) goto L_0x1009
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ all -> 0x007f }
        L_0x1009:
            java.lang.Object r5 = r2.get(r13)     // Catch:{ all -> 0x007f }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x007f }
            long r5 = r5.longValue()     // Catch:{ all -> 0x007f }
            r4.append(r5)     // Catch:{ all -> 0x007f }
            int r13 = r13 + 1
            goto L_0x0ffc
        L_0x1019:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x007f }
            android.database.sqlite.SQLiteDatabase r5 = r1.B()     // Catch:{ all -> 0x007f }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007f }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x007f }
            int r5 = r2.size()     // Catch:{ all -> 0x007f }
            if (r4 == r5) goto L_0x104c
            com.google.android.gms.measurement.internal.zzgi r1 = r1.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007f }
            int r2 = r2.size()     // Catch:{ all -> 0x007f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007f }
            r1.c(r5, r4, r2)     // Catch:{ all -> 0x007f }
        L_0x104c:
            com.google.android.gms.measurement.internal.zzam r1 = r42.l0()     // Catch:{ all -> 0x007f }
            android.database.sqlite.SQLiteDatabase r2 = r1.B()     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            java.lang.String[] r5 = new java.lang.String[]{r3, r3}     // Catch:{ SQLiteException -> 0x105e }
            r2.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x105e }
            goto L_0x1071
        L_0x105e:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzgi r1 = r1.m()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgi.v(r3)     // Catch:{ all -> 0x007f }
            r1.c(r4, r3, r2)     // Catch:{ all -> 0x007f }
        L_0x1071:
            com.google.android.gms.measurement.internal.zzam r1 = r42.l0()     // Catch:{ all -> 0x007f }
            r1.i1()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r1 = r42.l0()
            r1.g1()
            r1 = 1
            return r1
        L_0x1081:
            com.google.android.gms.measurement.internal.zzam r1 = r42.l0()     // Catch:{ all -> 0x007f }
            r1.i1()     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.zzam r1 = r42.l0()
            r1.g1()
            r1 = 0
            return r1
        L_0x1091:
            if (r5 == 0) goto L_0x1096
            r5.close()     // Catch:{ all -> 0x007f }
        L_0x1096:
            throw r1     // Catch:{ all -> 0x007f }
        L_0x1097:
            com.google.android.gms.measurement.internal.zzam r2 = r42.l0()
            r2.g1()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.N(java.lang.String, long):boolean");
    }

    public final zzjc U(String str) {
        f().n();
        A0();
        zzjc zzjc = (zzjc) this.f26899B.get(str);
        if (zzjc == null) {
            zzjc = l0().T0(str);
            if (zzjc == null) {
                zzjc = zzjc.f26593c;
            }
            E(str, zzjc);
        }
        return zzjc;
    }

    public final String V(zzp zzp) {
        try {
            return (String) f().w(new zzob(this, zzp)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            m().G().c("Failed to get app instance id. appId", zzgi.v(zzp.f26977z), e2);
            return null;
        }
    }

    public final void W(zzaf zzaf) {
        zzp c0 = c0((String) Preconditions.m(zzaf.f26176z));
        if (c0 != null) {
            X(zzaf, c0);
        }
    }

    public final void X(zzaf zzaf, zzp zzp) {
        boolean z2;
        Preconditions.m(zzaf);
        Preconditions.g(zzaf.f26176z);
        Preconditions.m(zzaf.f26174A);
        Preconditions.m(zzaf.f26175B);
        Preconditions.g(zzaf.f26175B.f26959A);
        f().n();
        A0();
        if (s0(zzp)) {
            if (!zzp.G) {
                i(zzp);
                return;
            }
            zzaf zzaf2 = new zzaf(zzaf);
            boolean z3 = false;
            zzaf2.D = false;
            l0().b1();
            try {
                zzaf H0 = l0().H0((String) Preconditions.m(zzaf2.f26176z), zzaf2.f26175B.f26959A);
                if (H0 != null && !H0.f26174A.equals(zzaf2.f26174A)) {
                    m().L().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f26911l.D().g(zzaf2.f26175B.f26959A), zzaf2.f26174A, H0.f26174A);
                }
                if (H0 != null && (z2 = H0.D)) {
                    zzaf2.f26174A = H0.f26174A;
                    zzaf2.C = H0.C;
                    zzaf2.G = H0.G;
                    zzaf2.E = H0.E;
                    zzaf2.H = H0.H;
                    zzaf2.D = z2;
                    zzok zzok = zzaf2.f26175B;
                    zzaf2.f26175B = new zzok(zzok.f26959A, H0.f26175B.f26960B, zzok.H(), H0.f26175B.E);
                } else if (TextUtils.isEmpty(zzaf2.E)) {
                    zzok zzok2 = zzaf2.f26175B;
                    zzaf2.f26175B = new zzok(zzok2.f26959A, zzaf2.C, zzok2.H(), zzaf2.f26175B.E);
                    z3 = true;
                    zzaf2.D = true;
                }
                if (zzaf2.D) {
                    zzok zzok3 = zzaf2.f26175B;
                    zzom zzom = new zzom((String) Preconditions.m(zzaf2.f26176z), zzaf2.f26174A, zzok3.f26959A, zzok3.f26960B, Preconditions.m(zzok3.H()));
                    if (l0().h0(zzom)) {
                        m().F().d("User property updated immediately", zzaf2.f26176z, this.f26911l.D().g(zzom.f26964c), zzom.f26966e);
                    } else {
                        m().G().d("(2)Too many active user properties, ignoring", zzgi.v(zzaf2.f26176z), this.f26911l.D().g(zzom.f26964c), zzom.f26966e);
                    }
                    if (z3 && zzaf2.H != null) {
                        e0(new zzbh(zzaf2.H, zzaf2.C), zzp);
                    }
                }
                if (l0().f0(zzaf2)) {
                    m().F().d("Conditional property added", zzaf2.f26176z, this.f26911l.D().g(zzaf2.f26175B.f26959A), zzaf2.f26175B.H());
                } else {
                    m().G().d("Too many conditional properties, ignoring", zzgi.v(zzaf2.f26176z), this.f26911l.D().g(zzaf2.f26175B.f26959A), zzaf2.f26175B.H());
                }
                l0().i1();
                l0().g1();
            } catch (Throwable th) {
                l0().g1();
                throw th;
            }
        }
    }

    public final void Y(zzbh zzbh, zzp zzp) {
        Preconditions.g(zzp.f26977z);
        zzgm b2 = zzgm.b(zzbh);
        y0().N(b2.f26343d, l0().J0(zzp.f26977z));
        y0().W(b2, i0().x(zzp.f26977z));
        zzbh a2 = b2.a();
        if ("_cmp".equals(a2.f26256z) && "referrer API v2".equals(a2.f26254A.o0("_cis"))) {
            String o0 = a2.f26254A.o0("gclid");
            if (!TextUtils.isEmpty(o0)) {
                y(new zzok("_lgclid", a2.C, o0, "auto"), zzp);
            }
        }
        u(a2, zzp);
    }

    public final void Z(zzh zzh) {
        zzh zzh2 = zzh;
        f().n();
        if (!TextUtils.isEmpty(zzh.q()) || !TextUtils.isEmpty(zzh.j())) {
            ArrayMap arrayMap = null;
            if (!zzqt.a() || !i0().t(zzbj.D0)) {
                String v2 = this.f26909j.v(zzh2);
                try {
                    String str = (String) Preconditions.m(zzh.l());
                    URL url = new URL(v2);
                    m().K().b("Fetching remote configuration", str);
                    zzfx.zzd L = r0().L(str);
                    String Q = r0().Q(str);
                    if (L != null) {
                        if (!TextUtils.isEmpty(Q)) {
                            arrayMap = new ArrayMap();
                            arrayMap.put("If-Modified-Since", Q);
                        }
                        String O = r0().O(str);
                        if (!TextUtils.isEmpty(O)) {
                            if (arrayMap == null) {
                                arrayMap = new ArrayMap();
                            }
                            arrayMap.put("If-None-Match", O);
                        }
                    }
                    this.f26919t = true;
                    zzgp p0 = p0();
                    zzny zzny = new zzny(this);
                    p0.n();
                    p0.u();
                    Preconditions.m(url);
                    Preconditions.m(zzny);
                    p0.f().z(new zzgt(p0, str, url, (byte[]) null, arrayMap, zzny));
                } catch (MalformedURLException unused) {
                    m().G().c("Failed to parse config URL. Not fetching. appId", zzgi.v(zzh.l()), v2);
                }
            } else {
                String str2 = (String) Preconditions.m(zzh.l());
                m().K().b("Fetching remote configuration", str2);
                zzfx.zzd L2 = r0().L(str2);
                String Q2 = r0().Q(str2);
                if (L2 != null) {
                    if (!TextUtils.isEmpty(Q2)) {
                        arrayMap = new ArrayMap();
                        arrayMap.put("If-Modified-Since", Q2);
                    }
                    String O2 = r0().O(str2);
                    if (!TextUtils.isEmpty(O2)) {
                        if (arrayMap == null) {
                            arrayMap = new ArrayMap();
                        }
                        arrayMap.put("If-None-Match", O2);
                    }
                }
                ArrayMap arrayMap2 = arrayMap;
                this.f26919t = true;
                zzgp p02 = p0();
                zznu zznu = new zznu(this);
                p02.n();
                p02.u();
                Preconditions.m(zzh);
                Preconditions.m(zznu);
                String v3 = p02.t().v(zzh2);
                try {
                    zzgp zzgp = p02;
                    p02.f().z(new zzgt(zzgp, zzh.l(), new URI(v3).toURL(), (byte[]) null, arrayMap2, zznu));
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
                    p02.m().G().c("Failed to parse config URL. Not fetching. appId", zzgi.v(zzh.l()), v3);
                }
            }
        } else {
            B((String) Preconditions.m(zzh.l()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    public final Context a() {
        return this.f26911l.a();
    }

    public final void a0(zzh zzh, zzgn.zzk.zza zza2) {
        f().n();
        A0();
        zzgn.zza.C0005zza S = zzgn.zza.S();
        byte[] E2 = zzh.E();
        if (E2 != null) {
            try {
                S = (zzgn.zza.C0005zza) zzol.G(S, E2);
            } catch (zzlk unused) {
                m().L().b("Failed to parse locally stored ad campaign info. appId", zzgi.v(zzh.l()));
            }
        }
        for (zzgn.zzf zzf : zza2.U()) {
            if (zzf.Y().equals("_cmp")) {
                String str = (String) zzol.J(zzf, "gclid", "");
                String str2 = (String) zzol.J(zzf, "gbraid", "");
                String str3 = (String) zzol.J(zzf, "gad_source", "");
                if (!str.isEmpty() || !str2.isEmpty()) {
                    long longValue = ((Long) zzol.J(zzf, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzf.V();
                    }
                    if ("referrer API v2".equals(zzol.g0(zzf, "_cis"))) {
                        if (longValue > S.G()) {
                            if (str.isEmpty()) {
                                S.U();
                            } else {
                                S.R(str);
                            }
                            if (str2.isEmpty()) {
                                S.T();
                            } else {
                                S.O(str2);
                            }
                            if (str3.isEmpty()) {
                                S.P();
                            } else {
                                S.M(str3);
                            }
                            S.H(longValue);
                        }
                    } else if (longValue > S.y()) {
                        if (str.isEmpty()) {
                            S.N();
                        } else {
                            S.K(str);
                        }
                        if (str2.isEmpty()) {
                            S.L();
                        } else {
                            S.I(str2);
                        }
                        if (str3.isEmpty()) {
                            S.J();
                        } else {
                            S.B(str3);
                        }
                        S.z(longValue);
                    }
                }
            }
        }
        if (!((zzgn.zza) ((zzlc) S.F())).equals(zzgn.zza.Y())) {
            zza2.J((zzgn.zza) ((zzlc) S.F()));
        }
        zzh.i(((zzgn.zza) ((zzlc) S.F())).m());
        if (zzh.B()) {
            l0().V(zzh, false, false);
        }
    }

    public final Clock b() {
        return ((zzhw) Preconditions.m(this.f26911l)).b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0146 A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0154 A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017a A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017e A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzhp r0 = r6.f()
            r0.n()
            r6.A0()
            com.google.android.gms.common.internal.Preconditions.g(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0016
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r7 = move-exception
            goto L_0x01c9
        L_0x0016:
            com.google.android.gms.measurement.internal.zzgi r1 = r6.m()     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0013 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0013 }
            r1.b(r2, r3)     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.zzam r1 = r6.l0()     // Catch:{ all -> 0x0013 }
            r1.b1()     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.zzam r1 = r6.l0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzh r1 = r1.L0(r7)     // Catch:{ all -> 0x005d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L_0x0043
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0043
            if (r8 != r3) goto L_0x0047
        L_0x0043:
            if (r9 != 0) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = r0
        L_0x0048:
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.zzgi r8 = r6.m()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzgk r8 = r8.L()     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgi.v(r7)     // Catch:{ all -> 0x005d }
            r8.b(r9, r7)     // Catch:{ all -> 0x005d }
            goto L_0x01ad
        L_0x005d:
            r7 = move-exception
            goto L_0x01c1
        L_0x0060:
            r4 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00bc
            if (r8 != r4) goto L_0x0067
            goto L_0x00bc
        L_0x0067:
            com.google.android.gms.common.util.Clock r10 = r6.b()     // Catch:{ all -> 0x005d }
            long r10 = r10.a()     // Catch:{ all -> 0x005d }
            r1.s0(r10)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzam r10 = r6.l0()     // Catch:{ all -> 0x005d }
            r10.V(r1, r0, r0)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzgi r10 = r6.m()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzgk r10 = r10.K()     // Catch:{ all -> 0x005d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x005d }
            r10.c(r11, r1, r9)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzhg r9 = r6.r0()     // Catch:{ all -> 0x005d }
            r9.U(r7)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzms r7 = r6.f26908i     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzgz r7 = r7.f26839i     // Catch:{ all -> 0x005d }
            com.google.android.gms.common.util.Clock r9 = r6.b()     // Catch:{ all -> 0x005d }
            long r9 = r9.a()     // Catch:{ all -> 0x005d }
            r7.b(r9)     // Catch:{ all -> 0x005d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a8
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b7
        L_0x00a8:
            com.google.android.gms.measurement.internal.zzms r7 = r6.f26908i     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzgz r7 = r7.f26837g     // Catch:{ all -> 0x005d }
            com.google.android.gms.common.util.Clock r8 = r6.b()     // Catch:{ all -> 0x005d }
            long r8 = r8.a()     // Catch:{ all -> 0x005d }
            r7.b(r8)     // Catch:{ all -> 0x005d }
        L_0x00b7:
            r6.Q()     // Catch:{ all -> 0x005d }
            goto L_0x01ad
        L_0x00bc:
            r9 = 0
            if (r11 == 0) goto L_0x00c8
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r11.get(r2)     // Catch:{ all -> 0x005d }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x005d }
            goto L_0x00c9
        L_0x00c8:
            r2 = r9
        L_0x00c9:
            if (r2 == 0) goto L_0x00d8
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x00d8
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x005d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x005d }
            goto L_0x00d9
        L_0x00d8:
            r2 = r9
        L_0x00d9:
            if (r11 == 0) goto L_0x00e4
            java.lang.String r5 = "ETag"
            java.lang.Object r11 = r11.get(r5)     // Catch:{ all -> 0x005d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x005d }
            goto L_0x00e5
        L_0x00e4:
            r11 = r9
        L_0x00e5:
            if (r11 == 0) goto L_0x00f4
            boolean r5 = r11.isEmpty()     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x00f4
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x005d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x005d }
            goto L_0x00f5
        L_0x00f4:
            r11 = r9
        L_0x00f5:
            if (r8 == r4) goto L_0x0111
            if (r8 != r3) goto L_0x00fa
            goto L_0x0111
        L_0x00fa:
            com.google.android.gms.measurement.internal.zzhg r9 = r6.r0()     // Catch:{ all -> 0x005d }
            boolean r9 = r9.H(r7, r10, r2, r11)     // Catch:{ all -> 0x005d }
            if (r9 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.zzam r7 = r6.l0()     // Catch:{ all -> 0x0013 }
            r7.g1()     // Catch:{ all -> 0x0013 }
            r6.f26919t = r0
            r6.O()
            return
        L_0x0111:
            com.google.android.gms.measurement.internal.zzhg r11 = r6.r0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.measurement.zzfx$zzd r11 = r11.L(r7)     // Catch:{ all -> 0x005d }
            if (r11 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.zzhg r11 = r6.r0()     // Catch:{ all -> 0x005d }
            boolean r9 = r11.H(r7, r9, r9, r9)     // Catch:{ all -> 0x005d }
            if (r9 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.zzam r7 = r6.l0()     // Catch:{ all -> 0x0013 }
            r7.g1()     // Catch:{ all -> 0x0013 }
            r6.f26919t = r0
            r6.O()
            return
        L_0x0132:
            com.google.android.gms.common.util.Clock r9 = r6.b()     // Catch:{ all -> 0x005d }
            long r2 = r9.a()     // Catch:{ all -> 0x005d }
            r1.R(r2)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzam r9 = r6.l0()     // Catch:{ all -> 0x005d }
            r9.V(r1, r0, r0)     // Catch:{ all -> 0x005d }
            if (r8 != r4) goto L_0x0154
            com.google.android.gms.measurement.internal.zzgi r8 = r6.m()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzgk r8 = r8.M()     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.b(r9, r7)     // Catch:{ all -> 0x005d }
            goto L_0x016a
        L_0x0154:
            com.google.android.gms.measurement.internal.zzgi r7 = r6.m()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzgk r7 = r7.K()     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x005d }
            int r10 = r10.length     // Catch:{ all -> 0x005d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x005d }
            r7.c(r9, r8, r10)     // Catch:{ all -> 0x005d }
        L_0x016a:
            com.google.android.gms.measurement.internal.zzgp r7 = r6.p0()     // Catch:{ all -> 0x005d }
            boolean r7 = r7.B()     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x017e
            boolean r7 = r6.R()     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x017e
            r6.E0()     // Catch:{ all -> 0x005d }
            goto L_0x01ad
        L_0x017e:
            com.google.android.gms.measurement.internal.zzah r7 = r6.i0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.A0     // Catch:{ all -> 0x005d }
            boolean r7 = r7.t(r8)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.zzgp r7 = r6.p0()     // Catch:{ all -> 0x005d }
            boolean r7 = r7.B()     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.zzam r7 = r6.l0()     // Catch:{ all -> 0x005d }
            java.lang.String r8 = r1.l()     // Catch:{ all -> 0x005d }
            boolean r7 = r7.f1(r8)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x01aa
            java.lang.String r7 = r1.l()     // Catch:{ all -> 0x005d }
            r6.k0(r7)     // Catch:{ all -> 0x005d }
            goto L_0x01ad
        L_0x01aa:
            r6.Q()     // Catch:{ all -> 0x005d }
        L_0x01ad:
            com.google.android.gms.measurement.internal.zzam r7 = r6.l0()     // Catch:{ all -> 0x005d }
            r7.i1()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.zzam r7 = r6.l0()     // Catch:{ all -> 0x0013 }
            r7.g1()     // Catch:{ all -> 0x0013 }
            r6.f26919t = r0
            r6.O()
            return
        L_0x01c1:
            com.google.android.gms.measurement.internal.zzam r8 = r6.l0()     // Catch:{ all -> 0x0013 }
            r8.g1()     // Catch:{ all -> 0x0013 }
            throw r7     // Catch:{ all -> 0x0013 }
        L_0x01c9:
            r6.f26919t = r0
            r6.O()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.B(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final int c(String str, zzai zzai) {
        zzh L0;
        zzjc.zza zza2;
        zzjb B2;
        if (this.f26900a.J(str) == null) {
            zzai.d(zzjc.zza.AD_PERSONALIZATION, zzal.FAILSAFE);
            return 1;
        } else if (!zzox.a() || !i0().t(zzbj.X0) || (L0 = l0().L0(str)) == null || zzd.a(L0.t()).b() != zzjb.POLICY || (B2 = this.f26900a.B(str, zza2)) == zzjb.UNINITIALIZED) {
            zzjc.zza zza3 = zzjc.zza.AD_PERSONALIZATION;
            zzai.d(zza3, zzal.REMOTE_DEFAULT);
            return this.f26900a.M(str, zza3) ? 0 : 1;
        } else {
            zzai.d((zza2 = zzjc.zza.AD_PERSONALIZATION), zzal.REMOTE_ENFORCED_DEFAULT);
            return B2 == zzjb.GRANTED ? 0 : 1;
        }
    }

    public final zzp c0(String str) {
        String str2 = str;
        zzh L0 = l0().L0(str2);
        if (L0 == null || TextUtils.isEmpty(L0.o())) {
            m().F().b("No app data available; dropping", str2);
            return null;
        }
        Boolean n2 = n(L0);
        if (n2 == null || n2.booleanValue()) {
            return new zzp(str, L0.q(), L0.o(), L0.U(), L0.n(), L0.z0(), L0.t0(), (String) null, L0.A(), false, L0.p(), L0.Q(), 0, 0, L0.z(), false, L0.j(), L0.K0(), L0.v0(), L0.w(), (String) null, U(str).z(), "", (String) null, L0.C(), L0.J0(), U(str).b(), g0(str).j(), L0.a(), L0.X(), L0.v(), L0.t());
        }
        m().G().b("App version does not match; dropping. appId", zzgi.v(str));
        return null;
    }

    public final int d(FileChannel fileChannel) {
        f().n();
        if (fileChannel == null || !fileChannel.isOpen()) {
            m().G().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    m().L().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e2) {
            m().G().b("Failed to read from channel", e2);
            return 0;
        }
    }

    public final zzv d0() {
        return (zzv) k(this.f26905f);
    }

    public final zzac e() {
        return this.f26911l.e();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x04f0: MOVE  (r5v20 java.lang.String) = (r27v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x0508 */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0319 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0398 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0514 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054f A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05c4 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0610 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x061d A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x062a A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0637 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0645 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0656 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x06ae A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x074a A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x075c A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x07a2 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x07fc A[SYNTHETIC, Splitter:B:291:0x07fc] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0824 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x089e A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x08b7 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0919 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0941 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x095f A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x09d6 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0a31 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e1 A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025a A[Catch:{ SQLiteException -> 0x02e3, all -> 0x01bb }] */
    public final void e0(com.google.android.gms.measurement.internal.zzbh r37, com.google.android.gms.measurement.internal.zzp r38) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            r3 = r38
            java.lang.String r4 = "_fx"
            java.lang.String r5 = "_sno"
            com.google.android.gms.common.internal.Preconditions.m(r38)
            java.lang.String r6 = r3.f26977z
            com.google.android.gms.common.internal.Preconditions.g(r6)
            long r6 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzhp r8 = r36.f()
            r8.n()
            r36.A0()
            java.lang.String r8 = r3.f26977z
            r36.x0()
            boolean r9 = com.google.android.gms.measurement.internal.zzol.e0(r37, r38)
            if (r9 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r9 = r3.G
            if (r9 != 0) goto L_0x0034
            r1.i(r3)
            return
        L_0x0034:
            com.google.android.gms.measurement.internal.zzhg r9 = r36.r0()
            java.lang.String r10 = r2.f26256z
            boolean r9 = r9.P(r8, r10)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r9 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzgi r3 = r36.m()
            com.google.android.gms.measurement.internal.zzgk r3 = r3.L()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r8)
            com.google.android.gms.measurement.internal.zzhw r5 = r1.f26911l
            com.google.android.gms.measurement.internal.zzgh r5 = r5.D()
            java.lang.String r6 = r2.f26256z
            java.lang.String r5 = r5.c(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzhg r3 = r36.r0()
            boolean r3 = r3.Y(r8)
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.zzhg r3 = r36.r0()
            boolean r3 = r3.a0(r8)
            if (r3 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r3 = 0
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            if (r3 != 0) goto L_0x0095
            java.lang.String r4 = r2.f26256z
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0095
            r36.y0()
            com.google.android.gms.measurement.internal.zzoo r9 = r1.G
            java.lang.String r13 = r2.f26256z
            r2 = 0
            r11 = 11
            java.lang.String r12 = "_ev"
            r10 = r8
            r4 = r14
            r14 = r2
            com.google.android.gms.measurement.internal.zzop.Z(r9, r10, r11, r12, r13, r14)
            goto L_0x0096
        L_0x0095:
            r4 = r14
        L_0x0096:
            if (r3 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()
            com.google.android.gms.measurement.internal.zzh r2 = r2.L0(r8)
            if (r2 == 0) goto L_0x00de
            long r5 = r2.x0()
            long r7 = r2.a0()
            long r5 = java.lang.Math.max(r5, r7)
            com.google.android.gms.common.util.Clock r3 = r36.b()
            long r7 = r3.a()
            long r7 = r7 - r5
            long r5 = java.lang.Math.abs(r7)
            r36.i0()
            com.google.android.gms.measurement.internal.zzfz r3 = com.google.android.gms.measurement.internal.zzbj.f26258B
            java.lang.Object r3 = r3.a(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzgi r3 = r36.m()
            com.google.android.gms.measurement.internal.zzgk r3 = r3.F()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.Z(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.zzgm r2 = com.google.android.gms.measurement.internal.zzgm.b(r37)
            com.google.android.gms.measurement.internal.zzop r9 = r36.y0()
            com.google.android.gms.measurement.internal.zzah r10 = r36.i0()
            int r10 = r10.x(r8)
            r9.W(r2, r10)
            boolean r9 = com.google.android.gms.internal.measurement.zzqz.a()
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.zzah r9 = r36.i0()
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.G0
            boolean r9 = r9.t(r10)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.zzah r9 = r36.i0()
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.T
            r11 = 10
            r12 = 35
            int r9 = r9.q(r8, r10, r11, r12)
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            java.util.TreeSet r10 = new java.util.TreeSet
            android.os.Bundle r11 = r2.f26343d
            java.util.Set r11 = r11.keySet()
            r10.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x0123:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "items"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x0159
            com.google.android.gms.measurement.internal.zzop r12 = r36.y0()
            android.os.Bundle r13 = r2.f26343d
            android.os.Parcelable[] r11 = r13.getParcelableArray(r11)
            boolean r13 = com.google.android.gms.internal.measurement.zzqz.a()
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.measurement.internal.zzah r13 = r36.i0()
            com.google.android.gms.measurement.internal.zzfz r14 = com.google.android.gms.measurement.internal.zzbj.G0
            boolean r13 = r13.t(r14)
            if (r13 == 0) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            r12.b0(r11, r9, r13)
        L_0x0159:
            r14 = 0
            goto L_0x0123
        L_0x015b:
            com.google.android.gms.measurement.internal.zzbh r2 = r2.a()
            com.google.android.gms.measurement.internal.zzgi r9 = r36.m()
            r10 = 2
            boolean r9 = r9.C(r10)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.measurement.internal.zzgi r9 = r36.m()
            com.google.android.gms.measurement.internal.zzgk r9 = r9.K()
            com.google.android.gms.measurement.internal.zzhw r10 = r1.f26911l
            com.google.android.gms.measurement.internal.zzgh r10 = r10.D()
            java.lang.String r10 = r10.b(r2)
            java.lang.String r11 = "Logging event"
            r9.b(r11, r10)
        L_0x0181:
            boolean r9 = com.google.android.gms.internal.measurement.zzqs.a()
            if (r9 == 0) goto L_0x0190
            com.google.android.gms.measurement.internal.zzah r9 = r36.i0()
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.C0
            r9.t(r10)
        L_0x0190:
            com.google.android.gms.measurement.internal.zzam r9 = r36.l0()
            r9.b1()
            r1.i(r3)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f26256z     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x01bf
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f26256z     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x01bf
            java.lang.String r9 = r2.f26256z     // Catch:{ all -> 0x01bb }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x01b9
            goto L_0x01bf
        L_0x01b9:
            r9 = 0
            goto L_0x01c0
        L_0x01bb:
            r0 = move-exception
            r2 = r0
            goto L_0x0a7c
        L_0x01bf:
            r9 = 1
        L_0x01c0:
            java.lang.String r11 = "_iap"
            java.lang.String r12 = r2.f26256z     // Catch:{ all -> 0x01bb }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x01bb }
            java.lang.String r13 = "value"
            if (r11 != 0) goto L_0x01d7
            if (r9 == 0) goto L_0x01cf
            goto L_0x01d7
        L_0x01cf:
            r24 = r6
            r27 = r13
            r7 = r15
        L_0x01d4:
            r6 = 1
            goto L_0x034f
        L_0x01d7:
            com.google.android.gms.measurement.internal.zzbc r11 = r2.f26254A     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = "currency"
            java.lang.String r11 = r11.o0(r12)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0248
            com.google.android.gms.measurement.internal.zzbc r9 = r2.f26254A     // Catch:{ all -> 0x01bb }
            java.lang.Double r9 = r9.S(r13)     // Catch:{ all -> 0x01bb }
            double r19 = r9.doubleValue()     // Catch:{ all -> 0x01bb }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r9 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x0208
            com.google.android.gms.measurement.internal.zzbc r9 = r2.f26254A     // Catch:{ all -> 0x01bb }
            java.lang.Long r9 = r9.f0(r13)     // Catch:{ all -> 0x01bb }
            r23 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x01bb }
            double r14 = (double) r14     // Catch:{ all -> 0x01bb }
            double r19 = r14 * r21
            goto L_0x020a
        L_0x0208:
            r23 = r15
        L_0x020a:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r9 > 0) goto L_0x0224
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r9 < 0) goto L_0x0224
            long r14 = java.lang.Math.round(r19)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r2.f26256z     // Catch:{ all -> 0x01bb }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0254
            long r14 = -r14
            goto L_0x0254
        L_0x0224:
            com.google.android.gms.measurement.internal.zzgi r2 = r36.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.L()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x01bb }
            java.lang.Double r5 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x01bb }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()     // Catch:{ all -> 0x01bb }
            r2.i1()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()
            r2.g1()
            return
        L_0x0248:
            r23 = r15
            com.google.android.gms.measurement.internal.zzbc r9 = r2.f26254A     // Catch:{ all -> 0x01bb }
            java.lang.Long r9 = r9.f0(r13)     // Catch:{ all -> 0x01bb }
            long r14 = r9.longValue()     // Catch:{ all -> 0x01bb }
        L_0x0254:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x0347
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = "[A-Z]{3}"
            boolean r10 = r9.matches(r10)     // Catch:{ all -> 0x01bb }
            if (r10 == 0) goto L_0x0347
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = "_ltv_"
            r10.<init>(r11)     // Catch:{ all -> 0x01bb }
            r10.append(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = r10.toString()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r9 = r36.l0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzom r9 = r9.M0(r8, r12)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0286
            java.lang.Object r9 = r9.f26966e     // Catch:{ all -> 0x01bb }
            boolean r10 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x01bb }
            if (r10 != 0) goto L_0x028e
        L_0x0286:
            r24 = r6
            r27 = r13
            r7 = r23
            r6 = 1
            goto L_0x02b9
        L_0x028e:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x01bb }
            long r9 = r9.longValue()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzom r19 = new com.google.android.gms.measurement.internal.zzom     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r2.f26255B     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.util.Clock r20 = r36.b()     // Catch:{ all -> 0x01bb }
            long r20 = r20.a()     // Catch:{ all -> 0x01bb }
            long r9 = r9 + r14
            java.lang.Long r15 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01bb }
            r9 = r19
            r10 = r8
            r14 = 0
            r24 = r6
            r27 = r13
            r6 = 1
            r7 = 0
            r13 = r20
            r7 = r23
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x01bb }
        L_0x02b6:
            r9 = r19
            goto L_0x030f
        L_0x02b9:
            com.google.android.gms.measurement.internal.zzam r9 = r36.l0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzah r10 = r36.i0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzfz r11 = com.google.android.gms.measurement.internal.zzbj.H     // Catch:{ all -> 0x01bb }
            int r10 = r10.y(r8, r11)     // Catch:{ all -> 0x01bb }
            int r10 = r10 - r6
            com.google.android.gms.common.internal.Preconditions.g(r8)     // Catch:{ all -> 0x01bb }
            r9.n()     // Catch:{ all -> 0x01bb }
            r9.u()     // Catch:{ all -> 0x01bb }
            android.database.sqlite.SQLiteDatabase r11 = r9.B()     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.String r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.String[] r10 = new java.lang.String[]{r8, r8, r10}     // Catch:{ SQLiteException -> 0x02e3 }
            r11.execSQL(r13, r10)     // Catch:{ SQLiteException -> 0x02e3 }
            goto L_0x02f6
        L_0x02e3:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.zzgi r9 = r9.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r9 = r9.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x01bb }
            r9.c(r11, r13, r10)     // Catch:{ all -> 0x01bb }
        L_0x02f6:
            com.google.android.gms.measurement.internal.zzom r19 = new com.google.android.gms.measurement.internal.zzom     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r2.f26255B     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.util.Clock r9 = r36.b()     // Catch:{ all -> 0x01bb }
            long r16 = r9.a()     // Catch:{ all -> 0x01bb }
            java.lang.Long r15 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x01bb }
            r9 = r19
            r10 = r8
            r13 = r16
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x01bb }
            goto L_0x02b6
        L_0x030f:
            com.google.android.gms.measurement.internal.zzam r10 = r36.l0()     // Catch:{ all -> 0x01bb }
            boolean r10 = r10.h0(r9)     // Catch:{ all -> 0x01bb }
            if (r10 != 0) goto L_0x034f
            com.google.android.gms.measurement.internal.zzgi r10 = r36.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r10 = r10.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhw r13 = r1.f26911l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgh r13 = r13.D()     // Catch:{ all -> 0x01bb }
            java.lang.String r14 = r9.f26964c     // Catch:{ all -> 0x01bb }
            java.lang.String r13 = r13.g(r14)     // Catch:{ all -> 0x01bb }
            java.lang.Object r9 = r9.f26966e     // Catch:{ all -> 0x01bb }
            r10.d(r11, r12, r13, r9)     // Catch:{ all -> 0x01bb }
            r36.y0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzoo r9 = r1.G     // Catch:{ all -> 0x01bb }
            r13 = 0
            r14 = 0
            r11 = 9
            r12 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.zzop.Z(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01bb }
            goto L_0x034f
        L_0x0347:
            r24 = r6
            r27 = r13
            r7 = r23
            goto L_0x01d4
        L_0x034f:
            java.lang.String r9 = r2.f26256z     // Catch:{ all -> 0x01bb }
            boolean r21 = com.google.android.gms.measurement.internal.zzop.L0(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r2.f26256z     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x01bb }
            r36.y0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzbc r9 = r2.f26254A     // Catch:{ all -> 0x01bb }
            long r9 = com.google.android.gms.measurement.internal.zzop.A(r9)     // Catch:{ all -> 0x01bb }
            r13 = 1
            long r15 = r9 + r13
            com.google.android.gms.measurement.internal.zzam r9 = r36.l0()     // Catch:{ all -> 0x01bb }
            long r10 = r36.F0()     // Catch:{ all -> 0x01bb }
            r19 = 0
            r20 = 0
            r17 = 1
            r18 = 0
            r12 = r8
            r13 = r15
            r15 = r17
            r16 = r21
            r17 = r18
            r18 = r7
            com.google.android.gms.measurement.internal.zzar r9 = r9.I(r10, r12, r13, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01bb }
            long r10 = r9.f26207b     // Catch:{ all -> 0x01bb }
            r36.i0()     // Catch:{ all -> 0x01bb }
            long r12 = com.google.android.gms.measurement.internal.zzah.S()     // Catch:{ all -> 0x01bb }
            long r10 = r10 - r12
            r14 = 0
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r12 <= 0) goto L_0x03c6
            long r10 = r10 % r16
            r12 = 1
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x03b7
            com.google.android.gms.measurement.internal.zzgi r2 = r36.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x01bb }
            long r5 = r9.f26207b     // Catch:{ all -> 0x01bb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01bb }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x01bb }
        L_0x03b7:
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()     // Catch:{ all -> 0x01bb }
            r2.i1()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()
            r2.g1()
            return
        L_0x03c6:
            r12 = 1
            if (r21 == 0) goto L_0x0420
            long r10 = r9.f26206a     // Catch:{ all -> 0x01bb }
            r36.i0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.f26272n     // Catch:{ all -> 0x01bb }
            r12 = 0
            java.lang.Object r6 = r6.a(r12)     // Catch:{ all -> 0x01bb }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x01bb }
            int r6 = r6.intValue()     // Catch:{ all -> 0x01bb }
            long r12 = (long) r6     // Catch:{ all -> 0x01bb }
            long r10 = r10 - r12
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0420
            long r10 = r10 % r16
            r3 = 1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0401
            com.google.android.gms.measurement.internal.zzgi r3 = r36.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x01bb }
            long r6 = r9.f26206a     // Catch:{ all -> 0x01bb }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01bb }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x01bb }
        L_0x0401:
            r36.y0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzoo r9 = r1.G     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = "_ev"
            java.lang.String r13 = r2.f26256z     // Catch:{ all -> 0x01bb }
            r14 = 0
            r11 = 16
            r10 = r8
            com.google.android.gms.measurement.internal.zzop.Z(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()     // Catch:{ all -> 0x01bb }
            r2.i1()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()
            r2.g1()
            return
        L_0x0420:
            if (r7 == 0) goto L_0x046e
            long r6 = r9.f26209d     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzah r10 = r36.i0()     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r3.f26977z     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzfz r12 = com.google.android.gms.measurement.internal.zzbj.f26271m     // Catch:{ all -> 0x01bb }
            int r10 = r10.y(r11, r12)     // Catch:{ all -> 0x01bb }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x01bb }
            r13 = 0
            int r10 = java.lang.Math.max(r13, r10)     // Catch:{ all -> 0x01bb }
            long r10 = (long) r10     // Catch:{ all -> 0x01bb }
            long r6 = r6 - r10
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x046f
            r10 = 1
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x045f
            com.google.android.gms.measurement.internal.zzgi r2 = r36.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x01bb }
            long r5 = r9.f26209d     // Catch:{ all -> 0x01bb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01bb }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x01bb }
        L_0x045f:
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()     // Catch:{ all -> 0x01bb }
            r2.i1()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()
            r2.g1()
            return
        L_0x046e:
            r13 = 0
        L_0x046f:
            com.google.android.gms.measurement.internal.zzbc r6 = r2.f26254A     // Catch:{ all -> 0x01bb }
            android.os.Bundle r6 = r6.X()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzop r7 = r36.y0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "_o"
            java.lang.String r10 = r2.f26255B     // Catch:{ all -> 0x01bb }
            r7.O(r6, r9, r10)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzop r7 = r36.y0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.d0     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.E0(r8, r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = "_r"
            if (r7 == 0) goto L_0x04a9
            com.google.android.gms.measurement.internal.zzop r7 = r36.y0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "_dbg"
            r16 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x01bb }
            r7.O(r6, r9, r10)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzop r7 = r36.y0()     // Catch:{ all -> 0x01bb }
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x01bb }
            r7.O(r6, r12, r9)     // Catch:{ all -> 0x01bb }
            goto L_0x04ab
        L_0x04a9:
            r16 = 1
        L_0x04ab:
            java.lang.String r7 = "_s"
            java.lang.String r9 = r2.f26256z     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x04d0
            com.google.android.gms.measurement.internal.zzam r7 = r36.l0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f26977z     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzom r7 = r7.M0(r9, r5)     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x04d0
            java.lang.Object r9 = r7.f26966e     // Catch:{ all -> 0x01bb }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x04d0
            com.google.android.gms.measurement.internal.zzop r9 = r36.y0()     // Catch:{ all -> 0x01bb }
            java.lang.Object r7 = r7.f26966e     // Catch:{ all -> 0x01bb }
            r9.O(r6, r5, r7)     // Catch:{ all -> 0x01bb }
        L_0x04d0:
            com.google.android.gms.measurement.internal.zzah r5 = r36.i0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzfz r7 = com.google.android.gms.measurement.internal.zzbj.o1     // Catch:{ all -> 0x01bb }
            boolean r5 = r5.t(r7)     // Catch:{ all -> 0x01bb }
            if (r5 == 0) goto L_0x0508
            java.lang.String r5 = r2.f26255B     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = "am"
            boolean r5 = java.util.Objects.equals(r5, r7)     // Catch:{ all -> 0x01bb }
            if (r5 == 0) goto L_0x0508
            java.lang.String r5 = r2.f26256z     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = "_ai"
            boolean r5 = java.util.Objects.equals(r5, r7)     // Catch:{ all -> 0x01bb }
            if (r5 == 0) goto L_0x0508
            r5 = r27
            java.lang.Object r7 = r6.get(r5)     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x0508
            boolean r9 = r7 instanceof java.lang.String     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0508
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0508 }
            double r9 = java.lang.Double.parseDouble(r7)     // Catch:{ NumberFormatException -> 0x0508 }
            r6.remove(r5)     // Catch:{ NumberFormatException -> 0x0508 }
            r6.putDouble(r5, r9)     // Catch:{ NumberFormatException -> 0x0508 }
        L_0x0508:
            com.google.android.gms.measurement.internal.zzam r5 = r36.l0()     // Catch:{ all -> 0x01bb }
            long r9 = r5.F(r8)     // Catch:{ all -> 0x01bb }
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0529
            com.google.android.gms.measurement.internal.zzgi r5 = r36.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.L()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x01bb }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01bb }
            r5.c(r7, r11, r9)     // Catch:{ all -> 0x01bb }
        L_0x0529:
            com.google.android.gms.measurement.internal.zzba r5 = new com.google.android.gms.measurement.internal.zzba     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhw r10 = r1.f26911l     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r2.f26255B     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r2.f26256z     // Catch:{ all -> 0x01bb }
            long r14 = r2.C     // Catch:{ all -> 0x01bb }
            r22 = 0
            r9 = r5
            r2 = r12
            r12 = r8
            r26 = r2
            r2 = r13
            r13 = r7
            r16 = r22
            r18 = r6
            r9.<init>((com.google.android.gms.measurement.internal.zzhw) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (long) r14, (long) r16, (android.os.Bundle) r18)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r6 = r36.l0()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r5.f26230b     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzbd r6 = r6.K0(r8, r7)     // Catch:{ all -> 0x01bb }
            if (r6 != 0) goto L_0x05c4
            com.google.android.gms.measurement.internal.zzam r6 = r36.l0()     // Catch:{ all -> 0x01bb }
            long r6 = r6.G0(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzah r9 = r36.i0()     // Catch:{ all -> 0x01bb }
            int r9 = r9.p(r8)     // Catch:{ all -> 0x01bb }
            long r9 = (long) r9     // Catch:{ all -> 0x01bb }
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x05a5
            if (r21 == 0) goto L_0x05a5
            com.google.android.gms.measurement.internal.zzgi r2 = r36.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhw r6 = r1.f26911l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgh r6 = r6.D()     // Catch:{ all -> 0x01bb }
            java.lang.String r5 = r5.f26230b     // Catch:{ all -> 0x01bb }
            java.lang.String r5 = r6.c(r5)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzah r6 = r36.i0()     // Catch:{ all -> 0x01bb }
            int r6 = r6.p(r8)     // Catch:{ all -> 0x01bb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01bb }
            r2.d(r3, r4, r5, r6)     // Catch:{ all -> 0x01bb }
            r36.y0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzoo r9 = r1.G     // Catch:{ all -> 0x01bb }
            r13 = 0
            r14 = 0
            r11 = 8
            r12 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.zzop.Z(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()
            r2.g1()
            return
        L_0x05a5:
            com.google.android.gms.measurement.internal.zzbd r6 = new com.google.android.gms.measurement.internal.zzbd     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r5.f26230b     // Catch:{ all -> 0x01bb }
            long r14 = r5.f26232d     // Catch:{ all -> 0x01bb }
            r22 = 0
            r23 = 0
            r12 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r9 = r6
            r10 = r8
            r7 = r14
            r14 = r16
            r16 = r7
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x01bb }
            goto L_0x05d2
        L_0x05c4:
            com.google.android.gms.measurement.internal.zzhw r7 = r1.f26911l     // Catch:{ all -> 0x01bb }
            long r8 = r6.f26246f     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzba r5 = r5.a(r7, r8)     // Catch:{ all -> 0x01bb }
            long r7 = r5.f26232d     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzbd r6 = r6.a(r7)     // Catch:{ all -> 0x01bb }
        L_0x05d2:
            com.google.android.gms.measurement.internal.zzam r7 = r36.l0()     // Catch:{ all -> 0x01bb }
            r7.U(r6)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhp r6 = r36.f()     // Catch:{ all -> 0x01bb }
            r6.n()     // Catch:{ all -> 0x01bb }
            r36.A0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.internal.Preconditions.m(r5)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.internal.Preconditions.m(r38)     // Catch:{ all -> 0x01bb }
            java.lang.String r6 = r5.f26229a     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.internal.Preconditions.g(r6)     // Catch:{ all -> 0x01bb }
            java.lang.String r6 = r5.f26229a     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r3.f26977z     // Catch:{ all -> 0x01bb }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.internal.Preconditions.a(r6)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r6 = com.google.android.gms.internal.measurement.zzgn.zzk.z2()     // Catch:{ all -> 0x01bb }
            r7 = 1
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r6 = r6.I0(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = "android"
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r6 = r6.k1(r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.f26977z     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x0615
            java.lang.String r8 = r3.f26977z     // Catch:{ all -> 0x01bb }
            r6.d0(r8)     // Catch:{ all -> 0x01bb }
        L_0x0615:
            java.lang.String r8 = r3.C     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x0622
            java.lang.String r8 = r3.C     // Catch:{ all -> 0x01bb }
            r6.q0(r8)     // Catch:{ all -> 0x01bb }
        L_0x0622:
            java.lang.String r8 = r3.f26976B     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x062f
            java.lang.String r8 = r3.f26976B     // Catch:{ all -> 0x01bb }
            r6.w0(r8)     // Catch:{ all -> 0x01bb }
        L_0x062f:
            java.lang.String r8 = r3.W     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x063c
            java.lang.String r8 = r3.W     // Catch:{ all -> 0x01bb }
            r6.o1(r8)     // Catch:{ all -> 0x01bb }
        L_0x063c:
            long r8 = r3.I     // Catch:{ all -> 0x01bb }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0649
            int r8 = (int) r8     // Catch:{ all -> 0x01bb }
            r6.t0(r8)     // Catch:{ all -> 0x01bb }
        L_0x0649:
            long r8 = r3.D     // Catch:{ all -> 0x01bb }
            r6.z0(r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.f26975A     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x065b
            java.lang.String r8 = r3.f26975A     // Catch:{ all -> 0x01bb }
            r6.e1(r8)     // Catch:{ all -> 0x01bb }
        L_0x065b:
            java.lang.String r8 = r3.f26977z     // Catch:{ all -> 0x01bb }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.m(r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzjc r8 = r1.U(r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.U     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzjc r9 = com.google.android.gms.measurement.internal.zzjc.q(r9)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzjc r8 = r8.h(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r8.y()     // Catch:{ all -> 0x01bb }
            r6.F0(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r6.v1()     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x068f
            java.lang.String r9 = r3.P     // Catch:{ all -> 0x01bb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x068f
            java.lang.String r9 = r3.P     // Catch:{ all -> 0x01bb }
            r6.R(r9)     // Catch:{ all -> 0x01bb }
        L_0x068f:
            boolean r9 = com.google.android.gms.internal.measurement.zzrl.a()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0742
            com.google.android.gms.measurement.internal.zzah r9 = r36.i0()     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r3.f26977z     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzfz r11 = com.google.android.gms.measurement.internal.zzbj.H0     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.H(r10, r11)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0742
            r36.y0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f26977z     // Catch:{ all -> 0x01bb }
            boolean r9 = com.google.android.gms.measurement.internal.zzop.D0(r9)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0742
            int r9 = r3.b0     // Catch:{ all -> 0x01bb }
            r6.n0(r9)     // Catch:{ all -> 0x01bb }
            long r9 = r3.c0     // Catch:{ all -> 0x01bb }
            boolean r8 = r8.A()     // Catch:{ all -> 0x01bb }
            r11 = 32
            r13 = 0
            if (r8 != 0) goto L_0x06c9
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x06c9
            r15 = -2
            long r8 = r9 & r15
            long r9 = r8 | r11
        L_0x06c9:
            r7 = 1
            int r15 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x06d1
            r15 = 1
            goto L_0x06d2
        L_0x06d1:
            r15 = r2
        L_0x06d2:
            r6.T(r15)     // Catch:{ all -> 0x01bb }
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x0744
            com.google.android.gms.internal.measurement.zzgn$zzc$zza r15 = com.google.android.gms.internal.measurement.zzgn.zzc.J()     // Catch:{ all -> 0x01bb }
            long r18 = r9 & r7
            int r16 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x06e5
            r7 = 1
            goto L_0x06e6
        L_0x06e5:
            r7 = r2
        L_0x06e6:
            r15.B(r7)     // Catch:{ all -> 0x01bb }
            r7 = 2
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x06f2
            r7 = 1
            goto L_0x06f3
        L_0x06f2:
            r7 = r2
        L_0x06f3:
            r15.H(r7)     // Catch:{ all -> 0x01bb }
            r7 = 4
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x06ff
            r7 = 1
            goto L_0x0700
        L_0x06ff:
            r7 = r2
        L_0x0700:
            r15.I(r7)     // Catch:{ all -> 0x01bb }
            r7 = 8
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x070c
            r7 = 1
            goto L_0x070d
        L_0x070c:
            r7 = r2
        L_0x070d:
            r15.J(r7)     // Catch:{ all -> 0x01bb }
            r7 = 16
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0719
            r7 = 1
            goto L_0x071a
        L_0x0719:
            r7 = r2
        L_0x071a:
            r15.z(r7)     // Catch:{ all -> 0x01bb }
            long r7 = r9 & r11
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0725
            r7 = 1
            goto L_0x0726
        L_0x0725:
            r7 = r2
        L_0x0726:
            r15.y(r7)     // Catch:{ all -> 0x01bb }
            r7 = 64
            long r7 = r7 & r9
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0732
            r7 = 1
            goto L_0x0733
        L_0x0732:
            r7 = r2
        L_0x0733:
            r15.G(r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzml r7 = r15.F()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzlc r7 = (com.google.android.gms.internal.measurement.zzlc) r7     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzgn$zzc r7 = (com.google.android.gms.internal.measurement.zzgn.zzc) r7     // Catch:{ all -> 0x01bb }
            r6.K(r7)     // Catch:{ all -> 0x01bb }
            goto L_0x0744
        L_0x0742:
            r13 = 0
        L_0x0744:
            long r7 = r3.E     // Catch:{ all -> 0x01bb }
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x074d
            r6.i0(r7)     // Catch:{ all -> 0x01bb }
        L_0x074d:
            long r7 = r3.R     // Catch:{ all -> 0x01bb }
            r6.o0(r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzol r7 = r36.x0()     // Catch:{ all -> 0x01bb }
            java.util.List r7 = r7.m0()     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x075f
            r6.j0(r7)     // Catch:{ all -> 0x01bb }
        L_0x075f:
            java.lang.String r7 = r3.f26977z     // Catch:{ all -> 0x01bb }
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.m(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzjc r7 = r1.U(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.U     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzjc r8 = com.google.android.gms.measurement.internal.zzjc.q(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzjc r7 = r7.h(r8)     // Catch:{ all -> 0x01bb }
            boolean r8 = r7.A()     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x0854
            boolean r8 = r3.N     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x0854
            com.google.android.gms.measurement.internal.zzms r8 = r1.f26908i     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f26977z     // Catch:{ all -> 0x01bb }
            android.util.Pair r8 = r8.z(r9, r7)     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x0854
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x01bb }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x01bb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x0854
            boolean r9 = r3.N     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0854
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01bb }
            r6.m1(r9)     // Catch:{ all -> 0x01bb }
            java.lang.Object r9 = r8.second     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x07ab
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x01bb }
            r6.l0(r9)     // Catch:{ all -> 0x01bb }
        L_0x07ab:
            boolean r9 = com.google.android.gms.internal.measurement.zzpo.a()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0854
            com.google.android.gms.measurement.internal.zzah r9 = r36.i0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzfz r10 = com.google.android.gms.measurement.internal.zzbj.S0     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.t(r10)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0854
            java.lang.String r9 = r5.f26230b     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.equals(r4)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x0854
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "00000000-0000-0000-0000-000000000000"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x0854
            com.google.android.gms.measurement.internal.zzam r8 = r36.l0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f26977z     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzh r8 = r8.L0(r9)     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x0854
            boolean r9 = r8.D()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0854
            java.lang.String r9 = r3.f26977z     // Catch:{ all -> 0x01bb }
            r10 = 0
            r1.H(r9, r2, r10, r10)     // Catch:{ all -> 0x01bb }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x01bb }
            r9.<init>()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzah r10 = r36.i0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzfz r11 = com.google.android.gms.measurement.internal.zzbj.a1     // Catch:{ all -> 0x01bb }
            boolean r10 = r10.t(r11)     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = "_pfo"
            if (r10 == 0) goto L_0x0824
            java.lang.Long r10 = r8.L0()     // Catch:{ all -> 0x01bb }
            if (r10 == 0) goto L_0x080d
            long r2 = r10.longValue()     // Catch:{ all -> 0x01bb }
            long r2 = java.lang.Math.max(r13, r2)     // Catch:{ all -> 0x01bb }
            r9.putLong(r11, r2)     // Catch:{ all -> 0x01bb }
        L_0x080d:
            java.lang.Long r2 = r8.M0()     // Catch:{ all -> 0x01bb }
            if (r2 == 0) goto L_0x081c
            java.lang.String r3 = "_uwa"
            long r10 = r2.longValue()     // Catch:{ all -> 0x01bb }
            r9.putLong(r3, r10)     // Catch:{ all -> 0x01bb }
        L_0x081c:
            r3 = r38
            r2 = r7
        L_0x081f:
            r10 = r26
            r7 = 1
            goto L_0x0849
        L_0x0824:
            com.google.android.gms.measurement.internal.zzah r2 = r36.i0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzfz r3 = com.google.android.gms.measurement.internal.zzbj.Z0     // Catch:{ all -> 0x01bb }
            boolean r2 = r2.t(r3)     // Catch:{ all -> 0x01bb }
            if (r2 == 0) goto L_0x081c
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()     // Catch:{ all -> 0x01bb }
            r3 = r38
            java.lang.String r8 = r3.f26977z     // Catch:{ all -> 0x01bb }
            long r18 = r2.A0(r8)     // Catch:{ all -> 0x01bb }
            r2 = r7
            r20 = 1
            long r7 = r18 - r20
            long r7 = java.lang.Math.max(r13, r7)     // Catch:{ all -> 0x01bb }
            r9.putLong(r11, r7)     // Catch:{ all -> 0x01bb }
            goto L_0x081f
        L_0x0849:
            r9.putLong(r10, r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzoo r7 = r1.G     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.f26977z     // Catch:{ all -> 0x01bb }
            r7.b(r8, r4, r9)     // Catch:{ all -> 0x01bb }
            goto L_0x0857
        L_0x0854:
            r2 = r7
            r10 = r26
        L_0x0857:
            com.google.android.gms.measurement.internal.zzhw r4 = r1.f26911l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzbb r4 = r4.A()     // Catch:{ all -> 0x01bb }
            r4.p()     // Catch:{ all -> 0x01bb }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r4 = r6.O0(r4)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhw r7 = r1.f26911l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzbb r7 = r7.A()     // Catch:{ all -> 0x01bb }
            r7.p()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r4 = r4.i1(r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhw r7 = r1.f26911l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzbb r7 = r7.A()     // Catch:{ all -> 0x01bb }
            long r7 = r7.v()     // Catch:{ all -> 0x01bb }
            int r7 = (int) r7     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r4 = r4.Q0(r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhw r7 = r1.f26911l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzbb r7 = r7.A()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r7.w()     // Catch:{ all -> 0x01bb }
            r4.q1(r7)     // Catch:{ all -> 0x01bb }
            long r7 = r3.Y     // Catch:{ all -> 0x01bb }
            r6.R0(r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhw r4 = r1.f26911l     // Catch:{ all -> 0x01bb }
            boolean r4 = r4.p()     // Catch:{ all -> 0x01bb }
            if (r4 == 0) goto L_0x08ab
            r6.r1()     // Catch:{ all -> 0x01bb }
            r4 = 0
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x01bb }
            if (r7 != 0) goto L_0x08ab
            r6.S0(r4)     // Catch:{ all -> 0x01bb }
        L_0x08ab:
            com.google.android.gms.measurement.internal.zzam r4 = r36.l0()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r3.f26977z     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzh r4 = r4.L0(r7)     // Catch:{ all -> 0x01bb }
            if (r4 != 0) goto L_0x0919
            com.google.android.gms.measurement.internal.zzh r4 = new com.google.android.gms.measurement.internal.zzh     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzhw r7 = r1.f26911l     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.f26977z     // Catch:{ all -> 0x01bb }
            r4.<init>(r7, r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r1.o(r2)     // Catch:{ all -> 0x01bb }
            r4.J(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r3.J     // Catch:{ all -> 0x01bb }
            r4.W(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r3.f26975A     // Catch:{ all -> 0x01bb }
            r4.Z(r7)     // Catch:{ all -> 0x01bb }
            boolean r7 = r2.A()     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x08e4
            com.google.android.gms.measurement.internal.zzms r7 = r1.f26908i     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.f26977z     // Catch:{ all -> 0x01bb }
            boolean r9 = r3.N     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r7.A(r8, r9)     // Catch:{ all -> 0x01bb }
            r4.f0(r7)     // Catch:{ all -> 0x01bb }
        L_0x08e4:
            r4.A0(r13)     // Catch:{ all -> 0x01bb }
            r4.C0(r13)     // Catch:{ all -> 0x01bb }
            r4.y0(r13)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r3.f26976B     // Catch:{ all -> 0x01bb }
            r4.S(r7)     // Catch:{ all -> 0x01bb }
            long r7 = r3.I     // Catch:{ all -> 0x01bb }
            r4.H(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r3.C     // Catch:{ all -> 0x01bb }
            r4.O(r7)     // Catch:{ all -> 0x01bb }
            long r7 = r3.D     // Catch:{ all -> 0x01bb }
            r4.u0(r7)     // Catch:{ all -> 0x01bb }
            long r7 = r3.E     // Catch:{ all -> 0x01bb }
            r4.n0(r7)     // Catch:{ all -> 0x01bb }
            boolean r7 = r3.G     // Catch:{ all -> 0x01bb }
            r4.K(r7)     // Catch:{ all -> 0x01bb }
            long r7 = r3.R     // Catch:{ all -> 0x01bb }
            r4.q0(r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r7 = r36.l0()     // Catch:{ all -> 0x01bb }
            r8 = 0
            r7.V(r4, r8, r8)     // Catch:{ all -> 0x01bb }
            goto L_0x091a
        L_0x0919:
            r8 = 0
        L_0x091a:
            boolean r2 = r2.B()     // Catch:{ all -> 0x01bb }
            if (r2 == 0) goto L_0x0937
            java.lang.String r2 = r4.m()     // Catch:{ all -> 0x01bb }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01bb }
            if (r2 != 0) goto L_0x0937
            java.lang.String r2 = r4.m()     // Catch:{ all -> 0x01bb }
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.m(r2)     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01bb }
            r6.k0(r2)     // Catch:{ all -> 0x01bb }
        L_0x0937:
            java.lang.String r2 = r4.p()     // Catch:{ all -> 0x01bb }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01bb }
            if (r2 != 0) goto L_0x094e
            java.lang.String r2 = r4.p()     // Catch:{ all -> 0x01bb }
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.m(r2)     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01bb }
            r6.c1(r2)     // Catch:{ all -> 0x01bb }
        L_0x094e:
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r3.f26977z     // Catch:{ all -> 0x01bb }
            java.util.List r2 = r2.X0(r7)     // Catch:{ all -> 0x01bb }
            r12 = r8
        L_0x0959:
            int r7 = r2.size()     // Catch:{ all -> 0x01bb }
            if (r12 >= r7) goto L_0x09be
            com.google.android.gms.internal.measurement.zzgn$zzo$zza r7 = com.google.android.gms.internal.measurement.zzgn.zzo.W()     // Catch:{ all -> 0x01bb }
            java.lang.Object r9 = r2.get(r12)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzom r9 = (com.google.android.gms.measurement.internal.zzom) r9     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r9.f26964c     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzgn$zzo$zza r7 = r7.G(r9)     // Catch:{ all -> 0x01bb }
            java.lang.Object r9 = r2.get(r12)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzom r9 = (com.google.android.gms.measurement.internal.zzom) r9     // Catch:{ all -> 0x01bb }
            long r8 = r9.f26965d     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzgn$zzo$zza r7 = r7.I(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzol r8 = r36.x0()     // Catch:{ all -> 0x01bb }
            java.lang.Object r9 = r2.get(r12)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzom r9 = (com.google.android.gms.measurement.internal.zzom) r9     // Catch:{ all -> 0x01bb }
            java.lang.Object r9 = r9.f26966e     // Catch:{ all -> 0x01bb }
            r8.W(r7, r9)     // Catch:{ all -> 0x01bb }
            r6.N(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = "_sid"
            java.lang.Object r8 = r2.get(r12)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzom r8 = (com.google.android.gms.measurement.internal.zzom) r8     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r8.f26964c     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x09ba
            long r7 = r4.I0()     // Catch:{ all -> 0x01bb }
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x09ba
            com.google.android.gms.measurement.internal.zzol r7 = r36.x0()     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.W     // Catch:{ all -> 0x01bb }
            long r7 = r7.z(r8)     // Catch:{ all -> 0x01bb }
            long r18 = r4.I0()     // Catch:{ all -> 0x01bb }
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x09ba
            r6.n1()     // Catch:{ all -> 0x01bb }
        L_0x09ba:
            int r12 = r12 + 1
            r8 = 0
            goto L_0x0959
        L_0x09be:
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()     // Catch:{ IOException -> 0x0a34 }
            com.google.android.gms.internal.measurement.zzml r3 = r6.F()     // Catch:{ IOException -> 0x0a34 }
            com.google.android.gms.internal.measurement.zzlc r3 = (com.google.android.gms.internal.measurement.zzlc) r3     // Catch:{ IOException -> 0x0a34 }
            com.google.android.gms.internal.measurement.zzgn$zzk r3 = (com.google.android.gms.internal.measurement.zzgn.zzk) r3     // Catch:{ IOException -> 0x0a34 }
            long r2 = r2.E(r3)     // Catch:{ IOException -> 0x0a34 }
            com.google.android.gms.measurement.internal.zzam r4 = r36.l0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzbc r6 = r5.f26234f     // Catch:{ all -> 0x01bb }
            if (r6 == 0) goto L_0x0a2a
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x01bb }
        L_0x09da:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x09ee
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01bb }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x09da
        L_0x09ec:
            r6 = 1
            goto L_0x0a2b
        L_0x09ee:
            com.google.android.gms.measurement.internal.zzhg r6 = r36.r0()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r5.f26229a     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r5.f26230b     // Catch:{ all -> 0x01bb }
            boolean r6 = r6.N(r7, r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r26 = r36.l0()     // Catch:{ all -> 0x01bb }
            long r27 = r36.F0()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r5.f26229a     // Catch:{ all -> 0x01bb }
            r34 = 0
            r35 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r29 = r7
            com.google.android.gms.measurement.internal.zzar r7 = r26.J(r27, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x01bb }
            if (r6 == 0) goto L_0x0a2a
            long r6 = r7.f26210e     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzah r8 = r36.i0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r5.f26229a     // Catch:{ all -> 0x01bb }
            int r8 = r8.B(r9)     // Catch:{ all -> 0x01bb }
            long r8 = (long) r8     // Catch:{ all -> 0x01bb }
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0a2a
            goto L_0x09ec
        L_0x0a2a:
            r6 = 0
        L_0x0a2b:
            boolean r2 = r4.g0(r5, r2, r6)     // Catch:{ all -> 0x01bb }
            if (r2 == 0) goto L_0x0a4b
            r1.f26914o = r13     // Catch:{ all -> 0x01bb }
            goto L_0x0a4b
        L_0x0a34:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzgi r3 = r36.m()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r6.r1()     // Catch:{ all -> 0x01bb }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgi.v(r5)     // Catch:{ all -> 0x01bb }
            r3.c(r4, r5, r2)     // Catch:{ all -> 0x01bb }
        L_0x0a4b:
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()     // Catch:{ all -> 0x01bb }
            r2.i1()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.zzam r2 = r36.l0()
            r2.g1()
            r36.Q()
            com.google.android.gms.measurement.internal.zzgi r2 = r36.m()
            com.google.android.gms.measurement.internal.zzgk r2 = r2.K()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r24
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0a7c:
            com.google.android.gms.measurement.internal.zzam r3 = r36.l0()
            r3.g1()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.e0(com.google.android.gms.measurement.internal.zzbh, com.google.android.gms.measurement.internal.zzp):void");
    }

    public final zzhp f() {
        return ((zzhw) Preconditions.m(this.f26911l)).f();
    }

    public final void f0(zzp zzp) {
        f().n();
        A0();
        Preconditions.m(zzp);
        Preconditions.g(zzp.f26977z);
        if (i0().t(zzbj.h1)) {
            int i2 = 0;
            if (i0().t(zzbj.j0)) {
                long a2 = b().a();
                int y2 = i0().y((String) null, zzbj.V);
                i0();
                long M = a2 - zzah.M();
                while (i2 < y2 && N((String) null, M)) {
                    i2++;
                }
            } else {
                i0();
                long S = zzah.S();
                while (((long) i2) < S && N(zzp.f26977z, 0)) {
                    i2++;
                }
            }
            if (i0().t(zzbj.k0)) {
                P();
            }
        }
    }

    public final Bundle g(String str) {
        int i2;
        f().n();
        A0();
        if (r0().J(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjc U = U(str);
        bundle.putAll(U.o());
        bundle.putAll(h(str, g0(str), U, new zzai()).f());
        if (x0().k0(str)) {
            i2 = 1;
        } else {
            zzom M0 = l0().M0(str, "_npa");
            i2 = M0 != null ? M0.f26966e.equals(1L) : c(str, new zzai());
        }
        bundle.putString("ad_personalization", i2 == 1 ? "denied" : "granted");
        return bundle;
    }

    public final zzaz g0(String str) {
        f().n();
        A0();
        zzaz zzaz = (zzaz) this.C.get(str);
        if (zzaz != null) {
            return zzaz;
        }
        zzaz P0 = l0().P0(str);
        this.C.put(str, P0);
        return P0;
    }

    public final zzaz h(String str, zzaz zzaz, zzjc zzjc, zzai zzai) {
        zzjb zzjb;
        zzjc.zza zza2;
        zzjb B2;
        int i2 = 90;
        if (r0().J(str) == null) {
            if (zzaz.g() == zzjb.DENIED) {
                i2 = zzaz.a();
                zzai.c(zzjc.zza.AD_USER_DATA, i2);
            } else {
                zzai.d(zzjc.zza.AD_USER_DATA, zzal.FAILSAFE);
            }
            return new zzaz(Boolean.FALSE, i2, Boolean.TRUE, "-");
        }
        zzjb g2 = zzaz.g();
        zzjb zzjb2 = zzjb.GRANTED;
        if (g2 == zzjb2 || g2 == (zzjb = zzjb.DENIED)) {
            i2 = zzaz.a();
            zzai.c(zzjc.zza.AD_USER_DATA, i2);
        } else {
            boolean z2 = true;
            if (!zzox.a() || !i0().t(zzbj.X0)) {
                zzjb zzjb3 = zzjb.UNINITIALIZED;
                if (!(g2 == zzjb3 || g2 == zzjb.POLICY)) {
                    z2 = false;
                }
                Preconditions.a(z2);
                zzhg zzhg = this.f26900a;
                zzjc.zza zza3 = zzjc.zza.AD_USER_DATA;
                zzjc.zza K = zzhg.K(str, zza3);
                Boolean w2 = zzjc.w();
                if (K == zzjc.zza.AD_STORAGE && w2 != null) {
                    g2 = w2.booleanValue() ? zzjb2 : zzjb;
                    zzai.d(zza3, zzal.REMOTE_DELEGATION);
                }
                if (g2 == zzjb3) {
                    if (!this.f26900a.M(str, zza3)) {
                        zzjb2 = zzjb;
                    }
                    zzai.d(zza3, zzal.REMOTE_DEFAULT);
                }
            } else if (g2 != zzjb.POLICY || (B2 = this.f26900a.B(str, zza2)) == zzjb.UNINITIALIZED) {
                zzhg zzhg2 = this.f26900a;
                zzjc.zza zza4 = zzjc.zza.AD_USER_DATA;
                zzjc.zza K2 = zzhg2.K(str, zza4);
                zzjb t2 = zzjc.t();
                if (!(t2 == zzjb2 || t2 == zzjb)) {
                    z2 = false;
                }
                if (K2 != zzjc.zza.AD_STORAGE || !z2) {
                    zzai.d(zza4, zzal.REMOTE_DEFAULT);
                    if (!this.f26900a.M(str, zza4)) {
                        g2 = zzjb;
                    }
                } else {
                    zzai.d(zza4, zzal.REMOTE_DELEGATION);
                    g2 = t2;
                }
            } else {
                zzai.d((zza2 = zzjc.zza.AD_USER_DATA), zzal.REMOTE_ENFORCED_DEFAULT);
                g2 = B2;
            }
            g2 = zzjb2;
        }
        boolean Z = this.f26900a.Z(str);
        SortedSet T = r0().T(str);
        if (g2 == zzjb.DENIED || T.isEmpty()) {
            return new zzaz(Boolean.FALSE, i2, Boolean.valueOf(Z), "-");
        }
        Boolean bool = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(Z);
        String str2 = "";
        if (Z) {
            str2 = TextUtils.join(str2, T);
        }
        return new zzaz(bool, i2, valueOf, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x03b2 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03dd A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03f4 A[SYNTHETIC, Splitter:B:131:0x03f4] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x048d A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04aa A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0516 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010e A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01cd A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022a A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0237 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x024a A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h0(com.google.android.gms.measurement.internal.zzp r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "com.android.vending"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.zzhp r9 = r23.f()
            r9.n()
            r23.A0()
            com.google.android.gms.common.internal.Preconditions.m(r24)
            java.lang.String r9 = r2.f26977z
            com.google.android.gms.common.internal.Preconditions.g(r9)
            boolean r9 = s0(r24)
            if (r9 != 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.zzam r9 = r23.l0()
            java.lang.String r10 = r2.f26977z
            com.google.android.gms.measurement.internal.zzh r9 = r9.L0(r10)
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L_0x005f
            java.lang.String r13 = r9.q()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x005f
            java.lang.String r13 = r2.f26975A
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x005f
            r9.R(r11)
            com.google.android.gms.measurement.internal.zzam r13 = r23.l0()
            r13.V(r9, r10, r10)
            com.google.android.gms.measurement.internal.zzhg r9 = r23.r0()
            java.lang.String r13 = r2.f26977z
            r9.V(r13)
        L_0x005f:
            boolean r9 = r2.G
            if (r9 != 0) goto L_0x0067
            r23.i(r24)
            return
        L_0x0067:
            long r13 = r2.L
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0075
            com.google.android.gms.common.util.Clock r9 = r23.b()
            long r13 = r9.a()
        L_0x0075:
            com.google.android.gms.measurement.internal.zzhw r9 = r1.f26911l
            com.google.android.gms.measurement.internal.zzbb r9 = r9.A()
            r9.x()
            int r9 = r2.M
            r15 = 1
            if (r9 == 0) goto L_0x009d
            if (r9 == r15) goto L_0x009d
            com.google.android.gms.measurement.internal.zzgi r16 = r23.m()
            com.google.android.gms.measurement.internal.zzgk r15 = r16.L()
            java.lang.String r11 = r2.f26977z
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgi.v(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r12 = "Incorrect app type, assuming installed app. appId, appType"
            r15.c(r12, r11, r9)
            r9 = r10
        L_0x009d:
            com.google.android.gms.measurement.internal.zzam r11 = r23.l0()
            r11.b1()
            com.google.android.gms.measurement.internal.zzam r11 = r23.l0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r2.f26977z     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzom r11 = r11.M0(r12, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Boolean r12 = r23.q0(r24)     // Catch:{ all -> 0x00c5 }
            r21 = r3
            r22 = r4
            if (r11 == 0) goto L_0x00c8
            java.lang.String r15 = "auto"
            java.lang.String r10 = r11.f26963b     // Catch:{ all -> 0x00c5 }
            boolean r10 = r15.equals(r10)     // Catch:{ all -> 0x00c5 }
            if (r10 == 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            r10 = 1
            goto L_0x00fc
        L_0x00c5:
            r0 = move-exception
            goto L_0x0544
        L_0x00c8:
            if (r12 == 0) goto L_0x00f6
            com.google.android.gms.measurement.internal.zzok r0 = new com.google.android.gms.measurement.internal.zzok     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_npa"
            boolean r10 = r12.booleanValue()     // Catch:{ all -> 0x00c5 }
            if (r10 == 0) goto L_0x00d7
            r18 = 1
            goto L_0x00d9
        L_0x00d7:
            r18 = 0
        L_0x00d9:
            java.lang.Long r19 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r10 = 1
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x00f2
            java.lang.Object r11 = r11.f26966e     // Catch:{ all -> 0x00c5 }
            java.lang.Long r12 = r0.C     // Catch:{ all -> 0x00c5 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00c5 }
            if (r11 != 0) goto L_0x00fc
        L_0x00f2:
            r1.y(r0, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x00fc
        L_0x00f6:
            r10 = 1
            if (r11 == 0) goto L_0x00fc
            r1.G(r0, r2)     // Catch:{ all -> 0x00c5 }
        L_0x00fc:
            com.google.android.gms.measurement.internal.zzam r0 = r23.l0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = r2.f26977z     // Catch:{ all -> 0x00c5 }
            java.lang.Object r11 = com.google.android.gms.common.internal.Preconditions.m(r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzh r0 = r0.L0(r11)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x01cb
            r23.y0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r2.f26975A     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = r0.q()     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = r2.P     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r0.j()     // Catch:{ all -> 0x00c5 }
            boolean r3 = com.google.android.gms.measurement.internal.zzop.m0(r12, r15, r11, r3)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x01cb
            com.google.android.gms.measurement.internal.zzgi r3 = r23.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.L()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r11 = r0.l()     // Catch:{ all -> 0x00c5 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgi.v(r11)     // Catch:{ all -> 0x00c5 }
            r3.b(r4, r11)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzam r3 = r23.l0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r0.l()     // Catch:{ all -> 0x00c5 }
            r3.u()     // Catch:{ all -> 0x00c5 }
            r3.n()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.common.internal.Preconditions.g(r4)     // Catch:{ all -> 0x00c5 }
            android.database.sqlite.SQLiteDatabase r0 = r3.B()     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String[] r11 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r12 = "events"
            int r12 = r0.delete(r12, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r15 = "user_attributes"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "apps"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "default_event_params"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "trigger_uris"
            int r0 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r0
            if (r12 <= 0) goto L_0x01ca
            com.google.android.gms.measurement.internal.zzgi r0 = r3.m()     // Catch:{ SQLiteException -> 0x01b8 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.K()     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r8 = "Deleted application data. app, records"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x01b8 }
            r0.c(r8, r4, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            goto L_0x01ca
        L_0x01b8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r3 = r3.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r4)     // Catch:{ all -> 0x00c5 }
            r3.c(r8, r4, r0)     // Catch:{ all -> 0x00c5 }
        L_0x01ca:
            r0 = 0
        L_0x01cb:
            if (r0 == 0) goto L_0x0225
            long r3 = r0.U()     // Catch:{ all -> 0x00c5 }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            long r3 = r0.U()     // Catch:{ all -> 0x00c5 }
            long r10 = r2.I     // Catch:{ all -> 0x00c5 }
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            r3 = 1
            goto L_0x01e5
        L_0x01e4:
            r3 = 0
        L_0x01e5:
            java.lang.String r4 = r0.o()     // Catch:{ all -> 0x00c5 }
            long r10 = r0.U()     // Catch:{ all -> 0x00c5 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            java.lang.String r0 = r2.f26976B     // Catch:{ all -> 0x00c5 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x0200
            r15 = 1
            goto L_0x0201
        L_0x0200:
            r15 = 0
        L_0x0201:
            r0 = r3 | r15
            if (r0 == 0) goto L_0x0225
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "_pv"
            r0.putString(r3, r4)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzbh r3 = new com.google.android.gms.measurement.internal.zzbh     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_au"
            com.google.android.gms.measurement.internal.zzbc r4 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.u(r3, r2)     // Catch:{ all -> 0x00c5 }
        L_0x0225:
            r23.i(r24)     // Catch:{ all -> 0x00c5 }
            if (r9 != 0) goto L_0x0237
            com.google.android.gms.measurement.internal.zzam r0 = r23.l0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r2.f26977z     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.zzbd r0 = r0.K0(r3, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0248
        L_0x0237:
            r3 = 1
            if (r9 != r3) goto L_0x0247
            com.google.android.gms.measurement.internal.zzam r0 = r23.l0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r2.f26977z     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.zzbd r0 = r0.K0(r3, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0248
        L_0x0247:
            r0 = 0
        L_0x0248:
            if (r0 != 0) goto L_0x0516
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r10 = r13 / r3
            r15 = 1
            long r10 = r10 + r15
            long r10 = r10 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r12 = "_r"
            java.lang.String r15 = "_c"
            if (r9 != 0) goto L_0x04c7
            com.google.android.gms.measurement.internal.zzok r0 = new com.google.android.gms.measurement.internal.zzok     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fot"
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r9 = r15
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.y(r0, r2)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzhp r0 = r23.f()     // Catch:{ all -> 0x00c5 }
            r0.n()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzhd r0 = r1.f26910k     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.m(r0)     // Catch:{ all -> 0x00c5 }
            r10 = r0
            com.google.android.gms.measurement.internal.zzhd r10 = (com.google.android.gms.measurement.internal.zzhd) r10     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r2.f26977z     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0373
            boolean r11 = r0.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x028d
            goto L_0x0373
        L_0x028d:
            com.google.android.gms.measurement.internal.zzhw r11 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzhp r11 = r11.f()     // Catch:{ all -> 0x00c5 }
            r11.n()     // Catch:{ all -> 0x00c5 }
            boolean r11 = r10.b()     // Catch:{ all -> 0x00c5 }
            if (r11 != 0) goto L_0x02ad
            com.google.android.gms.measurement.internal.zzhw r0 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.J()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Install Referrer Reporter is not available"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x02ad:
            com.google.android.gms.measurement.internal.zzhc r11 = new com.google.android.gms.measurement.internal.zzhc     // Catch:{ all -> 0x00c5 }
            r11.<init>(r10, r0)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzhw r0 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzhp r0 = r0.f()     // Catch:{ all -> 0x00c5 }
            r0.n()     // Catch:{ all -> 0x00c5 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x00c5 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r6, r8)     // Catch:{ all -> 0x00c5 }
            r0.setComponent(r15)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzhw r8 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            android.content.Context r8 = r8.a()     // Catch:{ all -> 0x00c5 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x00c5 }
            if (r8 != 0) goto L_0x02e9
            com.google.android.gms.measurement.internal.zzhw r0 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.N()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x02e9:
            r15 = 0
            java.util.List r8 = r8.queryIntentServices(r0, r15)     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0363
            boolean r16 = r8.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r16 != 0) goto L_0x0363
            java.lang.Object r8 = r8.get(r15)     // Catch:{ all -> 0x00c5 }
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ all -> 0x00c5 }
            android.content.pm.ServiceInfo r8 = r8.serviceInfo     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0382
            java.lang.String r15 = r8.packageName     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = r8.name     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0353
            boolean r6 = r6.equals(r15)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0353
            boolean r6 = r10.b()     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0353
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00c5 }
            r6.<init>(r0)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.b()     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.zzhw r8 = r10.f26435a     // Catch:{ RuntimeException -> 0x0337 }
            android.content.Context r8 = r8.a()     // Catch:{ RuntimeException -> 0x0337 }
            r15 = 1
            boolean r0 = r0.a(r8, r6, r11, r15)     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.zzhw r6 = r10.f26435a     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.K()     // Catch:{ RuntimeException -> 0x0337 }
            java.lang.String r11 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0339
            java.lang.String r0 = "available"
            goto L_0x033b
        L_0x0337:
            r0 = move-exception
            goto L_0x033f
        L_0x0339:
            java.lang.String r0 = "not available"
        L_0x033b:
            r6.b(r11, r0)     // Catch:{ RuntimeException -> 0x0337 }
            goto L_0x0382
        L_0x033f:
            com.google.android.gms.measurement.internal.zzhw r6 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgi r6 = r6.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.G()     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00c5 }
            r6.b(r10, r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0353:
            com.google.android.gms.measurement.internal.zzhw r0 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.L()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0363:
            com.google.android.gms.measurement.internal.zzhw r0 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.J()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0373:
            com.google.android.gms.measurement.internal.zzhw r0 = r10.f26435a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.N()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Install Referrer Reporter was called with invalid app package name"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
        L_0x0382:
            com.google.android.gms.measurement.internal.zzhp r0 = r23.f()     // Catch:{ all -> 0x00c5 }
            r0.n()     // Catch:{ all -> 0x00c5 }
            r23.A0()     // Catch:{ all -> 0x00c5 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r6.<init>()     // Catch:{ all -> 0x00c5 }
            r10 = 1
            r6.putLong(r9, r10)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r12, r10)     // Catch:{ all -> 0x00c5 }
            r8 = 0
            r6.putLong(r7, r8)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r5, r8)     // Catch:{ all -> 0x00c5 }
            r12 = r22
            r6.putLong(r12, r8)     // Catch:{ all -> 0x00c5 }
            r15 = r21
            r6.putLong(r15, r8)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r4, r10)     // Catch:{ all -> 0x00c5 }
            boolean r0 = r2.O     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x03b5
            r6.putLong(r3, r10)     // Catch:{ all -> 0x00c5 }
        L_0x03b5:
            java.lang.String r0 = r2.f26977z     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.m(r0)     // Catch:{ all -> 0x00c5 }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzam r0 = r23.l0()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.common.internal.Preconditions.g(r3)     // Catch:{ all -> 0x00c5 }
            r0.n()     // Catch:{ all -> 0x00c5 }
            r0.u()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.B0(r3, r4)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzhw r0 = r1.f26911l     // Catch:{ all -> 0x00c5 }
            android.content.Context r0 = r0.a()     // Catch:{ all -> 0x00c5 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x03f4
            com.google.android.gms.measurement.internal.zzgi r0 = r23.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgi.v(r3)     // Catch:{ all -> 0x00c5 }
            r0.b(r4, r3)     // Catch:{ all -> 0x00c5 }
            r21 = r5
        L_0x03f0:
            r3 = 0
            goto L_0x04a6
        L_0x03f4:
            com.google.android.gms.measurement.internal.zzhw r0 = r1.f26911l     // Catch:{ NameNotFoundException -> 0x0404 }
            android.content.Context r0 = r0.a()     // Catch:{ NameNotFoundException -> 0x0404 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.a(r0)     // Catch:{ NameNotFoundException -> 0x0404 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.d(r3, r4)     // Catch:{ NameNotFoundException -> 0x0404 }
            goto L_0x0417
        L_0x0404:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r4 = r23.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgi.v(r3)     // Catch:{ all -> 0x00c5 }
            r4.c(r10, r11, r0)     // Catch:{ all -> 0x00c5 }
            r0 = 0
        L_0x0417:
            if (r0 == 0) goto L_0x0465
            long r10 = r0.firstInstallTime     // Catch:{ all -> 0x00c5 }
            r16 = 0
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0465
            r21 = r5
            long r4 = r0.lastUpdateTime     // Catch:{ all -> 0x00c5 }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0448
            com.google.android.gms.measurement.internal.zzah r0 = r23.i0()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzfz r4 = com.google.android.gms.measurement.internal.zzbj.s0     // Catch:{ all -> 0x00c5 }
            boolean r0 = r0.t(r4)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0441
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0446
            r4 = 1
            r6.putLong(r7, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0446
        L_0x0441:
            r4 = 1
            r6.putLong(r7, r4)     // Catch:{ all -> 0x00c5 }
        L_0x0446:
            r0 = 0
            goto L_0x0449
        L_0x0448:
            r0 = 1
        L_0x0449:
            com.google.android.gms.measurement.internal.zzok r4 = new com.google.android.gms.measurement.internal.zzok     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fi"
            if (r0 == 0) goto L_0x0452
            r10 = 1
            goto L_0x0454
        L_0x0452:
            r10 = 0
        L_0x0454:
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r5 = r15
            r15 = r4
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.y(r4, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0468
        L_0x0465:
            r21 = r5
            r5 = r15
        L_0x0468:
            com.google.android.gms.measurement.internal.zzhw r0 = r1.f26911l     // Catch:{ NameNotFoundException -> 0x0478 }
            android.content.Context r0 = r0.a()     // Catch:{ NameNotFoundException -> 0x0478 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.a(r0)     // Catch:{ NameNotFoundException -> 0x0478 }
            r4 = 0
            android.content.pm.ApplicationInfo r11 = r0.b(r3, r4)     // Catch:{ NameNotFoundException -> 0x0478 }
            goto L_0x048b
        L_0x0478:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r4 = r23.m()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ all -> 0x00c5 }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgi.v(r3)     // Catch:{ all -> 0x00c5 }
            r4.c(r7, r3, r0)     // Catch:{ all -> 0x00c5 }
            r11 = 0
        L_0x048b:
            if (r11 == 0) goto L_0x03f0
            int r0 = r11.flags     // Catch:{ all -> 0x00c5 }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0499
            r3 = 1
            r6.putLong(r12, r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x049b
        L_0x0499:
            r3 = 1
        L_0x049b:
            int r0 = r11.flags     // Catch:{ all -> 0x00c5 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03f0
            r6.putLong(r5, r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x03f0
        L_0x04a6:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04af
            r3 = r21
            r6.putLong(r3, r8)     // Catch:{ all -> 0x00c5 }
        L_0x04af:
            com.google.android.gms.measurement.internal.zzbh r0 = new com.google.android.gms.measurement.internal.zzbh     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_f"
            com.google.android.gms.measurement.internal.zzbc r3 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ all -> 0x00c5 }
            r3.<init>(r6)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r0
            r17 = r3
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.Y(r0, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0535
        L_0x04c7:
            r6 = r15
            r5 = 1
            if (r9 != r5) goto L_0x0535
            com.google.android.gms.measurement.internal.zzok r0 = new com.google.android.gms.measurement.internal.zzok     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fvt"
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.y(r0, r2)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzhp r0 = r23.f()     // Catch:{ all -> 0x00c5 }
            r0.n()     // Catch:{ all -> 0x00c5 }
            r23.A0()     // Catch:{ all -> 0x00c5 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x00c5 }
            r0.putLong(r12, r7)     // Catch:{ all -> 0x00c5 }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x00c5 }
            boolean r4 = r2.O     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x04ff
            r0.putLong(r3, r7)     // Catch:{ all -> 0x00c5 }
        L_0x04ff:
            com.google.android.gms.measurement.internal.zzbh r3 = new com.google.android.gms.measurement.internal.zzbh     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_v"
            com.google.android.gms.measurement.internal.zzbc r4 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.Y(r3, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0535
        L_0x0516:
            boolean r0 = r2.H     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0535
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzbh r3 = new com.google.android.gms.measurement.internal.zzbh     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_cd"
            com.google.android.gms.measurement.internal.zzbc r4 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.Y(r3, r2)     // Catch:{ all -> 0x00c5 }
        L_0x0535:
            com.google.android.gms.measurement.internal.zzam r0 = r23.l0()     // Catch:{ all -> 0x00c5 }
            r0.i1()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.zzam r0 = r23.l0()
            r0.g1()
            return
        L_0x0544:
            com.google.android.gms.measurement.internal.zzam r2 = r23.l0()
            r2.g1()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.h0(com.google.android.gms.measurement.internal.zzp):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzh i(com.google.android.gms.measurement.internal.zzp r13) {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.zzhp r0 = r12.f()
            r0.n()
            r12.A0()
            com.google.android.gms.common.internal.Preconditions.m(r13)
            java.lang.String r0 = r13.f26977z
            com.google.android.gms.common.internal.Preconditions.g(r0)
            java.lang.String r0 = r13.V
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0029
            java.util.Map r0 = r12.D
            java.lang.String r2 = r13.f26977z
            com.google.android.gms.measurement.internal.zznv$zzb r3 = new com.google.android.gms.measurement.internal.zznv$zzb
            java.lang.String r4 = r13.V
            r3.<init>(r4)
            r0.put(r2, r3)
        L_0x0029:
            com.google.android.gms.measurement.internal.zzam r0 = r12.l0()
            java.lang.String r2 = r13.f26977z
            com.google.android.gms.measurement.internal.zzh r0 = r0.L0(r2)
            java.lang.String r2 = r13.f26977z
            com.google.android.gms.measurement.internal.zzjc r2 = r12.U(r2)
            java.lang.String r3 = r13.U
            com.google.android.gms.measurement.internal.zzjc r3 = com.google.android.gms.measurement.internal.zzjc.q(r3)
            com.google.android.gms.measurement.internal.zzjc r2 = r2.h(r3)
            boolean r3 = r2.A()
            if (r3 == 0) goto L_0x0054
            com.google.android.gms.measurement.internal.zzms r3 = r12.f26908i
            java.lang.String r4 = r13.f26977z
            boolean r5 = r13.N
            java.lang.String r3 = r3.A(r4, r5)
            goto L_0x0056
        L_0x0054:
            java.lang.String r3 = ""
        L_0x0056:
            r4 = 0
            if (r0 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.zzh r0 = new com.google.android.gms.measurement.internal.zzh
            com.google.android.gms.measurement.internal.zzhw r5 = r12.f26911l
            java.lang.String r6 = r13.f26977z
            r0.<init>(r5, r6)
            boolean r5 = r2.B()
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = r12.o(r2)
            r0.J(r5)
        L_0x006f:
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x0078
            r0.f0(r3)
        L_0x0078:
            r2 = r4
            goto L_0x0142
        L_0x007b:
            boolean r5 = r2.A()
            if (r5 == 0) goto L_0x0129
            if (r3 == 0) goto L_0x0129
            java.lang.String r5 = r0.s()
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0129
            java.lang.String r5 = r0.s()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r0.f0(r3)
            boolean r3 = r13.N
            if (r3 == 0) goto L_0x0110
            com.google.android.gms.measurement.internal.zzms r3 = r12.f26908i
            java.lang.String r6 = r13.f26977z
            android.util.Pair r3 = r3.z(r6, r2)
            java.lang.Object r3 = r3.first
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0110
            if (r5 != 0) goto L_0x0110
            boolean r3 = com.google.android.gms.internal.measurement.zzpd.a()
            if (r3 == 0) goto L_0x00ca
            com.google.android.gms.measurement.internal.zzah r3 = r12.i0()
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.d1
            boolean r3 = r3.t(r5)
            if (r3 == 0) goto L_0x00ca
            boolean r3 = r2.B()
            if (r3 != 0) goto L_0x00ca
            r2 = 1
            goto L_0x00d2
        L_0x00ca:
            java.lang.String r2 = r12.o(r2)
            r0.J(r2)
            r2 = r4
        L_0x00d2:
            com.google.android.gms.measurement.internal.zzam r3 = r12.l0()
            java.lang.String r5 = r13.f26977z
            java.lang.String r6 = "_id"
            com.google.android.gms.measurement.internal.zzom r3 = r3.M0(r5, r6)
            if (r3 == 0) goto L_0x0142
            com.google.android.gms.measurement.internal.zzam r3 = r12.l0()
            java.lang.String r5 = r13.f26977z
            java.lang.String r6 = "_lair"
            com.google.android.gms.measurement.internal.zzom r3 = r3.M0(r5, r6)
            if (r3 != 0) goto L_0x0142
            com.google.android.gms.common.util.Clock r3 = r12.b()
            long r9 = r3.a()
            com.google.android.gms.measurement.internal.zzom r3 = new com.google.android.gms.measurement.internal.zzom
            java.lang.String r6 = r13.f26977z
            r7 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "auto"
            java.lang.String r8 = "_lair"
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r11)
            com.google.android.gms.measurement.internal.zzam r5 = r12.l0()
            r5.h0(r3)
            goto L_0x0142
        L_0x0110:
            java.lang.String r3 = r0.m()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0078
            boolean r3 = r2.B()
            if (r3 == 0) goto L_0x0078
            java.lang.String r2 = r12.o(r2)
            r0.J(r2)
            goto L_0x0078
        L_0x0129:
            java.lang.String r3 = r0.m()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0078
            boolean r3 = r2.B()
            if (r3 == 0) goto L_0x0078
            java.lang.String r2 = r12.o(r2)
            r0.J(r2)
            goto L_0x0078
        L_0x0142:
            java.lang.String r3 = r13.f26975A
            r0.Z(r3)
            java.lang.String r3 = r13.P
            r0.f(r3)
            java.lang.String r3 = r13.J
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0159
            java.lang.String r3 = r13.J
            r0.W(r3)
        L_0x0159:
            long r5 = r13.D
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0164
            r0.u0(r5)
        L_0x0164:
            java.lang.String r3 = r13.f26976B
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0171
            java.lang.String r3 = r13.f26976B
            r0.S(r3)
        L_0x0171:
            long r5 = r13.I
            r0.H(r5)
            java.lang.String r3 = r13.C
            if (r3 == 0) goto L_0x017d
            r0.O(r3)
        L_0x017d:
            long r5 = r13.E
            r0.n0(r5)
            boolean r3 = r13.G
            r0.K(r3)
            java.lang.String r3 = r13.F
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0194
            java.lang.String r3 = r13.F
            r0.c0(r3)
        L_0x0194:
            boolean r3 = r13.N
            r0.h(r3)
            java.lang.Boolean r3 = r13.Q
            r0.d(r3)
            long r5 = r13.R
            r0.q0(r5)
            java.lang.String r3 = r13.W
            r0.l0(r3)
            boolean r3 = com.google.android.gms.internal.measurement.zzpv.a()
            if (r3 == 0) goto L_0x01c0
            com.google.android.gms.measurement.internal.zzah r3 = r12.i0()
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.v0
            boolean r3 = r3.t(r5)
            if (r3 == 0) goto L_0x01c0
            java.util.List r1 = r13.S
            r0.g(r1)
            goto L_0x01d5
        L_0x01c0:
            boolean r3 = com.google.android.gms.internal.measurement.zzpv.a()
            if (r3 == 0) goto L_0x01d5
            com.google.android.gms.measurement.internal.zzah r3 = r12.i0()
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.u0
            boolean r3 = r3.t(r5)
            if (r3 == 0) goto L_0x01d5
            r0.g(r1)
        L_0x01d5:
            boolean r1 = com.google.android.gms.internal.measurement.zzrw.a()
            if (r1 == 0) goto L_0x020a
            com.google.android.gms.measurement.internal.zzah r1 = r12.i0()
            com.google.android.gms.measurement.internal.zzfz r3 = com.google.android.gms.measurement.internal.zzbj.x0
            boolean r1 = r1.t(r3)
            if (r1 == 0) goto L_0x020a
            r12.y0()
            java.lang.String r1 = r0.l()
            boolean r1 = com.google.android.gms.measurement.internal.zzop.H0(r1)
            if (r1 == 0) goto L_0x020a
            boolean r1 = r13.X
            r0.P(r1)
            com.google.android.gms.measurement.internal.zzah r1 = r12.i0()
            com.google.android.gms.measurement.internal.zzfz r3 = com.google.android.gms.measurement.internal.zzbj.y0
            boolean r1 = r1.t(r3)
            if (r1 == 0) goto L_0x020a
            java.lang.String r1 = r13.d0
            r0.o0(r1)
        L_0x020a:
            boolean r1 = com.google.android.gms.internal.measurement.zzrl.a()
            if (r1 == 0) goto L_0x0221
            com.google.android.gms.measurement.internal.zzah r1 = r12.i0()
            com.google.android.gms.measurement.internal.zzfz r3 = com.google.android.gms.measurement.internal.zzbj.H0
            boolean r1 = r1.t(r3)
            if (r1 == 0) goto L_0x0221
            int r1 = r13.b0
            r0.b(r1)
        L_0x0221:
            long r5 = r13.Y
            r0.G0(r5)
            boolean r1 = com.google.android.gms.internal.measurement.zzox.a()
            if (r1 == 0) goto L_0x023d
            com.google.android.gms.measurement.internal.zzah r1 = r12.i0()
            com.google.android.gms.measurement.internal.zzfz r3 = com.google.android.gms.measurement.internal.zzbj.X0
            boolean r1 = r1.t(r3)
            if (r1 == 0) goto L_0x023d
            java.lang.String r13 = r13.e0
            r0.i0(r13)
        L_0x023d:
            boolean r13 = com.google.android.gms.internal.measurement.zzpd.a()
            if (r13 == 0) goto L_0x025f
            com.google.android.gms.measurement.internal.zzah r13 = r12.i0()
            com.google.android.gms.measurement.internal.zzfz r1 = com.google.android.gms.measurement.internal.zzbj.d1
            boolean r13 = r13.t(r1)
            if (r13 == 0) goto L_0x025f
            boolean r13 = r0.B()
            if (r13 != 0) goto L_0x0257
            if (r2 == 0) goto L_0x026c
        L_0x0257:
            com.google.android.gms.measurement.internal.zzam r13 = r12.l0()
            r13.V(r0, r2, r4)
            goto L_0x026c
        L_0x025f:
            boolean r13 = r0.B()
            if (r13 == 0) goto L_0x026c
            com.google.android.gms.measurement.internal.zzam r13 = r12.l0()
            r13.V(r0, r4, r4)
        L_0x026c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.i(com.google.android.gms.measurement.internal.zzp):com.google.android.gms.measurement.internal.zzh");
    }

    public final zzah i0() {
        return ((zzhw) Preconditions.m(this.f26911l)).z();
    }

    public final void j0(zzp zzp) {
        if (this.f26924y != null) {
            ArrayList arrayList = new ArrayList();
            this.f26925z = arrayList;
            arrayList.addAll(this.f26924y);
        }
        zzam l0 = l0();
        String str = (String) Preconditions.m(zzp.f26977z);
        Preconditions.g(str);
        l0.n();
        l0.u();
        try {
            SQLiteDatabase B2 = l0.B();
            String[] strArr = {str};
            int delete = B2.delete("apps", "app_id=?", strArr) + B2.delete("events", "app_id=?", strArr) + B2.delete("events_snapshot", "app_id=?", strArr) + B2.delete("user_attributes", "app_id=?", strArr) + B2.delete("conditional_properties", "app_id=?", strArr) + B2.delete("raw_events", "app_id=?", strArr) + B2.delete("raw_events_metadata", "app_id=?", strArr) + B2.delete("queue", "app_id=?", strArr) + B2.delete("audience_filter_values", "app_id=?", strArr) + B2.delete("main_event_params", "app_id=?", strArr) + B2.delete("default_event_params", "app_id=?", strArr) + B2.delete("trigger_uris", "app_id=?", strArr) + B2.delete("upload_queue", "app_id=?", strArr);
            if (delete > 0) {
                l0.m().K().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            l0.m().G().c("Error resetting analytics data. appId, error", zzgi.v(str), e2);
        }
        if (zzp.G) {
            h0(zzp);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:48|49|50|51|52|53|54|55) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0107 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.zzhp r0 = r11.f()
            r0.n()
            r11.A0()
            r0 = 1
            r11.f26921v = r0
            r1 = 0
            com.google.android.gms.measurement.internal.zzhw r2 = r11.f26911l     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzlp r2 = r2.J()     // Catch:{ all -> 0x002d }
            java.lang.Boolean r2 = r2.X()     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.zzgi r12 = r11.m()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzgk r12 = r12.L()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Upload data called on the client side before use of service was decided"
            r12.a(r0)     // Catch:{ all -> 0x002d }
            r11.f26921v = r1
            r11.O()
            return
        L_0x002d:
            r12 = move-exception
            goto L_0x0122
        L_0x0030:
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0049
            com.google.android.gms.measurement.internal.zzgi r12 = r11.m()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzgk r12 = r12.G()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Upload called in the client side when service should be used"
            r12.a(r0)     // Catch:{ all -> 0x002d }
            r11.f26921v = r1
            r11.O()
            return
        L_0x0049:
            long r2 = r11.f26914o     // Catch:{ all -> 0x002d }
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x005a
            r11.Q()     // Catch:{ all -> 0x002d }
            r11.f26921v = r1
            r11.O()
            return
        L_0x005a:
            boolean r2 = r11.S()     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzgi r12 = r11.m()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzgk r12 = r12.K()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Uploading requested multiple times"
            r12.a(r0)     // Catch:{ all -> 0x002d }
            r11.f26921v = r1
            r11.O()
            return
        L_0x0073:
            com.google.android.gms.measurement.internal.zzgp r2 = r11.p0()     // Catch:{ all -> 0x002d }
            boolean r2 = r2.B()     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.zzgi r12 = r11.m()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzgk r12 = r12.K()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Network not connected, ignoring upload request"
            r12.a(r0)     // Catch:{ all -> 0x002d }
            r11.Q()     // Catch:{ all -> 0x002d }
            r11.f26921v = r1
            r11.O()
            return
        L_0x0093:
            com.google.android.gms.measurement.internal.zzam r2 = r11.l0()     // Catch:{ all -> 0x002d }
            boolean r2 = r2.f1(r12)     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x00b0
            com.google.android.gms.measurement.internal.zzgi r0 = r11.m()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.K()     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "Upload queue has no batches for appId"
            r0.b(r2, r12)     // Catch:{ all -> 0x002d }
            r11.f26921v = r1
            r11.O()
            return
        L_0x00b0:
            com.google.android.gms.measurement.internal.zzam r2 = r11.l0()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzog r2 = r2.V0(r12)     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x00c0
            r11.f26921v = r1
            r11.O()
            return
        L_0x00c0:
            com.google.android.gms.internal.measurement.zzgn$zzj r3 = r2.b()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x00cc
            r11.f26921v = r1
            r11.O()
            return
        L_0x00cc:
            com.google.android.gms.measurement.internal.zzol r4 = r11.x0()     // Catch:{ all -> 0x002d }
            java.lang.String r4 = r4.M(r3)     // Catch:{ all -> 0x002d }
            byte[] r8 = r3.m()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzgi r3 = r11.m()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.K()     // Catch:{ all -> 0x002d }
            java.lang.String r5 = "Uploading data from upload queue. appId, uncompressed size, data"
            int r6 = r8.length     // Catch:{ all -> 0x002d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x002d }
            r3.d(r5, r12, r6, r4)     // Catch:{ all -> 0x002d }
            r11.f26920u = r0     // Catch:{ MalformedURLException -> 0x0107 }
            com.google.android.gms.measurement.internal.zzgp r5 = r11.p0()     // Catch:{ MalformedURLException -> 0x0107 }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0107 }
            java.lang.String r0 = r2.c()     // Catch:{ MalformedURLException -> 0x0107 }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x0107 }
            java.util.Map r9 = r2.d()     // Catch:{ MalformedURLException -> 0x0107 }
            com.google.android.gms.measurement.internal.zznz r10 = new com.google.android.gms.measurement.internal.zznz     // Catch:{ MalformedURLException -> 0x0107 }
            r10.<init>(r11, r12, r2)     // Catch:{ MalformedURLException -> 0x0107 }
            r6 = r12
            r5.y(r6, r7, r8, r9, r10)     // Catch:{ MalformedURLException -> 0x0107 }
            goto L_0x011c
        L_0x0107:
            com.google.android.gms.measurement.internal.zzgi r0 = r11.m()     // Catch:{ all -> 0x002d }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Failed to parse URL. Not uploading MeasurementBatch. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzgi.v(r12)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.c()     // Catch:{ all -> 0x002d }
            r0.c(r3, r12, r2)     // Catch:{ all -> 0x002d }
        L_0x011c:
            r11.f26921v = r1
            r11.O()
            return
        L_0x0122:
            r11.f26921v = r1
            r11.O()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.k0(java.lang.String):void");
    }

    public final zzam l0() {
        return (zzam) k(this.f26902c);
    }

    public final zzgi m() {
        return ((zzhw) Preconditions.m(this.f26911l)).m();
    }

    public final void m0(zzp zzp) {
        f().n();
        A0();
        Preconditions.g(zzp.f26977z);
        zzaz d2 = zzaz.d(zzp.a0);
        m().K().c("Setting DMA consent for package", zzp.f26977z, d2);
        String str = zzp.f26977z;
        f().n();
        A0();
        zzjb g2 = zzaz.b(g(str), 100).g();
        this.C.put(str, d2);
        l0().X(str, d2);
        zzjb g3 = zzaz.b(g(str), 100).g();
        f().n();
        A0();
        zzjb zzjb = zzjb.DENIED;
        boolean z2 = false;
        boolean z3 = g2 == zzjb && g3 == zzjb.GRANTED;
        boolean z4 = g2 == zzjb.GRANTED && g3 == zzjb;
        if (i0().t(zzbj.Q0)) {
            if (z3 || z4) {
                z2 = true;
            }
            z3 = z2;
        }
        if (z3) {
            m().K().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (l0().J(F0(), str, false, false, false, false, false, false).f26211f < ((long) i0().y(str, zzbj.Z))) {
                bundle.putLong("_r", 1);
                m().K().c("_dcu realtime event count", str, Long.valueOf(l0().J(F0(), str, false, false, false, false, false, true).f26211f));
            }
            this.G.b(str, "_dcu", bundle);
        }
    }

    public final Boolean n(zzh zzh) {
        try {
            if (zzh.U() != -2147483648L) {
                if (zzh.U() == ((long) Wrappers.a(this.f26911l.a()).d(zzh.l(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.a(this.f26911l.a()).d(zzh.l(), 0).versionName;
                String o2 = zzh.o();
                if (o2 != null && o2.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final zzgh n0() {
        return this.f26911l.D();
    }

    public final String o(zzjc zzjc) {
        if (!zzjc.B()) {
            return null;
        }
        byte[] bArr = new byte[16];
        y0().W0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final void o0(zzp zzp) {
        f().n();
        A0();
        Preconditions.g(zzp.f26977z);
        zzjc i2 = zzjc.i(zzp.U, zzp.Z);
        zzjc U = U(zzp.f26977z);
        m().K().c("Setting storage consent for package", zzp.f26977z, i2);
        E(zzp.f26977z, i2);
        if ((!zzpd.a() || !i0().t(zzbj.d1)) && i2.u(U)) {
            j0(zzp);
        }
    }

    public final zzgp p0() {
        return (zzgp) k(this.f26901b);
    }

    public final Boolean q0(zzp zzp) {
        Boolean bool = zzp.Q;
        if (!zzox.a() || !i0().t(zzbj.X0) || TextUtils.isEmpty(zzp.e0)) {
            return bool;
        }
        int i2 = zzoc.f26945a[zzd.a(zzp.e0).b().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return Boolean.FALSE;
            }
            if (i2 == 3) {
                return Boolean.TRUE;
            }
            if (i2 != 4) {
                return bool;
            }
        }
        return null;
    }

    public final void r(zzgn.zzk.zza zza2, long j2, boolean z2) {
        String str = z2 ? "_se" : "_lte";
        zzom M0 = l0().M0(zza2.r1(), str);
        zzom zzom = (M0 == null || M0.f26966e == null) ? new zzom(zza2.r1(), "auto", str, b().a(), Long.valueOf(j2)) : new zzom(zza2.r1(), "auto", str, b().a(), Long.valueOf(((Long) M0.f26966e).longValue() + j2));
        zzgn.zzo zzo = (zzgn.zzo) ((zzlc) zzgn.zzo.W().G(str).I(b().a()).B(((Long) zzom.f26966e).longValue()).F());
        int y2 = zzol.y(zza2, str);
        if (y2 >= 0) {
            zza2.H(y2, zzo);
        } else {
            zza2.O(zzo);
        }
        if (j2 > 0) {
            l0().h0(zzom);
            m().K().c("Updated engagement user property. scope, value", z2 ? "session-scoped" : "lifetime", zzom.f26966e);
        }
    }

    public final zzhg r0() {
        return (zzhg) k(this.f26900a);
    }

    public final void s(zzaf zzaf) {
        zzp c0 = c0((String) Preconditions.m(zzaf.f26176z));
        if (c0 != null) {
            t(zzaf, c0);
        }
    }

    public final void t(zzaf zzaf, zzp zzp) {
        Preconditions.m(zzaf);
        Preconditions.g(zzaf.f26176z);
        Preconditions.m(zzaf.f26175B);
        Preconditions.g(zzaf.f26175B.f26959A);
        f().n();
        A0();
        if (s0(zzp)) {
            if (!zzp.G) {
                i(zzp);
                return;
            }
            l0().b1();
            try {
                i(zzp);
                String str = (String) Preconditions.m(zzaf.f26176z);
                zzaf H0 = l0().H0(str, zzaf.f26175B.f26959A);
                if (H0 != null) {
                    m().F().c("Removing conditional user property", zzaf.f26176z, this.f26911l.D().g(zzaf.f26175B.f26959A));
                    l0().D(str, zzaf.f26175B.f26959A);
                    if (H0.D) {
                        l0().S0(str, zzaf.f26175B.f26959A);
                    }
                    zzbh zzbh = zzaf.J;
                    if (zzbh != null) {
                        zzbc zzbc = zzbh.f26254A;
                        e0((zzbh) Preconditions.m(y0().H(str, ((zzbh) Preconditions.m(zzaf.J)).f26256z, zzbc != null ? zzbc.X() : null, H0.f26174A, zzaf.J.C, true, true)), zzp);
                    }
                } else {
                    m().L().c("Conditional user property doesn't exist", zzgi.v(zzaf.f26176z), this.f26911l.D().g(zzaf.f26175B.f26959A));
                }
                l0().i1();
                l0().g1();
            } catch (Throwable th) {
                l0().g1();
                throw th;
            }
        }
    }

    public final zzhw t0() {
        return this.f26911l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002b, code lost:
        r4 = r1.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(com.google.android.gms.measurement.internal.zzbh r20, com.google.android.gms.measurement.internal.zzp r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            com.google.android.gms.common.internal.Preconditions.m(r21)
            java.lang.String r2 = r0.f26977z
            com.google.android.gms.common.internal.Preconditions.g(r2)
            com.google.android.gms.measurement.internal.zzhp r2 = r19.f()
            r2.n()
            r19.A0()
            java.lang.String r2 = r0.f26977z
            r3 = r20
            long r10 = r3.C
            com.google.android.gms.measurement.internal.zzgm r3 = com.google.android.gms.measurement.internal.zzgm.b(r20)
            com.google.android.gms.measurement.internal.zzhp r4 = r19.f()
            r4.n()
            com.google.android.gms.measurement.internal.zzlh r4 = r1.E
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r1.F
            if (r4 == 0) goto L_0x0039
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            com.google.android.gms.measurement.internal.zzlh r4 = r1.E
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            android.os.Bundle r5 = r3.f26343d
            r12 = 0
            com.google.android.gms.measurement.internal.zzop.X(r4, r5, r12)
            com.google.android.gms.measurement.internal.zzbh r3 = r3.a()
            r19.x0()
            boolean r4 = com.google.android.gms.measurement.internal.zzol.e0(r3, r0)
            if (r4 != 0) goto L_0x004e
            return
        L_0x004e:
            boolean r4 = r0.G
            if (r4 != 0) goto L_0x0056
            r1.i(r0)
            return
        L_0x0056:
            java.util.List r4 = r0.S
            if (r4 == 0) goto L_0x0097
            java.lang.String r5 = r3.f26256z
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0085
            com.google.android.gms.measurement.internal.zzbc r4 = r3.f26254A
            android.os.Bundle r4 = r4.X()
            java.lang.String r5 = "ga_safelisted"
            r6 = 1
            r4.putLong(r5, r6)
            com.google.android.gms.measurement.internal.zzbh r5 = new com.google.android.gms.measurement.internal.zzbh
            java.lang.String r14 = r3.f26256z
            com.google.android.gms.measurement.internal.zzbc r15 = new com.google.android.gms.measurement.internal.zzbc
            r15.<init>(r4)
            java.lang.String r4 = r3.f26255B
            long r6 = r3.C
            r13 = r5
            r16 = r4
            r17 = r6
            r13.<init>(r14, r15, r16, r17)
            goto L_0x0098
        L_0x0085:
            com.google.android.gms.measurement.internal.zzgi r0 = r19.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.F()
            java.lang.String r4 = r3.f26256z
            java.lang.String r3 = r3.f26255B
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.d(r5, r2, r4, r3)
            return
        L_0x0097:
            r13 = r3
        L_0x0098:
            com.google.android.gms.measurement.internal.zzam r3 = r19.l0()
            r3.b1()
            com.google.android.gms.measurement.internal.zzam r3 = r19.l0()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.common.internal.Preconditions.g(r2)     // Catch:{ all -> 0x00cc }
            r3.n()     // Catch:{ all -> 0x00cc }
            r3.u()     // Catch:{ all -> 0x00cc }
            r4 = 0
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.zzgi r3 = r3.m()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.L()     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = "Invalid time querying timed out conditional properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r2)     // Catch:{ all -> 0x00cc }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00cc }
            r3.c(r5, r6, r7)     // Catch:{ all -> 0x00cc }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cc }
            goto L_0x00dd
        L_0x00cc:
            r0 = move-exception
            goto L_0x02e5
        L_0x00cf:
            java.lang.String r5 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00cc }
            java.lang.String[] r6 = new java.lang.String[]{r2, r6}     // Catch:{ all -> 0x00cc }
            java.util.List r3 = r3.S(r5, r6)     // Catch:{ all -> 0x00cc }
        L_0x00dd:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00cc }
        L_0x00e1:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00cc }
            if (r5 == 0) goto L_0x012c
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzaf r5 = (com.google.android.gms.measurement.internal.zzaf) r5     // Catch:{ all -> 0x00cc }
            if (r5 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.zzgi r6 = r19.m()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.K()     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = "User property timed out"
            java.lang.String r8 = r5.f26176z     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzhw r9 = r1.f26911l     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgh r9 = r9.D()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzok r14 = r5.f26175B     // Catch:{ all -> 0x00cc }
            java.lang.String r14 = r14.f26959A     // Catch:{ all -> 0x00cc }
            java.lang.String r9 = r9.g(r14)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzok r14 = r5.f26175B     // Catch:{ all -> 0x00cc }
            java.lang.Object r14 = r14.H()     // Catch:{ all -> 0x00cc }
            r6.d(r7, r8, r9, r14)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzbh r6 = r5.F     // Catch:{ all -> 0x00cc }
            if (r6 == 0) goto L_0x0120
            com.google.android.gms.measurement.internal.zzbh r6 = new com.google.android.gms.measurement.internal.zzbh     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzbh r7 = r5.F     // Catch:{ all -> 0x00cc }
            r6.<init>(r7, r10)     // Catch:{ all -> 0x00cc }
            r1.e0(r6, r0)     // Catch:{ all -> 0x00cc }
        L_0x0120:
            com.google.android.gms.measurement.internal.zzam r6 = r19.l0()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzok r5 = r5.f26175B     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = r5.f26959A     // Catch:{ all -> 0x00cc }
            r6.D(r2, r5)     // Catch:{ all -> 0x00cc }
            goto L_0x00e1
        L_0x012c:
            com.google.android.gms.measurement.internal.zzam r3 = r19.l0()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.common.internal.Preconditions.g(r2)     // Catch:{ all -> 0x00cc }
            r3.n()     // Catch:{ all -> 0x00cc }
            r3.u()     // Catch:{ all -> 0x00cc }
            if (r4 >= 0) goto L_0x0155
            com.google.android.gms.measurement.internal.zzgi r3 = r3.m()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.L()     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = "Invalid time querying expired conditional properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r2)     // Catch:{ all -> 0x00cc }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00cc }
            r3.c(r5, r6, r7)     // Catch:{ all -> 0x00cc }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cc }
            goto L_0x0163
        L_0x0155:
            java.lang.String r5 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00cc }
            java.lang.String[] r6 = new java.lang.String[]{r2, r6}     // Catch:{ all -> 0x00cc }
            java.util.List r3 = r3.S(r5, r6)     // Catch:{ all -> 0x00cc }
        L_0x0163:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00cc }
            int r6 = r3.size()     // Catch:{ all -> 0x00cc }
            r5.<init>(r6)     // Catch:{ all -> 0x00cc }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00cc }
        L_0x0170:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x00cc }
            if (r6 == 0) goto L_0x01bf
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzaf r6 = (com.google.android.gms.measurement.internal.zzaf) r6     // Catch:{ all -> 0x00cc }
            if (r6 == 0) goto L_0x0170
            com.google.android.gms.measurement.internal.zzgi r7 = r19.m()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgk r7 = r7.K()     // Catch:{ all -> 0x00cc }
            java.lang.String r8 = "User property expired"
            java.lang.String r9 = r6.f26176z     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzhw r14 = r1.f26911l     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgh r14 = r14.D()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzok r15 = r6.f26175B     // Catch:{ all -> 0x00cc }
            java.lang.String r15 = r15.f26959A     // Catch:{ all -> 0x00cc }
            java.lang.String r14 = r14.g(r15)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzok r15 = r6.f26175B     // Catch:{ all -> 0x00cc }
            java.lang.Object r15 = r15.H()     // Catch:{ all -> 0x00cc }
            r7.d(r8, r9, r14, r15)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzam r7 = r19.l0()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzok r8 = r6.f26175B     // Catch:{ all -> 0x00cc }
            java.lang.String r8 = r8.f26959A     // Catch:{ all -> 0x00cc }
            r7.S0(r2, r8)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzbh r7 = r6.J     // Catch:{ all -> 0x00cc }
            if (r7 == 0) goto L_0x01b3
            r5.add(r7)     // Catch:{ all -> 0x00cc }
        L_0x01b3:
            com.google.android.gms.measurement.internal.zzam r7 = r19.l0()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzok r6 = r6.f26175B     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = r6.f26959A     // Catch:{ all -> 0x00cc }
            r7.D(r2, r6)     // Catch:{ all -> 0x00cc }
            goto L_0x0170
        L_0x01bf:
            int r3 = r5.size()     // Catch:{ all -> 0x00cc }
            r6 = r12
        L_0x01c4:
            if (r6 >= r3) goto L_0x01d7
            java.lang.Object r7 = r5.get(r6)     // Catch:{ all -> 0x00cc }
            int r6 = r6 + 1
            com.google.android.gms.measurement.internal.zzbh r7 = (com.google.android.gms.measurement.internal.zzbh) r7     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzbh r8 = new com.google.android.gms.measurement.internal.zzbh     // Catch:{ all -> 0x00cc }
            r8.<init>(r7, r10)     // Catch:{ all -> 0x00cc }
            r1.e0(r8, r0)     // Catch:{ all -> 0x00cc }
            goto L_0x01c4
        L_0x01d7:
            com.google.android.gms.measurement.internal.zzam r3 = r19.l0()     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = r13.f26256z     // Catch:{ all -> 0x00cc }
            com.google.android.gms.common.internal.Preconditions.g(r2)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.common.internal.Preconditions.g(r5)     // Catch:{ all -> 0x00cc }
            r3.n()     // Catch:{ all -> 0x00cc }
            r3.u()     // Catch:{ all -> 0x00cc }
            if (r4 >= 0) goto L_0x020d
            com.google.android.gms.measurement.internal.zzgi r4 = r3.m()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.L()     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = "Invalid time querying triggered conditional properties"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgi.v(r2)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgh r3 = r3.h()     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r3.c(r5)     // Catch:{ all -> 0x00cc }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00cc }
            r4.d(r6, r2, r3, r5)     // Catch:{ all -> 0x00cc }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cc }
            goto L_0x021b
        L_0x020d:
            java.lang.String r4 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00cc }
            java.lang.String[] r2 = new java.lang.String[]{r2, r5, r6}     // Catch:{ all -> 0x00cc }
            java.util.List r2 = r3.S(r4, r2)     // Catch:{ all -> 0x00cc }
        L_0x021b:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x00cc }
            int r3 = r2.size()     // Catch:{ all -> 0x00cc }
            r14.<init>(r3)     // Catch:{ all -> 0x00cc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00cc }
        L_0x0228:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00cc }
            if (r3 == 0) goto L_0x02bb
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00cc }
            r15 = r3
            com.google.android.gms.measurement.internal.zzaf r15 = (com.google.android.gms.measurement.internal.zzaf) r15     // Catch:{ all -> 0x00cc }
            if (r15 == 0) goto L_0x0228
            com.google.android.gms.measurement.internal.zzok r3 = r15.f26175B     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzom r9 = new com.google.android.gms.measurement.internal.zzom     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = r15.f26176z     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.m(r4)     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = r15.f26174A     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = r3.f26959A     // Catch:{ all -> 0x00cc }
            java.lang.Object r3 = r3.H()     // Catch:{ all -> 0x00cc }
            java.lang.Object r16 = com.google.android.gms.common.internal.Preconditions.m(r3)     // Catch:{ all -> 0x00cc }
            r3 = r9
            r7 = r10
            r12 = r9
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzam r3 = r19.l0()     // Catch:{ all -> 0x00cc }
            boolean r3 = r3.h0(r12)     // Catch:{ all -> 0x00cc }
            if (r3 == 0) goto L_0x027f
            com.google.android.gms.measurement.internal.zzgi r3 = r19.m()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.K()     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = "User property triggered"
            java.lang.String r5 = r15.f26176z     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzhw r6 = r1.f26911l     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgh r6 = r6.D()     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = r12.f26964c     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = r6.g(r7)     // Catch:{ all -> 0x00cc }
            java.lang.Object r7 = r12.f26966e     // Catch:{ all -> 0x00cc }
            r3.d(r4, r5, r6, r7)     // Catch:{ all -> 0x00cc }
            goto L_0x02a0
        L_0x027f:
            com.google.android.gms.measurement.internal.zzgi r3 = r19.m()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = "Too many active user properties, ignoring"
            java.lang.String r5 = r15.f26176z     // Catch:{ all -> 0x00cc }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgi.v(r5)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzhw r6 = r1.f26911l     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzgh r6 = r6.D()     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = r12.f26964c     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = r6.g(r7)     // Catch:{ all -> 0x00cc }
            java.lang.Object r7 = r12.f26966e     // Catch:{ all -> 0x00cc }
            r3.d(r4, r5, r6, r7)     // Catch:{ all -> 0x00cc }
        L_0x02a0:
            com.google.android.gms.measurement.internal.zzbh r3 = r15.H     // Catch:{ all -> 0x00cc }
            if (r3 == 0) goto L_0x02a7
            r14.add(r3)     // Catch:{ all -> 0x00cc }
        L_0x02a7:
            com.google.android.gms.measurement.internal.zzok r3 = new com.google.android.gms.measurement.internal.zzok     // Catch:{ all -> 0x00cc }
            r3.<init>(r12)     // Catch:{ all -> 0x00cc }
            r15.f26175B = r3     // Catch:{ all -> 0x00cc }
            r3 = 1
            r15.D = r3     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzam r3 = r19.l0()     // Catch:{ all -> 0x00cc }
            r3.f0(r15)     // Catch:{ all -> 0x00cc }
            r12 = 0
            goto L_0x0228
        L_0x02bb:
            r1.e0(r13, r0)     // Catch:{ all -> 0x00cc }
            int r2 = r14.size()     // Catch:{ all -> 0x00cc }
            r12 = 0
        L_0x02c3:
            if (r12 >= r2) goto L_0x02d6
            java.lang.Object r3 = r14.get(r12)     // Catch:{ all -> 0x00cc }
            int r12 = r12 + 1
            com.google.android.gms.measurement.internal.zzbh r3 = (com.google.android.gms.measurement.internal.zzbh) r3     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzbh r4 = new com.google.android.gms.measurement.internal.zzbh     // Catch:{ all -> 0x00cc }
            r4.<init>(r3, r10)     // Catch:{ all -> 0x00cc }
            r1.e0(r4, r0)     // Catch:{ all -> 0x00cc }
            goto L_0x02c3
        L_0x02d6:
            com.google.android.gms.measurement.internal.zzam r0 = r19.l0()     // Catch:{ all -> 0x00cc }
            r0.i1()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.zzam r0 = r19.l0()
            r0.g1()
            return
        L_0x02e5:
            com.google.android.gms.measurement.internal.zzam r2 = r19.l0()
            r2.g1()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznv.u(com.google.android.gms.measurement.internal.zzbh, com.google.android.gms.measurement.internal.zzp):void");
    }

    public final zzlf u0() {
        return (zzlf) k(this.f26907h);
    }

    public final void v(zzbh zzbh, String str) {
        zzbh zzbh2 = zzbh;
        String str2 = str;
        zzh L0 = l0().L0(str2);
        if (L0 == null || TextUtils.isEmpty(L0.o())) {
            m().F().b("No app data available; dropping event", str2);
            return;
        }
        Boolean n2 = n(L0);
        if (n2 == null) {
            if (!"_ui".equals(zzbh2.f26256z)) {
                m().L().b("Could not find package. appId", zzgi.v(str));
            }
        } else if (!n2.booleanValue()) {
            m().G().b("App version does not match; dropping event. appId", zzgi.v(str));
            return;
        }
        zzp zzp = r2;
        zzp zzp2 = new zzp(str, L0.q(), L0.o(), L0.U(), L0.n(), L0.z0(), L0.t0(), (String) null, L0.A(), false, L0.p(), L0.Q(), 0, 0, L0.z(), false, L0.j(), L0.K0(), L0.v0(), L0.w(), (String) null, U(str2).z(), "", (String) null, L0.C(), L0.J0(), U(str2).b(), g0(str2).j(), L0.a(), L0.X(), L0.v(), L0.t());
        Y(zzbh2, zzp);
    }

    public final zzms v0() {
        return this.f26908i;
    }

    public final void w(zzh zzh, zzgn.zzk.zza zza2) {
        zzgn.zzo zzo;
        f().n();
        A0();
        zzai a2 = zzai.a(zza2.t1());
        if (!zzox.a() || !i0().t(zzbj.X0)) {
            String l2 = zzh.l();
            f().n();
            A0();
            zzjc U = U(l2);
            if (U.w() != null) {
                a2.c(zzjc.zza.AD_STORAGE, U.b());
            } else {
                a2.d(zzjc.zza.AD_STORAGE, zzal.FAILSAFE);
            }
            if (U.x() != null) {
                a2.c(zzjc.zza.ANALYTICS_STORAGE, U.b());
            } else {
                a2.d(zzjc.zza.ANALYTICS_STORAGE, zzal.FAILSAFE);
            }
        } else {
            String l3 = zzh.l();
            f().n();
            A0();
            zzjc U2 = U(l3);
            int[] iArr = zzoc.f26945a;
            int i2 = iArr[U2.t().ordinal()];
            if (i2 == 1) {
                a2.d(zzjc.zza.AD_STORAGE, zzal.REMOTE_ENFORCED_DEFAULT);
            } else if (i2 == 2 || i2 == 3) {
                a2.c(zzjc.zza.AD_STORAGE, U2.b());
            } else {
                a2.d(zzjc.zza.AD_STORAGE, zzal.FAILSAFE);
            }
            int i3 = iArr[U2.v().ordinal()];
            if (i3 == 1) {
                a2.d(zzjc.zza.ANALYTICS_STORAGE, zzal.REMOTE_ENFORCED_DEFAULT);
            } else if (i3 == 2 || i3 == 3) {
                a2.c(zzjc.zza.ANALYTICS_STORAGE, U2.b());
            } else {
                a2.d(zzjc.zza.ANALYTICS_STORAGE, zzal.FAILSAFE);
            }
        }
        String l4 = zzh.l();
        f().n();
        A0();
        zzaz h2 = h(l4, g0(l4), U(l4), a2);
        zza2.e0(((Boolean) Preconditions.m(h2.h())).booleanValue());
        if (!TextUtils.isEmpty(h2.i())) {
            zza2.K0(h2.i());
        }
        f().n();
        A0();
        Iterator it = zza2.V().iterator();
        while (true) {
            if (!it.hasNext()) {
                zzo = null;
                break;
            }
            zzo = (zzgn.zzo) it.next();
            if ("_npa".equals(zzo.Y())) {
                break;
            }
        }
        if (zzo != null) {
            zzjc.zza zza3 = zzjc.zza.AD_PERSONALIZATION;
            if (a2.b(zza3) == zzal.UNSET) {
                zzom M0 = l0().M0(zzh.l(), "_npa");
                if (M0 == null) {
                    Boolean K0 = zzh.K0();
                    if (K0 == null || ((K0 == Boolean.TRUE && zzo.T() != 1) || (K0 == Boolean.FALSE && zzo.T() != 0))) {
                        a2.d(zza3, zzal.API);
                    } else {
                        a2.d(zza3, zzal.MANIFEST);
                    }
                } else if ("tcf".equals(M0.f26963b)) {
                    a2.d(zza3, zzal.TCF);
                } else if ("app".equals(M0.f26963b)) {
                    a2.d(zza3, zzal.API);
                } else {
                    a2.d(zza3, zzal.MANIFEST);
                }
            }
        } else {
            int c2 = c(zzh.l(), a2);
            zza2.O((zzgn.zzo) ((zzlc) zzgn.zzo.W().G("_npa").I(b().a()).B((long) c2).F()));
            m().K().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(c2));
        }
        zza2.B0(a2.toString());
        boolean Z = this.f26900a.Z(zzh.l());
        List U3 = zza2.U();
        int i4 = 0;
        for (int i5 = 0; i5 < U3.size(); i5++) {
            if ("_tcf".equals(((zzgn.zzf) U3.get(i5)).Y())) {
                zzgn.zzf.zza zza4 = (zzgn.zzf.zza) ((zzgn.zzf) U3.get(i5)).z();
                List U4 = zza4.U();
                while (true) {
                    if (i4 >= U4.size()) {
                        break;
                    } else if ("_tcfd".equals(((zzgn.zzh) U4.get(i4)).a0())) {
                        zza4.B(i4, zzgn.zzh.Y().I("_tcfd").K(zzni.d(((zzgn.zzh) U4.get(i4)).b0(), Z)));
                        break;
                    } else {
                        i4++;
                    }
                }
                zza2.B(i5, zza4);
                return;
            }
        }
    }

    public final zznq w0() {
        return this.f26909j;
    }

    public final zzol x0() {
        return (zzol) k(this.f26906g);
    }

    public final void y(zzok zzok, zzp zzp) {
        zzom M0;
        long j2;
        f().n();
        A0();
        if (s0(zzp)) {
            if (!zzp.G) {
                i(zzp);
                return;
            }
            int r0 = y0().r0(zzok.f26959A);
            int i2 = 0;
            if (r0 != 0) {
                y0();
                String str = zzok.f26959A;
                i0();
                String J = zzop.J(str, 24, true);
                String str2 = zzok.f26959A;
                int length = str2 != null ? str2.length() : 0;
                y0();
                zzop.Z(this.G, zzp.f26977z, r0, "_ev", J, length);
                return;
            }
            int w2 = y0().w(zzok.f26959A, zzok.H());
            if (w2 != 0) {
                y0();
                String str3 = zzok.f26959A;
                i0();
                String J2 = zzop.J(str3, 24, true);
                Object H2 = zzok.H();
                if (H2 != null && ((H2 instanceof String) || (H2 instanceof CharSequence))) {
                    i2 = String.valueOf(H2).length();
                }
                y0();
                zzop.Z(this.G, zzp.f26977z, w2, "_ev", J2, i2);
                return;
            }
            Object A0 = y0().A0(zzok.f26959A, zzok.H());
            if (A0 != null) {
                if ("_sid".equals(zzok.f26959A)) {
                    long j3 = zzok.f26960B;
                    String str4 = zzok.E;
                    String str5 = (String) Preconditions.m(zzp.f26977z);
                    zzom M02 = l0().M0(str5, "_sno");
                    if (M02 != null) {
                        Object obj = M02.f26966e;
                        if (obj instanceof Long) {
                            j2 = ((Long) obj).longValue();
                            y(new zzok("_sno", j3, Long.valueOf(j2 + 1), str4), zzp);
                        }
                    }
                    if (M02 != null) {
                        m().L().b("Retrieved last session number from database does not contain a valid (long) value", M02.f26966e);
                    }
                    zzbd K0 = l0().K0(str5, "_s");
                    if (K0 != null) {
                        j2 = K0.f26243c;
                        m().K().b("Backfill the session number. Last used session number", Long.valueOf(j2));
                    } else {
                        j2 = 0;
                    }
                    y(new zzok("_sno", j3, Long.valueOf(j2 + 1), str4), zzp);
                }
                zzom zzom = new zzom((String) Preconditions.m(zzp.f26977z), (String) Preconditions.m(zzok.E), zzok.f26959A, zzok.f26960B, A0);
                m().K().c("Setting user property", this.f26911l.D().g(zzom.f26964c), A0);
                l0().b1();
                try {
                    if ("_id".equals(zzom.f26964c) && (M0 = l0().M0(zzp.f26977z, "_id")) != null && !zzom.f26966e.equals(M0.f26966e)) {
                        l0().S0(zzp.f26977z, "_lair");
                    }
                    i(zzp);
                    boolean h0 = l0().h0(zzom);
                    if ("_sid".equals(zzok.f26959A)) {
                        long z2 = x0().z(zzp.W);
                        zzh L0 = l0().L0(zzp.f26977z);
                        if (L0 != null) {
                            L0.E0(z2);
                            if (L0.B()) {
                                l0().V(L0, false, false);
                            }
                        }
                    }
                    l0().i1();
                    if (!h0) {
                        m().G().c("Too many unique user properties are set. Ignoring user property", this.f26911l.D().g(zzom.f26964c), zzom.f26966e);
                        y0();
                        zzop.Z(this.G, zzp.f26977z, 9, (String) null, (String) null, 0);
                    }
                    l0().g1();
                } catch (Throwable th) {
                    l0().g1();
                    throw th;
                }
            }
        }
    }

    public final zzop y0() {
        return ((zzhw) Preconditions.m(this.f26911l)).L();
    }

    public final void z(Runnable runnable) {
        f().n();
        if (this.f26915p == null) {
            this.f26915p = new ArrayList();
        }
        this.f26915p.add(runnable);
    }

    public final void z0() {
        f().n();
        A0();
        if (!this.f26913n) {
            this.f26913n = true;
            if (T()) {
                int d2 = d(this.f26923x);
                int D2 = this.f26911l.B().D();
                f().n();
                if (d2 > D2) {
                    m().G().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(d2), Integer.valueOf(D2));
                } else if (d2 >= D2) {
                } else {
                    if (L(D2, this.f26923x)) {
                        m().K().c("Storage version upgraded. Previous, current version", Integer.valueOf(d2), Integer.valueOf(D2));
                    } else {
                        m().G().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(d2), Integer.valueOf(D2));
                    }
                }
            }
        }
    }

    public class zzb {

        /* renamed from: a  reason: collision with root package name */
        public final String f26931a;

        /* renamed from: b  reason: collision with root package name */
        public long f26932b;

        public zzb(zznv zznv) {
            this(zznv, zznv.y0().U0());
        }

        public zzb(zznv zznv, String str) {
            this.f26931a = str;
            this.f26932b = zznv.b().c();
        }
    }

    public zznv(zzoh zzoh, zzhw zzhw) {
        this.f26912m = false;
        this.f26916q = new HashSet();
        this.G = new zzoa(this);
        Preconditions.m(zzoh);
        this.f26911l = zzhw.c(zzoh.f26953a, (zzdt) null, (Long) null);
        this.f26898A = -1;
        this.f26909j = new zznq(this);
        zzol zzol = new zzol(this);
        zzol.v();
        this.f26906g = zzol;
        zzgp zzgp = new zzgp(this);
        zzgp.v();
        this.f26901b = zzgp;
        zzhg zzhg = new zzhg(this);
        zzhg.v();
        this.f26900a = zzhg;
        this.f26899B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        f().D(new zznx(this, zzoh));
    }
}
