package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCursorHandle_androidKt$CursorHandle$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5462A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f5463z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$1(long j2, Modifier modifier) {
        super(2);
        this.f5463z = j2;
        this.f5462A = modifier;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1653527038, i2, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
            }
            if (this.f5463z != 9205357640488583168L) {
                composer.X(1828931592);
                Modifier r2 = SizeKt.r(this.f5462A, DpSize.j(this.f5463z), DpSize.i(this.f5463z), 0.0f, 0.0f, 12, (Object) null);
                MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.m(), false);
                int a2 = ComposablesKt.a(composer, 0);
                CompositionLocalMap I = composer.I();
                Modifier e2 = ComposedModifierKt.e(composer, r2);
                ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
                Function0 a3 = companion.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer.y(a3);
                } else {
                    composer.K();
                }
                Composer b2 = Updater.b(composer);
                Updater.g(b2, g2, companion.c());
                Updater.g(b2, I, companion.e());
                Function2 b3 = companion.b();
                if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                    b2.N(Integer.valueOf(a2));
                    b2.A(Integer.valueOf(a2), b3);
                }
                Updater.g(b2, e2, companion.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                AndroidCursorHandle_androidKt.b((Modifier) null, composer, 0, 1);
                composer.T();
                composer.M();
            } else {
                composer.X(1829298756);
                AndroidCursorHandle_androidKt.b(this.f5462A, composer, 0, 0);
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
