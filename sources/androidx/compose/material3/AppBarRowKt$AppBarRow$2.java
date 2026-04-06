package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AppBarRowKt$AppBarRow$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AppBarMenuState f9208A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AppBarOverflowState f9209B;
    public final /* synthetic */ State C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f9210z;

    /* access modifiers changed from: private */
    public static final Unit e(AppBarMenuState appBarMenuState) {
        appBarMenuState.a();
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-815780026, i3, -1, "androidx.compose.material3.AppBarRow.<anonymous> (AppBarRow.kt:73)");
            }
            Function3 function3 = this.f9210z;
            AppBarMenuState appBarMenuState = this.f9208A;
            AppBarOverflowState appBarOverflowState = this.f9209B;
            State state = this.C;
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function3.d(appBarMenuState, composer2, 6);
            boolean b4 = appBarMenuState.b();
            Object g3 = composer.g();
            if (g3 == Composer.f14567a.a()) {
                g3 = new C(appBarMenuState);
                composer2.N(g3);
            }
            AndroidMenu_androidKt.d(b4, (Function0) g3, (Modifier) null, 0, (ScrollState) null, (PopupProperties) null, (Shape) null, 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(1786124721, true, new AppBarRowKt$AppBarRow$2$1$2(appBarOverflowState, state, appBarMenuState), composer2, 54), composer, 48, 48, 2044);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
