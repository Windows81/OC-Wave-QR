package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class KeyboardActionRunner implements KeyboardActionScope {

    /* renamed from: a  reason: collision with root package name */
    public final SoftwareKeyboardController f5760a;

    /* renamed from: b  reason: collision with root package name */
    public KeyboardActions f5761b;

    /* renamed from: c  reason: collision with root package name */
    public FocusManager f5762c;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.f5760a = softwareKeyboardController;
    }

    public void a(int i2) {
        ImeAction.Companion companion = ImeAction.f18821b;
        if (ImeAction.m(i2, companion.d())) {
            b().p(FocusDirection.f15729b.e());
        } else if (ImeAction.m(i2, companion.f())) {
            b().p(FocusDirection.f15729b.f());
        } else if (ImeAction.m(i2, companion.b())) {
            SoftwareKeyboardController softwareKeyboardController = this.f5760a;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.a();
            }
        } else {
            boolean z2 = true;
            if (!(ImeAction.m(i2, companion.c()) ? true : ImeAction.m(i2, companion.g()) ? true : ImeAction.m(i2, companion.h()))) {
                z2 = ImeAction.m(i2, companion.a());
            }
            if (!z2) {
                ImeAction.m(i2, companion.e());
            }
        }
    }

    public final FocusManager b() {
        FocusManager focusManager = this.f5762c;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.y("focusManager");
        return null;
    }

    public final KeyboardActions c() {
        KeyboardActions keyboardActions = this.f5761b;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.y("keyboardActions");
        return null;
    }

    public final void d(int i2) {
        Function1 function1;
        ImeAction.Companion companion = ImeAction.f18821b;
        Unit unit = null;
        if (ImeAction.m(i2, companion.b())) {
            function1 = c().b();
        } else if (ImeAction.m(i2, companion.c())) {
            function1 = c().c();
        } else if (ImeAction.m(i2, companion.d())) {
            function1 = c().d();
        } else if (ImeAction.m(i2, companion.f())) {
            function1 = c().e();
        } else if (ImeAction.m(i2, companion.g())) {
            function1 = c().f();
        } else if (ImeAction.m(i2, companion.h())) {
            function1 = c().g();
        } else {
            if (ImeAction.m(i2, companion.a()) ? true : ImeAction.m(i2, companion.e())) {
                function1 = null;
            } else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        if (function1 != null) {
            function1.invoke(this);
            unit = Unit.f40552a;
        }
        if (unit == null) {
            a(i2);
        }
    }

    public final void e(FocusManager focusManager) {
        this.f5762c = focusManager;
    }

    public final void f(KeyboardActions keyboardActions) {
        this.f5761b = keyboardActions;
    }
}
