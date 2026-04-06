package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final FloatDecayAnimationSpec f2534a;

    public DecayAnimationSpecImpl(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.f2534a = floatDecayAnimationSpec;
    }

    public VectorizedDecayAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedFloatDecaySpec(this.f2534a);
    }
}
