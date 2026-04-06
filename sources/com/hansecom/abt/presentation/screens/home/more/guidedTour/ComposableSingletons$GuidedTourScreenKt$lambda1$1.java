package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.data.config.guidedTour.GuidedTourPage;
import com.hansecom.abt.data.config.guidedTour.MediaType;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.more.guidedTour.ComposableSingletons$GuidedTourScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$GuidedTourScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$GuidedTourScreenKt$lambda1$1 f37444z = new ComposableSingletons$GuidedTourScreenKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-542512709, i2, -1, "com.hansecom.abt.presentation.screens.home.more.guidedTour.ComposableSingletons$GuidedTourScreenKt.lambda-1.<anonymous> (GuidedTourScreen.kt:185)");
            }
            GuidedTour.State state = new GuidedTour.State(ExtensionsKt.b(new GuidedTourPage(new StringValue.Value("Header"), MediaType.IMAGE, "")));
            composer.X(1848642433);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new a();
                composer.N(g2);
            }
            composer.M();
            GuidedTourScreenKt.o(state, (Function0) g2, composer, 48);
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
