package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class JobCancellationException extends CancellationException implements CopyableThrowable<JobCancellationException> {

    /* renamed from: z  reason: collision with root package name */
    public final transient Job f41417z;

    public JobCancellationException(String str, Throwable th, Job job) {
        super(str);
        this.f41417z = job;
        if (th != null) {
            initCause(th);
        }
    }

    public final Job a() {
        Job job = this.f41417z;
        return job == null ? NonCancellable.f41432A : job;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!Intrinsics.d(jobCancellationException.getMessage(), getMessage()) || !Intrinsics.d(jobCancellationException.a(), a()) || !Intrinsics.d(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.f(message);
        int hashCode = message.hashCode() * 31;
        Job a2 = a();
        int i2 = 0;
        int hashCode2 = (hashCode + (a2 != null ? a2.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i2 = cause.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return super.toString() + "; job=" + a();
    }
}
