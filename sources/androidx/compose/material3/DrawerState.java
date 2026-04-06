package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DrawerState {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f9882c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final AnchoredDraggableState f9883a;

    /* renamed from: b  reason: collision with root package name */
    public FiniteAnimationSpec f9884b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static /* synthetic */ Object b(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = drawerState.f9883a.q();
        }
        return drawerState.a(drawerValue, animationSpec, f2, continuation);
    }

    public final Object a(DrawerValue drawerValue, AnimationSpec animationSpec, float f2, Continuation continuation) {
        Object k2 = AnchoredDraggableState.k(this.f9883a, drawerValue, (MutatePriority) null, new DrawerState$animateTo$3(this, f2, animationSpec, (Continuation) null), continuation, 2, (Object) null);
        return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
    }

    public final Object c(Continuation continuation) {
        Object b2 = b(this, DrawerValue.Closed, this.f9884b, 0.0f, continuation, 4, (Object) null);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }

    public final AnchoredDraggableState d() {
        return this.f9883a;
    }

    public final float e() {
        return this.f9883a.r();
    }

    public final DrawerValue f() {
        return (DrawerValue) this.f9883a.t();
    }

    public final boolean g() {
        return f() == DrawerValue.Closed;
    }

    public final float h() {
        return this.f9883a.A();
    }
}
