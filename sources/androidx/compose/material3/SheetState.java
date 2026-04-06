package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SheetState {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f11003h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11004a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f11005b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11006c;

    /* renamed from: d  reason: collision with root package name */
    public AnimationSpec f11007d;

    /* renamed from: e  reason: collision with root package name */
    public AnchoredDraggableState f11008e;

    /* renamed from: f  reason: collision with root package name */
    public FiniteAnimationSpec f11009f;

    /* renamed from: g  reason: collision with root package name */
    public FiniteAnimationSpec f11010g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final SheetValue d(SaverScope saverScope, SheetState sheetState) {
            return sheetState.k();
        }

        public static final SheetState e(boolean z2, Function0 function0, Function0 function02, Function1 function1, boolean z3, SheetValue sheetValue) {
            return new SheetState(z2, function0, function02, sheetValue, function1, z3);
        }

        public final Saver c(boolean z2, Function0 function0, Function0 function02, Function1 function1, boolean z3) {
            return SaverKt.e(new W5(), new X5(z2, function0, function02, function1, z3));
        }

        public Companion() {
        }
    }

    public SheetState(boolean z2, Function0 function0, Function0 function02, SheetValue sheetValue, Function1 function1, boolean z3) {
        this.f11004a = z2;
        this.f11005b = function1;
        this.f11006c = z3;
        if (z2 && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        } else if (!z3 || sheetValue != SheetValue.Hidden) {
            this.f11007d = SheetDefaultsKt.f10997b;
            this.f11008e = new AnchoredDraggableState(sheetValue, new U5(function0), function02, new V5(this), function1);
            this.f11009f = AnimationSpecKt.j(0, 1, (Object) null);
            this.f11010g = AnimationSpecKt.j(0, 1, (Object) null);
        } else {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
    }

    public static final boolean d(SheetValue sheetValue) {
        return true;
    }

    public static final float e(Function0 function0, float f2) {
        return ((Number) function0.invoke()).floatValue();
    }

    public static final AnimationSpec f(SheetState sheetState) {
        return sheetState.f11007d;
    }

    public static /* synthetic */ Object h(SheetState sheetState, SheetValue sheetValue, FiniteAnimationSpec finiteAnimationSpec, float f2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = sheetState.f11008e.w();
        }
        return sheetState.g(sheetValue, finiteAnimationSpec, f2, continuation);
    }

    public final Object g(SheetValue sheetValue, FiniteAnimationSpec finiteAnimationSpec, float f2, Continuation continuation) {
        Object k2 = AnchoredDraggableState.k(this.f11008e, sheetValue, (MutatePriority) null, new SheetState$animateTo$2(this, f2, finiteAnimationSpec, (Continuation) null), continuation, 2, (Object) null);
        return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
    }

    public final Object i(Continuation continuation) {
        Function1 function1 = this.f11005b;
        SheetValue sheetValue = SheetValue.Expanded;
        if (!((Boolean) function1.invoke(sheetValue)).booleanValue()) {
            return Unit.f40552a;
        }
        Object h2 = h(this, sheetValue, this.f11009f, 0.0f, continuation, 4, (Object) null);
        return h2 == IntrinsicsKt.f() ? h2 : Unit.f40552a;
    }

    public final AnchoredDraggableState j() {
        return this.f11008e;
    }

    public final SheetValue k() {
        return (SheetValue) this.f11008e.t();
    }

    public final boolean l() {
        return this.f11008e.p().f(SheetValue.Expanded);
    }

    public final boolean m() {
        return this.f11008e.p().f(SheetValue.PartiallyExpanded);
    }

    public final float n() {
        return this.f11008e.x();
    }

    public final boolean o() {
        return this.f11006c;
    }

    public final boolean p() {
        return this.f11004a;
    }

    public final SheetValue q() {
        return (SheetValue) this.f11008e.y();
    }

    public final Object r(Continuation continuation) {
        if (!this.f11006c) {
            Function1 function1 = this.f11005b;
            SheetValue sheetValue = SheetValue.Hidden;
            if (!((Boolean) function1.invoke(sheetValue)).booleanValue()) {
                return Unit.f40552a;
            }
            Object h2 = h(this, sheetValue, this.f11010g, 0.0f, continuation, 4, (Object) null);
            return h2 == IntrinsicsKt.f() ? h2 : Unit.f40552a;
        }
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
    }

    public final boolean s() {
        return this.f11008e.t() != SheetValue.Hidden;
    }

    public final Object t(Continuation continuation) {
        if (!this.f11004a) {
            Function1 function1 = this.f11005b;
            SheetValue sheetValue = SheetValue.PartiallyExpanded;
            if (!((Boolean) function1.invoke(sheetValue)).booleanValue()) {
                return Unit.f40552a;
            }
            Object h2 = h(this, sheetValue, this.f11010g, 0.0f, continuation, 4, (Object) null);
            return h2 == IntrinsicsKt.f() ? h2 : Unit.f40552a;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
    }

    public final float u() {
        return this.f11008e.C();
    }

    public final void v(AnimationSpec animationSpec) {
        this.f11007d = animationSpec;
    }

    public final void w(FiniteAnimationSpec finiteAnimationSpec) {
        this.f11010g = finiteAnimationSpec;
    }

    public final void x(FiniteAnimationSpec finiteAnimationSpec) {
        this.f11009f = finiteAnimationSpec;
    }

    public final Object y(float f2, Continuation continuation) {
        Object I = this.f11008e.I(f2, continuation);
        return I == IntrinsicsKt.f() ? I : Unit.f40552a;
    }

    public final Object z(Continuation continuation) {
        SheetValue sheetValue = m() ? SheetValue.PartiallyExpanded : SheetValue.Expanded;
        if (!((Boolean) this.f11005b.invoke(sheetValue)).booleanValue()) {
            return Unit.f40552a;
        }
        Object h2 = h(this, sheetValue, this.f11009f, 0.0f, continuation, 4, (Object) null);
        return h2 == IntrinsicsKt.f() ? h2 : Unit.f40552a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SheetState(boolean r8, kotlin.jvm.functions.Function0 r9, kotlin.jvm.functions.Function0 r10, androidx.compose.material3.SheetValue r11, kotlin.jvm.functions.Function1 r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L_0x0006
            androidx.compose.material3.SheetValue r11 = androidx.compose.material3.SheetValue.Hidden
        L_0x0006:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto L_0x0010
            androidx.compose.material3.T5 r12 = new androidx.compose.material3.T5
            r12.<init>()
        L_0x0010:
            r5 = r12
            r11 = r14 & 32
            if (r11 == 0) goto L_0x0016
            r13 = 0
        L_0x0016:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SheetState.<init>(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.material3.SheetValue, kotlin.jvm.functions.Function1, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
