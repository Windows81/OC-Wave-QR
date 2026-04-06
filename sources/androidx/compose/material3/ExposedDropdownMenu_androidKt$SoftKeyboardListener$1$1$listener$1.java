package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f9979A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f9980B;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9981z;

    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(View view, Function0 function0) {
        this.f9979A = view;
        this.f9980B = function0;
        view.addOnAttachStateChangeListener(this);
        b();
    }

    public final void a() {
        c();
        this.f9979A.removeOnAttachStateChangeListener(this);
    }

    public final void b() {
        if (!this.f9981z && this.f9979A.isAttachedToWindow()) {
            this.f9979A.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f9981z = true;
        }
    }

    public final void c() {
        if (this.f9981z) {
            this.f9979A.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f9981z = false;
        }
    }

    public void onGlobalLayout() {
        this.f9980B.invoke();
    }

    public void onViewAttachedToWindow(View view) {
        b();
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
