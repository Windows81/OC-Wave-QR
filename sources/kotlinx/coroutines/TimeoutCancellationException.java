package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public final class TimeoutCancellationException extends CancellationException implements CopyableThrowable<TimeoutCancellationException> {

    /* renamed from: z  reason: collision with root package name */
    public final transient Job f41439z;

    public TimeoutCancellationException(String str, Job job) {
        super(str);
        this.f41439z = job;
    }

    public TimeoutCancellationException(String str) {
        this(str, (Job) null);
    }
}
