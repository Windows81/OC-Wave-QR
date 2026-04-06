package com.hansecom.abt.ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.ComposableSingletons$UpIconButtonKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$UpIconButtonKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$UpIconButtonKt$lambda1$1 f37866z = new ComposableSingletons$UpIconButtonKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1121671135, i2, -1, "com.hansecom.abt.ui.components.ComposableSingletons$UpIconButtonKt.lambda-1.<anonymous> (UpIconButton.kt:17)");
            }
            IconKt.e(ArrowBackKt.a(Icons.AutoMirrored.Outlined.f8949a), StringResources_androidKt.b(R.string.R9, composer, 0), SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), 0, composer, 384, 8);
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
