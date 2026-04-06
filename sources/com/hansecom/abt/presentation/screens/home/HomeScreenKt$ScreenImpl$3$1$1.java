package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import com.hansecom.abt.presentation.navigation.NavigationBarsHelper;
import com.hansecom.abt.presentation.navigation.NavigationBarsState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$1$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend")
public final class HomeScreenKt$ScreenImpl$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ MutableState E;
    public final /* synthetic */ State F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$ScreenImpl$3$1$1(MutableState mutableState, State state, Continuation continuation) {
        super(2, continuation);
        this.E = mutableState;
        this.F = state;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeScreenKt$ScreenImpl$3$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new HomeScreenKt$ScreenImpl$3$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            NavBackStackEntry P = HomeScreenKt.K(this.F);
            NavDestination g2 = P != null ? P.g() : null;
            if (g2 != null) {
                NavigationBarsHelper navigationBarsHelper = NavigationBarsHelper.f34208a;
                if (!navigationBarsHelper.c(g2)) {
                    boolean b2 = navigationBarsHelper.b(HomeScreenKt.K(this.F));
                    boolean a2 = navigationBarsHelper.a(HomeScreenKt.K(this.F));
                    MutableState mutableState = this.E;
                    mutableState.setValue(((NavigationBarsState) mutableState.getValue()).a(b2, a2, b2 ? String.valueOf(g2.s()) : ((NavigationBarsState) this.E.getValue()).d()));
                }
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
