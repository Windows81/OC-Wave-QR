package androidx.emoji2.viewsintegration;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

final class EmojiEditableFactory extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f21406a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile Editable.Factory f21407b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f21408c;

    public EmojiEditableFactory() {
        try {
            f21408c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f21407b == null) {
            synchronized (f21406a) {
                try {
                    if (f21407b == null) {
                        f21407b = new EmojiEditableFactory();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21407b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class cls = f21408c;
        return cls != null ? SpannableBuilder.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
