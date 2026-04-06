package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Flow G;
    public final /* synthetic */ Flow H;
    public final /* synthetic */ FlowCollector I;
    public final /* synthetic */ Function3 J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(Flow flow, Flow flow2, FlowCollector flowCollector, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.G = flow;
        this.H = flow2;
        this.I = flowCollector;
        this.J = function3;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CombineKt$zipImpl$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.G, this.H, this.I, this.J, continuation);
        combineKt$zipImpl$1$1.F = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlinx.coroutines.channels.ReceiveChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r21) {
        /*
            r20 = this;
            r8 = r20
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.E
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x002b
            if (r1 != r9) goto L_0x0023
            java.lang.Object r0 = r8.D
            r1 = r0
            kotlinx.coroutines.CompletableJob r1 = (kotlinx.coroutines.CompletableJob) r1
            java.lang.Object r0 = r8.F
            r2 = r0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.ResultKt.b(r21)     // Catch:{ AbortFlowException -> 0x0020 }
            goto L_0x0094
        L_0x001d:
            r0 = move-exception
            goto L_0x00ad
        L_0x0020:
            r0 = move-exception
            goto L_0x00a6
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            kotlin.ResultKt.b(r21)
            java.lang.Object r1 = r8.F
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.Flow r2 = r8.G
            r5.<init>(r2, r10)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            r2 = r1
            kotlinx.coroutines.channels.ReceiveChannel r7 = kotlinx.coroutines.channels.ProduceKt.d(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.CompletableJob r6 = kotlinx.coroutines.JobKt__JobKt.b(r10, r9, r10)
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>"
            kotlin.jvm.internal.Intrinsics.g(r7, r2)
            r2 = r7
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            r3.<init>(r6)
            r2.K(r3)
            kotlin.coroutines.CoroutineContext r13 = r1.getCoroutineContext()     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            java.lang.Object r14 = kotlinx.coroutines.internal.ThreadContextKt.g(r13)     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            kotlin.coroutines.CoroutineContext r1 = r1.y(r6)     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            kotlin.Unit r2 = kotlin.Unit.f40552a     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r4 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            kotlinx.coroutines.flow.Flow r12 = r8.H     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            kotlinx.coroutines.flow.FlowCollector r3 = r8.I     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            kotlin.jvm.functions.Function3 r5 = r8.J     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            r19 = 0
            r11 = r4
            r15 = r7
            r16 = r3
            r17 = r5
            r18 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            r8.F = r7     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            r8.D = r6     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            r8.E = r9     // Catch:{ AbortFlowException -> 0x00a2, all -> 0x009f }
            r3 = 0
            r11 = 4
            r12 = 0
            r5 = r20
            r13 = r6
            r6 = r11
            r11 = r7
            r7 = r12
            java.lang.Object r1 = kotlinx.coroutines.flow.internal.ChannelFlowKt.d(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ AbortFlowException -> 0x009b, all -> 0x0098 }
            if (r1 != r0) goto L_0x0093
            return r0
        L_0x0093:
            r2 = r11
        L_0x0094:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.a(r2, r10, r9, r10)
            goto L_0x00aa
        L_0x0098:
            r0 = move-exception
        L_0x0099:
            r2 = r11
            goto L_0x00ad
        L_0x009b:
            r0 = move-exception
        L_0x009c:
            r2 = r11
            r1 = r13
            goto L_0x00a6
        L_0x009f:
            r0 = move-exception
            r11 = r7
            goto L_0x0099
        L_0x00a2:
            r0 = move-exception
            r13 = r6
            r11 = r7
            goto L_0x009c
        L_0x00a6:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.a(r0, r1)     // Catch:{ all -> 0x001d }
            goto L_0x0094
        L_0x00aa:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        L_0x00ad:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.a(r2, r10, r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.x(java.lang.Object):java.lang.Object");
    }
}
