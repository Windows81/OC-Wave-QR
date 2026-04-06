package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import okio.Sink;
import okio.Source;

@Metadata
public interface FileSystem {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f43169a = new Companion();

        @Metadata
        public static final class SystemFileSystem implements FileSystem {
            public Source a(File file) {
                Intrinsics.i(file, "file");
                return Okio.j(file);
            }

            public Sink b(File file) {
                Intrinsics.i(file, "file");
                try {
                    return Okio__JvmOkioKt.g(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.g(file, false, 1, (Object) null);
                }
            }

            public void c(File file) {
                Intrinsics.i(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i2 = 0;
                    while (i2 < length) {
                        File file2 = listFiles[i2];
                        if (file2.isDirectory()) {
                            Intrinsics.h(file2, "file");
                            c(file2);
                        }
                        if (file2.delete()) {
                            i2++;
                        } else {
                            throw new IOException("failed to delete " + file2);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + file);
            }

            public boolean d(File file) {
                Intrinsics.i(file, "file");
                return file.exists();
            }

            public void e(File file, File file2) {
                Intrinsics.i(file, "from");
                Intrinsics.i(file2, "to");
                f(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException("failed to rename " + file + " to " + file2);
                }
            }

            public void f(File file) {
                Intrinsics.i(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            public Sink g(File file) {
                Intrinsics.i(file, "file");
                try {
                    return Okio.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.a(file);
                }
            }

            public long h(File file) {
                Intrinsics.i(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }
    }

    Source a(File file);

    Sink b(File file);

    void c(File file);

    boolean d(File file);

    void e(File file, File file2);

    void f(File file);

    Sink g(File file);

    long h(File file);
}
