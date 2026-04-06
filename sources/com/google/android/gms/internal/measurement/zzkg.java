package com.google.android.gms.internal.measurement;

public abstract class zzkg {

    /* renamed from: d  reason: collision with root package name */
    public static volatile int f25581d = 100;

    /* renamed from: a  reason: collision with root package name */
    public int f25582a;

    /* renamed from: b  reason: collision with root package name */
    public int f25583b;

    /* renamed from: c  reason: collision with root package name */
    public zzkk f25584c;

    public static long c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static zzkg d(byte[] bArr, int i2, int i3, boolean z2) {
        zzkf zzkf = new zzkf(bArr, i3);
        try {
            zzkf.b(i3);
            return zzkf;
        } catch (zzlk e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int l(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public abstract boolean A();

    public abstract boolean B();

    public abstract double a();

    public abstract int b(int i2);

    public abstract float e();

    public abstract void f(int i2);

    public abstract int g();

    public abstract void h(int i2);

    public abstract int i();

    public abstract boolean j(int i2);

    public abstract int k();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract zzjs x();

    public abstract String y();

    public abstract String z();

    public zzkg() {
        this.f25583b = f25581d;
    }
}
