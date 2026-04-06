package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", f = "ReportDrawn.kt", l = {159}, m = "invokeSuspend")
public final class ReportDrawnKt$ReportDrawnAfter$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ FullyDrawnReporter F;
    public final /* synthetic */ Function1 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1$1(FullyDrawnReporter fullyDrawnReporter, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.F = fullyDrawnReporter;
        this.G = function1;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Throwable th;
        FullyDrawnReporter fullyDrawnReporter;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.F;
            Function1 function1 = this.G;
            fullyDrawnReporter2.c();
            if (!fullyDrawnReporter2.e()) {
                try {
                    this.D = fullyDrawnReporter2;
                    this.E = 1;
                    if (function1.invoke(this) == f2) {
                        return f2;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th = th3;
                    fullyDrawnReporter.g();
                    throw th;
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            fullyDrawnReporter = (FullyDrawnReporter) this.D;
            try {
                ResultKt.b(obj);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fullyDrawnReporter.g();
        return Unit.f40552a;
    }
}
