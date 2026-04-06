package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaMockCardKt$FareMediaMockCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f38211z;

    public FareMediaMockCardKt$FareMediaMockCard$1(int i2) {
        this.f38211z = i2;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$FareMediaCardBase");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1351920369, i3, -1, "com.hansecom.abt.ui.components.fareMediaCard.FareMediaMockCard.<anonymous> (FareMediaMockCard.kt:25)");
            }
            ImageKt.a(PainterResources_androidKt.c(this.f38211z, composer, 0), (String) null, AspectRatioKt.b(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), FareMediaCardBaseKt.f(), false, 2, (Object) null), (Alignment) null, ContentScale.f17026a.b(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
