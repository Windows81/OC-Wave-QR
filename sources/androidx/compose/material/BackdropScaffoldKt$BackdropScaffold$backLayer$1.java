package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
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
public final class BackdropScaffoldKt$BackdropScaffold$backLayer$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldState f7236A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7237B;
    public final /* synthetic */ Function2 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7238z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$backLayer$1(boolean z2, BackdropScaffoldState backdropScaffoldState, Function2 function2, Function2 function22) {
        super(2);
        this.f7238z = z2;
        this.f7236A = backdropScaffoldState;
        this.f7237B = function2;
        this.C = function22;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(461235665, i2, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:374)");
            }
            if (this.f7238z) {
                composer.X(1665275251);
                Function2 function2 = this.f7237B;
                Function2 function22 = this.C;
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
                function2.m(composer, 0);
                function22.m(composer, 0);
                composer.T();
                composer.M();
            } else {
                composer.X(1665408644);
                BackdropScaffoldKt.a((BackdropValue) this.f7236A.c().x(), this.f7237B, this.C, composer, 0);
                composer.M();
            }
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
