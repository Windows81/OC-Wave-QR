package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class TransitionState<S> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f2777a;

    public /* synthetic */ TransitionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a();

    public abstract Object b();

    public final boolean c() {
        return ((Boolean) this.f2777a.getValue()).booleanValue();
    }

    public abstract void d(Object obj);

    public final void e(boolean z2) {
        this.f2777a.setValue(Boolean.valueOf(z2));
    }

    public abstract void f(Transition transition);

    public abstract void g();

    public TransitionState() {
        this.f2777a = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
