package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", l = {252}, m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filterNot$1 extends SuspendLambda implements Function2 {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function2 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterNot$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = function2;
    }

    /* renamed from: A */
    public final Object m(Object obj, Continuation continuation) {
        return ((ChannelsKt__DeprecatedKt$filterNot$1) s(obj, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterNot$1 channelsKt__DeprecatedKt$filterNot$1 = new ChannelsKt__DeprecatedKt$filterNot$1(this.F, continuation);
        channelsKt__DeprecatedKt$filterNot$1.E = obj;
        return channelsKt__DeprecatedKt$filterNot$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Object obj2 = this.E;
            Function2 function2 = this.F;
            this.D = 1;
            obj = function2.m(obj2, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Boxing.a(!((Boolean) obj).booleanValue());
    }
}
