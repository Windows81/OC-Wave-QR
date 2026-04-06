package coil.network;

import kotlin.Metadata;

@Metadata
public interface NetworkObserver {

    @Metadata
    public interface Listener {
        void a(boolean z2);
    }

    boolean a();

    void shutdown();
}
