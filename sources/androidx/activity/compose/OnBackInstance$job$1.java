package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {121}, m = "invokeSuspend")
public final class OnBackInstance$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ OnBackPressedCallback F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ OnBackInstance H;

    @Metadata
    @DebugMetadata(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super BackEventCompat>, Throwable, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object d(FlowCollector flowCollector, Throwable th, Continuation continuation) {
            return new AnonymousClass1(booleanRef2, continuation).x(Unit.f40552a);
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                booleanRef2.f40901z = true;
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnBackInstance$job$1(OnBackPressedCallback onBackPressedCallback, Function2 function2, OnBackInstance onBackInstance, Continuation continuation) {
        super(2, continuation);
        this.F = onBackPressedCallback;
        this.G = function2;
        this.H = onBackInstance;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((OnBackInstance$job$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new OnBackInstance$job$1(this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Ref.BooleanRef booleanRef;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.F.g()) {
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Function2 function2 = this.G;
                Flow U = FlowKt.U(FlowKt.q(this.H.c()), new AnonymousClass1((Continuation) null));
                this.D = booleanRef2;
                this.E = 1;
                if (function2.m(U, this) == f2) {
                    return f2;
                }
                booleanRef = booleanRef2;
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            booleanRef = (Ref.BooleanRef) this.D;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!booleanRef.f40901z) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return Unit.f40552a;
    }
}
