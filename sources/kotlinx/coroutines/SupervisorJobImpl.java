package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
final class SupervisorJobImpl extends JobImpl {
    public SupervisorJobImpl(Job job) {
        super(job);
    }

    public boolean t0(Throwable th) {
        return false;
    }
}
