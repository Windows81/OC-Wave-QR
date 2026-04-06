package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DatePickerKt$IconButtonWithTooltip$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f9744A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f9745B;
    public final /* synthetic */ ImageVector C;
    public final /* synthetic */ String D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f9746z;

    public DatePickerKt$IconButtonWithTooltip$2(Function0 function0, Modifier modifier, boolean z2, ImageVector imageVector, String str) {
        this.f9746z = function0;
        this.f9744A = modifier;
        this.f9745B = z2;
        this.C = imageVector;
        this.D = str;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1124908186, i2, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous> (DatePicker.kt:2286)");
            }
            Function0 function0 = this.f9746z;
            Modifier modifier = this.f9744A;
            boolean z2 = this.f9745B;
            final ImageVector imageVector = this.C;
            final String str = this.D;
            IconButtonKt.e(function0, modifier, z2, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, ComposableLambdaKt.e(-1301085432, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1301085432, i2, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2287)");
                        }
                        IconKt.e(imageVector, str, (Modifier) null, 0, composer, 0, 12);
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
            }, composer, 54), composer, 1572864, 56);
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
