package androidx.compose.ui.platform;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

@Metadata
public interface WindowInfo {
    long a() {
        long j2 = (long) Integer.MIN_VALUE;
        return IntSize.c((j2 & 4294967295L) | (j2 << 32));
    }

    boolean b();
}
