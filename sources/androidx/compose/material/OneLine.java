package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class OneLine {

    /* renamed from: a  reason: collision with root package name */
    public static final OneLine f8085a = new OneLine();

    /* renamed from: b  reason: collision with root package name */
    public static final float f8086b = Dp.m((float) 48);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8087c = Dp.m((float) 56);

    /* renamed from: d  reason: collision with root package name */
    public static final float f8088d = Dp.m((float) 40);

    /* renamed from: e  reason: collision with root package name */
    public static final float f8089e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f8090f = Dp.m((float) 8);

    /* renamed from: g  reason: collision with root package name */
    public static final float f8091g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f8092h;

    /* renamed from: i  reason: collision with root package name */
    public static final float f8093i;

    static {
        float f2 = (float) 16;
        f8089e = Dp.m(f2);
        f8091g = Dp.m(f2);
        f8092h = Dp.m(f2);
        f8093i = Dp.m(f2);
    }

    public final void a(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion;
        Function2 function24 = function2;
        Function2 function25 = function22;
        Function2 function26 = function23;
        int i5 = i2;
        Composer q2 = composer.q(-1884451315);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            companion = modifier;
        } else if ((i5 & 6) == 0) {
            companion = modifier;
            i4 = (q2.W(companion) ? 4 : 2) | i5;
        } else {
            companion = modifier;
            i4 = i5;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i5 & 48) == 0) {
            i4 |= q2.l(function24) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i5 & 384) == 0) {
            i4 |= q2.l(function25) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i4 |= q2.l(function26) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else {
            if ((i5 & 24576) == 0) {
                i4 |= q2.W(this) ? 16384 : 8192;
            }
        }
        if (q2.E((i4 & 9363) != 9362, i4 & 1)) {
            if (i6 != 0) {
                companion = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1884451315, i4, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:148)");
            }
            Modifier k2 = SizeKt.k(companion, function24 == null ? f8086b : f8087c, 0.0f, 2, (Object) null);
            Arrangement.Horizontal f2 = Arrangement.f3739a.f();
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy b2 = RowKt.b(f2, companion2.l(), q2, 0);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, k2);
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
            Updater.g(b3, b2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            if (function24 != null) {
                q2.X(-1966455448);
                Modifier d2 = rowScopeInstance.d(Modifier.f15489d, companion2.i());
                float f3 = f8089e;
                Modifier A2 = SizeKt.A(d2, Dp.m(f3 + f8088d), 0.0f, 2, (Object) null);
                float f4 = f8090f;
                Modifier m2 = PaddingKt.m(A2, f3, f4, 0.0f, f4, 4, (Object) null);
                MeasurePolicy g2 = BoxKt.g(companion2.h(), false);
                int a4 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e3 = ComposedModifierKt.e(q2, m2);
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
                Updater.g(b5, g2, companion3.c());
                Updater.g(b5, I2, companion3.e());
                Function2 b6 = companion3.b();
                if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a4))) {
                    b5.N(Integer.valueOf(a4));
                    b5.A(Integer.valueOf(a4), b6);
                }
                Updater.g(b5, e3, companion3.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                function24.m(q2, Integer.valueOf((i4 >> 3) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(-1965948040);
                q2.M();
            }
            Modifier.Companion companion4 = Modifier.f15489d;
            Modifier m3 = PaddingKt.m(rowScopeInstance.d(RowScope.c(rowScopeInstance, companion4, 1.0f, false, 2, (Object) null), companion2.i()), f8091g, 0.0f, f8092h, 0.0f, 10, (Object) null);
            MeasurePolicy g3 = BoxKt.g(companion2.h(), false);
            int a6 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I3 = q2.I();
            Modifier e4 = ComposedModifierKt.e(q2, m3);
            Function0 a7 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a7);
            } else {
                q2.K();
            }
            Composer b7 = Updater.b(q2);
            Updater.g(b7, g3, companion3.c());
            Updater.g(b7, I3, companion3.e());
            Function2 b8 = companion3.b();
            if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a6))) {
                b7.N(Integer.valueOf(a6));
                b7.A(Integer.valueOf(a6), b8);
            }
            Updater.g(b7, e4, companion3.d());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3797a;
            function25.m(q2, Integer.valueOf((i4 >> 6) & 14));
            q2.T();
            if (function26 != null) {
                q2.X(-1965606420);
                Modifier m4 = PaddingKt.m(rowScopeInstance.d(companion4, companion2.i()), 0.0f, 0.0f, f8093i, 0.0f, 11, (Object) null);
                MeasurePolicy g4 = BoxKt.g(companion2.o(), false);
                int a8 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I4 = q2.I();
                Modifier e5 = ComposedModifierKt.e(q2, m4);
                Function0 a9 = companion3.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a9);
                } else {
                    q2.K();
                }
                Composer b9 = Updater.b(q2);
                Updater.g(b9, g4, companion3.c());
                Updater.g(b9, I4, companion3.e());
                Function2 b10 = companion3.b();
                if (b9.n() || !Intrinsics.d(b9.g(), Integer.valueOf(a8))) {
                    b9.N(Integer.valueOf(a8));
                    b9.A(Integer.valueOf(a8), b10);
                }
                Updater.g(b9, e5, companion3.d());
                function26.m(q2, Integer.valueOf((i4 >> 9) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(-1965410376);
                q2.M();
            }
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = companion;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new OneLine$ListItem$2(this, modifier2, function2, function22, function23, i2, i3));
        }
    }
}
