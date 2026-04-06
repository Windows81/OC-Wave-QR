package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PaymentMethodItemKt$lambda1$1 implements Function3<BoxScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PaymentMethodItemKt$lambda1$1 f38672z = new ComposableSingletons$PaymentMethodItemKt$lambda1$1();

    public final void b(BoxScope boxScope, Composer composer, int i2) {
        Intrinsics.i(boxScope, "$this$ImageContainer");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2114372269, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt.lambda-1.<anonymous> (PaymentMethodItem.kt:105)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.f33008j, composer, 0), (String) null, SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), 0, composer, 432, 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
