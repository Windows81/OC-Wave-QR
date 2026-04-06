package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {413}, m = "invokeSuspend")
final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public long D;
    public int E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ long H;
    public final /* synthetic */ Flow I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1(long j2, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.H = j2;
        this.I = flow;
    }

    /* renamed from: A */
    public final Object d(CoroutineScope coroutineScope, FlowCollector flowCollector, Continuation continuation) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.H, this.I, continuation);
        flowKt__DelayKt$timeoutInternal$1.F = coroutineScope;
        flowKt__DelayKt$timeoutInternal$1.G = flowCollector;
        return flowKt__DelayKt$timeoutInternal$1.x(Unit.f40552a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    public final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.E
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            long r4 = r9.D
            java.lang.Object r1 = r9.G
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r6 = r9.F
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.b(r10)
            goto L_0x0077
        L_0x001a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0022:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.F
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            java.lang.Object r1 = r9.G
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            long r4 = r9.H
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.f41206A
            long r6 = r6.c()
            int r4 = kotlin.time.Duration.n(r4, r6)
            if (r4 <= 0) goto L_0x0082
            kotlinx.coroutines.flow.Flow r4 = r9.I
            r5 = 0
            r6 = 2
            kotlinx.coroutines.flow.Flow r4 = kotlinx.coroutines.flow.FlowKt__ContextKt.b(r4, r5, r3, r6, r3)
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.flow.FlowKt.X(r4, r10)
            long r4 = r9.H
            r6 = r1
            r1 = r10
        L_0x004b:
            kotlinx.coroutines.selects.SelectImplementation r10 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r7 = r9.f()
            r10.<init>(r7)
            kotlinx.coroutines.selects.SelectClause1 r7 = r1.i()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r8.<init>(r6, r3)
            r10.g(r7, r8)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r7 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r7.<init>(r4, r3)
            kotlinx.coroutines.selects.OnTimeoutKt.b(r10, r4, r7)
            r9.F = r6
            r9.G = r1
            r9.D = r4
            r9.E = r2
            java.lang.Object r10 = r10.q(r9)
            if (r10 != r0) goto L_0x0077
            return r0
        L_0x0077:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x004b
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x0082:
            kotlinx.coroutines.TimeoutCancellationException r10 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r0 = "Timed out immediately"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.x(java.lang.Object):java.lang.Object");
    }
}
