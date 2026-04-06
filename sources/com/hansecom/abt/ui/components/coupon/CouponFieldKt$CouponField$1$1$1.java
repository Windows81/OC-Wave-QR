package com.hansecom.abt.ui.components.coupon;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class CouponFieldKt$CouponField$1$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f38117z;

    public CouponFieldKt$CouponField$1$1$1(Function0 function0) {
        this.f38117z = function0;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1138352542, i2, -1, "com.hansecom.abt.ui.components.coupon.CouponField.<anonymous>.<anonymous>.<anonymous> (CouponField.kt:91)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.f33016r, composer, 0), (String) null, ClickableKt.f(Modifier.f15489d, false, (String) null, (Role) null, this.f38117z, 7, (Object) null), 0, composer, 48, 8);
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
