package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Flow F;
    public final /* synthetic */ CompletableDeferred G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(Flow flow, CompletableDeferred completableDeferred, Continuation continuation) {
        super(2, continuation);
        this.F = flow;
        this.G = completableDeferred;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.F, this.G, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.E = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    public final Object x(Object obj) {
        Ref.ObjectRef objectRef;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.E;
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Flow flow = this.F;
            final CompletableDeferred completableDeferred = this.G;
            AnonymousClass1 r4 = new FlowCollector() {
                public final Object c(Object obj, Continuation continuation) {
                    Ref.ObjectRef objectRef = objectRef2;
                    MutableStateFlow mutableStateFlow = (MutableStateFlow) objectRef.f40908z;
                    if (mutableStateFlow != null) {
                        mutableStateFlow.setValue(obj);
                    } else {
                        CoroutineScope coroutineScope = coroutineScope;
                        CompletableDeferred completableDeferred = completableDeferred;
                        MutableStateFlow a2 = StateFlowKt.a(obj);
                        Result.Companion companion = Result.f40519A;
                        completableDeferred.c0(Result.a(Result.b(new ReadonlyStateFlow(a2, JobKt.k(coroutineScope.getCoroutineContext())))));
                        objectRef.f40908z = a2;
                    }
                    return Unit.f40552a;
                }
            };
            this.E = objectRef2;
            this.D = 1;
            if (flow.a(r4, this) == f2) {
                return f2;
            }
            objectRef = objectRef2;
        } else if (i2 == 1) {
            objectRef = (Ref.ObjectRef) this.E;
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                this.G.j(th);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (objectRef.f40908z == null) {
            CompletableDeferred completableDeferred2 = this.G;
            Result.Companion companion = Result.f40519A;
            completableDeferred2.c0(Result.a(Result.b(ResultKt.a(new NoSuchElementException("Flow is empty")))));
        }
        return Unit.f40552a;
    }
}
