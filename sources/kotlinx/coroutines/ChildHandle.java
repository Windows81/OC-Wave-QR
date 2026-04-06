package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public interface ChildHandle extends DisposableHandle {

    @Metadata
    public static final class DefaultImpls {
    }

    Job getParent();

    boolean h(Throwable th);
}
