package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridDslKt$items$4$1 extends Lambda implements Function1<Integer, StaggeredGridItemSpan> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f5013A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f5014z;

    public final StaggeredGridItemSpan b(int i2) {
        return (StaggeredGridItemSpan) this.f5014z.invoke(this.f5013A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
