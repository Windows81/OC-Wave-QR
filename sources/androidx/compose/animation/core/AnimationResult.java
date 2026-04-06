package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
public final class AnimationResult<T, V extends AnimationVector> {

    /* renamed from: a  reason: collision with root package name */
    public final AnimationState f2461a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationEndReason f2462b;

    public AnimationResult(AnimationState animationState, AnimationEndReason animationEndReason) {
        this.f2461a = animationState;
        this.f2462b = animationEndReason;
    }

    public final AnimationEndReason a() {
        return this.f2462b;
    }

    public final AnimationState b() {
        return this.f2461a;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.f2462b + ", endState=" + this.f2461a + ')';
    }
}
