package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzlc;
import java.util.Collections;
import java.util.List;

public final class zzfx {

    public static final class zza extends zzlc<zza, C0001zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzmu<zza> zzd;
        private int zze;
        private zzll<zzb> zzf = zzlc.D();
        private zzll<zzc> zzg = zzlc.D();
        private zzll<zzf> zzh = zzlc.D();
        private boolean zzi;
        private zzll<zzb> zzj = zzlc.D();

        /* renamed from: com.google.android.gms.internal.measurement.zzfx$zza$zza  reason: collision with other inner class name */
        public static final class C0001zza extends zzlc.zzb<zza, C0001zza> implements zzmn {
            public C0001zza() {
                super(zza.zzc);
            }
        }

        public static final class zzb extends zzlc<zzb, C0002zza> implements zzmn {
            /* access modifiers changed from: private */
            public static final zzb zzc;
            private static volatile zzmu<zzb> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* renamed from: com.google.android.gms.internal.measurement.zzfx$zza$zzb$zza  reason: collision with other inner class name */
            public static final class C0002zza extends zzlc.zzb<zzb, C0002zza> implements zzmn {
                public C0002zza() {
                    super(zzb.zzc);
                }
            }

            static {
                zzb zzb = new zzb();
                zzc = zzb;
                zzlc.v(zzb.class, zzb);
            }

            public final zzd K() {
                zzd d2 = zzd.d(this.zzg);
                return d2 == null ? zzd.CONSENT_STATUS_UNSPECIFIED : d2;
            }

            public final zze L() {
                zze d2 = zze.d(this.zzf);
                return d2 == null ? zze.CONSENT_TYPE_UNSPECIFIED : d2;
            }

