package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
final class DisposeOnCompletion extends JobNode {
    public final DisposableHandle D;

    public DisposeOnCompletion(DisposableHandle disposableHandle) {
        this.D = disposableHandle;
    }

    public boolean w() {
        return false;
    }

    public void x(Throwable th) {
        this.D.d();
    }
}
