package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    public Transition N;
    public Transition.DeferredAnimation O;
    public Transition.DeferredAnimation P;
    public Transition.DeferredAnimation Q;
    public EnterTransition R;
    public ExitTransition S;
    public Function0 T;
    public GraphicsLayerBlockForEnterExit U;
    public boolean V;
    public long W = AnimationModifierKt.a();
    public long X = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);
    public Alignment Y;
    public final Function1 Z = new EnterExitTransitionModifierNode$sizeTransitionSpec$1(this);
    public final Function1 a0 = new EnterExitTransitionModifierNode$slideSpec$1(this);

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2259a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.animation.EnterExitState[] r0 = androidx.compose.animation.EnterExitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f2259a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.<clinit>():void");
        }
    }

    public EnterExitTransitionModifierNode(Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, Function0 function0, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.N = transition;
        this.O = deferredAnimation;
        this.P = deferredAnimation2;
        this.Q = deferredAnimation3;
        this.R = enterTransition;
        this.S = exitTransition;
        this.T = function0;
        this.U = graphicsLayerBlockForEnterExit;
    }

    public void I2() {
        super.I2();
        this.V = false;
        this.W = AnimationModifierKt.a();
    }

    public final Alignment Z2() {
        Alignment a2;
        if (this.N.o().c(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize a3 = this.R.b().a();
            if (a3 == null || (a2 = a3.a()) == null) {
                ChangeSize a4 = this.S.b().a();
                if (a4 != null) {
                    return a4.a();
                }
                return null;
            }
        } else {
            ChangeSize a5 = this.S.b().a();
            if (a5 == null || (a2 = a5.a()) == null) {
                ChangeSize a6 = this.R.b().a();
                if (a6 != null) {
                    return a6.a();
                }
                return null;
            }
        }
        return a2;
    }

    public final EnterTransition a3() {
        return this.R;
    }

    public final ExitTransition b3() {
        return this.S;
    }

    public final void c3(Function0 function0) {
        this.T = function0;
    }

    public final void d3(EnterTransition enterTransition) {
        this.R = enterTransition;
    }

    public final void e3(ExitTransition exitTransition) {
        this.S = exitTransition;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        State a2;
        State a3;
        long j3 = j2;
        State state = null;
        if (this.N.i() == this.N.q()) {
            this.Y = null;
        } else if (this.Y == null) {
            Alignment Z2 = Z2();
            if (Z2 == null) {
                Z2 = Alignment.f15444a.o();
            }
            this.Y = Z2;
        }
        if (measureScope.w1()) {
            Placeable c0 = measurable.c0(j2);
            long c2 = IntSize.c((((long) c0.L0()) << 32) | (((long) c0.C0()) & 4294967295L));
            this.W = c2;
            g3(j3);
            return MeasureScope.R1(measureScope, (int) (c2 >> 32), (int) (c2 & 4294967295L), (Map) null, new EnterExitTransitionModifierNode$measure$1(c0), 4, (Object) null);
        } else if (((Boolean) this.T.invoke()).booleanValue()) {
            Function1 a4 = this.U.a();
            Placeable c02 = measurable.c0(j2);
            long c3 = IntSize.c((((long) c02.L0()) << 32) | (((long) c02.C0()) & 4294967295L));
            long j4 = AnimationModifierKt.b(this.W) ? this.W : c3;
            Transition.DeferredAnimation deferredAnimation = this.O;
            if (deferredAnimation != null) {
                state = deferredAnimation.a(this.Z, new EnterExitTransitionModifierNode$measure$animSize$1(this, j4));
            }
            if (state != null) {
                c3 = ((IntSize) state.getValue()).j();
            }
            long d2 = ConstraintsKt.d(j3, c3);
            Transition.DeferredAnimation deferredAnimation2 = this.P;
            long b2 = (deferredAnimation2 == null || (a3 = deferredAnimation2.a(EnterExitTransitionModifierNode$measure$offsetDelta$1.f2267z, new EnterExitTransitionModifierNode$measure$offsetDelta$2(this, j4))) == null) ? IntOffset.f19160b.b() : ((IntOffset) a3.getValue()).r();
            Transition.DeferredAnimation deferredAnimation3 = this.Q;
            long b3 = (deferredAnimation3 == null || (a2 = deferredAnimation3.a(this.a0, new EnterExitTransitionModifierNode$measure$slideOffset$1(this, j4))) == null) ? IntOffset.f19160b.b() : ((IntOffset) a2.getValue()).r();
            Alignment alignment = this.Y;
            return MeasureScope.R1(measureScope, (int) (d2 >> 32), (int) (d2 & 4294967295L), (Map) null, new EnterExitTransitionModifierNode$measure$2(c02, IntOffset.o(alignment != null ? alignment.a(j4, d2, LayoutDirection.Ltr) : IntOffset.f19160b.b(), b3), b2, a4), 4, (Object) null);
        } else {
            Placeable c03 = measurable.c0(j2);
            return MeasureScope.R1(measureScope, c03.L0(), c03.C0(), (Map) null, new EnterExitTransitionModifierNode$measure$3$1(c03), 4, (Object) null);
        }
    }

    public final void f3(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.U = graphicsLayerBlockForEnterExit;
    }

    public final void g3(long j2) {
        this.V = true;
        this.X = j2;
    }

    public final void h3(Transition.DeferredAnimation deferredAnimation) {
        this.P = deferredAnimation;
    }

    public final void i3(Transition.DeferredAnimation deferredAnimation) {
        this.O = deferredAnimation;
    }

    public final void j3(Transition.DeferredAnimation deferredAnimation) {
        this.Q = deferredAnimation;
    }

    public final void k3(Transition transition) {
        this.N = transition;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r2 = r2.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l3(androidx.compose.animation.EnterExitState r2, long r3) {
        /*
            r1 = this;
            int[] r0 = androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.f2259a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L_0x0058
            r0 = 2
            if (r2 == r0) goto L_0x0038
            r0 = 3
            if (r2 != r0) goto L_0x0032
            androidx.compose.animation.ExitTransition r2 = r1.S
            androidx.compose.animation.TransitionData r2 = r2.b()
            androidx.compose.animation.ChangeSize r2 = r2.a()
            if (r2 == 0) goto L_0x0058
            kotlin.jvm.functions.Function1 r2 = r2.d()
            if (r2 == 0) goto L_0x0058
            androidx.compose.ui.unit.IntSize r3 = androidx.compose.ui.unit.IntSize.b(r3)
            java.lang.Object r2 = r2.invoke(r3)
            androidx.compose.ui.unit.IntSize r2 = (androidx.compose.ui.unit.IntSize) r2
            long r3 = r2.j()
            goto L_0x0058
        L_0x0032:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L_0x0038:
            androidx.compose.animation.EnterTransition r2 = r1.R
            androidx.compose.animation.TransitionData r2 = r2.b()
            androidx.compose.animation.ChangeSize r2 = r2.a()
            if (r2 == 0) goto L_0x0058
            kotlin.jvm.functions.Function1 r2 = r2.d()
            if (r2 == 0) goto L_0x0058
            androidx.compose.ui.unit.IntSize r3 = androidx.compose.ui.unit.IntSize.b(r3)
            java.lang.Object r2 = r2.invoke(r3)
            androidx.compose.ui.unit.IntSize r2 = (androidx.compose.ui.unit.IntSize) r2
            long r3 = r2.j()
        L_0x0058:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionModifierNode.l3(androidx.compose.animation.EnterExitState, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m3(androidx.compose.animation.EnterExitState r4, long r5) {
        /*
            r3 = this;
            androidx.compose.animation.EnterTransition r0 = r3.R
            androidx.compose.animation.TransitionData r0 = r0.b()
            androidx.compose.animation.Slide r0 = r0.f()
            if (r0 == 0) goto L_0x0021
            kotlin.jvm.functions.Function1 r0 = r0.b()
            if (r0 == 0) goto L_0x0021
            androidx.compose.ui.unit.IntSize r1 = androidx.compose.ui.unit.IntSize.b(r5)
            java.lang.Object r0 = r0.invoke(r1)
            androidx.compose.ui.unit.IntOffset r0 = (androidx.compose.ui.unit.IntOffset) r0
            long r0 = r0.r()
            goto L_0x0027
        L_0x0021:
            androidx.compose.ui.unit.IntOffset$Companion r0 = androidx.compose.ui.unit.IntOffset.f19160b
            long r0 = r0.b()
        L_0x0027:
            androidx.compose.animation.ExitTransition r2 = r3.S
            androidx.compose.animation.TransitionData r2 = r2.b()
            androidx.compose.animation.Slide r2 = r2.f()
            if (r2 == 0) goto L_0x0048
            kotlin.jvm.functions.Function1 r2 = r2.b()
            if (r2 == 0) goto L_0x0048
            androidx.compose.ui.unit.IntSize r5 = androidx.compose.ui.unit.IntSize.b(r5)
            java.lang.Object r5 = r2.invoke(r5)
            androidx.compose.ui.unit.IntOffset r5 = (androidx.compose.ui.unit.IntOffset) r5
            long r5 = r5.r()
            goto L_0x004e
        L_0x0048:
            androidx.compose.ui.unit.IntOffset$Companion r5 = androidx.compose.ui.unit.IntOffset.f19160b
            long r5 = r5.b()
        L_0x004e:
            int[] r2 = androidx.compose.animation.EnterExitTransitionModifierNode.WhenMappings.f2259a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L_0x0067
            r2 = 2
            if (r4 == r2) goto L_0x006d
            r0 = 3
            if (r4 != r0) goto L_0x0061
            r0 = r5
            goto L_0x006d
        L_0x0061:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0067:
            androidx.compose.ui.unit.IntOffset$Companion r4 = androidx.compose.ui.unit.IntOffset.f19160b
            long r0 = r4.b()
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionModifierNode.m3(androidx.compose.animation.EnterExitState, long):long");
    }

    public final long n3(EnterExitState enterExitState, long j2) {
        if (this.Y == null) {
            return IntOffset.f19160b.b();
        }
        if (Z2() == null) {
            return IntOffset.f19160b.b();
        }
        if (Intrinsics.d(this.Y, Z2())) {
            return IntOffset.f19160b.b();
        }
        int i2 = WhenMappings.f2259a[enterExitState.ordinal()];
        if (i2 == 1) {
            return IntOffset.f19160b.b();
        }
        if (i2 == 2) {
            return IntOffset.f19160b.b();
        }
        if (i2 == 3) {
            ChangeSize a2 = this.S.b().a();
            if (a2 == null) {
                return IntOffset.f19160b.b();
            }
            long j3 = ((IntSize) a2.d().invoke(IntSize.b(j2))).j();
            Alignment Z2 = Z2();
            Intrinsics.f(Z2);
            long j4 = j2;
            long j5 = j3;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            long a3 = Z2.a(j4, j5, layoutDirection);
            Alignment alignment = this.Y;
            Intrinsics.f(alignment);
            return IntOffset.n(a3, alignment.a(j4, j5, layoutDirection));
        }
        throw new NoWhenBranchMatchedException();
    }
}
