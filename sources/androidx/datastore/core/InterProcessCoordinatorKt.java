package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InterProcessCoordinatorKt {
    public static final InterProcessCoordinator a(String str) {
        Intrinsics.i(str, "filePath");
        return new SingleProcessCoordinator(str);
    }
}
