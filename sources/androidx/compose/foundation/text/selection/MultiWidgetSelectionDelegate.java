package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class MultiWidgetSelectionDelegate implements Selectable {

    /* renamed from: a  reason: collision with root package name */
    public final long f6763a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f6764b;

    /* renamed from: c  reason: collision with root package name */
    public final Function0 f6765c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f6766d = this;

    /* renamed from: e  reason: collision with root package name */
    public TextLayoutResult f6767e;

    /* renamed from: f  reason: collision with root package name */
    public int f6768f = -1;

    public MultiWidgetSelectionDelegate(long j2, Function0 function0, Function0 function02) {
        this.f6763a = j2;
        this.f6764b = function0;
        this.f6765c = function02;
    }

    public LayoutCoordinates N() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f6764b.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.b()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final int a(TextLayoutResult textLayoutResult) {
        int i2;
        int i3;
        synchronized (this.f6766d) {
            try {
                if (this.f6767e != textLayoutResult) {
                    if (textLayoutResult.f()) {
                        if (!textLayoutResult.w().f()) {
                            int j2 = RangesKt.j(textLayoutResult.r((float) ((int) (textLayoutResult.B() & 4294967295L))), textLayoutResult.n() - 1);
                            while (j2 >= 0 && textLayoutResult.v(j2) >= ((float) ((int) (textLayoutResult.B() & 4294967295L)))) {
                                j2--;
                            }
                            i3 = RangesKt.e(j2, 0);
                            this.f6768f = textLayoutResult.o(i3, true);
                            this.f6767e = textLayoutResult;
                        }
                    }
                    i3 = textLayoutResult.n() - 1;
                    this.f6768f = textLayoutResult.o(i3, true);
                    this.f6767e = textLayoutResult;
                }
                i2 = this.f6768f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public AnnotatedString b() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        return textLayoutResult == null ? new AnnotatedString("", (List) null, 2, (DefaultConstructorMarker) null) : textLayoutResult.l().j();
    }

    public Rect d(int i2) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult == null) {
            return Rect.f15860e.a();
        }
        int length = textLayoutResult.l().j().length();
        return length < 1 ? Rect.f15860e.a() : textLayoutResult.d(RangesKt.o(i2, 0, length - 1));
    }

    public float e(int i2) {
        int q2;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult != null && (q2 = textLayoutResult.q(i2)) < textLayoutResult.n()) {
            return textLayoutResult.t(q2);
        }
        return -1.0f;
    }

    public float f(int i2) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult != null) {
            return TextLayoutHelperKt.b(textLayoutResult, i2);
        }
        return 0.0f;
    }

    public float h(int i2) {
        int q2;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult != null && (q2 = textLayoutResult.q(i2)) < textLayoutResult.n()) {
            return textLayoutResult.s(q2);
        }
        return -1.0f;
    }

    public int i() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return a(textLayoutResult);
    }

    public float j(int i2) {
        int q2;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult == null || (q2 = textLayoutResult.q(i2)) >= textLayoutResult.n()) {
            return -1.0f;
        }
        float v2 = textLayoutResult.v(q2);
        return ((textLayoutResult.m(q2) - v2) / ((float) 2)) + v2;
    }

    public long k() {
        return this.f6763a;
    }

    public Selection l() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        int length = textLayoutResult.l().j().length();
        return new Selection(new Selection.AnchorInfo(textLayoutResult.c(0), 0, k()), new Selection.AnchorInfo(textLayoutResult.c(Math.max(length - 1, 0)), length, k()), false);
    }

    public void m(SelectionLayoutBuilder selectionLayoutBuilder) {
        TextLayoutResult textLayoutResult;
        LayoutCoordinates N = N();
        if (N != null && (textLayoutResult = (TextLayoutResult) this.f6765c.invoke()) != null) {
            LayoutCoordinates c2 = selectionLayoutBuilder.c();
            Offset.Companion companion = Offset.f15855b;
            long N2 = c2.N(N, companion.c());
            MultiWidgetSelectionDelegateKt.a(selectionLayoutBuilder, textLayoutResult, Offset.p(selectionLayoutBuilder.d(), N2), (selectionLayoutBuilder.e() & 9223372034707292159L) == 9205357640488583168L ? companion.b() : Offset.p(selectionLayoutBuilder.e(), N2), k());
        }
    }

    public long n(int i2) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult == null) {
            return TextRange.f18496b.a();
        }
        int a2 = a(textLayoutResult);
        if (a2 < 1) {
            return TextRange.f18496b.a();
        }
        int q2 = textLayoutResult.q(RangesKt.o(i2, 0, a2 - 1));
        return TextRangeKt.b(textLayoutResult.u(q2), textLayoutResult.o(q2, true));
    }

    public long o(Selection selection, boolean z2) {
        if ((z2 && selection.e().e() != k()) || (!z2 && selection.c().e() != k())) {
            return Offset.f15855b.b();
        }
        if (N() == null) {
            return Offset.f15855b.b();
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f6765c.invoke();
        if (textLayoutResult == null) {
            return Offset.f15855b.b();
        }
        return TextSelectionDelegateKt.b(textLayoutResult, RangesKt.o((z2 ? selection.e() : selection.c()).d(), 0, a(textLayoutResult)), z2, selection.d());
    }
}
