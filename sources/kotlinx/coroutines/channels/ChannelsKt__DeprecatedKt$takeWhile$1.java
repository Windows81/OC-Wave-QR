package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", l = {299, 300, 301}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements Function2 {
    public Object D;
    public Object E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ReceiveChannel H;
    public final /* synthetic */ Function2 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$takeWhile$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.H = receiveChannel;
        this.I = function2;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.H, this.I, continuation);
        channelsKt__DeprecatedKt$takeWhile$1.G = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.F
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 == r4) goto L_0x0033
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r8.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r8.G
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r9)
            goto L_0x004d
        L_0x001d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0025:
            java.lang.Object r1 = r8.E
            java.lang.Object r5 = r8.D
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r8.G
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r9)
            goto L_0x007c
        L_0x0033:
            java.lang.Object r1 = r8.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r8.G
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlin.ResultKt.b(r9)
            goto L_0x005a
        L_0x003f:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.G
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            kotlinx.coroutines.channels.ReceiveChannel r1 = r8.H
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r9
        L_0x004d:
            r8.G = r5
            r8.D = r1
            r8.F = r4
            java.lang.Object r9 = r1.a(r8)
            if (r9 != r0) goto L_0x005a
            return r0
        L_0x005a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x009a
            java.lang.Object r9 = r1.next()
            kotlin.jvm.functions.Function2 r6 = r8.I
            r8.G = r5
            r8.D = r1
            r8.E = r9
            r8.F = r3
            java.lang.Object r6 = r6.m(r9, r8)
            if (r6 != r0) goto L_0x0077
            return r0
        L_0x0077:
            r7 = r1
            r1 = r9
            r9 = r6
            r6 = r5
            r5 = r7
        L_0x007c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0087
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        L_0x0087:
            r8.G = r6
            r8.D = r5
            r9 = 0
            r8.E = r9
            r8.F = r2
            java.lang.Object r9 = r6.O(r1, r8)
            if (r9 != r0) goto L_0x0097
            return r0
        L_0x0097:
            r1 = r5
            r5 = r6
            goto L_0x004d
        L_0x009a:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.x(java.lang.Object):java.lang.Object");
    }
}
