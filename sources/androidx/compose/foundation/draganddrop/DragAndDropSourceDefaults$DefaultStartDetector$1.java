package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
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

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", l = {33}, m = "invokeSuspend")
public final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends SuspendLambda implements Function2<DragAndDropStartDetectorScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;

    public DragAndDropSourceDefaults$DefaultStartDetector$1(Continuation continuation) {
        super(2, continuation);
    }

    /* renamed from: A */
    public final Object m(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, Continuation continuation) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) s(dragAndDropStartDetectorScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(continuation);
        dragAndDropSourceDefaults$DefaultStartDetector$1.E = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (DragAndDropStartDetectorScope) this.E;
            AnonymousClass1 r5 = new Function1<Offset, Unit>() {
                public final void b(long j2) {
                    dragAndDropStartDetectorScope.x(j2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((Offset) obj).t());
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (TapGestureDetectorKt.m(dragAndDropStartDetectorScope, (Function1) null, r5, (Function3) null, (Function1) null, this, 13, (Object) null) == f2) {
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
