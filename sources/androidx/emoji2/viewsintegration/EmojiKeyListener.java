package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.EmojiCompat;

final class EmojiKeyListener implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f21415a;

    /* renamed from: b  reason: collision with root package name */
    public final EmojiCompatHandleKeyDownHelper f21416b;

    public static class EmojiCompatHandleKeyDownHelper {
        public boolean a(Editable editable, int i2, KeyEvent keyEvent) {
            return EmojiCompat.i(editable, i2, keyEvent);
        }
    }

    public EmojiKeyListener(KeyListener keyListener) {
        this(keyListener, new EmojiCompatHandleKeyDownHelper());
    }

    public void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f21415a.clearMetaKeyState(view, editable, i2);
    }

    public int getInputType() {
        return this.f21415a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f21416b.a(editable, i2, keyEvent) || this.f21415a.onKeyDown(view, editable, i2, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f21415a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f21415a.onKeyUp(view, editable, i2, keyEvent);
    }

    public EmojiKeyListener(KeyListener keyListener, EmojiCompatHandleKeyDownHelper emojiCompatHandleKeyDownHelper) {
        this.f21415a = keyListener;
        this.f21416b = emojiCompatHandleKeyDownHelper;
    }
}
