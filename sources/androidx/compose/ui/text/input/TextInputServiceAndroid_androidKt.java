package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata
public final class TextInputServiceAndroid_androidKt {
    public static final Executor d(Choreographer choreographer) {
        return new d(choreographer);
    }

    public static final void e(Choreographer choreographer, Runnable runnable) {
        choreographer.postFrameCallback(new e(runnable));
    }

    public static final void f(Runnable runnable, long j2) {
        runnable.run();
    }

    public static final boolean g(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final void h(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String a2;
        int e2 = imeOptions.e();
        ImeAction.Companion companion = ImeAction.f18821b;
        int i2 = 6;
        if (ImeAction.m(e2, companion.a())) {
            if (!imeOptions.h()) {
                i2 = 0;
            }
        } else if (ImeAction.m(e2, companion.e())) {
            i2 = 1;
        } else if (ImeAction.m(e2, companion.c())) {
            i2 = 2;
        } else if (ImeAction.m(e2, companion.d())) {
            i2 = 5;
        } else if (ImeAction.m(e2, companion.f())) {
            i2 = 7;
        } else if (ImeAction.m(e2, companion.g())) {
            i2 = 3;
        } else if (ImeAction.m(e2, companion.h())) {
            i2 = 4;
        } else if (!ImeAction.m(e2, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        PlatformImeOptions g2 = imeOptions.g();
        if (!(g2 == null || (a2 = g2.a()) == null)) {
            editorInfo.privateImeOptions = a2;
        }
        int f2 = imeOptions.f();
        KeyboardType.Companion companion2 = KeyboardType.f18852b;
        if (KeyboardType.n(f2, companion2.h())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.n(f2, companion2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.n(f2, companion2.d())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.n(f2, companion2.g())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.n(f2, companion2.j())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.n(f2, companion2.c())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.n(f2, companion2.f())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.n(f2, companion2.e())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.n(f2, companion2.b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type");
        }
        if (!imeOptions.h() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m(imeOptions.e(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int c2 = imeOptions.c();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.f18845b;
            if (KeyboardCapitalization.i(c2, companion3.a())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.i(c2, companion3.e())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.i(c2, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.n(textFieldValue.h());
        editorInfo.initialSelEnd = TextRange.i(textFieldValue.h());
        EditorInfoCompat.e(editorInfo, textFieldValue.i());
        editorInfo.imeOptions |= 33554432;
    }

    public static final void i(EditorInfo editorInfo) {
        if (EmojiCompat.k()) {
            EmojiCompat.c().x(editorInfo);
        }
    }
}
