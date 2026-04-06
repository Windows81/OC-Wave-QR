package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata
final class StartedEagerly implements SharingStarted {
    public Flow a(StateFlow stateFlow) {
        return FlowKt.K(SharingCommand.START);
    }

    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
