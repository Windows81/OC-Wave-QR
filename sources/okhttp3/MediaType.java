package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class MediaType {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f42680e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f42681f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f42682g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f42683a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42684b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42685c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f42686d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaType a(String str) {
            Intrinsics.i(str, "<this>");
            Matcher matcher = MediaType.f42681f.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                Intrinsics.h(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                Intrinsics.h(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                Intrinsics.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                Intrinsics.h(group2, "typeSubtype.group(2)");
                Intrinsics.h(locale, "US");
                String lowerCase2 = group2.toLowerCase(locale);
                Intrinsics.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.f42682g.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (StringsKt.Q(group4, "'", false, 2, (Object) null) && StringsKt.A(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                Intrinsics.h(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        Intrinsics.h(substring, "this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final MediaType b(String str) {
            Intrinsics.i(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(MediaType mediaType, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = null;
        }
        return mediaType.c(charset);
    }

    public static final MediaType e(String str) {
        return f42680e.a(str);
    }

    public final Charset c(Charset charset) {
        String f2 = f("charset");
        if (f2 == null) {
            return charset;
        }
        try {
            return Charset.forName(f2);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.d(((MediaType) obj).f42683a, this.f42683a);
    }

    public final String f(String str) {
        Intrinsics.i(str, "name");
        int i2 = 0;
        int c2 = ProgressionUtilKt.c(0, this.f42686d.length - 1, 2);
        if (c2 < 0) {
            return null;
        }
        while (!StringsKt.B(this.f42686d[i2], str, true)) {
            if (i2 == c2) {
                return null;
            }
            i2 += 2;
        }
        return this.f42686d[i2 + 1];
    }

    public final String g() {
        return this.f42684b;
    }

    public int hashCode() {
        return this.f42683a.hashCode();
    }

    public String toString() {
        return this.f42683a;
    }

    public MediaType(String str, String str2, String str3, String[] strArr) {
        this.f42683a = str;
        this.f42684b = str2;
        this.f42685c = str3;
        this.f42686d = strArr;
    }
}
