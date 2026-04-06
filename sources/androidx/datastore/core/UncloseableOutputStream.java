package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UncloseableOutputStream extends OutputStream {

    /* renamed from: z  reason: collision with root package name */
    public final FileOutputStream f20642z;

    public UncloseableOutputStream(FileOutputStream fileOutputStream) {
        Intrinsics.i(fileOutputStream, "fileOutputStream");
        this.f20642z = fileOutputStream;
    }

    public void close() {
    }

    public void flush() {
        this.f20642z.flush();
    }

    public void write(int i2) {
        this.f20642z.write(i2);
    }

    public void write(byte[] bArr) {
        Intrinsics.i(bArr, "b");
        this.f20642z.write(bArr);
    }

    public void write(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "bytes");
        this.f20642z.write(bArr, i2, i3);
    }
}
