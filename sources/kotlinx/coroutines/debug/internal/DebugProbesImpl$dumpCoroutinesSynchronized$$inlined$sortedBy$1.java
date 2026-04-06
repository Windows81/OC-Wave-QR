package kotlinx.coroutines.debug.internal;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

@Metadata
public final class DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(Long.valueOf(((DebugProbesImpl.CoroutineOwner) obj).f41558A.f41544b), Long.valueOf(((DebugProbesImpl.CoroutineOwner) obj2).f41558A.f41544b));
    }
}
