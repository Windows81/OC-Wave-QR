package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$requireNoNulls$1 extends SuspendLambda implements Function2 {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ReceiveChannel F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$requireNoNulls$1(ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.F = receiveChannel;
    }

    /* renamed from: A */
    public final Object m(Object obj, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$requireNoNulls$1) s(obj, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$requireNoNulls$1 channelsKt__DeprecatedKt$requireNoNulls$1 = new ChannelsKt__DeprecatedKt$requireNoNulls$1(this.F, continuation);
        channelsKt__DeprecatedKt$requireNoNulls$1.E = obj;
        return channelsKt__DeprecatedKt$requireNoNulls$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Object obj2 = this.E;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.F + '.');
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
