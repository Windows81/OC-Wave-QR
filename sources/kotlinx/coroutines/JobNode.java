package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

@Metadata
public abstract class JobNode extends LockFreeLinkedListNode implements DisposableHandle, Incomplete {
    public JobSupport C;

    public NodeList a() {
        return null;
    }

    public boolean b() {
        return true;
    }

    public void d() {
        v().f1(this);
    }

    public String toString() {
        return DebugStringsKt.a(this) + '@' + DebugStringsKt.b(this) + "[job@" + DebugStringsKt.b(v()) + ']';
    }

    public final JobSupport v() {
        JobSupport jobSupport = this.C;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.y("job");
        return null;
    }

    public abstract boolean w();

    public abstract void x(Throwable th);

    public final void y(JobSupport jobSupport) {
        this.C = jobSupport;
    }
}
