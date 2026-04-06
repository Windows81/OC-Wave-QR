package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.Metadata;

@Metadata
final class AnimatedContentScopeImpl implements AnimatedContentScope, AnimatedVisibilityScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnimatedVisibilityScope f2052a;

    public AnimatedContentScopeImpl(AnimatedVisibilityScope animatedVisibilityScope) {
        this.f2052a = animatedVisibilityScope;
    }

    public Transition c() {
        return this.f2052a.c();
    }
}
