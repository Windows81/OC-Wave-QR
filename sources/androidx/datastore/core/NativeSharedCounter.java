package androidx.datastore.core;

import kotlin.Metadata;

@Metadata
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i2);

    public final native int nativeGetCounterValue(long j2);

    public final native int nativeIncrementAndGetCounterValue(long j2);

    public final native int nativeTruncateFile(int i2);
}
