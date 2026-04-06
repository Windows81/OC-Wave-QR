package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", l = {272, 284}, m = "invokeSuspend")
public final class TransformableKt$detectZoomByCtrlMouseScroll$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f3614B;
    public /* synthetic */ Object C;
    public final /* synthetic */ CoroutineContext D;
    public final /* synthetic */ ScrollConfig E;
    public final /* synthetic */ Channel F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableKt$detectZoomByCtrlMouseScroll$2(CoroutineContext coroutineContext, ScrollConfig scrollConfig, Channel channel, Continuation continuation) {
        super(2, continuation);
        this.D = coroutineContext;
        this.E = scrollConfig;
        this.F = channel;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TransformableKt$detectZoomByCtrlMouseScroll$2 transformableKt$detectZoomByCtrlMouseScroll$2 = new TransformableKt$detectZoomByCtrlMouseScroll$2(this.D, this.E, this.F, continuation);
        transformableKt$detectZoomByCtrlMouseScroll$2.C = obj;
        return transformableKt$detectZoomByCtrlMouseScroll$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[SYNTHETIC, Splitter:B:16:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b A[Catch:{ all -> 0x0017 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.f3614B
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r1 = r12.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r13)     // Catch:{ all -> 0x0017 }
            goto L_0x008c
        L_0x0017:
            r13 = move-exception
            goto L_0x009d
        L_0x001a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0022:
            java.lang.Object r1 = r12.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r13)     // Catch:{ all -> 0x0017 }
            goto L_0x0047
        L_0x002a:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            r1 = r13
        L_0x0032:
            kotlin.coroutines.CoroutineContext r13 = r12.D
            boolean r13 = kotlinx.coroutines.JobKt.n(r13)
            if (r13 == 0) goto L_0x00a5
            androidx.compose.foundation.gestures.ScrollConfig r13 = r12.E     // Catch:{ all -> 0x0017 }
            r12.C = r1     // Catch:{ all -> 0x0017 }
            r12.f3614B = r3     // Catch:{ all -> 0x0017 }
            java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.f(r1, r13, r12)     // Catch:{ all -> 0x0017 }
            if (r13 != r0) goto L_0x0047
            return r0
        L_0x0047:
            androidx.compose.ui.geometry.Offset r13 = (androidx.compose.ui.geometry.Offset) r13     // Catch:{ all -> 0x0017 }
            long r4 = r13.t()     // Catch:{ all -> 0x0017 }
            kotlinx.coroutines.channels.Channel r13 = r12.F     // Catch:{ all -> 0x0017 }
            androidx.compose.foundation.gestures.TransformEvent$TransformStarted r6 = androidx.compose.foundation.gestures.TransformEvent.TransformStarted.f3608a     // Catch:{ all -> 0x0017 }
            r13.L(r6)     // Catch:{ all -> 0x0017 }
        L_0x0054:
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r13 = (int) r4     // Catch:{ all -> 0x0017 }
            float r13 = java.lang.Float.intBitsToFloat(r13)     // Catch:{ all -> 0x0017 }
            r4 = 1141391360(0x44084000, float:545.0)
            float r13 = r13 / r4
            r4 = 1073741824(0x40000000, float:2.0)
            double r4 = (double) r4     // Catch:{ all -> 0x0017 }
            double r6 = (double) r13     // Catch:{ all -> 0x0017 }
            double r4 = java.lang.Math.pow(r4, r6)     // Catch:{ all -> 0x0017 }
            float r7 = (float) r4     // Catch:{ all -> 0x0017 }
            kotlinx.coroutines.channels.Channel r13 = r12.F     // Catch:{ all -> 0x0017 }
            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r4 = new androidx.compose.foundation.gestures.TransformEvent$TransformDelta     // Catch:{ all -> 0x0017 }
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.ui.geometry.Offset.f15855b     // Catch:{ all -> 0x0017 }
            long r8 = r5.c()     // Catch:{ all -> 0x0017 }
            r10 = 0
            r11 = 0
            r6 = r4
            r6.<init>(r7, r8, r10, r11)     // Catch:{ all -> 0x0017 }
            r13.L(r4)     // Catch:{ all -> 0x0017 }
            androidx.compose.foundation.gestures.ScrollConfig r13 = r12.E     // Catch:{ all -> 0x0017 }
            r12.C = r1     // Catch:{ all -> 0x0017 }
            r12.f3614B = r2     // Catch:{ all -> 0x0017 }
            java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.e(r1, r13, r12)     // Catch:{ all -> 0x0017 }
            if (r13 != r0) goto L_0x008c
            return r0
        L_0x008c:
            androidx.compose.ui.geometry.Offset r13 = (androidx.compose.ui.geometry.Offset) r13     // Catch:{ all -> 0x0017 }
            if (r13 == 0) goto L_0x0095
            long r4 = r13.t()     // Catch:{ all -> 0x0017 }
            goto L_0x0054
        L_0x0095:
            kotlinx.coroutines.channels.Channel r13 = r12.F
            androidx.compose.foundation.gestures.TransformEvent$TransformStopped r4 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.f3609a
            r13.L(r4)
            goto L_0x0032
        L_0x009d:
            kotlinx.coroutines.channels.Channel r0 = r12.F
            androidx.compose.foundation.gestures.TransformEvent$TransformStopped r1 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.f3609a
            r0.L(r1)
            throw r13
        L_0x00a5:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((TransformableKt$detectZoomByCtrlMouseScroll$2) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
