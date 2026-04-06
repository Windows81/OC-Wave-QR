package kotlinx.coroutines.debug.internal;

import java.lang.instrument.ClassFileTransformer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

@Metadata
public final class AgentPremain {

    /* renamed from: a  reason: collision with root package name */
    public static final AgentPremain f41512a = new AgentPremain();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f41513b;

    @Metadata
    public static final class DebugProbesTransformer implements ClassFileTransformer {

        /* renamed from: a  reason: collision with root package name */
        public static final DebugProbesTransformer f41514a = new DebugProbesTransformer();
    }

    static {
        Object obj;
        Boolean bool = null;
        try {
            Result.Companion companion = Result.f40519A;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            obj = Result.b(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        if (!Result.g(obj)) {
            bool = obj;
        }
        Boolean bool2 = bool;
        f41513b = bool2 != null ? bool2.booleanValue() : DebugProbesImpl.f41547a.d();
    }
}
