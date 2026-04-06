package androidx.compose.material3.internal;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {708}, m = "invokeSuspend")
public final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function2 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2(Function0 function0, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
        this.G = function2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnchoredDraggableKt$restartable$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.F, this.G, continuation);
        anchoredDraggableKt$restartable$2.E = obj;
        return anchoredDraggableKt$restartable$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.E;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Flow q2 = SnapshotStateKt.q(this.F);
            final Function2 function2 = this.G;
            AnonymousClass1 r4 = new FlowCollector() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object c(final java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                        int r1 = r0.G
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.G = r1
                        goto L_0x0018
                    L_0x0013:
                        androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.E
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.G
                        r3 = 1
                        if (r2 == 0) goto L_0x0037
                        if (r2 != r3) goto L_0x002f
                        java.lang.Object r7 = r0.D
                        kotlinx.coroutines.Job r7 = (kotlinx.coroutines.Job) r7
                        java.lang.Object r7 = r0.C
                        kotlin.ResultKt.b(r8)
                        goto L_0x0057
                    L_0x002f:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0037:
                        kotlin.ResultKt.b(r8)
                        kotlin.jvm.internal.Ref$ObjectRef r8 = r1
                        java.lang.Object r8 = r8.f40908z
                        kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                        if (r8 == 0) goto L_0x0057
                        androidx.compose.material3.internal.AnchoredDragFinishedSignal r2 = new androidx.compose.material3.internal.AnchoredDragFinishedSignal
                        r2.<init>()
                        r8.c(r2)
                        r0.C = r7
                        r0.D = r8
                        r0.G = r3
                        java.lang.Object r8 = r8.D(r0)
                        if (r8 != r1) goto L_0x0057
                        return r1
                    L_0x0057:
                        kotlin.jvm.internal.Ref$ObjectRef r8 = r1
                        kotlinx.coroutines.CoroutineScope r0 = r7
                        kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2 r3 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2
                        kotlin.jvm.functions.Function2 r1 = r5
                        r4 = 0
                        r3.<init>(r1, r7, r0, r4)
                        r4 = 1
                        r5 = 0
                        r1 = 0
                        kotlinx.coroutines.Job r7 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r0, r1, r2, r3, r4, r5)
                        r8.f40908z = r7
                        kotlin.Unit r7 = kotlin.Unit.f40552a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2.AnonymousClass1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.D = 1;
            if (q2.a(r4, this) == f2) {
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
