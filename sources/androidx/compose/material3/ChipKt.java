package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ChipKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9409a;

    /* renamed from: b  reason: collision with root package name */
    public static final PaddingValues f9410b;

    /* renamed from: c  reason: collision with root package name */
    public static final PaddingValues f9411c;

    /* renamed from: d  reason: collision with root package name */
    public static final PaddingValues f9412d;

    static {
        float m2 = Dp.m((float) 8);
        f9409a = m2;
        f9410b = PaddingKt.c(m2, 0.0f, 2, (Object) null);
        f9411c = PaddingKt.c(m2, 0.0f, 2, (Object) null);
        f9412d = PaddingKt.c(m2, 0.0f, 2, (Object) null);
    }

    public static final void c(Function2 function2, TextStyle textStyle, long j2, Function2 function22, Function2 function23, Function2 function24, long j3, long j4, float f2, PaddingValues paddingValues, Composer composer, int i2) {
        int i3;
        TextStyle textStyle2 = textStyle;
        int i4 = i2;
        Composer q2 = composer.q(-2070754602);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i4;
        } else {
            Function2 function25 = function2;
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(textStyle2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.j(j2) ? 256 : 128;
        } else {
            long j5 = j2;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function22) ? 2048 : 1024;
        } else {
            Function2 function26 = function22;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function23) ? 16384 : 8192;
        } else {
            Function2 function27 = function23;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.l(function24) ? 131072 : 65536;
        } else {
            Function2 function28 = function24;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.j(j3) ? 1048576 : 524288;
        } else {
            long j6 = j3;
        }
        if ((12582912 & i4) == 0) {
            i3 |= q2.j(j4) ? 8388608 : 4194304;
        } else {
            long j7 = j4;
        }
        if ((100663296 & i4) == 0) {
            i3 |= q2.h(f2) ? 67108864 : 33554432;
        } else {
            float f3 = f2;
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i4 & 805306368) == 0) {
            i3 |= q2.W(paddingValues2) ? 536870912 : 268435456;
        }
        if (q2.E((i3 & 306783379) != 306783378, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2070754602, i3, -1, "androidx.compose.material3.AnimatingChipContent (Chip.kt:2114)");
            }
            CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(j2)), TextKt.q().d(textStyle2)}, ComposableLambdaKt.e(-668234218, true, new ChipKt$AnimatingChipContent$1(f2, paddingValues, function23, function22, function24, j3, function2, j4), q2, 54), q2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0163k0(function2, textStyle, j2, function22, function23, function24, j3, j4, f2, paddingValues, i2));
        }
    }

    public static final Unit d(Function2 function2, TextStyle textStyle, long j2, Function2 function22, Function2 function23, Function2 function24, long j3, long j4, float f2, PaddingValues paddingValues, int i2, Composer composer, int i3) {
        c(function2, textStyle, j2, function22, function23, function24, j3, j4, f2, paddingValues, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void e(Function2 function2, TextStyle textStyle, long j2, Function2 function22, Function2 function23, Function2 function24, long j3, long j4, float f2, PaddingValues paddingValues, Composer composer, int i2) {
        int i3;
        TextStyle textStyle2 = textStyle;
        int i4 = i2;
        Composer q2 = composer.q(1105630840);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i4;
        } else {
            Function2 function25 = function2;
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(textStyle2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.j(j2) ? 256 : 128;
        } else {
            long j5 = j2;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function22) ? 2048 : 1024;
        } else {
            Function2 function26 = function22;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function23) ? 16384 : 8192;
        } else {
            Function2 function27 = function23;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.l(function24) ? 131072 : 65536;
        } else {
            Function2 function28 = function24;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.j(j3) ? 1048576 : 524288;
        } else {
            long j6 = j3;
        }
        if ((12582912 & i4) == 0) {
            i3 |= q2.j(j4) ? 8388608 : 4194304;
        } else {
            long j7 = j4;
        }
        if ((100663296 & i4) == 0) {
            i3 |= q2.h(f2) ? 67108864 : 33554432;
        } else {
            float f3 = f2;
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i4 & 805306368) == 0) {
            i3 |= q2.W(paddingValues2) ? 536870912 : 268435456;
        }
        if (q2.E((i3 & 306783379) != 306783378, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1105630840, i3, -1, "androidx.compose.material3.ChipContent (Chip.kt:2052)");
            }
            CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(j2)), TextKt.q().d(textStyle2)}, ComposableLambdaKt.e(-2130105544, true, new ChipKt$ChipContent$1(f2, paddingValues, function23, function22, function24, j3, function2, j4), q2, 54), q2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0172l0(function2, textStyle, j2, function22, function23, function24, j3, j4, f2, paddingValues, i2));
        }
    }

    public static final Unit f(Function2 function2, TextStyle textStyle, long j2, Function2 function22, Function2 function23, Function2 function24, long j3, long j4, float f2, PaddingValues paddingValues, int i2, Composer composer, int i3) {
        e(function2, textStyle, j2, function22, function23, function24, j3, j4, f2, paddingValues, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Function2 m(Function2 function2, Function2 function22, long j2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1330309098, i2, -1, "androidx.compose.material3.leadingContent (Chip.kt:2212)");
        }
        if (function2 != null) {
            composer.X(-1473203984);
            composer.M();
        } else if (function22 != null) {
            composer.X(1575390813);
            function2 = ComposableLambdaKt.e(-237350650, true, new ChipKt$leadingContent$1(j2, function22), composer, 54);
            composer.M();
        } else {
            composer.X(1575618259);
            composer.M();
            function2 = null;
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return function2;
    }

    public static final State n(Object obj, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-618198444, i2, -1, "androidx.compose.material3.rememberRetainedState (Chip.kt:2248)");
        }
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        if (obj != null) {
            mutableState.setValue(obj);
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return mutableState;
    }

    public static final Function2 o(Function2 function2, long j2, Composer composer, int i2) {
        ComposableLambda composableLambda;
        if (ComposerKt.P()) {
            ComposerKt.Y(-165980551, i2, -1, "androidx.compose.material3.trailingContent (Chip.kt:2231)");
        }
        if (function2 != null) {
            composer.X(-1219055576);
            composableLambda = ComposableLambdaKt.e(-566924201, true, new ChipKt$trailingContent$1(j2, function2), composer, 54);
            composer.M();
        } else {
            composer.X(-1218863531);
            composer.M();
            composableLambda = null;
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return composableLambda;
    }
}
