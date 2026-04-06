package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class SearchBarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldColors f10813a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f10814b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f10815c = Dp.m(SearchBarDefaults.f10786a.n() / ((float) 2));

    /* renamed from: d  reason: collision with root package name */
    public static final float f10816d = Dp.m((float) 240);

    /* renamed from: e  reason: collision with root package name */
    public static final float f10817e = Dp.m((float) 360);

    /* renamed from: f  reason: collision with root package name */
    public static final float f10818f = Dp.m((float) 720);

    /* renamed from: g  reason: collision with root package name */
    public static final float f10819g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f10820h = Dp.m((float) 4);

    /* renamed from: i  reason: collision with root package name */
    public static final float f10821i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f10822j = Dp.m((float) 24);

    /* renamed from: k  reason: collision with root package name */
    public static final CubicBezierEasing f10823k;

    /* renamed from: l  reason: collision with root package name */
    public static final CubicBezierEasing f10824l;

    /* renamed from: m  reason: collision with root package name */
    public static final FiniteAnimationSpec f10825m;

    /* renamed from: n  reason: collision with root package name */
    public static final FiniteAnimationSpec f10826n;

    /* renamed from: o  reason: collision with root package name */
    public static final FiniteAnimationSpec f10827o;

    /* renamed from: p  reason: collision with root package name */
    public static final FiniteAnimationSpec f10828p;

    /* renamed from: q  reason: collision with root package name */
    public static final FiniteAnimationSpec f10829q;

    /* renamed from: r  reason: collision with root package name */
    public static final EnterTransition f10830r;

    /* renamed from: s  reason: collision with root package name */
    public static final ExitTransition f10831s;

    static {
        Color.Companion companion = Color.f15975b;
        long f2 = companion.f();
        long f3 = companion.f();
        long f4 = companion.f();
        long f5 = companion.f();
        long f6 = companion.f();
        long f7 = companion.f();
        long f8 = companion.f();
        long f9 = companion.f();
        long f10 = companion.f();
        long f11 = companion.f();
        TextSelectionColors textSelectionColors = r22;
        TextSelectionColors textSelectionColors2 = new TextSelectionColors(companion.f(), companion.f(), (DefaultConstructorMarker) null);
        f10813a = new TextFieldColors(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, textSelectionColors, companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), companion.f(), (DefaultConstructorMarker) null);
        float f12 = (float) 8;
        f10814b = Dp.m(f12);
        f10819g = Dp.m(f12);
        f10821i = Dp.m(f12);
        CubicBezierEasing b2 = MotionTokens.f13556a.b();
        f10823k = b2;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        f10824l = cubicBezierEasing;
        TweenSpec m2 = AnimationSpecKt.m(600, 100, b2);
        f10825m = m2;
        TweenSpec m3 = AnimationSpecKt.m(350, 100, cubicBezierEasing);
        f10826n = m3;
        f10827o = AnimationSpecKt.n(350, 0, cubicBezierEasing, 2, (Object) null);
        TweenSpec m4 = AnimationSpecKt.m(600, 100, b2);
        f10828p = m4;
        TweenSpec m5 = AnimationSpecKt.m(350, 100, cubicBezierEasing);
        f10829q = m5;
        f10830r = EnterExitTransitionKt.o(m2, 0.0f, 2, (Object) null).c(EnterExitTransitionKt.m(m4, (Alignment.Vertical) null, false, (Function1) null, 14, (Object) null));
        f10831s = EnterExitTransitionKt.q(m3, 0.0f, 2, (Object) null).c(EnterExitTransitionKt.y(m5, (Alignment.Vertical) null, false, (Function1) null, 14, (Object) null));
    }

    public static final float G(BackEventCompat backEventCompat, float f2, float f3) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f3)) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        return f2 / f3;
    }

    public static final int H(long j2, int i2, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f2, float f3) {
        if (backEventCompat == null || f3 == 0.0f) {
            return 0;
        }
        int i3 = -1;
        int i4 = backEventCompat.b() == 0 ? 1 : -1;
        if (layoutDirection == LayoutDirection.Ltr) {
            i3 = 1;
        }
        return MathKt.d(((((float) Constraints.l(j2)) * 0.05f) - ((float) i2)) * (((float) 1) - f2) * f3 * ((float) i4) * ((float) i3));
    }

    public static final int I(long j2, int i2, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i3, int i4, float f2) {
        if (backEventCompat2 == null || backEventCompat == null || f2 == 0.0f) {
            return 0;
        }
        int min = Math.min(Math.max(0, ((Constraints.k(j2) - i3) / 2) - i2), i4);
        float d2 = backEventCompat.d() - backEventCompat2.d();
        float abs = Math.abs(d2) / ((float) Constraints.k(j2));
        return MathKt.d(((float) MathHelpersKt.c(0, min, abs)) * f2 * Math.signum(d2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = androidx.compose.ui.unit.IntRectKt.a(androidx.compose.ui.unit.IntOffsetKt.d(androidx.compose.ui.layout.LayoutCoordinatesKt.g(r4)), r4.a());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.unit.IntRect J(androidx.compose.material3.SearchBarState r4) {
        /*
            androidx.compose.ui.layout.LayoutCoordinates r4 = r4.c()
            if (r4 == 0) goto L_0x0018
            long r0 = androidx.compose.ui.layout.LayoutCoordinatesKt.g(r4)
            long r0 = androidx.compose.ui.unit.IntOffsetKt.d(r0)
            long r2 = r4.a()
            androidx.compose.ui.unit.IntRect r4 = androidx.compose.ui.unit.IntRectKt.a(r0, r2)
            if (r4 != 0) goto L_0x001e
        L_0x0018:
            androidx.compose.ui.unit.IntRect$Companion r4 = androidx.compose.ui.unit.IntRect.f19164e
            androidx.compose.ui.unit.IntRect r4 = r4.a()
        L_0x001e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.J(androidx.compose.material3.SearchBarState):androidx.compose.ui.unit.IntRect");
    }

    public static final float K() {
        return f10816d;
    }

    public static final float L() {
        return f10817e;
    }

    public static final float M() {
        return f10819g;
    }

    public static final boolean N(SearchBarState searchBarState) {
        return searchBarState.d() == SearchBarValue.Expanded;
    }

    public static final float O(BackEventProgress.InProgress inProgress) {
        if (inProgress == null) {
            return 0.0f;
        }
        return PredictiveBack.f12315a.a(inProgress.a());
    }

    public static final void g(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, Function3 function3, Composer composer, int i2) {
        int i3;
        SearchBarState searchBarState2 = searchBarState;
        Function2 function22 = function2;
        SearchBarColors searchBarColors2 = searchBarColors;
        Function3 function32 = function3;
        int i4 = i2;
        Composer q2 = composer.q(1402423467);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(searchBarState2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function22) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.W(modifier) ? 256 : 128;
        } else {
            Modifier modifier2 = modifier;
        }
        Shape shape2 = shape;
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(shape2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.W(searchBarColors2) ? 16384 : 8192;
        }
        float f4 = f2;
        if ((196608 & i4) == 0) {
            i3 |= q2.h(f4) ? 131072 : 65536;
        }
        float f5 = f3;
        if ((1572864 & i4) == 0) {
            i3 |= q2.h(f5) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i3 |= q2.l(function32) ? 8388608 : 4194304;
        }
        if (q2.E((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1402423467, i3, -1, "androidx.compose.material3.DockedSearchBarLayout (SearchBar.kt:2323)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, q2);
                q2.N(g2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) g2;
            boolean N = N(searchBarState);
            boolean l2 = q2.l(coroutineScope) | ((i3 & 14) == 4);
            Object g3 = q2.g();
            if (l2 || g3 == companion.a()) {
                g3 = new B5(coroutineScope, searchBarState2);
                q2.N(g3);
            }
            BackHandler_androidKt.c(N, (Function0) g3, q2, 0, 0);
            int i5 = i3 >> 3;
            SurfaceKt.c(WindowInsetsPadding_androidKt.a(modifier), shape, searchBarColors.a(), ColorSchemeKt.g(searchBarColors.a(), q2, 0), f2, f3, (BorderStroke) null, ComposableLambdaKt.e(-956905210, true, new SearchBarKt$DockedSearchBarLayout$2(function22, searchBarState2, searchBarColors2, function32), q2, 54), q2, ((i3 >> 6) & 112) | 12582912 | (57344 & i5) | (i5 & 458752), 64);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C5(searchBarState, function2, modifier, shape, searchBarColors, f2, f3, function3, i2));
        }
    }

    public static final Unit h(CoroutineScope coroutineScope, SearchBarState searchBarState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SearchBarKt$DockedSearchBarLayout$1$1$1(searchBarState, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit i(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, Function3 function3, int i2, Composer composer, int i3) {
        g(searchBarState, function2, modifier, shape, searchBarColors, f2, f3, function3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void j(SearchBarState searchBarState, PredictiveBackState predictiveBackState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, Function3 function3, Composer composer, int i2) {
        int i3;
        Composer composer2;
        MutableState mutableState;
        int i4;
        int i5;
        SearchBarState searchBarState2 = searchBarState;
        PredictiveBackState predictiveBackState2 = predictiveBackState;
        Function2 function22 = function2;
        Modifier modifier2 = modifier;
        WindowInsets windowInsets2 = windowInsets;
        Function3 function32 = function3;
        int i6 = i2;
        Composer q2 = composer.q(-740838201);
        if ((i6 & 6) == 0) {
            i3 = (q2.W(searchBarState2) ? 4 : 2) | i6;
        } else {
            i3 = i6;
        }
        if ((i6 & 48) == 0) {
            i3 |= (i6 & 64) == 0 ? q2.W(predictiveBackState2) : q2.l(predictiveBackState2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i3 |= q2.l(function22) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i3 |= q2.W(modifier2) ? 2048 : 1024;
        }
        Shape shape2 = shape;
        if ((i6 & 24576) == 0) {
            i3 |= q2.W(shape2) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i3 |= q2.W(searchBarColors) ? 131072 : 65536;
        } else {
            SearchBarColors searchBarColors2 = searchBarColors;
        }
        float f4 = f2;
        if ((i6 & 1572864) == 0) {
            i3 |= q2.h(f4) ? 1048576 : 524288;
        }
        float f5 = f3;
        if ((i6 & 12582912) == 0) {
            i3 |= q2.h(f5) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i3 |= q2.W(windowInsets2) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i3 |= q2.l(function32) ? 536870912 : 268435456;
        }
        if (q2.E((i3 & 306783379) != 306783378, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-740838201, i3, -1, "androidx.compose.material3.FullScreenSearchBarLayout (SearchBar.kt:2398)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = SnapshotStateKt.e(new C0285x5(predictiveBackState2));
                q2.N(g2);
            }
            State state = (State) g2;
            Object g3 = q2.g();
            int i7 = i3;
            if (g3 == companion.a()) {
                g3 = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                q2.N(g3);
            }
            MutableState mutableState2 = (MutableState) g3;
            BackEventProgress l2 = l(state);
            if (l2 instanceof BackEventProgress.InProgress) {
                if (mutableState2.getValue() == null) {
                    mutableState2.setValue(l2);
                }
            } else if (Intrinsics.d(l2, BackEventProgress.NotRunning.f12156a)) {
                mutableState2.setValue((Object) null);
            } else if (!Intrinsics.d(l2, BackEventProgress.Completed.f12151a)) {
                throw new NoWhenBranchMatchedException();
            }
            Object g4 = q2.g();
            if (g4 == companion.a()) {
                MutableState j2 = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                q2.N(j2);
                g4 = j2;
            } else {
                Object obj = g4;
            }
            MutableState mutableState3 = (MutableState) g4;
            BackEventProgress l3 = l(state);
            if (l3 instanceof BackEventProgress.InProgress) {
                mutableState3.setValue(l3);
            } else if (Intrinsics.d(l3, BackEventProgress.NotRunning.f12156a)) {
                mutableState3.setValue((Object) null);
            } else if (!Intrinsics.d(l3, BackEventProgress.Completed.f12151a)) {
                throw new NoWhenBranchMatchedException();
            }
            Density density = (Density) q2.C(CompositionLocalsKt.g());
            Shape l4 = SearchBarDefaults.f10786a.l(q2, 6);
            boolean W = q2.W(density) | q2.W(l4);
            Shape shape3 = l4;
            Object g5 = q2.g();
            if (W || g5 == companion.a()) {
                C0294y5 y5Var = r0;
                i4 = i7;
                mutableState = mutableState2;
                i5 = 4;
                C0294y5 y5Var2 = new C0294y5(shape, shape3, density, searchBarState, mutableState3);
                GenericShape genericShape = new GenericShape(y5Var2);
                q2.N(genericShape);
                g5 = genericShape;
            } else {
                mutableState = mutableState2;
                i4 = i7;
                i5 = 4;
            }
            GenericShape genericShape2 = (GenericShape) g5;
            Object g6 = q2.g();
            if (g6 == companion.a()) {
                g6 = new MutableWindowInsets((WindowInsets) null, 1, (DefaultConstructorMarker) null);
                q2.N(g6);
            }
            MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) g6;
            WindowInsets e2 = mutableWindowInsets.e();
            WindowInsetsSides.Companion companion2 = WindowInsetsSides.f4266b;
            WindowInsets j3 = WindowInsetsKt.j(e2, WindowInsetsSides.q(companion2.g(), companion2.e()));
            boolean z2 = (i4 & 234881024) == 67108864;
            Object g7 = q2.g();
            if (z2 || g7 == companion.a()) {
                g7 = new C0303z5(mutableWindowInsets, windowInsets2);
                q2.N(g7);
            }
            Modifier b2 = WindowInsetsPaddingKt.b(WindowInsetsPaddingKt.d(modifier2, (Function1) g7), windowInsets2);
            MutableState mutableState4 = mutableState;
            boolean W2 = q2.W(mutableState3) | ((i4 & 14) == i5) | q2.W(mutableState4);
            Object g8 = q2.g();
            if (W2 || g8 == companion.a()) {
                g8 = new SearchBarKt$FullScreenSearchBarLayout$2$1(mutableState3, searchBarState2, mutableWindowInsets, mutableState4);
                q2.N(g8);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g8;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, b2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
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
            Updater.g(b3, measurePolicy, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e3, companion3.d());
            Modifier.Companion companion4 = Modifier.f15489d;
            Modifier h2 = PaddingKt.h(LayoutIdKt.b(companion4, "InputField"), WindowInsetsKt.g(WindowInsetsKt.j(j3, companion2.g()), q2, 0));
            Alignment.Companion companion5 = Alignment.f15444a;
            MeasurePolicy g9 = BoxKt.g(companion5.o(), true);
            int a4 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e4 = ComposedModifierKt.e(q2, h2);
            Function0 a5 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a5);
            } else {
                q2.K();
            }
            Composer b5 = Updater.b(q2);
            Updater.g(b5, g9, companion3.c());
            Updater.g(b5, I2, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a4))) {
                b5.N(Integer.valueOf(a4));
                b5.A(Integer.valueOf(a4), b6);
            }
            Updater.g(b5, e4, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            int i8 = i4 >> 6;
            function22.m(q2, Integer.valueOf(i8 & 14));
            q2.T();
            int i9 = (57344 & i8) | 12582918 | (i8 & 458752);
            composer2 = q2;
            SurfaceKt.c(LayoutIdKt.b(companion4, "Surface"), genericShape2, searchBarColors.a(), ColorSchemeKt.g(searchBarColors.a(), q2, 0), f2, f3, (BorderStroke) null, ComposableSingletons$SearchBarKt.f9577a.a(), composer2, i9, 64);
            Modifier h3 = PaddingKt.h(LayoutIdKt.b(companion4, "Content"), WindowInsetsKt.g(j3, composer2, 0));
            MeasurePolicy a6 = ColumnKt.a(Arrangement.f3739a.g(), companion5.k(), composer2, 0);
            int a7 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer2.I();
            Modifier e5 = ComposedModifierKt.e(composer2, h3);
            Function0 a8 = companion3.a();
            if (composer2.v() == null) {
                ComposablesKt.d();
            }
            composer2.s();
            if (composer2.n()) {
                composer2.y(a8);
            } else {
                composer2.K();
            }
            Composer b7 = Updater.b(composer2);
            Updater.g(b7, a6, companion3.c());
            Updater.g(b7, I3, companion3.e());
            Function2 b8 = companion3.b();
            if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a7))) {
                b7.N(Integer.valueOf(a7));
                b7.A(Integer.valueOf(a7), b8);
            }
            Updater.g(b7, e5, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            DividerKt.e((Modifier) null, 0.0f, searchBarColors.b(), composer2, 0, 3);
            function32.d(columnScopeInstance, composer2, Integer.valueOf(((i4 >> 24) & 112) | 6));
            composer2.T();
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new A5(searchBarState, predictiveBackState, function2, modifier, shape, searchBarColors, f2, f3, windowInsets, function3, i2));
        }
    }

    public static final BackEventProgress k(PredictiveBackState predictiveBackState) {
        return predictiveBackState.getValue();
    }

    public static final BackEventProgress l(State state) {
        return (BackEventProgress) state.getValue();
    }

    public static final Unit m(Shape shape, Shape shape2, Density density, SearchBarState searchBarState, MutableState mutableState, Path path, Size size, LayoutDirection layoutDirection) {
        if (shape == RoundedCornerShapeKt.f() && shape2 == RectangleShapeKt.a()) {
            float B1 = density.B1(Dp.m(f10815c * Math.max(((float) 1) - searchBarState.e(), O((BackEventProgress.InProgress) mutableState.getValue()))));
            if (((double) B1) < 0.001d) {
                Path.d(path, SizeKt.c(size.m()), (Path.Direction) null, 2, (Object) null);
            } else {
                Path.l(path, RoundRectKt.e(SizeKt.c(size.m()), CornerRadius.b((((long) Float.floatToRawIntBits(B1)) << 32) | (((long) Float.floatToRawIntBits(B1)) & 4294967295L))), (Path.Direction) null, 2, (Object) null);
            }
        } else {
            if (searchBarState.e() >= 0.5f) {
                shape = shape2;
            }
            OutlineKt.a(path, shape.a(size.m(), layoutDirection, density));
        }
        return Unit.f40552a;
    }

    public static final Unit n(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.f(WindowInsetsKt.i(windowInsets, windowInsets2));
        return Unit.f40552a;
    }

    public static final Unit o(SearchBarState searchBarState, PredictiveBackState predictiveBackState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, Function3 function3, int i2, Composer composer, int i3) {
        j(searchBarState, predictiveBackState, function2, modifier, shape, searchBarColors, f2, f3, windowInsets, function3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
