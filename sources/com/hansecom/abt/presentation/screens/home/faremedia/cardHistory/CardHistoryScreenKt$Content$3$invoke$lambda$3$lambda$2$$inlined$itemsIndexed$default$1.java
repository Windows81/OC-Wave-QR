package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CardHistoryScreenKt$Content$3$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$1 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f36378A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f36379z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryScreenKt$Content$3$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        super(1);
        this.f36379z = function2;
        this.f36378A = list;
    }

    public final Object b(int i2) {
        return this.f36379z.m(Integer.valueOf(i2), this.f36378A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
