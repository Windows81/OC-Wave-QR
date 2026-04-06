package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CompositionKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f14625a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final CompositionServiceKey f14626b = new CompositionKt$ObservableCompositionServiceKey$1();

    public static final Composition a(Applier applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, (CoroutineContext) null, 4, (DefaultConstructorMarker) null);
    }

    public static final ReusableComposition b(Applier applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, (CoroutineContext) null, 4, (DefaultConstructorMarker) null);
    }

    public static final CoroutineContext d(ControlledComposition controlledComposition) {
        CoroutineContext M;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (M = compositionImpl.M()) == null) ? EmptyCoroutineContext.f40721z : M;
    }
}
