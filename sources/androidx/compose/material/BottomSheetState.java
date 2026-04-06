package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BottomSheetState {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f7410b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final AnchoredDraggableState f7411a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a(AnimationSpec animationSpec, Function1 function1, Density density) {
            return SaverKt.e(BottomSheetState$Companion$Saver$1.f7413z, new BottomSheetState$Companion$Saver$2(density, animationSpec, function1));
        }

        public Companion() {
        }
    }

    public BottomSheetState(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1) {
        this.f7411a = new AnchoredDraggableState(bottomSheetValue, new BottomSheetState$anchoredDraggableState$1(density), new BottomSheetState$anchoredDraggableState$2(density), animationSpec, function1);
    }

    public final Object a(Continuation continuation) {
        Object g2 = AnchoredDraggableKt.g(this.f7411a, BottomSheetValue.Collapsed, 0.0f, continuation, 2, (Object) null);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final Object b(Continuation continuation) {
        DraggableAnchors o2 = this.f7411a.o();
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!o2.f(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object g2 = AnchoredDraggableKt.g(this.f7411a, bottomSheetValue, 0.0f, continuation, 2, (Object) null);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final AnchoredDraggableState c() {
        return this.f7411a;
    }

    public final BottomSheetValue d() {
        return (BottomSheetValue) this.f7411a.s();
    }

    public final boolean e() {
        return this.f7411a.s() == BottomSheetValue.Collapsed;
    }

    public final float f() {
        return this.f7411a.A();
    }
}
