package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import java.util.List;

public final class zzfn {

    public static final class zza extends zzlc<zza, C0000zza> implements zzmn {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzmu<zza> zzd;
        private int zze;
        private int zzf;
        private zzll<zze> zzg = zzlc.D();
        private zzll<zzb> zzh = zzlc.D();
        private boolean zzi;
        private boolean zzj;

        /* renamed from: com.google.android.gms.internal.measurement.zzfn$zza$zza  reason: collision with other inner class name */
        public static final class C0000zza extends zzlc.zzb<zza, C0000zza> implements zzmn {
            public final C0000zza B(int i2, zze.zza zza) {
                u();
                zza.L((zza) this.f25622A, i2, (zze) ((zzlc) zza.F()));
                return this;
            }

            public final zzb G(int i2) {
                return ((zza) this.f25622A).J(i2);
            }

            public final int H() {
                return ((zza) this.f25622A).O();
            }

            public final zze I(int i2) {
                return ((zza) this.f25622A).N(i2);
            }

            public final int y() {
                return ((zza) this.f25622A).M();
            }

            public final C0000zza z(int i2, zzb.zza zza) {
                u();
                zza.K((zza) this.f25622A, i2, (zzb) ((zzlc) zza.F()));
                return this;
            }

            public C0000zza() {
                super(zza.zzc);
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzlc.v(zza.class, zza);
        }

        public static /* synthetic */ void K(zza zza, int i2, zzb zzb) {
            zzb.getClass();
            zzll<zzb> zzll = zza.zzh;
            if (!zzll.c()) {
                zza.zzh = zzlc.r(zzll);
            }
            zza.zzh.set(i2, zzb);
        }

        public static /* synthetic */ void L(zza zza, int i2, zze zze2) {
            zze2.getClass();
            zzll<zze> zzll = zza.zzg;
            if (!zzll.c()) {
                zza.zzg = zzlc.r(zzll);
            }
            zza.zzg.set(i2, zze2);
        }

        public final zzb J(int i2) {
            return this.zzh.get(i2);
        }

        public final int M() {
            return this.zzh.size();
        }

        public final zze N(int i2) {
            return this.zzg.get(i2);
        }

        public final int O() {
            return this.zzg.size();
        }

        public final List R() {
            return this.zzh;
        }

        public final List S() {
            return this.zzg;
        }

        public final boolean T() {
            return (this.zze & 1) != 0;
        }

