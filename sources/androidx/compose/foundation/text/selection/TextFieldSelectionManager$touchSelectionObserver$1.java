package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldSelectionManager$touchSelectionObserver$1 implements TextDragObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7004a;

    public TextFieldSelectionManager$touchSelectionObserver$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.f7004a = textFieldSelectionManager;
    }

    public final void a() {
        this.f7004a.f0((Handle) null);
        this.f7004a.d0((Offset) null);
        boolean z2 = true;
        this.f7004a.u0(true);
        this.f7004a.f6985p = null;
        boolean h2 = TextRange.h(this.f7004a.U().h());
        this.f7004a.j0(h2 ? HandleState.Cursor : HandleState.Selection);
        LegacyTextFieldState P = this.f7004a.P();
        if (P != null) {
            P.Q(!h2 && TextFieldSelectionManagerKt.c(this.f7004a, true));
        }
        LegacyTextFieldState P2 = this.f7004a.P();
        if (P2 != null) {
            P2.P(!h2 && TextFieldSelectionManagerKt.c(this.f7004a, false));
        }
        LegacyTextFieldState P3 = this.f7004a.P();
        if (P3 != null) {
            if (!h2 || !TextFieldSelectionManagerKt.c(this.f7004a, true)) {
                z2 = false;
            }
            P3.N(z2);
        }
    }

    public void l() {
        a();
    }

    public void m(long j2) {
    }

    public void n(long j2) {
        TextLayoutResultProxy l2;
        TextLayoutResultProxy l3;
        if (this.f7004a.H() && this.f7004a.F() == null) {
            this.f7004a.f0(Handle.SelectionEnd);
            this.f7004a.f6989t = -1;
            this.f7004a.X();
            LegacyTextFieldState P = this.f7004a.P();
            if (P == null || (l3 = P.l()) == null || !l3.g(j2)) {
                LegacyTextFieldState P2 = this.f7004a.P();
                if (!(P2 == null || (l2 = P2.l()) == null)) {
                    TextFieldSelectionManager textFieldSelectionManager = this.f7004a;
                    int a2 = textFieldSelectionManager.N().a(TextLayoutResultProxy.e(l2, j2, false, 2, (Object) null));
                    TextFieldValue a3 = textFieldSelectionManager.s(textFieldSelectionManager.U().f(), TextRangeKt.b(a2, a2));
                    textFieldSelectionManager.x(false);
                    HapticFeedback L = textFieldSelectionManager.L();
                    if (L != null) {
                        L.a(HapticFeedbackType.f16726b.i());
                    }
                    textFieldSelectionManager.O().invoke(a3);
                }
            } else if (this.f7004a.U().i().length() != 0) {
                this.f7004a.x(false);
                TextFieldSelectionManager textFieldSelectionManager2 = this.f7004a;
                this.f7004a.f6985p = Integer.valueOf(TextRange.n(textFieldSelectionManager2.v0(TextFieldValue.d(textFieldSelectionManager2.U(), (AnnotatedString) null, TextRange.f18496b.a(), (TextRange) null, 5, (Object) null), j2, true, false, SelectionAdjustment.f6782a.o(), true)));
            } else {
                return;
            }
            this.f7004a.j0(HandleState.None);
            this.f7004a.f6984o = j2;
            TextFieldSelectionManager textFieldSelectionManager3 = this.f7004a;
            textFieldSelectionManager3.d0(Offset.d(textFieldSelectionManager3.f6984o));
            this.f7004a.f6986q = Offset.f15855b.c();
        }
    }

    public void o() {
    }

    public void onCancel() {
        a();
    }

    public void p(long j2) {
        TextLayoutResultProxy l2;
        long j3;
        if (this.f7004a.H() && this.f7004a.U().i().length() != 0) {
            TextFieldSelectionManager textFieldSelectionManager = this.f7004a;
            textFieldSelectionManager.f6986q = Offset.q(textFieldSelectionManager.f6986q, j2);
            LegacyTextFieldState P = this.f7004a.P();
            if (!(P == null || (l2 = P.l()) == null)) {
                TextFieldSelectionManager textFieldSelectionManager2 = this.f7004a;
                textFieldSelectionManager2.d0(Offset.d(Offset.q(textFieldSelectionManager2.f6984o, textFieldSelectionManager2.f6986q)));
                if (textFieldSelectionManager2.f6985p == null) {
                    Offset D = textFieldSelectionManager2.D();
                    Intrinsics.f(D);
                    if (!l2.g(D.t())) {
                        int a2 = textFieldSelectionManager2.N().a(TextLayoutResultProxy.e(l2, textFieldSelectionManager2.f6984o, false, 2, (Object) null));
                        OffsetMapping N = textFieldSelectionManager2.N();
                        Offset D2 = textFieldSelectionManager2.D();
                        Intrinsics.f(D2);
                        SelectionAdjustment m2 = a2 == N.a(TextLayoutResultProxy.e(l2, D2.t(), false, 2, (Object) null)) ? SelectionAdjustment.f6782a.m() : SelectionAdjustment.f6782a.o();
                        TextFieldValue U = textFieldSelectionManager2.U();
                        Offset D3 = textFieldSelectionManager2.D();
                        Intrinsics.f(D3);
                        j3 = textFieldSelectionManager2.v0(U, D3.t(), false, false, m2, true);
                        TextRange.b(j3);
                    }
                }
                Integer c2 = textFieldSelectionManager2.f6985p;
                int intValue = c2 != null ? c2.intValue() : l2.d(textFieldSelectionManager2.f6984o, false);
                Offset D4 = textFieldSelectionManager2.D();
                Intrinsics.f(D4);
                int d2 = l2.d(D4.t(), false);
                if (textFieldSelectionManager2.f6985p != null || intValue != d2) {
                    TextFieldValue U2 = textFieldSelectionManager2.U();
                    Offset D5 = textFieldSelectionManager2.D();
                    Intrinsics.f(D5);
                    j3 = textFieldSelectionManager2.v0(U2, D5.t(), false, false, SelectionAdjustment.f6782a.o(), true);
                    TextRange.b(j3);
                } else {
                    return;
                }
            }
            this.f7004a.u0(false);
        }
    }
}
