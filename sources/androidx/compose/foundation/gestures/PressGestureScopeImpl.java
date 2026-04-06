package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class PressGestureScopeImpl implements PressGestureScope, Density {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3553A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f3554B;
    public final Mutex C = MutexKt.a(false);

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f3555z;

    public PressGestureScopeImpl(Density density) {
        this.f3555z = density;
    }

    public long A(float f2) {
        return this.f3555z.A(f2);
    }

    public float B1(float f2) {
        return this.f3555z.B1(f2);
    }

    public float D(int i2) {
        return this.f3555z.D(i2);
    }

    public float E(float f2) {
        return this.f3555z.E(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object I0(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            r0.E = r3
            java.lang.Object r5 = r4.U1(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0048
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x0048:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.I0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public int K1(long j2) {
        return this.f3555z.K1(j2);
    }

    public int P1(float f2) {
        return this.f3555z.P1(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object U1(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.ResultKt.b(r6)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.f3553A
            if (r6 != 0) goto L_0x0055
            boolean r6 = r5.f3554B
            if (r6 != 0) goto L_0x0055
            kotlinx.coroutines.sync.Mutex r6 = r5.C
            r0.C = r5
            r0.F = r4
            java.lang.Object r6 = kotlinx.coroutines.sync.Mutex.DefaultImpls.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r5
        L_0x004f:
            kotlinx.coroutines.sync.Mutex r6 = r0.C
            kotlinx.coroutines.sync.Mutex.DefaultImpls.c(r6, r3, r4, r3)
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            boolean r6 = r0.f3553A
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.U1(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long V(long j2) {
        return this.f3555z.V(j2);
    }

    public final void b() {
        this.f3554B = true;
        if (this.C.b()) {
            Mutex.DefaultImpls.c(this.C, (Object) null, 1, (Object) null);
        }
    }

    public final void f() {
        this.f3553A = true;
        if (this.C.b()) {
            Mutex.DefaultImpls.c(this.C, (Object) null, 1, (Object) null);
        }
    }

    public float f2(long j2) {
        return this.f3555z.f2(j2);
    }

    public float getDensity() {
        return this.f3555z.getDensity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.ResultKt.b(r5)
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r5)
            kotlinx.coroutines.sync.Mutex r5 = r4.C
            r0.C = r4
            r0.F = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.Mutex.DefaultImpls.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r0 = r4
        L_0x0047:
            r5 = 0
            r0.f3553A = r5
            r0.f3554B = r5
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long r(float f2) {
        return this.f3555z.r(f2);
    }

    public long s(long j2) {
        return this.f3555z.s(j2);
    }

    public float u1() {
        return this.f3555z.u1();
    }

    public float v(long j2) {
        return this.f3555z.v(j2);
    }
}
