package androidx.compose.material3.internal;

import kotlin.Metadata;

@Metadata
public final class AnchoredDragFinishedSignal extends PlatformOptimizedCancellationException {
    public AnchoredDragFinishedSignal() {
        super("Anchored drag finished");
    }
}
