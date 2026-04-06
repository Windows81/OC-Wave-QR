package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import com.hansecom.abt.ui.components.loading.LoadingContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ChangeSecurityQuestionScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f35344A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35345B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestions.State.Main f35346z;

    public ChangeSecurityQuestionScreenKt$ScreenImpl$1(ChangeSecurityQuestions.State.Main main, Function0 function0, Function1 function1, Function0 function02) {
        this.f35346z = main;
        this.f35344A = function0;
        this.f35345B = function1;
        this.C = function02;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1115440223, i2, -1, "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ScreenImpl.<anonymous> (ChangeSecurityQuestionScreen.kt:73)");
            }
            if (this.f35346z.n()) {
                composer.X(-1035102553);
                LoadingContentKt.b(composer, 0);
                composer.M();
            } else {
                composer.X(-1035055433);
                ChangeSecurityQuestionScreenKt.j(this.f35346z, this.f35344A, this.f35345B, this.C, composer, 0);
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
