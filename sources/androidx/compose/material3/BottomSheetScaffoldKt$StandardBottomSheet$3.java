package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class BottomSheetScaffoldKt$StandardBottomSheet$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9287A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f9288B;
    public final /* synthetic */ CoroutineScope C;
    public final /* synthetic */ boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f9289z;

    public BottomSheetScaffoldKt$StandardBottomSheet$3(SheetState sheetState, Function2 function2, Function3 function3, CoroutineScope coroutineScope, boolean z2) {
        this.f9289z = sheetState;
        this.f9287A = function2;
        this.f9288B = function3;
        this.C = coroutineScope;
        this.D = z2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1508311921, i2, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:323)");
            }
            Modifier s2 = BottomSheetScaffoldKt.s(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), this.f9289z);
            Function2 function2 = this.f9287A;
            Function3 function3 = this.f9288B;
            SheetState sheetState = this.f9289z;
            CoroutineScope coroutineScope = this.C;
            boolean z2 = this.D;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, s2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            if (function2 != null) {
                composer.X(-1044068159);
                Strings.Companion companion2 = Strings.f12320b;
                SheetDefaultsKt.g(columnScopeInstance, ComposableLambdaKt.e(-511691176, true, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(sheetState, coroutineScope, z2, Strings_androidKt.b(Strings.a(R.string.f10657d), composer, 0), Strings_androidKt.b(Strings.a(R.string.f10654a), composer, 0), Strings_androidKt.b(Strings.a(R.string.f10655b), composer, 0), function2), composer, 54), composer, 54);
                composer.M();
            } else {
                composer.X(-1040260677);
                composer.M();
            }
            function3.d(columnScopeInstance, composer, 6);
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
