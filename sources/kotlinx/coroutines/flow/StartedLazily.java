package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
final class StartedLazily implements SharingStarted {
    public Flow a(StateFlow stateFlow) {
        return FlowKt.I(new StartedLazily$command$1(stateFlow, (Continuation) null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
