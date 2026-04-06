package com.hansecom.abt.presentation.screens.main.lock;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.main.lock.ComposableSingletons$LockScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$LockScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$LockScreenKt$lambda1$1 f37665z = new ComposableSingletons$LockScreenKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1415495832, i2, -1, "com.hansecom.abt.presentation.screens.main.lock.ComposableSingletons$LockScreenKt.lambda-1.<anonymous> (LockScreen.kt:78)");
            }
            AbtTopBarKt.b(StringResources_androidKt.b(R.string.Z6, composer, 0), (Modifier) null, (Function0) null, (Function3) null, true, composer, 24960, 10);
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
