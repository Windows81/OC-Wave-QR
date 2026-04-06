package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata
public final class DrawerPredictiveBackState {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f9879a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableFloatState f9880b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableFloatState f9881c;

    public final void a() {
        g(true);
        e(0.0f);
        f(0.0f);
    }

    public final float b() {
        return this.f9880b.c();
    }

    public final float c() {
        return this.f9881c.c();
    }

    public final boolean d() {
        return ((Boolean) this.f9879a.getValue()).booleanValue();
    }

    public final void e(float f2) {
        this.f9880b.j(f2);
    }

    public final void f(float f2) {
        this.f9881c.j(f2);
    }

    public final void g(boolean z2) {
        this.f9879a.setValue(Boolean.valueOf(z2));
    }

    public final void h(float f2, boolean z2, boolean z3, float f3, float f4, float f5) {
        g(z2 != z3);
        if (!d()) {
            f3 = f4;
        }
        e(MathHelpersKt.b(0.0f, f3, f2));
        f(MathHelpersKt.b(0.0f, f5, f2));
    }
}
