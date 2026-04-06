package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final /* synthetic */ class FlowKt__ShareKt {
    public static final SharedFlow a(MutableSharedFlow mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, (Job) null);
    }

    public static final StateFlow b(MutableStateFlow mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, (Job) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 == 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.coroutines.flow.SharingConfig c(kotlinx.coroutines.flow.Flow r7, int r8) {
        /*
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.f41490y
            int r0 = r0.a()
            int r0 = kotlin.ranges.RangesKt.e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L_0x003c
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            kotlinx.coroutines.flow.Flow r2 = r1.l()
            if (r2 == 0) goto L_0x003c
            kotlinx.coroutines.flow.SharingConfig r7 = new kotlinx.coroutines.flow.SharingConfig
            int r3 = r1.f41783A
            r4 = -3
            if (r3 == r4) goto L_0x0026
            r4 = -2
            if (r3 == r4) goto L_0x0026
            if (r3 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0034
        L_0x0026:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f41784B
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r6 = 0
            if (r4 != r5) goto L_0x0031
            if (r3 != 0) goto L_0x0034
        L_0x002f:
            r0 = r6
            goto L_0x0034
        L_0x0031:
            if (r8 != 0) goto L_0x002f
            r0 = 1
        L_0x0034:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f41784B
            kotlin.coroutines.CoroutineContext r1 = r1.f41785z
            r7.<init>(r2, r0, r8, r1)
            return r7
        L_0x003c:
            kotlinx.coroutines.flow.SharingConfig r8 = new kotlinx.coroutines.flow.SharingConfig
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.c(kotlinx.coroutines.flow.Flow, int):kotlinx.coroutines.flow.SharingConfig");
    }

    public static final Job d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow flow, MutableSharedFlow mutableSharedFlow, SharingStarted sharingStarted, Object obj) {
        return BuildersKt.c(coroutineScope, coroutineContext, Intrinsics.d(sharingStarted, SharingStarted.f41761a.c()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, obj, (Continuation) null));
    }

    public static final void e(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow flow, CompletableDeferred completableDeferred) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, coroutineContext, (CoroutineStart) null, new FlowKt__ShareKt$launchSharingDeferred$1(flow, completableDeferred, (Continuation) null), 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(kotlinx.coroutines.flow.Flow r4, kotlinx.coroutines.CoroutineScope r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1 r0 = (kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.D = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r6)
            goto L_0x0058
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.SharingConfig r4 = c(r4, r3)
            kotlin.coroutines.CoroutineContext r6 = r5.getCoroutineContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.f41415x
            kotlin.coroutines.CoroutineContext$Element r6 = r6.d(r2)
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.CompletableDeferredKt.a(r6)
            kotlin.coroutines.CoroutineContext r2 = r4.f41760d
            kotlinx.coroutines.flow.Flow r4 = r4.f41757a
            e(r5, r2, r4, r6)
            r0.D = r3
            java.lang.Object r6 = r6.G(r0)
            if (r6 != r1) goto L_0x0058
            return r1
        L_0x0058:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r4 = r6.j()
            kotlin.ResultKt.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.f(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final StateFlow g(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        SharingConfig c2 = c(flow, 1);
        MutableStateFlow a2 = StateFlowKt.a(obj);
        return new ReadonlyStateFlow(a2, d(coroutineScope, c2.f41760d, c2.f41757a, a2, sharingStarted, obj));
    }
}
