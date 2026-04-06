package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f41772A;

    /* renamed from: z  reason: collision with root package name */
    public final FlowCollector f41773z;

    public SubscribedFlowCollector(FlowCollector flowCollector, Function2 function2) {
        this.f41773z = flowCollector;
        this.f41772A = function2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r7)
            goto L_0x0079
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.C
            kotlinx.coroutines.flow.SubscribedFlowCollector r4 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r4
            kotlin.ResultKt.b(r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0060
        L_0x0040:
            r7 = move-exception
            goto L_0x007f
        L_0x0042:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f41773z
            kotlin.coroutines.CoroutineContext r5 = r0.f()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2 r7 = r6.f41772A     // Catch:{ all -> 0x0040 }
            r0.C = r6     // Catch:{ all -> 0x0040 }
            r0.D = r2     // Catch:{ all -> 0x0040 }
            r0.G = r4     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r7.m(r2, r0)     // Catch:{ all -> 0x0040 }
            if (r7 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r4 = r6
        L_0x0060:
            r2.y()
            kotlinx.coroutines.flow.FlowCollector r7 = r4.f41773z
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L_0x007c
            kotlinx.coroutines.flow.SubscribedFlowCollector r7 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r7
            r2 = 0
            r0.C = r2
            r0.D = r2
            r0.G = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x0079
            return r1
        L_0x0079:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x007c:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x007f:
            r2.y()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object c(Object obj, Continuation continuation) {
        return this.f41773z.c(obj, continuation);
    }
}
