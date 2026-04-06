package com.hansecom.abt.presentation.screens.main.debugMenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class DebugMenuDialogKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PersistentList f37624z;

    /* access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f40552a;
    }

    public static final Unit g(DebugMenu.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1376861792, i2, -1, "com.hansecom.abt.presentation.screens.main.debugMenu.Preview.<anonymous> (DebugMenuDialog.kt:146)");
            }
            composer.X(1518169073);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new k();
                composer.N(g2);
            }
            Function0 function0 = (Function0) g2;
            composer.M();
            PersistentList persistentList = this.f37624z;
            DebugMenu.State state = new DebugMenu.State(persistentList, (String) persistentList.get(0));
            composer.X(1518174161);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new l();
                composer.N(g3);
            }
            composer.M();
            DebugMenuDialogKt.g(function0, state, (Function1) g3, FlowKt.A(), (Modifier) null, composer, 390, 16);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
