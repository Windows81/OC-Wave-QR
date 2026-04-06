package com.hansecom.abt.data.repositories;

import com.hansecom.abt.api.JsonParser;
import com.hansecom.mapi.models.TransactionSearchResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.CardHistoryRepository$getFreshData$1", f = "CardHistoryRepository.kt", l = {73}, m = "invokeSuspend")
public final class CardHistoryRepository$getFreshData$1 extends SuspendLambda implements Function2<String, Continuation<? super Result<? extends TransactionSearchResult>>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ CardHistoryRepository F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryRepository$getFreshData$1(CardHistoryRepository cardHistoryRepository, Continuation continuation) {
        super(2, continuation);
        this.F = cardHistoryRepository;
    }

    /* renamed from: A */
    public final Object m(String str, Continuation continuation) {
        return ((CardHistoryRepository$getFreshData$1) s(str, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        CardHistoryRepository$getFreshData$1 cardHistoryRepository$getFreshData$1 = new CardHistoryRepository$getFreshData$1(this.F, continuation);
        cardHistoryRepository$getFreshData$1.E = obj;
        return cardHistoryRepository$getFreshData$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            CardHistoryRepository cardHistoryRepository = this.F;
            Json c2 = JsonParser.f33114a.c();
            CoroutineDispatcher b2 = Dispatchers.b();
            CardHistoryRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1 cardHistoryRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1 = new CardHistoryRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1(c2, (Continuation) null, cardHistoryRepository, (String) this.E);
            this.D = 1;
            obj = BuildersKt.g(b2, cardHistoryRepository$getFreshData$1$invokeSuspend$$inlined$retrofit$default$1, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Result.a(((Result) obj).j());
    }
}
