package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldSelectionManager$handleDragObserver$1 implements TextDragObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6995a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6996b;

    public TextFieldSelectionManager$handleDragObserver$1(TextFieldSelectionManager textFieldSelectionManager, boolean z2) {
        this.f6995a = textFieldSelectionManager;
        this.f6996b = z2;
    }

    public void l() {
        this.f6995a.f0((Handle) null);
        this.f6995a.d0((Offset) null);
        this.f6995a.u0(true);
    }

    public void m(long j2) {
        TextLayoutResultProxy l2;
        this.f6995a.f0(this.f6996b ? Handle.SelectionStart : Handle.SelectionEnd);
        long a2 = SelectionHandlesKt.a(this.f6995a.K(this.f6996b));
        LegacyTextFieldState P = this.f6995a.P();
        if (P != null && (l2 = P.l()) != null) {
            long k2 = l2.k(a2);
            this.f6995a.f6984o = k2;
            this.f6995a.d0(Offset.d(k2));
            this.f6995a.f6986q = Offset.f15855b.c();
            this.f6995a.f6989t = -1;
            LegacyTextFieldState P2 = this.f6995a.P();
            if (P2 != null) {
                P2.G(true);
            }
            this.f6995a.u0(false);
        }
    }

    public void n(long j2) {
    }

    public void o() {
        this.f6995a.f0((Handle) null);
        this.f6995a.d0((Offset) null);
        this.f6995a.u0(true);
    }

    public void onCancel() {
    }

    public void p(long j2) {
        TextFieldSelectionManager textFieldSelectionManager = this.f6995a;
        textFieldSelectionManager.f6986q = Offset.q(textFieldSelectionManager.f6986q, j2);
        TextFieldSelectionManager textFieldSelectionManager2 = this.f6995a;
        textFieldSelectionManager2.d0(Offset.d(Offset.q(textFieldSelectionManager2.f6984o, this.f6995a.f6986q)));
        TextFieldSelectionManager textFieldSelectionManager3 = this.f6995a;
        TextFieldValue U = textFieldSelectionManager3.U();
        Offset D = this.f6995a.D();
        Intrinsics.f(D);
        long unused = textFieldSelectionManager3.v0(U, D.t(), false, this.f6996b, SelectionAdjustment.f6782a.l(), true);
        this.f6995a.u0(false);
    }
}
