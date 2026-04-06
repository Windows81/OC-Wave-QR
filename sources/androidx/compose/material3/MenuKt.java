package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MenuKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10291a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f10292b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f10293c = Dp.m((float) 12);

    /* renamed from: d  reason: collision with root package name */
    public static final float f10294d = Dp.m((float) 8);

    /* renamed from: e  reason: collision with root package name */
    public static final float f10295e = Dp.m((float) 112);

    /* renamed from: f  reason: collision with root package name */
    public static final float f10296f = Dp.m((float) 280);

    static {
        float f2 = (float) 48;
        f10291a = Dp.m(f2);
        f10292b = Dp.m(f2);
    }

    public static final void d(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, Function3 function3, Composer composer, int i2) {
        int i3;
        int i4;
        Modifier modifier2 = modifier;
        MutableTransitionState mutableTransitionState2 = mutableTransitionState;
        ScrollState scrollState2 = scrollState;
        Function3 function32 = function3;
        int i5 = i2;
        Composer q2 = composer.q(848986741);
        if ((i5 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 48) == 0) {
            i3 |= (i5 & 64) == 0 ? q2.W(mutableTransitionState2) : q2.l(mutableTransitionState2) ? 32 : 16;
        }
        MutableState mutableState2 = mutableState;
        if ((i5 & 384) == 0) {
            i3 |= q2.W(mutableState2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i3 |= q2.W(scrollState2) ? 2048 : 1024;
        }
        Shape shape2 = shape;
        if ((i5 & 24576) == 0) {
            i3 |= q2.W(shape2) ? 16384 : 8192;
        }
        long j3 = j2;
        if ((196608 & i5) == 0) {
            i3 |= q2.j(j3) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i3 |= q2.h(f2) ? 1048576 : 524288;
        } else {
            float f4 = f2;
        }
        if ((i5 & 12582912) == 0) {
            i3 |= q2.h(f3) ? 8388608 : 4194304;
        } else {
            float f5 = f3;
        }
        BorderStroke borderStroke2 = borderStroke;
        if ((i5 & 100663296) == 0) {
            i3 |= q2.W(borderStroke2) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i3 |= q2.l(function32) ? 536870912 : 268435456;
        }
        if (q2.E((i3 & 306783379) != 306783378, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(848986741, i3, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:369)");
            }
            Transition i6 = TransitionKt.i(mutableTransitionState2, "DropDownMenu", q2, MutableTransitionState.f2620d | 48 | ((i3 >> 3) & 14), 0);
            FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, q2, 6);
            FiniteAnimationSpec b3 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, q2, 6);
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new MenuKt$DropdownMenuContent$scale$2(b2);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.f40896a;
            TwoWayConverter i7 = VectorConvertersKt.i(floatCompanionObject);
            boolean booleanValue = ((Boolean) i6.i()).booleanValue();
            q2.X(143964305);
            if (ComposerKt.P()) {
                ComposerKt.Y(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f6 = 1.0f;
            float f7 = booleanValue ? 1.0f : 0.8f;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            q2.M();
            Float valueOf = Float.valueOf(f7);
            boolean booleanValue2 = ((Boolean) i6.q()).booleanValue();
            q2.X(143964305);
            if (ComposerKt.P()) {
                ComposerKt.Y(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:377)");
            }
            float f8 = booleanValue2 ? 1.0f : 0.8f;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            q2.M();
            State f9 = TransitionKt.f(i6, valueOf, Float.valueOf(f8), (FiniteAnimationSpec) menuKt$DropdownMenuContent$scale$2.d(i6.o(), q2, 0), i7, "FloatAnimation", q2, 0);
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new MenuKt$DropdownMenuContent$alpha$2(b3);
            TwoWayConverter i8 = VectorConvertersKt.i(floatCompanionObject);
            boolean booleanValue3 = ((Boolean) i6.i()).booleanValue();
            q2.X(892761509);
            if (ComposerKt.P()) {
                ComposerKt.Y(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            }
            float f10 = booleanValue3 ? 1.0f : 0.0f;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            q2.M();
            Float valueOf2 = Float.valueOf(f10);
            boolean booleanValue4 = ((Boolean) i6.q()).booleanValue();
            q2.X(892761509);
            if (ComposerKt.P()) {
                ComposerKt.Y(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:382)");
            }
            if (!booleanValue4) {
                f6 = 0.0f;
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            q2.M();
            boolean z2 = false;
            State f11 = TransitionKt.f(i6, valueOf2, Float.valueOf(f6), (FiniteAnimationSpec) menuKt$DropdownMenuContent$alpha$2.d(i6.o(), q2, 0), i8, "FloatAnimation", q2, 0);
            boolean booleanValue5 = ((Boolean) q2.C(InspectionModeKt.a())).booleanValue();
            Modifier.Companion companion = Modifier.f15489d;
            boolean d2 = q2.d(booleanValue5) | q2.W(f9) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && q2.l(mutableTransitionState2))) | q2.W(f11);
            if ((i3 & 896) == 256) {
                z2 = true;
            }
            boolean z3 = z2 | d2;
            Object g2 = q2.g();
            if (z3 || g2 == Composer.f14567a.a()) {
                i4 = i3;
                C0211p3 p3Var = new C0211p3(booleanValue5, mutableTransitionState, mutableState, f9, f11);
                q2.N(p3Var);
                g2 = p3Var;
            } else {
                i4 = i3;
            }
            int i9 = i4 >> 9;
            int i10 = i4 >> 6;
            SurfaceKt.c(GraphicsLayerModifierKt.a(companion, (Function1) g2), shape, j2, 0, f2, f3, borderStroke, ComposableLambdaKt.e(-1463404422, true, new MenuKt$DropdownMenuContent$2(modifier2, scrollState2, function32), q2, 54), q2, (i9 & 896) | (i9 & 112) | 12582912 | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0220q3(modifier, mutableTransitionState, mutableState, scrollState, shape, j2, f2, f3, borderStroke, function3, i2));
        }
    }

    public static final float e(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float f(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final Unit g(boolean z2, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        float f2 = 0.8f;
        float f3 = 1.0f;
        graphicsLayerScope.j(!z2 ? e(state) : ((Boolean) mutableTransitionState.b()).booleanValue() ? 1.0f : 0.8f);
        if (!z2) {
            f2 = e(state);
        } else if (((Boolean) mutableTransitionState.b()).booleanValue()) {
            f2 = 1.0f;
        }
        graphicsLayerScope.i(f2);
        if (!z2) {
            f3 = f(state2);
        } else if (!((Boolean) mutableTransitionState.b()).booleanValue()) {
            f3 = 0.0f;
        }
        graphicsLayerScope.d(f3);
        graphicsLayerScope.Q1(((TransformOrigin) mutableState.getValue()).j());
        return Unit.f40552a;
    }

    public static final Unit h(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, Function3 function3, int i2, Composer composer, int i3) {
        d(modifier, mutableTransitionState, mutableState, scrollState, shape, j2, f2, f3, borderStroke, function3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void i(Function2 function2, Function0 function0, Modifier modifier, Function2 function22, Function2 function23, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i2) {
        int i3;
        PaddingValues paddingValues2 = paddingValues;
        int i4 = i2;
        Composer q2 = composer.q(-1325192924);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i4;
        } else {
            Function2 function24 = function2;
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function0) ? 32 : 16;
        } else {
            Function0 function02 = function0;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.W(modifier) ? 256 : 128;
        } else {
            Modifier modifier2 = modifier;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function22) ? 2048 : 1024;
        } else {
            Function2 function25 = function22;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function23) ? 16384 : 8192;
        } else {
            Function2 function26 = function23;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.d(z2) ? 131072 : 65536;
        } else {
            boolean z3 = z2;
        }
        MenuItemColors menuItemColors2 = menuItemColors;
        if ((1572864 & i4) == 0) {
            i3 |= q2.W(menuItemColors2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i3 |= q2.W(paddingValues2) ? 8388608 : 4194304;
        }
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        if ((100663296 & i4) == 0) {
            i3 |= q2.W(mutableInteractionSource2) ? 67108864 : 33554432;
        }
        if (q2.E((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1325192924, i3, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:428)");
            }
            Modifier h2 = PaddingKt.h(SizeKt.x(SizeKt.h(ClickableKt.d(modifier, mutableInteractionSource, RippleKt.e(true, 0.0f, 0, 6, (Object) null), z2, (String) null, (Role) null, function0, 24, (Object) null), 0.0f, 1, (Object) null), f10295e, f10292b, f10296f, 0.0f, 8, (Object) null), paddingValues2);
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), Alignment.f15444a.i(), q2, 48);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
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
            Updater.g(b3, b2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion.d());
            TextKt.h(MaterialTheme.f10273a.e(q2, 6).s(), ComposableLambdaKt.e(865999929, true, new MenuKt$DropdownMenuItemContent$1$1(function22, menuItemColors, z2, function23, RowScopeInstance.f4150a, function2), q2, 54), q2, 48);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0229r3(function2, function0, modifier, function22, function23, z2, menuItemColors, paddingValues, mutableInteractionSource, i2));
        }
    }

    public static final Unit j(Function2 function2, Function0 function0, Modifier modifier, Function2 function22, Function2 function23, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, Composer composer, int i3) {
        i(function2, function0, modifier, function22, function23, z2, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long l(androidx.compose.ui.unit.IntRect r5, androidx.compose.ui.unit.IntRect r6) {
        /*
            int r0 = r6.g()
            int r1 = r5.h()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x000f
        L_0x000d:
            r0 = r3
            goto L_0x0049
        L_0x000f:
            int r0 = r6.h()
            int r1 = r5.g()
            if (r0 > r1) goto L_0x001b
            r0 = r2
            goto L_0x0049
        L_0x001b:
            int r0 = r6.l()
            if (r0 != 0) goto L_0x0022
            goto L_0x000d
        L_0x0022:
            int r0 = r5.g()
            int r1 = r6.g()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.h()
            int r4 = r6.h()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.g()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.l()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0049:
            int r1 = r6.j()
            int r4 = r5.d()
            if (r1 < r4) goto L_0x0055
        L_0x0053:
            r2 = r3
            goto L_0x008f
        L_0x0055:
            int r1 = r6.d()
            int r4 = r5.j()
            if (r1 > r4) goto L_0x0060
            goto L_0x008f
        L_0x0060:
            int r1 = r6.f()
            if (r1 != 0) goto L_0x0067
            goto L_0x0053
        L_0x0067:
            int r1 = r5.j()
            int r2 = r6.j()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.d()
            int r2 = r6.d()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.j()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.f()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x008f:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.l(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float m() {
        return f10294d;
    }

    public static final float n() {
        return f10291a;
    }
}
