package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridDslKt$itemsIndexed$8 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object[] f5038A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f5039z;

    public final Object b(int i2) {
        return this.f5039z.m(Integer.valueOf(i2), this.f5038A[i2]);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
