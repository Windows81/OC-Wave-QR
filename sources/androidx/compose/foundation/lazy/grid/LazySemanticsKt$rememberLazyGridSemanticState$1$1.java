package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class LazySemanticsKt$rememberLazyGridSemanticState$1$1 implements LazyLayoutSemanticState {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4765a;

    public LazySemanticsKt$rememberLazyGridSemanticState$1$1(LazyGridState lazyGridState) {
        this.f4765a = lazyGridState;
    }

    public int a() {
        return (int) (this.f4765a.w().e() == Orientation.Vertical ? this.f4765a.w().c() & 4294967295L : this.f4765a.w().c() >> 32);
    }

    public float b() {
        return LazyLayoutSemanticsKt.b(this.f4765a.r(), this.f4765a.s());
    }

    public int c() {
        return this.f4765a.w().f() + this.f4765a.w().d();
    }

    public float d() {
        return LazyLayoutSemanticsKt.a(this.f4765a.r(), this.f4765a.s(), this.f4765a.f());
    }

    public Object e(int i2, Continuation continuation) {
        Object K = LazyGridState.K(this.f4765a, i2, 0, continuation, 2, (Object) null);
        return K == IntrinsicsKt.f() ? K : Unit.f40552a;
    }

    public CollectionInfo f() {
        return new CollectionInfo(-1, -1);
    }
}
