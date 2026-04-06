package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class MultiParagraphLayoutCache {

    /* renamed from: a  reason: collision with root package name */
    public AnnotatedString f6611a;

    /* renamed from: b  reason: collision with root package name */
    public FontFamily.Resolver f6612b;

    /* renamed from: c  reason: collision with root package name */
    public int f6613c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6614d;

    /* renamed from: e  reason: collision with root package name */
    public int f6615e;

    /* renamed from: f  reason: collision with root package name */
    public int f6616f;

    /* renamed from: g  reason: collision with root package name */
    public List f6617g;

    /* renamed from: h  reason: collision with root package name */
    public TextAutoSize f6618h;

    /* renamed from: i  reason: collision with root package name */
    public MinLinesConstrainer f6619i;

    /* renamed from: j  reason: collision with root package name */
    public long f6620j;

    /* renamed from: k  reason: collision with root package name */
    public Density f6621k;

    /* renamed from: l  reason: collision with root package name */
    public TextStyle f6622l;

    /* renamed from: m  reason: collision with root package name */
    public MultiParagraphIntrinsics f6623m;

    /* renamed from: n  reason: collision with root package name */
    public LayoutDirection f6624n;

    /* renamed from: o  reason: collision with root package name */
    public TextLayoutResult f6625o;

    /* renamed from: p  reason: collision with root package name */
    public int f6626p;

    /* renamed from: q  reason: collision with root package name */
    public int f6627q;

    /* renamed from: r  reason: collision with root package name */
    public TextAutoSizeLayoutScopeImpl f6628r;

    @Metadata
    public final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {

        /* renamed from: z  reason: collision with root package name */
        public TextLayoutResult f6630z;

        public TextAutoSizeLayoutScopeImpl() {
        }

        public final TextLayoutResult b() {
            return this.f6630z;
        }

        public float f2(long j2) {
            if (!TextUnit.j(j2)) {
                return B1(v(j2));
            }
            if (TextUnit.j(MultiParagraphLayoutCache.this.f6622l.l())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            } else if (!TextUnit.e(MultiParagraphLayoutCache.this.f6622l.l(), TextUnit.f19177b.a())) {
                return f2(MultiParagraphLayoutCache.this.f6622l.l()) * TextUnit.h(j2);
            } else {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            }
        }

        public float getDensity() {
            Density h2 = MultiParagraphLayoutCache.this.h();
            Intrinsics.f(h2);
            return h2.getDensity();
        }

        public float u1() {
            Density h2 = MultiParagraphLayoutCache.this.h();
            Intrinsics.f(h2);
            return h2.u1();
        }

        public TextLayoutResult z1(long j2, AnnotatedString annotatedString, long j3) {
            long j4;
            TextStyle c2 = MultiParagraphLayoutCache.this.f6622l;
            long a2 = TextUnit.j(j3) ? MultiParagraphLayoutCacheKt.b(MultiParagraphLayoutCache.this.f6622l.l(), j3) : j3;
            if (!TextUnit.e(a2, MultiParagraphLayoutCache.this.f6622l.l())) {
                MultiParagraphLayoutCache multiParagraphLayoutCache = MultiParagraphLayoutCache.this;
                multiParagraphLayoutCache.v(TextStyle.c(multiParagraphLayoutCache.f6622l, 0, a2, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (Object) null));
            }
            if (MultiParagraphLayoutCache.this.f6616f > 1) {
                MultiParagraphLayoutCache multiParagraphLayoutCache2 = MultiParagraphLayoutCache.this;
                LayoutDirection a3 = multiParagraphLayoutCache2.f6624n;
                Intrinsics.f(a3);
                j4 = multiParagraphLayoutCache2.y(j2, a3);
            } else {
                j4 = j2;
            }
            MultiParagraphLayoutCache multiParagraphLayoutCache3 = MultiParagraphLayoutCache.this;
            LayoutDirection a4 = multiParagraphLayoutCache3.f6624n;
            Intrinsics.f(a4);
            MultiParagraph d2 = multiParagraphLayoutCache3.m(j4, a4);
            MultiParagraphLayoutCache multiParagraphLayoutCache4 = MultiParagraphLayoutCache.this;
            LayoutDirection a5 = multiParagraphLayoutCache4.f6624n;
            Intrinsics.f(a5);
            TextLayoutResult f2 = multiParagraphLayoutCache4.w(a5, j4, d2);
            this.f6630z = f2;
            MultiParagraphLayoutCache.this.v(c2);
            return f2;
        }
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, List list, TextAutoSize textAutoSize, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, i2, z2, i3, i4, list, textAutoSize);
    }

    public final Density h() {
        return this.f6621k;
    }

    public final TextAutoSizeLayoutScopeImpl i() {
        if (this.f6628r == null) {
            this.f6628r = new TextAutoSizeLayoutScopeImpl();
        }
        TextAutoSizeLayoutScopeImpl textAutoSizeLayoutScopeImpl = this.f6628r;
        Intrinsics.f(textAutoSizeLayoutScopeImpl);
        return textAutoSizeLayoutScopeImpl;
    }

    public final TextLayoutResult j() {
        return this.f6625o;
    }

    public final TextLayoutResult k() {
        TextLayoutResult textLayoutResult = this.f6625o;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int l(int i2, LayoutDirection layoutDirection) {
        int i3 = this.f6626p;
        int i4 = this.f6627q;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        long a2 = ConstraintsKt.a(0, i2, 0, Integer.MAX_VALUE);
        if (this.f6616f > 1) {
            a2 = y(a2, layoutDirection);
        }
        int e2 = RangesKt.e(TextDelegateKt.a(m(a2, layoutDirection).h()), Constraints.m(a2));
        this.f6626p = i2;
        this.f6627q = e2;
        return e2;
    }

    public final MultiParagraph m(long j2, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics u2 = u(layoutDirection);
        return new MultiParagraph(u2, LayoutUtilsKt.a(j2, this.f6614d, this.f6613c, u2.g()), LayoutUtilsKt.b(this.f6614d, this.f6613c, this.f6615e), this.f6613c, (DefaultConstructorMarker) null);
    }

    public final boolean n(long j2, LayoutDirection layoutDirection) {
        LayoutDirection layoutDirection2 = layoutDirection;
        long y2 = this.f6616f > 1 ? y(j2, layoutDirection) : j2;
        if (!s(this.f6625o, y2, layoutDirection2)) {
            TextLayoutResult textLayoutResult = this.f6625o;
            Intrinsics.f(textLayoutResult);
            if (Constraints.f(y2, textLayoutResult.l().a())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.f6625o;
            Intrinsics.f(textLayoutResult2);
            this.f6625o = w(layoutDirection2, y2, textLayoutResult2.w());
            return true;
        }
        if (this.f6618h != null) {
            this.f6624n = layoutDirection2;
            long l2 = this.f6622l.l();
            TextAutoSize textAutoSize = this.f6618h;
            Intrinsics.f(textAutoSize);
            long a2 = textAutoSize.a(i(), j2, this.f6611a);
            if (TextUnit.j(a2)) {
                a2 = MultiParagraphLayoutCacheKt.b(l2, a2);
            }
            long j3 = a2;
            TextLayoutResult b2 = i().b();
            if (b2 == null || !TextUnit.e(j3, b2.l().i().l()) || !TextOverflow.h(b2.l().f(), this.f6613c)) {
                v(TextStyle.c(this.f6622l, 0, j3, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (Object) null));
            } else {
                this.f6625o = b2;
                return true;
            }
        }
        this.f6625o = w(layoutDirection2, y2, m(y2, layoutDirection2));
        return true;
    }

    public final void o() {
        this.f6623m = null;
        this.f6625o = null;
        this.f6627q = -1;
        this.f6626p = -1;
        this.f6628r = null;
    }

    public final void p() {
        this.f6623m = null;
        this.f6625o = null;
        this.f6627q = -1;
        this.f6626p = -1;
    }

    public final int q(LayoutDirection layoutDirection) {
        return TextDelegateKt.a(u(layoutDirection).g());
    }

    public final int r(LayoutDirection layoutDirection) {
        return TextDelegateKt.a(u(layoutDirection).c());
    }

    public final boolean s(TextLayoutResult textLayoutResult, long j2, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.w().j().a() || layoutDirection != textLayoutResult.l().d()) {
            return true;
        }
        if (Constraints.f(j2, textLayoutResult.l().a())) {
            return false;
        }
        return Constraints.l(j2) != Constraints.l(textLayoutResult.l().a()) || Constraints.n(j2) != Constraints.n(textLayoutResult.l().a()) || ((float) Constraints.k(j2)) < textLayoutResult.w().h() || textLayoutResult.w().f();
    }

    public final void t(Density density) {
        Density density2 = this.f6621k;
        long d2 = density != null ? InlineDensity.d(density) : InlineDensity.f6596b.a();
        if (density2 == null) {
            this.f6621k = density;
            this.f6620j = d2;
        } else if (density == null || !InlineDensity.f(this.f6620j, d2)) {
            this.f6621k = density;
            this.f6620j = d2;
            o();
        }
    }

    public final MultiParagraphIntrinsics u(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f6623m;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f6624n || multiParagraphIntrinsics.a()) {
            this.f6624n = layoutDirection;
            AnnotatedString annotatedString = this.f6611a;
            TextStyle d2 = TextStyleKt.d(this.f6622l, layoutDirection);
            Density density = this.f6621k;
            Intrinsics.f(density);
            FontFamily.Resolver resolver = this.f6612b;
            List list = this.f6617g;
            if (list == null) {
                list = CollectionsKt.m();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, d2, list, density, resolver);
        }
        this.f6623m = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    public final void v(TextStyle textStyle) {
        boolean G = textStyle.G(this.f6622l);
        this.f6622l = textStyle;
        if (!G) {
            p();
        }
    }

    public final TextLayoutResult w(LayoutDirection layoutDirection, long j2, MultiParagraph multiParagraph) {
        float min = Math.min(multiParagraph.j().g(), multiParagraph.D());
        AnnotatedString annotatedString = this.f6611a;
        TextStyle textStyle = this.f6622l;
        List list = this.f6617g;
        if (list == null) {
            list = CollectionsKt.m();
        }
        List list2 = list;
        int i2 = this.f6615e;
        boolean z2 = this.f6614d;
        int i3 = this.f6613c;
        Density density = this.f6621k;
        Intrinsics.f(density);
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list2, i2, z2, i3, density, layoutDirection, this.f6612b, j2, (DefaultConstructorMarker) null);
        int a2 = TextDelegateKt.a(min);
        long j3 = j2;
        return new TextLayoutResult(textLayoutInput, multiParagraph, ConstraintsKt.d(j3, IntSize.c((((long) TextDelegateKt.a(multiParagraph.h())) & 4294967295L) | (((long) a2) << 32))), (DefaultConstructorMarker) null);
    }

    public final void x(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, List list, TextAutoSize textAutoSize) {
        this.f6611a = annotatedString;
        v(textStyle);
        this.f6612b = resolver;
        this.f6613c = i2;
        this.f6614d = z2;
        this.f6615e = i3;
        this.f6616f = i4;
        this.f6617g = list;
        this.f6618h = textAutoSize;
        o();
    }

    public final long y(long j2, LayoutDirection layoutDirection) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.f6599h;
        MinLinesConstrainer minLinesConstrainer = this.f6619i;
        TextStyle textStyle = this.f6622l;
        Density density = this.f6621k;
        Intrinsics.f(density);
        MinLinesConstrainer a2 = companion.a(minLinesConstrainer, layoutDirection, textStyle, density, this.f6612b);
        this.f6619i = a2;
        return a2.c(j2, this.f6616f);
    }

    public MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, List list, TextAutoSize textAutoSize) {
        this.f6611a = annotatedString;
        this.f6612b = resolver;
        this.f6613c = i2;
        this.f6614d = z2;
        this.f6615e = i3;
        this.f6616f = i4;
        this.f6617g = list;
        this.f6618h = textAutoSize;
        this.f6620j = InlineDensity.f6596b.a();
        this.f6622l = textStyle;
        this.f6626p = -1;
        this.f6627q = -1;
    }
}
