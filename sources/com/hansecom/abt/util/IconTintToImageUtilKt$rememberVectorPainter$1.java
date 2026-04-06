package com.hansecom.abt.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
final class IconTintToImageUtilKt$rememberVectorPainter$1 implements Function4<Float, Float, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImageVector f39016z;

    public final void b(float f2, float f3, Composer composer, int i2) {
        if ((i2 & 129) != 128 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-441663018, i2, -1, "com.hansecom.abt.util.rememberVectorPainter.<anonymous> (IconTintToImageUtil.kt:19)");
            }
            VectorPainterKt.a(this.f39016z.i(), (Map) null, composer, 0, 2);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
