package com.hansecom.abt.ui.components.coupon;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.coupon.ComposableSingletons$CouponFieldKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$CouponFieldKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CouponFieldKt$lambda1$1 f38114z = new ComposableSingletons$CouponFieldKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2091715867, i2, -1, "com.hansecom.abt.ui.components.coupon.ComposableSingletons$CouponFieldKt.lambda-1.<anonymous> (CouponField.kt:81)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.f33018t, composer, 0), (String) null, (Modifier) null, 0, composer, 48, 12);
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
