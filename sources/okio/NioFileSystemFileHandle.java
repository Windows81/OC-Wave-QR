package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NioFileSystemFileHandle extends FileHandle {
    public final FileChannel D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z2, FileChannel fileChannel) {
        super(z2);
        Intrinsics.i(fileChannel, "fileChannel");
        this.D = fileChannel;
    }

    public synchronized void j() {
        this.D.close();
    }

    public synchronized void k() {
        this.D.force(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int l(long r2, byte[] r4, int r5, int r6) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)     // Catch:{ all -> 0x0021 }
            java.nio.channels.FileChannel r0 = r1.D     // Catch:{ all -> 0x0021 }
            r0.position(r2)     // Catch:{ all -> 0x0021 }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch:{ all -> 0x0021 }
            r3 = 0
        L_0x0010:
            if (r3 >= r6) goto L_0x0023
            java.nio.channels.FileChannel r4 = r1.D     // Catch:{ all -> 0x0021 }
            int r4 = r4.read(r2)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 != r5) goto L_0x001f
            if (r3 != 0) goto L_0x0023
            monitor-exit(r1)
            return r5
        L_0x001f:
            int r3 = r3 + r4
            goto L_0x0010
        L_0x0021:
            r2 = move-exception
            goto L_0x0025
        L_0x0023:
            monitor-exit(r1)
            return r3
        L_0x0025:
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.NioFileSystemFileHandle.l(long, byte[], int, int):int");
    }

    public synchronized long m() {
        return this.D.size();
    }

    public synchronized void r(long j2, byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "array");
        this.D.position(j2);
        this.D.write(ByteBuffer.wrap(bArr, i2, i3));
    }
}
