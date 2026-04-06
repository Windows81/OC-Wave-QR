package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {1172}, m = "invokeSuspend")
public final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AnchoredDraggableState E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Function4 G;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {1174}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends DraggableAnchors<T>, ? extends T>, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(Pair pair, Continuation continuation) {
            return ((AnonymousClass2) s(pair, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(function4, anchoredDraggableState2, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Pair pair = (Pair) this.E;
                Object b2 = pair.b();
                Function4 function4 = function4;
                AnchoredDraggableState$anchoredDragScope$1 a2 = anchoredDraggableState2.f3370o;
                this.D = 1;
                if (function4.j(a2, (DraggableAnchors) pair.a(), b2, this) == f2) {
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
    public AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState anchoredDraggableState, Object obj, Function4 function4, Continuation continuation) {
        super(1, continuation);
        this.E = anchoredDraggableState;
        this.F = obj;
        this.G = function4;
    }

    public final Continuation A(Continuation continuation) {
        return new AnchoredDraggableState$anchoredDrag$4(this.E, this.F, this.G, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((AnchoredDraggableState$anchoredDrag$4) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.E.E(this.F);
            final AnchoredDraggableState anchoredDraggableState = this.E;
            AnonymousClass1 r7 = new Function0<Pair<? extends DraggableAnchors<T>, ? extends T>>() {
                /* renamed from: b */
                public final Pair invoke() {
                    return TuplesKt.a(anchoredDraggableState.l(), anchoredDraggableState.v());
                }
            };
            final Function4 function4 = this.G;
            final AnchoredDraggableState anchoredDraggableState2 = this.E;
            AnonymousClass2 r1 = new AnonymousClass2((Continuation) null);
            this.D = 1;
            if (AnchoredDraggableKt.r(r7, r1, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) this.E.m().invoke(this.F)).booleanValue()) {
            this.E.f3370o.a(this.E.l().c(this.F), this.E.q());
            this.E.I(this.F);
            this.E.C(this.F);
        }
        return Unit.f40552a;
    }
}
