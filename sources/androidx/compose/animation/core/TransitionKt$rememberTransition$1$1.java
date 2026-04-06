package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2147}, m = "invokeSuspend")
public final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public int F;
    public final /* synthetic */ TransitionState G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState transitionState, Continuation continuation) {
        super(2, continuation);
        this.G = transitionState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TransitionKt$rememberTransition$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TransitionKt$rememberTransition$1$1(this.G, continuation);
    }

    public final Object x(Object obj) {
        Mutex mutex;
        TransitionState transitionState;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.F;
        if (i2 == 0) {
            ResultKt.b(obj);
            ((SeekableTransitionState) this.G).L();
            mutex = ((SeekableTransitionState) this.G).H();
            TransitionState transitionState2 = this.G;
            this.D = mutex;
            this.E = transitionState2;
            this.F = 1;
            if (mutex.d((Object) null, this) == f2) {
                return f2;
            }
            transitionState = transitionState2;
        } else if (i2 == 1) {
            transitionState = (TransitionState) this.E;
            mutex = (Mutex) this.D;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            ((SeekableTransitionState) transitionState).S(transitionState.b());
            CancellableContinuation G2 = ((SeekableTransitionState) transitionState).G();
            if (G2 != null) {
                Result.Companion companion = Result.f40519A;
                G2.q(Result.b(transitionState.b()));
            }
            ((SeekableTransitionState) transitionState).T((CancellableContinuation) null);
            Unit unit = Unit.f40552a;
            mutex.e((Object) null);
            return Unit.f40552a;
        } catch (Throwable th) {
            mutex.e((Object) null);
            throw th;
        }
    }
}
