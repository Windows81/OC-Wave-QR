package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
final class DisposeOnCancel implements CancelHandler {

    /* renamed from: z  reason: collision with root package name */
    public final DisposableHandle f41401z;

    public DisposeOnCancel(DisposableHandle disposableHandle) {
        this.f41401z = disposableHandle;
    }

    public void e(Throwable th) {
        this.f41401z.d();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f41401z + ']';
    }
}
