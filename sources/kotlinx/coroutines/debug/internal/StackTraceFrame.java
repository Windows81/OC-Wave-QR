package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

@Metadata
public final class StackTraceFrame implements CoroutineStackFrame {

    /* renamed from: A  reason: collision with root package name */
    public final StackTraceElement f41566A;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineStackFrame f41567z;

    public CoroutineStackFrame e() {
        return this.f41567z;
    }

    public StackTraceElement p() {
        return this.f41566A;
    }
}
