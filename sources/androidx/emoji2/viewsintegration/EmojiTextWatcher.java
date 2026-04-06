package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class EmojiTextWatcher implements TextWatcher {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f21422A;

    /* renamed from: B  reason: collision with root package name */
    public EmojiCompat.InitCallback f21423B;
    public int C = Integer.MAX_VALUE;
    public int D = 0;
    public boolean E;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f21424z;

    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final Reference f21425z;

        public InitCallbackImpl(EditText editText) {
            this.f21425z = new WeakReference(editText);
        }

        public void b() {
            Handler handler;
            super.b();
            EditText editText = (EditText) this.f21425z.get();
            if (editText != null && (handler = editText.getHandler()) != null) {
                handler.post(this);
            }
        }

        public void run() {
            EmojiTextWatcher.b((EditText) this.f21425z.get(), 1);
        }
    }

    public EmojiTextWatcher(EditText editText, boolean z2) {
        this.f21424z = editText;
        this.f21422A = z2;
        this.E = true;
    }

    public static void b(EditText editText, int i2) {
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.c().r(editableText);
            EmojiInputFilter.b(editableText, selectionStart, selectionEnd);
        }
    }

    public EmojiCompat.InitCallback a() {
        if (this.f21423B == null) {
            this.f21423B = new InitCallbackImpl(this.f21424z);
        }
        return this.f21423B;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void c(boolean z2) {
        if (this.E != z2) {
            if (this.f21423B != null) {
                EmojiCompat.c().w(this.f21423B);
            }
            this.E = z2;
            if (z2) {
                b(this.f21424z, EmojiCompat.c().g());
            }
        }
    }

    public final boolean d() {
        return !this.E || (!this.f21422A && !EmojiCompat.k());
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (!this.f21424z.isInEditMode() && !d() && i3 <= i4 && (charSequence instanceof Spannable)) {
            int g2 = EmojiCompat.c().g();
            if (g2 != 0) {
                if (g2 == 1) {
                    EmojiCompat.c().u((Spannable) charSequence, i2, i2 + i4, this.C, this.D);
                    return;
                } else if (g2 != 3) {
                    return;
                }
            }
            EmojiCompat.c().v(a());
        }
    }
}
