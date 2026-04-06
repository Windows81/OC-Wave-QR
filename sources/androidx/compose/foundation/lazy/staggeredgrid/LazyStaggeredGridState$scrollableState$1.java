package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridState$scrollableState$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5214z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scrollableState$1(LazyStaggeredGridState lazyStaggeredGridState) {
        super(1);
        this.f5214z = lazyStaggeredGridState;
    }

    public final Float b(float f2) {
        return Float.valueOf(-this.f5214z.K(-f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
