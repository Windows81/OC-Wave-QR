package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 implements LazyLayoutSemanticState {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5177a;

    public LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1(LazyStaggeredGridState lazyStaggeredGridState) {
        this.f5177a = lazyStaggeredGridState;
    }

    public int a() {
        return (int) (this.f5177a.y().e() == Orientation.Vertical ? this.f5177a.y().c() & 4294967295L : this.f5177a.y().c() >> 32);
    }

    public float b() {
        return LazyLayoutSemanticsKt.b(this.f5177a.s(), this.f5177a.t());
    }

    public int c() {
        return this.f5177a.y().f() + this.f5177a.y().d();
    }

    public float d() {
        return LazyLayoutSemanticsKt.a(this.f5177a.s(), this.f5177a.t(), this.f5177a.f());
    }

    public Object e(int i2, Continuation continuation) {
        Object N = LazyStaggeredGridState.N(this.f5177a, i2, 0, continuation, 2, (Object) null);
        return N == IntrinsicsKt.f() ? N : Unit.f40552a;
    }

    public CollectionInfo f() {
        return new CollectionInfo(-1, -1);
    }
}
