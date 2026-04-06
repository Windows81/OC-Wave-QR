package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements Function2<ChannelResult<Object>, Continuation<? super Boolean>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ FlowCollector F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.F = flowCollector;
    }

    public final Object A(Object obj, Continuation continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) s(ChannelResult.b(obj), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((ChannelResult) obj).l(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.F, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.E = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.D
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r0 = r4.E
            kotlin.ResultKt.b(r5)
            goto L_0x0036
        L_0x0011:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0019:
            kotlin.ResultKt.b(r5)
            java.lang.Object r5 = r4.E
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r5 = r5.l()
            kotlinx.coroutines.flow.FlowCollector r1 = r4.F
            boolean r3 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r3 != 0) goto L_0x0037
            r4.E = r5
            r4.D = r2
            java.lang.Object r1 = r1.c(r5, r4)
            if (r1 != r0) goto L_0x0035
            return r0
        L_0x0035:
            r0 = r5
        L_0x0036:
            r5 = r0
        L_0x0037:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto L_0x0049
            java.lang.Throwable r5 = kotlinx.coroutines.channels.ChannelResult.e(r5)
            if (r5 != 0) goto L_0x0048
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        L_0x0048:
            throw r5
        L_0x0049:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.x(java.lang.Object):java.lang.Object");
    }
}
