package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

public final /* synthetic */ class d0 implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6430a;

    public /* synthetic */ d0(TextFieldSelectionManager textFieldSelectionManager) {
        this.f6430a = textFieldSelectionManager;
    }

    public final void onCancel() {
        HandwritingGestureApi34.G(this.f6430a);
    }
}
