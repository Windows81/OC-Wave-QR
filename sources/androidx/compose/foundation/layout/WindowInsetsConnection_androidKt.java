package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class WindowInsetsConnection_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f4208a = ViewConfiguration.getScrollFriction();

    /* renamed from: b  reason: collision with root package name */
    public static final double f4209b;

    /* renamed from: c  reason: collision with root package name */
    public static final double f4210c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f4209b = log;
        f4210c = log - 1.0d;
    }

    public static final NestedScrollConnection d(AndroidWindowInsets androidWindowInsets, int i2, Composer composer, int i3) {
        composer.X(-1011341039);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1011341039, i3, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.f3888z;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            return doNothingNestedScrollConnection;
        }
        SideCalculator a2 = SideCalculator.f4151a.a(i2, (LayoutDirection) composer.C(CompositionLocalsKt.m()));
        View view = (View) composer.C(AndroidCompositionLocals_androidKt.j());
        Density density = (Density) composer.C(CompositionLocalsKt.g());
        boolean W = ((((i3 & 14) ^ 6) > 4 && composer.W(androidWindowInsets)) || (i3 & 6) == 4) | composer.W(view) | composer.W(a2) | composer.W(density);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new WindowInsetsNestedScrollConnection(androidWindowInsets, view, a2, density);
            composer.N(g2);
        }
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) g2;
        boolean l2 = composer.l(windowInsetsNestedScrollConnection);
        Object g3 = composer.g();
        if (l2 || g3 == Composer.f14567a.a()) {
            g3 = new WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1(windowInsetsNestedScrollConnection);
            composer.N(g3);
        }
        EffectsKt.c(windowInsetsNestedScrollConnection, (Function1) g3, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return windowInsetsNestedScrollConnection;
    }
}
