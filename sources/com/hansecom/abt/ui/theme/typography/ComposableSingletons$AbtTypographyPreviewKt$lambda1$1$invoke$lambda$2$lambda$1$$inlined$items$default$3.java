package com.hansecom.abt.ui.theme.typography;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: com.hansecom.abt.ui.theme.typography.ComposableSingletons$AbtTypographyPreviewKt$lambda-1$1$invoke$lambda$2$lambda$1$$inlined$items$default$3  reason: invalid class name */
public final class ComposableSingletons$AbtTypographyPreviewKt$lambda1$1$invoke$lambda$2$lambda$1$$inlined$items$default$3 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f38965A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f38966z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$AbtTypographyPreviewKt$lambda1$1$invoke$lambda$2$lambda$1$$inlined$items$default$3(Function1 function1, List list) {
        super(1);
        this.f38966z = function1;
        this.f38965A = list;
    }

    public final Object b(int i2) {
        return this.f38966z.invoke(this.f38965A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
