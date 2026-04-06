package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

class AppCompatEmojiEditTextHelper {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f1091a;

    /* renamed from: b  reason: collision with root package name */
    public final EmojiEditTextHelper f1092b;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f1091a = editText;
        this.f1092b = new EmojiEditTextHelper(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1092b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    public void c(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f1091a.getContext().obtainStyledAttributes(attributeSet, R.styleable.i0, i2, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(R.styleable.w0)) {
                z2 = obtainStyledAttributes.getBoolean(R.styleable.w0, true);
            }
            obtainStyledAttributes.recycle();
            e(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1092b.b(inputConnection, editorInfo);
    }

    public void e(boolean z2) {
        this.f1092b.c(z2);
    }
}
