package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;

/* renamed from: androidx.compose.foundation.text.input.internal.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0013b implements TextFieldState.NotifyImeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComposeInputMethodManager f6425a;

    public /* synthetic */ C0013b(ComposeInputMethodManager composeInputMethodManager) {
        this.f6425a = composeInputMethodManager;
    }

    public final void a(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1.C(this.f6425a, textFieldCharSequence, textFieldCharSequence2, z2);
    }
}
