package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", l = {374, 375, 375}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ReceiveChannel I;
    public final /* synthetic */ Function3 J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel receiveChannel, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.I = receiveChannel;
        this.J = function3;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.I, this.J, continuation);
        channelsKt__DeprecatedKt$mapIndexed$1.H = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r10.G
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r4) goto L_0x003a
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            int r1 = r10.F
            java.lang.Object r5 = r10.D
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r10.H
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r11)
            r11 = r6
            goto L_0x0059
        L_0x0020:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0028:
            int r1 = r10.F
            java.lang.Object r5 = r10.E
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            java.lang.Object r6 = r10.D
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r10.H
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.ResultKt.b(r11)
            goto L_0x0094
        L_0x003a:
            int r1 = r10.F
            java.lang.Object r5 = r10.D
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r10.H
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r11)
            goto L_0x006b
        L_0x0048:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.H
            kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
            kotlinx.coroutines.channels.ReceiveChannel r1 = r10.I
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = 0
            r9 = r5
            r5 = r1
            r1 = r9
        L_0x0059:
            r10.H = r11
            r10.D = r5
            r10.F = r1
            r10.G = r4
            java.lang.Object r6 = r5.a(r10)
            if (r6 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r9 = r6
            r6 = r11
            r11 = r9
        L_0x006b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a9
            java.lang.Object r11 = r5.next()
            kotlin.jvm.functions.Function3 r7 = r10.J
            int r8 = r1 + 1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.c(r1)
            r10.H = r6
            r10.D = r5
            r10.E = r6
            r10.F = r8
            r10.G = r3
            java.lang.Object r11 = r7.d(r1, r11, r10)
            if (r11 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r7 = r6
            r1 = r8
            r6 = r5
            r5 = r7
        L_0x0094:
            r10.H = r7
            r10.D = r6
            r8 = 0
            r10.E = r8
            r10.F = r1
            r10.G = r2
            java.lang.Object r11 = r5.O(r11, r10)
            if (r11 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            r5 = r6
            r11 = r7
            goto L_0x0059
        L_0x00a9:
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.x(java.lang.Object):java.lang.Object");
    }
}
