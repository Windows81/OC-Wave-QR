package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", l = {241, 242, 242}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements Function2 {
    public Object D;
    public Object E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ReceiveChannel I;
    public final /* synthetic */ Function3 J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(ReceiveChannel receiveChannel, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.I = receiveChannel;
        this.J = function3;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.I, this.J, continuation);
        channelsKt__DeprecatedKt$filterIndexed$1.H = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r11.G
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 == r5) goto L_0x003b
            if (r1 == r4) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            int r1 = r11.F
            java.lang.Object r6 = r11.D
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.H
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.b(r12)
            goto L_0x005b
        L_0x0020:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0028:
            int r1 = r11.F
            java.lang.Object r6 = r11.E
            java.lang.Object r7 = r11.D
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r11.H
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlin.ResultKt.b(r12)
            r10 = r7
            r7 = r6
            r6 = r10
            goto L_0x0095
        L_0x003b:
            int r1 = r11.F
            java.lang.Object r6 = r11.D
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.H
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.b(r12)
            goto L_0x006c
        L_0x0049:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.H
            kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
            kotlinx.coroutines.channels.ReceiveChannel r1 = r11.I
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = 0
            r7 = r12
            r10 = r6
            r6 = r1
            r1 = r10
        L_0x005b:
            r11.H = r7
            r11.D = r6
            r11.E = r2
            r11.F = r1
            r11.G = r5
            java.lang.Object r12 = r6.a(r11)
            if (r12 != r0) goto L_0x006c
            return r0
        L_0x006c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00b0
            java.lang.Object r12 = r6.next()
            kotlin.jvm.functions.Function3 r8 = r11.J
            int r9 = r1 + 1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.c(r1)
            r11.H = r7
            r11.D = r6
            r11.E = r12
            r11.F = r9
            r11.G = r4
            java.lang.Object r1 = r8.d(r1, r12, r11)
            if (r1 != r0) goto L_0x0091
            return r0
        L_0x0091:
            r8 = r7
            r7 = r12
            r12 = r1
            r1 = r9
        L_0x0095:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00ae
            r11.H = r8
            r11.D = r6
            r11.E = r2
            r11.F = r1
            r11.G = r3
            java.lang.Object r12 = r8.O(r7, r11)
            if (r12 != r0) goto L_0x00ae
            return r0
        L_0x00ae:
            r7 = r8
            goto L_0x005b
        L_0x00b0:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.x(java.lang.Object):java.lang.Object");
    }
}
