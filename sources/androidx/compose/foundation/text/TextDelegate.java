package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextDelegate {

    /* renamed from: l  reason: collision with root package name */
    public static final Companion f5880l = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f5881a;

    /* renamed from: b  reason: collision with root package name */
    public final TextStyle f5882b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5883c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5884d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5885e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5886f;

    /* renamed from: g  reason: collision with root package name */
    public final Density f5887g;

    /* renamed from: h  reason: collision with root package name */
    public final FontFamily.Resolver f5888h;

    /* renamed from: i  reason: collision with root package name */
    public final List f5889i;

    /* renamed from: j  reason: collision with root package name */
    public MultiParagraphIntrinsics f5890j;

    /* renamed from: k  reason: collision with root package name */
    public LayoutDirection f5891k;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i4, Density density, FontFamily.Resolver resolver, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i2, i3, z2, i4, density, resolver, list);
    }

    public final Density a() {
        return this.f5887g;
    }

    public final FontFamily.Resolver b() {
        return this.f5888h;
    }

    public final int c() {
        return TextDelegateKt.a(f().g());
    }

    public final int d() {
        return this.f5883c;
    }

    public final int e() {
        return this.f5884d;
    }

    public final MultiParagraphIntrinsics f() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f5890j;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int g() {
        return this.f5886f;
    }

    public final List h() {
        return this.f5889i;
    }

    public final boolean i() {
        return this.f5885e;
    }

    public final TextStyle j() {
        return this.f5882b;
    }

    public final AnnotatedString k() {
        return this.f5881a;
    }

    public final TextLayoutResult l(long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        long j3 = j2;
        if (textLayoutResult != null) {
            if (TextLayoutHelperKt.a(textLayoutResult, this.f5881a, this.f5882b, this.f5889i, this.f5883c, this.f5885e, this.f5886f, this.f5887g, layoutDirection, this.f5888h, j2)) {
                TextLayoutInput textLayoutInput = r1;
                TextLayoutInput textLayoutInput2 = new TextLayoutInput(textLayoutResult.l().j(), this.f5882b, textLayoutResult.l().g(), textLayoutResult.l().e(), textLayoutResult.l().h(), textLayoutResult.l().f(), textLayoutResult.l().b(), textLayoutResult.l().d(), textLayoutResult.l().c(), j2, (DefaultConstructorMarker) null);
                int a2 = TextDelegateKt.a(textLayoutResult.w().D());
                return textLayoutResult.a(textLayoutInput, ConstraintsKt.d(j3, IntSize.c((((long) TextDelegateKt.a(textLayoutResult.w().h())) & 4294967295L) | (((long) a2) << 32))));
            }
        }
        MultiParagraph n2 = n(j2, layoutDirection);
        int a3 = TextDelegateKt.a(n2.D());
        return new TextLayoutResult(new TextLayoutInput(this.f5881a, this.f5882b, this.f5889i, this.f5883c, this.f5885e, this.f5886f, this.f5887g, layoutDirection, this.f5888h, j2, (DefaultConstructorMarker) null), n2, ConstraintsKt.d(j3, IntSize.c((((long) TextDelegateKt.a(n2.h())) & 4294967295L) | (((long) a3) << 32))), (DefaultConstructorMarker) null);
    }

    public final void m(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f5890j;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f5891k || multiParagraphIntrinsics.a()) {
            this.f5891k = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f5881a, TextStyleKt.d(this.f5882b, layoutDirection), this.f5889i, this.f5887g, this.f5888h);
        }
        this.f5890j = multiParagraphIntrinsics;
    }

    public final MultiParagraph n(long j2, LayoutDirection layoutDirection) {
        m(layoutDirection);
        int n2 = Constraints.n(j2);
        int l2 = ((this.f5885e || TextOverflow.h(this.f5886f, TextOverflow.f19125b.b())) && Constraints.h(j2)) ? Constraints.l(j2) : Integer.MAX_VALUE;
        int i2 = (this.f5885e || !TextOverflow.h(this.f5886f, TextOverflow.f19125b.b())) ? this.f5883c : 1;
        if (n2 != l2) {
            l2 = RangesKt.o(c(), n2, l2);
        }
        return new MultiParagraph(f(), Constraints.f19137b.b(0, l2, 0, Constraints.k(j2)), i2, this.f5886f, (DefaultConstructorMarker) null);
    }

    public TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i4, Density density, FontFamily.Resolver resolver, List list) {
        this.f5881a = annotatedString;
        this.f5882b = textStyle;
        this.f5883c = i2;
        this.f5884d = i3;
        this.f5885e = z2;
        this.f5886f = i4;
        this.f5887g = density;
        this.f5888h = resolver;
        this.f5889i = list;
        boolean z3 = false;
        if (!(i2 > 0)) {
            InlineClassHelperKt.a("no maxLines");
        }
        if (!(i3 > 0)) {
            InlineClassHelperKt.a("no minLines");
        }
        if (!(i3 <= i2 ? true : z3)) {
            InlineClassHelperKt.a("minLines greater than maxLines");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextDelegate(androidx.compose.ui.text.AnnotatedString r14, androidx.compose.ui.text.TextStyle r15, int r16, int r17, boolean r18, int r19, androidx.compose.ui.unit.Density r20, androidx.compose.ui.text.font.FontFamily.Resolver r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000b
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto L_0x000d
        L_0x000b:
            r5 = r16
        L_0x000d:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L_0x0014
            r6 = r2
            goto L_0x0016
        L_0x0014:
            r6 = r17
        L_0x0016:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001c
            r7 = r2
            goto L_0x001e
        L_0x001c:
            r7 = r18
        L_0x001e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002a
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r1 = r1.a()
            r8 = r1
            goto L_0x002c
        L_0x002a:
            r8 = r19
        L_0x002c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0036
            java.util.List r0 = kotlin.collections.CollectionsKt.m()
            r11 = r0
            goto L_0x0038
        L_0x0036:
            r11 = r22
        L_0x0038:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextDelegate.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, int, int, boolean, int, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
