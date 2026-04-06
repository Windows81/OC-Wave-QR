package androidx.compose.runtime;

import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
public abstract class CompositionContext {
    public abstract void a(ControlledComposition controlledComposition, Function2 function2);

    public abstract void b(MovableContentStateReference movableContentStateReference);

    public void c() {
    }

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract long g();

    public abstract Composition h();

    public PersistentCompositionLocalMap i() {
        return CompositionContextKt.f14620a;
    }

    public abstract CoroutineContext j();

    public CompositionObserverHolder k() {
        return null;
    }

    public abstract CoroutineContext l();

    public abstract void m(MovableContentStateReference movableContentStateReference);

    public abstract void n(ControlledComposition controlledComposition);

    public abstract void o(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier applier);

    public MovableContentState p(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public void q(Set set) {
    }

    public void r(Composer composer) {
    }

    public abstract void s(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void t(ControlledComposition controlledComposition);

    public void u() {
    }

    public void v(Composer composer) {
    }

    public abstract void w(ControlledComposition controlledComposition);
}
