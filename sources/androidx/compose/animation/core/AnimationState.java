package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AnimationState<T, V extends AnimationVector> implements State<T> {

    /* renamed from: A  reason: collision with root package name */
    public final MutableState f2472A;

    /* renamed from: B  reason: collision with root package name */
    public AnimationVector f2473B;
    public long C;
    public long D;
    public boolean E;

    /* renamed from: z  reason: collision with root package name */
    public final TwoWayConverter f2474z;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r5 = androidx.compose.animation.core.AnimationVectorsKt.e(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnimationState(androidx.compose.animation.core.TwoWayConverter r3, java.lang.Object r4, androidx.compose.animation.core.AnimationVector r5, long r6, long r8, boolean r10) {
        /*
            r2 = this;
            r2.<init>()
            r2.f2474z = r3
            r0 = 0
            r1 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r4, r0, r1, r0)
            r2.f2472A = r0
            if (r5 == 0) goto L_0x0015
            androidx.compose.animation.core.AnimationVector r5 = androidx.compose.animation.core.AnimationVectorsKt.e(r5)
            if (r5 != 0) goto L_0x0019
        L_0x0015:
            androidx.compose.animation.core.AnimationVector r5 = androidx.compose.animation.core.AnimationStateKt.i(r3, r4)
        L_0x0019:
            r2.f2473B = r5
            r2.C = r6
            r2.D = r8
            r2.E = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimationState.<init>(androidx.compose.animation.core.TwoWayConverter, java.lang.Object, androidx.compose.animation.core.AnimationVector, long, long, boolean):void");
    }

    public final long g() {
        return this.D;
    }

    public Object getValue() {
        return this.f2472A.getValue();
    }

    public final long h() {
        return this.C;
    }

    public final TwoWayConverter i() {
        return this.f2474z;
    }

    public final Object m() {
        return this.f2474z.b().invoke(this.f2473B);
    }

    public final AnimationVector t() {
        return this.f2473B;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + m() + ", isRunning=" + this.E + ", lastFrameTimeNanos=" + this.C + ", finishedTimeNanos=" + this.D + ')';
    }

    public final boolean u() {
        return this.E;
    }

    public final void v(long j2) {
        this.D = j2;
    }

    public final void w(long j2) {
        this.C = j2;
    }

    public final void x(boolean z2) {
        this.E = z2;
    }

    public void y(Object obj) {
        this.f2472A.setValue(obj);
    }

    public final void z(AnimationVector animationVector) {
        this.f2473B = animationVector;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(twoWayConverter, obj, (i2 & 4) != 0 ? null : animationVector, (i2 & 8) != 0 ? Long.MIN_VALUE : j2, (i2 & 16) != 0 ? Long.MIN_VALUE : j3, (i2 & 32) != 0 ? false : z2);
    }
}
