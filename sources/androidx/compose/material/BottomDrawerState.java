package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BottomDrawerState {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f7302c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f7303d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final AnchoredDraggableState f7304a;

    /* renamed from: b  reason: collision with root package name */
    public final NestedScrollConnection f7305b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a(Density density, Function1 function1, AnimationSpec animationSpec) {
            return SaverKt.e(BottomDrawerState$Companion$Saver$1.f7307z, new BottomDrawerState$Companion$Saver$2(density, function1, animationSpec));
        }

        public Companion() {
        }
    }

    public BottomDrawerState(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1, AnimationSpec animationSpec) {
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(bottomDrawerValue, new BottomDrawerState$anchoredDraggableState$1(density), new BottomDrawerState$anchoredDraggableState$2(density), animationSpec, function1);
        this.f7304a = anchoredDraggableState;
        this.f7305b = DrawerKt.d(anchoredDraggableState);
    }

    public final Object a(Continuation continuation) {
        Object g2 = AnchoredDraggableKt.g(this.f7304a, BottomDrawerValue.Closed, 0.0f, continuation, 2, (Object) null);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final boolean b(BottomDrawerValue bottomDrawerValue) {
        return ((Boolean) this.f7304a.r().invoke(bottomDrawerValue)).booleanValue();
    }

    public final AnchoredDraggableState c() {
        return this.f7304a;
    }

    public final BottomDrawerValue d() {
        return (BottomDrawerValue) this.f7304a.s();
    }

    public final NestedScrollConnection e() {
        return this.f7305b;
    }

    public final BottomDrawerValue f() {
        return (BottomDrawerValue) this.f7304a.x();
    }

    public final boolean g() {
        return this.f7304a.s() != BottomDrawerValue.Closed;
    }

    public final float h() {
        return this.f7304a.A();
    }
}
