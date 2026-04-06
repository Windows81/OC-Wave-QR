package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;

@Metadata
public final class Api34StartStylusHandwriting {

    /* renamed from: a  reason: collision with root package name */
    public static final Api34StartStylusHandwriting f6126a = new Api34StartStylusHandwriting();

    public final void a(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
