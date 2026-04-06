package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.CardHistoryRepository", f = "CardHistoryRepository.kt", l = {33, 39, 75, 62}, m = "getMore")
public final class CardHistoryRepository$getMore$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ CardHistoryRepository I;
    public int J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryRepository$getMore$1(CardHistoryRepository cardHistoryRepository, Continuation continuation) {
        super(continuation);
        this.I = cardHistoryRepository;
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.r((String) null, this);
    }
}
