package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

@Metadata
public final class DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 implements Function1<DebugProbesImpl.CoroutineOwner<?>, DebuggerInfo> {
    /* renamed from: b */
    public final Object invoke(DebugProbesImpl.CoroutineOwner coroutineOwner) {
        CoroutineContext c2;
        if (!DebugProbesImpl.f41547a.e(coroutineOwner) && (c2 = coroutineOwner.f41558A.c()) != null) {
            return new DebuggerInfo(coroutineOwner.f41558A, c2);
        }
        return null;
    }
}
