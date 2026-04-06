package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableTransitionState<S> extends TransitionState<S> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f2620d = 0;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f2621b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f2622c;

    public MutableTransitionState(Object obj) {
        super((DefaultConstructorMarker) null);
        this.f2621b = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2622c = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public Object a() {
        return this.f2621b.getValue();
    }

    public Object b() {
        return this.f2622c.getValue();
    }

    public void d(Object obj) {
        this.f2621b.setValue(obj);
    }

    public void f(Transition transition) {
    }

    public void g() {
    }

    public void h(Object obj) {
        this.f2622c.setValue(obj);
    }
}
