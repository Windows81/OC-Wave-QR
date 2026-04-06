package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {408}, m = "invokeSuspend")
public final class AnchoredDraggableNode$drag$2 extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ AnchoredDraggableNode G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(Function2 function2, AnchoredDraggableNode anchoredDraggableNode, Continuation continuation) {
        super(3, continuation);
        this.F = function2;
        this.G = anchoredDraggableNode;
    }

    /* renamed from: A */
    public final Object d(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Continuation continuation) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.F, this.G, continuation);
        anchoredDraggableNode$drag$2.E = anchoredDragScope;
        return anchoredDraggableNode$drag$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.E;
            Function2 function2 = this.F;
            final AnchoredDraggableNode anchoredDraggableNode = this.G;
            AnonymousClass1 r3 = new Function1<DragEvent.DragDelta, Unit>() {
                public final void b(DragEvent.DragDelta dragDelta) {
                    AnchoredDraggableNode anchoredDraggableNode = anchoredDraggableNode;
                    float H3 = anchoredDraggableNode.R3(anchoredDraggableNode.O3(dragDelta.a()));
                    if (anchoredDraggableNode.b0 == null) {
                        AnchoredDragScope.b(anchoredDragScope, anchoredDraggableNode.Y.z(H3), 0.0f, 2, (Object) null);
                        return;
                    }
                    OverscrollEffect C3 = anchoredDraggableNode.b0;
                    Intrinsics.f(C3);
                    long I3 = anchoredDraggableNode.S3(H3);
                    int b2 = NestedScrollSource.f16795b.b();
                    final AnchoredDraggableNode anchoredDraggableNode2 = anchoredDraggableNode;
                    final AnchoredDragScope anchoredDragScope = anchoredDragScope;
                    C3.N(I3, b2, new Function1<Offset, Offset>() {
                        public final long b(long j2) {
                            float z2 = anchoredDraggableNode2.Y.z(anchoredDraggableNode2.R3(j2));
                            AnchoredDraggableNode anchoredDraggableNode = anchoredDraggableNode2;
                            long I3 = anchoredDraggableNode.S3(z2 - anchoredDraggableNode.Y.A());
                            AnchoredDragScope.b(anchoredDragScope, z2, 0.0f, 2, (Object) null);
                            return I3;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return Offset.d(b(((Offset) obj).t()));
                        }
                    });
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((DragEvent.DragDelta) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (function2.m(r3, this) == f2) {
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
