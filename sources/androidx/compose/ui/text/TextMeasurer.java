package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextMeasurer {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f18489f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final FontFamily.Resolver f18490a;

    /* renamed from: b  reason: collision with root package name */
    public final Density f18491b;

    /* renamed from: c  reason: collision with root package name */
    public final LayoutDirection f18492c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18493d;

    /* renamed from: e  reason: collision with root package name */
    public final TextLayoutCache f18494e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextLayoutResult b(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.j(), TextStyleKt.d(textLayoutInput.i(), textLayoutInput.d()), textLayoutInput.g(), textLayoutInput.b(), textLayoutInput.c());
            int n2 = Constraints.n(textLayoutInput.a());
            int l2 = ((textLayoutInput.h() || TextMeasurerKt.a(textLayoutInput.f())) && Constraints.h(textLayoutInput.a())) ? Constraints.l(textLayoutInput.a()) : Integer.MAX_VALUE;
            int e2 = (textLayoutInput.h() || !TextMeasurerKt.a(textLayoutInput.f())) ? textLayoutInput.e() : 1;
            if (n2 != l2) {
                l2 = RangesKt.o(ParagraphKt.d(multiParagraphIntrinsics.g()), n2, l2);
            }
            MultiParagraph multiParagraph = new MultiParagraph(multiParagraphIntrinsics, Constraints.f19137b.b(0, l2, 0, Constraints.k(textLayoutInput.a())), e2, textLayoutInput.f(), (DefaultConstructorMarker) null);
            return new TextLayoutResult(textLayoutInput, multiParagraph, ConstraintsKt.d(textLayoutInput.a(), IntSize.c((((long) ((int) ((float) Math.ceil((double) multiParagraph.h())))) & 4294967295L) | (((long) ((int) ((float) Math.ceil((double) multiParagraph.D())))) << 32))), (DefaultConstructorMarker) null);
        }

        public Companion() {
        }
    }

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i2) {
        this.f18490a = resolver;
        this.f18491b = density;
        this.f18492c = layoutDirection;
        this.f18493d = i2;
        this.f18494e = i2 > 0 ? new TextLayoutCache(i2) : null;
    }

    public static /* synthetic */ TextLayoutResult b(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z2, int i3, List list, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z3, int i4, Object obj) {
        TextMeasurer textMeasurer2 = textMeasurer;
        int i5 = i4;
        return textMeasurer.a(annotatedString, (i5 & 2) != 0 ? TextStyle.f18499d.a() : textStyle, (i5 & 4) != 0 ? TextOverflow.f19125b.a() : i2, (i5 & 8) != 0 ? true : z2, (i5 & 16) != 0 ? Integer.MAX_VALUE : i3, (i5 & 32) != 0 ? CollectionsKt.m() : list, (i5 & 64) != 0 ? ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null) : j2, (i5 & 128) != 0 ? textMeasurer2.f18492c : layoutDirection, (i5 & 256) != 0 ? textMeasurer2.f18491b : density, (i5 & 512) != 0 ? textMeasurer2.f18490a : resolver, (i5 & 1024) != 0 ? false : z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r1 = r0.f18494e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.text.TextLayoutResult a(androidx.compose.ui.text.AnnotatedString r16, androidx.compose.ui.text.TextStyle r17, int r18, boolean r19, int r20, java.util.List r21, long r22, androidx.compose.ui.unit.LayoutDirection r24, androidx.compose.ui.unit.Density r25, androidx.compose.ui.text.font.FontFamily.Resolver r26, boolean r27) {
        /*
            r15 = this;
            r0 = r15
            androidx.compose.ui.text.TextLayoutInput r14 = new androidx.compose.ui.text.TextLayoutInput
            r13 = 0
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r21
            r5 = r20
            r6 = r19
            r7 = r18
            r8 = r25
            r9 = r24
            r10 = r26
            r11 = r22
            r1.<init>((androidx.compose.ui.text.AnnotatedString) r2, (androidx.compose.ui.text.TextStyle) r3, (java.util.List) r4, (int) r5, (boolean) r6, (int) r7, (androidx.compose.ui.unit.Density) r8, (androidx.compose.ui.unit.LayoutDirection) r9, (androidx.compose.ui.text.font.FontFamily.Resolver) r10, (long) r11, (kotlin.jvm.internal.DefaultConstructorMarker) r13)
            if (r27 != 0) goto L_0x0027
            androidx.compose.ui.text.TextLayoutCache r1 = r0.f18494e
            if (r1 == 0) goto L_0x0027
            androidx.compose.ui.text.TextLayoutResult r1 = r1.a(r14)
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 == 0) goto L_0x005d
            androidx.compose.ui.text.MultiParagraph r2 = r1.w()
            float r2 = r2.D()
            int r2 = androidx.compose.ui.text.ParagraphKt.d(r2)
            androidx.compose.ui.text.MultiParagraph r3 = r1.w()
            float r3 = r3.h()
            int r3 = androidx.compose.ui.text.ParagraphKt.d(r3)
            long r4 = (long) r2
            r2 = 32
            long r4 = r4 << r2
            long r2 = (long) r3
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            long r2 = r2 | r4
            long r2 = androidx.compose.ui.unit.IntSize.c(r2)
            r4 = r22
            long r2 = androidx.compose.ui.unit.ConstraintsKt.d(r4, r2)
            androidx.compose.ui.text.TextLayoutResult r1 = r1.a(r14, r2)
            goto L_0x006a
        L_0x005d:
            androidx.compose.ui.text.TextMeasurer$Companion r1 = f18489f
            androidx.compose.ui.text.TextLayoutResult r1 = r1.b(r14)
            androidx.compose.ui.text.TextLayoutCache r2 = r0.f18494e
            if (r2 == 0) goto L_0x006a
            r2.b(r14, r1)
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextMeasurer.a(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, int, boolean, int, java.util.List, long, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, boolean):androidx.compose.ui.text.TextLayoutResult");
    }
}
