package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
public final class NonDisposableHandle implements DisposableHandle, ChildHandle {

    /* renamed from: z  reason: collision with root package name */
    public static final NonDisposableHandle f41433z = new NonDisposableHandle();

    public void d() {
    }

    public Job getParent() {
        return null;
    }

    public boolean h(Throwable th) {
        return false;
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}
