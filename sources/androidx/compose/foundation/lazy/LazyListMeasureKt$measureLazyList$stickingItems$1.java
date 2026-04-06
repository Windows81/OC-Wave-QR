package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListMeasureKt$measureLazyList$stickingItems$1 extends Lambda implements Function1<Integer, LazyListMeasuredItem> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListMeasuredItemProvider f4404z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListMeasureKt$measureLazyList$stickingItems$1(LazyListMeasuredItemProvider lazyListMeasuredItemProvider) {
        super(1);
        this.f4404z = lazyListMeasuredItemProvider;
    }

    public final LazyListMeasuredItem b(int i2) {
        return LazyListMeasuredItemProvider.e(this.f4404z, i2, 0, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
