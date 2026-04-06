package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.transition.TransitionTarget;
import kotlin.Metadata;

@Metadata
public abstract class GenericViewTarget<T extends View> implements ViewTarget<T>, TransitionTarget, DefaultLifecycleObserver {

    /* renamed from: z  reason: collision with root package name */
    public boolean f23713z;

    public void C(LifecycleOwner lifecycleOwner) {
        this.f23713z = false;
        i();
    }

    public void N(LifecycleOwner lifecycleOwner) {
        this.f23713z = true;
        i();
    }

    public void b(Drawable drawable) {
        m(drawable);
    }

    public void d(Drawable drawable) {
        m(drawable);
    }

    public void e(Drawable drawable) {
        m(drawable);
    }

    public abstract Drawable f();

    public abstract void h(Drawable drawable);

    public final void i() {
        Drawable f2 = f();
        Animatable animatable = f2 instanceof Animatable ? (Animatable) f2 : null;
        if (animatable != null) {
            if (this.f23713z) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    public final void m(Drawable drawable) {
        Drawable f2 = f();
        Animatable animatable = f2 instanceof Animatable ? (Animatable) f2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        h(drawable);
        i();
    }
}
