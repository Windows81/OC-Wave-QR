package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", l = {154}, m = "invokeSuspend")
public final class CursorAnchorInfoController$startOrStopMonitoring$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ CursorAnchorInfoController E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CursorAnchorInfoController$startOrStopMonitoring$1(CursorAnchorInfoController cursorAnchorInfoController, Continuation continuation) {
        super(2, continuation);
        this.E = cursorAnchorInfoController;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CursorAnchorInfoController$startOrStopMonitoring$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new CursorAnchorInfoController$startOrStopMonitoring$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CursorAnchorInfoController cursorAnchorInfoController = this.E;
            Flow C = FlowKt.C(FlowKt.w(SnapshotStateKt.q(new Function0<CursorAnchorInfo>() {
                /* renamed from: b */
                public final CursorAnchorInfo invoke() {
                    return cursorAnchorInfoController.c();
                }
            }), 1));
            final CursorAnchorInfoController cursorAnchorInfoController2 = this.E;
            AnonymousClass2 r1 = new FlowCollector() {
                /* renamed from: a */
                public final Object c(CursorAnchorInfo cursorAnchorInfo, Continuation continuation) {
                    cursorAnchorInfoController2.f6162c.d(cursorAnchorInfo);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (C.a(r1, this) == f2) {
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
