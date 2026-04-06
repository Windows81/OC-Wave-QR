package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator a(File file) {
        Intrinsics.i(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.h(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.a(absolutePath);
    }
}
