package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class Regex implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f41173A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final Pattern f41174z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Serialized implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public static final Companion f41176z = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }
    }

    public Regex(Pattern pattern) {
        Intrinsics.i(pattern, "nativePattern");
        this.f41174z = pattern;
    }

    public static /* synthetic */ MatchResult c(Regex regex, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return regex.b(charSequence, i2);
    }

    public final MatchResult b(CharSequence charSequence, int i2) {
        Intrinsics.i(charSequence, "input");
        Matcher matcher = this.f41174z.matcher(charSequence);
        Intrinsics.h(matcher, "matcher(...)");
        return RegexKt.d(matcher, i2, charSequence);
    }

    public final boolean d(CharSequence charSequence) {
        Intrinsics.i(charSequence, "input");
        return this.f41174z.matcher(charSequence).matches();
    }

    public final String e(CharSequence charSequence, String str) {
        Intrinsics.i(charSequence, "input");
        Intrinsics.i(str, "replacement");
        String replaceAll = this.f41174z.matcher(charSequence).replaceAll(str);
        Intrinsics.h(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String f(CharSequence charSequence, Function1 function1) {
        Intrinsics.i(charSequence, "input");
        Intrinsics.i(function1, "transform");
        int i2 = 0;
        MatchResult c2 = c(this, charSequence, 0, 2, (Object) null);
        if (c2 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i2, c2.b().e().intValue());
            sb.append((CharSequence) function1.invoke(c2));
            i2 = c2.b().m().intValue() + 1;
            c2 = c2.next();
            if (i2 >= length) {
                break;
            }
        } while (c2 != null);
        if (i2 < length) {
            sb.append(charSequence, i2, length);
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public final String g(CharSequence charSequence, String str) {
        Intrinsics.i(charSequence, "input");
        Intrinsics.i(str, "replacement");
        String replaceFirst = this.f41174z.matcher(charSequence).replaceFirst(str);
        Intrinsics.h(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    public final List h(CharSequence charSequence, int i2) {
        Intrinsics.i(charSequence, "input");
        StringsKt__StringsKt.I0(i2);
        Matcher matcher = this.f41174z.matcher(charSequence);
        if (i2 == 1 || !matcher.find()) {
            return CollectionsKt.e(charSequence.toString());
        }
        int i3 = 10;
        if (i2 > 0) {
            i3 = RangesKt.j(i2, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = i2 - 1;
        int i5 = 0;
        do {
            arrayList.add(charSequence.subSequence(i5, matcher.start()).toString());
            i5 = matcher.end();
            if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i5, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i5, matcher.start()).toString());
            i5 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i5, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f41174z.toString();
        Intrinsics.h(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.h(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }
}
