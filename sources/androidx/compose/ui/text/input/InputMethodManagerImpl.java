package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata
@Deprecated
public final class InputMethodManagerImpl implements InputMethodManager {

    /* renamed from: a  reason: collision with root package name */
    public final View f18841a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f18842b = LazyKt.a(LazyThreadSafetyMode.NONE, new InputMethodManagerImpl$imm$2(this));

    /* renamed from: c  reason: collision with root package name */
    public final SoftwareKeyboardControllerCompat f18843c;

    public InputMethodManagerImpl(View view) {
        this.f18841a = view;
        this.f18843c = new SoftwareKeyboardControllerCompat(view);
    }

    public void a(int i2, int i3, int i4, int i5) {
        i().updateSelection(this.f18841a, i2, i3, i4, i5);
    }

    public boolean b() {
        return i().isActive(this.f18841a);
    }

    public void c() {
        i().restartInput(this.f18841a);
    }

    public void d(CursorAnchorInfo cursorAnchorInfo) {
        i().updateCursorAnchorInfo(this.f18841a, cursorAnchorInfo);
    }

    public void e(int i2, ExtractedText extractedText) {
        i().updateExtractedText(this.f18841a, i2, extractedText);
    }

    public void f() {
        this.f18843c.a();
    }

    public void g() {
        this.f18843c.b();
    }

    public final InputMethodManager i() {
        return (InputMethodManager) this.f18842b.getValue();
    }
}
