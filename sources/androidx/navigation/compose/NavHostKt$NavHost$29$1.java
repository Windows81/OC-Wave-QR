package androidx.navigation.compose;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {628, 635}, m = "invokeSuspend")
public final class NavHostKt$NavHost$29$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ SeekableTransitionState F;
    public final /* synthetic */ NavBackStackEntry G;
    public final /* synthetic */ Transition H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, Transition transition, Continuation continuation) {
        super(2, continuation);
        this.F = seekableTransitionState;
        this.G = navBackStackEntry;
        this.H = transition;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NavHostKt$NavHost$29$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(this.F, this.G, this.H, continuation);
        navHostKt$NavHost$29$1.E = obj;
        return navHostKt$NavHost$29$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.E;
            if (!Intrinsics.d(this.F.a(), this.G)) {
                SeekableTransitionState seekableTransitionState = this.F;
                NavBackStackEntry navBackStackEntry = this.G;
                this.D = 1;
                if (SeekableTransitionState.C(seekableTransitionState, navBackStackEntry, (FiniteAnimationSpec) null, this, 2, (Object) null) == f2) {
                    return f2;
                }
            } else {
                long r2 = this.H.r() / ((long) 1000000);
                float I = this.F.I();
                TweenSpec n2 = AnimationSpecKt.n((int) (this.F.I() * ((float) r2)), 0, (Easing) null, 6, (Object) null);
                final SeekableTransitionState seekableTransitionState2 = this.F;
                final NavBackStackEntry navBackStackEntry2 = this.G;
                AnonymousClass1 r9 = new Function2<Float, Float, Unit>() {

                    @Metadata
                    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {643, 647}, m = "invokeSuspend")
                    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1  reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int D;

                        /* renamed from: A */
                        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            return new AnonymousClass1(f2, seekableTransitionState, navBackStackEntry, continuation);
                        }

                        public final Object x(Object obj) {
                            Object f2 = IntrinsicsKt.f();
                            int i2 = this.D;
                            if (i2 == 0) {
                                ResultKt.b(obj);
                                float f3 = f2;
                                if (f3 > 0.0f) {
                                    SeekableTransitionState seekableTransitionState = seekableTransitionState;
                                    this.D = 1;
                                    if (SeekableTransitionState.Q(seekableTransitionState, f3, (Object) null, this, 2, (Object) null) == f2) {
                                        return f2;
                                    }
                                }
                            } else if (i2 == 1) {
                                ResultKt.b(obj);
                            } else if (i2 == 2) {
                                ResultKt.b(obj);
                                return Unit.f40552a;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            if (f2 == 0.0f) {
                                SeekableTransitionState seekableTransitionState2 = seekableTransitionState;
                                NavBackStackEntry navBackStackEntry = navBackStackEntry;
                                this.D = 2;
                                if (seekableTransitionState2.X(navBackStackEntry, this) == f2) {
                                    return f2;
                                }
                            }
                            return Unit.f40552a;
                        }
                    }

                    public final void b(final float f2, float f3) {
                        CoroutineScope coroutineScope = coroutineScope;
                        final SeekableTransitionState seekableTransitionState = seekableTransitionState2;
                        final NavBackStackEntry navBackStackEntry = navBackStackEntry2;
                        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
                    }

                    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                        b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                        return Unit.f40552a;
                    }
                };
                this.D = 2;
                if (SuspendAnimationKt.e(I, 0.0f, 0.0f, n2, r9, this, 4, (Object) null) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
