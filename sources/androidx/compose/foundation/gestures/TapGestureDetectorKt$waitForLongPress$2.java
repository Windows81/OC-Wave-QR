package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, 409}, m = "invokeSuspend")
public final class TapGestureDetectorKt$waitForLongPress$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f3600B;
    public /* synthetic */ Object C;
    public final /* synthetic */ PointerEventPass D;
    public final /* synthetic */ Ref.ObjectRef E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.D = pointerEventPass;
        this.E = objectRef;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.D, this.E, continuation);
        tapGestureDetectorKt$waitForLongPress$2.C = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.b(r14) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r13.E.f40908z = androidx.compose.foundation.gestures.LongPressResult.Success.f3525a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r14 = r14.c();
        r5 = r14.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r6 >= r5) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r14.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        if (r7.p() != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.f(r7, r1.a(), r1.I1()) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        r13.E.f40908z = androidx.compose.foundation.gestures.LongPressResult.Canceled.f3523a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        r14 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r13.C = r1;
        r13.f3600B = 2;
        r14 = r1.k0(r14, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        if (r14 != r0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r13.f3600B
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r4) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            java.lang.Object r1 = r13.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r14)
            goto L_0x00a9
        L_0x0018:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0020:
            java.lang.Object r1 = r13.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r14)
            goto L_0x003f
        L_0x0028:
            kotlin.ResultKt.b(r14)
            java.lang.Object r14 = r13.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
        L_0x002f:
            androidx.compose.ui.input.pointer.PointerEventPass r1 = r13.D
            r13.C = r14
            r13.f3600B = r4
            java.lang.Object r1 = r14.k0(r1, r13)
            if (r1 != r0) goto L_0x003c
            return r0
        L_0x003c:
            r12 = r1
            r1 = r14
            r14 = r12
        L_0x003f:
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            java.util.List r5 = r14.c()
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = r3
        L_0x004d:
            if (r7 >= r6) goto L_0x00d6
            java.lang.Object r8 = r5.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.c(r8)
            if (r8 != 0) goto L_0x00d2
            boolean r5 = androidx.compose.foundation.gestures.TapGestureDetector_androidKt.b(r14)
            if (r5 == 0) goto L_0x0069
            kotlin.jvm.internal.Ref$ObjectRef r14 = r13.E
            androidx.compose.foundation.gestures.LongPressResult$Success r0 = androidx.compose.foundation.gestures.LongPressResult.Success.f3525a
            r14.f40908z = r0
            goto L_0x00e9
        L_0x0069:
            java.util.List r14 = r14.c()
            r5 = r14
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = r3
        L_0x0075:
            if (r6 >= r5) goto L_0x009c
            java.lang.Object r7 = r14.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r8 = r7.p()
            if (r8 != 0) goto L_0x0095
            long r8 = r1.a()
            long r10 = r1.I1()
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.f(r7, r8, r10)
            if (r7 == 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            int r6 = r6 + 1
            goto L_0x0075
        L_0x0095:
            kotlin.jvm.internal.Ref$ObjectRef r14 = r13.E
            androidx.compose.foundation.gestures.LongPressResult$Canceled r0 = androidx.compose.foundation.gestures.LongPressResult.Canceled.f3523a
            r14.f40908z = r0
            goto L_0x00e9
        L_0x009c:
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r13.C = r1
            r13.f3600B = r2
            java.lang.Object r14 = r1.k0(r14, r13)
            if (r14 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            java.util.List r14 = r14.c()
            r5 = r14
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = r3
        L_0x00b7:
            if (r6 >= r5) goto L_0x00cf
            java.lang.Object r7 = r14.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.p()
            if (r7 == 0) goto L_0x00cc
            kotlin.jvm.internal.Ref$ObjectRef r14 = r13.E
            androidx.compose.foundation.gestures.LongPressResult$Canceled r0 = androidx.compose.foundation.gestures.LongPressResult.Canceled.f3523a
            r14.f40908z = r0
            goto L_0x00e9
        L_0x00cc:
            int r6 = r6 + 1
            goto L_0x00b7
        L_0x00cf:
            r14 = r1
            goto L_0x002f
        L_0x00d2:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x00d6:
            kotlin.jvm.internal.Ref$ObjectRef r0 = r13.E
            androidx.compose.foundation.gestures.LongPressResult$Released r1 = new androidx.compose.foundation.gestures.LongPressResult$Released
            java.util.List r14 = r14.c()
            java.lang.Object r14 = r14.get(r3)
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            r1.<init>(r14)
            r0.f40908z = r1
        L_0x00e9:
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((TapGestureDetectorKt$waitForLongPress$2) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
