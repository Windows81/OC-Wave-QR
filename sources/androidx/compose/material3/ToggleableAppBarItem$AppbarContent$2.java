package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ToggleableAppBarItem$AppbarContent$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ToggleableAppBarItem f11537z;

    public ToggleableAppBarItem$AppbarContent$2(ToggleableAppBarItem toggleableAppBarItem) {
        this.f11537z = toggleableAppBarItem;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(694023085, i2, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:201)");
            }
            IconButtonKt.i(this.f11537z.f11530a, this.f11537z.f11531b, (Modifier) null, this.f11537z.f11533d, (IconToggleButtonColors) null, (MutableInteractionSource) null, (Shape) null, this.f11537z.f11532c, composer, 0, 116);
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
