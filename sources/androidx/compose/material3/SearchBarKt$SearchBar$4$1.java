package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1", f = "SearchBar.kt", l = {570}, m = "invokeSuspend")
final class SearchBarKt$SearchBar$4$1 extends SuspendLambda implements Function2<Flow<? extends BackEventCompat>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ MutatorMutex F;
    public final /* synthetic */ MutableFloatState G;
    public final /* synthetic */ Animatable H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ CoroutineScope J;
    public final /* synthetic */ MutableState K;
    public final /* synthetic */ MutableState L;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1", f = "SearchBar.kt", l = {573}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int D;

        public final Continuation A(Continuation continuation) {
            return new AnonymousClass1(mutableFloatState, flow, animatable, function1, coroutineScope, mutableState, mutableState2, continuation);
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
                mutableFloatState.j(Float.NaN);
                Flow flow = flow;
                final MutableState mutableState = mutableState;
                final MutableState mutableState2 = mutableState2;
                final Animatable animatable = animatable;
                AnonymousClass1 r1 = new FlowCollector() {
                    /* renamed from: a */
                    public final Object c(BackEventCompat backEventCompat, Continuation continuation) {
                        if (mutableState.getValue() == null) {
                            mutableState.setValue(backEventCompat);
                        }
                        mutableState2.setValue(backEventCompat);
                        Object t2 = animatable.t(Boxing.b(((float) 1) - PredictiveBack.f12315a.a(backEventCompat.a())), continuation);
                        return t2 == IntrinsicsKt.f() ? t2 : Unit.f40552a;
                    }
                };
                this.D = 1;
                if (flow.a(r1, this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                try {
                    ResultKt.b(obj);
                } catch (CancellationException unused) {
                    CoroutineScope coroutineScope = coroutineScope;
                    final Animatable animatable2 = animatable;
                    final MutableFloatState mutableFloatState = mutableFloatState;
                    final MutableState mutableState3 = mutableState;
                    final MutableState mutableState4 = mutableState2;
                    Job unused2 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation) null) {
                        public int D;

                        /* renamed from: A */
                        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                            return ((AnonymousClass2) s(coroutineScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            return 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public SearchBarKt$SearchBar$4$1(MutatorMutex mutatorMutex, MutableFloatState mutableFloatState, Animatable animatable, Function1 function1, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
                                super(2, continuation);
                                this.F = mutatorMutex;
                                this.G = mutableFloatState;
                                this.H = animatable;
                                this.I = function1;
                                this.J = coroutineScope;
                                this.K = mutableState;
                                this.L = mutableState2;
                            }

                            /* renamed from: A */
                            public final Object m(Flow flow, Continuation continuation) {
                                return ((SearchBarKt$SearchBar$4$1) s(flow, continuation)).x(Unit.f40552a);
                            }

                            public final Continuation s(Object obj, Continuation continuation) {
                                SearchBarKt$SearchBar$4$1 searchBarKt$SearchBar$4$1 = new SearchBarKt$SearchBar$4$1(this.F, this.G, this.H, this.I, this.J, this.K, this.L, continuation);
                                searchBarKt$SearchBar$4$1.E = obj;
                                return searchBarKt$SearchBar$4$1;
                            }

                            public final Object x(Object obj) {
                                Object f2 = IntrinsicsKt.f();
                                int i2 = this.D;
                                if (i2 == 0) {
                                    ResultKt.b(obj);
                                    final Flow flow = (Flow) this.E;
                                    MutatorMutex mutatorMutex = this.F;
                                    final MutableFloatState mutableFloatState = this.G;
                                    final Animatable animatable = this.H;
                                    final Function1 function1 = this.I;
                                    final CoroutineScope coroutineScope = this.J;
                                    final MutableState mutableState = this.K;
                                    final MutableState mutableState2 = this.L;
                                    AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
                                    this.D = 1;
                                    if (MutatorMutex.e(mutatorMutex, (MutatePriority) null, r3, this, 1, (Object) null) == f2) {
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
