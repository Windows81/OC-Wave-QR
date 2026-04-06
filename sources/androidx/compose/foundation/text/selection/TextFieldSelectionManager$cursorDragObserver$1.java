package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldSelectionManager$cursorDragObserver$1 implements TextDragObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6994a;

    public TextFieldSelectionManager$cursorDragObserver$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.f6994a = textFieldSelectionManager;
    }

    public void l() {
        this.f6994a.f0((Handle) null);
        this.f6994a.d0((Offset) null);
    }

    public void m(long j2) {
    }

    public void n(long j2) {
        TextLayoutResultProxy l2;
        long a2 = SelectionHandlesKt.a(this.f6994a.K(true));
        LegacyTextFieldState P = this.f6994a.P();
        if (P != null && (l2 = P.l()) != null) {
            long k2 = l2.k(a2);
            this.f6994a.f6984o = k2;
            this.f6994a.d0(Offset.d(k2));
            this.f6994a.f6986q = Offset.f15855b.c();
            this.f6994a.f0(Handle.Cursor);
            this.f6994a.u0(false);
        }
    }

    public void o() {
        this.f6994a.f0((Handle) null);
        this.f6994a.d0((Offset) null);
    }

    public void onCancel() {
    }

    public void p(long j2) {
        TextLayoutResultProxy l2;
        HapticFeedback L;
        TextFieldSelectionManager textFieldSelectionManager = this.f6994a;
        textFieldSelectionManager.f6986q = Offset.q(textFieldSelectionManager.f6986q, j2);
        LegacyTextFieldState P = this.f6994a.P();
        if (P != null && (l2 = P.l()) != null) {
            TextFieldSelectionManager textFieldSelectionManager2 = this.f6994a;
            textFieldSelectionManager2.d0(Offset.d(Offset.q(textFieldSelectionManager2.f6984o, textFieldSelectionManager2.f6986q)));
            OffsetMapping N = textFieldSelectionManager2.N();
            Offset D = textFieldSelectionManager2.D();
            Intrinsics.f(D);
            int a2 = N.a(TextLayoutResultProxy.e(l2, D.t(), false, 2, (Object) null));
            long b2 = TextRangeKt.b(a2, a2);
            if (!TextRange.g(b2, textFieldSelectionManager2.U().h())) {
                LegacyTextFieldState P2 = textFieldSelectionManager2.P();
                if ((P2 == null || P2.A()) && (L = textFieldSelectionManager2.L()) != null) {
                    L.a(HapticFeedbackType.f16726b.i());
                }
                textFieldSelectionManager2.O().invoke(textFieldSelectionManager2.s(textFieldSelectionManager2.U().f(), b2));
            }
        }
    }
}
