package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
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

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Recomposer E;
    public final /* synthetic */ ControlledComposition F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(Recomposer recomposer, ControlledComposition controlledComposition, Continuation continuation) {
        super(2, continuation);
        this.E = recomposer;
        this.F = controlledComposition;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        CancellableContinuation F2;
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            ControlledComposition Z = this.E.L0(this.F, (MutableScatterSet) null);
            Object T = this.E.f14792c;
            Recomposer recomposer = this.E;
            synchronized (T) {
                if (Z != null) {
                    try {
                        recomposer.f14799j.add(Z);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                recomposer.f14808s = recomposer.f14808s - 1;
                F2 = recomposer.s0();
            }
            if (F2 != null) {
                Result.Companion companion = Result.f40519A;
                F2.q(Result.b(Unit.f40552a));
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
