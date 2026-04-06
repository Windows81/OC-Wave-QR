package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {502, 504}, m = "invokeSuspend")
public final class TapGestureDetectorKt$launchAwaitingReset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Job F;
    public final /* synthetic */ Function2 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$launchAwaitingReset$1(Job job, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = job;
        this.G = function2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TapGestureDetectorKt$launchAwaitingReset$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TapGestureDetectorKt$launchAwaitingReset$1 tapGestureDetectorKt$launchAwaitingReset$1 = new TapGestureDetectorKt$launchAwaitingReset$1(this.F, this.G, continuation);
        tapGestureDetectorKt$launchAwaitingReset$1.E = obj;
        return tapGestureDetectorKt$launchAwaitingReset$1;
    }

    public final Object x(Object obj) {
        CoroutineScope coroutineScope;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.E;
            if (ComposeFoundationFlags.f3046d) {
                Job job = this.F;
                this.E = coroutineScope;
                this.D = 1;
                if (job.D(this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            coroutineScope = (CoroutineScope) this.E;
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Function2 function2 = this.G;
        this.E = null;
        this.D = 2;
        if (function2.m(coroutineScope, this) == f2) {
            return f2;
        }
        return Unit.f40552a;
    }
}
