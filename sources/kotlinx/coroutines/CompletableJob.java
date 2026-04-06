package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
public interface CompletableJob extends Job {

    @Metadata
    public static final class DefaultImpls {
    }

    boolean a();

    boolean j(Throwable th);
}
