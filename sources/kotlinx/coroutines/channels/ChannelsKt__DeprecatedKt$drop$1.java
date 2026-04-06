package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", l = {194, 199, 200}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements Function2 {
    public Object D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ int H;
    public final /* synthetic */ ReceiveChannel I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$drop$1(int i2, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.H = i2;
        this.I = receiveChannel;
    }

    /* renamed from: A */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$drop$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.H, this.I, continuation);
        channelsKt__DeprecatedKt$drop$1.G = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r1 == 0) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.F
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r4) goto L_0x0032
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r1 = r8.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r8.G
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.b(r9)
        L_0x001c:
            r9 = r4
            goto L_0x007e
        L_0x001e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0026:
            java.lang.Object r1 = r8.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r8.G
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.b(r9)
            goto L_0x008e
        L_0x0032:
            int r1 = r8.E
            java.lang.Object r5 = r8.D
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r8.G
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.ResultKt.b(r9)
            goto L_0x0068
        L_0x0040:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.G
            kotlinx.coroutines.channels.ProducerScope r9 = (kotlinx.coroutines.channels.ProducerScope) r9
            int r1 = r8.H
            if (r1 < 0) goto L_0x004d
            r5 = r4
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            if (r5 == 0) goto L_0x00aa
            if (r1 <= 0) goto L_0x0078
            kotlinx.coroutines.channels.ReceiveChannel r5 = r8.I
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            r6 = r9
        L_0x0059:
            r8.G = r6
            r8.D = r5
            r8.E = r1
            r8.F = r4
            java.lang.Object r9 = r5.a(r8)
            if (r9 != r0) goto L_0x0068
            return r0
        L_0x0068:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0077
            r5.next()
            int r1 = r1 + -1
            if (r1 != 0) goto L_0x0059
        L_0x0077:
            r9 = r6
        L_0x0078:
            kotlinx.coroutines.channels.ReceiveChannel r1 = r8.I
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
        L_0x007e:
            r8.G = r9
            r8.D = r1
            r8.F = r3
            java.lang.Object r4 = r1.a(r8)
            if (r4 != r0) goto L_0x008b
            return r0
        L_0x008b:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x008e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00a7
            java.lang.Object r9 = r1.next()
            r8.G = r4
            r8.D = r1
            r8.F = r2
            java.lang.Object r9 = r4.O(r9, r8)
            if (r9 != r0) goto L_0x001c
            return r0
        L_0x00a7:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        L_0x00aa:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Requested element count "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = " is less than zero."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1.x(java.lang.Object):java.lang.Object");
    }
}
