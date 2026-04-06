package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Segment;

@Metadata
public interface Waiter {
    void c(Segment segment, int i2);
}
