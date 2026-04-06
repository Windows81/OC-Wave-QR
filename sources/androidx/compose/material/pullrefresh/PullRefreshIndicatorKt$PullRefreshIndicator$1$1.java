package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
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
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PullRefreshIndicatorKt$PullRefreshIndicator$1$1 extends Lambda implements Function3<Boolean, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f9022A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f9023z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$PullRefreshIndicator$1$1(long j2, PullRefreshState pullRefreshState) {
        super(3);
        this.f9023z = j2;
        this.f9022A = pullRefreshState;
    }

    public final void b(boolean z2, Composer composer, int i2) {
        int i3;
        boolean z3 = z2;
        Composer composer2 = composer;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.d(z3) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1853731063, i3, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier f2 = SizeKt.f(companion, 0.0f, 1, (Object) null);
            Alignment e2 = Alignment.f15444a.e();
            long j2 = this.f9023z;
            PullRefreshState pullRefreshState = this.f9022A;
            MeasurePolicy g2 = BoxKt.g(e2, false);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, f2);
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
            Updater.g(b2, e3, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            float m2 = Dp.m(Dp.m(PullRefreshIndicatorKt.f9008c + PullRefreshIndicatorKt.f9009d) * ((float) 2));
            if (z3) {
                composer2.X(-1566007818);
                ProgressIndicatorKt.b(SizeKt.t(companion, m2), j2, PullRefreshIndicatorKt.f9009d, 0, 0, composer, 390, 24);
                composer.M();
            } else {
                composer2.X(-1565760097);
                PullRefreshIndicatorKt.b(pullRefreshState, j2, SizeKt.t(companion, m2), composer, 384);
                composer.M();
            }
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
