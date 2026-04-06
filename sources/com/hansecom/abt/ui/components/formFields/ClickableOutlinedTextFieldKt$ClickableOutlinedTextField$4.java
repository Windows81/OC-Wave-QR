package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$4 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Painter f38266A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f38267z;

    public ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$4(Function0 function0, Painter painter) {
        this.f38267z = function0;
        this.f38266A = painter;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1507042548, i2, -1, "com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextField.<anonymous> (ClickableOutlinedTextField.kt:58)");
            }
            if (this.f38267z != null) {
                composer.X(300924545);
                Function0 function0 = this.f38267z;
                final Painter painter = this.f38266A;
                IconButtonKt.e(function0, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, ComposableLambdaKt.e(471286725, true, new Function2<Composer, Integer, Unit>() {
                    public final void b(Composer composer, int i2) {
                        if ((i2 & 3) != 2 || !composer.t()) {
                            if (ComposerKt.P()) {
                                ComposerKt.Y(471286725, i2, -1, "com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextField.<anonymous>.<anonymous> (ClickableOutlinedTextField.kt:62)");
                            }
                            IconKt.d(painter, (String) null, SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), 0, composer, 432, 8);
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
                }, composer, 54), composer, 1572864, 62);
                composer.M();
            } else {
                composer.X(301251812);
                IconKt.d(this.f38266A, (String) null, SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), 0, composer, 432, 8);
                composer.M();
            }
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
