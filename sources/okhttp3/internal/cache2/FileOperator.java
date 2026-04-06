package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

@Metadata
public final class FileOperator {

    /* renamed from: a  reason: collision with root package name */
    public final FileChannel f42860a;

    public FileOperator(FileChannel fileChannel) {
        Intrinsics.i(fileChannel, "fileChannel");
        this.f42860a = fileChannel;
    }

    public final void a(long j2, Buffer buffer, long j3) {
        Intrinsics.i(buffer, "sink");
        if (j3 >= 0) {
            while (j3 > 0) {
                long transferTo = this.f42860a.transferTo(j2, j3, buffer);
                j2 += transferTo;
                j3 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void b(long j2, Buffer buffer, long j3) {
        Intrinsics.i(buffer, "source");
        if (j3 < 0 || j3 > buffer.n0()) {
            throw new IndexOutOfBoundsException();
        }
        while (j3 > 0) {
            long transferFrom = this.f42860a.transferFrom(buffer, j2, j3);
            j2 += transferFrom;
            j3 -= transferFrom;
        }
    }
}
