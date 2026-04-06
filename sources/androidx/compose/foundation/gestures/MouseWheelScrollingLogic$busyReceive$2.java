package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {170}, m = "invokeSuspend")
public final class MouseWheelScrollingLogic$busyReceive$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MouseWheelScrollingLogic.MouseWheelScrollDelta>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Channel F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$busyReceive$2(Channel channel, Continuation continuation) {
        super(2, continuation);
        this.F = channel;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MouseWheelScrollingLogic$busyReceive$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$busyReceive$2 mouseWheelScrollingLogic$busyReceive$2 = new MouseWheelScrollingLogic$busyReceive$2(this.F, continuation);
        mouseWheelScrollingLogic$busyReceive$2.E = obj;
        return mouseWheelScrollingLogic$busyReceive$2;
    }

    public final Object x(Object obj) {
        Throwable th;
        Job job;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Job d2 = BuildersKt__Builders_commonKt.d((CoroutineScope) this.E, (CoroutineContext) null, (CoroutineStart) null, new MouseWheelScrollingLogic$busyReceive$2$job$1((Continuation) null), 3, (Object) null);
            try {
                Channel channel = this.F;
                this.E = d2;
                this.D = 1;
                Object v2 = channel.v(this);
                if (v2 == f2) {
                    return f2;
                }
                job = d2;
                obj = v2;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                job = d2;
                th = th3;
                Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
                throw th;
            }
        } else if (i2 == 1) {
            job = (Job) this.E;
            try {
                ResultKt.b(obj);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
        Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        return mouseWheelScrollDelta;
    }
}
