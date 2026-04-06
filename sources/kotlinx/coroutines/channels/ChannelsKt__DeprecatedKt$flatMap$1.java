package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", l = {351, 352, 352}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements Function2 {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ReceiveChannel G;
    public final /* synthetic */ Function2 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$flatMap$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.G = receiveChannel;
        this.H = function2;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.G, this.H, continuation);
        channelsKt__DeprecatedKt$flatMap$1.F = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.E
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r4) goto L_0x0031
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r7.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.F
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r8)
            goto L_0x004b
        L_0x001d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0025:
            java.lang.Object r1 = r7.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.F
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r8)
            goto L_0x0073
        L_0x0031:
            java.lang.Object r1 = r7.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.F
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r8)
            goto L_0x0058
        L_0x003d:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.F
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlinx.coroutines.channels.ReceiveChannel r1 = r7.G
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r8
        L_0x004b:
            r7.F = r5
            r7.D = r1
            r7.E = r4
            java.lang.Object r8 = r1.a(r7)
            if (r8 != r0) goto L_0x0058
            return r0
        L_0x0058:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0082
            java.lang.Object r8 = r1.next()
            kotlin.jvm.functions.Function2 r6 = r7.H
            r7.F = r5
            r7.D = r1
            r7.E = r3
            java.lang.Object r8 = r6.m(r8, r7)
            if (r8 != r0) goto L_0x0073
            return r0
        L_0x0073:
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            r7.F = r5
            r7.D = r1
            r7.E = r2
            java.lang.Object r8 = kotlinx.coroutines.channels.ChannelsKt.s(r8, r5, r7)
            if (r8 != r0) goto L_0x004b
            return r0
        L_0x0082:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1.x(java.lang.Object):java.lang.Object");
    }
}
