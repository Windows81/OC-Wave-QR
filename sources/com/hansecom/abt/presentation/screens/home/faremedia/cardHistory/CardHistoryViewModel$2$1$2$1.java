package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
public final class CardHistoryViewModel$2$1$2$1 implements Function1<CardHistory.State, CardHistory.State> {

    /* renamed from: z  reason: collision with root package name */
    public static final CardHistoryViewModel$2$1$2$1 f36398z = new CardHistoryViewModel$2$1$2$1();

    /* renamed from: b */
    public final CardHistory.State invoke(CardHistory.State state) {
        Intrinsics.i(state, "$this$update");
        return CardHistory.State.b(state, (String) null, false, 0, false, ExtensionsKt.a(), 15, (Object) null);
    }
}
