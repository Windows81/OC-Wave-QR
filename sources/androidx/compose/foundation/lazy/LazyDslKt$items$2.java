package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyDslKt$items$2 extends Lambda implements Function1<Integer, Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f4324A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f4325z;

    public final Object b(int i2) {
        return this.f4325z.invoke(this.f4324A.get(i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
