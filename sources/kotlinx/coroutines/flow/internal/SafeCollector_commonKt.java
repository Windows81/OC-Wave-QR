package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ScopeCoroutine;

@Metadata
public final class SafeCollector_commonKt {
    public static final void b(SafeCollector safeCollector, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.k(0, new b(safeCollector))).intValue() != safeCollector.E) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.D + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final int c(SafeCollector safeCollector, int i2, CoroutineContext.Element element) {
        CoroutineContext.Key key = element.getKey();
        CoroutineContext.Element d2 = safeCollector.D.d(key);
        if (key == Job.f41415x) {
            Job job = (Job) d2;
            Intrinsics.g(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            Job d3 = d((Job) element, job);
            if (d3 == job) {
                return job == null ? i2 : i2 + 1;
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d3 + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        } else if (element != d2) {
            return Integer.MIN_VALUE;
        } else {
            return i2 + 1;
        }
    }

    public static final Job d(Job job, Job job2) {
        while (job != null) {
            if (job == job2 || !(job instanceof ScopeCoroutine)) {
                return job;
            }
            job = ((ScopeCoroutine) job).E0();
        }
        return null;
    }
}
