package coil.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import okio.FileSystem;
import okio.Path;

@Metadata
/* renamed from: coil.util.-FileSystems  reason: invalid class name */
public final class FileSystems {
    public static final void a(FileSystem fileSystem, Path path) {
        if (!fileSystem.j(path)) {
            Utils.d(fileSystem.r(path));
        }
    }

    public static final void b(FileSystem fileSystem, Path path) {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.k(path)) {
                try {
                    if (fileSystem.m(path2).f()) {
                        b(fileSystem, path2);
                    }
                    fileSystem.h(path2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
