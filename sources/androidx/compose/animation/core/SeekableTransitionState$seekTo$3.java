package androidx.compose.animation.core;

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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {488}, m = "invokeSuspend")
public final class SeekableTransitionState$seekTo$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ SeekableTransitionState G;
    public final /* synthetic */ Transition H;
    public final /* synthetic */ float I;

    @Metadata
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {510}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(obj2, obj3, seekableTransitionState, transition, f3, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.E;
                if (!Intrinsics.d(obj2, obj3)) {
                    seekableTransitionState.K();
                } else {
                    seekableTransitionState.f2655n = null;
                    if (Intrinsics.d(seekableTransitionState.a(), obj2)) {
                        return Unit.f40552a;
                    }
                }
                if (!Intrinsics.d(obj2, obj3)) {
                    transition.R(obj2);
                    transition.J(0);
                    seekableTransitionState.V(obj2);
                    transition.F(f3);
                }
                seekableTransitionState.U(f3);
                if (seekableTransitionState.f2654m.h()) {
                    final SeekableTransitionState seekableTransitionState = seekableTransitionState;
                    Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation) null) {
                        public int D;

                        /* renamed from: A */
                        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            return 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public SeekableTransitionState$seekTo$3(Object obj, Object obj2, SeekableTransitionState seekableTransitionState, Transition transition, float f2, Continuation continuation) {
                                super(1, continuation);
                                this.E = obj;
                                this.F = obj2;
                                this.G = seekableTransitionState;
                                this.H = transition;
                                this.I = f2;
                            }

                            public final Continuation A(Continuation continuation) {
                                return new SeekableTransitionState$seekTo$3(this.E, this.F, this.G, this.H, this.I, continuation);
                            }

                            /* renamed from: B */
                            public final Object invoke(Continuation continuation) {
                                return ((SeekableTransitionState$seekTo$3) A(continuation)).x(Unit.f40552a);
                            }

                            public final Object x(Object obj) {
                                Object f2 = IntrinsicsKt.f();
                                int i2 = this.D;
                                if (i2 == 0) {
                                    ResultKt.b(obj);
                                    final Object obj2 = this.E;
                                    final Object obj3 = this.F;
                                    final SeekableTransitionState seekableTransitionState = this.G;
                                    final Transition transition = this.H;
                                    final float f3 = this.I;
                                    AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
                                    this.D = 1;
                                    if (CoroutineScopeKt.f(r3, this) == f2) {
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
