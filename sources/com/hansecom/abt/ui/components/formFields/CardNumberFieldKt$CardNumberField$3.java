package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import coil.compose.EqualityDelegate;
import coil.compose.SingletonAsyncImageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class CardNumberFieldKt$CardNumberField$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38260z;

    public CardNumberFieldKt$CardNumberField$3(String str) {
        this.f38260z = str;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(468019355, i3, -1, "com.hansecom.abt.ui.components.formFields.CardNumberField.<anonymous> (CardNumberField.kt:49)");
            }
            SingletonAsyncImageKt.a(this.f38260z, (String) null, SizeKt.y(SizeKt.i(PaddingKt.m(Modifier.f15489d, 0.0f, 0.0f, Dp.m((float) 8), 0.0f, 11, (Object) null), Dp.m((float) 32)), Dp.m((float) 48)), (Function1) null, (Function1) null, (Alignment) null, ContentScale.f17026a.d(), 0.0f, (ColorFilter) null, 0, false, (EqualityDelegate) null, composer, 1573296, 0, 4024);
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
