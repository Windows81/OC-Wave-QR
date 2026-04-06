package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {434, 436}, m = "invokeSuspend")
public final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AnchoredDraggableNode E;
    public final /* synthetic */ long F;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {438}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
        public int D;
        public /* synthetic */ long E;

        public final Object A(long j2, Continuation continuation) {
            return ((AnonymousClass1) s(Velocity.b(j2), continuation)).x(Unit.f40552a);
        }

        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return A(((Velocity) obj).o(), (Continuation) obj2);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(anchoredDraggableNode3, continuation);
            r0.E = ((Velocity) obj).o();
            return r0;
        }

        public final Object x(Object obj) {
            long j2;
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                long j3 = this.E;
                AnchoredDraggableNode anchoredDraggableNode = anchoredDraggableNode3;
                float G3 = anchoredDraggableNode.Q3(j3);
                this.E = j3;
                this.D = 1;
                obj = anchoredDraggableNode.K3(G3, this);
                if (obj == f2) {
                    return f2;
                }
                j2 = j3;
            } else if (i2 == 1) {
                j2 = this.E;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float floatValue = ((Number) obj).floatValue();
            float A2 = anchoredDraggableNode3.Y.A();
            float e2 = anchoredDraggableNode3.Y.l().e();
            if (A2 >= anchoredDraggableNode3.Y.l().f() || A2 <= e2) {
                j2 = anchoredDraggableNode3.T3(floatValue);
            }
            return Velocity.b(j2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode anchoredDraggableNode, long j2, Continuation continuation) {
        super(2, continuation);
        this.E = anchoredDraggableNode;
        this.F = j2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnchoredDraggableNode$onDragStopped$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AnchoredDraggableNode$onDragStopped$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnchoredDraggableNode anchoredDraggableNode = this.E;
            float G3 = anchoredDraggableNode.Q3(anchoredDraggableNode.N3(this.F));
            if (this.E.b0 == null) {
                AnchoredDraggableNode anchoredDraggableNode2 = this.E;
                this.D = 1;
                if (anchoredDraggableNode2.K3(G3, this) == f2) {
                    return f2;
                }
            } else {
                OverscrollEffect C3 = this.E.b0;
                Intrinsics.f(C3);
                long J3 = this.E.T3(G3);
                final AnchoredDraggableNode anchoredDraggableNode3 = this.E;
                AnonymousClass1 r8 = new AnonymousClass1((Continuation) null);
                this.D = 2;
                if (C3.O(J3, r8, this) == f2) {
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
