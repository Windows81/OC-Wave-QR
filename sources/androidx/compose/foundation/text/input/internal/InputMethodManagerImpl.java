package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata
public final class InputMethodManagerImpl implements InputMethodManager {

    /* renamed from: a  reason: collision with root package name */
    public final View f6214a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f6215b = LazyKt.a(LazyThreadSafetyMode.NONE, new InputMethodManagerImpl$imm$2(this));

    /* renamed from: c  reason: collision with root package name */
    public final SoftwareKeyboardControllerCompat f6216c;

    public InputMethodManagerImpl(View view) {
        this.f6214a = view;
        this.f6216c = new SoftwareKeyboardControllerCompat(view);
    }

    public void a(int i2, int i3, int i4, int i5) {
        h().updateSelection(this.f6214a, i2, i3, i4, i5);
    }

    public boolean b() {
        return h().isActive(this.f6214a);
    }

    public void c() {
        h().restartInput(this.f6214a);
    }

    public void d(CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.f6214a, cursorAnchorInfo);
    }

    public void e(int i2, ExtractedText extractedText) {
        h().updateExtractedText(this.f6214a, i2, extractedText);
    }

    public void f() {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34StartStylusHandwriting.f6126a.a(h(), this.f6214a);
        }
    }

    public final InputMethodManager h() {
        return (InputMethodManager) this.f6215b.getValue();
    }
}
