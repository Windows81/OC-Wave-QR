package com.hansecom.abt.presentation.screens.home.trip;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.trip.TripPlanner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.trip.ComposableSingletons$TripPlannerScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$TripPlannerScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$TripPlannerScreenKt$lambda1$1 f37498z = new ComposableSingletons$TripPlannerScreenKt$lambda1$1();

    public static final Unit e(String str, String str2) {
        Intrinsics.i(str, "<unused var>");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1998218704, i2, -1, "com.hansecom.abt.presentation.screens.home.trip.ComposableSingletons$TripPlannerScreenKt.lambda-1.<anonymous> (TripPlannerScreen.kt:120)");
            }
            TripPlanner.State state = new TripPlanner.State((String) null, (String) null, 3, (DefaultConstructorMarker) null);
            composer.X(-349675491);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new a();
                composer.N(g2);
            }
            composer.M();
            TripPlannerScreenKt.c(state, (Function2) g2, composer, 48);
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
