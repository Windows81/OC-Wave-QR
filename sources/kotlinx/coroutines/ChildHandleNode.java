package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
final class ChildHandleNode extends JobNode implements ChildHandle {
    public final ChildJob D;

    public ChildHandleNode(ChildJob childJob) {
        this.D = childJob;
    }

    public Job getParent() {
        return v();
    }

    public boolean h(Throwable th) {
        return v().t0(th);
    }

    public boolean w() {
        return true;
    }

    public void x(Throwable th) {
        this.D.N(v());
    }
}
