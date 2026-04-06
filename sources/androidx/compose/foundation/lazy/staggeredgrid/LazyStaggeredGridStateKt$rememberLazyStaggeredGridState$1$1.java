package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1 extends Lambda implements Function0<LazyStaggeredGridState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5215A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f5216z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1(int i2, int i3) {
        super(0);
        this.f5216z = i2;
        this.f5215A = i3;
    }

    /* renamed from: b */
    public final LazyStaggeredGridState invoke() {
        return new LazyStaggeredGridState(this.f5216z, this.f5215A);
    }
}
