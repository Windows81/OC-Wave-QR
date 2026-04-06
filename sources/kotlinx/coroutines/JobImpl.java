package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public class JobImpl extends JobSupport implements CompletableJob {

    /* renamed from: B  reason: collision with root package name */
    public final boolean f41418B = r1();

    public JobImpl(Job job) {
        super(true);
        L0(job);
    }

    public boolean B0() {
        return this.f41418B;
    }

    public boolean C0() {
        return true;
    }

    public boolean a() {
        return R0(Unit.f40552a);
    }

    public boolean j(Throwable th) {
        return R0(new CompletedExceptionally(th, false, 2, (DefaultConstructorMarker) null));
    }

    public final boolean r1() {
        JobSupport v2;
        ChildHandle F0 = F0();
        ChildHandleNode childHandleNode = F0 instanceof ChildHandleNode ? (ChildHandleNode) F0 : null;
        if (!(childHandleNode == null || (v2 = childHandleNode.v()) == null)) {
            while (!v2.B0()) {
                ChildHandle F02 = v2.F0();
                ChildHandleNode childHandleNode2 = F02 instanceof ChildHandleNode ? (ChildHandleNode) F02 : null;
                if (childHandleNode2 != null) {
                    v2 = childHandleNode2.v();
                    if (v2 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
