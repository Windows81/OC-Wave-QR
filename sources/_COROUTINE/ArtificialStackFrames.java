package _COROUTINE;

import kotlin.Metadata;

@Metadata
public final class ArtificialStackFrames {
    public final StackTraceElement a() {
        return CoroutineDebuggingKt.b(new Exception(), _BOUNDARY.class.getSimpleName());
    }

    public final StackTraceElement b() {
        return CoroutineDebuggingKt.b(new Exception(), _CREATION.class.getSimpleName());
    }
}
