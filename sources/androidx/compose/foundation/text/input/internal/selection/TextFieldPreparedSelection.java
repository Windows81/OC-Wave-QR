package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldPreparedSelection {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f6450k = new Companion((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f6451l = 8;

    /* renamed from: a  reason: collision with root package name */
    public final TransformedTextFieldState f6452a;

    /* renamed from: b  reason: collision with root package name */
    public final TextLayoutResult f6453b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6454c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6455d;

    /* renamed from: e  reason: collision with root package name */
    public final TextFieldPreparedSelectionState f6456e;

    /* renamed from: f  reason: collision with root package name */
    public final TextFieldCharSequence f6457f;

    /* renamed from: g  reason: collision with root package name */
    public final SelectionWedgeAffinity f6458g;

    /* renamed from: h  reason: collision with root package name */
    public long f6459h;

    /* renamed from: i  reason: collision with root package name */
    public WedgeAffinity f6460i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6461j;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: finally extract failed */
    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z2, float f2, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.f6452a = transformedTextFieldState;
        this.f6453b = textLayoutResult;
        this.f6454c = z2;
        this.f6455d = f2;
        this.f6456e = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f3 = companion.f(d2);
        try {
            TextFieldCharSequence o2 = transformedTextFieldState.o();
            this.f6457f = o2;
            this.f6458g = transformedTextFieldState.m();
            Unit unit = Unit.f40552a;
            companion.m(d2, f3, g2);
            this.f6459h = o2.g();
            this.f6461j = o2.h().toString();
        } catch (Throwable th) {
            companion.m(d2, f3, g2);
            throw th;
        }
    }

    public static /* synthetic */ int l(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.k(textFieldPreparedSelection.f6459h);
        }
        return textFieldPreparedSelection.k(textLayoutResult, i2);
    }

    public static /* synthetic */ int n(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.l(textFieldPreparedSelection.f6459h);
        }
        return textFieldPreparedSelection.m(textLayoutResult, i2);
    }

    public static /* synthetic */ int p(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.i(textFieldPreparedSelection.f6459h);
        }
        return textFieldPreparedSelection.o(textLayoutResult, i2);
    }

    public static /* synthetic */ int r(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.i(textFieldPreparedSelection.f6459h);
        }
        return textFieldPreparedSelection.q(textLayoutResult, i2);
    }

    public final TextFieldPreparedSelection A() {
        return u() ? G() : D();
    }

    public final TextFieldPreparedSelection B() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            long a2 = TextPreparedSelectionKt.a(StringHelpers_androidKt.a(this.f6461j, TextRange.i(this.f6459h)), i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection C() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            int a2 = StringHelpersKt.a(this.f6461j, TextRange.k(this.f6459h));
            if (a2 == TextRange.k(this.f6459h) && a2 != this.f6461j.length()) {
                a2 = StringHelpersKt.a(this.f6461j, a2 + 1);
            }
            long a3 = TextPreparedSelectionKt.a(a2, i2, this.f6452a);
            int a4 = CursorAndWedgeAffinity.a(a3);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a3);
            if (a4 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a4));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection D() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            TextLayoutResult textLayoutResult = this.f6453b;
            long a2 = TextPreparedSelectionKt.a(textLayoutResult != null ? p(this, textLayoutResult, 0, 1, (Object) null) : this.f6461j.length(), i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection E() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            long a2 = TextPreparedSelectionKt.a(StringHelpers_androidKt.b(this.f6461j, TextRange.i(this.f6459h)), i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection F() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            int b2 = StringHelpersKt.b(this.f6461j, TextRange.l(this.f6459h));
            if (b2 == TextRange.l(this.f6459h) && b2 != 0) {
                b2 = StringHelpersKt.b(this.f6461j, b2 - 1);
            }
            long a2 = TextPreparedSelectionKt.a(b2, i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b3 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b3 != null) {
                U(b3);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection G() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            TextLayoutResult textLayoutResult = this.f6453b;
            int i3 = 0;
            if (textLayoutResult != null) {
                i3 = r(this, textLayoutResult, 0, 1, (Object) null);
            }
            long a2 = TextPreparedSelectionKt.a(i3, i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection H() {
        return u() ? B() : E();
    }

    public final TextFieldPreparedSelection I() {
        return u() ? D() : G();
    }

    public final TextFieldPreparedSelection J() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            long a2 = TextPreparedSelectionKt.a(this.f6461j.length(), i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection K() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            long a2 = TextPreparedSelectionKt.a(0, i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection L() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            TextLayoutResult textLayoutResult = this.f6453b;
            long a2 = TextPreparedSelectionKt.a(textLayoutResult != null ? l(this, textLayoutResult, 0, 1, (Object) null) : this.f6461j.length(), i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection M() {
        return u() ? O() : L();
    }

    public final TextFieldPreparedSelection N() {
        return u() ? L() : O();
    }

    public final TextFieldPreparedSelection O() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            TextLayoutResult textLayoutResult = this.f6453b;
            int i3 = 0;
            if (textLayoutResult != null) {
                i3 = n(this, textLayoutResult, 0, 1, (Object) null);
            }
            long a2 = TextPreparedSelectionKt.a(i3, i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection P() {
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            TextLayoutResult textLayoutResult = this.f6453b;
            long a2 = TextPreparedSelectionKt.a(textLayoutResult != null ? v(textLayoutResult, -1) : 0, i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection Q() {
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            long a2 = TextPreparedSelectionKt.a(w(-1), i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection R() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            this.f6459h = TextRangeKt.b(0, this.f6461j.length());
        }
        return this;
    }

    public final TextFieldPreparedSelection S() {
        if (this.f6461j.length() > 0) {
            this.f6459h = TextRangeKt.b(TextRange.n(this.f6457f.g()), TextRange.i(this.f6459h));
        }
        return this;
    }

    public final void T(long j2) {
        this.f6459h = j2;
    }

    public final void U(WedgeAffinity wedgeAffinity) {
        this.f6460i = wedgeAffinity;
    }

    public final int d(int i2) {
        return RangesKt.j(i2, this.f6461j.length() - 1);
    }

    public final TextFieldPreparedSelection e(Function1 function1) {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            if (TextRange.h(this.f6459h)) {
                function1.invoke(this);
            } else if (u()) {
                this.f6459h = TextRangeKt.a(TextRange.l(this.f6459h));
            } else {
                this.f6459h = TextRangeKt.a(TextRange.k(this.f6459h));
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection f(Function1 function1) {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            if (TextRange.h(this.f6459h)) {
                function1.invoke(this);
            } else if (u()) {
                this.f6459h = TextRangeKt.a(TextRange.k(this.f6459h));
            } else {
                this.f6459h = TextRangeKt.a(TextRange.l(this.f6459h));
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection g() {
        if (this.f6461j.length() > 0) {
            if (!TextRange.h(this.f6457f.g())) {
                this.f6452a.k();
            } else {
                TransformedTextFieldState.z(this.f6452a, "", TextRangeKt.b(TextRange.n(this.f6457f.g()), TextRange.i(this.f6459h)), (TextFieldEditUndoBehavior) null, !this.f6454c, 4, (Object) null);
            }
            this.f6459h = this.f6452a.o().g();
            this.f6460i = WedgeAffinity.Start;
        }
        return this;
    }

    public final TextFieldPreparedSelection h() {
        this.f6456e.b();
        if (this.f6461j.length() > 0) {
            this.f6459h = TextRangeKt.a(TextRange.i(this.f6459h));
        }
        return this;
    }

    public final TextFieldCharSequence i() {
        return this.f6457f;
    }

    public final SelectionWedgeAffinity j() {
        return this.f6458g;
    }

    public final int k(TextLayoutResult textLayoutResult, int i2) {
        return textLayoutResult.o(textLayoutResult.q(i2), true);
    }

    public final int m(TextLayoutResult textLayoutResult, int i2) {
        return textLayoutResult.u(textLayoutResult.q(i2));
    }

    public final int o(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.f6457f.length()) {
            long C = textLayoutResult.C(d(i2));
            if (TextRange.i(C) > i2) {
                return TextRange.i(C);
            }
            i2++;
        }
        return this.f6457f.length();
    }

    public final int q(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long C = textLayoutResult.C(d(i2));
            if (TextRange.n(C) < i2) {
                return TextRange.n(C);
            }
            i2--;
        }
        return 0;
    }

    public final long s() {
        return this.f6459h;
    }

    public final WedgeAffinity t() {
        return this.f6460i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.y(androidx.compose.ui.text.TextRange.i(r4.f6459h));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u() {
        /*
            r4 = this;
            androidx.compose.ui.text.TextLayoutResult r0 = r4.f6453b
            r1 = 1
            if (r0 == 0) goto L_0x0018
            long r2 = r4.f6459h
            int r2 = androidx.compose.ui.text.TextRange.i(r2)
            androidx.compose.ui.text.style.ResolvedTextDirection r0 = r0.y(r2)
            if (r0 != 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = androidx.compose.ui.text.style.ResolvedTextDirection.Ltr
            if (r0 != r2) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection.u():boolean");
    }

    public final int v(TextLayoutResult textLayoutResult, int i2) {
        int i3 = TextRange.i(this.f6459h);
        if (Float.isNaN(this.f6456e.a())) {
            this.f6456e.c(textLayoutResult.e(i3).o());
        }
        int q2 = textLayoutResult.q(i3) + i2;
        if (q2 < 0) {
            return 0;
        }
        if (q2 >= textLayoutResult.n()) {
            return this.f6461j.length();
        }
        float m2 = textLayoutResult.m(q2) - ((float) 1);
        float a2 = this.f6456e.a();
        return ((!u() || a2 < textLayoutResult.t(q2)) && (u() || a2 > textLayoutResult.s(q2))) ? textLayoutResult.x(Offset.e((((long) Float.floatToRawIntBits(a2)) << 32) | (((long) Float.floatToRawIntBits(m2)) & 4294967295L))) : textLayoutResult.o(q2, true);
    }

    public final int w(int i2) {
        int i3 = TextRange.i(this.f6457f.g());
        if (this.f6453b == null || Float.isNaN(this.f6455d)) {
            return i3;
        }
        Rect A2 = this.f6453b.e(i3).A(0.0f, this.f6455d * ((float) i2));
        float m2 = this.f6453b.m(this.f6453b.r(A2.r()));
        return Math.abs(A2.r() - m2) > Math.abs(A2.i() - m2) ? this.f6453b.x(A2.t()) : this.f6453b.x(A2.k());
    }

    public final TextFieldPreparedSelection x() {
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            TextLayoutResult textLayoutResult = this.f6453b;
            long a2 = TextPreparedSelectionKt.a(textLayoutResult != null ? v(textLayoutResult, 1) : this.f6461j.length(), i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection y() {
        if (this.f6461j.length() > 0) {
            int i2 = TextRange.i(s());
            long a2 = TextPreparedSelectionKt.a(w(1), i2, this.f6452a);
            int a3 = CursorAndWedgeAffinity.a(a2);
            WedgeAffinity b2 = CursorAndWedgeAffinity.b(a2);
            if (a3 != i2 || !TextRange.h(s())) {
                T(TextRangeKt.a(a3));
            }
            if (b2 != null) {
                U(b2);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection z() {
        return u() ? E() : B();
    }
}
