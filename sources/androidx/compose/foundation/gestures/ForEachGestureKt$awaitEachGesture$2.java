package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend")
public final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f3522B;
    public /* synthetic */ Object C;
    public final /* synthetic */ CoroutineContext D;
    public final /* synthetic */ Function2 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.D = coroutineContext;
        this.E = function2;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.D, this.E, continuation);
        forEachGestureKt$awaitEachGesture$2.C = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[SYNTHETIC, Splitter:B:19:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.f3522B
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x002d
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r1 = r8.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r9)
            goto L_0x0029
        L_0x001a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0022:
            java.lang.Object r1 = r8.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r9)     // Catch:{ CancellationException -> 0x002b }
        L_0x0029:
            r9 = r1
            goto L_0x003c
        L_0x002b:
            r9 = move-exception
            goto L_0x0061
        L_0x002d:
            java.lang.Object r1 = r8.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r9)     // Catch:{ CancellationException -> 0x002b }
            goto L_0x0052
        L_0x0035:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
        L_0x003c:
            kotlin.coroutines.CoroutineContext r1 = r8.D
            boolean r1 = kotlinx.coroutines.JobKt.n(r1)
            if (r1 == 0) goto L_0x0075
            kotlin.jvm.functions.Function2 r1 = r8.E     // Catch:{ CancellationException -> 0x005d }
            r8.C = r9     // Catch:{ CancellationException -> 0x005d }
            r8.f3522B = r5     // Catch:{ CancellationException -> 0x005d }
            java.lang.Object r1 = r1.m(r9, r8)     // Catch:{ CancellationException -> 0x005d }
            if (r1 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r1 = r9
        L_0x0052:
            r8.C = r1     // Catch:{ CancellationException -> 0x002b }
            r8.f3522B = r3     // Catch:{ CancellationException -> 0x002b }
            java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.d(r1, r4, r8, r5, r4)     // Catch:{ CancellationException -> 0x002b }
            if (r9 != r0) goto L_0x0029
            return r0
        L_0x005d:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0061:
            kotlin.coroutines.CoroutineContext r6 = r8.D
            boolean r6 = kotlinx.coroutines.JobKt.n(r6)
            if (r6 == 0) goto L_0x0074
            r8.C = r1
            r8.f3522B = r2
            java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.d(r1, r4, r8, r5, r4)
            if (r9 != r0) goto L_0x0029
            return r0
        L_0x0074:
            throw r9
        L_0x0075:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((ForEachGestureKt$awaitEachGesture$2) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
