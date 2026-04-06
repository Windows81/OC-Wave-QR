package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {421, 423, 425, 432, 434, 437}, m = "invokeSuspend")
public final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ DragGestureNode H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, Continuation continuation) {
        super(2, continuation);
        this.H = dragGestureNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DragGestureNode$startListeningForEvents$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.H, continuation);
        dragGestureNode$startListeningForEvents$1.G = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:34|35|36|(1:38)|13|39|40|(2:47|(2:49|(1:51)))(2:42|(1:44))) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        kotlin.ResultKt.b(r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.F
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0046;
                case 2: goto L_0x003a;
                case 3: goto L_0x0029;
                case 4: goto L_0x0022;
                case 5: goto L_0x001a;
                case 6: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0012:
            java.lang.Object r1 = r6.G
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r7)
            goto L_0x0027
        L_0x001a:
            java.lang.Object r1 = r6.G
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
        L_0x001e:
            kotlin.ResultKt.b(r7)     // Catch:{ CancellationException -> 0x00ed }
            goto L_0x0027
        L_0x0022:
            java.lang.Object r1 = r6.G
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            goto L_0x001e
        L_0x0027:
            r4 = r1
            goto L_0x005e
        L_0x0029:
            java.lang.Object r1 = r6.D
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r3 = r6.G
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.b(r7)     // Catch:{ CancellationException -> 0x0037 }
        L_0x0034:
            r4 = r3
            goto L_0x00ba
        L_0x0037:
            r1 = r3
            goto L_0x00ed
        L_0x003a:
            java.lang.Object r1 = r6.D
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r3 = r6.G
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.b(r7)
            goto L_0x00a5
        L_0x0046:
            java.lang.Object r1 = r6.E
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r3 = r6.D
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r4 = r6.G
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.ResultKt.b(r7)
            goto L_0x0082
        L_0x0056:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.G
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            r4 = r7
        L_0x005e:
            boolean r7 = kotlinx.coroutines.CoroutineScopeKt.h(r4)
            if (r7 == 0) goto L_0x00fd
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.compose.foundation.gestures.DragGestureNode r7 = r6.H
            kotlinx.coroutines.channels.Channel r7 = r7.U
            if (r7 == 0) goto L_0x0085
            r6.G = r4
            r6.D = r1
            r6.E = r1
            r3 = 1
            r6.F = r3
            java.lang.Object r7 = r7.v(r6)
            if (r7 != r0) goto L_0x0081
            return r0
        L_0x0081:
            r3 = r1
        L_0x0082:
            androidx.compose.foundation.gestures.DragEvent r7 = (androidx.compose.foundation.gestures.DragEvent) r7
            goto L_0x0087
        L_0x0085:
            r3 = r1
            r7 = r2
        L_0x0087:
            r1.f40908z = r7
            java.lang.Object r7 = r3.f40908z
            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragStarted
            if (r1 == 0) goto L_0x005e
            androidx.compose.foundation.gestures.DragGestureNode r1 = r6.H
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r7
            r6.G = r4
            r6.D = r3
            r6.E = r2
            r5 = 2
            r6.F = r5
            java.lang.Object r7 = r1.v3(r7, r6)
            if (r7 != r0) goto L_0x00a3
            return r0
        L_0x00a3:
            r1 = r3
            r3 = r4
        L_0x00a5:
            androidx.compose.foundation.gestures.DragGestureNode r7 = r6.H     // Catch:{ CancellationException -> 0x0037 }
            androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1 r4 = new androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1     // Catch:{ CancellationException -> 0x0037 }
            r4.<init>(r1, r7, r2)     // Catch:{ CancellationException -> 0x0037 }
            r6.G = r3     // Catch:{ CancellationException -> 0x0037 }
            r6.D = r1     // Catch:{ CancellationException -> 0x0037 }
            r5 = 3
            r6.F = r5     // Catch:{ CancellationException -> 0x0037 }
            java.lang.Object r7 = r7.o3(r4, r6)     // Catch:{ CancellationException -> 0x0037 }
            if (r7 != r0) goto L_0x0034
            return r0
        L_0x00ba:
            java.lang.Object r7 = r1.f40908z     // Catch:{ CancellationException -> 0x00d7 }
            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped     // Catch:{ CancellationException -> 0x00d7 }
            if (r1 == 0) goto L_0x00d9
            androidx.compose.foundation.gestures.DragGestureNode r1 = r6.H     // Catch:{ CancellationException -> 0x00d7 }
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"
            kotlin.jvm.internal.Intrinsics.g(r7, r3)     // Catch:{ CancellationException -> 0x00d7 }
            androidx.compose.foundation.gestures.DragEvent$DragStopped r7 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r7     // Catch:{ CancellationException -> 0x00d7 }
            r6.G = r4     // Catch:{ CancellationException -> 0x00d7 }
            r6.D = r2     // Catch:{ CancellationException -> 0x00d7 }
            r3 = 4
            r6.F = r3     // Catch:{ CancellationException -> 0x00d7 }
            java.lang.Object r7 = r1.w3(r7, r6)     // Catch:{ CancellationException -> 0x00d7 }
            if (r7 != r0) goto L_0x005e
            return r0
        L_0x00d7:
            r1 = r4
            goto L_0x00ed
        L_0x00d9:
            boolean r7 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled     // Catch:{ CancellationException -> 0x00d7 }
            if (r7 == 0) goto L_0x005e
            androidx.compose.foundation.gestures.DragGestureNode r7 = r6.H     // Catch:{ CancellationException -> 0x00d7 }
            r6.G = r4     // Catch:{ CancellationException -> 0x00d7 }
            r6.D = r2     // Catch:{ CancellationException -> 0x00d7 }
            r1 = 5
            r6.F = r1     // Catch:{ CancellationException -> 0x00d7 }
            java.lang.Object r7 = r7.u3(r6)     // Catch:{ CancellationException -> 0x00d7 }
            if (r7 != r0) goto L_0x005e
            return r0
        L_0x00ed:
            androidx.compose.foundation.gestures.DragGestureNode r7 = r6.H
            r6.G = r1
            r6.D = r2
            r3 = 6
            r6.F = r3
            java.lang.Object r7 = r7.u3(r6)
            if (r7 != r0) goto L_0x0027
            return r0
        L_0x00fd:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.x(java.lang.Object):java.lang.Object");
    }
}
