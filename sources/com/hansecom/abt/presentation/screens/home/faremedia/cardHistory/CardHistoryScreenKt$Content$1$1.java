package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$Content$1$1", f = "CardHistoryScreen.kt", l = {81}, m = "invokeSuspend")
public final class CardHistoryScreenKt$Content$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ LazyListState E;
    public final /* synthetic */ PersistentList F;
    public final /* synthetic */ CardHistory.State G;
    public final /* synthetic */ Function1 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryScreenKt$Content$1$1(LazyListState lazyListState, PersistentList persistentList, CardHistory.State state, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.E = lazyListState;
        this.F = persistentList;
        this.G = state;
        this.H = function1;
    }

    public static final Object C(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.q0(lazyListState.x().k());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getKey();
        }
        return null;
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CardHistoryScreenKt$Content$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new CardHistoryScreenKt$Content$1$1(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Flow q2 = SnapshotStateKt.q(new e(this.E));
            final PersistentList persistentList = this.F;
            final CardHistory.State state = this.G;
            final Function1 function1 = this.H;
            AnonymousClass2 r1 = new FlowCollector() {
                public final Object c(Object obj, Continuation continuation) {
                    if (Intrinsics.d(obj, Boxing.c(CollectionsKt.o(persistentList))) && state.c()) {
                        function1.invoke(CardHistory.Action.GetMore.f36372a);
                    }
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (q2.a(r1, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
