package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridMeasureKt$measureLazyGrid$stickingItems$1 extends Lambda implements Function1<Integer, LazyGridMeasuredItem> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyGridMeasuredItemProvider f4631A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyGridMeasuredLineProvider f4632z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridMeasureKt$measureLazyGrid$stickingItems$1(LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider) {
        super(1);
        this.f4632z = lazyGridMeasuredLineProvider;
        this.f4631A = lazyGridMeasuredItemProvider;
    }

    public final LazyGridMeasuredItem b(int i2) {
        int d2 = this.f4632z.d(i2);
        return this.f4631A.a(i2, 0, d2, this.f4632z.a(0, d2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
