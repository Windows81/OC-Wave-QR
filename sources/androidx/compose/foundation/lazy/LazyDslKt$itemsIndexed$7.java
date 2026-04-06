package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyDslKt$itemsIndexed$7 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object[] f4347A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f4348z;

    public final Object b(int i2) {
        return this.f4348z.m(Integer.valueOf(i2), this.f4347A[i2]);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
