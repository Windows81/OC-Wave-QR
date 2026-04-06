package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1 implements LazyLayoutSemanticState {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f4354b;

    public LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1(LazyListState lazyListState, boolean z2) {
        this.f4353a = lazyListState;
        this.f4354b = z2;
    }

    public int a() {
        return (int) (this.f4353a.x().e() == Orientation.Vertical ? this.f4353a.x().c() & 4294967295L : this.f4353a.x().c() >> 32);
    }

    public float b() {
        return LazyLayoutSemanticsKt.b(this.f4353a.s(), this.f4353a.t());
    }

    public int c() {
        return this.f4353a.x().f() + this.f4353a.x().d();
    }

    public float d() {
        return LazyLayoutSemanticsKt.a(this.f4353a.s(), this.f4353a.t(), this.f4353a.f());
    }

    public Object e(int i2, Continuation continuation) {
        Object J = LazyListState.J(this.f4353a, i2, 0, continuation, 2, (Object) null);
        return J == IntrinsicsKt.f() ? J : Unit.f40552a;
    }

    public CollectionInfo f() {
        return this.f4354b ? new CollectionInfo(-1, 1) : new CollectionInfo(1, -1);
    }
}
