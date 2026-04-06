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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ThreeLine {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreeLine f8884a = new ThreeLine();

    /* renamed from: b  reason: collision with root package name */
    public static final float f8885b = Dp.m((float) 88);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8886c = Dp.m((float) 40);

    /* renamed from: d  reason: collision with root package name */
    public static final float f8887d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f8888e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f8889f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f8890g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f8891h = Dp.m((float) 28);

    /* renamed from: i  reason: collision with root package name */
    public static final float f8892i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f8893j;

    /* renamed from: k  reason: collision with root package name */
    public static final float f8894k;

    /* renamed from: l  reason: collision with root package name */
    public static final float f8895l;

    static {
        float f2 = (float) 16;
        f8887d = Dp.m(f2);
        f8888e = Dp.m(f2);
        f8889f = Dp.m(f2);
        f8890g = Dp.m(f2);
        float f3 = (float) 20;
        f8892i = Dp.m(f3);
        f8893j = Dp.m(f3);
        f8894k = Dp.m(f2);
        f8895l = Dp.m(f2);
    }

    public final void a(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        Composer composer2;
        Function2 function26 = function2;
        Function2 function27 = function22;
        Function2 function28 = function23;
        Function2 function29 = function24;
        Function2 function210 = function25;
        int i5 = i2;
        Composer q2 = composer.q(1749738797);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i4 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i4 = i5;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i5 & 48) == 0) {
            i4 |= q2.l(function26) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i5 & 384) == 0) {
            i4 |= q2.l(function27) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i4 |= q2.l(function28) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i4 |= q2.l(function29) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i5 & 196608) == 0) {
            i4 |= q2.l(function210) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else {
            if ((i5 & 1572864) == 0) {
                i4 |= q2.W(this) ? 1048576 : 524288;
            }
        }
        int i7 = i4;
        if (q2.E((599187 & i7) != 599186, i7 & 1)) {
            Modifier modifier3 = i6 != 0 ? Modifier.f15489d : modifier2;
            if (ComposerKt.P()) {
                ComposerKt.Y(1749738797, i7, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:315)");
            }
            Modifier k2 = SizeKt.k(modifier3, f8885b, 0.0f, 2, (Object) null);
            Arrangement.Horizontal f2 = Arrangement.f3739a.f();
            Alignment.Companion companion = Alignment.f15444a;
            MeasurePolicy b2 = RowKt.b(f2, companion.l(), q2, 0);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, k2);
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
            Modifier modifier4 = modifier3;
            Updater.g(b3, b2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            if (function26 != null) {
                q2.X(1135491690);
                float f3 = f8887d;
                float m2 = Dp.m(f3 + f8886c);
                Modifier x2 = SizeKt.x(Modifier.f15489d, m2, m2, 0.0f, 0.0f, 12, (Object) null);
                float f4 = f8888e;
                Modifier m3 = PaddingKt.m(x2, f3, f4, 0.0f, f4, 4, (Object) null);
                MeasurePolicy g2 = BoxKt.g(companion.h(), false);
                int a4 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e3 = ComposedModifierKt.e(q2, m3);
                Function0 a5 = companion2.a();
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
                Updater.g(b5, g2, companion2.c());
                Updater.g(b5, I2, companion2.e());
                Function2 b6 = companion2.b();
                if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a4))) {
                    b5.N(Integer.valueOf(a4));
                    b5.A(Integer.valueOf(a4), b6);
                }
                Updater.g(b5, e3, companion2.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                function26.m(q2, Integer.valueOf((i7 >> 3) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(1136020240);
                q2.M();
            }
            float f5 = f8891h;
            List p2 = CollectionsKt.p(Dp.j(f5), Dp.j(f8892i), Dp.j(f8893j));
            Modifier.Companion companion3 = Modifier.f15489d;
            ListItemKt.a(p2, PaddingKt.m(RowScope.c(rowScopeInstance, companion3, 1.0f, false, 2, (Object) null), f8889f, 0.0f, f8890g, 0.0f, 10, (Object) null), ComposableLambdaKt.e(-318094245, true, new ThreeLine$ListItem$1$2(function29, function27, function28), q2, 54), q2, 390, 0);
            if (function210 != null) {
                q2.X(1136529043);
                float f6 = f8894k;
                composer2 = q2;
                ListItemKt.c(Dp.m(f5 - f6), PaddingKt.m(companion3, 0.0f, f6, f8895l, 0.0f, 9, (Object) null), function25, q2, ((i7 >> 9) & 896) | 54, 0);
                composer2.M();
            } else {
                composer2 = q2;
                composer2.X(1136802928);
                composer2.M();
            }
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            modifier2 = modifier4;
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x3 = composer2.x();
        if (x3 != null) {
            x3.a(new ThreeLine$ListItem$2(this, modifier2, function2, function22, function23, function24, function25, i2, i3));
        }
    }
}
