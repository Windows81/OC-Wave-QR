package androidx.navigation.compose;

import androidx.activity.BackEventCompat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {524}, m = "invokeSuspend")
public final class NavHostKt$NavHost$25$1 extends SuspendLambda implements Function2<Flow<BackEventCompat>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ComposeNavigator F;
    public final /* synthetic */ State G;
    public final /* synthetic */ MutableFloatState H;
    public final /* synthetic */ MutableState I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$25$1(ComposeNavigator composeNavigator, State state, MutableFloatState mutableFloatState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.F = composeNavigator;
        this.G = state;
        this.H = mutableFloatState;
        this.I = mutableState;
    }

    /* renamed from: A */
    public final Object m(Flow flow, Continuation continuation) {
        return ((NavHostKt$NavHost$25$1) s(flow, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(this.F, this.G, this.H, this.I, continuation);
        navHostKt$NavHost$25$1.E = obj;
        return navHostKt$NavHost$25$1;
    }

    public final Object x(Object obj) {
        NavBackStackEntry navBackStackEntry;
        NavBackStackEntry navBackStackEntry2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Flow flow = (Flow) this.E;
            if (NavHostKt.m(this.G).size() > 1) {
                NavHostKt.o(this.H, 0.0f);
                navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.q0(NavHostKt.m(this.G));
                ComposeNavigator composeNavigator = this.F;
                Intrinsics.f(navBackStackEntry2);
                composeNavigator.p(navBackStackEntry2);
                this.F.p((NavBackStackEntry) NavHostKt.m(this.G).get(NavHostKt.m(this.G).size() - 2));
            } else {
                navBackStackEntry2 = null;
            }
            final State state = this.G;
            final MutableState mutableState = this.I;
            final MutableFloatState mutableFloatState = this.H;
            AnonymousClass1 r4 = new FlowCollector() {
                /* renamed from: a */
                public final Object c(BackEventCompat backEventCompat, Continuation continuation) {
                    if (NavHostKt.m(state).size() > 1) {
                        NavHostKt.j(mutableState, true);
                        NavHostKt.o(mutableFloatState, backEventCompat.a());
                    }
                    return Unit.f40552a;
                }
            };
            this.E = navBackStackEntry2;
            this.D = 1;
            if (flow.a(r4, this) == f2) {
                return f2;
            }
            navBackStackEntry = navBackStackEntry2;
        } else if (i2 == 1) {
            navBackStackEntry = (NavBackStackEntry) this.E;
            try {
                ResultKt.b(obj);
            } catch (CancellationException unused) {
                if (NavHostKt.m(this.G).size() > 1) {
                    NavHostKt.j(this.I, false);
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (NavHostKt.m(this.G).size() > 1) {
            NavHostKt.j(this.I, false);
            ComposeNavigator composeNavigator2 = this.F;
            Intrinsics.f(navBackStackEntry);
            composeNavigator2.j(navBackStackEntry, false);
        }
        return Unit.f40552a;
    }
}
