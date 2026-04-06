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
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$distinct$1 extends SuspendLambda implements Function2 {
    public int D;
    public /* synthetic */ Object E;

    public ChannelsKt__DeprecatedKt$distinct$1(Continuation continuation) {
        super(2, continuation);
    }

    /* renamed from: A */
    public final Object m(Object obj, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$distinct$1) s(obj, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$distinct$1 channelsKt__DeprecatedKt$distinct$1 = new ChannelsKt__DeprecatedKt$distinct$1(continuation);
        channelsKt__DeprecatedKt$distinct$1.E = obj;
        return channelsKt__DeprecatedKt$distinct$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            return this.E;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
