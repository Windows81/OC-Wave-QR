package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;

@Metadata
public final class DeferredTargetAnimation<T, V extends AnimationVector> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f2535a;

    public final Object b() {
        return this.f2535a.getValue();
    }
}
