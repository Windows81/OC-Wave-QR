package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
@DebugMetadata(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", l = {79}, m = "invokeSuspend")
final class Profiling$registerForAllProfilingResults$1 extends SuspendLambda implements Function2<ProducerScope<? super ProfilingResult>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Context F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Profiling$registerForAllProfilingResults$1(Context context, Continuation continuation) {
        super(2, continuation);
        this.F = context;
    }

    public static final void D(ProducerScope producerScope, ProfilingResult profilingResult) {
        Intrinsics.h(profilingResult, "result");
        producerScope.L(profilingResult);
    }

    public static final void E(Runnable runnable) {
        runnable.run();
    }

    /* renamed from: C */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((Profiling$registerForAllProfilingResults$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        Profiling$registerForAllProfilingResults$1 profiling$registerForAllProfilingResults$1 = new Profiling$registerForAllProfilingResults$1(this.F, continuation);
        profiling$registerForAllProfilingResults$1.E = obj;
        return profiling$registerForAllProfilingResults$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            final e eVar = new e(producerScope);
            final ProfilingManager a2 = c.a(this.F.getSystemService(b.a()));
            a2.registerForAllProfilingResults(new f(), eVar);
            AnonymousClass2 r4 = new Function0<Unit>() {
                public final void invoke() {
                    a2.unregisterForAllProfilingResults(eVar);
                }
            };
            this.D = 1;
            if (ProduceKt.a(producerScope, r4, this) == f2) {
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
