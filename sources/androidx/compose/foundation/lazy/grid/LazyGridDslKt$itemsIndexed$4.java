package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridDslKt$itemsIndexed$4 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f4560A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f4561z;

    public final Object b(int i2) {
        return this.f4561z.m(Integer.valueOf(i2), this.f4560A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
