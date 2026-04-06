package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;

@Metadata
public final class TextFieldSelectionManager$mouseSelectionObserver$1 implements MouseSelectionObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6997a;

    public TextFieldSelectionManager$mouseSelectionObserver$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.f6997a = textFieldSelectionManager;
    }

    public boolean a(long j2) {
        LegacyTextFieldState P;
        if (!this.f6997a.H() || this.f6997a.U().i().length() == 0 || (P = this.f6997a.P()) == null || P.l() == null) {
            return false;
        }
        f(this.f6997a.U(), j2, false, SelectionAdjustment.f6782a.m());
        return true;
    }

    public boolean b(long j2, SelectionAdjustment selectionAdjustment) {
        LegacyTextFieldState P;
        if (!this.f6997a.H() || this.f6997a.U().i().length() == 0 || (P = this.f6997a.P()) == null || P.l() == null) {
            return false;
        }
        FocusRequester I = this.f6997a.I();
        if (I != null) {
            FocusRequester.i(I, 0, 1, (Object) null);
        }
        this.f6997a.f6984o = j2;
        this.f6997a.f6989t = -1;
        TextFieldSelectionManager.y(this.f6997a, false, 1, (Object) null);
        f(this.f6997a.U(), this.f6997a.f6984o, true, selectionAdjustment);
        return true;
    }

    public void c() {
    }

    public boolean d(long j2, SelectionAdjustment selectionAdjustment) {
        LegacyTextFieldState P;
        if (!this.f6997a.H() || this.f6997a.U().i().length() == 0 || (P = this.f6997a.P()) == null || P.l() == null) {
            return false;
        }
        f(this.f6997a.U(), j2, false, selectionAdjustment);
        return true;
    }

    public boolean e(long j2) {
        LegacyTextFieldState P = this.f6997a.P();
        if (P == null || P.l() == null || !this.f6997a.H()) {
            return false;
        }
        this.f6997a.f6989t = -1;
        f(this.f6997a.U(), j2, false, SelectionAdjustment.f6782a.m());
        return true;
    }

    public final void f(TextFieldValue textFieldValue, long j2, boolean z2, SelectionAdjustment selectionAdjustment) {
        this.f6997a.j0(TextRange.h(this.f6997a.v0(textFieldValue, j2, z2, false, selectionAdjustment, false)) ? HandleState.Cursor : HandleState.Selection);
    }
}
