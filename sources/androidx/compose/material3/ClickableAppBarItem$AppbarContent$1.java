package androidx.compose.material3;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ClickableAppBarItem$AppbarContent$1 implements Function3<TooltipScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClickableAppBarItem f9441z;

    public ClickableAppBarItem$AppbarContent$1(ClickableAppBarItem clickableAppBarItem) {
        this.f9441z = clickableAppBarItem;
    }

    public final void b(TooltipScope tooltipScope, Composer composer, int i2) {
        int i3;
        TooltipScope tooltipScope2 = tooltipScope;
        Composer composer2 = composer;
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? composer2.W(tooltipScope2) : composer2.l(tooltipScope2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-816691117, i3, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:163)");
            }
            final ClickableAppBarItem clickableAppBarItem = this.f9441z;
            TooltipKt.g(tooltipScope, (Modifier) null, (Shape) null, 0.0f, (Shape) null, 0, 0, 0.0f, 0.0f, ComposableLambdaKt.e(837175745, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    int i3 = i2;
                    if (composer.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(837175745, i3, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous>.<anonymous> (AppBarDsl.kt:163)");
                        }
                        TextKt.j(clickableAppBarItem.f9440d, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 262142);
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
            }, composer2, 54), composer, (i3 & 14) | 805306368, 255);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((TooltipScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
