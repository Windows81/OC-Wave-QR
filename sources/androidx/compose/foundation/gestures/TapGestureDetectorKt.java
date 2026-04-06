package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TapGestureDetectorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function3 f3596a = new TapGestureDetectorKt$NoPressGesture$1((Continuation) null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, boolean r8, androidx.compose.ui.input.pointer.PointerEventPass r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            boolean r7 = r0.E
            java.lang.Object r8 = r0.D
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.ResultKt.b(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            kotlin.ResultKt.b(r10)
        L_0x0042:
            r0.C = r7
            r0.D = r9
            r0.E = r8
            r0.G = r3
            java.lang.Object r10 = r7.k0(r9, r0)
            if (r10 != r1) goto L_0x0051
            return r1
        L_0x0051:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = p(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L_0x0042
            java.util.List r7 = r10.c()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.e(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object f(AwaitPointerEventScope awaitPointerEventScope, boolean z2, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return e(awaitPointerEventScope, z2, pointerEventPass, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    public static final java.lang.Object g(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, boolean r6, androidx.compose.ui.input.pointer.PointerEventPass r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            boolean r5 = r0.E
            java.lang.Object r6 = r0.D
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.ResultKt.b(r8)
        L_0x0042:
            r0.C = r5
            r0.D = r7
            r0.E = r6
            r0.G = r3
            java.lang.Object r8 = r5.k0(r7, r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            boolean r2 = o(r8, r6, r3)
            if (r2 == 0) goto L_0x0042
            java.util.List r5 = r8.c()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object h(AwaitPointerEventScope awaitPointerEventScope, boolean z2, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return g(awaitPointerEventScope, z2, pointerEventPass, continuation);
    }

    public static final Object i(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, Continuation continuation) {
        return awaitPointerEventScope.V0(awaitPointerEventScope.getViewConfiguration().a(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, (Continuation) null), continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055 A[LOOP:0: B:17:0x0053->B:18:0x0055, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[SYNTHETIC] */
    public static final java.lang.Object j(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r9)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            kotlin.ResultKt.b(r9)
        L_0x0038:
            r0.C = r8
            r0.E = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0044
            return r1
        L_0x0044:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.c()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L_0x0053:
            if (r6 >= r4) goto L_0x0061
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L_0x0053
        L_0x0061:
            java.util.List r9 = r9.c()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L_0x006c:
            if (r5 >= r2) goto L_0x007e
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.i()
            if (r4 == 0) goto L_0x007b
            goto L_0x0038
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x006c
        L_0x007e:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.j(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object k(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, function3, function1, new PressGestureScopeImpl(pointerInputScope), (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public static final Object l(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, function3, function12, function1, function13, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public static /* synthetic */ Object m(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i2, Object obj) {
        Function1 function14 = (i2 & 1) != 0 ? null : function1;
        Function1 function15 = (i2 & 2) != 0 ? null : function12;
        if ((i2 & 4) != 0) {
            function3 = f3596a;
        }
        return l(pointerInputScope, function14, function15, function3, (i2 & 8) != 0 ? null : function13, continuation);
    }

    public static final CoroutineStart n() {
        return ComposeFoundationFlags.f3046d ? CoroutineStart.UNDISPATCHED : CoroutineStart.DEFAULT;
    }

    public static final boolean o(PointerEvent pointerEvent, boolean z2, boolean z3) {
        if (z3) {
            List c2 = pointerEvent.c();
            int size = c2.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (!PointerType.h(((PointerInputChange) c2.get(i2)).n(), PointerType.f16933b.b())) {
                        break;
                    }
                    i2++;
                } else if (!PointerEvent_androidKt.c(pointerEvent.b())) {
                    return false;
                }
            }
        }
        List c3 = pointerEvent.c();
        int size2 = c3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            PointerInputChange pointerInputChange = (PointerInputChange) c3.get(i3);
            if (!(z2 ? PointerEventKt.a(pointerInputChange) : PointerEventKt.b(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean p(PointerEvent pointerEvent, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z3 = TapGestureDetector_androidKt.a();
        }
        return o(pointerEvent, z2, z3);
    }

    public static final Job q(CoroutineScope coroutineScope, Job job, CoroutineStart coroutineStart, Function2 function2) {
        return BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, coroutineStart, new TapGestureDetectorKt$launchAwaitingReset$1(job, function2, (Continuation) null), 1, (Object) null);
    }

    public static /* synthetic */ Job r(CoroutineScope coroutineScope, Job job, CoroutineStart coroutineStart, Function2 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineStart = n();
        }
        return q(coroutineScope, job, coroutineStart, function2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.C
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.ResultKt.b(r9)     // Catch:{ PointerEventTimeoutCancellationException -> 0x005e }
            goto L_0x005b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.ResultKt.b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            androidx.compose.foundation.gestures.LongPressResult$Canceled r2 = androidx.compose.foundation.gestures.LongPressResult.Canceled.f3523a
            r9.f40908z = r2
            androidx.compose.ui.platform.ViewConfiguration r2 = r7.getViewConfiguration()     // Catch:{ PointerEventTimeoutCancellationException -> 0x005e }
            long r4 = r2.c()     // Catch:{ PointerEventTimeoutCancellationException -> 0x005e }
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch:{ PointerEventTimeoutCancellationException -> 0x005e }
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch:{ PointerEventTimeoutCancellationException -> 0x005e }
            r0.C = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x005e }
            r0.E = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x005e }
            java.lang.Object r7 = r7.S1(r4, r2, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x005e }
            if (r7 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r7 = r9
        L_0x005b:
            java.lang.Object r7 = r7.f40908z
            return r7
        L_0x005e:
            androidx.compose.foundation.gestures.LongPressResult$Success r7 = androidx.compose.foundation.gestures.LongPressResult.Success.f3525a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.s(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object t(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return s(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r0 = r0.c();
        r9 = r0.size();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r10 >= r9) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        if (r11.p() != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.f(r11, r8.a(), r8.I1()) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        r0 = androidx.compose.ui.input.pointer.PointerEventPass.f16850B;
        r1.C = r8;
        r1.D = r3;
        r1.F = 2;
        r0 = r8.k0(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (r0 != r2) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6 A[LOOP:2: B:36:0x00d7->B:40:0x00e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object u(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.ui.input.pointer.PointerEventPass r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r1 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) r1
            int r2 = r1.F
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.F = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.E
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r1.F
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0052
            if (r3 == r7) goto L_0x0046
            if (r3 != r5) goto L_0x003e
            java.lang.Object r3 = r1.D
            androidx.compose.ui.input.pointer.PointerEventPass r3 = (androidx.compose.ui.input.pointer.PointerEventPass) r3
            java.lang.Object r8 = r1.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r0)
        L_0x0037:
            r16 = r3
            r3 = r1
            r1 = r16
            goto L_0x00c9
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            java.lang.Object r3 = r1.D
            androidx.compose.ui.input.pointer.PointerEventPass r3 = (androidx.compose.ui.input.pointer.PointerEventPass) r3
            java.lang.Object r8 = r1.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r0)
            goto L_0x0071
        L_0x0052:
            kotlin.ResultKt.b(r0)
            r0 = r18
            r3 = r1
            r1 = r19
        L_0x005a:
            r3.C = r0
            r3.D = r1
            r3.F = r7
            java.lang.Object r8 = r0.k0(r1, r3)
            if (r8 != r2) goto L_0x0067
            return r2
        L_0x0067:
            r16 = r8
            r8 = r0
            r0 = r16
            r17 = r3
            r3 = r1
            r1 = r17
        L_0x0071:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r9 = r0.c()
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = r6
        L_0x007f:
            if (r11 >= r10) goto L_0x00ef
            java.lang.Object r12 = r9.get(r11)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r12 = androidx.compose.ui.input.pointer.PointerEventKt.c(r12)
            if (r12 != 0) goto L_0x00ec
            java.util.List r0 = r0.c()
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = r6
        L_0x0099:
            if (r10 >= r9) goto L_0x00ba
            java.lang.Object r11 = r0.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r12 = r11.p()
            if (r12 != 0) goto L_0x00b9
            long r12 = r8.a()
            long r14 = r8.I1()
            boolean r11 = androidx.compose.ui.input.pointer.PointerEventKt.f(r11, r12, r14)
            if (r11 == 0) goto L_0x00b6
            goto L_0x00b9
        L_0x00b6:
            int r10 = r10 + 1
            goto L_0x0099
        L_0x00b9:
            return r4
        L_0x00ba:
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r1.C = r8
            r1.D = r3
            r1.F = r5
            java.lang.Object r0 = r8.k0(r0, r1)
            if (r0 != r2) goto L_0x0037
            return r2
        L_0x00c9:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r0 = r0.c()
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = r6
        L_0x00d7:
            if (r10 >= r9) goto L_0x00e9
            java.lang.Object r11 = r0.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.p()
            if (r11 == 0) goto L_0x00e6
            return r4
        L_0x00e6:
            int r10 = r10 + 1
            goto L_0x00d7
        L_0x00e9:
            r0 = r8
            goto L_0x005a
        L_0x00ec:
            int r11 = r11 + 1
            goto L_0x007f
        L_0x00ef:
            java.util.List r0 = r0.c()
            java.lang.Object r0 = r0.get(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.u(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object v(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return u(awaitPointerEventScope, pointerEventPass, continuation);
    }
}
