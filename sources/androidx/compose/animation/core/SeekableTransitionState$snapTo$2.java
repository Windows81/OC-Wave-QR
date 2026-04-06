package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {457}, m = "invokeSuspend")
public final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SeekableTransitionState E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Transition G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(SeekableTransitionState seekableTransitionState, Object obj, Transition transition, Continuation continuation) {
        super(1, continuation);
        this.E = seekableTransitionState;
        this.F = obj;
        this.G = transition;
    }

    public final Continuation A(Continuation continuation) {
        return new SeekableTransitionState$snapTo$2(this.E, this.F, this.G, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((SeekableTransitionState$snapTo$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.E.E();
            this.E.f2653l = Long.MIN_VALUE;
            this.E.U(0.0f);
            Object obj2 = this.F;
            float f3 = Intrinsics.d(obj2, this.E.a()) ? -4.0f : Intrinsics.d(obj2, this.E.b()) ? -5.0f : -3.0f;
            this.G.R(this.F);
            this.G.J(0);
            this.E.V(this.F);
            this.E.U(0.0f);
            this.E.d(this.F);
            this.G.F(f3);
            if (f3 == -3.0f) {
                SeekableTransitionState seekableTransitionState = this.E;
                this.D = 1;
                if (seekableTransitionState.Z(this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.G.A();
        return Unit.f40552a;
    }
}
