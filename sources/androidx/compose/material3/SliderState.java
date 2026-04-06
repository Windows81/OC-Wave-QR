package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class SliderState implements DraggableState {

    /* renamed from: t  reason: collision with root package name */
    public static final Companion f11135t = new Companion((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f11136u = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f11137a;

    /* renamed from: b  reason: collision with root package name */
    public final ClosedFloatingPointRange f11138b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableFloatState f11139c;

    /* renamed from: d  reason: collision with root package name */
    public Function1 f11140d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11141e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f11142f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableIntState f11143g;

    /* renamed from: h  reason: collision with root package name */
    public final MutableIntState f11144h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11145i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableIntState f11146j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableIntState f11147k;

    /* renamed from: l  reason: collision with root package name */
    public Orientation f11148l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11149m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f11150n;

    /* renamed from: o  reason: collision with root package name */
    public final Function0 f11151o;

    /* renamed from: p  reason: collision with root package name */
    public final MutableFloatState f11152p;

    /* renamed from: q  reason: collision with root package name */
    public final MutableFloatState f11153q;

    /* renamed from: r  reason: collision with root package name */
    public final DragScope f11154r;

    /* renamed from: s  reason: collision with root package name */
    public final MutatorMutex f11155s;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* access modifiers changed from: private */
    public final void x(boolean z2) {
        this.f11150n.setValue(Boolean.valueOf(z2));
    }

    public final void A(int i2) {
        this.f11144h.k(i2);
    }

    public final void B(int i2) {
        this.f11143g.k(i2);
    }

    public final void C(float f2) {
        if (this.f11141e) {
            f2 = g(f2);
        }
        D(f2);
    }

    public final void D(float f2) {
        this.f11139c.j(f2);
    }

    public final void E(int i2, int i3) {
        B(i2);
        A(i3);
    }

    public Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new SliderState$drag$2(this, mutatePriority, function2, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public void b(float f2) {
        float f3;
        float f4;
        if (this.f11148l == Orientation.Vertical) {
            f4 = Math.max(((float) r()) - (((float) o()) / 2.0f), 0.0f);
            f3 = Math.min(((float) o()) / 2.0f, f4);
        } else {
            f4 = Math.max(((float) s()) - (((float) p()) / 2.0f), 0.0f);
            f3 = Math.min(((float) p()) / 2.0f, f4);
        }
        z(l() + f2 + k());
        y(0.0f);
        float w2 = w(f3, f4, SliderKt.t(l(), this.f11142f, f3, f4));
        if (w2 != t()) {
            Function1 function1 = this.f11140d;
            if (function1 == null) {
                C(w2);
            } else if (function1 != null) {
                function1.invoke(Float.valueOf(w2));
            }
        }
    }

    public final float g(float f2) {
        return SliderKt.t(RangesKt.n(f2, ((Number) this.f11138b.e()).floatValue(), ((Number) this.f11138b.m()).floatValue()), this.f11142f, ((Number) this.f11138b.e()).floatValue(), ((Number) this.f11138b.m()).floatValue());
    }

    public final float h() {
        return SliderKt.n(((Number) this.f11138b.e()).floatValue(), ((Number) this.f11138b.m()).floatValue(), RangesKt.n(t(), ((Number) this.f11138b.e()).floatValue(), ((Number) this.f11138b.m()).floatValue()));
    }

    public final Function0 i() {
        return this.f11151o;
    }

    public final Orientation j() {
        return this.f11148l;
    }

    public final float k() {
        return this.f11153q.c();
    }

    public final float l() {
        return this.f11152p.c();
    }

    public final boolean m() {
        return this.f11149m;
    }

    public final int n() {
        return this.f11137a;
    }

    public final int o() {
        return this.f11147k.e();
    }

    public final int p() {
        return this.f11146j.e();
    }

    public final float[] q() {
        return this.f11142f;
    }

    public final int r() {
        return this.f11144h.e();
    }

    public final int s() {
        return this.f11143g.e();
    }

    public final float t() {
        return u();
    }

    public final float u() {
        return this.f11139c.c();
    }

    public final void v(long j2) {
        float f2;
        float s2;
        float intBitsToFloat;
        if (this.f11148l == Orientation.Vertical) {
            if (this.f11149m) {
                s2 = (float) r();
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            } else {
                f2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                y(f2 - l());
            }
        } else if (this.f11145i) {
            s2 = (float) s();
            intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        } else {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
            y(f2 - l());
        }
        f2 = s2 - intBitsToFloat;
        y(f2 - l());
    }

    public final float w(float f2, float f3, float f4) {
        return SliderKt.r(f2, f3, f4, ((Number) this.f11138b.e()).floatValue(), ((Number) this.f11138b.m()).floatValue());
    }

    public final void y(float f2) {
        this.f11153q.j(f2);
    }

    public final void z(float f2) {
        this.f11152p.j(f2);
    }
}
