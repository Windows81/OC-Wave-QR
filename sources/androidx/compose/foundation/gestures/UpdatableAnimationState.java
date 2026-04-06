package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class UpdatableAnimationState {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f3631f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f3632g = 8;

    /* renamed from: h  reason: collision with root package name */
    public static final AnimationVector1D f3633h = new AnimationVector1D(0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final VectorizedAnimationSpec f3634a;

    /* renamed from: b  reason: collision with root package name */
    public long f3635b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public AnimationVector1D f3636c = f3633h;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3637d;

    /* renamed from: e  reason: collision with root package name */
    public float f3638e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnimationVector1D a() {
            return UpdatableAnimationState.f3633h;
        }

        public final boolean b(float f2) {
            return Math.abs(f2) < 0.01f;
        }

        public Companion() {
        }
    }

    public UpdatableAnimationState(AnimationSpec animationSpec) {
        this.f3634a = animationSpec.a(VectorConvertersKt.i(FloatCompanionObject.f40896a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r13 != 0.0f) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091 A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.jvm.functions.Function1 r13, kotlin.jvm.functions.Function0 r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 r0 = (androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 r0 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 0
            r4 = -9223372036854775808
            r6 = 0
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r8) goto L_0x0044
            if (r2 != r7) goto L_0x003c
            java.lang.Object r13 = r0.D
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            java.lang.Object r14 = r0.C
            androidx.compose.foundation.gestures.UpdatableAnimationState r14 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r14
            kotlin.ResultKt.b(r15)     // Catch:{ all -> 0x0039 }
            goto L_0x00d6
        L_0x0039:
            r13 = move-exception
            goto L_0x00e4
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0044:
            float r13 = r0.F
            java.lang.Object r14 = r0.E
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            java.lang.Object r2 = r0.D
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r9 = r0.C
            androidx.compose.foundation.gestures.UpdatableAnimationState r9 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r9
            kotlin.ResultKt.b(r15)     // Catch:{ all -> 0x005b }
            r15 = r9
            r11 = r0
            r0 = r14
            r14 = r2
            r2 = r11
            goto L_0x00a7
        L_0x005b:
            r13 = move-exception
            r14 = r9
            goto L_0x00e4
        L_0x005f:
            kotlin.ResultKt.b(r15)
            boolean r15 = r12.f3637d
            if (r15 == 0) goto L_0x006b
            java.lang.String r15 = "animateToZero called while previous animation is running"
            androidx.compose.foundation.internal.InlineClassHelperKt.c(r15)
        L_0x006b:
            kotlin.coroutines.CoroutineContext r15 = r0.f()
            androidx.compose.ui.MotionDurationScale$Key r2 = androidx.compose.ui.MotionDurationScale.f15495e
            kotlin.coroutines.CoroutineContext$Element r15 = r15.d(r2)
            androidx.compose.ui.MotionDurationScale r15 = (androidx.compose.ui.MotionDurationScale) r15
            if (r15 == 0) goto L_0x007e
            float r15 = r15.H()
            goto L_0x0080
        L_0x007e:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x0080:
            r12.f3637d = r8
            r2 = r0
            r0 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L_0x0087:
            androidx.compose.foundation.gestures.UpdatableAnimationState$Companion r9 = f3631f     // Catch:{ all -> 0x00b3 }
            float r10 = r15.f3638e     // Catch:{ all -> 0x00b3 }
            boolean r9 = r9.b(r10)     // Catch:{ all -> 0x00b3 }
            if (r9 != 0) goto L_0x00ae
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$4 r9 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$4     // Catch:{ all -> 0x00b3 }
            r9.<init>(r15, r13, r14)     // Catch:{ all -> 0x00b3 }
            r2.C = r15     // Catch:{ all -> 0x00b3 }
            r2.D = r14     // Catch:{ all -> 0x00b3 }
            r2.E = r0     // Catch:{ all -> 0x00b3 }
            r2.F = r13     // Catch:{ all -> 0x00b3 }
            r2.I = r8     // Catch:{ all -> 0x00b3 }
            java.lang.Object r9 = androidx.compose.runtime.MonotonicFrameClockKt.c(r9, r2)     // Catch:{ all -> 0x00b3 }
            if (r9 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r0.invoke()     // Catch:{ all -> 0x00b3 }
            int r9 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0087
        L_0x00ae:
            r13 = r0
            r11 = r15
            r15 = r14
            r14 = r11
            goto L_0x00b6
        L_0x00b3:
            r13 = move-exception
            r14 = r15
            goto L_0x00e4
        L_0x00b6:
            float r0 = r14.f3638e     // Catch:{ all -> 0x0039 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0039 }
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            goto L_0x00d9
        L_0x00c1:
            androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$5 r0 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$5     // Catch:{ all -> 0x0039 }
            r0.<init>(r14, r15)     // Catch:{ all -> 0x0039 }
            r2.C = r14     // Catch:{ all -> 0x0039 }
            r2.D = r13     // Catch:{ all -> 0x0039 }
            r15 = 0
            r2.E = r15     // Catch:{ all -> 0x0039 }
            r2.I = r7     // Catch:{ all -> 0x0039 }
            java.lang.Object r15 = androidx.compose.runtime.MonotonicFrameClockKt.c(r0, r2)     // Catch:{ all -> 0x0039 }
            if (r15 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            r13.invoke()     // Catch:{ all -> 0x0039 }
        L_0x00d9:
            r14.f3635b = r4
            androidx.compose.animation.core.AnimationVector1D r13 = f3633h
            r14.f3636c = r13
            r14.f3637d = r3
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        L_0x00e4:
            r14.f3635b = r4
            androidx.compose.animation.core.AnimationVector1D r15 = f3633h
            r14.f3636c = r15
            r14.f3637d = r3
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.h(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float i() {
        return this.f3638e;
    }

    public final void j(float f2) {
        this.f3638e = f2;
    }
}
