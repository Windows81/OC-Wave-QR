package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ForEachGestureKt {
    public static final boolean a(AwaitPointerEventScope awaitPointerEventScope) {
        List c2 = awaitPointerEventScope.l0().c();
        int size = c2.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            } else if (((PointerInputChange) c2.get(i2)).i()) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        return !z2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[EDGE_INSN: B:24:0x0072->B:22:0x0072 ?: BREAK  , SYNTHETIC] */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r7 = r0.D
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x0052
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            kotlin.ResultKt.b(r9)
            boolean r9 = a(r7)
            if (r9 != 0) goto L_0x0072
        L_0x0045:
            r0.C = r7
            r0.D = r8
            r0.F = r3
            java.lang.Object r9 = r7.k0(r8, r0)
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x0052:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r9 = r9.c()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L_0x0060:
            if (r4 >= r2) goto L_0x0072
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.i()
            if (r5 == 0) goto L_0x006f
            goto L_0x0045
        L_0x006f:
            int r4 = r4 + 1
            goto L_0x0060
        L_0x0072:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.b(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object c(PointerInputScope pointerInputScope, Continuation continuation) {
        Object M0 = pointerInputScope.M0(new ForEachGestureKt$awaitAllPointersUp$2((Continuation) null), continuation);
        return M0 == IntrinsicsKt.f() ? M0 : Unit.f40552a;
    }

    public static /* synthetic */ Object d(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Final;
        }
        return b(awaitPointerEventScope, pointerEventPass, continuation);
    }

    public static final Object e(PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
        Object M0 = pointerInputScope.M0(new ForEachGestureKt$awaitEachGesture$2(continuation.f(), function2, (Continuation) null), continuation);
        return M0 == IntrinsicsKt.f() ? M0 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074 A[SYNTHETIC, Splitter:B:25:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.PointerInputScope r8, kotlin.jvm.functions.Function2 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r5) goto L_0x0057
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r8 = r0.E
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.D
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r2 = r0.C
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            kotlin.ResultKt.b(r10)
            goto L_0x0052
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            java.lang.Object r8 = r0.E
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.D
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r2 = r0.C
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            kotlin.ResultKt.b(r10)     // Catch:{ CancellationException -> 0x0055 }
        L_0x0052:
            r10 = r8
            r8 = r2
            goto L_0x006e
        L_0x0055:
            r10 = move-exception
            goto L_0x0099
        L_0x0057:
            java.lang.Object r8 = r0.E
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.D
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r2 = r0.C
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            kotlin.ResultKt.b(r10)     // Catch:{ CancellationException -> 0x0055 }
            goto L_0x0085
        L_0x0067:
            kotlin.ResultKt.b(r10)
            kotlin.coroutines.CoroutineContext r10 = r0.f()
        L_0x006e:
            boolean r2 = kotlinx.coroutines.JobKt.n(r10)
            if (r2 == 0) goto L_0x00af
            r0.C = r8     // Catch:{ CancellationException -> 0x0094 }
            r0.D = r9     // Catch:{ CancellationException -> 0x0094 }
            r0.E = r10     // Catch:{ CancellationException -> 0x0094 }
            r0.G = r5     // Catch:{ CancellationException -> 0x0094 }
            java.lang.Object r2 = r9.m(r8, r0)     // Catch:{ CancellationException -> 0x0094 }
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r8
            r8 = r10
        L_0x0085:
            r0.C = r2     // Catch:{ CancellationException -> 0x0055 }
            r0.D = r9     // Catch:{ CancellationException -> 0x0055 }
            r0.E = r8     // Catch:{ CancellationException -> 0x0055 }
            r0.G = r4     // Catch:{ CancellationException -> 0x0055 }
            java.lang.Object r10 = c(r2, r0)     // Catch:{ CancellationException -> 0x0055 }
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x0094:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L_0x0099:
            boolean r6 = kotlinx.coroutines.JobKt.n(r8)
            if (r6 == 0) goto L_0x00ae
            r0.C = r2
            r0.D = r9
            r0.E = r8
            r0.G = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x00ae:
            throw r10
        L_0x00af:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.f(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
