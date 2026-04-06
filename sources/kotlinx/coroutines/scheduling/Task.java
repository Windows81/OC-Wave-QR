package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

@Metadata
public abstract class Task implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public boolean f41904A;

    /* renamed from: z  reason: collision with root package name */
    public long f41905z;

    public Task(long j2, boolean z2) {
        this.f41905z = j2;
        this.f41904A = z2;
    }

    public Task() {
        this(0, false);
    }
}
