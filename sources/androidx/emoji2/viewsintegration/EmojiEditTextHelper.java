package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.Preconditions;

public final class EmojiEditTextHelper {

    /* renamed from: a  reason: collision with root package name */
    public final HelperInternal f21401a;

    /* renamed from: b  reason: collision with root package name */
    public int f21402b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f21403c = 0;

    public static class HelperInternal {
        public KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        public void c(boolean z2) {
        }
    }

    public static class HelperInternal19 extends HelperInternal {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f21404a;

        /* renamed from: b  reason: collision with root package name */
        public final EmojiTextWatcher f21405b;

        public HelperInternal19(EditText editText, boolean z2) {
            this.f21404a = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText, z2);
            this.f21405b = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            editText.setEditableFactory(EmojiEditableFactory.getInstance());
        }

        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof EmojiKeyListener) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(this.f21404a, inputConnection, editorInfo);
        }

        public void c(boolean z2) {
            this.f21405b.c(z2);
        }
    }

    public EmojiEditTextHelper(EditText editText, boolean z2) {
        Preconditions.g(editText, "editText cannot be null");
        this.f21401a = new HelperInternal19(editText, z2);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f21401a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f21401a.b(inputConnection, editorInfo);
    }

    public void c(boolean z2) {
        this.f21401a.c(z2);
    }
}
