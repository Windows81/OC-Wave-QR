package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public Object N;
    public Object O;
    public Object[] P;
    public Function2 Q;
    public PointerInputEventHandler R;
    public Job S;
    public PointerEvent T = SuspendingPointerInputFilterKt.f16948a;
    public final MutableVector U;
    public final Object V;
    public final MutableVector W;
    public PointerEvent X;
    public long Y;
    public boolean Z;

    @Metadata
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation<R> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f16952A;

        /* renamed from: B  reason: collision with root package name */
        public CancellableContinuation f16953B;
        public PointerEventPass C = PointerEventPass.Main;
        public final CoroutineContext D = EmptyCoroutineContext.f40721z;

        /* renamed from: z  reason: collision with root package name */
        public final Continuation f16954z;

        public PointerEventHandlerCoroutine(Continuation continuation) {
            this.f16954z = continuation;
            this.f16952A = SuspendingPointerInputModifierNodeImpl.this;
        }

        public long A(float f2) {
            return this.f16952A.A(f2);
        }

        public float B1(float f2) {
            return this.f16952A.B1(f2);
        }

        public float D(int i2) {
            return this.f16952A.D(i2);
        }

        public float E(float f2) {
            return this.f16952A.E(f2);
        }

        public final void H(Throwable th) {
            CancellableContinuation cancellableContinuation = this.f16953B;
            if (cancellableContinuation != null) {
                cancellableContinuation.W(th);
            }
            this.f16953B = null;
        }

        public final void I(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            CancellableContinuation cancellableContinuation;
            if (pointerEventPass == this.C && (cancellableContinuation = this.f16953B) != null) {
                this.f16953B = null;
                cancellableContinuation.q(Result.b(pointerEvent));
            }
        }

        public long I1() {
            return SuspendingPointerInputModifierNodeImpl.this.I1();
        }

        public int K1(long j2) {
            return this.f16952A.K1(j2);
        }

        public int P1(float f2) {
            return this.f16952A.P1(f2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object S1(long r11, kotlin.jvm.functions.Function2 r13, kotlin.coroutines.Continuation r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L_0x0013
                r0 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.F
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.F = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r10, r14)
            L_0x0018:
                java.lang.Object r14 = r0.D
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.F
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r11 = r0.C
                kotlinx.coroutines.Job r11 = (kotlinx.coroutines.Job) r11
                kotlin.ResultKt.b(r14)     // Catch:{ all -> 0x002d }
                goto L_0x0075
            L_0x002d:
                r12 = move-exception
                goto L_0x007b
            L_0x002f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0037:
                kotlin.ResultKt.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L_0x0056
                kotlinx.coroutines.CancellableContinuation r14 = r10.f16953B
                if (r14 == 0) goto L_0x0056
                kotlin.Result$Companion r2 = kotlin.Result.f40519A
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = kotlin.ResultKt.a(r2)
                java.lang.Object r2 = kotlin.Result.b(r2)
                r14.q(r2)
            L_0x0056:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r14 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                kotlinx.coroutines.CoroutineScope r4 = r14.y2()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.Job r11 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r4, r5, r6, r7, r8, r9)
                r0.C = r11     // Catch:{ all -> 0x002d }
                r0.F = r3     // Catch:{ all -> 0x002d }
                java.lang.Object r14 = r13.m(r10, r0)     // Catch:{ all -> 0x002d }
                if (r14 != r1) goto L_0x0075
                return r1
            L_0x0075:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f16805z
                r11.c(r12)
                return r14
            L_0x007b:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f16805z
                r11.c(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.S1(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public long V(long j2) {
            return this.f16952A.V(j2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object V0(long r5, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.E
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.E = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.C
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.E
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                kotlin.ResultKt.b(r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                goto L_0x003e
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                kotlin.ResultKt.b(r8)
                r0.E = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                java.lang.Object r8 = r4.S1(r5, r7, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                if (r8 != r1) goto L_0x003e
                return r1
            L_0x003d:
                r8 = 0
            L_0x003e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.V0(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public long a() {
            return SuspendingPointerInputModifierNodeImpl.this.Y;
        }

        public CoroutineContext f() {
            return this.D;
        }

        public float f2(long j2) {
            return this.f16952A.f2(j2);
        }

        public float getDensity() {
            return this.f16952A.getDensity();
        }

        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public Object k0(PointerEventPass pointerEventPass, Continuation continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.C = pointerEventPass;
            this.f16953B = cancellableContinuationImpl;
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2;
        }

        public PointerEvent l0() {
            return SuspendingPointerInputModifierNodeImpl.this.T;
        }

        public void q(Object obj) {
            Object c3 = SuspendingPointerInputModifierNodeImpl.this.V;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (c3) {
                suspendingPointerInputModifierNodeImpl.U.v(this);
                Unit unit = Unit.f40552a;
            }
            this.f16954z.q(obj);
        }

        public long r(float f2) {
            return this.f16952A.r(f2);
        }

        public long s(long j2) {
            return this.f16952A.s(j2);
        }

        public float u1() {
            return this.f16952A.u1();
        }

        public float v(long j2) {
            return this.f16952A.v(j2);
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16955a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.input.pointer.PointerEventPass[] r0 = androidx.compose.ui.input.pointer.PointerEventPass.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Final     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f16955a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.WhenMappings.<clinit>():void");
        }
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.N = obj;
        this.O = obj2;
        this.P = objArr;
        this.R = pointerInputEventHandler;
        MutableVector mutableVector = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.U = mutableVector;
        this.V = mutableVector;
        this.W = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.Y = IntSize.f19170b.a();
    }

    public void G() {
        u2();
    }

    public long I1() {
        long V2 = V(getViewConfiguration().e());
        long a2 = a();
        return Size.d((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (V2 >> 32)) - ((float) ((int) (a2 >> 32)))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (V2 & 4294967295L)) - ((float) ((int) (a2 & 4294967295L)))) / 2.0f)) & 4294967295L));
    }

    public void J2() {
        u2();
        super.J2();
    }

    public Object M0(Function2 function2, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(cancellableContinuationImpl);
        synchronized (this.V) {
            this.U.d(pointerEventHandlerCoroutine);
            Continuation a2 = ContinuationKt.a(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.Companion companion = Result.f40519A;
            a2.q(Result.b(Unit.f40552a));
        }
        cancellableContinuationImpl.u(new SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.Y = j2;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.T = pointerEvent;
        }
        if (this.S == null) {
            this.S = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, (Continuation) null), 1, (Object) null);
        }
        e3(pointerEvent, pointerEventPass);
        List c2 = pointerEvent.c();
        int size = c2.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = true;
                break;
            } else if (!PointerEventKt.d((PointerInputChange) c2.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        if (z2) {
            pointerEvent = null;
        }
        this.X = pointerEvent;
    }

    public void X0() {
        PointerEvent pointerEvent = this.X;
        if (pointerEvent != null) {
            List c2 = pointerEvent.c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((PointerInputChange) c2.get(i2)).i()) {
                    List c3 = pointerEvent.c();
                    ArrayList arrayList = new ArrayList(c3.size());
                    int size2 = c3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        PointerInputChange pointerInputChange = (PointerInputChange) c3.get(i3);
                        arrayList.add(new PointerInputChange(pointerInputChange.f(), pointerInputChange.o(), pointerInputChange.h(), false, pointerInputChange.j(), pointerInputChange.o(), pointerInputChange.h(), pointerInputChange.i(), pointerInputChange.i(), pointerInputChange.n(), 0, 1024, (DefaultConstructorMarker) null));
                    }
                    PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                    this.T = pointerEvent2;
                    e3(pointerEvent2, PointerEventPass.Initial);
                    e3(pointerEvent2, PointerEventPass.Main);
                    e3(pointerEvent2, PointerEventPass.Final);
                    this.X = null;
                    return;
                }
            }
        }
    }

    public long a() {
        return this.Y;
    }

    public void e2() {
        u2();
    }

    public final void e3(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        synchronized (this.V) {
            MutableVector mutableVector = this.W;
            mutableVector.e(mutableVector.p(), this.U);
        }
        try {
            int i2 = WhenMappings.f16955a[pointerEventPass.ordinal()];
            if (i2 == 1 || i2 == 2) {
                MutableVector mutableVector2 = this.W;
                Object[] objArr = mutableVector2.f15005z;
                int p2 = mutableVector2.p();
                for (int i3 = 0; i3 < p2; i3++) {
                    ((PointerEventHandlerCoroutine) objArr[i3]).I(pointerEvent, pointerEventPass);
                }
            } else if (i2 == 3) {
                MutableVector mutableVector3 = this.W;
                int p3 = mutableVector3.p() - 1;
                Object[] objArr2 = mutableVector3.f15005z;
                if (p3 < objArr2.length) {
                    while (p3 >= 0) {
                        ((PointerEventHandlerCoroutine) objArr2[p3]).I(pointerEvent, pointerEventPass);
                        p3--;
                    }
                }
            }
        } finally {
            this.W.l();
        }
    }

    public PointerInputEventHandler f3() {
        return this.R;
    }

    public final void g3(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        boolean z2 = true;
        boolean z3 = !Intrinsics.d(this.N, obj);
        this.N = obj;
        if (!Intrinsics.d(this.O, obj2)) {
            z3 = true;
        }
        this.O = obj2;
        Object[] objArr2 = this.P;
        if (objArr2 != null && objArr == null) {
            z3 = true;
        }
        if (objArr2 == null && objArr != null) {
            z3 = true;
        }
        if (!(objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2))) {
            z3 = true;
        }
        this.P = objArr;
        if (f3().getClass() == pointerInputEventHandler.getClass()) {
            z2 = z3;
        }
        if (z2) {
            u2();
        }
        this.R = pointerInputEventHandler;
    }

    public float getDensity() {
        return DelegatableNodeKt.o(this).P().getDensity();
    }

    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.o(this).F0();
    }

    public void l2(boolean z2) {
        this.Z = z2;
    }

    public float u1() {
        return DelegatableNodeKt.o(this).P().u1();
    }

    public void u2() {
        Job job = this.S;
        if (job != null) {
            job.c(new PointerInputResetException());
            this.S = null;
        }
    }
}
