package androidx.compose.ui.platform;

import androidx.compose.ui.SessionMutex;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend")
public final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2(Function2 function2, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, Continuation continuation) {
        super(2, continuation);
        this.F = function2;
        this.G = chainedPlatformTextInputInterceptor;
    }

    /* renamed from: A */
    public final Object m(PlatformTextInputSessionScope platformTextInputSessionScope, Continuation continuation) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2) s(platformTextInputSessionScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(this.F, this.G, continuation);
        chainedPlatformTextInputInterceptor$textInputSession$2.E = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((PlatformTextInputSessionScope) this.E, SessionMutex.a(), this.G);
            Function2 function2 = this.F;
            this.D = 1;
            if (function2.m(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this) == f2) {
                return f2;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
