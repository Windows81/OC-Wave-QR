package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class InstitutionsSearchScreenKt$ScreenImpl$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$1 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f36867A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f36868z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionsSearchScreenKt$ScreenImpl$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        super(1);
        this.f36868z = function2;
        this.f36867A = list;
    }

    public final Object b(int i2) {
        return this.f36868z.m(Integer.valueOf(i2), this.f36867A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
