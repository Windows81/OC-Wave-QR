package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class TimePickerKt$TimePickerTextField$1$1$2 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11508A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f11509B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f11510z;

    public TimePickerKt$TimePickerTextField$1$1$2(TextFieldValue textFieldValue, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
        this.f11510z = textFieldValue;
        this.f11508A = mutableInteractionSource;
        this.f11509B = textFieldColors;
    }

    public final void b(Function2 function2, Composer composer, int i2) {
        int i3;
        Composer composer2 = composer;
        Function2 function22 = function2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.l(function22) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1007938103, i3, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1925)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10533a;
            String i4 = this.f11510z.i();
            VisualTransformation c2 = VisualTransformation.f18929a.c();
            PaddingValues a2 = PaddingKt.a(Dp.m((float) 0));
            final MutableInteractionSource mutableInteractionSource = this.f11508A;
            final TextFieldColors textFieldColors = this.f11509B;
            outlinedTextFieldDefaults.e(i4, function2, true, true, c2, mutableInteractionSource, false, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, textFieldColors, a2, ComposableLambdaKt.e(769667466, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(769667466, i2, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1935)");
                        }
                        OutlinedTextFieldDefaults.f10533a.c(true, false, mutableInteractionSource, (Modifier) null, textFieldColors, ShapesKt.g(TimeInputTokens.f14236a.c(), composer, 6), 0.0f, 0.0f, composer, 100663734, 200);
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
            }, composer2, 54), composer, ((i3 << 3) & 112) | 224640, 14352384, 16320);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
