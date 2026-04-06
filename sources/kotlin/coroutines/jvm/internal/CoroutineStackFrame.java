package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;

@Metadata
public interface CoroutineStackFrame {
    CoroutineStackFrame e();

    StackTraceElement p();
}