        public final int n() {
            return this.zzf;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfm.f25441a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0000zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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
        private int zzf;
        private String zzg = "";
        private zzll<zzc> zzh = zzlc.D();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        public static final class zza extends zzlc.zzb<zzb, zza> implements zzmn {
            public final zza B(String str) {
                u();
                zzb.L((zzb) this.f25622A, str);
                return this;
            }

            public final zzc G(int i2) {
                return ((zzb) this.f25622A).J(i2);
            }

            public final String H() {
                return ((zzb) this.f25622A).R();
            }

            public final int y() {
                return ((zzb) this.f25622A).n();
            }

            public final zza z(int i2, zzc zzc) {
                u();
                zzb.K((zzb) this.f25622A, i2, zzc);
                return this;
            }

            public zza() {
                super(zzb.zzc);
            }
        }

        static {
            zzb zzb = new zzb();
            zzc = zzb;
            zzlc.v(zzb.class, zzb);
        }

        public static /* synthetic */ void K(zzb zzb, int i2, zzc zzc2) {
            zzc2.getClass();
            zzll<zzc> zzll = zzb.zzh;
            if (!zzll.c()) {
                zzb.zzh = zzlc.r(zzll);
            }
            zzb.zzh.set(i2, zzc2);
        }

        public static /* synthetic */ void L(zzb zzb, String str) {
            str.getClass();
            zzb.zze |= 2;
            zzb.zzg = str;
        }

        public static zza N() {
            return (zza) zzc.y();
        }

        public final zzc J(int i2) {
            return this.zzh.get(i2);
        }

        public final int M() {
            return this.zzf;
        }

        public final zzd P() {
            zzd zzd2 = this.zzj;
            return zzd2 == null ? zzd.L() : zzd2;
        }

        public final String R() {
            return this.zzg;
        }

        public final List S() {
            return this.zzh;
        }

        public final boolean T() {
            return this.zzk;
        }

        public final boolean U() {
            return this.zzl;
        }

        public final boolean V() {
            return this.zzm;
        }

        public final boolean W() {
            return (this.zze & 8) != 0;
        }

        public final boolean X() {
            return (this.zze & 1) != 0;
        }

        public final boolean Y() {
            return (this.zze & 64) != 0;
        }

        public final int n() {
            return this.zzh.size();
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfm.f25441a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        public static final class zza extends zzlc.zzb<zzc, zza> implements zzmn {
            public final zza y(String str) {
                u();
                zzc.K((zzc) this.f25622A, str);
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

        public static /* synthetic */ void K(zzc zzc2, String str) {
            str.getClass();
            zzc2.zze |= 8;
            zzc2.zzi = str;
        }

        public static zzc L() {
            return zzc;
        }

        public final zzd M() {
            zzd zzd2 = this.zzg;
            return zzd2 == null ? zzd.L() : zzd2;
        }

        public final zzf N() {
            zzf zzf2 = this.zzf;
            return zzf2 == null ? zzf.L() : zzf2;
        }

        public final String O() {
            return this.zzi;
        }

        public final boolean P() {
            return this.zzh;
        }

        public final boolean R() {
            return (this.zze & 4) != 0;
        }

        public final boolean S() {
            return (this.zze & 2) != 0;
        }

        public final boolean T() {
            return (this.zze & 8) != 0;
        }

        public final boolean U() {
            return (this.zze & 1) != 0;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfm.f25441a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        public static final class zza extends zzlc.zzb<zzd, zza> implements zzmn {
            public zza() {
                super(zzd.zzc);
            }
        }

        public enum zzb implements zzlh {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            

            /* renamed from: z  reason: collision with root package name */
            public final int f25444z;

            /* access modifiers changed from: public */
            zzb(int i2) {
                this.f25444z = i2;
            }

            public static zzb d(int i2) {
                if (i2 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i2 == 1) {
                    return LESS_THAN;
                }
                if (i2 == 2) {
                    return GREATER_THAN;
                }
                if (i2 == 3) {
                    return EQUAL;
                }
                if (i2 != 4) {
                    return null;
                }
                return BETWEEN;
            }

            public static zzlg f() {
                return zzfs.f25448a;
            }

            public final int a() {
                return this.f25444z;
            }

            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f25444z + " name=" + name() + '>';
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzc = zzd2;
            zzlc.v(zzd.class, zzd2);
        }

        public static zzd L() {
            return zzc;
        }

        public final zzb J() {
            zzb d2 = zzb.d(this.zzf);
            return d2 == null ? zzb.UNKNOWN_COMPARISON_TYPE : d2;
        }

        public final String M() {
            return this.zzh;
        }

        public final String N() {
            return this.zzj;
        }

        public final String O() {
            return this.zzi;
        }

        public final boolean P() {
            return this.zzg;
        }

        public final boolean R() {
            return (this.zze & 1) != 0;
        }

        public final boolean S() {
            return (this.zze & 4) != 0;
        }

        public final boolean T() {
            return (this.zze & 2) != 0;
        }

        public final boolean U() {
            return (this.zze & 16) != 0;
        }

        public final boolean V() {
            return (this.zze & 8) != 0;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfm.f25441a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zzb.f(), "zzg", "zzh", "zzi", "zzj"});
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
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        public static final class zza extends zzlc.zzb<zze, zza> implements zzmn {
            public final zza y(String str) {
                u();
                zze.J((zze) this.f25622A, str);
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

        public static /* synthetic */ void J(zze zze2, String str) {
            str.getClass();
            zze2.zze |= 2;
            zze2.zzg = str;
        }

        public static zza L() {
            return (zza) zzc.y();
        }

        public final zzc K() {
            zzc zzc2 = this.zzh;
            return zzc2 == null ? zzc.L() : zzc2;
        }

        public final String N() {
            return this.zzg;
        }

        public final boolean O() {
            return this.zzi;
        }

        public final boolean P() {
            return this.zzj;
        }

        public final boolean R() {
            return this.zzk;
        }

        public final boolean S() {
            return (this.zze & 1) != 0;
        }

        public final boolean T() {
            return (this.zze & 32) != 0;
        }

        public final int n() {
            return this.zzf;
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfm.f25441a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
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
        private int zzf;
        private String zzg = "";
        private boolean zzh;
        private zzll<String> zzi = zzlc.D();

        public static final class zza extends zzlc.zzb<zzf, zza> implements zzmn {
            public zza() {
                super(zzf.zzc);
            }
        }

        public enum zzb implements zzlh {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            

            /* renamed from: z  reason: collision with root package name */
            public final int f25447z;

            /* access modifiers changed from: public */
            zzb(int i2) {
                this.f25447z = i2;
            }

            public static zzb d(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzlg f() {
                return zzfv.f25449a;
            }

            public final int a() {
                return this.f25447z;
            }

            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f25447z + " name=" + name() + '>';
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzc = zzf2;
            zzlc.v(zzf.class, zzf2);
        }

        public static zzf L() {
            return zzc;
        }

        public final zzb J() {
            zzb d2 = zzb.d(this.zzf);
            return d2 == null ? zzb.UNKNOWN_MATCH_TYPE : d2;
        }

        public final String M() {
            return this.zzg;
        }

        public final List N() {
            return this.zzi;
        }

        public final boolean O() {
            return this.zzh;
        }

        public final boolean P() {
            return (this.zze & 4) != 0;
        }

        public final boolean R() {
            return (this.zze & 2) != 0;
        }

        public final boolean S() {
            return (this.zze & 1) != 0;
        }

        public final int n() {
            return this.zzi.size();
        }

        public final Object s(int i2, Object obj, Object obj2) {
            switch (zzfm.f25441a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    return zzlc.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zzb.f(), "zzg", "zzh", "zzi"});
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
}
