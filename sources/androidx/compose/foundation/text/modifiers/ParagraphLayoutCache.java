package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class ParagraphLayoutCache {

    /* renamed from: a  reason: collision with root package name */
    public String f6632a;

    /* renamed from: b  reason: collision with root package name */
    public TextStyle f6633b;

    /* renamed from: c  reason: collision with root package name */
    public FontFamily.Resolver f6634c;

    /* renamed from: d  reason: collision with root package name */
    public int f6635d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6636e;

    /* renamed from: f  reason: collision with root package name */
    public int f6637f;

    /* renamed from: g  reason: collision with root package name */
    public int f6638g;

    /* renamed from: h  reason: collision with root package name */
    public long f6639h;

    /* renamed from: i  reason: collision with root package name */
    public Density f6640i;

    /* renamed from: j  reason: collision with root package name */
    public Paragraph f6641j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6642k;

    /* renamed from: l  reason: collision with root package name */
    public long f6643l;

    /* renamed from: m  reason: collision with root package name */
    public MinLinesConstrainer f6644m;

    /* renamed from: n  reason: collision with root package name */
    public ParagraphIntrinsics f6645n;

    /* renamed from: o  reason: collision with root package name */
    public LayoutDirection f6646o;

    /* renamed from: p  reason: collision with root package name */
    public long f6647p;

    /* renamed from: q  reason: collision with root package name */
    public int f6648q;

    /* renamed from: r  reason: collision with root package name */
    public int f6649r;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i2, z2, i3, i4);
    }

    public static /* synthetic */ long r(ParagraphLayoutCache paragraphLayoutCache, long j2, LayoutDirection layoutDirection, TextStyle textStyle, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textStyle = paragraphLayoutCache.f6633b;
        }
        return paragraphLayoutCache.q(j2, layoutDirection, textStyle);
    }

    public final Density a() {
        return this.f6640i;
    }

    public final boolean b() {
        return this.f6642k;
    }

    public final long c() {
        return this.f6643l;
    }

    public final Unit d() {
        ParagraphIntrinsics paragraphIntrinsics = this.f6645n;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.a();
        }
        return Unit.f40552a;
    }

    public final Paragraph e() {
        return this.f6641j;
    }

    public final int f(int i2, LayoutDirection layoutDirection) {
        int i3 = this.f6648q;
        int i4 = this.f6649r;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        long a2 = ConstraintsKt.a(0, i2, 0, Integer.MAX_VALUE);
        if (this.f6638g > 1) {
            a2 = r(this, a2, layoutDirection, (TextStyle) null, 4, (Object) null);
        }
        int e2 = RangesKt.e(TextDelegateKt.a(g(a2, layoutDirection).a()), Constraints.m(a2));
        this.f6648q = i2;
        this.f6649r = e2;
        return e2;
    }

    public final Paragraph g(long j2, LayoutDirection layoutDirection) {
        ParagraphIntrinsics n2 = n(layoutDirection);
        return ParagraphKt.c(n2, LayoutUtilsKt.a(j2, this.f6636e, this.f6635d, n2.g()), LayoutUtilsKt.b(this.f6636e, this.f6635d, this.f6637f), this.f6635d);
    }

    public final boolean h(long j2, LayoutDirection layoutDirection) {
        boolean z2 = true;
        if (this.f6638g > 1) {
            j2 = r(this, j2, layoutDirection, (TextStyle) null, 4, (Object) null);
        }
        boolean z3 = false;
        if (!l(j2, layoutDirection)) {
            if (!Constraints.f(j2, this.f6647p)) {
                Paragraph paragraph = this.f6641j;
                Intrinsics.f(paragraph);
                long d2 = ConstraintsKt.d(j2, IntSize.c((((long) TextDelegateKt.a(Math.min(paragraph.g(), paragraph.b()))) << 32) | (((long) TextDelegateKt.a(paragraph.a())) & 4294967295L)));
                this.f6643l = d2;
                if (TextOverflow.h(this.f6635d, TextOverflow.f19125b.e()) || (((float) ((int) (d2 >> 32))) >= paragraph.b() && ((float) ((int) (4294967295L & d2))) >= paragraph.a())) {
                    z2 = false;
                }
                this.f6642k = z2;
                this.f6647p = j2;
            }
            return false;
        }
        Paragraph g2 = g(j2, layoutDirection);
        this.f6647p = j2;
        long d3 = ConstraintsKt.d(j2, IntSize.c((((long) TextDelegateKt.a(g2.b())) << 32) | (((long) TextDelegateKt.a(g2.a())) & 4294967295L)));
        this.f6643l = d3;
        if (!TextOverflow.h(this.f6635d, TextOverflow.f19125b.e()) && (((float) ((int) (d3 >> 32))) < g2.b() || ((float) ((int) (d3 & 4294967295L))) < g2.a())) {
            z3 = true;
        }
        this.f6642k = z3;
        this.f6641j = g2;
        return true;
    }

    public final void i() {
        this.f6641j = null;
        this.f6645n = null;
        this.f6646o = null;
        this.f6648q = -1;
        this.f6649r = -1;
        this.f6647p = Constraints.f19137b.c(0, 0);
        long j2 = (long) 0;
        this.f6643l = IntSize.c((j2 & 4294967295L) | (j2 << 32));
        this.f6642k = false;
    }

    public final int j(LayoutDirection layoutDirection) {
        return TextDelegateKt.a(n(layoutDirection).g());
    }

    public final int k(LayoutDirection layoutDirection) {
        return TextDelegateKt.a(n(layoutDirection).c());
    }

    public final boolean l(long j2, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.f6641j;
        if (paragraph == null || (paragraphIntrinsics = this.f6645n) == null || paragraphIntrinsics.a() || layoutDirection != this.f6646o) {
            return true;
        }
        if (Constraints.f(j2, this.f6647p)) {
            return false;
        }
        return Constraints.l(j2) != Constraints.l(this.f6647p) || Constraints.n(j2) != Constraints.n(this.f6647p) || ((float) Constraints.k(j2)) < paragraph.a() || paragraph.D();
    }

    public final void m(Density density) {
        Density density2 = this.f6640i;
        long d2 = density != null ? InlineDensity.d(density) : InlineDensity.f6596b.a();
        if (density2 == null) {
            this.f6640i = density;
            this.f6639h = d2;
        } else if (density == null || !InlineDensity.f(this.f6639h, d2)) {
            this.f6640i = density;
            this.f6639h = d2;
            i();
        }
    }

    public final ParagraphIntrinsics n(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics = this.f6645n;
        if (paragraphIntrinsics == null || layoutDirection != this.f6646o || paragraphIntrinsics.a()) {
            this.f6646o = layoutDirection;
            String str = this.f6632a;
            TextStyle d2 = TextStyleKt.d(this.f6633b, layoutDirection);
            List m2 = CollectionsKt.m();
            Density density = this.f6640i;
            Intrinsics.f(density);
            paragraphIntrinsics = ParagraphIntrinsicsKt.a(str, d2, m2, density, this.f6634c, CollectionsKt.m());
        }
        this.f6645n = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    public final TextLayoutResult o(TextStyle textStyle) {
        Density density;
        LayoutDirection layoutDirection = this.f6646o;
        if (layoutDirection == null || (density = this.f6640i) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.f6632a, (List) null, 2, (DefaultConstructorMarker) null);
        if (this.f6641j == null || this.f6645n == null) {
            return null;
        }
        long b2 = Constraints.b(this.f6647p & -8589934589L);
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, CollectionsKt.m(), this.f6637f, this.f6636e, this.f6635d, density, layoutDirection, this.f6634c, b2, (DefaultConstructorMarker) null);
        MultiParagraph multiParagraph = new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, CollectionsKt.m(), density, this.f6634c), b2, this.f6637f, this.f6635d, (DefaultConstructorMarker) null);
        return new TextLayoutResult(textLayoutInput, multiParagraph, this.f6643l, (DefaultConstructorMarker) null);
    }

    public final void p(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4) {
        this.f6632a = str;
        this.f6633b = textStyle;
        this.f6634c = resolver;
        this.f6635d = i2;
        this.f6636e = z2;
        this.f6637f = i3;
        this.f6638g = i4;
        i();
    }

    public final long q(long j2, LayoutDirection layoutDirection, TextStyle textStyle) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.f6599h;
        MinLinesConstrainer minLinesConstrainer = this.f6644m;
        Density density = this.f6640i;
        Intrinsics.f(density);
        MinLinesConstrainer a2 = companion.a(minLinesConstrainer, layoutDirection, textStyle, density, this.f6634c);
        this.f6644m = a2;
        return a2.c(j2, this.f6638g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        sb.append(this.f6641j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append(InlineDensity.j(this.f6639h));
        sb.append(')');
        return sb.toString();
    }

    public ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4) {
        this.f6632a = str;
        this.f6633b = textStyle;
        this.f6634c = resolver;
        this.f6635d = i2;
        this.f6636e = z2;
        this.f6637f = i3;
        this.f6638g = i4;
        this.f6639h = InlineDensity.f6596b.a();
        long j2 = (long) 0;
        this.f6643l = IntSize.c((j2 & 4294967295L) | (j2 << 32));
        this.f6647p = Constraints.f19137b.c(0, 0);
        this.f6648q = -1;
        this.f6649r = -1;
    }
}
