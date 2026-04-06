package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

@Metadata
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21955A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f21956B;
    public final /* synthetic */ Lifecycle.Event C;
    public final /* synthetic */ CancellableContinuation D;
    public final /* synthetic */ Mutex E;
    public final /* synthetic */ Function2 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Lifecycle.Event f21957z;

    @Metadata
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object D;
        public Object E;
        public int F;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(mutex, function2, continuation);
        }

        public final Object x(Object obj) {
            Throwable th;
            Mutex mutex;
            Mutex mutex2;
            Function2 function2;
            Object f2 = IntrinsicsKt.f();
            int i2 = this.F;
            if (i2 == 0) {
                ResultKt.b(obj);
                mutex2 = mutex;
                function2 = function2;
                this.D = mutex2;
                this.E = function2;
                this.F = 1;
                if (mutex2.d((Object) null, this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                function2 = (Function2) this.E;
                ResultKt.b(obj);
                mutex2 = (Mutex) this.D;
            } else if (i2 == 2) {
                mutex = (Mutex) this.D;
                try {
                    ResultKt.b(obj);
                    Unit unit = Unit.f40552a;
                    mutex.e((Object) null);
                    return Unit.f40552a;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, (Continuation) null);
                this.D = mutex2;
                this.E = null;
                this.F = 2;
                if (CoroutineScopeKt.f(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == f2) {
                    return f2;
                }
                mutex = mutex2;
                Unit unit2 = Unit.f40552a;
                mutex.e((Object) null);
                return Unit.f40552a;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                mutex = mutex2;
                th = th4;
                mutex.e((Object) null);
                throw th;
            }
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(Lifecycle.Event event, Ref.ObjectRef objectRef, CoroutineScope coroutineScope, Lifecycle.Event event2, CancellableContinuation cancellableContinuation, Mutex mutex, Function2 function2) {
        this.f21957z = event;
        this.f21955A = objectRef;
        this.f21956B = coroutineScope;
        this.C = event2;
        this.D = cancellableContinuation;
        this.E = mutex;
        this.F = function2;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "<unused var>");
        Intrinsics.i(event, "event");
        if (event == this.f21957z) {
            Ref.ObjectRef objectRef = this.f21955A;
            CoroutineScope coroutineScope = this.f21956B;
            final Mutex mutex = this.E;
            final Function2 function2 = this.F;
            objectRef.f40908z = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
            return;
        }
        if (event == this.C) {
            Job job = (Job) this.f21955A.f40908z;
            if (job != null) {
                Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
            }
            this.f21955A.f40908z = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            CancellableContinuation cancellableContinuation = this.D;
            Result.Companion companion = Result.f40519A;
            cancellableContinuation.q(Result.b(Unit.f40552a));
        }
    }
}
