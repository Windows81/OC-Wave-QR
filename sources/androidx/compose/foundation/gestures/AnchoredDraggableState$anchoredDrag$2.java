package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {1125}, m = "invokeSuspend")
public final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AnchoredDraggableState E;
    public final /* synthetic */ Function3 F;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {1126}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<DraggableAnchors<T>, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(DraggableAnchors draggableAnchors, Continuation continuation) {
            return ((AnonymousClass2) s(draggableAnchors, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(function3, anchoredDraggableState2, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Function3 function3 = function3;
                AnchoredDraggableState$anchoredDragScope$1 a2 = anchoredDraggableState2.f3370o;
                this.D = 1;
                if (function3.d(a2, (DraggableAnchors) this.E, this) == f2) {
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
    public AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState anchoredDraggableState, Function3 function3, Continuation continuation) {
        super(1, continuation);
        this.E = anchoredDraggableState;
        this.F = function3;
    }

    public final Continuation A(Continuation continuation) {
        return new AnchoredDraggableState$anchoredDrag$2(this.E, this.F, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((AnchoredDraggableState$anchoredDrag$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final AnchoredDraggableState anchoredDraggableState = this.E;
            AnonymousClass1 r7 = new Function0<DraggableAnchors<T>>() {
                /* renamed from: b */
                public final DraggableAnchors invoke() {
                    return anchoredDraggableState.l();
                }
            };
            final Function3 function3 = this.F;
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
        Object b2 = this.E.l().b(this.E.r());
        if (b2 != null) {
            if (Math.abs(this.E.r() - this.E.l().c(b2)) < 0.5f && ((Boolean) this.E.m().invoke(b2)).booleanValue()) {
                this.E.I(b2);
                this.E.C(b2);
            }
        }
        return Unit.f40552a;
    }
}
