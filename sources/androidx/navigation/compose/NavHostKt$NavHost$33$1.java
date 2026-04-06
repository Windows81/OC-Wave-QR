package androidx.navigation.compose;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
public final class NavHostKt$NavHost$33$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Transition E;
    public final /* synthetic */ NavHostController F;
    public final /* synthetic */ Map G;
    public final /* synthetic */ State H;
    public final /* synthetic */ ComposeNavigator I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(Transition transition, NavHostController navHostController, Map map, State state, ComposeNavigator composeNavigator, Continuation continuation) {
        super(2, continuation);
        this.E = transition;
        this.F = navHostController;
        this.G = map;
        this.H = state;
        this.I = composeNavigator;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NavHostKt$NavHost$33$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new NavHostKt$NavHost$33$1(this.E, this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            if (Intrinsics.d(this.E.i(), this.E.q()) && (this.F.G() == null || Intrinsics.d(this.E.q(), this.F.G()))) {
                ComposeNavigator composeNavigator = this.I;
                for (NavBackStackEntry o2 : NavHostKt.l(this.H)) {
                    composeNavigator.o(o2);
                }
                Map map = this.G;
                Transition transition = this.E;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!Intrinsics.d(entry.getKey(), ((NavBackStackEntry) transition.q()).h())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map map2 = this.G;
                for (Map.Entry key : linkedHashMap.entrySet()) {
                    map2.remove(key.getKey());
                }
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
