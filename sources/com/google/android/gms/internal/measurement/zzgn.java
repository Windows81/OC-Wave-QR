package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import java.util.Collections;
import java.util.List;

public final class zzgn {

    public static final class zza extends zzlc<zza, C0005zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzmu<zza> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";
        private long zzm;

        /* renamed from: com.google.android.gms.internal.measurement.zzgn$zza$zza  reason: collision with other inner class name */
        public static final class C0005zza extends zzlc.zzb<zza, C0005zza> implements zzmn {
            public final C0005zza B(String str) {
                u();
                zza.M((zza) this.f25622A, str);
                return this;
            }

            public final long G() {
                return ((zza) this.f25622A).N();
            }

            public final C0005zza H(long j2) {
                u();
                zza.P((zza) this.f25622A, j2);
                return this;
            }

            public final C0005zza I(String str) {
                u();
                zza.R((zza) this.f25622A, str);
                return this;
            }

            public final C0005zza J() {
                u();
                zza.K((zza) this.f25622A);
                return this;
            }

            public final C0005zza K(String str) {
                u();
                zza.U((zza) this.f25622A, str);
                return this;
            }

            public final C0005zza L() {
                u();
                zza.O((zza) this.f25622A);
                return this;
            }

            public final C0005zza M(String str) {
                u();
                zza.X((zza) this.f25622A, str);
                return this;
            }

            public final C0005zza N() {
                u();
                zza.T((zza) this.f25622A);
                return this;
            }

            public final C0005zza O(String str) {
                u();
                zza.a0((zza) this.f25622A, str);
                return this;
            }

            public final C0005zza P() {
                u();
                zza.W((zza) this.f25622A);
                return this;
            }

            public final C0005zza R(String str) {
                u();
                zza.d0((zza) this.f25622A, str);
                return this;
            }

            public final C0005zza T() {
                u();
                zza.Z((zza) this.f25622A);
                return this;
            }

            public final C0005zza U() {
                u();
                zza.c0((zza) this.f25622A);
                return this;
            }

            public final long y() {
                return ((zza) this.f25622A).J();
            }

            public final C0005zza z(long j2) {
                u();
                zza.L((zza) this.f25622A, j2);
                return this;
            }

            public C0005zza() {
                super(zza.zzc);
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzlc.v(zza.class, zza);
        }

        public static /* synthetic */ void K(zza zza) {
            zza.zze &= -5;
            zza.zzh = zzc.zzh;
        }

        public static /* synthetic */ void L(zza zza, long j2) {
            zza.zze |= 8;
            zza.zzi = j2;
        }

        public static /* synthetic */ void M(zza zza, String str) {
            str.getClass();
            zza.zze |= 4;
            zza.zzh = str;
        }

        public static /* synthetic */ void O(zza zza) {
            zza.zze &= -3;
            zza.zzg = zzc.zzg;
        }

        public static /* synthetic */ void P(zza zza, long j2) {
            zza.zze |= 128;
            zza.zzm = j2;
        }

        public static /* synthetic */ void R(zza zza, String str) {
            str.getClass();
            zza.zze |= 2;
            zza.zzg = str;
        }

        public static C0005zza S() {
            return (C0005zza) zzc.y();
        }

        public static /* synthetic */ void T(zza zza) {
            zza.zze &= -2;
            zza.zzf = zzc.zzf;
        }

        public static /* synthetic */ void U(zza zza, String str) {
            str.getClass();
            zza.zze |= 1;
            zza.zzf = str;
        }

        public static /* synthetic */ void W(zza zza) {
            zza.zze &= -65;
            zza.zzl = zzc.zzl;
        }

        public static /* synthetic */ void X(zza zza, String str) {
            str.getClass();
            zza.zze |= 64;
            zza.zzl = str;
        }

        public static zza Y() {
            return zzc;
        }

        public static /* synthetic */ void Z(zza zza) {
            zza.zze &= -33;
            zza.zzk = zzc.zzk;
        }

        public static /* synthetic */ void a0(zza zza, String str) {
            str.getClass();
            zza.zze |= 32;
            zza.zzk = str;
        }

        public static /* synthetic */ void c0(zza zza) {
            zza.zze &= -17;
            zza.zzj = zzc.zzj;
        }

        public static /* synthetic */ void d0(zza zza, String str) {
            str.getClass();
            zza.zze |= 16;
            zza.zzj = str;
        }

        public final long J() {
            return this.zzi;
        }

        public final long N() {
            return this.zzm;
        }

        public final String b0() {
            return this.zzh;
        }

        public final String e0() {
            return this.zzg;
        }

        public final String f0() {
            return this.zzf;
        }

        public final String g0() {
            return this.zzl;
        }

        public final String h0() {
            return this.zzk;
        }

        public final String i0() {
            return this.zzj;
        }

        public final boolean j0() {
            return (this.zze & 4) != 0;
        }

        public final boolean k0() {
            return (this.zze & 2) != 0;
        }

        public final boolean l0() {
            return (this.zze & 1) != 0;
        }

        public final boolean m0() {
            return (this.zze & 8) != 0;
        }

        public final boolean n0() {
            return (this.zze & 128) != 0;
        }

        public final boolean o0() {
            return (this.zze & 64) != 0;
        }

        public final boolean p0() {
            return (this.zze & 32) != 0;
        }

