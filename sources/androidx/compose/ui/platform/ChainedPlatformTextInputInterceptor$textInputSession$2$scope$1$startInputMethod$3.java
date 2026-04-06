package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend")
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends SuspendLambda implements Function2<Unit, Continuation<?>, Object> {
    public int D;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor E;
    public final /* synthetic */ PlatformTextInputMethodRequest F;
    public final /* synthetic */ PlatformTextInputSessionScope G;

    @Metadata
    @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PlatformTextInputInterceptor, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(PlatformTextInputInterceptor platformTextInputInterceptor, Continuation continuation) {
            return ((AnonymousClass2) s(platformTextInputInterceptor, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(platformTextInputMethodRequest, platformTextInputSessionScope, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                PlatformTextInputMethodRequest platformTextInputMethodRequest = platformTextInputMethodRequest;
                PlatformTextInputSessionScope platformTextInputSessionScope = platformTextInputSessionScope;
                this.D = 1;
                if (((PlatformTextInputInterceptor) this.E).a(platformTextInputMethodRequest, platformTextInputSessionScope, this) == f2) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, Continuation continuation) {
        super(2, continuation);
        this.E = chainedPlatformTextInputInterceptor;
        this.F = platformTextInputMethodRequest;
        this.G = platformTextInputSessionScope;
    }

    /* renamed from: A */
    public final Object m(Unit unit, Continuation continuation) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) s(unit, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.E;
            Flow q2 = SnapshotStateKt.q(new Function0<PlatformTextInputInterceptor>() {
                /* renamed from: b */
                public final PlatformTextInputInterceptor invoke() {
                    return chainedPlatformTextInputInterceptor.b();
                }
            });
            final PlatformTextInputMethodRequest platformTextInputMethodRequest = this.F;
            final PlatformTextInputSessionScope platformTextInputSessionScope = this.G;
            AnonymousClass2 r1 = new AnonymousClass2((Continuation) null);
            this.D = 1;
            if (FlowKt.l(q2, r1, this) == f2) {
                return f2;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.b(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}
