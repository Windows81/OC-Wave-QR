package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;

@Metadata
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    /* renamed from: A  reason: collision with root package name */
    public final View f4245A;

    /* renamed from: B  reason: collision with root package name */
    public final SideCalculator f4246B;
    public final Density C;
    public WindowInsetsAnimationController D;
    public boolean E;
    public final CancellationSignal F = new CancellationSignal();
    public float G;
    public Job H;
    public CancellableContinuation I;

    /* renamed from: z  reason: collision with root package name */
    public final AndroidWindowInsets f4247z;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.f4247z = androidWindowInsets;
        this.f4245A = view;
        this.f4246B = sideCalculator;
        this.C = density;
    }

    public Object H1(long j2, Continuation continuation) {
        return k(j2, this.f4246B.a(Velocity.h(j2), Velocity.i(j2)), false, continuation);
    }

    public long c2(long j2, long j3, int i2) {
        return n(j3, this.f4246B.c(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3))));
    }

    public final void h(float f2) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.D;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.f4246B.f(windowInsetsAnimationController.getCurrentInsets(), Math.round(f2)), 1.0f, 0.0f);
        }
    }

    public final void i() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.D;
        if (!(windowInsetsAnimationController2 == null || !windowInsetsAnimationController2.isReady() || (windowInsetsAnimationController = this.D) == null)) {
            windowInsetsAnimationController.finish(this.f4247z.g());
        }
        this.D = null;
        CancellableContinuation cancellableContinuation = this.I;
        if (cancellableContinuation != null) {
            cancellableContinuation.U((Object) null, WindowInsetsNestedScrollConnection$animationEnded$1.f4248z);
        }
        this.I = null;
        Job job = this.H;
        if (job != null) {
            job.c(new WindowInsetsAnimationCancelledException());
        }
        this.H = null;
        this.G = 0.0f;
        this.E = false;
    }

    public final void j() {
        CancellableContinuation cancellableContinuation = this.I;
        if (cancellableContinuation != null) {
            cancellableContinuation.U((Object) null, WindowInsetsNestedScrollConnection$dispose$1.f4249z);
        }
        Job job = this.H;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.D;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!Intrinsics.d(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(long r26, float r28, boolean r29, kotlin.coroutines.Continuation r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            r2 = r29
            r3 = r30
            boolean r4 = r3 instanceof androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1) r4
            int r5 = r4.I
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.I = r5
            goto L_0x0020
        L_0x001b:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 r4 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.G
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r6 = r4.I
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r6 == 0) goto L_0x0063
            if (r6 == r10) goto L_0x0057
            if (r6 == r9) goto L_0x0048
            if (r6 != r8) goto L_0x0040
            long r1 = r4.E
            java.lang.Object r4 = r4.C
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r4
            kotlin.ResultKt.b(r3)
            goto L_0x014c
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            long r1 = r4.E
            java.lang.Object r5 = r4.D
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref.FloatRef) r5
            java.lang.Object r4 = r4.C
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r4
            kotlin.ResultKt.b(r3)
            goto L_0x0188
        L_0x0057:
            float r1 = r4.F
            long r12 = r4.E
            java.lang.Object r2 = r4.C
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r2 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r2
            kotlin.ResultKt.b(r3)
            goto L_0x00a7
        L_0x0063:
            kotlin.ResultKt.b(r3)
            kotlinx.coroutines.Job r3 = r0.H
            if (r3 == 0) goto L_0x0072
            androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException r6 = new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException
            r6.<init>()
            r3.c(r6)
        L_0x0072:
            r0.H = r7
            r0.G = r11
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x0088
        L_0x007c:
            android.view.WindowInsetsAnimationController r3 = r0.D
            if (r3 != 0) goto L_0x0093
            androidx.compose.foundation.layout.AndroidWindowInsets r3 = r0.f4247z
            boolean r3 = r3.g()
            if (r3 != r2) goto L_0x0093
        L_0x0088:
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.f19186b
            long r1 = r1.a()
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r1)
            return r1
        L_0x0093:
            r4.C = r0
            r2 = r26
            r4.E = r2
            r4.F = r1
            r4.I = r10
            java.lang.Object r6 = r0.l(r4)
            if (r6 != r5) goto L_0x00a4
            return r5
        L_0x00a4:
            r12 = r2
            r3 = r6
            r2 = r0
        L_0x00a7:
            android.view.WindowInsetsAnimationController r3 = androidx.compose.foundation.layout.d.a(r3)
            if (r3 != 0) goto L_0x00b8
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.f19186b
            long r1 = r1.a()
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r1)
            return r1
        L_0x00b8:
            androidx.compose.foundation.layout.SideCalculator r6 = r2.f4246B
            android.graphics.Insets r14 = r3.getHiddenStateInsets()
            int r6 = r6.b(r14)
            androidx.compose.foundation.layout.SideCalculator r14 = r2.f4246B
            android.graphics.Insets r15 = r3.getShownStateInsets()
            int r15 = r14.b(r15)
            android.graphics.Insets r14 = r3.getCurrentInsets()
            androidx.compose.foundation.layout.SideCalculator r10 = r2.f4246B
            int r10 = r10.b(r14)
            int r14 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            r16 = 0
            if (r14 > 0) goto L_0x00de
            if (r10 == r6) goto L_0x00e4
        L_0x00de:
            int r14 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r14 < 0) goto L_0x00fa
            if (r10 != r15) goto L_0x00fa
        L_0x00e4:
            if (r10 != r15) goto L_0x00e8
            r10 = 1
            goto L_0x00ea
        L_0x00e8:
            r10 = r16
        L_0x00ea:
            r3.finish(r10)
            r2.D = r7
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.f19186b
            long r1 = r1.a()
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r1)
            return r1
        L_0x00fa:
            androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec r7 = new androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec
            androidx.compose.ui.unit.Density r14 = r2.C
            r7.<init>(r14)
            float r14 = (float) r10
            float r17 = r7.f(r1)
            float r14 = r14 + r17
            float r9 = (float) r6
            float r17 = r14 - r9
            int r11 = r15 - r6
            float r11 = (float) r11
            float r17 = r17 / r11
            r11 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0119
            r23 = 1
            goto L_0x011b
        L_0x0119:
            r23 = r16
        L_0x011b:
            if (r23 == 0) goto L_0x0120
            r17 = r15
            goto L_0x0122
        L_0x0120:
            r17 = r6
        L_0x0122:
            float r11 = (float) r15
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0158
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x012c
            goto L_0x0158
        L_0x012c:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3 r6 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3
            r21 = 0
            r14 = r6
            r15 = r2
            r16 = r10
            r18 = r1
            r19 = r3
            r20 = r23
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r4.C = r2
            r4.E = r12
            r4.I = r8
            java.lang.Object r1 = kotlinx.coroutines.CoroutineScopeKt.f(r6, r4)
            if (r1 != r5) goto L_0x014a
            return r5
        L_0x014a:
            r4 = r2
            r1 = r12
        L_0x014c:
            androidx.compose.foundation.layout.SideCalculator r3 = r4.f4246B
            r4 = 0
            long r1 = r3.g(r1, r4)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r1)
            return r1
        L_0x0158:
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2 r9 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2
            r24 = 0
            r14 = r9
            r11 = r15
            r15 = r2
            r16 = r10
            r17 = r1
            r18 = r7
            r19 = r6
            r20 = r11
            r21 = r8
            r22 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.C = r2
            r4.D = r8
            r4.E = r12
            r1 = 2
            r4.I = r1
            java.lang.Object r1 = kotlinx.coroutines.CoroutineScopeKt.f(r9, r4)
            if (r1 != r5) goto L_0x0185
            return r5
        L_0x0185:
            r4 = r2
            r5 = r8
            r1 = r12
        L_0x0188:
            androidx.compose.foundation.layout.SideCalculator r3 = r4.f4246B
            float r4 = r5.f40905z
            long r1 = r3.g(r1, r4)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.k(long, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object l(Continuation continuation) {
        Object obj = this.D;
        if (obj == null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.I = cancellableContinuationImpl;
            m();
            obj = cancellableContinuationImpl.A();
            if (obj == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
        }
        return obj;
    }

    public final void m() {
        if (!this.E) {
            this.E = true;
            WindowInsetsController a2 = this.f4245A.getWindowInsetsController();
            if (a2 != null) {
                a2.controlWindowInsetsAnimation(this.f4247z.f(), -1, (Interpolator) null, this.F, j.a(this));
            }
        }
    }

    public final long n(long j2, float f2) {
        Job job = this.H;
        if (job != null) {
            job.c(new WindowInsetsAnimationCancelledException());
            this.H = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.D;
        if (f2 != 0.0f) {
            int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (!(this.f4247z.g() == (i2 > 0) && windowInsetsAnimationController == null)) {
                if (windowInsetsAnimationController == null) {
                    this.G = 0.0f;
                    m();
                    return this.f4246B.e(j2);
                }
                int b2 = this.f4246B.b(windowInsetsAnimationController.getHiddenStateInsets());
                int b3 = this.f4246B.b(windowInsetsAnimationController.getShownStateInsets());
                Insets a2 = windowInsetsAnimationController.getCurrentInsets();
                int b4 = this.f4246B.b(a2);
                if (b4 == (i2 > 0 ? b3 : b2)) {
                    this.G = 0.0f;
                    return Offset.f15855b.c();
                }
                float f3 = ((float) b4) + f2 + this.G;
                int o2 = RangesKt.o(Math.round(f3), b2, b3);
                this.G = f3 - ((float) Math.round(f3));
                if (o2 != b4) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f4246B.f(a2, o2), 1.0f, 0.0f);
                }
                return this.f4246B.e(j2);
            }
        }
        return Offset.f15855b.c();
    }

    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        i();
    }

    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        i();
    }

    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
        this.D = windowInsetsAnimationController;
        this.E = false;
        CancellableContinuation cancellableContinuation = this.I;
        if (cancellableContinuation != null) {
            cancellableContinuation.U(windowInsetsAnimationController, WindowInsetsNestedScrollConnection$onReady$1.f4254z);
        }
        this.I = null;
    }

    public Object q0(long j2, long j3, Continuation continuation) {
        return k(j3, this.f4246B.c(Velocity.h(j3), Velocity.i(j3)), true, continuation);
    }

    public long t1(long j2, int i2) {
        return n(j2, this.f4246B.a(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2))));
    }
}
