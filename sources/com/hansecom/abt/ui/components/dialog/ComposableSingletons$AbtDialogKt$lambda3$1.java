package com.hansecom.abt.ui.components.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.dialog.ComposableSingletons$AbtDialogKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$AbtDialogKt$lambda3$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtDialogKt$lambda3$1 f38151z = new ComposableSingletons$AbtDialogKt$lambda3$1();

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-540807425, i3, -1, "com.hansecom.abt.ui.components.dialog.ComposableSingletons$AbtDialogKt.lambda-3.<anonymous> (AbtDialog.kt:243)");
            }
            Function2 a2 = ComposableSingletons$AbtDialogKt.f38144a.a();
            composer2.X(-2130028063);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new e();
                composer2.N(g2);
            }
            Function0 function0 = (Function0) g2;
            composer.M();
            composer2.X(-2130026879);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new f();
                composer2.N(g3);
            }
            Function0 function02 = (Function0) g3;
            composer.M();
            composer2.X(-2130029215);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new g();
                composer2.N(g4);
            }
            composer.M();
            AbtDialogKt.e("title", "body", "warning", false, a2, (Function2) null, (AbtButtonState) null, (String) null, (Integer) null, (AbtButtonStyle) null, function0, (AbtButtonState) null, "second button", function02, (AbtButtonStyle) null, (Function0) g4, false, composer, 25014, 200070, 84968);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
