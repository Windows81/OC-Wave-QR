package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
public final class Animatable$stop$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Animatable E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$stop$2(Animatable animatable, Continuation continuation) {
        super(1, continuation);
        this.E = animatable;
    }

    public final Continuation A(Continuation continuation) {
        return new Animatable$stop$2(this.E, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((Animatable$stop$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            this.E.i();
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
