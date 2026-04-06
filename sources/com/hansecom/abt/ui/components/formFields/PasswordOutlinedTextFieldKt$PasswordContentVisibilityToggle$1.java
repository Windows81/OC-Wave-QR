package com.hansecom.abt.ui.components.formFields;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class PasswordOutlinedTextFieldKt$PasswordContentVisibilityToggle$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f38320A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f38321z;

    public PasswordOutlinedTextFieldKt$PasswordContentVisibilityToggle$1(int i2, int i3) {
        this.f38321z = i2;
        this.f38320A = i3;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1070657256, i2, -1, "com.hansecom.abt.ui.components.formFields.PasswordContentVisibilityToggle.<anonymous> (PasswordOutlinedTextField.kt:62)");
            }
            IconKt.d(PainterResources_androidKt.c(this.f38321z, composer, 0), StringResourceKt.a(this.f38320A, new Object[0], composer, 0), (Modifier) null, 0, composer, 0, 12);
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
