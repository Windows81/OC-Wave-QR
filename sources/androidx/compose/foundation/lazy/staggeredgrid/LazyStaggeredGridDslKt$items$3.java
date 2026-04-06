package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridDslKt$items$3 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f5011A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f5012z;

    public final Object b(int i2) {
        return this.f5012z.invoke(this.f5011A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
