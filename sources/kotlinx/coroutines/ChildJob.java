package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public interface ChildJob extends Job {

    @Metadata
    public static final class DefaultImpls {
    }

    void N(ParentJob parentJob);
}
