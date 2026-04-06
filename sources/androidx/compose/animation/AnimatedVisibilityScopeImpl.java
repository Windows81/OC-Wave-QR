package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

@Metadata
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {

    /* renamed from: a  reason: collision with root package name */
    public Transition f2148a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f2149b = SnapshotStateKt__SnapshotStateKt.e(IntSize.b(IntSize.f19170b.a()), (SnapshotMutationPolicy) null, 2, (Object) null);

    public AnimatedVisibilityScopeImpl(Transition transition) {
        this.f2148a = transition;
    }

    public final MutableState a() {
        return this.f2149b;
    }

    public Transition c() {
        return this.f2148a;
    }
}
