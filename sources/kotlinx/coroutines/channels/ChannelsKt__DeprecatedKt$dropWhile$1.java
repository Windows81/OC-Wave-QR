package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", l = {211, 212, 213, 217, 218}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements Function2 {
    public Object D;
    public Object E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ReceiveChannel H;
    public final /* synthetic */ Function2 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$dropWhile$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.H = receiveChannel;
        this.I = function2;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.H, this.I, continuation);
        channelsKt__DeprecatedKt$dropWhile$1.G = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r11.F
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0065
            if (r1 == r6) goto L_0x0056
            if (r1 == r5) goto L_0x0045
            if (r1 == r4) goto L_0x003c
            if (r1 == r3) goto L_0x002f
            if (r1 != r2) goto L_0x0027
            java.lang.Object r1 = r11.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r11.G
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.b(r12)
        L_0x0023:
            r12 = r1
            r1 = r4
            goto L_0x00c5
        L_0x0027:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x002f:
            java.lang.Object r1 = r11.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r11.G
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.b(r12)
            goto L_0x00d6
        L_0x003c:
            java.lang.Object r1 = r11.G
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.ResultKt.b(r12)
            goto L_0x00bf
        L_0x0045:
            java.lang.Object r1 = r11.E
            java.lang.Object r8 = r11.D
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r11.G
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            kotlin.ResultKt.b(r12)
            r10 = r8
            r8 = r1
        L_0x0054:
            r1 = r10
            goto L_0x00a4
        L_0x0056:
            java.lang.Object r1 = r11.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r8 = r11.G
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            kotlin.ResultKt.b(r12)
        L_0x0061:
            r10 = r8
            r8 = r1
            r1 = r10
            goto L_0x0082
        L_0x0065:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.G
            kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
            kotlinx.coroutines.channels.ReceiveChannel r1 = r11.H
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r8 = r12
        L_0x0073:
            r11.G = r8
            r11.D = r1
            r11.E = r7
            r11.F = r6
            java.lang.Object r12 = r1.a(r11)
            if (r12 != r0) goto L_0x0061
            return r0
        L_0x0082:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00bf
            java.lang.Object r12 = r8.next()
            kotlin.jvm.functions.Function2 r9 = r11.I
            r11.G = r1
            r11.D = r8
            r11.E = r12
            r11.F = r5
            java.lang.Object r9 = r9.m(r12, r11)
            if (r9 != r0) goto L_0x009f
            return r0
        L_0x009f:
            r10 = r8
            r8 = r12
            r12 = r9
            r9 = r1
            goto L_0x0054
        L_0x00a4:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x00bd
            r11.G = r9
            r11.D = r7
            r11.E = r7
            r11.F = r4
            java.lang.Object r12 = r9.O(r8, r11)
            if (r12 != r0) goto L_0x00bb
            return r0
        L_0x00bb:
            r1 = r9
            goto L_0x00bf
        L_0x00bd:
            r8 = r9
            goto L_0x0073
        L_0x00bf:
            kotlinx.coroutines.channels.ReceiveChannel r12 = r11.H
            kotlinx.coroutines.channels.ChannelIterator r12 = r12.iterator()
        L_0x00c5:
            r11.G = r1
            r11.D = r12
            r11.F = r3
            java.lang.Object r4 = r12.a(r11)
            if (r4 != r0) goto L_0x00d2
            return r0
        L_0x00d2:
            r10 = r1
            r1 = r12
            r12 = r4
            r4 = r10
        L_0x00d6:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00ef
            java.lang.Object r12 = r1.next()
            r11.G = r4
            r11.D = r1
            r11.F = r2
            java.lang.Object r12 = r4.O(r12, r11)
            if (r12 != r0) goto L_0x0023
            return r0
        L_0x00ef:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1.x(java.lang.Object):java.lang.Object");
    }
}
