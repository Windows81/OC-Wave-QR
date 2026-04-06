package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", l = {514, 499, 501}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$zip$2 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ ReceiveChannel K;
    public final /* synthetic */ ReceiveChannel L;
    public final /* synthetic */ Function2 M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$zip$2(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.K = receiveChannel;
        this.L = receiveChannel2;
        this.M = function2;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$zip$2) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.K, this.L, this.M, continuation);
        channelsKt__DeprecatedKt$zip$2.J = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cd A[Catch:{ all -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.I
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x006f
            if (r1 == r4) goto L_0x0057
            if (r1 == r3) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            java.lang.Object r1 = r12.G
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r12.F
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r12.E
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r8 = r12.D
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r12.J
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            kotlin.ResultKt.b(r13)     // Catch:{ all -> 0x002a }
            goto L_0x0088
        L_0x002a:
            r13 = move-exception
            goto L_0x00f7
        L_0x002d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0035:
            java.lang.Object r1 = r12.H
            java.lang.Object r6 = r12.G
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r12.F
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r12.E
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r9 = r12.D
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            java.lang.Object r10 = r12.J
            kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
            kotlin.ResultKt.b(r13)     // Catch:{ all -> 0x0053 }
            r11 = r6
            r6 = r1
            r1 = r11
            goto L_0x00c5
        L_0x0053:
            r13 = move-exception
            r6 = r7
            goto L_0x00f7
        L_0x0057:
            java.lang.Object r1 = r12.G
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r12.F
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r12.E
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r8 = r12.D
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r12.J
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            kotlin.ResultKt.b(r13)     // Catch:{ all -> 0x002a }
            goto L_0x009d
        L_0x006f:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.J
            kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
            kotlinx.coroutines.channels.ReceiveChannel r1 = r12.K
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            kotlinx.coroutines.channels.ReceiveChannel r6 = r12.L
            kotlin.jvm.functions.Function2 r7 = r12.M
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch:{ all -> 0x002a }
            r9 = r13
            r11 = r8
            r8 = r1
            r1 = r11
        L_0x0088:
            r12.J = r9     // Catch:{ all -> 0x002a }
            r12.D = r8     // Catch:{ all -> 0x002a }
            r12.E = r7     // Catch:{ all -> 0x002a }
            r12.F = r6     // Catch:{ all -> 0x002a }
            r12.G = r1     // Catch:{ all -> 0x002a }
            r12.H = r5     // Catch:{ all -> 0x002a }
            r12.I = r4     // Catch:{ all -> 0x002a }
            java.lang.Object r13 = r1.a(r12)     // Catch:{ all -> 0x002a }
            if (r13 != r0) goto L_0x009d
            return r0
        L_0x009d:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x002a }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x002a }
            if (r13 == 0) goto L_0x00ef
            java.lang.Object r13 = r1.next()     // Catch:{ all -> 0x002a }
            r12.J = r9     // Catch:{ all -> 0x002a }
            r12.D = r8     // Catch:{ all -> 0x002a }
            r12.E = r7     // Catch:{ all -> 0x002a }
            r12.F = r6     // Catch:{ all -> 0x002a }
            r12.G = r1     // Catch:{ all -> 0x002a }
            r12.H = r13     // Catch:{ all -> 0x002a }
            r12.I = r3     // Catch:{ all -> 0x002a }
            java.lang.Object r10 = r8.a(r12)     // Catch:{ all -> 0x002a }
            if (r10 != r0) goto L_0x00be
            return r0
        L_0x00be:
            r11 = r6
            r6 = r13
            r13 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r11
        L_0x00c5:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x0053 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0053 }
            if (r13 == 0) goto L_0x00ea
            java.lang.Object r13 = r9.next()     // Catch:{ all -> 0x0053 }
            java.lang.Object r13 = r8.m(r6, r13)     // Catch:{ all -> 0x0053 }
            r12.J = r10     // Catch:{ all -> 0x0053 }
            r12.D = r9     // Catch:{ all -> 0x0053 }
            r12.E = r8     // Catch:{ all -> 0x0053 }
            r12.F = r7     // Catch:{ all -> 0x0053 }
            r12.G = r1     // Catch:{ all -> 0x0053 }
            r12.H = r5     // Catch:{ all -> 0x0053 }
            r12.I = r2     // Catch:{ all -> 0x0053 }
            java.lang.Object r13 = r10.O(r13, r12)     // Catch:{ all -> 0x0053 }
            if (r13 != r0) goto L_0x00ea
            return r0
        L_0x00ea:
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            goto L_0x0088
        L_0x00ef:
            kotlin.Unit r13 = kotlin.Unit.f40552a     // Catch:{ all -> 0x002a }
            kotlinx.coroutines.channels.ChannelsKt.b(r6, r5)
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        L_0x00f7:
            throw r13     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.b(r6, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2.x(java.lang.Object):java.lang.Object");
    }
}
