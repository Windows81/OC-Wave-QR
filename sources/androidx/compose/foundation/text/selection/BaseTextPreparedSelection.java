package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f6725h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f6726i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f6727a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6728b;

    /* renamed from: c  reason: collision with root package name */
    public final TextLayoutResult f6729c;

    /* renamed from: d  reason: collision with root package name */
    public final OffsetMapping f6730d;

    /* renamed from: e  reason: collision with root package name */
    public final TextPreparedSelectionState f6731e;

    /* renamed from: f  reason: collision with root package name */
    public long f6732f;

    /* renamed from: g  reason: collision with root package name */
    public AnnotatedString f6733g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ int h(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = baseTextPreparedSelection.W();
            }
            return baseTextPreparedSelection.g(textLayoutResult, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    public static /* synthetic */ int k(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = baseTextPreparedSelection.X();
            }
            return baseTextPreparedSelection.j(textLayoutResult, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    public static /* synthetic */ int o(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = baseTextPreparedSelection.V();
            }
            return baseTextPreparedSelection.n(textLayoutResult, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    public static /* synthetic */ int s(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = baseTextPreparedSelection.V();
            }
            return baseTextPreparedSelection.r(textLayoutResult, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    public final BaseTextPreparedSelection A() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection B() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection C() {
        int l2;
        v().b();
        if (w().length() > 0 && (l2 = l()) != -1) {
            T(l2);
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection D() {
        v().b();
        if (w().length() > 0) {
            int a2 = StringHelpersKt.a(w(), TextRange.k(this.f6732f));
            if (a2 == TextRange.k(this.f6732f) && a2 != w().length()) {
                a2 = StringHelpersKt.a(w(), a2 + 1);
            }
            T(a2);
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection E() {
        Integer m2;
        v().b();
        if (w().length() > 0 && (m2 = m()) != null) {
            T(m2.intValue());
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection F() {
        int q2;
        v().b();
        if (w().length() > 0 && (q2 = q()) != -1) {
            T(q2);
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection G() {
        v().b();
        if (w().length() > 0) {
            int b2 = StringHelpersKt.b(w(), TextRange.l(this.f6732f));
            if (b2 == TextRange.l(this.f6732f) && b2 != 0) {
                b2 = StringHelpersKt.b(w(), b2 - 1);
            }
            T(b2);
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection H() {
        Integer t2;
        v().b();
        if (w().length() > 0 && (t2 = t()) != null) {
            T(t2.intValue());
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection I() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection J() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection K() {
        v().b();
        if (w().length() > 0) {
            T(w().length());
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection L() {
        v().b();
        if (w().length() > 0) {
            T(0);
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection M() {
        Integer f2;
        v().b();
        if (w().length() > 0 && (f2 = f()) != null) {
            T(f2.intValue());
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection N() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection O() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection P() {
        Integer i2;
        v().b();
        if (w().length() > 0 && (i2 = i()) != null) {
            T(i2.intValue());
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection Q() {
        TextLayoutResult textLayoutResult;
        if (w().length() > 0 && (textLayoutResult = this.f6729c) != null) {
            T(y(textLayoutResult, -1));
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection R() {
        v().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection S() {
        if (w().length() > 0) {
            this.f6732f = TextRangeKt.b(TextRange.n(this.f6728b), TextRange.i(this.f6732f));
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void T(int i2) {
        U(i2, i2);
    }

    public final void U(int i2, int i3) {
        this.f6732f = TextRangeKt.b(i2, i3);
    }

    public final int V() {
        return this.f6730d.b(TextRange.i(this.f6732f));
    }

    public final int W() {
        return this.f6730d.b(TextRange.k(this.f6732f));
    }

    public final int X() {
        return this.f6730d.b(TextRange.l(this.f6732f));
    }

    public final int a(int i2) {
        return RangesKt.j(i2, w().length() - 1);
    }

    public final BaseTextPreparedSelection b(Function1 function1) {
        v().b();
        if (w().length() > 0) {
            if (TextRange.h(this.f6732f)) {
                Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                function1.invoke(this);
            } else if (x()) {
                T(TextRange.l(this.f6732f));
            } else {
                T(TextRange.k(this.f6732f));
            }
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection c(Function1 function1) {
        v().b();
        if (w().length() > 0) {
            if (TextRange.h(this.f6732f)) {
                Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                function1.invoke(this);
            } else if (x()) {
                T(TextRange.k(this.f6732f));
            } else {
                T(TextRange.l(this.f6732f));
            }
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final BaseTextPreparedSelection d() {
        v().b();
        if (w().length() > 0) {
            T(TextRange.i(this.f6732f));
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AnnotatedString e() {
        return this.f6733g;
    }

    public final Integer f() {
        TextLayoutResult textLayoutResult = this.f6729c;
        if (textLayoutResult != null) {
            return Integer.valueOf(h(this, textLayoutResult, 0, 1, (Object) null));
        }
        return null;
    }

    public final int g(TextLayoutResult textLayoutResult, int i2) {
        return this.f6730d.a(textLayoutResult.o(textLayoutResult.q(i2), true));
    }

    public final Integer i() {
        TextLayoutResult textLayoutResult = this.f6729c;
        if (textLayoutResult != null) {
            return Integer.valueOf(k(this, textLayoutResult, 0, 1, (Object) null));
        }
        return null;
    }

    public final int j(TextLayoutResult textLayoutResult, int i2) {
        return this.f6730d.a(textLayoutResult.u(textLayoutResult.q(i2)));
    }

    public final int l() {
        return StringHelpers_androidKt.a(this.f6733g.k(), TextRange.i(this.f6732f));
    }

    public final Integer m() {
        TextLayoutResult textLayoutResult = this.f6729c;
        if (textLayoutResult != null) {
            return Integer.valueOf(o(this, textLayoutResult, 0, 1, (Object) null));
        }
        return null;
    }

    public final int n(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.f6727a.length()) {
            long C = textLayoutResult.C(a(i2));
            if (TextRange.i(C) > i2) {
                return this.f6730d.a(TextRange.i(C));
            }
            i2++;
        }
        return this.f6727a.length();
    }

    public final OffsetMapping p() {
        return this.f6730d;
    }

    public final int q() {
        return StringHelpers_androidKt.b(this.f6733g.k(), TextRange.i(this.f6732f));
    }

    public final int r(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long C = textLayoutResult.C(a(i2));
            if (TextRange.n(C) < i2) {
                return this.f6730d.a(TextRange.n(C));
            }
            i2--;
        }
        return 0;
    }

    public final Integer t() {
        TextLayoutResult textLayoutResult = this.f6729c;
        if (textLayoutResult != null) {
            return Integer.valueOf(s(this, textLayoutResult, 0, 1, (Object) null));
        }
        return null;
    }

    public final long u() {
        return this.f6732f;
    }

    public final TextPreparedSelectionState v() {
        return this.f6731e;
    }

    public final String w() {
        return this.f6733g.k();
    }

    public final boolean x() {
        TextLayoutResult textLayoutResult = this.f6729c;
        return (textLayoutResult != null ? textLayoutResult.y(V()) : null) != ResolvedTextDirection.Rtl;
    }

    public final int y(TextLayoutResult textLayoutResult, int i2) {
        int V = V();
        if (this.f6731e.a() == null) {
            this.f6731e.c(Float.valueOf(textLayoutResult.e(V).o()));
        }
        int q2 = textLayoutResult.q(V) + i2;
        if (q2 < 0) {
            return 0;
        }
        if (q2 >= textLayoutResult.n()) {
            return w().length();
        }
        float m2 = textLayoutResult.m(q2) - ((float) 1);
        Float a2 = this.f6731e.a();
        Intrinsics.f(a2);
        float floatValue = a2.floatValue();
        if ((x() && floatValue >= textLayoutResult.t(q2)) || (!x() && floatValue <= textLayoutResult.s(q2))) {
            return textLayoutResult.o(q2, true);
        }
        return this.f6730d.a(textLayoutResult.x(Offset.e((((long) Float.floatToRawIntBits(a2.floatValue())) << 32) | (((long) Float.floatToRawIntBits(m2)) & 4294967295L))));
    }

    public final BaseTextPreparedSelection z() {
        TextLayoutResult textLayoutResult;
        if (w().length() > 0 && (textLayoutResult = this.f6729c) != null) {
            T(y(textLayoutResult, 1));
        }
        Intrinsics.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.f6727a = annotatedString;
        this.f6728b = j2;
        this.f6729c = textLayoutResult;
        this.f6730d = offsetMapping;
        this.f6731e = textPreparedSelectionState;
        this.f6732f = j2;
        this.f6733g = annotatedString;
    }
}
