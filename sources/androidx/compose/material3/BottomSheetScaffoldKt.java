package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class BottomSheetScaffoldKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9294a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f9294a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void i(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function0 function0, SheetState sheetState, Composer composer, int i2) {
        int i3;
        Function2 function25 = function2;
        Function2 function26 = function22;
        Function2 function27 = function23;
        Function2 function28 = function24;
        Function0 function02 = function0;
        SheetState sheetState2 = sheetState;
        int i4 = i2;
        boolean z2 = true;
        Composer q2 = composer.q(-1217723575);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function25) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function26) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function27) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function28) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function02) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.W(sheetState2) ? 131072 : 65536;
        }
        if (q2.E((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1217723575, i3, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:413)");
            }
            List p2 = CollectionsKt.p(function25 == null ? ComposableSingletons$BottomSheetScaffoldKt.f9540a.a() : function25, function26, function27, function28);
            boolean z3 = (458752 & i3) == 131072;
            if ((57344 & i3) != 16384) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(sheetState2, function02);
                q2.N(g2);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) g2;
            Modifier.Companion companion = Modifier.f15489d;
            Function2 b2 = LayoutKt.b(p2);
            boolean W = q2.W(multiContentMeasurePolicy);
            Object g3 = q2.g();
            if (W || g3 == Composer.f14567a.a()) {
                g3 = MultiContentMeasurePolicyKt.a(multiContentMeasurePolicy);
                q2.N(g3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g3;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, measurePolicy, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            b2.m(q2, 0);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new P(function2, function22, function23, function24, function0, sheetState, i2));
        }
    }

    public static final Unit j(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function0 function0, SheetState sheetState, int i2, Composer composer, int i3) {
        i(function2, function22, function23, function24, function0, sheetState, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void k(SheetState sheetState, float f2, float f3, boolean z2, Shape shape, long j2, long j3, float f4, float f5, Function2 function2, Function3 function3, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Composer composer2;
        Object obj;
        Modifier modifier;
        SheetState sheetState2 = sheetState;
        float f6 = f2;
        float f7 = f3;
        boolean z3 = z2;
        int i6 = i2;
        Composer q2 = composer.q(-2108849428);
        if ((i6 & 6) == 0) {
            i4 = (q2.W(sheetState2) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        if ((i6 & 48) == 0) {
            i4 |= q2.h(f6) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i4 |= q2.h(f7) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i4 |= q2.d(z3) ? 2048 : 1024;
        }
        Shape shape2 = shape;
        if ((i6 & 24576) == 0) {
            i4 |= q2.W(shape2) ? 16384 : 8192;
        }
        long j4 = j2;
        if ((196608 & i6) == 0) {
            i4 |= q2.j(j4) ? 131072 : 65536;
        }
        long j5 = j3;
        if ((1572864 & i6) == 0) {
            i4 |= q2.j(j5) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i4 |= q2.h(f4) ? 8388608 : 4194304;
        } else {
            float f8 = f4;
        }
        float f9 = f5;
        if ((i6 & 100663296) == 0) {
            i4 |= q2.h(f9) ? 67108864 : 33554432;
        }
        Function2 function22 = function2;
        if ((i6 & 805306368) == 0) {
            i4 |= q2.l(function22) ? 536870912 : 268435456;
        }
        Function3 function32 = function3;
        if ((i3 & 6) == 0) {
            i5 = i3 | (q2.l(function32) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (q2.E(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2108849428, i4, i5, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:235)");
            }
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
            FiniteAnimationSpec b2 = MotionSchemeKt.b(motionSchemeKeyTokens, q2, 6);
            FiniteAnimationSpec b3 = MotionSchemeKt.b(motionSchemeKeyTokens, q2, 6);
            FiniteAnimationSpec b4 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, q2, 6);
            int i7 = i4 & 14;
            boolean l2 = (i7 == 4) | q2.l(b3) | q2.l(b4) | q2.l(b2);
            int i8 = i4;
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new J(sheetState2, b3, b4, b2);
                q2.N(g2);
            }
            EffectsKt.h((Function0) g2, q2, 0);
            Object g3 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g3 == companion.a()) {
                g3 = EffectsKt.j(EmptyCoroutineContext.f40721z, q2);
                q2.N(g3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) g3;
            Orientation orientation = Orientation.Vertical;
            float B1 = ((Density) q2.C(CompositionLocalsKt.g())).B1(f6);
            if (z3) {
                q2.X(2049456610);
                Modifier.Companion companion2 = Modifier.f15489d;
                boolean W = q2.W(sheetState.j());
                Object g4 = q2.g();
                if (W || g4 == companion.a()) {
                    g4 = SheetDefaultsKt.f(sheetState2, orientation, new K(coroutineScope, sheetState2));
                    q2.N(g4);
                }
                obj = null;
                modifier = NestedScrollModifierKt.b(companion2, (NestedScrollConnection) g4, (NestedScrollDispatcher) null, 2, (Object) null);
                q2.M();
            } else {
                obj = null;
                q2.X(2049851798);
                q2.M();
                modifier = Modifier.f15489d;
            }
            Modifier o0 = SizeKt.n(SizeKt.h(SizeKt.A(Modifier.f15489d, 0.0f, f7, 1, obj), 0.0f, 1, obj), f6, 0.0f, 2, obj).o0(modifier);
            AnchoredDraggableState j6 = sheetState.j();
            boolean h2 = (i7 == 4) | q2.h(B1);
            Object g5 = q2.g();
            if (h2 || g5 == companion.a()) {
                g5 = new L(sheetState2, B1);
                q2.N(g5);
            }
            Composer composer3 = q2;
            int i9 = i8 >> 9;
            int i10 = (i9 & 112) | 12582912 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752);
            composer2 = composer3;
            SurfaceKt.c(u(AnchoredDraggableKt.e(AnchoredDraggableKt.g(o0, j6, orientation, (Function2) g5), sheetState.j(), orientation, z2, false, (MutableInteractionSource) null, 24, (Object) null), sheetState2), shape, j2, j3, f4, f5, (BorderStroke) null, ComposableLambdaKt.e(1508311921, true, new BottomSheetScaffoldKt$StandardBottomSheet$3(sheetState, function2, function3, coroutineScope, z2), composer3, 54), composer2, i10, 64);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            M m2 = r0;
            M m3 = new M(sheetState, f2, f3, z2, shape, j2, j3, f4, f5, function2, function3, i2, i3);
            x2.a(m2);
        }
    }

    public static final Unit l(CoroutineScope coroutineScope, SheetState sheetState, float f2) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1(sheetState, f2, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r5.f(r6) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r5.f(r6) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r5.f(r6) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair m(androidx.compose.material3.SheetState r4, float r5, androidx.compose.ui.unit.IntSize r6, androidx.compose.ui.unit.Constraints r7) {
        /*
            long r0 = r7.r()
            int r7 = androidx.compose.ui.unit.Constraints.k(r0)
            float r7 = (float) r7
            long r0 = r6.j()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r6 = (int) r0
            float r6 = (float) r6
            androidx.compose.material3.O r0 = new androidx.compose.material3.O
            r0.<init>(r4, r7, r5, r6)
            androidx.compose.material3.internal.DraggableAnchors r5 = androidx.compose.material3.internal.AnchoredDraggableKt.a(r0)
            androidx.compose.material3.internal.AnchoredDraggableState r4 = r4.j()
            java.lang.Object r4 = r4.y()
            androidx.compose.material3.SheetValue r4 = (androidx.compose.material3.SheetValue) r4
            int[] r6 = androidx.compose.material3.BottomSheetScaffoldKt.WhenMappings.f9294a
            int r7 = r4.ordinal()
            r6 = r6[r7]
            r7 = 1
            if (r6 == r7) goto L_0x0076
            r7 = 2
            if (r6 == r7) goto L_0x005b
            r7 = 3
            if (r6 != r7) goto L_0x0055
            androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.Expanded
            boolean r7 = r5.f(r6)
            if (r7 == 0) goto L_0x0043
        L_0x0041:
            r4 = r6
            goto L_0x007f
        L_0x0043:
            androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.PartiallyExpanded
            boolean r7 = r5.f(r6)
            if (r7 == 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.Hidden
            boolean r7 = r5.f(r6)
            if (r7 == 0) goto L_0x007f
            goto L_0x0041
        L_0x0055:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x005b:
            androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.PartiallyExpanded
            boolean r7 = r5.f(r6)
            if (r7 == 0) goto L_0x0064
            goto L_0x0041
        L_0x0064:
            androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.Expanded
            boolean r7 = r5.f(r6)
            if (r7 == 0) goto L_0x006d
            goto L_0x0041
        L_0x006d:
            androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.Hidden
            boolean r7 = r5.f(r6)
            if (r7 == 0) goto L_0x007f
            goto L_0x0041
        L_0x0076:
            androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.Hidden
            boolean r7 = r5.f(r6)
            if (r7 == 0) goto L_0x007f
            goto L_0x0041
        L_0x007f:
            kotlin.Pair r4 = kotlin.TuplesKt.a(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m(androidx.compose.material3.SheetState, float, androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.Constraints):kotlin.Pair");
    }

    public static final Unit n(SheetState sheetState, float f2, float f3, float f4, DraggableAnchorsConfig draggableAnchorsConfig) {
        if (!sheetState.p()) {
            draggableAnchorsConfig.a(SheetValue.PartiallyExpanded, f2 - f3);
        }
        if (f4 != f3) {
            draggableAnchorsConfig.a(SheetValue.Expanded, Math.max(f2 - f4, 0.0f));
        }
        if (!sheetState.o()) {
            draggableAnchorsConfig.a(SheetValue.Hidden, f2);
        }
        return Unit.f40552a;
    }

    public static final Unit o(SheetState sheetState, float f2, float f3, boolean z2, Shape shape, long j2, long j3, float f4, float f5, Function2 function2, Function3 function3, int i2, int i3, Composer composer, int i4) {
        k(sheetState, f2, f3, z2, shape, j2, j3, f4, f5, function2, function3, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }

    public static final Unit p(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        sheetState.x(finiteAnimationSpec);
        sheetState.w(finiteAnimationSpec2);
        sheetState.v(finiteAnimationSpec3);
        return Unit.f40552a;
    }

    public static final Modifier s(Modifier modifier, SheetState sheetState) {
        return GraphicsLayerModifierKt.a(modifier, new I(sheetState));
    }

    public static final Unit t(SheetState sheetState, GraphicsLayerScope graphicsLayerScope) {
        float x2 = sheetState.j().x();
        float d2 = sheetState.j().p().d();
        float f2 = x2 < d2 ? d2 - x2 : 0.0f;
        graphicsLayerScope.i(f2 > 0.0f ? ((float) 1) / ((Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L)) + f2) / Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L))) : 1.0f);
        graphicsLayerScope.Q1(TransformOriginKt.a(0.5f, 0.0f));
        return Unit.f40552a;
    }

    public static final Modifier u(Modifier modifier, SheetState sheetState) {
        return GraphicsLayerModifierKt.a(modifier, new N(sheetState));
    }

    public static final Unit v(SheetState sheetState, GraphicsLayerScope graphicsLayerScope) {
        float x2 = sheetState.j().x();
        float d2 = sheetState.j().p().d();
        float f2 = x2 < d2 ? d2 - x2 : 0.0f;
        graphicsLayerScope.i(f2 > 0.0f ? (Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & graphicsLayerScope.c())) : 1.0f);
        graphicsLayerScope.Q1(TransformOriginKt.a(0.5f, 0.0f));
        return Unit.f40552a;
    }
}
