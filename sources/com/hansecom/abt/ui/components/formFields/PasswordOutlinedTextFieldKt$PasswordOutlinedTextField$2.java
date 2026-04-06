package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class PasswordOutlinedTextFieldKt$PasswordOutlinedTextField$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38322A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f38323z;

    public PasswordOutlinedTextFieldKt$PasswordOutlinedTextField$2(boolean z2, Function0 function0) {
        this.f38323z = z2;
        this.f38322A = function0;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(431770487, i2, -1, "com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextField.<anonymous> (PasswordOutlinedTextField.kt:44)");
            }
            PasswordOutlinedTextFieldKt.d(this.f38323z, (Modifier) null, this.f38322A, composer, 0, 2);
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
