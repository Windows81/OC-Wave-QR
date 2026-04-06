package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {196}, m = "invokeSuspend")
public final class PullRefreshState$animateIndicatorTo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ PullRefreshState E;
    public final /* synthetic */ float F;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {197}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int D;

        public final Continuation A(Continuation continuation) {
            return new AnonymousClass1(pullRefreshState, f3, continuation);
        }

        /* renamed from: B */
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass1) A(continuation)).x(Unit.f40552a);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                float c2 = pullRefreshState.m();
                float f3 = f3;
                final PullRefreshState pullRefreshState = pullRefreshState;
                AnonymousClass1 r7 = new Function2<Float, Float, Unit>() {
                    public final void b(float f2, float f3) {
                        pullRefreshState.w(f2);
                    }

                    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                        b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                        return Unit.f40552a;
                    }
                };
                this.D = 1;
                if (SuspendAnimationKt.e(c2, f3, 0.0f, (AnimationSpec) null, r7, this, 12, (Object) null) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshState$animateIndicatorTo$1(PullRefreshState pullRefreshState, float f2, Continuation continuation) {
        super(2, continuation);
        this.E = pullRefreshState;
        this.F = f2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PullRefreshState$animateIndicatorTo$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PullRefreshState$animateIndicatorTo$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutatorMutex b2 = this.E.f9043i;
            final PullRefreshState pullRefreshState = this.E;
            final float f3 = this.F;
            AnonymousClass1 r5 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (MutatorMutex.e(b2, (MutatePriority) null, r5, this, 1, (Object) null) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
