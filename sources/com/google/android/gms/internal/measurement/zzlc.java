package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzlc.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzlc<MessageType extends zzlc<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzji<MessageType, BuilderType> {
    private static Map<Class<?>, zzlc<?, ?>> zzc = new ConcurrentHashMap();
    protected zznw zzb = zznw.k();
    private int zzd = -1;

    public static class zza<T extends zzlc<T, ?>> extends zzjj<T> {
        public zza(zzlc zzlc) {
        }
    }

    public static abstract class zzb<MessageType extends zzlc<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzjh<MessageType, BuilderType> {

        /* renamed from: A  reason: collision with root package name */
        public zzlc f25622A;

        /* renamed from: z  reason: collision with root package name */
        public final zzlc f25623z;

        public zzb(zzlc zzlc) {
            this.f25623z = zzlc;
            if (!zzlc.I()) {
                this.f25622A = zzlc.A();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void r(Object obj, Object obj2) {
            zzmz.a().c(obj).f(obj, obj2);
        }

        public final boolean b() {
            return zzlc.w(this.f25622A, false);
        }

        public /* synthetic */ Object clone() {
            zzb zzb = (zzb) this.f25623z.s(zze.f25628e, (Object) null, (Object) null);
            zzb.f25622A = (zzlc) E();
            return zzb;
        }

        public final /* synthetic */ zzjh j(zzkg zzkg, zzkp zzkp) {
            return (zzb) p(zzkg, zzkp);
        }

        public final /* synthetic */ zzjh k(byte[] bArr, int i2, int i3) {
            return w(bArr, 0, i3, zzkp.f25600c);
        }

        public final /* synthetic */ zzjh l(byte[] bArr, int i2, int i3, zzkp zzkp) {
            return w(bArr, 0, i3, zzkp);
        }

        public final /* synthetic */ zzjh o() {
            return (zzb) clone();
        }

        public final zzb q(zzlc zzlc) {
            if (this.f25623z.equals(zzlc)) {
                return this;
            }
            if (!this.f25622A.I()) {
                v();
            }
            r(this.f25622A, zzlc);
            return this;
        }

        /* renamed from: s */
        public final zzlc F() {
            zzlc zzlc = (zzlc) E();
            if (zzlc.w(zzlc, true)) {
                return zzlc;
            }
            throw new zznu(zzlc);
        }

        /* renamed from: t */
        public zzlc E() {
            if (!this.f25622A.I()) {
                return this.f25622A;
            }
            this.f25622A.G();
            return this.f25622A;
        }

        public final void u() {
            if (!this.f25622A.I()) {
                v();
            }
        }

        public void v() {
            zzlc A2 = this.f25623z.A();
            r(A2, this.f25622A);
            this.f25622A = A2;
        }

        public final zzb w(byte[] bArr, int i2, int i3, zzkp zzkp) {
            if (!this.f25622A.I()) {
                v();
            }
            try {
                zzmz.a().c(this.f25622A).h(this.f25622A, bArr, 0, i3, new zzjn(zzkp));
                return this;
            } catch (zzlk e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw zzlk.i();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }

        /* renamed from: x */
        public final zzb p(zzkg zzkg, zzkp zzkp) {
            if (!this.f25622A.I()) {
                v();
            }
            try {
                zzmz.a().c(this.f25622A).g(this.f25622A, zzkk.Q(zzkg), zzkp);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }
    }

    public static final class zzc implements zzkx<zzc> {
        public final zzmq L(zzmq zzmq, zzmq zzmq2) {
            throw new NoSuchMethodError();
        }

        public final int a() {
            throw new NoSuchMethodError();
        }

        public final zzof b() {
            throw new NoSuchMethodError();
        }

        public final zzop c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final boolean e() {
            throw new NoSuchMethodError();
        }

        public final boolean g() {
            throw new NoSuchMethodError();
        }

        public final zzmk w(zzmk zzmk, zzml zzml) {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzlc<MessageType, BuilderType> implements zzmn {
        protected zzkv<zzc> zzc;

        public final zzkv J() {
            if (this.zzc.r()) {
                this.zzc = (zzkv) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    public static final class zze {

        /* renamed from: a  reason: collision with root package name */
        public static final int f25624a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f25625b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f25626c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f25627d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f25628e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f25629f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f25630g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int[] f25631h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f25631h.clone();
        }
    }

    public static class zzf<ContainingType extends zzml, Type> extends zzkq<ContainingType, Type> {
    }

    public static zzlj B() {
        return zzlf.h();
    }

    public static zzli C() {
        return zzlw.h();
    }

    public static zzll D() {
        return zzmy.i();
    }

    private final int n() {
        return zzmz.a().c(this).e(this);
    }

    public static zzlc p(Class cls) {
        zzlc zzlc = zzc.get(cls);
        if (zzlc == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzlc = zzc.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzlc == null) {
            zzlc = (zzlc) ((zzlc) zzny.b(cls)).s(zze.f25629f, (Object) null, (Object) null);
            if (zzlc != null) {
                zzc.put(cls, zzlc);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzlc;
    }

    public static zzli q(zzli zzli) {
        int size = zzli.size();
        return zzli.x(size == 0 ? 10 : size << 1);
    }

    public static zzll r(zzll zzll) {
        int size = zzll.size();
        return zzll.j(size == 0 ? 10 : size << 1);
    }

    public static Object t(zzml zzml, String str, Object[] objArr) {
        return new zznb(zzml, str, objArr);
    }

    public static Object u(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static void v(Class cls, zzlc zzlc) {
        zzlc.H();
        zzc.put(cls, zzlc);
    }

    public static final boolean w(zzlc zzlc, boolean z2) {
        byte byteValue = ((Byte) zzlc.s(zze.f25624a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = zzmz.a().c(zzlc).c(zzlc);
        if (z2) {
            zzlc.s(zze.f25625b, c2 ? zzlc : null, (Object) null);
        }
        return c2;
    }

    public final zzlc A() {
        return (zzlc) s(zze.f25627d, (Object) null, (Object) null);
    }

    public final void G() {
        zzmz.a().c(this).d(this);
        H();
    }

    public final void H() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean I() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean b() {
        return w(this, true);
    }

    public final void c(zzkl zzkl) {
        zzmz.a().c(this).i(this, zzko.P(zzkl));
    }

    public final int d(zznd zznd) {
        if (I()) {
            int x2 = x(zznd);
            if (x2 >= 0) {
                return x2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + x2);
        } else if (k() != Integer.MAX_VALUE) {
            return k();
        } else {
            int x3 = x(zznd);
            l(x3);
            return x3;
        }
    }

    public final /* synthetic */ zzml e() {
        return (zzlc) s(zze.f25629f, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzmz.a().c(this).j(this, (zzlc) obj);
        }
        return false;
    }

    public final /* synthetic */ zzmk g() {
        return (zzb) s(zze.f25628e, (Object) null, (Object) null);
    }

    public final int h() {
        return d((zznd) null);
    }

    public int hashCode() {
        if (I()) {
            return n();
        }
        if (this.zza == 0) {
            this.zza = n();
        }
        return this.zza;
    }

    public final /* synthetic */ zzmk i() {
        return ((zzb) s(zze.f25628e, (Object) null, (Object) null)).q(this);
    }

    public final int k() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public final void l(int i2) {
        if (i2 >= 0) {
            this.zzd = (i2 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i2);
    }

    public final zzb o(zzlc zzlc) {
        return y().q(zzlc);
    }

    public abstract Object s(int i2, Object obj, Object obj2);

    public String toString() {
        return zzmm.a(this, super.toString());
    }

    public final int x(zznd zznd) {
        return zznd == null ? zzmz.a().c(this).b(this) : zznd.b(this);
    }

    public final zzb y() {
        return (zzb) s(zze.f25628e, (Object) null, (Object) null);
    }

    public final zzb z() {
        return ((zzb) s(zze.f25628e, (Object) null, (Object) null)).q(this);
    }
}
