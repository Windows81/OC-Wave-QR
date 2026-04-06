package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AlertDialogKt$AlertDialogContent$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7053A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7054B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7055z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogContent$1(Function2 function2, Function2 function22, Function2 function23) {
        super(2);
        this.f7055z = function2;
        this.f7053A = function22;
        this.f7054B = function23;
    }

    public final void b(Composer composer, int i2) {
        ComposableLambda composableLambda;
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(629950291, i2, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:210)");
            }
            Function2 function2 = this.f7055z;
            Function2 function22 = this.f7053A;
            Function2 function23 = this.f7054B;
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            ComposableLambda composableLambda2 = null;
            if (function2 == null) {
                composer.X(-366997612);
                composer.M();
                composableLambda = null;
            } else {
                composer.X(-366997611);
                composableLambda = ComposableLambdaKt.e(620104160, true, new AlertDialogKt$AlertDialogContent$1$1$1$1(function2), composer, 54);
                composer.M();
            }
            if (function22 == null) {
                composer.X(-366576167);
            } else {
                composer.X(-366576166);
                composableLambda2 = ComposableLambdaKt.e(1965858367, true, new AlertDialogKt$AlertDialogContent$1$1$2$1(function22), composer, 54);
            }
            composer.M();
            AlertDialogKt.a(columnScopeInstance, composableLambda, composableLambda2, composer, 6);
            function23.m(composer, 0);
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
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
