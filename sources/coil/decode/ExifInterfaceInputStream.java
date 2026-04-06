package coil.decode;

import java.io.InputStream;
import kotlin.Metadata;

@Metadata
final class ExifInterfaceInputStream extends InputStream {

    /* renamed from: A  reason: collision with root package name */
    public int f23370A = 1073741824;

    /* renamed from: z  reason: collision with root package name */
    public final InputStream f23371z;

    public ExifInterfaceInputStream(InputStream inputStream) {
        this.f23371z = inputStream;
    }

    public final int a(int i2) {
        if (i2 == -1) {
            this.f23370A = 0;
        }
        return i2;
    }

    public int available() {
        return this.f23370A;
    }

    public void close() {
        this.f23371z.close();
    }

    public int read() {
        return a(this.f23371z.read());
    }

    public long skip(long j2) {
        return this.f23371z.skip(j2);
    }

    public int read(byte[] bArr) {
        return a(this.f23371z.read(bArr));
    }

    public int read(byte[] bArr, int i2, int i3) {
        return a(this.f23371z.read(bArr, i2, i3));
    }
}
