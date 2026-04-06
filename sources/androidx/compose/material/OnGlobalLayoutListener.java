package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class OnGlobalLayoutListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A  reason: collision with root package name */
    public final Function0 f8082A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f8083B;

    /* renamed from: z  reason: collision with root package name */
    public final View f8084z;

    public OnGlobalLayoutListener(View view, Function0 function0) {
        this.f8084z = view;
        this.f8082A = function0;
        view.addOnAttachStateChangeListener(this);
        b();
    }

    public final void a() {
        c();
        this.f8084z.removeOnAttachStateChangeListener(this);
    }

    public final void b() {
        if (!this.f8083B && this.f8084z.isAttachedToWindow()) {
            this.f8084z.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f8083B = true;
        }
    }

    public final void c() {
        if (this.f8083B) {
            this.f8084z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f8083B = false;
        }
    }

    public void onGlobalLayout() {
        this.f8082A.invoke();
    }

    public void onViewAttachedToWindow(View view) {
        b();
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
