package androidx.core.os;

import java.util.Locale;

final class LocaleListCompatWrapper implements LocaleListInterface {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f19961c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Locale f19962d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    public static final Locale f19963e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    public static final Locale f19964f = LocaleListCompat.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f19965a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19966b;

    public static class Api21Impl {
    }

    public String a() {
        return this.f19966b;
    }

    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListCompatWrapper) obj).f19965a;
        if (this.f19965a.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.f19965a;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.f19965a;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public int hashCode() {
        int i2 = 1;
        for (Locale hashCode : this.f19965a) {
            i2 = (i2 * 31) + hashCode.hashCode();
        }
        return i2;
    }

    public boolean isEmpty() {
        return this.f19965a.length == 0;
    }

    public int size() {
        return this.f19965a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f19965a;
            if (i2 < localeArr.length) {
                sb.append(localeArr[i2]);
                if (i2 < this.f19965a.length - 1) {
                    sb.append(',');
                }
                i2++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
