package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
final class AccountScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Account.State f35063z;

    /* access modifiers changed from: private */
    public static final Unit p() {
        return Unit.f40552a;
    }

    public static final Unit q() {
        return Unit.f40552a;
    }

    public static final Unit s() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit t() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit u() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit v() {
        return Unit.f40552a;
    }

    public static final Unit w() {
        return Unit.f40552a;
    }

    public final void k(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-212493277, i3, -1, "com.hansecom.abt.presentation.screens.home.account.Preview.<anonymous> (AccountScreen.kt:236)");
            }
            Account.State state = this.f35063z;
            composer.X(300911570);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new M();
                composer.N(g2);
            }
            Function0 function0 = (Function0) g2;
            composer.M();
            composer.X(300912626);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new N();
                composer.N(g3);
            }
            Function0 function02 = (Function0) g3;
            composer.M();
            composer.X(300913906);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new O();
                composer.N(g4);
            }
            Function0 function03 = (Function0) g4;
            composer.M();
            composer.X(300915186);
            Object g5 = composer.g();
            if (g5 == companion.a()) {
                g5 = new P();
                composer.N(g5);
            }
            Function0 function04 = (Function0) g5;
            composer.M();
            composer.X(300916498);
            Object g6 = composer.g();
            if (g6 == companion.a()) {
                g6 = new Q();
                composer.N(g6);
            }
            Function0 function05 = (Function0) g6;
            composer.M();
            composer.X(300917618);
            Object g7 = composer.g();
            if (g7 == companion.a()) {
                g7 = new S();
                composer.N(g7);
            }
            Function0 function06 = (Function0) g7;
            composer.M();
            composer.X(300918418);
            Object g8 = composer.g();
            if (g8 == companion.a()) {
                g8 = new T();
                composer.N(g8);
            }
            composer.M();
            AccountScreenKt.B(state, (Function1) null, (Flow) null, function0, function02, function03, function04, function05, function06, (Function0) g8, composer, 920349696, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        k((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
