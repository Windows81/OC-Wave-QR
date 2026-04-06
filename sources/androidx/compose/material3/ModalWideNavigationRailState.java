package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.AnchoredDraggableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class ModalWideNavigationRailState implements WideNavigationRailState {

    /* renamed from: a  reason: collision with root package name */
    public final AnimationSpec f10362a;

    /* renamed from: b  reason: collision with root package name */
    public final AnchoredDraggableState f10363b;

    public static /* synthetic */ Object c(ModalWideNavigationRailState modalWideNavigationRailState, WideNavigationRailValue wideNavigationRailValue, AnimationSpec animationSpec, float f2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = modalWideNavigationRailState.f10362a;
        }
        if ((i2 & 4) != 0) {
            f2 = modalWideNavigationRailState.f10363b.w();
        }
        return modalWideNavigationRailState.b(wideNavigationRailValue, animationSpec, f2, continuation);
    }

    public Object a(Continuation continuation) {
        Object c2 = c(this, WideNavigationRailValue.Collapsed, (AnimationSpec) null, 0.0f, continuation, 6, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final Object b(WideNavigationRailValue wideNavigationRailValue, AnimationSpec animationSpec, float f2, Continuation continuation) {
        Object k2 = AnchoredDraggableState.k(this.f10363b, wideNavigationRailValue, (MutatePriority) null, new ModalWideNavigationRailState$animateTo$2(this, f2, animationSpec, (Continuation) null), continuation, 2, (Object) null);
        return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
    }

    public Object d(Continuation continuation) {
        Object c2 = c(this, WideNavigationRailValue.Expanded, (AnimationSpec) null, 0.0f, continuation, 6, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final AnchoredDraggableState e() {
        return this.f10363b;
    }

    public final float f() {
        return this.f10363b.x();
    }

    public WideNavigationRailValue g() {
        return (WideNavigationRailValue) this.f10363b.y();
    }

    public final Object h(float f2, Continuation continuation) {
        Object I = this.f10363b.I(f2, continuation);
        return I == IntrinsicsKt.f() ? I : Unit.f40552a;
    }
}
