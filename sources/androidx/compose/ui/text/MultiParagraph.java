package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
public final class MultiParagraph {

    /* renamed from: a  reason: collision with root package name */
    public final MultiParagraphIntrinsics f18287a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18288b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18289c;

    /* renamed from: d  reason: collision with root package name */
    public final float f18290d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18291e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18292f;

    /* renamed from: g  reason: collision with root package name */
    public final List f18293g;

    /* renamed from: h  reason: collision with root package name */
    public final List f18294h;

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j2, i2, i3);
    }

    public static /* synthetic */ void H(MultiParagraph multiParagraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        long f2 = (i3 & 2) != 0 ? Color.f15975b.f() : j2;
        DrawStyle drawStyle2 = null;
        Shadow shadow2 = (i3 & 4) != 0 ? null : shadow;
        TextDecoration textDecoration2 = (i3 & 8) != 0 ? null : textDecoration;
        if ((i3 & 16) == 0) {
            drawStyle2 = drawStyle;
        }
        multiParagraph.G(canvas, f2, shadow2, textDecoration2, drawStyle2, (i3 & 32) != 0 ? DrawScope.f16288g.a() : i2);
    }

    public static /* synthetic */ void J(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        multiParagraph.I(canvas, brush, (i3 & 4) != 0 ? Float.NaN : f2, (i3 & 8) != 0 ? null : shadow, (i3 & 16) != 0 ? null : textDecoration, (i3 & 32) != 0 ? null : drawStyle, (i3 & 64) != 0 ? DrawScope.f16288g.a() : i2);
    }

    public static /* synthetic */ int o(MultiParagraph multiParagraph, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return multiParagraph.n(i2, z2);
    }

    public final Path A(int i2, int i3) {
        if (!(i2 >= 0 && i2 <= i3 && i3 <= b().k().length())) {
            InlineClassHelperKt.a("Start(" + i2 + ") or End(" + i3 + ") is out of range [0.." + b().k().length() + "), or start > end!");
        }
        if (i2 == i3) {
            return AndroidPath_androidKt.a();
        }
        Path a2 = AndroidPath_androidKt.a();
        MultiParagraphKt.d(this.f18294h, TextRangeKt.b(i2, i3), new MultiParagraph$getPathForRange$2(a2, i2, i3));
        return a2;
    }

    public final List B() {
        return this.f18293g;
    }

    public final long C(Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int c2 = MultiParagraphKt.c(this.f18294h, rect.r());
        if (((ParagraphInfo) this.f18294h.get(c2)).a() >= rect.i() || c2 == CollectionsKt.o(this.f18294h)) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(c2);
            return ParagraphInfo.l(paragraphInfo, paragraphInfo.e().t(paragraphInfo.p(rect), i2, textInclusionStrategy), false, 1, (Object) null);
        }
        int c3 = MultiParagraphKt.c(this.f18294h, rect.i());
        long a2 = TextRange.f18496b.a();
        while (true) {
            companion = TextRange.f18496b;
            if (TextRange.g(a2, companion.a()) && c2 <= c3) {
                ParagraphInfo paragraphInfo2 = (ParagraphInfo) this.f18294h.get(c2);
                a2 = ParagraphInfo.l(paragraphInfo2, paragraphInfo2.e().t(paragraphInfo2.p(rect), i2, textInclusionStrategy), false, 1, (Object) null);
                c2++;
            }
        }
        if (TextRange.g(a2, companion.a())) {
            return companion.a();
        }
        long a3 = companion.a();
        while (true) {
            companion2 = TextRange.f18496b;
            if (TextRange.g(a3, companion2.a()) && c2 <= c3) {
                ParagraphInfo paragraphInfo3 = (ParagraphInfo) this.f18294h.get(c3);
                a3 = ParagraphInfo.l(paragraphInfo3, paragraphInfo3.e().t(paragraphInfo3.p(rect), i2, textInclusionStrategy), false, 1, (Object) null);
                c3--;
            }
        }
        return TextRange.g(a3, companion2.a()) ? a2 : TextRangeKt.b(TextRange.n(a2), TextRange.i(a3));
    }

    public final float D() {
        return this.f18290d;
    }

    public final long E(int i2) {
        L(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(i2 == b().length() ? CollectionsKt.o(this.f18294h) : MultiParagraphKt.a(this.f18294h, i2));
        return paragraphInfo.k(paragraphInfo.e().q(paragraphInfo.r(i2)), false);
    }

    public final boolean F(int i2) {
        M(i2);
        return ((ParagraphInfo) this.f18294h.get(MultiParagraphKt.b(this.f18294h, i2))).e().y(i2);
    }

    public final void G(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        canvas.o();
        List list = this.f18294h;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
            paragraphInfo.e().p(canvas, j2, shadow, textDecoration, drawStyle, i2);
            canvas.d(0.0f, paragraphInfo.e().a());
        }
        Canvas canvas2 = canvas;
        canvas.t();
    }

    public final void I(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        AndroidMultiParagraphDraw_androidKt.a(this, canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
    }

    public final void K(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < b().k().length()) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("offset(" + i2 + ") is out of bounds [0, " + b().length() + ')');
        }
    }

    public final void L(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= b().k().length()) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("offset(" + i2 + ") is out of bounds [0, " + b().length() + ']');
        }
    }

    public final void M(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f18292f) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("lineIndex(" + i2 + ") is out of bounds [0, " + this.f18292f + ')');
        }
    }

    public final float[] a(long j2, float[] fArr, int i2) {
        K(TextRange.l(j2));
        L(TextRange.k(j2));
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f40906z = i2;
        MultiParagraphKt.d(this.f18294h, j2, new MultiParagraph$fillBoundingBoxes$1(j2, fArr, intRef, new Ref.FloatRef()));
        return fArr;
    }

    public final AnnotatedString b() {
        return this.f18287a.d();
    }

    public final ResolvedTextDirection c(int i2) {
        L(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(i2 == b().length() ? CollectionsKt.o(this.f18294h) : MultiParagraphKt.a(this.f18294h, i2));
        return paragraphInfo.e().u(paragraphInfo.r(i2));
    }

    public final Rect d(int i2) {
        K(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.a(this.f18294h, i2));
        return paragraphInfo.i(paragraphInfo.e().d(paragraphInfo.r(i2)));
    }

    public final Rect e(int i2) {
        L(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(i2 == b().length() ? CollectionsKt.o(this.f18294h) : MultiParagraphKt.a(this.f18294h, i2));
        return paragraphInfo.i(paragraphInfo.e().o(paragraphInfo.r(i2)));
    }

    public final boolean f() {
        return this.f18289c;
    }

    public final float g() {
        if (this.f18294h.isEmpty()) {
            return 0.0f;
        }
        return ((ParagraphInfo) this.f18294h.get(0)).e().s();
    }

    public final float h() {
        return this.f18291e;
    }

    public final float i(int i2, boolean z2) {
        L(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(i2 == b().length() ? CollectionsKt.o(this.f18294h) : MultiParagraphKt.a(this.f18294h, i2));
        return paragraphInfo.e().G(paragraphInfo.r(i2), z2);
    }

    public final MultiParagraphIntrinsics j() {
        return this.f18287a;
    }

    public final float k() {
        if (this.f18294h.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.p0(this.f18294h);
        return paragraphInfo.o(paragraphInfo.e().n());
    }

    public final float l(int i2) {
        M(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.b(this.f18294h, i2));
        return paragraphInfo.o(paragraphInfo.e().v(paragraphInfo.s(i2)));
    }

    public final int m() {
        return this.f18292f;
    }

    public final int n(int i2, boolean z2) {
        M(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.b(this.f18294h, i2));
        return paragraphInfo.m(paragraphInfo.e().A(paragraphInfo.s(i2), z2));
    }

    public final int p(int i2) {
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(i2 >= b().length() ? CollectionsKt.o(this.f18294h) : i2 < 0 ? 0 : MultiParagraphKt.a(this.f18294h, i2));
        return paragraphInfo.n(paragraphInfo.e().r(paragraphInfo.r(i2)));
    }

    public final int q(float f2) {
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.c(this.f18294h, f2));
        return paragraphInfo.d() == 0 ? paragraphInfo.g() : paragraphInfo.n(paragraphInfo.e().E(paragraphInfo.t(f2)));
    }

    public final float r(int i2) {
        M(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.b(this.f18294h, i2));
        return paragraphInfo.e().f(paragraphInfo.s(i2));
    }

    public final float s(int i2) {
        M(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.b(this.f18294h, i2));
        return paragraphInfo.e().h(paragraphInfo.s(i2));
    }

    public final float t(int i2) {
        M(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.b(this.f18294h, i2));
        return paragraphInfo.e().e(paragraphInfo.s(i2));
    }

    public final int u(int i2) {
        M(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.b(this.f18294h, i2));
        return paragraphInfo.m(paragraphInfo.e().z(paragraphInfo.s(i2)));
    }

    public final float v(int i2) {
        M(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.b(this.f18294h, i2));
        return paragraphInfo.o(paragraphInfo.e().m(paragraphInfo.s(i2)));
    }

    public final int w() {
        return this.f18288b;
    }

    public final int x(long j2) {
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(MultiParagraphKt.c(this.f18294h, Float.intBitsToFloat((int) (4294967295L & j2))));
        return paragraphInfo.d() == 0 ? paragraphInfo.f() : paragraphInfo.m(paragraphInfo.e().w(paragraphInfo.q(j2)));
    }

    public final ResolvedTextDirection y(int i2) {
        L(i2);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.f18294h.get(i2 == b().length() ? CollectionsKt.o(this.f18294h) : MultiParagraphKt.a(this.f18294h, i2));
        return paragraphInfo.e().l(paragraphInfo.r(i2));
    }

    public final List z() {
        return this.f18294h;
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, int i3) {
        boolean z2;
        int k2;
        float a2;
        int i4;
        this.f18287a = multiParagraphIntrinsics;
        this.f18288b = i2;
        int i5 = 0;
        if (!(Constraints.n(j2) == 0 && Constraints.m(j2) == 0)) {
            InlineClassHelperKt.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List e2 = multiParagraphIntrinsics.e();
        int size = e2.size();
        int i6 = 0;
        float f2 = 0.0f;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z2 = false;
                break;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) e2.get(i7);
            ParagraphIntrinsics b2 = paragraphIntrinsicInfo.b();
            int l2 = Constraints.l(j2);
            if (Constraints.g(j2)) {
                k2 = RangesKt.e(Constraints.k(j2) - ParagraphKt.d(f2), i5);
            } else {
                k2 = Constraints.k(j2);
            }
            Paragraph c2 = ParagraphKt.c(b2, ConstraintsKt.b(0, l2, 0, k2, 5, (Object) null), this.f18288b - i6, i3);
            a2 = f2 + c2.a();
            int C = i6 + c2.C();
            ParagraphInfo paragraphInfo = r7;
            i4 = C;
            ParagraphInfo paragraphInfo2 = new ParagraphInfo(c2, paragraphIntrinsicInfo.c(), paragraphIntrinsicInfo.a(), i6, C, f2, a2);
            arrayList.add(paragraphInfo);
            if (c2.D() || (i4 == this.f18288b && i7 != CollectionsKt.o(this.f18287a.e()))) {
                i6 = i4;
                f2 = a2;
                z2 = true;
            } else {
                i7++;
                i6 = i4;
                f2 = a2;
                i5 = 0;
            }
        }
        i6 = i4;
        f2 = a2;
        z2 = true;
        this.f18291e = f2;
        this.f18292f = i6;
        this.f18289c = z2;
        this.f18294h = arrayList;
        this.f18290d = (float) Constraints.l(j2);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ParagraphInfo paragraphInfo3 = (ParagraphInfo) arrayList.get(i8);
            List x2 = paragraphInfo3.e().x();
            ArrayList arrayList3 = new ArrayList(x2.size());
            int size3 = x2.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) x2.get(i9);
                arrayList3.add(rect != null ? paragraphInfo3.i(rect) : null);
            }
            CollectionsKt.B(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f18287a.f().size()) {
            int size4 = this.f18287a.f().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList4.add((Object) null);
            }
            arrayList2 = CollectionsKt.x0(arrayList2, arrayList4);
        }
        this.f18293g = arrayList2;
    }
}
