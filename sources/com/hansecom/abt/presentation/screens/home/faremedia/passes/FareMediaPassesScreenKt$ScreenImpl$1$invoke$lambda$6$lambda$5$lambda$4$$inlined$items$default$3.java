package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FareMediaPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$3 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f36997A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f36998z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaPassesScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$3(Function1 function1, List list) {
        super(1);
        this.f36998z = function1;
        this.f36997A = list;
    }

    public final Object b(int i2) {
        return this.f36998z.invoke(this.f36997A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
