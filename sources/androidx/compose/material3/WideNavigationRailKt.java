package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationRailBaselineItemTokens;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.material3.tokens.NavigationRailExpandedTokens;
import androidx.compose.material3.tokens.NavigationRailHorizontalItemTokens;
import androidx.compose.material3.tokens.NavigationRailVerticalItemTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

@Metadata
public final class WideNavigationRailKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11742a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f11743b = Dp.m((float) 20);

    /* renamed from: c  reason: collision with root package name */
    public static final float f11744c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f11745d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f11746e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f11747f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f11748g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f11749h;

    /* renamed from: i  reason: collision with root package name */
    public static final float f11750i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f11751j;

    /* renamed from: k  reason: collision with root package name */
    public static final float f11752k;

    /* renamed from: l  reason: collision with root package name */
    public static final float f11753l = Dp.m((float) 24);

    /* renamed from: m  reason: collision with root package name */
    public static final float f11754m = Dp.m((float) 48);

    /* renamed from: n  reason: collision with root package name */
    public static final ProvidableCompositionLocal f11755n = CompositionLocalKt.h((SnapshotMutationPolicy) null, new n8(), 1, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public static final ProvidableCompositionLocal f11756o = CompositionLocalKt.h((SnapshotMutationPolicy) null, new q8(), 1, (Object) null);

    static {
        NavigationRailVerticalItemTokens navigationRailVerticalItemTokens = NavigationRailVerticalItemTokens.f13666a;
        float b2 = navigationRailVerticalItemTokens.b();
        NavigationRailBaselineItemTokens navigationRailBaselineItemTokens = NavigationRailBaselineItemTokens.f13620a;
        float f2 = (float) 2;
        f11742a = Dp.m(Dp.m(b2 - navigationRailBaselineItemTokens.c()) / f2);
        NavigationRailCollapsedTokens navigationRailCollapsedTokens = NavigationRailCollapsedTokens.f13630a;
        f11744c = navigationRailCollapsedTokens.d();
        f11745d = navigationRailBaselineItemTokens.b();
        f11746e = navigationRailCollapsedTokens.a();
        NavigationRailExpandedTokens navigationRailExpandedTokens = NavigationRailExpandedTokens.f13650a;
        f11747f = navigationRailExpandedTokens.b();
        f11748g = navigationRailExpandedTokens.a();
        f11749h = navigationRailBaselineItemTokens.a();
        f11750i = Dp.m(Dp.m(navigationRailVerticalItemTokens.a() - navigationRailBaselineItemTokens.c()) / f2);
        f11751j = Dp.m(Dp.m(navigationRailVerticalItemTokens.b() - navigationRailBaselineItemTokens.c()) / f2);
        f11752k = Dp.m(Dp.m(NavigationRailHorizontalItemTokens.f13659a.a() - navigationRailBaselineItemTokens.c()) / f2);
    }

    public static final Unit A(long j2, State state, DrawScope drawScope) {
        DrawScope.A1(drawScope, j2, 0, 0, RangesKt.n(v(state), 0.0f, 1.0f), (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit B(long j2, Function1 function1, boolean z2, int i2, Composer composer, int i3) {
        u(j2, function1, z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void C(Modifier modifier, boolean z2, boolean z3, WideNavigationRailColors wideNavigationRailColors, Shape shape, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, Function2 function22, Composer composer, int i2) {
        int i3;
        Composer composer2;
        float t2;
        boolean z4 = z2;
        boolean z5 = z3;
        int i4 = i2;
        Composer q2 = composer.q(-1004308036);
        Modifier modifier2 = modifier;
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.d(z4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z5) ? 256 : 128;
        }
        WideNavigationRailColors wideNavigationRailColors2 = wideNavigationRailColors;
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(wideNavigationRailColors2) ? 2048 : 1024;
        }
        Shape shape2 = shape;
        if ((i4 & 24576) == 0) {
            i3 |= q2.W(shape2) ? 16384 : 8192;
        }
        Function2 function23 = function2;
        if ((196608 & i4) == 0) {
            i3 |= q2.l(function23) ? 131072 : 65536;
        }
        WindowInsets windowInsets2 = windowInsets;
        if ((1572864 & i4) == 0) {
            i3 |= q2.W(windowInsets2) ? 1048576 : 524288;
        }
        Arrangement.Vertical vertical2 = vertical;
        if ((i4 & 12582912) == 0) {
            i3 |= q2.W(vertical2) ? 8388608 : 4194304;
        }
        Function2 function24 = function22;
        if ((100663296 & i4) == 0) {
            i3 |= q2.l(function24) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (q2.E((38347923 & i5) != 38347922, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1004308036, i5, -1, "androidx.compose.material3.WideNavigationRailLayout (WideNavigationRail.kt:218)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = SnapshotIntStateKt.a(0);
                q2.N(g2);
            }
            MutableIntState mutableIntState = (MutableIntState) g2;
            Object g3 = q2.g();
            if (g3 == companion.a()) {
                g3 = SnapshotIntStateKt.a(0);
                q2.N(g3);
            }
            MutableIntState mutableIntState2 = (MutableIntState) g3;
            if (Dp.o(((Dp) q2.C(InteractiveComponentSizeKt.e())).t(), Dp.f19144A.c())) {
                q2.X(-597966102);
                q2.M();
                t2 = Dp.m((float) 0);
            } else {
                q2.X(-597931134);
                t2 = ((Dp) q2.C(InteractiveComponentSizeKt.e())).t();
                q2.M();
            }
            float f2 = t2;
            FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultSpatial, q2, 6);
            FiniteAnimationSpec b3 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, q2, 6);
            int i6 = i5;
            State c2 = AnimateAsStateKt.c(!z5 ? f11746e : f11747f, !z4 ? b2 : b3, (String) null, (Function1) null, q2, 0, 12);
            State c3 = AnimateAsStateKt.c(!z5 ? f11746e : f11748g, !z4 ? b2 : b3, (String) null, (Function1) null, q2, 0, 12);
            State c4 = AnimateAsStateKt.c(!z5 ? NavigationRailCollapsedTokens.f13630a.b() : Dp.m((float) 0), b2, (String) null, (Function1) null, q2, 0, 12);
            State c5 = AnimateAsStateKt.c(!z5 ? f11749h : f2, b2, (String) null, (Function1) null, q2, 0, 12);
            long a2 = !z4 ? wideNavigationRailColors.a() : wideNavigationRailColors.c();
            long b4 = !z4 ? wideNavigationRailColors.b() : wideNavigationRailColors.d();
            WideNavigationRailKt$WideNavigationRailLayout$1 wideNavigationRailKt$WideNavigationRailLayout$1 = r3;
            State state = c4;
            composer2 = q2;
            WideNavigationRailKt$WideNavigationRailLayout$1 wideNavigationRailKt$WideNavigationRailLayout$12 = new WideNavigationRailKt$WideNavigationRailLayout$1(windowInsets, function2, z3, c2, f2, c5, c3, mutableIntState2, mutableIntState, vertical, state, function22);
            SurfaceKt.c(modifier, shape, a2, b4, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(-1489314345, true, wideNavigationRailKt$WideNavigationRailLayout$1, composer2, 54), composer2, (i6 & 14) | 12582912 | ((i6 >> 9) & 112), 112);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new o8(modifier, z2, z3, wideNavigationRailColors, shape, function2, windowInsets, vertical, function22, i2));
        }
    }

    public static final float D(State state) {
        return ((Dp) state.getValue()).t();
    }

    public static final float E(State state) {
        return ((Dp) state.getValue()).t();
    }

    public static final Unit F(Modifier modifier, boolean z2, boolean z3, WideNavigationRailColors wideNavigationRailColors, Shape shape, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, Function2 function22, int i2, Composer composer, int i3) {
        C(modifier, z2, z3, wideNavigationRailColors, shape, function2, windowInsets, vertical, function22, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final int G(MutableIntState mutableIntState) {
        return mutableIntState.e();
    }

    public static final void H(MutableIntState mutableIntState, int i2) {
        mutableIntState.k(i2);
    }

    public static final int I(MutableIntState mutableIntState) {
        return mutableIntState.e();
    }

    public static final void J(MutableIntState mutableIntState, int i2) {
        mutableIntState.k(i2);
    }

    public static final float K(State state) {
        return ((Dp) state.getValue()).t();
    }

    public static final float L(State state) {
        return ((Dp) state.getValue()).t();
    }

    public static final float g0(GraphicsLayerScope graphicsLayerScope, float f2, boolean z2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.c() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f + (((z2 ? 1.0f : -1.0f) * MathHelpersKt.b(0.0f, Math.min(graphicsLayerScope.B1(f11753l), intBitsToFloat), f2)) / intBitsToFloat);
    }

    public static final float h0(GraphicsLayerScope graphicsLayerScope, float f2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.b(0.0f, Math.min(graphicsLayerScope.B1(f11754m), intBitsToFloat), f2) / intBitsToFloat);
    }

    public static final ModalWideNavigationRailOverride m() {
        return DefaultModalWideNavigationRailOverride.f9833a;
    }

    public static final WideNavigationRailOverride n() {
        return DefaultWideNavigationRailOverride.f9854a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: kotlin.jvm.functions.Function3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(boolean r43, boolean r44, androidx.compose.animation.core.Animatable r45, androidx.compose.material3.RailPredictiveBackState r46, kotlin.jvm.functions.Function2 r47, androidx.compose.ui.Modifier r48, androidx.compose.material3.ModalWideNavigationRailState r49, androidx.compose.material3.WideNavigationRailColors r50, androidx.compose.ui.graphics.Shape r51, float r52, kotlin.jvm.functions.Function2 r53, androidx.compose.foundation.layout.WindowInsets r54, boolean r55, androidx.compose.foundation.layout.Arrangement.Vertical r56, kotlin.jvm.functions.Function2 r57, androidx.compose.runtime.Composer r58, int r59, int r60) {
        /*
            r2 = r44
            r14 = r45
            r15 = r46
            r1 = r47
            r0 = r48
            r13 = r49
            r12 = r52
            r11 = r59
            r10 = r60
            r3 = -1593438005(0xffffffffa10610cb, float:-4.542319E-19)
            r4 = r58
            androidx.compose.runtime.Composer r8 = r4.q(r3)
            r4 = r11 & 6
            r7 = r43
            if (r4 != 0) goto L_0x002c
            boolean r4 = r8.d(r7)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r11
            goto L_0x002d
        L_0x002c:
            r4 = r11
        L_0x002d:
            r16 = r11 & 48
            r17 = 16
            if (r16 != 0) goto L_0x0040
            boolean r16 = r8.d(r2)
            if (r16 == 0) goto L_0x003c
            r16 = 32
            goto L_0x003e
        L_0x003c:
            r16 = r17
        L_0x003e:
            r4 = r4 | r16
        L_0x0040:
            r6 = r11 & 384(0x180, float:5.38E-43)
            r18 = 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x005b
            r6 = r11 & 512(0x200, float:7.175E-43)
            if (r6 != 0) goto L_0x004f
            boolean r6 = r8.W(r14)
            goto L_0x0053
        L_0x004f:
            boolean r6 = r8.l(r14)
        L_0x0053:
            if (r6 == 0) goto L_0x0058
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r6 = r18
        L_0x005a:
            r4 = r4 | r6
        L_0x005b:
            r6 = r11 & 3072(0xc00, float:4.305E-42)
            r20 = 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L_0x006d
            boolean r6 = r8.W(r15)
            if (r6 == 0) goto L_0x006a
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x006c
        L_0x006a:
            r6 = r20
        L_0x006c:
            r4 = r4 | r6
        L_0x006d:
            r6 = r11 & 24576(0x6000, float:3.4438E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            r23 = 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x0081
            boolean r6 = r8.l(r1)
            if (r6 == 0) goto L_0x007e
            r6 = r23
            goto L_0x0080
        L_0x007e:
            r6 = r22
        L_0x0080:
            r4 = r4 | r6
        L_0x0081:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x0092
            boolean r6 = r8.W(r0)
            if (r6 == 0) goto L_0x008f
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0091
        L_0x008f:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x0091:
            r4 = r4 | r6
        L_0x0092:
            r6 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x00a3
            boolean r6 = r8.l(r13)
            if (r6 == 0) goto L_0x00a0
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00a2
        L_0x00a0:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00a2:
            r4 = r4 | r6
        L_0x00a3:
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r11 & r24
            if (r6 != 0) goto L_0x00b9
            r6 = r50
            boolean r25 = r8.W(r6)
            if (r25 == 0) goto L_0x00b4
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00b6
        L_0x00b4:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x00b6:
            r4 = r4 | r25
            goto L_0x00bb
        L_0x00b9:
            r6 = r50
        L_0x00bb:
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r25 = r11 & r25
            r5 = r51
            if (r25 != 0) goto L_0x00d0
            boolean r26 = r8.W(r5)
            if (r26 == 0) goto L_0x00cc
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00ce
        L_0x00cc:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00ce:
            r4 = r4 | r26
        L_0x00d0:
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r26 = r11 & r26
            if (r26 != 0) goto L_0x00e3
            boolean r26 = r8.h(r12)
            if (r26 == 0) goto L_0x00df
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00e1
        L_0x00df:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00e1:
            r4 = r4 | r26
        L_0x00e3:
            r26 = r10 & 6
            r3 = r53
            if (r26 != 0) goto L_0x00f7
            boolean r27 = r8.l(r3)
            if (r27 == 0) goto L_0x00f2
            r16 = 4
            goto L_0x00f4
        L_0x00f2:
            r16 = 2
        L_0x00f4:
            r16 = r10 | r16
            goto L_0x00f9
        L_0x00f7:
            r16 = r10
        L_0x00f9:
            r27 = r10 & 48
            r9 = r54
            if (r27 != 0) goto L_0x0109
            boolean r28 = r8.W(r9)
            if (r28 == 0) goto L_0x0107
            r17 = 32
        L_0x0107:
            r16 = r16 | r17
        L_0x0109:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x011a
            r3 = r55
            boolean r17 = r8.d(r3)
            if (r17 == 0) goto L_0x0117
            r18 = 256(0x100, float:3.59E-43)
        L_0x0117:
            r16 = r16 | r18
            goto L_0x011c
        L_0x011a:
            r3 = r55
        L_0x011c:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x012d
            r3 = r56
            boolean r17 = r8.W(r3)
            if (r17 == 0) goto L_0x012a
            r20 = 2048(0x800, float:2.87E-42)
        L_0x012a:
            r16 = r16 | r20
            goto L_0x012f
        L_0x012d:
            r3 = r56
        L_0x012f:
            r3 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0142
            r3 = r57
            boolean r17 = r8.l(r3)
            if (r17 == 0) goto L_0x013d
            r22 = r23
        L_0x013d:
            r16 = r16 | r22
        L_0x013f:
            r3 = r16
            goto L_0x0145
        L_0x0142:
            r3 = r57
            goto L_0x013f
        L_0x0145:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r4 & r16
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x0159
            r5 = r3 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r5 == r6) goto L_0x0156
            goto L_0x0159
        L_0x0156:
            r5 = 0
        L_0x0157:
            r6 = 1
            goto L_0x015b
        L_0x0159:
            r5 = 1
            goto L_0x0157
        L_0x015b:
            r7 = r4 & 1
            boolean r5 = r8.E(r5, r7)
            if (r5 == 0) goto L_0x02c8
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0171
            java.lang.String r5 = "androidx.compose.material3.ModalWideNavigationRailContent (WideNavigationRail.kt:988)"
            r6 = -1593438005(0xffffffffa10610cb, float:-4.542319E-19)
            androidx.compose.runtime.ComposerKt.Y(r6, r4, r3, r5)
        L_0x0171:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r3 = r8.C(r3)
            androidx.compose.ui.unit.LayoutDirection r5 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r3 != r5) goto L_0x017f
            r6 = 1
            goto L_0x0180
        L_0x017f:
            r6 = 0
        L_0x0180:
            androidx.compose.material3.internal.Strings$Companion r3 = androidx.compose.material3.internal.Strings.f12320b
            int r3 = androidx.compose.material3.R.string.e0
            int r3 = androidx.compose.material3.internal.Strings.a(r3)
            r5 = 0
            java.lang.String r3 = androidx.compose.material3.internal.Strings_androidKt.b(r3, r8, r5)
            long r22 = r50.c()
            long r39 = r50.d()
            r5 = 0
            r7 = 0
            r9 = 1
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.A(r0, r5, r12, r9, r7)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.d(r10, r5, r9, r7)
            boolean r9 = r8.W(r3)
            java.lang.Object r10 = r8.g()
            if (r9 != 0) goto L_0x01b2
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x01ba
        L_0x01b2:
            androidx.compose.material3.r8 r10 = new androidx.compose.material3.r8
            r10.<init>(r3)
            r8.N(r10)
        L_0x01ba:
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r3 = 0
            r9 = 1
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r5, r3, r10, r9, r7)
            r10 = r4 & 896(0x380, float:1.256E-42)
            r3 = 256(0x100, float:3.59E-43)
            if (r10 == r3) goto L_0x01d5
            r3 = r4 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x01d3
            boolean r3 = r8.l(r14)
            if (r3 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r3 = 0
            goto L_0x01d6
        L_0x01d5:
            r3 = r9
        L_0x01d6:
            boolean r10 = r8.l(r13)
            r3 = r3 | r10
            r10 = r4 & 7168(0x1c00, float:1.0045E-41)
            r9 = 2048(0x800, float:2.87E-42)
            if (r10 != r9) goto L_0x01e3
            r9 = 1
            goto L_0x01e4
        L_0x01e3:
            r9 = 0
        L_0x01e4:
            r3 = r3 | r9
            boolean r9 = r8.d(r6)
            r3 = r3 | r9
            java.lang.Object r9 = r8.g()
            if (r3 != 0) goto L_0x01f8
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r9 != r3) goto L_0x0200
        L_0x01f8:
            androidx.compose.material3.s8 r9 = new androidx.compose.material3.s8
            r9.<init>(r14, r13, r15, r6)
            r8.N(r9)
        L_0x0200:
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.a(r5, r9)
            androidx.compose.material3.internal.AnchoredDraggableState r5 = r49.e()
            androidx.compose.foundation.gestures.Orientation r9 = androidx.compose.foundation.gestures.Orientation.Horizontal
            r10 = r4 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r10 != r7) goto L_0x0214
            r7 = 1
            goto L_0x0215
        L_0x0214:
            r7 = 0
        L_0x0215:
            boolean r10 = r8.d(r6)
            r7 = r7 | r10
            boolean r10 = r8.l(r13)
            r7 = r7 | r10
            java.lang.Object r10 = r8.g()
            if (r7 != 0) goto L_0x022d
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x0235
        L_0x022d:
            androidx.compose.material3.t8 r10 = new androidx.compose.material3.t8
            r10.<init>(r2, r6, r13)
            r8.N(r10)
        L_0x0235:
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            androidx.compose.ui.Modifier r28 = androidx.compose.material3.internal.AnchoredDraggableKt.g(r3, r5, r9, r10)
            androidx.compose.material3.internal.AnchoredDraggableState r3 = r49.e()
            androidx.compose.foundation.gestures.DraggableState r29 = r3.v()
            androidx.compose.material3.internal.AnchoredDraggableState r3 = r49.e()
            boolean r33 = r3.z()
            boolean r3 = r8.l(r1)
            java.lang.Object r5 = r8.g()
            if (r3 != 0) goto L_0x025d
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0266
        L_0x025d:
            androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1 r5 = new androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1
            r3 = 0
            r5.<init>(r1, r3)
            r8.N(r5)
        L_0x0266:
            r35 = r5
            kotlin.jvm.functions.Function3 r35 = (kotlin.jvm.functions.Function3) r35
            r37 = 168(0xa8, float:2.35E-43)
            r38 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r30 = r9
            r31 = r55
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.gestures.DraggableKt.h(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$5 r10 = new androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$5
            r3 = r10
            r17 = r4
            r4 = r45
            r5 = r46
            r7 = r43
            r9 = r8
            r8 = r50
            r0 = r9
            r1 = 1
            r9 = r51
            r2 = r10
            r10 = r53
            r11 = r54
            r12 = r56
            r13 = r57
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = 54
            r4 = -1043835354(0xffffffffc1c85626, float:-25.042065)
            androidx.compose.runtime.internal.ComposableLambda r25 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r1, r2, r0, r3)
            int r1 = r17 >> 21
            r1 = r1 & 112(0x70, float:1.57E-43)
            r27 = r1 | r24
            r28 = 112(0x70, float:1.57E-43)
            r1 = 0
            r2 = 0
            r24 = 0
            r17 = r51
            r18 = r22
            r20 = r39
            r22 = r1
            r23 = r2
            r26 = r0
            androidx.compose.material3.SurfaceKt.c(r16, r17, r18, r20, r22, r23, r24, r25, r26, r27, r28)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x02cc
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x02cc
        L_0x02c8:
            r0 = r8
            r0.B()
        L_0x02cc:
            androidx.compose.runtime.ScopeUpdateScope r13 = r0.x()
            if (r13 == 0) goto L_0x0307
            androidx.compose.material3.u8 r12 = new androidx.compose.material3.u8
            r0 = r12
            r1 = r43
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r7 = r49
            r8 = r50
            r9 = r51
            r10 = r52
            r11 = r53
            r15 = r12
            r12 = r54
            r14 = r13
            r13 = r55
            r41 = r14
            r14 = r56
            r42 = r15
            r15 = r57
            r16 = r59
            r17 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r41
            r1 = r42
            r0.a(r1)
        L_0x0307:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt.o(boolean, boolean, androidx.compose.animation.core.Animatable, androidx.compose.material3.RailPredictiveBackState, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.ModalWideNavigationRailState, androidx.compose.material3.WideNavigationRailColors, androidx.compose.ui.graphics.Shape, float, kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.WindowInsets, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit p(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final Unit q(Animatable animatable, ModalWideNavigationRailState modalWideNavigationRailState, RailPredictiveBackState railPredictiveBackState, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        float floatValue = ((Number) animatable.m()).floatValue();
        float f2 = 0.0f;
        if (floatValue <= 0.0f) {
            return Unit.f40552a;
        }
        float f3 = modalWideNavigationRailState.f();
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.c() >> 32));
        if (!Float.isNaN(f3) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
            graphicsLayerScope.j(g0(graphicsLayerScope, floatValue, railPredictiveBackState.a()));
            graphicsLayerScope.i(h0(graphicsLayerScope, floatValue));
            if (z2) {
                f2 = 1.0f;
            }
            graphicsLayerScope.Q1(TransformOriginKt.a(f2, 0.5f));
        }
        return Unit.f40552a;
    }

    public static final Pair r(boolean z2, boolean z3, ModalWideNavigationRailState modalWideNavigationRailState, IntSize intSize, Constraints constraints) {
        float j2 = (float) ((int) (intSize.j() >> 32));
        if (!z2) {
            j2 = 0.0f;
        } else if (!z3) {
            j2 = -j2;
        }
        return TuplesKt.a(AnchoredDraggableKt.a(new y8(j2, 0.0f)), modalWideNavigationRailState.g());
    }

    public static final Unit s(float f2, float f3, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(WideNavigationRailValue.Collapsed, f2);
        draggableAnchorsConfig.a(WideNavigationRailValue.Expanded, f3);
        return Unit.f40552a;
    }

    public static final Unit t(boolean z2, boolean z3, Animatable animatable, RailPredictiveBackState railPredictiveBackState, Function2 function2, Modifier modifier, ModalWideNavigationRailState modalWideNavigationRailState, WideNavigationRailColors wideNavigationRailColors, Shape shape, float f2, Function2 function22, WindowInsets windowInsets, boolean z4, Arrangement.Vertical vertical, Function2 function23, int i2, int i3, Composer composer, int i4) {
        o(z2, z3, animatable, railPredictiveBackState, function2, modifier, modalWideNavigationRailState, wideNavigationRailColors, shape, f2, function22, windowInsets, z4, vertical, function23, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }

    public static final void u(long j2, Function1 function1, boolean z2, Composer composer, int i2) {
        int i3;
        Modifier modifier;
        boolean z3;
        long j3 = j2;
        Function1 function12 = function1;
        boolean z4 = z2;
        int i4 = i2;
        Composer q2 = composer.q(144695261);
        if ((i4 & 6) == 0) {
            i3 = (q2.j(j3) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function12) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z4) ? 256 : 128;
        }
        int i5 = i3;
        if (q2.E((i5 & 147) != 146, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(144695261, i5, -1, "androidx.compose.material3.Scrim (WideNavigationRail.kt:1102)");
            }
            if (j3 != 16) {
                q2.X(-1530482291);
                int i6 = i5;
                State d2 = AnimateAsStateKt.d(z4 ? 1.0f : 0.0f, MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, q2, 6), 0.0f, (String) null, (Function1) null, q2, 0, 28);
                Object g2 = q2.g();
                Composer.Companion companion = Composer.f14567a;
                if (g2 == companion.a()) {
                    g2 = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
                    q2.N(g2);
                }
                MutableState mutableState = (MutableState) g2;
                Strings.Companion companion2 = Strings.f12320b;
                String b2 = Strings_androidKt.b(Strings.a(R.string.d0), q2, 0);
                if (z4) {
                    q2.X(-1530047423);
                    Modifier.Companion companion3 = Modifier.f15489d;
                    Object g3 = q2.g();
                    if (g3 == companion.a()) {
                        g3 = new WideNavigationRailKt$Scrim$dismissModalRail$1$1(mutableState);
                        q2.N(g3);
                    }
                    Modifier c2 = SuspendingPointerInputFilterKt.c(companion3, function12, (PointerInputEventHandler) g3);
                    boolean W = q2.W(b2);
                    Object g4 = q2.g();
                    if (W || g4 == companion.a()) {
                        g4 = new v8(b2, mutableState);
                        q2.N(g4);
                    }
                    z3 = true;
                    modifier = SemanticsModifierKt.c(c2, true, (Function1) g4);
                    q2.M();
                } else {
                    z3 = true;
                    q2.X(-1529667363);
                    q2.M();
                    modifier = Modifier.f15489d;
                }
                Modifier o0 = SizeKt.f(Modifier.f15489d, 0.0f, z3 ? 1 : 0, (Object) null).o0(modifier);
                if ((i6 & 14) != 4) {
                    z3 = false;
                }
                boolean W2 = z3 | q2.W(d2);
                Object g5 = q2.g();
                if (W2 || g5 == companion.a()) {
                    g5 = new w8(j3, d2);
                    q2.N(g5);
                }
                CanvasKt.b(o0, (Function1) g5, q2, 0);
                Boolean valueOf = Boolean.valueOf(w(mutableState));
                boolean l2 = q2.l(function12);
                Object g6 = q2.g();
                if (l2 || g6 == companion.a()) {
                    g6 = new WideNavigationRailKt$Scrim$2$1(function12, mutableState, (Continuation) null);
                    q2.N(g6);
                }
                EffectsKt.g(valueOf, (Function2) g6, q2, 0);
                q2.M();
            } else {
                q2.X(-1529413659);
                q2.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new x8(j2, function1, z2, i2));
        }
    }

    public static final float v(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final boolean w(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void x(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final Unit y(String str, MutableState mutableState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.C(semanticsPropertyReceiver, (String) null, new p8(mutableState), 1, (Object) null);
        return Unit.f40552a;
    }

    public static final boolean z(MutableState mutableState) {
        x(mutableState, true);
        return true;
    }
}
