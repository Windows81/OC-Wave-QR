package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

final class EmojiInputConnection extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f21409a;

    /* renamed from: b  reason: collision with root package name */
    public final EmojiCompatDeleteHelper f21410b;

    public static class EmojiCompatDeleteHelper {
        public boolean a(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
            return EmojiCompat.h(inputConnection, editable, i2, i3, z2);
        }

        public void b(EditorInfo editorInfo) {
            if (EmojiCompat.k()) {
                EmojiCompat.c().x(editorInfo);
            }
        }
    }

    public EmojiInputConnection(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new EmojiCompatDeleteHelper());
    }

    public final Editable b() {
        return this.f21409a.getEditableText();
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        return this.f21410b.a(this, b(), i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return this.f21410b.a(this, b(), i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }

    public EmojiInputConnection(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, EmojiCompatDeleteHelper emojiCompatDeleteHelper) {
        super(inputConnection, false);
        this.f21409a = textView;
        this.f21410b = emojiCompatDeleteHelper;
        emojiCompatDeleteHelper.b(editorInfo);
    }
}
