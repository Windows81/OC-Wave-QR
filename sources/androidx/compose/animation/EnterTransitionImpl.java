package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class EnterTransitionImpl extends EnterTransition {

    /* renamed from: c  reason: collision with root package name */
    public final TransitionData f2276c;

    public EnterTransitionImpl(TransitionData transitionData) {
        super((DefaultConstructorMarker) null);
        this.f2276c = transitionData;
    }

    public TransitionData b() {
        return this.f2276c;
    }
}
