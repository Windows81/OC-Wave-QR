package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

public final class LocaleListCompat {

    /* renamed from: b  reason: collision with root package name */
    public static final LocaleListCompat f19958b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final LocaleListInterface f19959a;

    public static class Api21Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Locale[] f19960a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class Api24Impl {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public LocaleListCompat(LocaleListInterface localeListInterface) {
        this.f19959a = localeListInterface;
    }

    public static LocaleListCompat a(Locale... localeArr) {
        return i(Api24Impl.a(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static LocaleListCompat c(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = Api21Impl.a(split[i2]);
        }
        return a(localeArr);
    }

    public static LocaleListCompat e() {
        return f19958b;
    }

    public static LocaleListCompat i(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    public Locale d(int i2) {
        return this.f19959a.get(i2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof LocaleListCompat) && this.f19959a.equals(((LocaleListCompat) obj).f19959a);
    }

    public boolean f() {
        return this.f19959a.isEmpty();
    }

    public int g() {
        return this.f19959a.size();
    }

    public String h() {
        return this.f19959a.a();
    }

    public int hashCode() {
        return this.f19959a.hashCode();
    }

    public String toString() {
        return this.f19959a.toString();
    }
}
