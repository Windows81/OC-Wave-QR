package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

@Metadata
public final class DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1 implements Function1<DebugProbesImpl.CoroutineOwner<?>, DebugCoroutineInfo> {
    /* renamed from: b */
    public final Object invoke(DebugProbesImpl.CoroutineOwner coroutineOwner) {
        CoroutineContext c2;
        if (!DebugProbesImpl.f41547a.e(coroutineOwner) && (c2 = coroutineOwner.f41558A.c()) != null) {
            return new DebugCoroutineInfo(coroutineOwner.f41558A, c2);
        }
        return null;
    }
}
