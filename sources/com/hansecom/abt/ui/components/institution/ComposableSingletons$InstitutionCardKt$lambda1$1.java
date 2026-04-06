package com.hansecom.abt.ui.components.institution;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.model.InstitutionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.institution.ComposableSingletons$InstitutionCardKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$InstitutionCardKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$InstitutionCardKt$lambda1$1 f38432z = new ComposableSingletons$InstitutionCardKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2067498828, i2, -1, "com.hansecom.abt.ui.components.institution.ComposableSingletons$InstitutionCardKt.lambda-1.<anonymous> (InstitutionCard.kt:76)");
            }
            InstitutionState institutionState = new InstitutionState(0, "Name", "Type", (String) null, (String) null, 24, (DefaultConstructorMarker) null);
            composer.X(1822583394);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new a();
                composer.N(g2);
            }
            composer.M();
            InstitutionCardKt.b((Modifier) null, institutionState, (Function0) g2, composer, 384, 1);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
