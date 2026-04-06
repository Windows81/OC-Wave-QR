package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
public interface CompletableDeferred<T> extends Deferred<T> {

    @Metadata
    public static final class DefaultImpls {
    }

    boolean c0(Object obj);

    boolean j(Throwable th);
}
