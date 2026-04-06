package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public int F;
    public /* synthetic */ Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ Flow J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(Function1 function1, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.I = function1;
        this.J = flow;
    }

    /* renamed from: A */
    public final Object d(CoroutineScope coroutineScope, FlowCollector flowCollector, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.I, this.J, continuation);
        flowKt__DelayKt$debounceInternal$1.G = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.H = flowCollector;
        return flowKt__DelayKt$debounceInternal$1.x(Unit.f40552a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r14.F
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x003e
            if (r1 == r3) goto L_0x002a
            if (r1 != r2) goto L_0x0022
            java.lang.Object r1 = r14.D
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r5 = r14.H
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r14.G
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.b(r15)
        L_0x001e:
            r7 = r6
            r6 = r5
            r5 = r1
            goto L_0x0060
        L_0x0022:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002a:
            java.lang.Object r1 = r14.E
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref.LongRef) r1
            java.lang.Object r5 = r14.D
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r6 = r14.H
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r14.G
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            kotlin.ResultKt.b(r15)
            goto L_0x00a2
        L_0x003e:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.G
            r5 = r15
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            java.lang.Object r15 = r14.H
            kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            kotlinx.coroutines.flow.Flow r1 = r14.J
            r8.<init>(r1, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.channels.ReceiveChannel r1 = kotlinx.coroutines.channels.ProduceKt.d(r5, r6, r7, r8, r9, r10)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            r7 = r15
            r6 = r1
        L_0x0060:
            java.lang.Object r15 = r5.f40908z
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f41810c
            if (r15 == r1) goto L_0x00e5
            kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
            r1.<init>()
            java.lang.Object r15 = r5.f40908z
            if (r15 == 0) goto L_0x00a4
            kotlin.jvm.functions.Function1 r8 = r14.I
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f41808a
            if (r15 != r9) goto L_0x0076
            r15 = r4
        L_0x0076:
            java.lang.Object r15 = r8.invoke(r15)
            java.lang.Number r15 = (java.lang.Number) r15
            long r10 = r15.longValue()
            r1.f40907z = r10
            r12 = 0
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 < 0) goto L_0x00a9
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 != 0) goto L_0x00a4
            java.lang.Object r15 = r5.f40908z
            if (r15 != r9) goto L_0x0091
            r15 = r4
        L_0x0091:
            r14.G = r7
            r14.H = r6
            r14.D = r5
            r14.E = r1
            r14.F = r3
            java.lang.Object r15 = r7.c(r15, r14)
            if (r15 != r0) goto L_0x00a2
            return r0
        L_0x00a2:
            r5.f40908z = r4
        L_0x00a4:
            r15 = r1
            r1 = r5
            r5 = r6
            r6 = r7
            goto L_0x00b1
        L_0x00a9:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Debounce timeout should not be negative"
            r15.<init>(r0)
            throw r15
        L_0x00b1:
            kotlinx.coroutines.selects.SelectImplementation r7 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r8 = r14.f()
            r7.<init>(r8)
            java.lang.Object r8 = r1.f40908z
            if (r8 == 0) goto L_0x00c8
            long r8 = r15.f40907z
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r15 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1
            r15.<init>(r6, r1, r4)
            kotlinx.coroutines.selects.OnTimeoutKt.a(r7, r8, r15)
        L_0x00c8:
            kotlinx.coroutines.selects.SelectClause1 r15 = r5.i()
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2
            r8.<init>(r1, r6, r4)
            r7.g(r15, r8)
            r14.G = r6
            r14.H = r5
            r14.D = r1
            r14.E = r4
            r14.F = r2
            java.lang.Object r15 = r7.q(r14)
            if (r15 != r0) goto L_0x001e
            return r0
        L_0x00e5:
            kotlin.Unit r15 = kotlin.Unit.f40552a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.x(java.lang.Object):java.lang.Object");
    }
}
