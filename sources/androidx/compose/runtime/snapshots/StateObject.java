package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

@Metadata
public interface StateObject {

    @Metadata
    public static final class DefaultImpls {
    }

    void g(StateRecord stateRecord);

    StateRecord h();

    StateRecord i(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return null;
    }
}
