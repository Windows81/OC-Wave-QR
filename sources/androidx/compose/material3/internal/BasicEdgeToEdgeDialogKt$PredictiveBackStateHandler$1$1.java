package androidx.compose.material3.internal;

import androidx.activity.BackEventCompat;
import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.State;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1", f = "BasicEdgeToEdgeDialog.kt", l = {100}, m = "invokeSuspend")
public final class BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 extends SuspendLambda implements Function2<Flow<? extends BackEventCompat>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PredictiveBackState F;
    public final /* synthetic */ State G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(PredictiveBackState predictiveBackState, State state, Continuation continuation) {
        super(2, continuation);
        this.F = predictiveBackState;
        this.G = state;
    }

    /* renamed from: A */
    public final Object m(Flow flow, Continuation continuation) {
        return ((BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1) s(flow, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 = new BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(this.F, this.G, continuation);
        basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.E = obj;
        return basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Flow flow = (Flow) this.E;
            final PredictiveBackState predictiveBackState = this.F;
            AnonymousClass1 r1 = new FlowCollector() {
                /* renamed from: a */
                public final Object c(BackEventCompat backEventCompat, Continuation continuation) {
                    PredictiveBackStateImpl predictiveBackStateImpl = (PredictiveBackStateImpl) predictiveBackState;
                    float c2 = backEventCompat.c();
                    float d2 = backEventCompat.d();
                    float a2 = backEventCompat.a();
                    int b2 = backEventCompat.b();
                    predictiveBackStateImpl.a(new BackEventProgress.InProgress(c2, d2, a2, b2 != 0 ? b2 != 1 ? SwipeEdge.None : SwipeEdge.Right : SwipeEdge.Left));
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (flow.a(r1, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (CancellationException e2) {
                ((PredictiveBackStateImpl) this.F).a(BackEventProgress.NotRunning.f12156a);
                throw e2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((PredictiveBackStateImpl) this.F).a(BackEventProgress.Completed.f12151a);
        BasicEdgeToEdgeDialogKt.c(this.G).invoke();
        return Unit.f40552a;
    }
}
