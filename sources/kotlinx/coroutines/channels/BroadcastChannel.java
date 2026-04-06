package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public interface BroadcastChannel<E> extends SendChannel<E> {

    @Metadata
    public static final class DefaultImpls {
    }

    ReceiveChannel B();

    void c(CancellationException cancellationException);
}
