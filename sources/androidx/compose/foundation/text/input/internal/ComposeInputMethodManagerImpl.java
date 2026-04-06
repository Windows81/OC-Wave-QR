package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {

    /* renamed from: a  reason: collision with root package name */
    public final View f6135a;

    /* renamed from: b  reason: collision with root package name */
    public InputMethodManager f6136b;

    /* renamed from: c  reason: collision with root package name */
    public final SoftwareKeyboardControllerCompat f6137c;

    public ComposeInputMethodManagerImpl(View view) {
        this.f6135a = view;
        this.f6137c = new SoftwareKeyboardControllerCompat(view);
    }

    public void a(int i2, int i3, int i4, int i5) {
        i().updateSelection(this.f6135a, i2, i3, i4, i5);
    }

    public final InputMethodManager b() {
        Object systemService = this.f6135a.getContext().getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    public void c() {
        i().restartInput(this.f6135a);
    }

    public void d(CursorAnchorInfo cursorAnchorInfo) {
        i().updateCursorAnchorInfo(this.f6135a, cursorAnchorInfo);
    }

    public final View e() {
        return this.f6135a;
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public final InputMethodManager i() {
        InputMethodManager inputMethodManager = this.f6136b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager b2 = b();
        this.f6136b = b2;
        return b2;
    }
}
