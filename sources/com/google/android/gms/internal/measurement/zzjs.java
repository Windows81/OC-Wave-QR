package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzjs implements Serializable, Iterable<Byte> {

    /* renamed from: A  reason: collision with root package name */
    public static final zzjs f25568A = new zzkb(zzle.f25634b);

    /* renamed from: B  reason: collision with root package name */
    public static final zzjv f25569B = new zzke();

    /* renamed from: z  reason: collision with root package name */
    public int f25570z = 0;

    static {
        new zzju();
    }

    public static /* synthetic */ int h(byte b2) {
        return b2 & 255;
    }

    public static int i(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        } else if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
        }
    }

    public static zzjs n(String str) {
        return new zzkb(str.getBytes(zzle.f25633a));
    }

    public static zzjs o(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static zzjs p(byte[] bArr, int i2, int i3) {
        i(i2, i2 + i3, bArr.length);
        return new zzkb(f25569B.a(bArr, i2, i3));
    }

    public static zzjs w(byte[] bArr) {
        return new zzkb(bArr);
    }

    public static zzjx z(int i2) {
        return new zzjx(i2);
    }

    public abstract byte e(int i2);

    public abstract boolean equals(Object obj);

    public final int g() {
        return this.f25570z;
    }

    public final int hashCode() {
        int i2 = this.f25570z;
        if (i2 == 0) {
            int u2 = u();
            i2 = v(u2, 0, u2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f25570z = i2;
        }
        return i2;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzjr(this);
    }

    public abstract zzjs m(int i2, int i3);

    public abstract void q(zzjp zzjp);

    public abstract byte s(int i2);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(u());
        if (u() <= 50) {
            str = zznt.a(this);
        } else {
            str = zznt.a(m(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{hexString, valueOf, str});
    }

    public abstract int u();

    public abstract int v(int i2, int i3, int i4);
}