            public final Object s(int i2, Object obj, Object obj2) {
                switch (zzfw.f25450a[i2 - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0002zza();
                    case 3:
                        return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.f(), "zzg", zzd.f()});
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

        public static final class zzc extends zzlc<zzc, C0003zza> implements zzmn {
            /* access modifiers changed from: private */
            public static final zzc zzc;
            private static volatile zzmu<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* renamed from: com.google.android.gms.internal.measurement.zzfx$zza$zzc$zza  reason: collision with other inner class name */
            public static final class C0003zza extends zzlc.zzb<zzc, C0003zza> implements zzmn {
                public C0003zza() {
                    super(zzc.zzc);
                }
            }

            static {
                zzc zzc2 = new zzc();
                zzc = zzc2;
                zzlc.v(zzc.class, zzc2);
            }

            public final zze K() {
                zze d2 = zze.d(this.zzg);
                return d2 == null ? zze.CONSENT_TYPE_UNSPECIFIED : d2;
            }

            public final zze L() {
                zze d2 = zze.d(this.zzf);
                return d2 == null ? zze.CONSENT_TYPE_UNSPECIFIED : d2;
            }

            public final Object s(int i2, Object obj, Object obj2) {
                switch (zzfw.f25450a[i2 - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C0003zza();
                    case 3:
                        return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.f(), "zzg", zze.f()});
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

        public enum zzd implements zzlh {
            CONSENT_STATUS_UNSPECIFIED(0),
            GRANTED(1),
            DENIED(2);
            

            /* renamed from: z  reason: collision with root package name */
            public final int f25453z;

            /* access modifiers changed from: public */
            zzd(int i2) {
                this.f25453z = i2;
            }

            public static zzd d(int i2) {
                if (i2 == 0) {
                    return CONSENT_STATUS_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return GRANTED;
                }
                if (i2 != 2) {
                    return null;
                }
                return DENIED;
            }

            public static zzlg f() {
                return zzgb.f25457a;
            }

            public final int a() {
                return this.f25453z;
            }

            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f25453z + " name=" + name() + '>';
            }
        }

        public enum zze implements zzlh {
            CONSENT_TYPE_UNSPECIFIED(0),
            AD_STORAGE(1),
            ANALYTICS_STORAGE(2),
            AD_USER_DATA(3),
            AD_PERSONALIZATION(4);
            

            /* renamed from: z  reason: collision with root package name */
            public final int f25456z;

            /* access modifiers changed from: public */
            zze(int i2) {
                this.f25456z = i2;
            }

            public static zze d(int i2) {
                if (i2 == 0) {
                    return CONSENT_TYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return AD_STORAGE;
                }
                if (i2 == 2) {
                    return ANALYTICS_STORAGE;
                }
                if (i2 == 3) {
                    return AD_USER_DATA;
                }
                if (i2 != 4) {
                    return null;
                }
                return AD_PERSONALIZATION;
            }

            public static zzlg f() {
                return zzgc.f25458a;
            }

            public final int a() {
                return this.f25456z;
            }

            public final String toString() {
                return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f25456z + " name=" + name() + '>';
            }
        }

        public static final class zzf extends zzlc<zzf, C0004zza> implements zzmn {
            /* access modifiers changed from: private */
            public static final zzf zzc;
            private static volatile zzmu<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* renamed from: com.google.android.gms.internal.measurement.zzfx$zza$zzf$zza  reason: collision with other inner class name */
            public static final class C0004zza extends zzlc.zzb<zzf, C0004zza> implements zzmn {
                public C0004zza() {
                    super(zzf.zzc);
                }
            }

            static {
                zzf zzf2 = new zzf();
                zzc = zzf2;
                zzlc.v(zzf.class, zzf2);
            }

            public final String K() {
                return this.zzf;
            }

            public final Object s(int i2, Object obj, Object obj2) {
                switch (zzfw.f25450a[i2 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0004zza();
                    case 3:
                        return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

        static {
            zza zza = new zza();
            zzc = zza;
            zzlc.v(zza.class, zza);
        }

        public static zza K() {
            return zzc;
        }

        public final List L() {
            return this.zzh;
        }

        public final List M() {
            return this.zzf;
        }

        public final List N() {
            return this.zzg;
        }

        public final List O() {
            return this.zzj;
        }

        public final boolean P() {
            return this.zzi;
        }

        public final boolean R() {
            return (this.zze & 1) != 0;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0001zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", zzb.class, "zzg", zzc.class, "zzh", zzf.class, "zzi", "zzj", zzb.class});
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
        private zzll<zzg> zzg = zzlc.D();
        private boolean zzh;

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

        public final String K() {
            return this.zzf;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzg.class, "zzh"});
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
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        public static final class zza extends zzlc.zzb<zzc, zza> implements zzmn {
            public final String B() {
                return ((zzc) this.f25622A).L();
            }

            public final boolean G() {
                return ((zzc) this.f25622A).M();
            }

            public final boolean H() {
                return ((zzc) this.f25622A).N();
            }

            public final boolean I() {
                return ((zzc) this.f25622A).O();
            }

            public final boolean J() {
                return ((zzc) this.f25622A).P();
            }

            public final boolean K() {
                return ((zzc) this.f25622A).R();
            }

            public final int y() {
                return ((zzc) this.f25622A).n();
            }

            public final zza z(String str) {
                u();
                zzc.J((zzc) this.f25622A, str);
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

        public static /* synthetic */ void J(zzc zzc2, String str) {
            str.getClass();
            zzc2.zze |= 1;
            zzc2.zzf = str;
        }

        public final String L() {
            return this.zzf;
        }

        public final boolean M() {
            return this.zzg;
        }

        public final boolean N() {
            return this.zzh;
        }

        public final boolean O() {
            return (this.zze & 2) != 0;
        }

        public final boolean P() {
            return (this.zze & 4) != 0;
        }

        public final boolean R() {
            return (this.zze & 8) != 0;
        }

        public final int n() {
            return this.zzi;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
        private long zzf;
        private String zzg = "";
        private int zzh;
        private zzll<zzh> zzi = zzlc.D();
        private zzll<zzc> zzj = zzlc.D();
        /* access modifiers changed from: private */
        public zzll<zzfn.zza> zzk = zzlc.D();
        private String zzl = "";
        private boolean zzm;
        private zzll<zzhg.zzc> zzn = zzlc.D();
        private zzll<zzb> zzo = zzlc.D();
        private String zzp = "";
        private String zzq = "";
        private zza zzr;
        private zzf zzs;
        private zzi zzt;
        private zzg zzu;
        private zze zzv;

        public static final class zza extends zzlc.zzb<zzd, zza> implements zzmn {
            public final zza B(int i2, zzc.zza zza) {
                u();
                zzd.L((zzd) this.f25622A, i2, (zzc) ((zzlc) zza.F()));
                return this;
            }

            public final zza G() {
                u();
                ((zzd) this.f25622A).zzk = zzlc.D();
                return this;
            }

            public final String H() {
                return ((zzd) this.f25622A).V();
            }

            public final List I() {
                return Collections.unmodifiableList(((zzd) this.f25622A).W());
            }

            public final List J() {
                return Collections.unmodifiableList(((zzd) this.f25622A).X());
            }

            public final int y() {
                return ((zzd) this.f25622A).M();
            }

            public final zzc z(int i2) {
                return ((zzd) this.f25622A).J(i2);
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

        public static /* synthetic */ void L(zzd zzd2, int i2, zzc zzc2) {
            zzc2.getClass();
            zzll<zzc> zzll = zzd2.zzj;
            if (!zzll.c()) {
                zzd2.zzj = zzlc.r(zzll);
            }
            zzd2.zzj.set(i2, zzc2);
        }

        public static zza P() {
            return (zza) zzc.y();
        }

        public static zzd S() {
            return zzc;
        }

        public final zzc J(int i2) {
            return this.zzj.get(i2);
        }

        public final int M() {
            return this.zzj.size();
        }

        public final long N() {
            return this.zzf;
        }

        public final zza O() {
            zza zza2 = this.zzr;
            return zza2 == null ? zza.K() : zza2;
        }

        public final zzi T() {
            zzi zzi2 = this.zzt;
            return zzi2 == null ? zzi.K() : zzi2;
        }

        public final String U() {
            return this.zzg;
        }

        public final String V() {
            return this.zzp;
        }

        public final List W() {
            return this.zzk;
        }

        public final List X() {
            return this.zzo;
        }

        public final List Y() {
            return this.zzn;
        }

        public final List Z() {
            return this.zzi;
        }

        public final boolean a0() {
            return this.zzm;
        }

        public final boolean b0() {
            return (this.zze & 128) != 0;
        }

        public final boolean c0() {
            return (this.zze & 2) != 0;
        }

        public final boolean d0() {
            return (this.zze & 512) != 0;
        }

        public final boolean e0() {
            return (this.zze & 1) != 0;
        }

        public final int n() {
            return this.zzn.size();
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzh.class, "zzj", zzc.class, "zzk", zzfn.zza.class, "zzl", "zzm", "zzn", zzhg.zzc.class, "zzo", zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
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
        private zzll<String> zze = zzlc.D();

        public static final class zza extends zzlc.zzb<zze, zza> implements zzmn {
            public zza() {
                super(zze.zzc);
            }
        }

        static {
            zze zze2 = new zze();
            zzc = zze2;
            zzlc.v(zze.class, zze2);
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
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
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

        public static final class zza extends zzlc.zzb<zzf, zza> implements zzmn {
            public zza() {
                super(zzf.zzc);
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzc = zzf2;
            zzlc.v(zzf.class, zzf2);
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
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
        private String zzg = "";

        public static final class zza extends zzlc.zzb<zzg, zza> implements zzmn {
            public zza() {
                super(zzg.zzc);
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzc = zzg2;
            zzlc.v(zzg.class, zzg2);
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

        public static final class zza extends zzlc.zzb<zzh, zza> implements zzmn {
            public zza() {
                super(zzh.zzc);
            }
        }

        static {
            zzh zzh = new zzh();
            zzc = zzh;
            zzlc.v(zzh.class, zzh);
        }

        public final String K() {
            return this.zzf;
        }

        public final String L() {
            return this.zzg;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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
        private String zzh = "";
        private int zzi;

        public static final class zza extends zzlc.zzb<zzi, zza> implements zzmn {
            public zza() {
                super(zzi.zzc);
            }
        }

        static {
            zzi zzi2 = new zzi();
            zzc = zzi2;
            zzlc.v(zzi.class, zzi2);
        }

        public static zzi K() {
            return zzc;
        }

        public final String L() {
            return this.zzg;
        }

        public final String M() {
            return this.zzf;
        }

        public final int n() {
            return this.zzi;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfw.f25450a[i2 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
}
