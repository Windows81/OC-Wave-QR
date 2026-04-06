package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

@Metadata
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$3 implements Function1<DebugProbesImpl.CoroutineOwner<?>, Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f41560z;

    /* renamed from: b */
    public final Object invoke(DebugProbesImpl.CoroutineOwner coroutineOwner) {
        CoroutineContext c2;
        if (!DebugProbesImpl.f41547a.e(coroutineOwner) && (c2 = coroutineOwner.f41558A.c()) != null) {
            return this.f41560z.m(coroutineOwner, c2);
        }
        return null;
    }
}
