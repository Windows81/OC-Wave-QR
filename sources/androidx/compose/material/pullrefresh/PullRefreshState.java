package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class PullRefreshState {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineScope f9035a;

    /* renamed from: b  reason: collision with root package name */
    public final State f9036b;

    /* renamed from: c  reason: collision with root package name */
    public final State f9037c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f9038d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableFloatState f9039e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableFloatState f9040f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableFloatState f9041g;

    /* renamed from: h  reason: collision with root package name */
    public final MutableFloatState f9042h;

    /* renamed from: i  reason: collision with root package name */
    public final MutatorMutex f9043i;

    public final Job e(float f2) {
        return BuildersKt__Builders_commonKt.d(this.f9035a, (CoroutineContext) null, (CoroutineStart) null, new PullRefreshState$animateIndicatorTo$1(this, f2, (Continuation) null), 3, (Object) null);
    }

    public final float f() {
        if (g() <= l()) {
            return g();
        }
        float abs = Math.abs(j()) - 1.0f;
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        if (abs > 2.0f) {
            abs = 2.0f;
        }
        return l() + (l() * (abs - (((float) Math.pow((double) abs, (double) 2)) / ((float) 4))));
    }

    public final float g() {
        return ((Number) this.f9037c.getValue()).floatValue();
    }

    public final float h() {
        return this.f9040f.c();
    }

    public final float i() {
        return m();
    }

    public final float j() {
        return g() / l();
    }

    public final boolean k() {
        return n();
    }

    public final float l() {
        return p();
    }

    public final float m() {
        return this.f9039e.c();
    }

    public final boolean n() {
        return ((Boolean) this.f9038d.getValue()).booleanValue();
    }

    public final float o() {
        return this.f9042h.c();
    }

    public final float p() {
        return this.f9041g.c();
    }

    public final float q(float f2) {
        if (n()) {
            return 0.0f;
        }
        float d2 = RangesKt.d(h() + f2, 0.0f);
        float h2 = d2 - h();
        s(d2);
        w(f());
        return h2;
    }

    public final float r(float f2) {
        if (k()) {
            return 0.0f;
        }
        if (g() > l()) {
            ((Function0) this.f9036b.getValue()).invoke();
        }
        e(0.0f);
        if (h() == 0.0f || f2 < 0.0f) {
            f2 = 0.0f;
        }
        s(0.0f);
        return f2;
    }

    public final void s(float f2) {
        this.f9040f.j(f2);
    }

    public final void t(boolean z2) {
        if (n() != z2) {
            x(z2);
            float f2 = 0.0f;
            s(0.0f);
            if (z2) {
                f2 = o();
            }
            e(f2);
        }
    }

    public final void u(float f2) {
        if (o() != f2) {
            y(f2);
            if (k()) {
                e(f2);
            }
        }
    }

    public final void v(float f2) {
        z(f2);
    }

    public final void w(float f2) {
        this.f9039e.j(f2);
    }

    public final void x(boolean z2) {
        this.f9038d.setValue(Boolean.valueOf(z2));
    }

    public final void y(float f2) {
        this.f9042h.j(f2);
    }

    public final void z(float f2) {
        this.f9041g.j(f2);
    }
}
