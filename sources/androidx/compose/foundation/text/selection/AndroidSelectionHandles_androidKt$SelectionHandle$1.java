package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f6700A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f6701B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ OffsetProvider D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f6702z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1(ViewConfiguration viewConfiguration, long j2, boolean z2, Modifier modifier, OffsetProvider offsetProvider) {
        super(2);
        this.f6702z = viewConfiguration;
        this.f6700A = j2;
        this.f6701B = z2;
        this.C = modifier;
        this.D = offsetProvider;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1365123137, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
            }
            ProvidedValue d2 = CompositionLocalsKt.t().d(this.f6702z);
            final long j2 = this.f6700A;
            final boolean z2 = this.f6701B;
            final Modifier modifier = this.C;
            final OffsetProvider offsetProvider = this.D;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(1260045569, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, 1 & i2)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1260045569, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
                        }
                        if (j2 != 9205357640488583168L) {
                            composer.X(-837626688);
                            Arrangement.Horizontal b2 = z2 ? Arrangement.Absolute.f3748a.b() : Arrangement.Absolute.f3748a.a();
                            Modifier r2 = SizeKt.r(modifier, DpSize.j(j2), DpSize.i(j2), 0.0f, 0.0f, 12, (Object) null);
                            OffsetProvider offsetProvider = offsetProvider;
                            boolean z2 = z2;
                            MeasurePolicy b3 = RowKt.b(b2, Alignment.f15444a.l(), composer, 0);
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
                            Composer b4 = Updater.b(composer);
                            Updater.g(b4, b3, companion.c());
                            Updater.g(b4, I, companion.e());
                            Function2 b5 = companion.b();
                            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a2))) {
                                b4.N(Integer.valueOf(a2));
                                b4.A(Integer.valueOf(a2), b5);
                            }
                            Updater.g(b4, e2, companion.d());
                            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
                            Modifier.Companion companion2 = Modifier.f15489d;
                            boolean l2 = composer.l(offsetProvider);
                            Object g2 = composer.g();
                            if (l2 || g2 == Composer.f14567a.a()) {
                                g2 = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1(offsetProvider);
                                composer.N(g2);
                            }
                            AndroidSelectionHandles_androidKt.c(companion2, (Function0) g2, z2, composer, 6);
                            composer.T();
                            composer.M();
                        } else {
                            composer.X(-836697680);
                            Modifier modifier = modifier;
                            boolean l3 = composer.l(offsetProvider);
                            OffsetProvider offsetProvider2 = offsetProvider;
                            Object g3 = composer.g();
                            if (l3 || g3 == Composer.f14567a.a()) {
                                g3 = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1(offsetProvider2);
                                composer.N(g3);
                            }
                            AndroidSelectionHandles_androidKt.c(modifier, (Function0) g3, z2, composer, 0);
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
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
