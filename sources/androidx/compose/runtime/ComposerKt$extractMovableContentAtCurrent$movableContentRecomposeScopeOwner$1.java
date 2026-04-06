package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

@Metadata
public final class ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1 implements RecomposeScopeOwner {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MovableContentStateReference f14618A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f14619z;

    public ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1(ControlledComposition controlledComposition, MovableContentStateReference movableContentStateReference) {
        this.f14619z = controlledComposition;
        this.f14618A = movableContentStateReference;
    }

    public InvalidationResult a(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        InvalidationResult invalidationResult;
        ControlledComposition controlledComposition = this.f14619z;
        RecomposeScopeOwner recomposeScopeOwner = controlledComposition instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition : null;
        if (recomposeScopeOwner == null || (invalidationResult = recomposeScopeOwner.a(recomposeScopeImpl, obj)) == null) {
            invalidationResult = InvalidationResult.IGNORED;
        }
        if (invalidationResult != InvalidationResult.IGNORED) {
            return invalidationResult;
        }
        MovableContentStateReference movableContentStateReference = this.f14618A;
        movableContentStateReference.i(CollectionsKt.y0(movableContentStateReference.d(), TuplesKt.a(recomposeScopeImpl, obj)));
        return InvalidationResult.SCHEDULED;
    }

    public void b(Object obj) {
    }

    public void c(RecomposeScopeImpl recomposeScopeImpl) {
    }
}
