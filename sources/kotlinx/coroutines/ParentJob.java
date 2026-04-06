package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public interface ParentJob extends Job {

    @Metadata
    public static final class DefaultImpls {
    }

    CancellationException g0();
}
