package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    public AnimationSpec N;
    public Alignment O;
    public Function2 P;
    public long Q = AnimationModifierKt.a();
    public long R = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);
    public boolean S;
    public final MutableState T = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    @Metadata
    public static final class AnimData {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f2388a;

        /* renamed from: b  reason: collision with root package name */
        public long f2389b;

        public /* synthetic */ AnimData(Animatable animatable, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j2);
        }

        public final Animatable a() {
            return this.f2388a;
        }

        public final long b() {
            return this.f2389b;
        }

        public final void c(long j2) {
            this.f2389b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return Intrinsics.d(this.f2388a, animData.f2388a) && IntSize.e(this.f2389b, animData.f2389b);
        }

        public int hashCode() {
            return (this.f2388a.hashCode() * 31) + IntSize.h(this.f2389b);
        }

        public String toString() {
            return "AnimData(anim=" + this.f2388a + ", startSize=" + IntSize.i(this.f2389b) + ')';
        }

        public AnimData(Animatable animatable, long j2) {
            this.f2388a = animatable;
            this.f2389b = j2;
        }
    }

    public SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, Function2 function2) {
        this.N = animationSpec;
        this.O = alignment;
        this.P = function2;
    }

    private final void i3(long j2) {
        this.R = j2;
        this.S = true;
    }

    public void I2() {
        super.I2();
        this.Q = AnimationModifierKt.a();
        this.S = false;
    }

    public void K2() {
        super.K2();
        f3((AnimData) null);
    }

    public final long Z2(long j2) {
        long j3 = j2;
        AnimData b3 = b3();
        boolean z2 = true;
        if (b3 != null) {
            if (IntSize.e(j3, ((IntSize) b3.a().m()).j()) || b3.a().p()) {
                z2 = false;
            }
            if (!IntSize.e(j3, ((IntSize) b3.a().k()).j()) || z2) {
                b3.c(((IntSize) b3.a().m()).j());
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new SizeAnimationModifierNode$animateTo$data$1$1(b3, j2, this, (Continuation) null), 3, (Object) null);
            }
        } else {
            long j4 = (long) 1;
            b3 = new AnimData(new Animatable(IntSize.b(j2), VectorConvertersKt.h(IntSize.f19170b), IntSize.b(IntSize.c((j4 & 4294967295L) | (j4 << 32))), (String) null, 8, (DefaultConstructorMarker) null), j3, (DefaultConstructorMarker) null);
        }
        f3(b3);
        return ((IntSize) b3.a().m()).j();
    }

    public final Alignment a3() {
        return this.O;
    }

    public final AnimData b3() {
        return (AnimData) this.T.getValue();
    }

    public final AnimationSpec c3() {
        return this.N;
    }

    public final Function2 d3() {
        return this.P;
    }

    public final void e3(Alignment alignment) {
        this.O = alignment;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0;
        long j3;
        long j4 = j2;
        if (measureScope.w1()) {
            i3(j4);
            c0 = measurable.c0(j2);
        } else {
            c0 = measurable.c0(j3(j4));
        }
        Placeable placeable = c0;
        long c2 = IntSize.c((((long) placeable.L0()) << 32) | (((long) placeable.C0()) & 4294967295L));
        if (measureScope.w1()) {
            this.Q = c2;
            j3 = c2;
        } else {
            j3 = ConstraintsKt.d(j4, Z2(AnimationModifierKt.b(this.Q) ? this.Q : c2));
        }
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        return MeasureScope.R1(measureScope, i2, i3, (Map) null, new SizeAnimationModifierNode$measure$2(this, c2, i2, i3, measureScope, placeable), 4, (Object) null);
    }

    public final void f3(AnimData animData) {
        this.T.setValue(animData);
    }

    public final void g3(AnimationSpec animationSpec) {
        this.N = animationSpec;
    }

    public final void h3(Function2 function2) {
        this.P = function2;
    }

    public final long j3(long j2) {
        return this.S ? this.R : j2;
    }
}
