package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BoundsAnimation {

    /* renamed from: a  reason: collision with root package name */
    public final SharedTransitionScope f2151a;

    /* renamed from: b  reason: collision with root package name */
    public final Transition f2152b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f2153c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f2154d;

    /* renamed from: e  reason: collision with root package name */
    public FiniteAnimationSpec f2155e = BoundsAnimationKt.f2164a;

    /* renamed from: f  reason: collision with root package name */
    public final MutableState f2156f = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    public BoundsAnimation(SharedTransitionScope sharedTransitionScope, Transition transition, Transition.DeferredAnimation deferredAnimation, BoundsTransform boundsTransform) {
        this.f2151a = sharedTransitionScope;
        this.f2152b = transition;
        this.f2153c = SnapshotStateKt__SnapshotStateKt.e(deferredAnimation, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2154d = SnapshotStateKt__SnapshotStateKt.e(boundsTransform, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final void a(Rect rect, Rect rect2) {
        if (this.f2151a.q()) {
            if (d() == null) {
                this.f2155e = e().a(rect, rect2);
            }
            k(b().a(new BoundsAnimation$animate$1(this), new BoundsAnimation$animate$2(this, rect2, rect)));
        }
    }

    public final Transition.DeferredAnimation b() {
        return (Transition.DeferredAnimation) this.f2153c.getValue();
    }

    public final FiniteAnimationSpec c() {
        return this.f2155e;
    }

    public final State d() {
        return (State) this.f2156f.getValue();
    }

    public final BoundsTransform e() {
        return (BoundsTransform) this.f2154d.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.f2152b.q()).booleanValue();
    }

    public final Transition g() {
        return this.f2152b;
    }

    public final Rect h() {
        State d2;
        if (!this.f2151a.q() || (d2 = d()) == null) {
            return null;
        }
        return (Rect) d2.getValue();
    }

    public final boolean i() {
        Transition transition = this.f2152b;
        while (transition.m() != null) {
            transition = transition.m();
            Intrinsics.f(transition);
        }
        return !Intrinsics.d(transition.i(), transition.q());
    }

    public final void j(Transition.DeferredAnimation deferredAnimation) {
        this.f2153c.setValue(deferredAnimation);
    }

    public final void k(State state) {
        this.f2156f.setValue(state);
    }

    public final void l(BoundsTransform boundsTransform) {
        this.f2154d.setValue(boundsTransform);
    }

    public final void m(Transition.DeferredAnimation deferredAnimation, BoundsTransform boundsTransform) {
        if (!Intrinsics.d(b(), deferredAnimation)) {
            j(deferredAnimation);
            k((State) null);
            this.f2155e = BoundsAnimationKt.f2164a;
        }
        l(boundsTransform);
    }
}