        public final boolean q0() {
            return (this.zze & 16) != 0;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0005zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zza> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zza.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzb extends zzlc<zzb, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzb zzc;
        private static volatile zzmu<zzb> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        public static final class zza extends zzlc.zzb<zzb, zza> implements zzmn {
            public zza() {
                super(zzb.zzc);
            }
        }

        static {
            zzb zzb = new zzb();
            zzc = zzb;
            zzlc.v(zzb.class, zzb);
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzb> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzb.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzc extends zzlc<zzc, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzc zzc;
        private static volatile zzmu<zzc> zzd;
        private int zze;
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        public static final class zza extends zzlc.zzb<zzc, zza> implements zzmn {
            public final zza B(boolean z2) {
                u();
                zzc.O((zzc) this.f25622A, z2);
                return this;
            }

            public final zza G(boolean z2) {
                u();
                zzc.P((zzc) this.f25622A, z2);
                return this;
            }

            public final zza H(boolean z2) {
                u();
                zzc.S((zzc) this.f25622A, z2);
                return this;
            }

            public final zza I(boolean z2) {
                u();
                zzc.U((zzc) this.f25622A, z2);
                return this;
            }

            public final zza J(boolean z2) {
                u();
                zzc.W((zzc) this.f25622A, z2);
                return this;
            }

            public final zza y(boolean z2) {
                u();
                zzc.K((zzc) this.f25622A, z2);
                return this;
            }

            public final zza z(boolean z2) {
                u();
                zzc.M((zzc) this.f25622A, z2);
                return this;
            }

            public zza() {
                super(zzc.zzc);
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzc = zzc2;
            zzlc.v(zzc.class, zzc2);
        }

        public static zza J() {
            return (zza) zzc.y();
        }

        public static /* synthetic */ void K(zzc zzc2, boolean z2) {
            zzc2.zze |= 32;
            zzc2.zzk = z2;
        }

        public static /* synthetic */ void M(zzc zzc2, boolean z2) {
            zzc2.zze |= 16;
            zzc2.zzj = z2;
        }

        public static zzc N() {
            return zzc;
        }

        public static /* synthetic */ void O(zzc zzc2, boolean z2) {
            zzc2.zze |= 1;
            zzc2.zzf = z2;
        }

        public static /* synthetic */ void P(zzc zzc2, boolean z2) {
            zzc2.zze |= 64;
            zzc2.zzl = z2;
        }

        public static /* synthetic */ void S(zzc zzc2, boolean z2) {
            zzc2.zze |= 2;
            zzc2.zzg = z2;
        }

        public static /* synthetic */ void U(zzc zzc2, boolean z2) {
            zzc2.zze |= 4;
            zzc2.zzh = z2;
        }

        public static /* synthetic */ void W(zzc zzc2, boolean z2) {
            zzc2.zze |= 8;
            zzc2.zzi = z2;
        }

        public final boolean R() {
            return this.zzk;
        }

        public final boolean T() {
            return this.zzj;
        }

        public final boolean V() {
            return this.zzf;
        }

        public final boolean X() {
            return this.zzl;
        }

        public final boolean Y() {
            return this.zzg;
        }

        public final boolean Z() {
            return this.zzh;
        }

        public final boolean a0() {
            return this.zzi;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzc> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzc.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzd extends zzlc<zzd, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzd zzc;
        private static volatile zzmu<zzd> zzd;
        private int zze;
        private int zzf;
        private zzm zzg;
        private zzm zzh;
        private boolean zzi;

        public static final class zza extends zzlc.zzb<zzd, zza> implements zzmn {
            public final zza B(zzm zzm) {
                u();
                zzd.N((zzd) this.f25622A, zzm);
                return this;
            }

            public final zza G(boolean z2) {
                u();
                zzd.L((zzd) this.f25622A, z2);
                return this;
            }

            public final zza y(int i2) {
                u();
                zzd.J((zzd) this.f25622A, i2);
                return this;
            }

            public final zza z(zzm.zza zza) {
                u();
                zzd.K((zzd) this.f25622A, (zzm) ((zzlc) zza.F()));
                return this;
            }

            public zza() {
                super(zzd.zzc);
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzc = zzd2;
            zzlc.v(zzd.class, zzd2);
        }

        public static /* synthetic */ void J(zzd zzd2, int i2) {
            zzd2.zze |= 1;
            zzd2.zzf = i2;
        }

        public static /* synthetic */ void K(zzd zzd2, zzm zzm) {
            zzm.getClass();
            zzd2.zzg = zzm;
            zzd2.zze |= 2;
        }

        public static /* synthetic */ void L(zzd zzd2, boolean z2) {
            zzd2.zze |= 8;
            zzd2.zzi = z2;
        }

        public static zza M() {
            return (zza) zzc.y();
        }

        public static /* synthetic */ void N(zzd zzd2, zzm zzm) {
            zzm.getClass();
            zzd2.zzh = zzm;
            zzd2.zze |= 4;
        }

        public final zzm P() {
            zzm zzm = this.zzg;
            return zzm == null ? zzm.X() : zzm;
        }

        public final zzm R() {
            zzm zzm = this.zzh;
            return zzm == null ? zzm.X() : zzm;
        }

        public final boolean S() {
            return this.zzi;
        }

        public final boolean T() {
            return (this.zze & 1) != 0;
        }

        public final boolean U() {
            return (this.zze & 8) != 0;
        }

        public final boolean V() {
            return (this.zze & 4) != 0;
        }

        public final int n() {
            return this.zzf;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzd> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzd.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zze extends zzlc<zze, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zze zzc;
        private static volatile zzmu<zze> zzd;
        private int zze;
        private int zzf;
        private long zzg;

        public static final class zza extends zzlc.zzb<zze, zza> implements zzmn {
            public final zza y(int i2) {
                u();
                zze.J((zze) this.f25622A, i2);
                return this;
            }

            public final zza z(long j2) {
                u();
                zze.K((zze) this.f25622A, j2);
                return this;
            }

            public zza() {
                super(zze.zzc);
            }
        }

        static {
            zze zze2 = new zze();
            zzc = zze2;
            zzlc.v(zze.class, zze2);
        }

        public static /* synthetic */ void J(zze zze2, int i2) {
            zze2.zze |= 1;
            zze2.zzf = i2;
        }

        public static /* synthetic */ void K(zze zze2, long j2) {
            zze2.zze |= 2;
            zze2.zzg = j2;
        }

        public static zza M() {
            return (zza) zzc.y();
        }

        public final long L() {
            return this.zzg;
        }

        public final boolean O() {
            return (this.zze & 2) != 0;
        }

        public final boolean P() {
            return (this.zze & 1) != 0;
        }

        public final int n() {
            return this.zzf;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zze> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zze.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzf extends zzlc<zzf, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzf zzc;
        private static volatile zzmu<zzf> zzd;
        private int zze;
        /* access modifiers changed from: private */
        public zzll<zzh> zzf = zzlc.D();
        private String zzg = "";
        private long zzh;
        private long zzi;
        private int zzj;

        public static final class zza extends zzlc.zzb<zzf, zza> implements zzmn {
            public final zza B(int i2, zzh.zza zza) {
                u();
                zzf.M((zzf) this.f25622A, i2, (zzh) ((zzlc) zza.F()));
                return this;
            }

            public final zza G(int i2, zzh zzh) {
                u();
                zzf.M((zzf) this.f25622A, i2, zzh);
                return this;
            }

            public final zza H(long j2) {
                u();
                zzf.N((zzf) this.f25622A, j2);
                return this;
            }

            public final zza I(zzh.zza zza) {
                u();
                zzf.O((zzf) this.f25622A, (zzh) ((zzlc) zza.F()));
                return this;
            }

            public final zza J(zzh zzh) {
                u();
                zzf.O((zzf) this.f25622A, zzh);
                return this;
            }

            public final zza K(Iterable iterable) {
                u();
                zzf.P((zzf) this.f25622A, iterable);
                return this;
            }

            public final zza L(String str) {
                u();
                zzf.R((zzf) this.f25622A, str);
                return this;
            }

            public final long M() {
                return ((zzf) this.f25622A).U();
            }

            public final zza N(long j2) {
                u();
                zzf.T((zzf) this.f25622A, j2);
                return this;
            }

            public final zzh O(int i2) {
                return ((zzf) this.f25622A).J(i2);
            }

            public final long P() {
                return ((zzf) this.f25622A).V();
            }

            public final zza R() {
                u();
                ((zzf) this.f25622A).zzf = zzlc.D();
                return this;
            }

            public final String T() {
                return ((zzf) this.f25622A).Y();
            }

            public final List U() {
                return Collections.unmodifiableList(((zzf) this.f25622A).Z());
            }

            public final boolean V() {
                return ((zzf) this.f25622A).c0();
            }

            public final int y() {
                return ((zzf) this.f25622A).S();
            }

            public final zza z(int i2) {
                u();
                zzf.L((zzf) this.f25622A, i2);
                return this;
            }

            public zza() {
                super(zzf.zzc);
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzc = zzf2;
            zzlc.v(zzf.class, zzf2);
        }

        public static /* synthetic */ void L(zzf zzf2, int i2) {
            zzf2.d0();
            zzf2.zzf.remove(i2);
        }

        public static /* synthetic */ void M(zzf zzf2, int i2, zzh zzh2) {
            zzh2.getClass();
            zzf2.d0();
            zzf2.zzf.set(i2, zzh2);
        }

        public static /* synthetic */ void N(zzf zzf2, long j2) {
            zzf2.zze |= 4;
            zzf2.zzi = j2;
        }

        public static /* synthetic */ void O(zzf zzf2, zzh zzh2) {
            zzh2.getClass();
            zzf2.d0();
            zzf2.zzf.add(zzh2);
        }

        public static /* synthetic */ void P(zzf zzf2, Iterable iterable) {
            zzf2.d0();
            zzji.j(iterable, zzf2.zzf);
        }

        public static /* synthetic */ void R(zzf zzf2, String str) {
            str.getClass();
            zzf2.zze |= 1;
            zzf2.zzg = str;
        }

        public static /* synthetic */ void T(zzf zzf2, long j2) {
            zzf2.zze |= 2;
            zzf2.zzh = j2;
        }

        public static zza W() {
            return (zza) zzc.y();
        }

        public final zzh J(int i2) {
            return this.zzf.get(i2);
        }

        public final int S() {
            return this.zzf.size();
        }

        public final long U() {
            return this.zzi;
        }

        public final long V() {
            return this.zzh;
        }

        public final String Y() {
            return this.zzg;
        }

        public final List Z() {
            return this.zzf;
        }

        public final boolean a0() {
            return (this.zze & 8) != 0;
        }

        public final boolean b0() {
            return (this.zze & 4) != 0;
        }

        public final boolean c0() {
            return (this.zze & 2) != 0;
        }

        public final void d0() {
            zzll<zzh> zzll = this.zzf;
            if (!zzll.c()) {
                this.zzf = zzlc.r(zzll);
            }
        }

        public final int n() {
            return this.zzj;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzh.class, "zzg", "zzh", "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzf> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzf.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzg extends zzlc<zzg, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzg zzc;
        private static volatile zzmu<zzg> zzd;
        private int zze;
        private String zzf = "";
        private long zzg;

        public static final class zza extends zzlc.zzb<zzg, zza> implements zzmn {
            public final zza y(long j2) {
                u();
                zzg.K((zzg) this.f25622A, j2);
                return this;
            }

            public final zza z(String str) {
                u();
                zzg.L((zzg) this.f25622A, str);
                return this;
            }

            public zza() {
                super(zzg.zzc);
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzc = zzg2;
            zzlc.v(zzg.class, zzg2);
        }

        public static zza J() {
            return (zza) zzc.y();
        }

        public static /* synthetic */ void K(zzg zzg2, long j2) {
            zzg2.zze |= 2;
            zzg2.zzg = j2;
        }

        public static /* synthetic */ void L(zzg zzg2, String str) {
            str.getClass();
            zzg2.zze |= 1;
            zzg2.zzf = str;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzg> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzg.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzh extends zzlc<zzh, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzh zzc;
        private static volatile zzmu<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private long zzh;
        private float zzi;
        private double zzj;
        /* access modifiers changed from: private */
        public zzll<zzh> zzk = zzlc.D();

        public static final class zza extends zzlc.zzb<zzh, zza> implements zzmn {
            public final zza B(long j2) {
                u();
                zzh.M((zzh) this.f25622A, j2);
                return this;
            }

            public final zza G(zza zza) {
                u();
                zzh.N((zzh) this.f25622A, (zzh) ((zzlc) zza.F()));
                return this;
            }

            public final zza H(Iterable iterable) {
                u();
                zzh.O((zzh) this.f25622A, iterable);
                return this;
            }

            public final zza I(String str) {
                u();
                zzh.P((zzh) this.f25622A, str);
                return this;
            }

            public final zza J() {
                u();
                zzh.K((zzh) this.f25622A);
                return this;
            }

            public final zza K(String str) {
                u();
                zzh.T((zzh) this.f25622A, str);
                return this;
            }

            public final zza L() {
                u();
                zzh.S((zzh) this.f25622A);
                return this;
            }

            public final zza M() {
                u();
                ((zzh) this.f25622A).zzk = zzlc.D();
                return this;
            }

            public final zza N() {
                u();
                zzh.X((zzh) this.f25622A);
                return this;
            }

            public final String O() {
                return ((zzh) this.f25622A).a0();
            }

            public final String P() {
                return ((zzh) this.f25622A).b0();
            }

            public final int y() {
                return ((zzh) this.f25622A).U();
            }

            public final zza z(double d2) {
                u();
                zzh.L((zzh) this.f25622A, d2);
                return this;
            }

            public zza() {
                super(zzh.zzc);
            }
        }

        static {
            zzh zzh2 = new zzh();
            zzc = zzh2;
            zzlc.v(zzh.class, zzh2);
        }

        public static /* synthetic */ void K(zzh zzh2) {
            zzh2.zze &= -17;
            zzh2.zzj = 0.0d;
        }

        public static /* synthetic */ void L(zzh zzh2, double d2) {
            zzh2.zze |= 16;
            zzh2.zzj = d2;
        }

        public static /* synthetic */ void M(zzh zzh2, long j2) {
            zzh2.zze |= 4;
            zzh2.zzh = j2;
        }

        public static /* synthetic */ void N(zzh zzh2, zzh zzh3) {
            zzh3.getClass();
            zzh2.i0();
            zzh2.zzk.add(zzh3);
        }

        public static /* synthetic */ void O(zzh zzh2, Iterable iterable) {
            zzh2.i0();
            zzji.j(iterable, zzh2.zzk);
        }

        public static /* synthetic */ void P(zzh zzh2, String str) {
            str.getClass();
            zzh2.zze |= 1;
            zzh2.zzf = str;
        }

        public static /* synthetic */ void S(zzh zzh2) {
            zzh2.zze &= -5;
            zzh2.zzh = 0;
        }

        public static /* synthetic */ void T(zzh zzh2, String str) {
            str.getClass();
            zzh2.zze |= 2;
            zzh2.zzg = str;
        }

        public static /* synthetic */ void X(zzh zzh2) {
            zzh2.zze &= -3;
            zzh2.zzg = zzc.zzg;
        }

        public static zza Y() {
            return (zza) zzc.y();
        }

        public final double J() {
            return this.zzj;
        }

        public final float R() {
            return this.zzi;
        }

        public final int U() {
            return this.zzk.size();
        }

        public final long W() {
            return this.zzh;
        }

        public final String a0() {
            return this.zzf;
        }

        public final String b0() {
            return this.zzg;
        }

        public final List c0() {
            return this.zzk;
        }

        public final boolean d0() {
            return (this.zze & 16) != 0;
        }

        public final boolean e0() {
            return (this.zze & 8) != 0;
        }

        public final boolean f0() {
            return (this.zze & 4) != 0;
        }

        public final boolean g0() {
            return (this.zze & 1) != 0;
        }

        public final boolean h0() {
            return (this.zze & 2) != 0;
        }

        public final void i0() {
            zzll<zzh> zzll = this.zzk;
            if (!zzll.c()) {
                this.zzk = zzlc.r(zzll);
            }
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzh.class});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzh> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzh.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzi extends zzlc<zzi, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzi zzc;
        private static volatile zzmu<zzi> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private zzb zzh;

        public static final class zza extends zzlc.zzb<zzi, zza> implements zzmn {
            public zza() {
                super(zzi.zzc);
            }
        }

        static {
            zzi zzi = new zzi();
            zzc = zzi;
            zzlc.v(zzi.class, zzi);
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzi> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzi.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzj extends zzlc<zzj, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzj zzc;
        private static volatile zzmu<zzj> zzd;
        private int zze;
        /* access modifiers changed from: private */
        public zzll<zzk> zzf = zzlc.D();
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        public static final class zza extends zzlc.zzb<zzj, zza> implements zzmn {
            public final zza B(Iterable iterable) {
                u();
                zzj.M((zzj) this.f25622A, iterable);
                return this;
            }

            public final zza G(String str) {
                u();
                zzj.N((zzj) this.f25622A, str);
                return this;
            }

            public final zzk H(int i2) {
                return ((zzj) this.f25622A).K(0);
            }

            public final zza I() {
                u();
                ((zzj) this.f25622A).zzf = zzlc.D();
                return this;
            }

            public final zza J(String str) {
                u();
                zzj.R((zzj) this.f25622A, str);
                return this;
            }

            public final String K() {
                return ((zzj) this.f25622A).T();
            }

            public final List L() {
                return Collections.unmodifiableList(((zzj) this.f25622A).V());
            }

            public final int y() {
                return ((zzj) this.f25622A).n();
            }

            public final zza z(zzk.zza zza) {
                u();
                zzj.L((zzj) this.f25622A, (zzk) ((zzlc) zza.F()));
                return this;
            }

            public zza() {
                super(zzj.zzc);
            }
        }

        public enum zzb implements zzlh {
            SDK(0),
            SGTM(1);
            

            /* renamed from: z  reason: collision with root package name */
            public final int f25462z;

            /* access modifiers changed from: public */
            zzb(int i2) {
                this.f25462z = i2;
            }

            public static zzb d(int i2) {
                if (i2 == 0) {
                    return SDK;
                }
                if (i2 != 1) {
                    return null;
                }
                return SGTM;
            }

            public static zzlg f() {
                return zzha.f25474a;
            }

            public final int a() {
                return this.f25462z;
            }

            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f25462z + " name=" + name() + '>';
            }
        }

        static {
            zzj zzj = new zzj();
            zzc = zzj;
            zzlc.v(zzj.class, zzj);
        }

        public static zza J(zzj zzj) {
            return (zza) zzc.o(zzj);
        }

        public static /* synthetic */ void L(zzj zzj, zzk zzk) {
            zzk.getClass();
            zzj.Y();
            zzj.zzf.add(zzk);
        }

        public static /* synthetic */ void M(zzj zzj, Iterable iterable) {
            zzj.Y();
            zzji.j(iterable, zzj.zzf);
        }

        public static /* synthetic */ void N(zzj zzj, String str) {
            str.getClass();
            zzj.zze |= 1;
            zzj.zzg = str;
        }

        public static zza O() {
            return (zza) zzc.y();
        }

        public static /* synthetic */ void R(zzj zzj, String str) {
            str.getClass();
            zzj.zze |= 2;
            zzj.zzh = str;
        }

        public final zzk K(int i2) {
            return this.zzf.get(0);
        }

        public final String T() {
            return this.zzg;
        }

        public final String U() {
            return this.zzh;
        }

        public final List V() {
            return this.zzf;
        }

        public final boolean W() {
            return (this.zze & 1) != 0;
        }

        public final boolean X() {
            return (this.zze & 2) != 0;
        }

        public final void Y() {
            zzll<zzk> zzll = this.zzf;
            if (!zzll.c()) {
                this.zzf = zzlc.r(zzll);
            }
        }

        public final int n() {
            return this.zzf.size();
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", zzk.class, "zzg", "zzh", "zzi", zzb.f()});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzj> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzj.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzk extends zzlc<zzk, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzk zzc;
        private static volatile zzmu<zzk> zzd;
        private String zzaa = "";
        private long zzab;
        private int zzac;
        private String zzad = "";
        private String zzae = "";
        private boolean zzaf;
        /* access modifiers changed from: private */
        public zzll<zzd> zzag = zzlc.D();
        private String zzah = "";
        private int zzai;
        private int zzaj;
        private int zzak;
        private String zzal = "";
        private long zzam;
        private long zzan;
        private String zzao = "";
        private String zzap = "";
        private int zzaq;
        private String zzar = "";
        private zzl zzas;
        private zzlj zzat = zzlc.B();
        private long zzau;
        private long zzav;
        private String zzaw = "";
        private String zzax = "";
        private int zzay;
        private boolean zzaz;
        private String zzba = "";
        private boolean zzbb;
        private zzi zzbc;
        private String zzbd = "";
        private zzll<String> zzbe = zzlc.D();
        private String zzbf = "";
        private long zzbg;
        private boolean zzbh;
        private String zzbi = "";
        private boolean zzbj;
        private String zzbk = "";
        private int zzbl;
        private String zzbm = "";
        private zzc zzbn;
        private int zzbo;
        private zza zzbp;
        private int zze;
        private int zzf;
        private int zzg;
        /* access modifiers changed from: private */
        public zzll<zzf> zzh = zzlc.D();
        private zzll<zzo> zzi = zzlc.D();
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private String zzo = "";
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private int zzs;
        private String zzt = "";
        private String zzu = "";
        private String zzv = "";
        private long zzw;
        private long zzx;
        private String zzy = "";
        private boolean zzz;

        public static final class zza extends zzlc.zzb<zzk, zza> implements zzmn {
            public final zza B(int i2, zzf.zza zza) {
                u();
                zzk.M((zzk) this.f25622A, i2, (zzf) ((zzlc) zza.F()));
                return this;
            }

            public final zza B0(String str) {
                u();
                zzk.F1((zzk) this.f25622A, str);
                return this;
            }

            public final zza C0() {
                return ((zzk) this.f25622A).x2();
            }

            public final zza D0(int i2) {
                u();
                zzk.D1((zzk) this.f25622A, i2);
                return this;
            }

            public final zza E0(long j2) {
                u();
                zzk.J1((zzk) this.f25622A, j2);
                return this;
            }

            public final zza F0(String str) {
                u();
                zzk.K1((zzk) this.f25622A, str);
                return this;
            }

            public final zza G(int i2, zzf zzf) {
                u();
                zzk.M((zzk) this.f25622A, i2, zzf);
                return this;
            }

            public final zza H(int i2, zzo zzo) {
                u();
                zzk.N((zzk) this.f25622A, i2, zzo);
                return this;
            }

            public final zza H0() {
                u();
                zzk.B0((zzk) this.f25622A);
                return this;
            }

            public final zza I(long j2) {
                u();
                zzk.O((zzk) this.f25622A, j2);
                return this;
            }

            public final zza I0(int i2) {
                u();
                zzk.I1((zzk) this.f25622A, 1);
                return this;
            }

            public final zza J(zza zza) {
                u();
                zzk.P((zzk) this.f25622A, zza);
                return this;
            }

            public final zza J0(long j2) {
                u();
                zzk.O1((zzk) this.f25622A, j2);
                return this;
            }

            public final zza K(zzc zzc) {
                u();
                zzk.R((zzk) this.f25622A, zzc);
                return this;
            }

            public final zza K0(String str) {
                u();
                zzk.P1((zzk) this.f25622A, str);
                return this;
            }

            public final zza L(zzf.zza zza) {
                u();
                zzk.S((zzk) this.f25622A, (zzf) ((zzlc) zza.F()));
                return this;
            }

            public final zza L0() {
                u();
                ((zzk) this.f25622A).zzag = zzlc.D();
                return this;
            }

            public final zza M(zzl.zza zza) {
                u();
                zzk.T((zzk) this.f25622A, (zzl) ((zzlc) zza.F()));
                return this;
            }

            public final zza M0(int i2) {
                u();
                zzk.N1((zzk) this.f25622A, i2);
                return this;
            }

            public final zza N(zzo.zza zza) {
                u();
                zzk.U((zzk) this.f25622A, (zzo) ((zzlc) zza.F()));
                return this;
            }

            public final zza N0(long j2) {
                u();
                zzk.T1((zzk) this.f25622A, j2);
                return this;
            }

            public final zza O(zzo zzo) {
                u();
                zzk.U((zzk) this.f25622A, zzo);
                return this;
            }

            public final zza O0(String str) {
                u();
                zzk.U1((zzk) this.f25622A, str);
                return this;
            }

            public final zza P(Iterable iterable) {
                u();
                zzk.V((zzk) this.f25622A, iterable);
                return this;
            }

            public final zza P0() {
                u();
                zzk.p1((zzk) this.f25622A);
                return this;
            }

            public final zza Q0(int i2) {
                u();
                zzk.S1((zzk) this.f25622A, i2);
                return this;
            }

            public final zza R(String str) {
                u();
                zzk.W((zzk) this.f25622A, str);
                return this;
            }

            public final zza R0(long j2) {
                u();
                zzk.X1((zzk) this.f25622A, j2);
                return this;
            }

            public final zza S0(String str) {
                u();
                zzk.Y1((zzk) this.f25622A, str);
                return this;
            }

            public final zza T(boolean z2) {
                u();
                zzk.X((zzk) this.f25622A, z2);
                return this;
            }

            public final zza T0() {
                u();
                zzk.w1((zzk) this.f25622A);
                return this;
            }

            public final List U() {
                return Collections.unmodifiableList(((zzk) this.f25622A).p0());
            }

            public final List V() {
                return Collections.unmodifiableList(((zzk) this.f25622A).q0());
            }

            public final zza V0(long j2) {
                u();
                zzk.b2((zzk) this.f25622A, j2);
                return this;
            }

            public final boolean W() {
                return ((zzk) this.f25622A).s0();
            }

            public final boolean X() {
                return ((zzk) this.f25622A).t0();
            }

            public final zza X0(String str) {
                u();
                zzk.c2((zzk) this.f25622A, str);
                return this;
            }

            public final boolean Y() {
                return ((zzk) this.f25622A).v0();
            }

            public final zzo Y0(int i2) {
                return ((zzk) this.f25622A).z0(i2);
            }

            public final int Z() {
                return ((zzk) this.f25622A).y0();
            }

            public final zza Z0() {
                u();
                ((zzk) this.f25622A).zzh = zzlc.D();
                return this;
            }

            public final zza a0(int i2) {
                u();
                zzk.L((zzk) this.f25622A, i2);
                return this;
            }

            public final zza a1(long j2) {
                u();
                zzk.f2((zzk) this.f25622A, j2);
                return this;
            }

            public final zza b0(long j2) {
                u();
                zzk.D0((zzk) this.f25622A, j2);
                return this;
            }

            public final zza c0(Iterable iterable) {
                u();
                zzk.E0((zzk) this.f25622A, iterable);
                return this;
            }

            public final zza c1(String str) {
                u();
                zzk.g2((zzk) this.f25622A, str);
                return this;
            }

            public final zza d0(String str) {
                u();
                zzk.F0((zzk) this.f25622A, str);
                return this;
            }

            public final zza d1() {
                u();
                zzk.H1((zzk) this.f25622A);
                return this;
            }

            public final zza e0(boolean z2) {
                u();
                zzk.G0((zzk) this.f25622A, z2);
                return this;
            }

            public final zza e1(String str) {
                u();
                zzk.j2((zzk) this.f25622A, str);
                return this;
            }

            public final zza f1() {
                u();
                zzk.M1((zzk) this.f25622A);
                return this;
            }

            public final int g0() {
                return ((zzk) this.f25622A).v1();
            }

            public final zza g1(String str) {
                u();
                zzk.l2((zzk) this.f25622A, str);
                return this;
            }

            public final zza h0(int i2) {
                u();
                zzk.C0((zzk) this.f25622A, i2);
                return this;
            }

            public final zza h1() {
                u();
                zzk.R1((zzk) this.f25622A);
                return this;
            }

            public final zza i0(long j2) {
                u();
                zzk.i1((zzk) this.f25622A, j2);
                return this;
            }

            public final zza i1(String str) {
                u();
                zzk.n2((zzk) this.f25622A, str);
                return this;
            }

            public final zza j0(Iterable iterable) {
                u();
                zzk.j1((zzk) this.f25622A, iterable);
                return this;
            }

            public final zza j1() {
                u();
                zzk.W1((zzk) this.f25622A);
                return this;
            }

            public final zza k0(String str) {
                u();
                zzk.k1((zzk) this.f25622A, str);
                return this;
            }

            public final zza k1(String str) {
                u();
                zzk.p2((zzk) this.f25622A, str);
                return this;
            }

            public final zza l0(boolean z2) {
                u();
                zzk.l1((zzk) this.f25622A, z2);
                return this;
            }

            public final zza l1() {
                u();
                zzk.a2((zzk) this.f25622A);
                return this;
            }

            public final int m0() {
                return ((zzk) this.f25622A).Q1();
            }

            public final zza m1(String str) {
                u();
                zzk.r2((zzk) this.f25622A, str);
                return this;
            }

            public final zza n0(int i2) {
                u();
                zzk.h1((zzk) this.f25622A, i2);
                return this;
            }

            public final zza n1() {
                u();
                zzk.e2((zzk) this.f25622A);
                return this;
            }

            public final zza o0(long j2) {
                u();
                zzk.r1((zzk) this.f25622A, j2);
                return this;
            }

            public final zza o1(String str) {
                u();
                zzk.t2((zzk) this.f25622A, str);
                return this;
            }

            public final zza p0(Iterable iterable) {
                u();
                zzk.s1((zzk) this.f25622A, iterable);
                return this;
            }

            public final zza p1() {
                u();
                zzk.i2((zzk) this.f25622A);
                return this;
            }

            public final zza q0(String str) {
                u();
                zzk.t1((zzk) this.f25622A, str);
                return this;
            }

            public final zza q1(String str) {
                u();
                zzk.v2((zzk) this.f25622A, str);
                return this;
            }

            public final zza r0(boolean z2) {
                u();
                zzk.u1((zzk) this.f25622A, z2);
                return this;
            }

            public final String r1() {
                return ((zzk) this.f25622A).C2();
            }

            public final long s0() {
                return ((zzk) this.f25622A).h2();
            }

            public final String s1() {
                return ((zzk) this.f25622A).Y();
            }

            public final zza t0(int i2) {
                u();
                zzk.q1((zzk) this.f25622A, i2);
                return this;
            }

            public final String t1() {
                return ((zzk) this.f25622A).b0();
            }

            public final zza u0(long j2) {
                u();
                zzk.y1((zzk) this.f25622A, j2);
                return this;
            }

            public final String u1() {
                return ((zzk) this.f25622A).d0();
            }

            public final zza v0(Iterable iterable) {
                u();
                zzk.z1((zzk) this.f25622A, iterable);
                return this;
            }

            public final String v1() {
                return ((zzk) this.f25622A).h0();
            }

            public final zza w0(String str) {
                u();
                zzk.A1((zzk) this.f25622A, str);
                return this;
            }

            public final String w1() {
                return ((zzk) this.f25622A).j0();
            }

            public final long x0() {
                return ((zzk) this.f25622A).q2();
            }

            public final String x1() {
                return ((zzk) this.f25622A).l0();
            }

            public final int y() {
                return ((zzk) this.f25622A).n();
            }

            public final zza y0(int i2) {
                u();
                zzk.x1((zzk) this.f25622A, i2);
                return this;
            }

            public final zzf z(int i2) {
                return ((zzk) this.f25622A).J(i2);
            }

            public final zza z0(long j2) {
                u();
                zzk.E1((zzk) this.f25622A, j2);
                return this;
            }

            public zza() {
                super(zzk.zzc);
            }
        }

        static {
            zzk zzk2 = new zzk();
            zzc = zzk2;
            zzlc.v(zzk.class, zzk2);
        }

        public static /* synthetic */ void A1(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 8192;
            zzk2.zzv = str;
        }

        public static /* synthetic */ void B0(zzk zzk2) {
            zzk2.zze &= -262145;
            zzk2.zzaa = zzc.zzaa;
        }

        public static /* synthetic */ void C0(zzk zzk2, int i2) {
            zzk2.n1();
            zzk2.zzi.remove(i2);
        }

        public static /* synthetic */ void D0(zzk zzk2, long j2) {
            zzk2.zze |= 536870912;
            zzk2.zzam = j2;
        }

        public static /* synthetic */ void D1(zzk zzk2, int i2) {
            zzk2.zzf |= 8388608;
            zzk2.zzbo = i2;
        }

        public static /* synthetic */ void E0(zzk zzk2, Iterable iterable) {
            zzk2.m1();
            zzji.j(iterable, zzk2.zzh);
        }

        public static /* synthetic */ void E1(zzk zzk2, long j2) {
            zzk2.zze |= 16384;
            zzk2.zzw = j2;
        }

        public static /* synthetic */ void F0(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 4096;
            zzk2.zzu = str;
        }

        public static /* synthetic */ void F1(zzk zzk2, String str) {
            str.getClass();
            zzk2.zzf |= 131072;
            zzk2.zzbi = str;
        }

        public static /* synthetic */ void G0(zzk zzk2, boolean z2) {
            zzk2.zzf |= 262144;
            zzk2.zzbj = z2;
        }

        public static /* synthetic */ void H1(zzk zzk2) {
            zzk2.zze &= -2097153;
            zzk2.zzad = zzc.zzad;
        }

        public static /* synthetic */ void I1(zzk zzk2, int i2) {
            zzk2.zze |= 1;
            zzk2.zzg = 1;
        }

        public static /* synthetic */ void J1(zzk zzk2, long j2) {
            zzk2.zze |= 32;
            zzk2.zzn = j2;
        }

        public static zza K(zzk zzk2) {
            return (zza) zzc.o(zzk2);
        }

        public static /* synthetic */ void K1(zzk zzk2, String str) {
            str.getClass();
            zzk2.zzf |= 128;
            zzk2.zzax = str;
        }

        public static /* synthetic */ void L(zzk zzk2, int i2) {
            zzk2.m1();
            zzk2.zzh.remove(i2);
        }

        public static /* synthetic */ void M(zzk zzk2, int i2, zzf zzf2) {
            zzf2.getClass();
            zzk2.m1();
            zzk2.zzh.set(i2, zzf2);
        }

        public static /* synthetic */ void M1(zzk zzk2) {
            zzk2.zze &= -131073;
            zzk2.zzz = false;
        }

        public static /* synthetic */ void N(zzk zzk2, int i2, zzo zzo2) {
            zzo2.getClass();
            zzk2.n1();
            zzk2.zzi.set(i2, zzo2);
        }

        public static /* synthetic */ void N1(zzk zzk2, int i2) {
            zzk2.zzf |= 2;
            zzk2.zzaq = i2;
        }

        public static /* synthetic */ void O(zzk zzk2, long j2) {
            zzk2.zzf |= 32;
            zzk2.zzav = j2;
        }

        public static /* synthetic */ void O1(zzk zzk2, long j2) {
            zzk2.zze |= 16;
            zzk2.zzm = j2;
        }

        public static /* synthetic */ void P(zzk zzk2, zza zza2) {
            zza2.getClass();
            zzk2.zzbp = zza2;
            zzk2.zzf |= 16777216;
        }

        public static /* synthetic */ void P1(zzk zzk2, String str) {
            str.getClass();
            zzk2.zzf |= 524288;
            zzk2.zzbk = str;
        }

        public static /* synthetic */ void R(zzk zzk2, zzc zzc2) {
            zzc2.getClass();
            zzk2.zzbn = zzc2;
            zzk2.zzf |= 4194304;
        }

        public static /* synthetic */ void R1(zzk zzk2) {
            zzk2.zze &= -33;
            zzk2.zzn = 0;
        }

        public static /* synthetic */ void S(zzk zzk2, zzf zzf2) {
            zzf2.getClass();
            zzk2.m1();
            zzk2.zzh.add(zzf2);
        }

        public static /* synthetic */ void S1(zzk zzk2, int i2) {
            zzk2.zze |= 1024;
            zzk2.zzs = i2;
        }

        public static /* synthetic */ void T(zzk zzk2, zzl zzl2) {
            zzl2.getClass();
            zzk2.zzas = zzl2;
            zzk2.zzf |= 8;
        }

        public static /* synthetic */ void T1(zzk zzk2, long j2) {
            zzk2.zze |= 4;
            zzk2.zzk = j2;
        }

        public static /* synthetic */ void U(zzk zzk2, zzo zzo2) {
            zzo2.getClass();
            zzk2.n1();
            zzk2.zzi.add(zzo2);
        }

        public static /* synthetic */ void U1(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 256;
            zzk2.zzq = str;
        }

        public static /* synthetic */ void V(zzk zzk2, Iterable iterable) {
            zzll<zzd> zzll = zzk2.zzag;
            if (!zzll.c()) {
                zzk2.zzag = zzlc.r(zzll);
            }
            zzji.j(iterable, zzk2.zzag);
        }

        public static /* synthetic */ void W(zzk zzk2, String str) {
            str.getClass();
            zzk2.zzf |= 4;
            zzk2.zzar = str;
        }

        public static /* synthetic */ void W1(zzk zzk2) {
            zzk2.zze &= -17;
            zzk2.zzm = 0;
        }

        public static /* synthetic */ void X(zzk zzk2, boolean z2) {
            zzk2.zzf |= 65536;
            zzk2.zzbh = z2;
        }

        public static /* synthetic */ void X1(zzk zzk2, long j2) {
            zzk2.zzf |= 32768;
            zzk2.zzbg = j2;
        }

        public static /* synthetic */ void Y1(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= Integer.MIN_VALUE;
            zzk2.zzao = str;
        }

        public static /* synthetic */ void a2(zzk zzk2) {
            zzk2.zze &= -65537;
            zzk2.zzy = zzc.zzy;
        }

        public static /* synthetic */ void b2(zzk zzk2, long j2) {
            zzk2.zze |= 2;
            zzk2.zzj = j2;
        }

        public static /* synthetic */ void c2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zzf |= 16384;
            zzk2.zzbf = str;
        }

        public static /* synthetic */ void e2(zzk zzk2) {
            zzk2.zzf &= -8193;
            zzk2.zzbd = zzc.zzbd;
        }

        public static /* synthetic */ void f2(zzk zzk2, long j2) {
            zzk2.zze |= 32768;
            zzk2.zzx = j2;
        }

        public static /* synthetic */ void g2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 16777216;
            zzk2.zzah = str;
        }

        public static /* synthetic */ void h1(zzk zzk2, int i2) {
            zzk2.zzf |= 1048576;
            zzk2.zzbl = i2;
        }

        public static /* synthetic */ void i1(zzk zzk2, long j2) {
            zzk2.zze |= 524288;
            zzk2.zzab = j2;
        }

        public static /* synthetic */ void i2(zzk zzk2) {
            zzk2.zze &= -268435457;
            zzk2.zzal = zzc.zzal;
        }

        public static /* synthetic */ void j1(zzk zzk2, Iterable iterable) {
            zzlj zzlj = zzk2.zzat;
            if (!zzlj.c()) {
                int size = zzlj.size();
                zzk2.zzat = zzlj.x(size == 0 ? 10 : size << 1);
            }
            zzji.j(iterable, zzk2.zzat);
        }

        public static /* synthetic */ void j2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 4194304;
            zzk2.zzae = str;
        }

        public static /* synthetic */ void k1(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 262144;
            zzk2.zzaa = str;
        }

        public static /* synthetic */ void l1(zzk zzk2, boolean z2) {
            zzk2.zze |= 131072;
            zzk2.zzz = z2;
        }

        public static /* synthetic */ void l2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 2097152;
            zzk2.zzad = str;
        }

        public static /* synthetic */ void n2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 128;
            zzk2.zzp = str;
        }

        public static /* synthetic */ void p1(zzk zzk2) {
            zzk2.zze &= -257;
            zzk2.zzq = zzc.zzq;
        }

        public static /* synthetic */ void p2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 64;
            zzk2.zzo = str;
        }

        public static /* synthetic */ void q1(zzk zzk2, int i2) {
            zzk2.zze |= 33554432;
            zzk2.zzai = i2;
        }

        public static /* synthetic */ void r1(zzk zzk2, long j2) {
            zzk2.zzf |= 16;
            zzk2.zzau = j2;
        }

        public static /* synthetic */ void r2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 65536;
            zzk2.zzy = str;
        }

        public static /* synthetic */ void s1(zzk zzk2, Iterable iterable) {
            zzll<String> zzll = zzk2.zzbe;
            if (!zzll.c()) {
                zzk2.zzbe = zzlc.r(zzll);
            }
            zzji.j(iterable, zzk2.zzbe);
        }

        public static /* synthetic */ void t1(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 2048;
            zzk2.zzt = str;
        }

        public static /* synthetic */ void t2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zzf |= 8192;
            zzk2.zzbd = str;
        }

        public static /* synthetic */ void u1(zzk zzk2, boolean z2) {
            zzk2.zze |= 8388608;
            zzk2.zzaf = z2;
        }

        public static /* synthetic */ void v2(zzk zzk2, String str) {
            str.getClass();
            zzk2.zze |= 512;
            zzk2.zzr = str;
        }

        public static /* synthetic */ void w1(zzk zzk2) {
            zzk2.zze &= Integer.MAX_VALUE;
            zzk2.zzao = zzc.zzao;
        }

        public static /* synthetic */ void x1(zzk zzk2, int i2) {
            zzk2.zze |= 1048576;
            zzk2.zzac = i2;
        }

        public static /* synthetic */ void y1(zzk zzk2, long j2) {
            zzk2.zze |= 8;
            zzk2.zzl = j2;
        }

        public static /* synthetic */ void z1(zzk zzk2, Iterable iterable) {
            zzk2.n1();
            zzji.j(iterable, zzk2.zzi);
        }

        public static zza z2() {
            return (zza) zzc.y();
        }

        public final int B1() {
            return this.zzg;
        }

        public final String B2() {
            return this.zzar;
        }

        public final String C2() {
            return this.zzu;
        }

        public final int G1() {
            return this.zzaq;
        }

        public final boolean H0() {
            return (this.zze & 1048576) != 0;
        }

        public final boolean I0() {
            return (this.zze & 536870912) != 0;
        }

        public final zzf J(int i2) {
            return this.zzh.get(i2);
        }

        public final boolean J0() {
            return (this.zzf & 131072) != 0;
        }

        public final boolean K0() {
            return (this.zzf & 128) != 0;
        }

        public final boolean L0() {
            return (this.zzf & 524288) != 0;
        }

        public final int L1() {
            return this.zzs;
        }

        public final boolean M0() {
            return (this.zzf & 8388608) != 0;
        }

        public final boolean N0() {
            return (this.zze & 524288) != 0;
        }

        public final boolean O0() {
            return (this.zze & Integer.MIN_VALUE) != 0;
        }

        public final boolean P0() {
            return (this.zzf & 16) != 0;
        }

        public final boolean Q0() {
            return (this.zze & 8) != 0;
        }

        public final int Q1() {
            return this.zzi.size();
        }

        public final boolean R0() {
            return (this.zze & 16384) != 0;
        }

        public final boolean S0() {
            return (this.zzf & 262144) != 0;
        }

        public final boolean T0() {
            return (this.zze & 131072) != 0;
        }

        public final boolean U0() {
            return (this.zze & 32) != 0;
        }

        public final boolean V0() {
            return (this.zze & 16) != 0;
        }

        public final long V1() {
            return this.zzam;
        }

        public final boolean W0() {
            return (this.zze & 1) != 0;
        }

        public final boolean X0() {
            return (this.zzf & 2) != 0;
        }

        public final String Y() {
            return this.zzaa;
        }

        public final boolean Y0() {
            return (this.zze & 8388608) != 0;
        }

        public final String Z() {
            return this.zzt;
        }

        public final boolean Z0() {
            return (this.zzf & 8192) != 0;
        }

        public final long Z1() {
            return this.zzab;
        }

        public final String a0() {
            return this.zzv;
        }

        public final boolean a1() {
            return (this.zze & 4) != 0;
        }

        public final String b0() {
            return this.zzbi;
        }

        public final boolean b1() {
            return (this.zzf & 32768) != 0;
        }

        public final String c0() {
            return this.zzax;
        }

        public final boolean c1() {
            return (this.zze & 1024) != 0;
        }

        public final String d0() {
            return this.zzbk;
        }

        public final boolean d1() {
            return (this.zze & 2) != 0;
        }

        public final long d2() {
            return this.zzau;
        }

        public final String e0() {
            return this.zzq;
        }

        public final boolean e1() {
            return (this.zze & 32768) != 0;
        }

        public final String f0() {
            return this.zzao;
        }

        public final int f1() {
            return this.zzac;
        }

        public final String g0() {
            return this.zzah;
        }

        public final String h0() {
            return this.zzae;
        }

        public final long h2() {
            return this.zzl;
        }

        public final String i0() {
            return this.zzad;
        }

        public final String j0() {
            return this.zzp;
        }

        public final String k0() {
            return this.zzo;
        }

        public final long k2() {
            return this.zzw;
        }

        public final String l0() {
            return this.zzy;
        }

        public final String m0() {
            return this.zzbd;
        }

        public final void m1() {
            zzll<zzf> zzll = this.zzh;
            if (!zzll.c()) {
                this.zzh = zzlc.r(zzll);
            }
        }

        public final long m2() {
            return this.zzn;
        }

        public final int n() {
            return this.zzbl;
        }

        public final String n0() {
            return this.zzr;
        }

        public final void n1() {
            zzll<zzo> zzll = this.zzi;
            if (!zzll.c()) {
                this.zzi = zzlc.r(zzll);
            }
        }

        public final List o0() {
            return this.zzag;
        }

        public final int o1() {
            return this.zzbo;
        }

        public final long o2() {
            return this.zzm;
        }

        public final List p0() {
            return this.zzh;
        }

        public final List q0() {
            return this.zzi;
        }

        public final long q2() {
            return this.zzk;
        }

        public final boolean r0() {
            return this.zzbh;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004>\u0000\u0002\u0001O>\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8", new Object[]{"zze", "zzf", "zzg", "zzh", zzf.class, "zzi", zzo.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", zzd.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", zzgp.f(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzk> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzk.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean s0() {
            return this.zzbj;
        }

        public final long s2() {
            return this.zzbg;
        }

        public final boolean t0() {
            return this.zzz;
        }

        public final boolean u0() {
            return this.zzaf;
        }

        public final long u2() {
            return this.zzj;
        }

        public final boolean v0() {
            return (this.zzf & 16777216) != 0;
        }

        public final int v1() {
            return this.zzh.size();
        }

        public final boolean w0() {
            return (this.zze & 33554432) != 0;
        }

        public final long w2() {
            return this.zzx;
        }

        public final boolean x0() {
            return (this.zzf & 4194304) != 0;
        }

        public final zza x2() {
            zza zza2 = this.zzbp;
            return zza2 == null ? zza.Y() : zza2;
        }

        public final int y0() {
            return this.zzai;
        }

        public final zzc y2() {
            zzc zzc2 = this.zzbn;
            return zzc2 == null ? zzc.N() : zzc2;
        }

        public final zzo z0(int i2) {
            return this.zzi.get(i2);
        }
    }

    public static final class zzl extends zzlc<zzl, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzl zzc;
        private static volatile zzmu<zzl> zzd;
        private int zze;
        private int zzf = 1;
        private zzll<zzg> zzg = zzlc.D();

        public static final class zza extends zzlc.zzb<zzl, zza> implements zzmn {
            public final zza y(zzg.zza zza) {
                u();
                zzl.K((zzl) this.f25622A, (zzg) ((zzlc) zza.F()));
                return this;
            }

            public zza() {
                super(zzl.zzc);
            }
        }

        public enum zzb implements zzlh {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: z  reason: collision with root package name */
            public final int f25465z;

            /* access modifiers changed from: public */
            zzb(int i2) {
                this.f25465z = i2;
            }

            public static zzb d(int i2) {
                if (i2 == 1) {
                    return RADS;
                }
                if (i2 != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            public static zzlg f() {
                return zzhd.f25475a;
            }

            public final int a() {
                return this.f25465z;
            }

            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f25465z + " name=" + name() + '>';
            }
        }

        static {
            zzl zzl = new zzl();
            zzc = zzl;
            zzlc.v(zzl.class, zzl);
        }

        public static zza J() {
            return (zza) zzc.y();
        }

        public static /* synthetic */ void K(zzl zzl, zzg zzg2) {
            zzg2.getClass();
            zzll<zzg> zzll = zzl.zzg;
            if (!zzll.c()) {
                zzl.zzg = zzlc.r(zzll);
            }
            zzl.zzg.add(zzg2);
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzb.f(), "zzg", zzg.class});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzl> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzl.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzm extends zzlc<zzm, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzm zzc;
        private static volatile zzmu<zzm> zzd;
        /* access modifiers changed from: private */
        public zzli zze = zzlc.C();
        /* access modifiers changed from: private */
        public zzli zzf = zzlc.C();
        /* access modifiers changed from: private */
        public zzll<zze> zzg = zzlc.D();
        /* access modifiers changed from: private */
        public zzll<zzn> zzh = zzlc.D();

        public static final class zza extends zzlc.zzb<zzm, zza> implements zzmn {
            public final zza B() {
                u();
                ((zzm) this.f25622A).zzf = zzlc.C();
                return this;
            }

            public final zza G(Iterable iterable) {
                u();
                zzm.N((zzm) this.f25622A, iterable);
                return this;
            }

            public final zza H() {
                u();
                ((zzm) this.f25622A).zzh = zzlc.D();
                return this;
            }

            public final zza I(Iterable iterable) {
                u();
                zzm.R((zzm) this.f25622A, iterable);
                return this;
            }

            public final zza J() {
                u();
                ((zzm) this.f25622A).zze = zzlc.C();
                return this;
            }

            public final zza K(Iterable iterable) {
                u();
                zzm.U((zzm) this.f25622A, iterable);
                return this;
            }

            public final zza y() {
                u();
                ((zzm) this.f25622A).zzg = zzlc.D();
                return this;
            }

            public final zza z(Iterable iterable) {
                u();
                zzm.K((zzm) this.f25622A, iterable);
                return this;
            }

            public zza() {
                super(zzm.zzc);
            }
        }

        static {
            zzm zzm = new zzm();
            zzc = zzm;
            zzlc.v(zzm.class, zzm);
        }

        public static /* synthetic */ void K(zzm zzm, Iterable iterable) {
            zzll<zze> zzll = zzm.zzg;
            if (!zzll.c()) {
                zzm.zzg = zzlc.r(zzll);
            }
            zzji.j(iterable, zzm.zzg);
        }

        public static /* synthetic */ void N(zzm zzm, Iterable iterable) {
            zzli zzli = zzm.zzf;
            if (!zzli.c()) {
                zzm.zzf = zzlc.q(zzli);
            }
            zzji.j(iterable, zzm.zzf);
        }

        public static /* synthetic */ void R(zzm zzm, Iterable iterable) {
            zzll<zzn> zzll = zzm.zzh;
            if (!zzll.c()) {
                zzm.zzh = zzlc.r(zzll);
            }
            zzji.j(iterable, zzm.zzh);
        }

        public static /* synthetic */ void U(zzm zzm, Iterable iterable) {
            zzli zzli = zzm.zze;
            if (!zzli.c()) {
                zzm.zze = zzlc.q(zzli);
            }
            zzji.j(iterable, zzm.zze);
        }

        public static zza V() {
            return (zza) zzc.y();
        }

        public static zzm X() {
            return zzc;
        }

        public final int L() {
            return this.zzf.size();
        }

        public final int O() {
            return this.zzh.size();
        }

        public final int S() {
            return this.zze.size();
        }

        public final List Y() {
            return this.zzg;
        }

        public final List Z() {
            return this.zzf;
        }

        public final List a0() {
            return this.zzh;
        }

        public final List b0() {
            return this.zze;
        }

        public final int n() {
            return this.zzg.size();
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzn.class});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzm> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzm.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzn extends zzlc<zzn, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzn zzc;
        private static volatile zzmu<zzn> zzd;
        private int zze;
        private int zzf;
        private zzli zzg = zzlc.C();

        public static final class zza extends zzlc.zzb<zzn, zza> implements zzmn {
            public final zza y(int i2) {
                u();
                zzn.K((zzn) this.f25622A, i2);
                return this;
            }

            public final zza z(Iterable iterable) {
                u();
                zzn.L((zzn) this.f25622A, iterable);
                return this;
            }

            public zza() {
                super(zzn.zzc);
            }
        }

        static {
            zzn zzn = new zzn();
            zzc = zzn;
            zzlc.v(zzn.class, zzn);
        }

        public static /* synthetic */ void K(zzn zzn, int i2) {
            zzn.zze |= 1;
            zzn.zzf = i2;
        }

        public static /* synthetic */ void L(zzn zzn, Iterable iterable) {
            zzli zzli = zzn.zzg;
            if (!zzli.c()) {
                zzn.zzg = zzlc.q(zzli);
            }
            zzji.j(iterable, zzn.zzg);
        }

        public static zza N() {
            return (zza) zzc.y();
        }

        public final long J(int i2) {
            return this.zzg.t(i2);
        }

        public final int M() {
            return this.zzf;
        }

        public final List P() {
            return this.zzg;
        }

        public final boolean R() {
            return (this.zze & 1) != 0;
        }

        public final int n() {
            return this.zzg.size();
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzn> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzn.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzo extends zzlc<zzo, zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zzo zzc;
        private static volatile zzmu<zzo> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private float zzj;
        private double zzk;

        public static final class zza extends zzlc.zzb<zzo, zza> implements zzmn {
            public final zza B(long j2) {
                u();
                zzo.M((zzo) this.f25622A, j2);
                return this;
            }

            public final zza G(String str) {
                u();
                zzo.N((zzo) this.f25622A, str);
                return this;
            }

            public final zza H() {
                u();
                zzo.P((zzo) this.f25622A);
                return this;
            }

            public final zza I(long j2) {
                u();
                zzo.R((zzo) this.f25622A, j2);
                return this;
            }

            public final zza J(String str) {
                u();
                zzo.S((zzo) this.f25622A, str);
                return this;
            }

            public final zza K() {
                u();
                zzo.U((zzo) this.f25622A);
                return this;
            }

            public final zza y() {
                u();
                zzo.K((zzo) this.f25622A);
                return this;
            }

            public final zza z(double d2) {
                u();
                zzo.L((zzo) this.f25622A, d2);
                return this;
            }

            public zza() {
                super(zzo.zzc);
            }
        }

        static {
            zzo zzo = new zzo();
            zzc = zzo;
            zzlc.v(zzo.class, zzo);
        }

        public static /* synthetic */ void K(zzo zzo) {
            zzo.zze &= -33;
            zzo.zzk = 0.0d;
        }

        public static /* synthetic */ void L(zzo zzo, double d2) {
            zzo.zze |= 32;
            zzo.zzk = d2;
        }

        public static /* synthetic */ void M(zzo zzo, long j2) {
            zzo.zze |= 8;
            zzo.zzi = j2;
        }

        public static /* synthetic */ void N(zzo zzo, String str) {
            str.getClass();
            zzo.zze |= 2;
            zzo.zzg = str;
        }

        public static /* synthetic */ void P(zzo zzo) {
            zzo.zze &= -9;
            zzo.zzi = 0;
        }

        public static /* synthetic */ void R(zzo zzo, long j2) {
            zzo.zze |= 1;
            zzo.zzf = j2;
        }

        public static /* synthetic */ void S(zzo zzo, String str) {
            str.getClass();
            zzo.zze |= 4;
            zzo.zzh = str;
        }

        public static /* synthetic */ void U(zzo zzo) {
            zzo.zze &= -5;
            zzo.zzh = zzc.zzh;
        }

        public static zza W() {
            return (zza) zzc.y();
        }

        public final double J() {
            return this.zzk;
        }

        public final float O() {
            return this.zzj;
        }

        public final long T() {
            return this.zzi;
        }

        public final long V() {
            return this.zzf;
        }

        public final String Y() {
            return this.zzg;
        }

        public final String Z() {
            return this.zzh;
        }

        public final boolean a0() {
            return (this.zze & 32) != 0;
        }

        public final boolean b0() {
            return (this.zze & 16) != 0;
        }

        public final boolean c0() {
            return (this.zze & 8) != 0;
        }

        public final boolean d0() {
            return (this.zze & 1) != 0;
        }

        public final boolean e0() {
            return (this.zze & 4) != 0;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzgm.f25459a[i2 - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzo> zzmu = zzd;
                    if (zzmu == null) {
                        synchronized (zzo.class) {
                            try {
                                zzmu = zzd;
                                if (zzmu == null) {
                                    zzmu = new zzlc.zza<>(zzc);
                                    zzd = zzmu;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return zzmu;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
