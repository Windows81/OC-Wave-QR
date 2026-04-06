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
public final class ModalBottomSheetState {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f8023d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f8024e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final AnimationSpec f8025a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8026b;

    /* renamed from: c  reason: collision with root package name */
    public final AnchoredDraggableState f8027c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a(AnimationSpec animationSpec, Function1 function1, boolean z2, Density density) {
            return SaverKt.e(ModalBottomSheetState$Companion$Saver$1.f8029z, new ModalBottomSheetState$Companion$Saver$2(density, function1, animationSpec, z2));
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8033a;

        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8033a = iArr;
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, Density density, Function1 function1, AnimationSpec animationSpec, boolean z2) {
        this.f8025a = animationSpec;
        this.f8026b = z2;
        this.f8027c = new AnchoredDraggableState(modalBottomSheetValue, new ModalBottomSheetState$anchoredDraggableState$1(density), new ModalBottomSheetState$anchoredDraggableState$2(density), animationSpec, function1);
        if (z2 && modalBottomSheetValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static /* synthetic */ Object b(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = modalBottomSheetState.f8027c.v();
        }
        return modalBottomSheetState.a(modalBottomSheetValue, f2, continuation);
    }

    public final Object a(ModalBottomSheetValue modalBottomSheetValue, float f2, Continuation continuation) {
        Object f3 = AnchoredDraggableKt.f(this.f8027c, modalBottomSheetValue, f2, continuation);
        return f3 == IntrinsicsKt.f() ? f3 : Unit.f40552a;
    }

    public final Object c(Continuation continuation) {
        DraggableAnchors o2 = this.f8027c.o();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!o2.f(modalBottomSheetValue)) {
            return Unit.f40552a;
        }
        Object b2 = b(this, modalBottomSheetValue, 0.0f, continuation, 2, (Object) null);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }

    public final AnchoredDraggableState d() {
        return this.f8027c;
    }

    public final ModalBottomSheetValue e() {
        return (ModalBottomSheetValue) this.f8027c.s();
    }

    public final boolean f() {
        return this.f8027c.o().f(ModalBottomSheetValue.HalfExpanded);
    }

    public final ModalBottomSheetValue g() {
        return (ModalBottomSheetValue) this.f8027c.x();
    }

    public final Object h(Continuation continuation) {
        if (!f()) {
            return Unit.f40552a;
        }
        Object b2 = b(this, ModalBottomSheetValue.HalfExpanded, 0.0f, continuation, 2, (Object) null);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }

    public final Object i(Continuation continuation) {
        Object b2 = b(this, ModalBottomSheetValue.Hidden, 0.0f, continuation, 2, (Object) null);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }

    public final boolean j() {
        return this.f8026b;
    }

    public final boolean k() {
        return this.f8027c.s() != ModalBottomSheetValue.Hidden;
    }
}
