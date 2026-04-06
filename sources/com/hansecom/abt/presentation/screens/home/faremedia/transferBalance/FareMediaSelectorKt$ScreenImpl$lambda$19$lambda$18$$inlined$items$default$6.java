package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$6 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f37289A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37290z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaSelectorKt$ScreenImpl$lambda$19$lambda$18$$inlined$items$default$6(Function1 function1, List list) {
        super(1);
        this.f37290z = function1;
        this.f37289A = list;
    }

    public final Object b(int i2) {
        return this.f37290z.invoke(this.f37289A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
