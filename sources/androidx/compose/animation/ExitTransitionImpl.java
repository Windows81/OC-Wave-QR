package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class ExitTransitionImpl extends ExitTransition {

    /* renamed from: d  reason: collision with root package name */
    public final TransitionData f2280d;

    public ExitTransitionImpl(TransitionData transitionData) {
        super((DefaultConstructorMarker) null);
        this.f2280d = transitionData;
    }

    public TransitionData b() {
        return this.f2280d;
    }
}
