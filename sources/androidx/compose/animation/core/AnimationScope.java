package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class AnimationScope<T, V extends AnimationVector> {

    /* renamed from: a  reason: collision with root package name */
    public final TwoWayConverter f2463a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2464b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2465c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0 f2466d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f2467e;

    /* renamed from: f  reason: collision with root package name */
    public AnimationVector f2468f;

    /* renamed from: g  reason: collision with root package name */
    public long f2469g;

    /* renamed from: h  reason: collision with root package name */
    public long f2470h = Long.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public final MutableState f2471i;

    public AnimationScope(Object obj, TwoWayConverter twoWayConverter, AnimationVector animationVector, long j2, Object obj2, long j3, boolean z2, Function0 function0) {
        this.f2463a = twoWayConverter;
        this.f2464b = obj2;
        this.f2465c = j3;
        this.f2466d = function0;
        this.f2467e = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2468f = AnimationVectorsKt.e(animationVector);
        this.f2469g = j2;
        this.f2471i = SnapshotStateKt__SnapshotStateKt.e(Boolean.valueOf(z2), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final void a() {
        k(false);
        this.f2466d.invoke();
    }

    public final long b() {
        return this.f2470h;
    }

    public final long c() {
        return this.f2469g;
    }

    public final long d() {
        return this.f2465c;
    }

    public final Object e() {
        return this.f2467e.getValue();
    }

    public final Object f() {
        return this.f2463a.b().invoke(this.f2468f);
    }

    public final AnimationVector g() {
        return this.f2468f;
    }

    public final boolean h() {
        return ((Boolean) this.f2471i.getValue()).booleanValue();
    }

    public final void i(long j2) {
        this.f2470h = j2;
    }

    public final void j(long j2) {
        this.f2469g = j2;
    }

    public final void k(boolean z2) {
        this.f2471i.setValue(Boolean.valueOf(z2));
    }

    public final void l(Object obj) {
        this.f2467e.setValue(obj);
    }

    public final void m(AnimationVector animationVector) {
        this.f2468f = animationVector;
    }
}
