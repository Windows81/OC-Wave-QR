package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;

public final /* synthetic */ class e0 implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6431a;

    public /* synthetic */ e0(TransformedTextFieldState transformedTextFieldState) {
        this.f6431a = transformedTextFieldState;
    }

    public final void onCancel() {
        HandwritingGestureApi34.F(this.f6431a);
    }
}
