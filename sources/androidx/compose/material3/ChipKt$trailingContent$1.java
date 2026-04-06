package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ChipKt$trailingContent$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9435A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f9436z;

    public ChipKt$trailingContent$1(long j2, Function2 function2) {
        this.f9436z = j2;
        this.f9435A = function2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-566924201, i2, -1, "androidx.compose.material3.trailingContent.<anonymous> (Chip.kt:2233)");
            }
            CompositionLocalKt.c(ContentColorKt.a().d(Color.h(this.f9436z)), this.f9435A, composer, ProvidedValue.f14769i);
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
