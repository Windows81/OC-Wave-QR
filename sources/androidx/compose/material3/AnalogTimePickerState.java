package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AnalogTimePickerState implements TimePickerState {

    /* renamed from: a  reason: collision with root package name */
    public final TimePickerState f9153a;

    /* renamed from: b  reason: collision with root package name */
    public final Ref f9154b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f9155c;

    /* renamed from: d  reason: collision with root package name */
    public float f9156d;

    /* renamed from: e  reason: collision with root package name */
    public float f9157e;

    /* renamed from: f  reason: collision with root package name */
    public Animatable f9158f;

    /* renamed from: g  reason: collision with root package name */
    public final MutatorMutex f9159g;

    public static /* synthetic */ Object A(AnalogTimePickerState analogTimePickerState, float f2, AnimationSpec animationSpec, boolean z2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return analogTimePickerState.z(f2, animationSpec, z2, continuation);
    }

    public final void B(float f2) {
        this.f9155c.setValue(Dp.j(f2));
    }

    public final int C(float f2) {
        return ((int) ((((double) f2) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    public final int D(float f2) {
        return ((int) ((((double) f2) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    public final void E() {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            this.f9153a.b(c());
            Unit unit = Unit.f40552a;
        } finally {
            companion.m(d2, f2, g2);
        }
    }

    public void a(int i2) {
        this.f9156d = (((float) (i2 % 12)) * 0.5235988f) - 1.5707964f;
        this.f9153a.a(i2);
        if (TimePickerSelectionMode.f(e(), TimePickerSelectionMode.f11521b.a())) {
            this.f9158f = AnimatableKt.b(this.f9156d, 0.0f, 2, (Object) null);
        }
    }

    public void b(int i2) {
        this.f9157e = (((float) i2) * 0.10471976f) - 1.5707964f;
        this.f9153a.b(i2);
        if (TimePickerSelectionMode.f(e(), TimePickerSelectionMode.f11521b.b())) {
            this.f9158f = AnimatableKt.b(this.f9157e, 0.0f, 2, (Object) null);
        }
        E();
    }

    public int c() {
        return this.f9153a.c();
    }

    public void d(int i2) {
        this.f9153a.d(i2);
    }

    public int e() {
        return this.f9153a.e();
    }

    public boolean f() {
        return this.f9153a.f();
    }

    public int g() {
        return this.f9153a.g();
    }

    public final Object q(AnimationSpec animationSpec, Continuation continuation) {
        if (!v()) {
            return Unit.f40552a;
        }
        Object d2 = this.f9159g.d(MutatePriority.PreventUserInput, new AnalogTimePickerState$animateToCurrent$2(this, TimePickerSelectionMode.f(e(), TimePickerSelectionMode.f11521b.a()) ? r(this.f9156d) : r(this.f9157e), animationSpec, (Continuation) null), continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }

    public final float r(float f2) {
        float floatValue = ((Number) this.f9158f.m()).floatValue() - f2;
        while (floatValue > 3.1415927f) {
            floatValue -= 6.2831855f;
        }
        while (floatValue <= -3.1415927f) {
            floatValue += 6.2831855f;
        }
        return ((Number) this.f9158f.m()).floatValue() - floatValue;
    }

    public final float s() {
        return ((Number) this.f9158f.m()).floatValue();
    }

    public final float t() {
        return ((Dp) this.f9155c.getValue()).t();
    }

    public final TimePickerState u() {
        return this.f9153a;
    }

    public final boolean v() {
        int e2 = e();
        TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.f11521b;
        if (!TimePickerSelectionMode.f(e2, companion.a()) || w(((Number) this.f9158f.k()).floatValue()) != w(this.f9156d)) {
            return !TimePickerSelectionMode.f(e(), companion.b()) || w(((Number) this.f9158f.k()).floatValue()) != w(this.f9157e);
        }
        return false;
    }

    public final float w(float f2) {
        double d2 = ((double) f2) % 6.283185307179586d;
        if (d2 < 0.0d) {
            d2 += 6.283185307179586d;
        }
        return (float) d2;
    }

    public final float x(float f2) {
        float f3 = f2 + 1.5707964f;
        return f3 < 0.0f ? f3 + 6.2831855f : f3;
    }

    public final Object y(AnimationSpec animationSpec, Continuation continuation) {
        Object d2 = this.f9159g.d(MutatePriority.PreventUserInput, new AnalogTimePickerState$onGestureEnd$2(this, r(TimePickerSelectionMode.f(e(), TimePickerSelectionMode.f11521b.a()) ? this.f9156d : this.f9157e), animationSpec, (Continuation) null), continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }

    public final Object z(float f2, AnimationSpec animationSpec, boolean z2, Continuation continuation) {
        this.f9154b.b(Boxing.a(false));
        Object d2 = this.f9159g.d(MutatePriority.UserInput, new AnalogTimePickerState$rotateTo$2(this, f2, z2, animationSpec, (Continuation) null), continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }
}
