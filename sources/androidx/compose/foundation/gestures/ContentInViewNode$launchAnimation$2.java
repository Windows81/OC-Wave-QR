package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {215}, m = "invokeSuspend")
public final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ContentInViewNode F;
    public final /* synthetic */ UpdatableAnimationState G;
    public final /* synthetic */ BringIntoViewSpec H;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {221}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(NestedScrollScope nestedScrollScope, Continuation continuation) {
            return ((AnonymousClass1) s(nestedScrollScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(updatableAnimationState, contentInViewNode, bringIntoViewSpec, k2, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.E;
                updatableAnimationState.j(contentInViewNode.j3(bringIntoViewSpec));
                final UpdatableAnimationState updatableAnimationState = updatableAnimationState;
                final ContentInViewNode contentInViewNode = contentInViewNode;
                final Job job = k2;
                AnonymousClass1 r3 = new Function1<Float, Unit>() {
                    public final void b(float f2) {
                        float f3 = contentInViewNode.P ? 1.0f : -1.0f;
                        ScrollingLogic d3 = contentInViewNode.O;
                        float F = f3 * d3.F(d3.y(nestedScrollScope.b(d3.y(d3.G(f3 * f2)), NestedScrollSource.f16795b.b())));
                        if (Math.abs(F) < Math.abs(f2)) {
                            Job job = job;
                            JobKt__JobKt.f(job, "Scroll animation cancelled because scroll was not consumed (" + F + " < " + f2 + ')', (Throwable) null, 2, (Object) null);
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b(((Number) obj).floatValue());
                        return Unit.f40552a;
                    }
                };
                final ContentInViewNode contentInViewNode2 = contentInViewNode;
                final UpdatableAnimationState updatableAnimationState2 = updatableAnimationState;
                final BringIntoViewSpec bringIntoViewSpec = bringIntoViewSpec;
                AnonymousClass2 r8 = new Function0<Unit>() {
                    public final void invoke() {
                        boolean z2;
                        boolean z3;
                        BringIntoViewRequestPriorityQueue a3 = contentInViewNode2.S;
                        ContentInViewNode contentInViewNode = contentInViewNode2;
                        while (true) {
                            z2 = true;
                            if (a3.f3399a.p() != 0) {
                                Rect rect = (Rect) ((ContentInViewNode.Request) a3.f3399a.s()).b().invoke();
                                if (rect == null) {
                                    z3 = true;
                                } else {
                                    z3 = ContentInViewNode.r3(contentInViewNode, rect, 0, 1, (Object) null);
                                }
                                if (!z3) {
                                    break;
                                }
                                ((ContentInViewNode.Request) a3.f3399a.y(a3.f3399a.p() - 1)).a().q(Result.b(Unit.f40552a));
                            } else {
                                break;
                            }
                        }
                        if (contentInViewNode2.U) {
                            Rect b3 = contentInViewNode2.o3();
                            if (b3 == null || !ContentInViewNode.r3(contentInViewNode2, b3, 0, 1, (Object) null)) {
                                z2 = false;
                            }
                            if (z2) {
                                contentInViewNode2.U = false;
                            }
                        }
                        updatableAnimationState2.j(contentInViewNode2.j3(bringIntoViewSpec));
                    }
                };
                this.D = 1;
                if (updatableAnimationState.h(r3, r8, this) == f2) {
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
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, Continuation continuation) {
        super(2, continuation);
        this.F = contentInViewNode;
        this.G = updatableAnimationState;
        this.H = bringIntoViewSpec;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ContentInViewNode$launchAnimation$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.F, this.G, this.H, continuation);
        contentInViewNode$launchAnimation$2.E = obj;
        return contentInViewNode$launchAnimation$2;
    }

    public final Object x(Object obj) {
        CancellationException cancellationException;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final Job k2 = JobKt.k(((CoroutineScope) this.E).getCoroutineContext());
            this.F.X = true;
            ScrollingLogic d3 = this.F.O;
            MutatePriority mutatePriority = MutatePriority.Default;
            final UpdatableAnimationState updatableAnimationState = this.G;
            final ContentInViewNode contentInViewNode = this.F;
            final BringIntoViewSpec bringIntoViewSpec = this.H;
            AnonymousClass1 r5 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (d3.z(mutatePriority, r5, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (CancellationException e2) {
                cancellationException = e2;
                throw cancellationException;
            } catch (Throwable th) {
                this.F.X = false;
                this.F.S.b(cancellationException);
                this.F.U = false;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.F.S.d();
        this.F.X = false;
        this.F.S.b((Throwable) null);
        this.F.U = false;
        return Unit.f40552a;
    }
}
