package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.Job;

@Metadata
final /* synthetic */ class JobKt__JobKt {
    public static final CompletableJob a(Job job) {
        return new JobImpl(job);
    }

    public static /* synthetic */ CompletableJob b(Job job, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            job = null;
        }
        return JobKt.a(job);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.d(Job.f41415x);
        if (job != null) {
            job.c(cancellationException);
        }
    }

    public static final void d(Job job, String str, Throwable th) {
        job.c(ExceptionsKt.a(str, th));
    }

    public static /* synthetic */ void e(CoroutineContext coroutineContext, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.c(coroutineContext, cancellationException);
    }

    public static /* synthetic */ void f(Job job, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        JobKt.d(job, str, th);
    }

    public static final Object g(Job job, Continuation continuation) {
        Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        Object D = job.D(continuation);
        return D == IntrinsicsKt.f() ? D : Unit.f40552a;
    }

    public static final DisposableHandle h(Job job, DisposableHandle disposableHandle) {
        return m(job, false, new DisposeOnCompletion(disposableHandle), 1, (Object) null);
    }

    public static final void i(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.d(Job.f41415x);
        if (job != null) {
            JobKt.j(job);
        }
    }

    public static final void j(Job job) {
        if (!job.b()) {
            throw job.F();
        }
    }

    public static final Job k(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.d(Job.f41415x);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final DisposableHandle l(Job job, boolean z2, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).M0(z2, jobNode) : job.E(jobNode.w(), z2, new JobKt__JobKt$invokeOnCompletion$1(jobNode));
    }

    public static /* synthetic */ DisposableHandle m(Job job, boolean z2, JobNode jobNode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return JobKt.l(job, z2, jobNode);
    }

    public static final boolean n(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.d(Job.f41415x);
        if (job != null) {
            return job.b();
        }
        return true;
    }
}
