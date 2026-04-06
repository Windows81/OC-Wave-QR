package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class Transition$animateTo$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Transition f2736A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f2737z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1192}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public float D;
        public int E;
        public /* synthetic */ Object F;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(transition, continuation);
            r0.F = obj;
            return r0;
        }

        public final Object x(Object obj) {
            CoroutineScope coroutineScope;
            final float f2;
            Object f3 = IntrinsicsKt.f();
            int i2 = this.E;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.F;
                f2 = SuspendAnimationKt.o(coroutineScope2.getCoroutineContext());
                coroutineScope = coroutineScope2;
            } else if (i2 == 1) {
                f2 = this.D;
                coroutineScope = (CoroutineScope) this.F;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (CoroutineScopeKt.h(coroutineScope)) {
                final Transition transition = transition;
                AnonymousClass1 r6 = new Function1<Long, Unit>() {
                    public final void b(long j2) {
                        if (!transition.v()) {
                            transition.y(j2, f2);
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b(((Number) obj).longValue());
                        return Unit.f40552a;
                    }
                };
                this.F = coroutineScope;
                this.D = f2;
                this.E = 1;
                if (MonotonicFrameClockKt.c(r6, this) == f3) {
                    return f3;
                }
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(CoroutineScope coroutineScope, Transition transition) {
        super(1);
        this.f2737z = coroutineScope;
        this.f2736A = transition;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        CoroutineScope coroutineScope = this.f2737z;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        final Transition transition = this.f2736A;
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass1((Continuation) null), 1, (Object) null);
        return new Transition$animateTo$1$1$invoke$$inlined$onDispose$1();
    }
}
