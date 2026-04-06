package androidx.datastore.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FileMoves_androidKt {
    public static final boolean a(File file, File file2) {
        Intrinsics.i(file, "<this>");
        Intrinsics.i(file2, "toFile");
        return Api26Impl.f20542a.a(file, file2);
    }
}
