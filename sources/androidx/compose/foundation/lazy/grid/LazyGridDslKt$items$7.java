package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridDslKt$items$7 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object[] f4547A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f4548z;

    public final Object b(int i2) {
        return this.f4548z.invoke(this.f4547A[i2]);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
