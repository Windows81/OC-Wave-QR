package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class LazyLayoutScrollDeltaBetweenPasses {

    /* renamed from: a  reason: collision with root package name */
    public AnimationState f4915a;

    public LazyLayoutScrollDeltaBetweenPasses() {
        TwoWayConverter i2 = VectorConvertersKt.i(FloatCompanionObject.f40896a);
        Float valueOf = Float.valueOf(0.0f);
        this.f4915a = AnimationStateKt.d(i2, valueOf, valueOf, 0, 0, false, 56, (Object) null);
    }

    public final float b() {
        return ((Number) this.f4915a.getValue()).floatValue();
    }

    public final void c(float f2, Density density, CoroutineScope coroutineScope) {
        float f3 = f2;
        if (f3 > density.B1(LazyLayoutScrollDeltaBetweenPassesKt.f4916a)) {
            Snapshot.Companion companion = Snapshot.f15255e;
            Snapshot d2 = companion.d();
            Function1 g2 = d2 != null ? d2.g() : null;
            Snapshot f4 = companion.f(d2);
            try {
                float floatValue = ((Number) this.f4915a.getValue()).floatValue();
                if (this.f4915a.u()) {
                    this.f4915a = AnimationStateKt.g(this.f4915a, floatValue - f3, 0.0f, 0, 0, false, 30, (Object) null);
                    Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, (Continuation) null), 3, (Object) null);
                } else {
                    this.f4915a = new AnimationState(VectorConvertersKt.i(FloatCompanionObject.f40896a), Float.valueOf(-f3), (AnimationVector) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
                    Job unused2 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2(this, (Continuation) null), 3, (Object) null);
                }
            } finally {
                companion.m(d2, f4, g2);
            }
        }
    }
}
