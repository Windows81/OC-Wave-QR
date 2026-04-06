package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel", f = "CardHistoryViewModel.kt", l = {85, 92}, m = "handle")
public final class CardHistoryViewModel$handle$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ CardHistoryViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryViewModel$handle$1(CardHistoryViewModel cardHistoryViewModel, Continuation continuation) {
        super(continuation);
        this.E = cardHistoryViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.o((CardHistory.Action) null, this);
    }
}
