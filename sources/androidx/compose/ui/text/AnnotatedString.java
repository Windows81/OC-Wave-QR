package androidx.compose.ui.text;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AnnotatedString implements CharSequence {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final Saver E = SaversKt.h();

    /* renamed from: A  reason: collision with root package name */
    public final String f18220A;

    /* renamed from: B  reason: collision with root package name */
    public final List f18221B;
    public final List C;

    /* renamed from: z  reason: collision with root package name */
    public final List f18222z;

    @Metadata
    public interface Annotation {
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ExhaustiveAnnotation implements Annotation {
    }

    public AnnotatedString(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f18222z = list;
        this.f18220A = str;
        List list2 = null;
        if (list != null) {
            int size = list.size();
            arrayList2 = null;
            arrayList = null;
            for (int i2 = 0; i2 < size; i2++) {
                Range range = (Range) list.get(i2);
                if (range.g() instanceof SpanStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.g(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList2.add(range);
                } else if (range.g() instanceof ParagraphStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.g(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList.add(range);
                }
            }
        } else {
            arrayList2 = null;
            arrayList = null;
        }
        this.f18221B = arrayList2;
        this.C = arrayList;
        list2 = arrayList != null ? CollectionsKt.D0(arrayList, new AnnotatedString$special$$inlined$sortedBy$1()) : list2;
        Collection collection = list2;
        if (collection != null && !collection.isEmpty()) {
            MutableIntList e2 = IntListKt.e(((Range) CollectionsKt.e0(list2)).f());
            int size2 = list2.size();
            for (int i3 = 1; i3 < size2; i3++) {
                Range range2 = (Range) list2.get(i3);
                while (true) {
                    if (e2.f1784b == 0) {
                        break;
                    }
                    int i4 = e2.i();
                    if (range2.h() >= i4) {
                        e2.o(e2.f1784b - 1);
                    } else {
                        if (!(range2.f() <= i4)) {
                            InlineClassHelperKt.a("Paragraph overlap not allowed, end " + range2.f() + " should be less than or equal to " + i4);
                        }
                    }
                }
                e2.k(range2.f());
            }
        }
    }

    public final AnnotatedString a(Function1 function1) {
        Builder builder = new Builder(this);
        builder.l(function1);
        return builder.r();
    }

    public char b(int i2) {
        return this.f18220A.charAt(i2);
    }

    public final List c() {
        return this.f18222z;
    }

    public final /* bridge */ char charAt(int i2) {
        return b(i2);
    }

    public int d() {
        return this.f18220A.length();
    }

    public final List e(int i2, int i3) {
        List list;
        List list2 = this.f18222z;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = list2.get(i4);
                Range range = (Range) obj;
                if ((range.g() instanceof LinkAnnotation) && AnnotatedStringKt.i(i2, i3, range.h(), range.f())) {
                    list.add(obj);
                }
            }
        } else {
            list = CollectionsKt.m();
        }
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return Intrinsics.d(this.f18220A, annotatedString.f18220A) && Intrinsics.d(this.f18222z, annotatedString.f18222z);
    }

    public final List f() {
        List list = this.C;
        return list == null ? CollectionsKt.m() : list;
    }

    public final List g() {
        return this.C;
    }

    public final List h() {
        List list = this.f18221B;
        return list == null ? CollectionsKt.m() : list;
    }

    public int hashCode() {
        int hashCode = this.f18220A.hashCode() * 31;
        List list = this.f18222z;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final List i() {
        return this.f18221B;
    }

    public final List j(String str, int i2, int i3) {
        List list = this.f18222z;
        if (list == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range range = (Range) list.get(i4);
            if ((range.g() instanceof StringAnnotation) && Intrinsics.d(str, range.i()) && AnnotatedStringKt.i(i2, i3, range.h(), range.f())) {
                arrayList.add(StringAnnotationKt.a(range));
            }
        }
        return arrayList;
    }

    public final String k() {
        return this.f18220A;
    }

    public final List l(int i2, int i3) {
        List list;
        List list2 = this.f18222z;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = list2.get(i4);
                Range range = (Range) obj;
                if ((range.g() instanceof TtsAnnotation) && AnnotatedStringKt.i(i2, i3, range.h(), range.f())) {
                    list.add(obj);
                }
            }
        } else {
            list = CollectionsKt.m();
        }
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return list;
    }

    public final /* bridge */ int length() {
        return d();
    }

    public final List m(int i2, int i3) {
        List list;
        List list2 = this.f18222z;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = list2.get(i4);
                Range range = (Range) obj;
                if ((range.g() instanceof UrlAnnotation) && AnnotatedStringKt.i(i2, i3, range.h(), range.f())) {
                    list.add(obj);
                }
            }
        } else {
            list = CollectionsKt.m();
        }
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return list;
    }

    public final boolean n(AnnotatedString annotatedString) {
        return Intrinsics.d(this.f18222z, annotatedString.f18222z);
    }

    public final boolean o(int i2, int i3) {
        List list = this.f18222z;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range range = (Range) list.get(i4);
            if ((range.g() instanceof LinkAnnotation) && AnnotatedStringKt.i(i2, i3, range.h(), range.f())) {
                return true;
            }
        }
        return false;
    }

    public final boolean p(String str, int i2, int i3) {
        List list = this.f18222z;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range range = (Range) list.get(i4);
            if ((range.g() instanceof StringAnnotation) && Intrinsics.d(str, range.i()) && AnnotatedStringKt.i(i2, i3, range.h(), range.f())) {
                return true;
            }
        }
        return false;
    }

    public final AnnotatedString q(Function1 function1) {
        Builder builder = new Builder(this);
        builder.n(function1);
        return builder.r();
    }

    public final AnnotatedString r(AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.i(annotatedString);
        return builder.r();
    }

    /* renamed from: s */
    public AnnotatedString subSequence(int i2, int i3) {
        if (!(i2 <= i3)) {
            InlineClassHelperKt.a("start (" + i2 + ") should be less or equal to end (" + i3 + ')');
        }
        if (i2 == 0 && i3 == this.f18220A.length()) {
            return this;
        }
        String substring = this.f18220A.substring(i2, i3);
        Intrinsics.h(substring, "substring(...)");
        return new AnnotatedString(AnnotatedStringKt.f(this.f18222z, i2, i3), substring);
    }

    public final AnnotatedString t(long j2) {
        return subSequence(TextRange.l(j2), TextRange.k(j2));
    }

    public String toString() {
        return this.f18220A;
    }

    @Metadata
    public static final class Builder implements Appendable {

        /* renamed from: A  reason: collision with root package name */
        public final List f18223A;

        /* renamed from: B  reason: collision with root package name */
        public final List f18224B;
        public final BulletScope C;

        /* renamed from: z  reason: collision with root package name */
        public final StringBuilder f18225z;

        @Metadata
        public static final class BulletScope {

            /* renamed from: a  reason: collision with root package name */
            public final Builder f18226a;

            /* renamed from: b  reason: collision with root package name */
            public final List f18227b = new ArrayList();

            public BulletScope(Builder builder) {
                this.f18226a = builder;
            }
        }

        public Builder(int i2) {
            this.f18225z = new StringBuilder(i2);
            this.f18223A = new ArrayList();
            this.f18224B = new ArrayList();
            this.C = new BulletScope(this);
        }

        public final void a(Bullet bullet, long j2, int i2, int i3) {
            this.f18224B.add(new MutableRange(new ParagraphStyle(0, 0, 0, new TextIndent(j2, j2, (DefaultConstructorMarker) null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (DefaultConstructorMarker) null), i2, i3, (String) null, 8, (DefaultConstructorMarker) null));
            this.f18224B.add(new MutableRange(bullet, i2, i3, (String) null, 8, (DefaultConstructorMarker) null));
        }

        public final void b(LinkAnnotation.Url url, int i2, int i3) {
            this.f18224B.add(new MutableRange(url, i2, i3, (String) null, 8, (DefaultConstructorMarker) null));
        }

        public final void c(String str, String str2, int i2, int i3) {
            this.f18224B.add(new MutableRange(StringAnnotation.a(StringAnnotation.b(str2)), i2, i3, str));
        }

        public final void d(ParagraphStyle paragraphStyle, int i2, int i3) {
            this.f18224B.add(new MutableRange(paragraphStyle, i2, i3, (String) null, 8, (DefaultConstructorMarker) null));
        }

        public final void e(SpanStyle spanStyle, int i2, int i3) {
            this.f18224B.add(new MutableRange(spanStyle, i2, i3, (String) null, 8, (DefaultConstructorMarker) null));
        }

        /* renamed from: f */
        public Builder append(char c2) {
            this.f18225z.append(c2);
            return this;
        }

        /* renamed from: g */
        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                i((AnnotatedString) charSequence);
            } else {
                this.f18225z.append(charSequence);
            }
            return this;
        }

        /* renamed from: h */
        public Builder append(CharSequence charSequence, int i2, int i3) {
            if (charSequence instanceof AnnotatedString) {
                j((AnnotatedString) charSequence, i2, i3);
            } else {
                this.f18225z.append(charSequence, i2, i3);
            }
            return this;
        }

        public final void i(AnnotatedString annotatedString) {
            int length = this.f18225z.length();
            this.f18225z.append(annotatedString.k());
            List c2 = annotatedString.c();
            if (c2 != null) {
                int size = c2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Range range = (Range) c2.get(i2);
                    this.f18224B.add(new MutableRange(range.g(), range.h() + length, range.f() + length, range.i()));
                }
            }
        }

        public final void j(AnnotatedString annotatedString, int i2, int i3) {
            int length = this.f18225z.length();
            this.f18225z.append(annotatedString.k(), i2, i3);
            List h2 = AnnotatedStringKt.h(annotatedString, i2, i3, (Function1) null, 4, (Object) null);
            if (h2 != null) {
                int size = h2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Range range = (Range) h2.get(i4);
                    this.f18224B.add(new MutableRange(range.g(), range.h() + length, range.f() + length, range.i()));
                }
            }
        }

        public final void k(String str) {
            this.f18225z.append(str);
        }

        public final void l(Function1 function1) {
            List list = this.f18224B;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                List list2 = (List) function1.invoke(MutableRange.c((MutableRange) list.get(i2), 0, 1, (Object) null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(MutableRange.f18228e.a((Range) list2.get(i3)));
                }
                CollectionsKt.B(arrayList, arrayList2);
            }
            this.f18224B.clear();
            this.f18224B.addAll(arrayList);
        }

        public final int m() {
            return this.f18225z.length();
        }

        public final void n(Function1 function1) {
            int size = this.f18224B.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f18224B.set(i2, MutableRange.f18228e.a((Range) function1.invoke(MutableRange.c((MutableRange) this.f18224B.get(i2), 0, 1, (Object) null))));
            }
        }

        public final void o() {
            if (this.f18223A.isEmpty()) {
                InlineClassHelperKt.c("Nothing to pop.");
            }
            List list = this.f18223A;
            ((MutableRange) list.remove(list.size() - 1)).a(this.f18225z.length());
        }

        public final void p(int i2) {
            if (!(i2 < this.f18223A.size())) {
                InlineClassHelperKt.c(i2 + " should be less than " + this.f18223A.size());
            }
            while (this.f18223A.size() - 1 >= i2) {
                o();
            }
        }

        public final int q(SpanStyle spanStyle) {
            MutableRange mutableRange = new MutableRange(spanStyle, this.f18225z.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f18223A.add(mutableRange);
            this.f18224B.add(mutableRange);
            return this.f18223A.size() - 1;
        }

        public final AnnotatedString r() {
            String sb = this.f18225z.toString();
            List list = this.f18224B;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((MutableRange) list.get(i2)).b(this.f18225z.length()));
            }
            return new AnnotatedString(sb, (List) arrayList);
        }

        @Metadata
        public static final class MutableRange<T> {

            /* renamed from: e  reason: collision with root package name */
            public static final Companion f18228e = new Companion((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            public final Object f18229a;

            /* renamed from: b  reason: collision with root package name */
            public final int f18230b;

            /* renamed from: c  reason: collision with root package name */
            public int f18231c;

            /* renamed from: d  reason: collision with root package name */
            public final String f18232d;

            @Metadata
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final MutableRange a(Range range) {
                    return new MutableRange(range.g(), range.h(), range.f(), range.i());
                }

                public Companion() {
                }
            }

            public MutableRange(Object obj, int i2, int i3, String str) {
                this.f18229a = obj;
                this.f18230b = i2;
                this.f18231c = i3;
                this.f18232d = str;
            }

            public static /* synthetic */ Range c(MutableRange mutableRange, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i2 = Integer.MIN_VALUE;
                }
                return mutableRange.b(i2);
            }

            public final void a(int i2) {
                this.f18231c = i2;
            }

            public final Range b(int i2) {
                int i3 = this.f18231c;
                if (i3 != Integer.MIN_VALUE) {
                    i2 = i3;
                }
                if (!(i2 != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.c("Item.end should be set first");
                }
                return new Range(this.f18229a, this.f18230b, i2, this.f18232d);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return Intrinsics.d(this.f18229a, mutableRange.f18229a) && this.f18230b == mutableRange.f18230b && this.f18231c == mutableRange.f18231c && Intrinsics.d(this.f18232d, mutableRange.f18232d);
            }

            public int hashCode() {
                Object obj = this.f18229a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f18230b)) * 31) + Integer.hashCode(this.f18231c)) * 31) + this.f18232d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f18229a + ", start=" + this.f18230b + ", end=" + this.f18231c + ", tag=" + this.f18232d + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ MutableRange(Object obj, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i2, (i4 & 4) != 0 ? Integer.MIN_VALUE : i3, (i4 & 8) != 0 ? "" : str);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 16 : i2);
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, (DefaultConstructorMarker) null);
            i(annotatedString);
        }
    }

    @Metadata
    public static final class Range<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f18233a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18234b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18235c;

        /* renamed from: d  reason: collision with root package name */
        public final String f18236d;

        public Range(Object obj, int i2, int i3, String str) {
            this.f18233a = obj;
            this.f18234b = i2;
            this.f18235c = i3;
            this.f18236d = str;
            if (!(i2 <= i3)) {
                InlineClassHelperKt.a("Reversed range is not supported");
            }
        }

        public static /* synthetic */ Range e(Range range, Object obj, int i2, int i3, String str, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = range.f18233a;
            }
            if ((i4 & 2) != 0) {
                i2 = range.f18234b;
            }
            if ((i4 & 4) != 0) {
                i3 = range.f18235c;
            }
            if ((i4 & 8) != 0) {
                str = range.f18236d;
            }
            return range.d(obj, i2, i3, str);
        }

        public final Object a() {
            return this.f18233a;
        }

        public final int b() {
            return this.f18234b;
        }

        public final int c() {
            return this.f18235c;
        }

        public final Range d(Object obj, int i2, int i3, String str) {
            return new Range(obj, i2, i3, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return Intrinsics.d(this.f18233a, range.f18233a) && this.f18234b == range.f18234b && this.f18235c == range.f18235c && Intrinsics.d(this.f18236d, range.f18236d);
        }

        public final int f() {
            return this.f18235c;
        }

        public final Object g() {
            return this.f18233a;
        }

        public final int h() {
            return this.f18234b;
        }

        public int hashCode() {
            Object obj = this.f18233a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f18234b)) * 31) + Integer.hashCode(this.f18235c)) * 31) + this.f18236d.hashCode();
        }

        public final String i() {
            return this.f18236d;
        }

        public String toString() {
            return "Range(item=" + this.f18233a + ", start=" + this.f18234b + ", end=" + this.f18235c + ", tag=" + this.f18236d + ')';
        }

        public Range(Object obj, int i2, int i3) {
            this(obj, i2, i3, "");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? CollectionsKt.m() : list, (i2 & 4) != 0 ? CollectionsKt.m() : list2);
    }

    public AnnotatedString(String str, List list, List list2) {
        this(AnnotatedStringKt.d(list, list2), str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnnotatedString(String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? CollectionsKt.m() : list);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnnotatedString(java.lang.String r2, java.util.List r3) {
        /*
            r1 = this;
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0009
            r3 = 0
        L_0x0009:
            java.util.List r3 = (java.util.List) r3
            r1.<init>((java.util.List) r3, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.<init>(java.lang.String, java.util.List):void");
    }
}
