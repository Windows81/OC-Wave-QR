package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IllegalFileNameException extends FileSystemException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(Path path, Path path2, String str) {
        super(path.toString(), path2 != null ? path2.toString() : null, str);
        Intrinsics.i(path, "file");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(Path path) {
        this(path, (Path) null, (String) null);
        Intrinsics.i(path, "file");
    }
}
