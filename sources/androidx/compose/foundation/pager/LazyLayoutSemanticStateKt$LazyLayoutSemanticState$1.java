package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1 implements LazyLayoutSemanticState {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PagerState f5242a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f5243b;

    public LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1(PagerState pagerState, boolean z2) {
        this.f5242a = pagerState;
        this.f5243b = z2;
    }

    public int a() {
        return (int) (this.f5242a.C().e() == Orientation.Vertical ? this.f5242a.C().c() & 4294967295L : this.f5242a.C().c() >> 32);
    }

    public float b() {
        return (float) PagerScrollPositionKt.a(this.f5242a);
    }

    public int c() {
        return this.f5242a.C().f() + this.f5242a.C().d();
    }

    public float d() {
        return (float) PagerStateKt.g(this.f5242a.C(), this.f5242a.H());
    }

    public Object e(int i2, Continuation continuation) {
        Object d0 = PagerState.d0(this.f5242a, i2, 0.0f, continuation, 2, (Object) null);
        return d0 == IntrinsicsKt.f() ? d0 : Unit.f40552a;
    }

    public CollectionInfo f() {
        return this.f5243b ? new CollectionInfo(this.f5242a.H(), 1) : new CollectionInfo(1, this.f5242a.H());
    }
}
