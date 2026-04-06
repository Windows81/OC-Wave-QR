package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

@Metadata
public final class OkioStorageKt {
    public static final InterProcessCoordinator a(Path path) {
        Intrinsics.i(path, "path");
        return InterProcessCoordinatorKt.a(path.n().toString());
    }
}
