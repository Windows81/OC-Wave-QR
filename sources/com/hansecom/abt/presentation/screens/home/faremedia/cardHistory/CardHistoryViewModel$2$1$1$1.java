package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import com.hansecom.mapi.models.TransactionSearchResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class CardHistoryViewModel$2$1$1$1 implements Function1<CardHistory.State, CardHistory.State> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PersistentList f36396A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransactionSearchResult f36397z;

    public CardHistoryViewModel$2$1$1$1(TransactionSearchResult transactionSearchResult, PersistentList persistentList) {
        this.f36397z = transactionSearchResult;
        this.f36396A = persistentList;
    }

    /* renamed from: b */
    public final CardHistory.State invoke(CardHistory.State state) {
        Intrinsics.i(state, "$this$update");
        List b2 = this.f36397z.b();
        Intrinsics.f(b2);
        int size = b2.size();
        Integer c2 = this.f36397z.c();
        Intrinsics.f(c2);
        boolean z2 = size < c2.intValue();
        List b3 = this.f36397z.b();
        Intrinsics.f(b3);
        return CardHistory.State.b(state, (String) null, false, b3.size(), z2, this.f36396A, 3, (Object) null);
    }
}
