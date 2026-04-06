package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;

public final /* synthetic */ class f0 implements TextFieldState.NotifyImeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldState.NotifyImeListener f6432a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6433b;

    public /* synthetic */ f0(TextFieldState.NotifyImeListener notifyImeListener, TransformedTextFieldState transformedTextFieldState) {
        this.f6432a = notifyImeListener;
        this.f6433b = transformedTextFieldState;
    }

    public final void a(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
        TransformedTextFieldState.j(this.f6432a, this.f6433b, textFieldCharSequence, textFieldCharSequence2, z2);
    }
}
