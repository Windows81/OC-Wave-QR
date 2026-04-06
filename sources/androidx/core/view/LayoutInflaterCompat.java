package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

public final class LayoutInflaterCompat {

    public static class Factory2Wrapper implements LayoutInflater.Factory2 {

        /* renamed from: z  reason: collision with root package name */
        public final LayoutInflaterFactory f20227z;

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f20227z.onCreateView((View) null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.f20227z + "}";
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f20227z.onCreateView(view, str, context, attributeSet);
        }
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
