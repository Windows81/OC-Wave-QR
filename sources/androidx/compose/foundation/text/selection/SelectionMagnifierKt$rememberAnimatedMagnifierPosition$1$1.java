package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {85}, m = "invokeSuspend")
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ State F;
    public final /* synthetic */ Animatable G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(State state, Animatable animatable, Continuation continuation) {
        super(2, continuation);
        this.F = state;
        this.G = animatable;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.F, this.G, continuation);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.E = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.E;
            final State state = this.F;
            Flow q2 = SnapshotStateKt.q(new Function0<Offset>() {
                public final long b() {
                    return SelectionMagnifierKt.i(state);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return Offset.d(b());
                }
            });
            final Animatable animatable = this.G;
            AnonymousClass2 r3 = new FlowCollector() {

                @Metadata
                @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {98}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1  reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int D;

                    /* renamed from: A */
                    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        return new AnonymousClass1(animatable, j2, continuation);
                    }

                    public final Object x(Object obj) {
                        Object f2 = IntrinsicsKt.f();
                        int i2 = this.D;
                        if (i2 == 0) {
                            ResultKt.b(obj);
                            Animatable animatable = animatable;
                            Offset d2 = Offset.d(j2);
                            SpringSpec e2 = SelectionMagnifierKt.e();
                            this.D = 1;
                            if (Animatable.f(animatable, d2, e2, (Object) null, (Function1) null, this, 12, (Object) null) == f2) {
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

                public final Object a(final long j2, Continuation continuation) {
                    if ((((Offset) animatable.m()).t() & 9223372034707292159L) == 9205357640488583168L || (j2 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((Offset) animatable.m()).t() & 4294967295L)) == Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                        Object t2 = animatable.t(Offset.d(j2), continuation);
                        return t2 == IntrinsicsKt.f() ? t2 : Unit.f40552a;
                    }
                    CoroutineScope coroutineScope = coroutineScope;
                    final Animatable animatable = animatable;
                    Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
                    return Unit.f40552a;
                }

                public /* bridge */ /* synthetic */ Object c(Object obj, Continuation continuation) {
                    return a(((Offset) obj).t(), continuation);
                }
            };
            this.D = 1;
            if (q2.a(r3, this) == f2) {
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
