package com.hansecom.abt.ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme;
import com.hansecom.abt.ui.theme.typography.AbtTypography;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AbtBaseThemeKt$AbtBaseTheme$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AbtTypography f38846A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f38847B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtColorScheme f38848z;

    public AbtBaseThemeKt$AbtBaseTheme$1(AbtColorScheme abtColorScheme, AbtTypography abtTypography, Function2 function2) {
        this.f38848z = abtColorScheme;
        this.f38846A = abtTypography;
        this.f38847B = function2;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2058213821, i2, -1, "com.hansecom.abt.ui.theme.AbtBaseTheme.<anonymous> (AbtBaseTheme.kt:42)");
            }
            ColorScheme E = this.f38848z.E();
            final AbtTypography abtTypography = this.f38846A;
            final Function2 function2 = this.f38847B;
            MaterialThemeKt.g(E, (Shapes) null, (Typography) null, ComposableLambdaKt.e(-795622767, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if ((i2 & 3) != 2 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-795622767, i2, -1, "com.hansecom.abt.ui.theme.AbtBaseTheme.<anonymous>.<anonymous> (AbtBaseTheme.kt:43)");
                        }
                        TextKt.h(abtTypography.b(), function2, composer, 0);
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
            }, composer, 54), composer, 3072, 6);
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
