package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {107, 110}, m = "invokeSuspend")
public final class MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ MouseWheelScrollingLogic F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.F = mouseWheelScrollingLogic;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this.F, continuation);
        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.E = obj;
        return mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.D
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            java.lang.Object r1 = r12.E
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r13)     // Catch:{ all -> 0x0018 }
        L_0x0016:
            r13 = r1
            goto L_0x0031
        L_0x0018:
            r13 = move-exception
            goto L_0x0088
        L_0x001a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0022:
            java.lang.Object r1 = r12.E
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r13)     // Catch:{ all -> 0x0018 }
            goto L_0x004f
        L_0x002a:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.E
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
        L_0x0031:
            kotlin.coroutines.CoroutineContext r1 = r13.getCoroutineContext()     // Catch:{ all -> 0x0018 }
            boolean r1 = kotlinx.coroutines.JobKt.n(r1)     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0080
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = r12.F     // Catch:{ all -> 0x0018 }
            kotlinx.coroutines.channels.Channel r1 = r1.f3532e     // Catch:{ all -> 0x0018 }
            r12.E = r13     // Catch:{ all -> 0x0018 }
            r12.D = r4     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.v(r12)     // Catch:{ all -> 0x0018 }
            if (r1 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x004f:
            r7 = r13
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r7 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r7     // Catch:{ all -> 0x0018 }
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r12.F     // Catch:{ all -> 0x0018 }
            androidx.compose.ui.unit.Density r13 = r13.f3531d     // Catch:{ all -> 0x0018 }
            float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.f3526a     // Catch:{ all -> 0x0018 }
            float r8 = r13.B1(r5)     // Catch:{ all -> 0x0018 }
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r12.F     // Catch:{ all -> 0x0018 }
            androidx.compose.ui.unit.Density r13 = r13.f3531d     // Catch:{ all -> 0x0018 }
            float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.f3527b     // Catch:{ all -> 0x0018 }
            float r9 = r13.B1(r5)     // Catch:{ all -> 0x0018 }
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = r12.F     // Catch:{ all -> 0x0018 }
            androidx.compose.foundation.gestures.ScrollingLogic r6 = r5.f3528a     // Catch:{ all -> 0x0018 }
            r12.E = r1     // Catch:{ all -> 0x0018 }
            r12.D = r3     // Catch:{ all -> 0x0018 }
            r10 = r12
            java.lang.Object r13 = r5.r(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0018 }
            if (r13 != r0) goto L_0x0016
            return r0
        L_0x0080:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r12.F
            r13.f3534g = r2
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        L_0x0088:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r0 = r12.F
            r0.f3534g = r2
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.x(java.lang.Object):java.lang.Object");
    }
}
