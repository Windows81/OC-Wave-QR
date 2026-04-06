package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

@Metadata
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f42654A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final String[] f42655z;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final List f42656a = new ArrayList(20);

        public final Builder a(String str, String str2) {
            Intrinsics.i(str, "name");
            Intrinsics.i(str2, "value");
            Companion companion = Headers.f42654A;
            companion.d(str);
            companion.e(str2, str);
            d(str, str2);
            return this;
        }

        public final Builder b(Headers headers) {
            Intrinsics.i(headers, "headers");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                d(headers.h(i2), headers.o(i2));
            }
            return this;
        }

        public final Builder c(String str) {
            Intrinsics.i(str, "line");
            int i0 = StringsKt.i0(str, ':', 1, false, 4, (Object) null);
            if (i0 != -1) {
                String substring = str.substring(0, i0);
                Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(i0 + 1);
                Intrinsics.h(substring2, "this as java.lang.String).substring(startIndex)");
                d(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                Intrinsics.h(substring3, "this as java.lang.String).substring(startIndex)");
                d("", substring3);
            } else {
                d("", str);
            }
            return this;
        }

        public final Builder d(String str, String str2) {
            Intrinsics.i(str, "name");
            Intrinsics.i(str2, "value");
            this.f42656a.add(str);
            this.f42656a.add(StringsKt.f1(str2).toString());
            return this;
        }

        public final Builder e(String str, String str2) {
            Intrinsics.i(str, "name");
            Intrinsics.i(str2, "value");
            Headers.f42654A.d(str);
            d(str, str2);
            return this;
        }

        public final Headers f() {
            return new Headers((String[]) this.f42656a.toArray(new String[0]), (DefaultConstructorMarker) null);
        }

        public final String g(String str) {
            Intrinsics.i(str, "name");
            int size = this.f42656a.size() - 2;
            int c2 = ProgressionUtilKt.c(size, 0, -2);
            if (c2 > size) {
                return null;
            }
            while (!StringsKt.B(str, (String) this.f42656a.get(size), true)) {
                if (size == c2) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f42656a.get(size + 1);
        }

        public final List h() {
            return this.f42656a;
        }

        public final Builder i(String str) {
            Intrinsics.i(str, "name");
            int i2 = 0;
            while (i2 < this.f42656a.size()) {
                if (StringsKt.B(str, (String) this.f42656a.get(i2), true)) {
                    this.f42656a.remove(i2);
                    this.f42656a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final Builder j(String str, String str2) {
            Intrinsics.i(str, "name");
            Intrinsics.i(str2, "value");
            Companion companion = Headers.f42654A;
            companion.d(str);
            companion.e(str2, str);
            i(str);
            d(str, str2);
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if ('!' > charAt || charAt >= 127) {
                        throw new IllegalArgumentException(Util.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }

        public final void e(String str, String str2) {
            String str3;
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt == 9 || (' ' <= charAt && charAt < 127)) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2));
                    if (Util.H(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb.append(str3);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c2 = ProgressionUtilKt.c(length, 0, -2);
            if (c2 > length) {
                return null;
            }
            while (!StringsKt.B(str, strArr[length], true)) {
                if (length == c2) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final Headers g(String... strArr) {
            Intrinsics.i(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    String str = strArr2[i3];
                    if (str != null) {
                        strArr2[i3] = StringsKt.f1(str).toString();
                        i3++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                int c2 = ProgressionUtilKt.c(0, strArr2.length - 1, 2);
                if (c2 >= 0) {
                    while (true) {
                        String str2 = strArr2[i2];
                        String str3 = strArr2[i2 + 1];
                        d(str2);
                        e(str3, str2);
                        if (i2 == c2) {
                            break;
                        }
                        i2 += 2;
                    }
                }
                return new Headers(strArr2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }

        public Companion() {
        }
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public static final Headers m(String... strArr) {
        return f42654A.g(strArr);
    }

    public final String e(String str) {
        Intrinsics.i(str, "name");
        return f42654A.f(this.f42655z, str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.f42655z, ((Headers) obj).f42655z);
    }

    public final Date g(String str) {
        Intrinsics.i(str, "name");
        String e2 = e(str);
        if (e2 != null) {
            return DatesKt.a(e2);
        }
        return null;
    }

    public final String h(int i2) {
        return this.f42655z[i2 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f42655z);
    }

    public final Builder i() {
        Builder builder = new Builder();
        CollectionsKt.C(builder.h(), this.f42655z);
        return builder;
    }

    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            pairArr[i2] = TuplesKt.a(h(i2), o(i2));
        }
        return ArrayIteratorKt.a(pairArr);
    }

    public final Map n() {
        TreeMap treeMap = new TreeMap(StringsKt.D(StringCompanionObject.f40914a));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String h2 = h(i2);
            Locale locale = Locale.US;
            Intrinsics.h(locale, "US");
            String lowerCase = h2.toLowerCase(locale);
            Intrinsics.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(o(i2));
        }
        return treeMap;
    }

    public final String o(int i2) {
        return this.f42655z[(i2 * 2) + 1];
    }

    public final List p(String str) {
        Intrinsics.i(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt.B(str, h(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(o(i2));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.m();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.h(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final int size() {
        return this.f42655z.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String h2 = h(i2);
            String o2 = o(i2);
            sb.append(h2);
            sb.append(": ");
            if (Util.H(h2)) {
                o2 = "██";
            }
            sb.append(o2);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public Headers(String[] strArr) {
        this.f42655z = strArr;
    }
}
