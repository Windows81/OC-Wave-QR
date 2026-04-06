package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class EmojiInputFilter implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f21411a;

    /* renamed from: b  reason: collision with root package name */
    public EmojiCompat.InitCallback f21412b;

    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final Reference f21413A;

        /* renamed from: z  reason: collision with root package name */
        public final Reference f21414z;

        public InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.f21414z = new WeakReference(textView);
            this.f21413A = new WeakReference(emojiInputFilter);
        }

        public void b() {
            Handler handler;
            super.b();
            TextView textView = (TextView) this.f21414z.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        public void run() {
            CharSequence text;
            CharSequence r2;
            TextView textView = (TextView) this.f21414z.get();
            if (c(textView, (InputFilter) this.f21413A.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (r2 = EmojiCompat.c().r(text))) {
                int selectionStart = Selection.getSelectionStart(r2);
                int selectionEnd = Selection.getSelectionEnd(r2);
                textView.setText(r2);
                if (r2 instanceof Spannable) {
                    EmojiInputFilter.b((Spannable) r2, selectionStart, selectionEnd);
                }
            }
        }
    }

    public EmojiInputFilter(TextView textView) {
        this.f21411a = textView;
    }

    public static void b(Spannable spannable, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            Selection.setSelection(spannable, i2, i3);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        } else if (i3 >= 0) {
            Selection.setSelection(spannable, i3);
        }
    }

    public EmojiCompat.InitCallback a() {
        if (this.f21412b == null) {
            this.f21412b = new InitCallbackImpl(this.f21411a, this);
        }
        return this.f21412b;
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (this.f21411a.isInEditMode()) {
            return charSequence;
        }
        int g2 = EmojiCompat.c().g();
        if (g2 != 0) {
            if (g2 != 1) {
                if (g2 != 3) {
                    return charSequence;
                }
            } else if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == this.f21411a.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i2 == 0 && i3 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return EmojiCompat.c().s(charSequence, 0, charSequence.length());
            }
        }
        EmojiCompat.c().v(a());
        return charSequence;
    }
}
