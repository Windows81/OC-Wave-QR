package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
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
import kotlinx.coroutines.TimeoutKt;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1184, 1186}, m = "invokeSuspend")
public final class TooltipStateImpl$show$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ TooltipStateImpl E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ MutatePriority G;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1186}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(function12, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Function1 function1 = function12;
                this.D = 1;
                if (function1.invoke(this) == f2) {
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
    public TooltipStateImpl$show$2(TooltipStateImpl tooltipStateImpl, Function1 function1, MutatePriority mutatePriority, Continuation continuation) {
        super(1, continuation);
        this.E = tooltipStateImpl;
        this.F = function1;
        this.G = mutatePriority;
    }

    public final Continuation A(Continuation continuation) {
        return new TooltipStateImpl$show$2(this.E, this.F, this.G, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((TooltipStateImpl$show$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.E.f()) {
                Function1 function1 = this.F;
                this.D = 1;
                if (function1.invoke(this) == f2) {
                    return f2;
                }
            } else {
                final Function1 function12 = this.F;
                AnonymousClass1 r5 = new AnonymousClass1((Continuation) null);
                this.D = 2;
                if (TimeoutKt.c(1500, r5, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                if (this.G != MutatePriority.PreventUserInput) {
                    this.E.dismiss();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.G != MutatePriority.PreventUserInput) {
            this.E.dismiss();
        }
        return Unit.f40552a;
    }
}
