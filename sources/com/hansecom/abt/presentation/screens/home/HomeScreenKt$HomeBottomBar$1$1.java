package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.HomeScreenKt$HomeBottomBar$1$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend")
public final class HomeScreenKt$HomeBottomBar$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ State E;
    public final /* synthetic */ List F;
    public final /* synthetic */ MutableIntState G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$HomeBottomBar$1$1(State state, List list, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.E = state;
        this.F = list;
        this.G = mutableIntState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeScreenKt$HomeBottomBar$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new HomeScreenKt$HomeBottomBar$1$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            NavBackStackEntry O = HomeScreenKt.u(this.E);
            if (O != null) {
                List list = this.F;
                MutableIntState mutableIntState = this.G;
                Iterator it = list.iterator();
                int i2 = 0;
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    HomeBottomBarItems homeBottomBarItems = (HomeBottomBarItems) it.next();
                    for (NavDestination d2 : NavDestination.J.c(O.g())) {
                        if (NavDestination.J.d(d2, Reflection.b(homeBottomBarItems.f().getClass()))) {
                            break loop0;
                        }
                    }
                    i2++;
                }
                HomeScreenKt.t(mutableIntState, i2);
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
