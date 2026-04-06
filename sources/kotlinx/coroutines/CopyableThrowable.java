package kotlinx.coroutines;

import java.lang.Throwable;
import kotlin.Metadata;
import kotlinx.coroutines.CopyableThrowable;

@Metadata
public interface CopyableThrowable<T extends Throwable & CopyableThrowable<T>> {
}
