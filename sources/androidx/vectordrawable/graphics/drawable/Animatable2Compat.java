package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public interface Animatable2Compat extends Animatable {

    public static abstract class AnimationCallback {

        /* renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1  reason: invalid class name */
        class AnonymousClass1 extends Animatable2.AnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnimationCallback f22960a;

            public void onAnimationEnd(Drawable drawable) {
                this.f22960a.a(drawable);
            }

            public void onAnimationStart(Drawable drawable) {
                this.f22960a.b(drawable);
            }
        }

        public void a(Drawable drawable) {
        }

        public void b(Drawable drawable) {
        }
    }
}
