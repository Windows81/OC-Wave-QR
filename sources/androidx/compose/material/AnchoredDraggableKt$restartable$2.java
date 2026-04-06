package androidx.compose.material;

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
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
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
                /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object c(final java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r9
                        androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                        int r1 = r0.H
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.H = r1
                        goto L_0x0018
                    L_0x0013:
                        androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                        r0.<init>(r7, r9)
                    L_0x0018:
                        java.lang.Object r9 = r0.F
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.H
                        r3 = 1
                        if (r2 == 0) goto L_0x003b
                        if (r2 != r3) goto L_0x0033
                        java.lang.Object r8 = r0.E
                        kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                        java.lang.Object r8 = r0.D
                        java.lang.Object r0 = r0.C
                        androidx.compose.material.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1) r0
                        kotlin.ResultKt.b(r9)
                        goto L_0x005e
                    L_0x0033:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L_0x003b:
                        kotlin.ResultKt.b(r9)
                        kotlin.jvm.internal.Ref$ObjectRef r9 = r1
                        java.lang.Object r9 = r9.f40908z
                        kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
                        if (r9 == 0) goto L_0x005d
                        androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                        r2.<init>()
                        r9.c(r2)
                        r0.C = r7
                        r0.D = r8
                        r0.E = r9
                        r0.H = r3
                        java.lang.Object r9 = r9.D(r0)
                        if (r9 != r1) goto L_0x005d
                        return r1
                    L_0x005d:
                        r0 = r7
                    L_0x005e:
                        kotlin.jvm.internal.Ref$ObjectRef r9 = r1
                        kotlinx.coroutines.CoroutineScope r1 = r7
                        kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2
                        kotlin.jvm.functions.Function2 r0 = r5
                        r2 = 0
                        r4.<init>(r0, r8, r1, r2)
                        r5 = 1
                        r6 = 0
                        kotlinx.coroutines.Job r8 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r1, r2, r3, r4, r5, r6)
                        r9.f40908z = r8
                        kotlin.Unit r8 = kotlin.Unit.f40552a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
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
