package com.hansecom.abt.data.repositories;

import com.hansecom.abt.api.JsonParser;
import com.hansecom.abt.data.preferences.base.Seconds;
import com.hansecom.abt.data.repositories.base.BaseRepository;
import com.hansecom.mapi.models.TransactionSearchResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$2$1", f = "CardHistoryRepository.kt", l = {73, 53}, m = "invokeSuspend")
public final class CardHistoryRepository$getMore$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ CardHistoryRepository F;
    public final /* synthetic */ String G;
    public final /* synthetic */ TransactionSearchResult H;
    public final /* synthetic */ BaseRepository I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryRepository$getMore$2$1(CardHistoryRepository cardHistoryRepository, String str, TransactionSearchResult transactionSearchResult, BaseRepository baseRepository, Continuation continuation) {
        super(2, continuation);
        this.F = cardHistoryRepository;
        this.G = str;
        this.H = transactionSearchResult;
        this.I = baseRepository;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CardHistoryRepository$getMore$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new CardHistoryRepository$getMore$2$1(this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            CardHistoryRepository cardHistoryRepository = this.F;
            String str = this.G;
            TransactionSearchResult transactionSearchResult = this.H;
            Json c2 = JsonParser.f33114a.c();
            CoroutineDispatcher b2 = Dispatchers.b();
            CardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1 cardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1 = new CardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1(c2, (Continuation) null, cardHistoryRepository, str, transactionSearchResult);
            this.E = 1;
            obj = BuildersKt.g(b2, cardHistoryRepository$getMore$2$1$invokeSuspend$$inlined$retrofit$default$1, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object j2 = ((Result) obj).j();
        BaseRepository baseRepository = this.I;
        TransactionSearchResult transactionSearchResult2 = this.H;
        if (Result.h(j2)) {
            TransactionSearchResult transactionSearchResult3 = (TransactionSearchResult) j2;
            Integer c3 = transactionSearchResult3.c();
            List b3 = transactionSearchResult2.b();
            Intrinsics.f(b3);
            List b4 = transactionSearchResult3.b();
            Intrinsics.f(b4);
            TransactionSearchResult transactionSearchResult4 = new TransactionSearchResult(c3, CollectionsKt.x0(b3, b4));
            this.D = j2;
            this.E = 2;
            if (BaseRepository.K(baseRepository, transactionSearchResult4, (Seconds) null, (Seconds) null, this, 6, (Object) null) == f2) {
                return f2;
            }
        }
        return Unit.f40552a;
    }
}
