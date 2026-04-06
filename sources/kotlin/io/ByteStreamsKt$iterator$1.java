package kotlin.io;

import java.io.BufferedInputStream;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ByteIterator;

@Metadata
public final class ByteStreamsKt$iterator$1 extends ByteIterator {

    /* renamed from: A  reason: collision with root package name */
    public boolean f40759A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f40760B;
    public final /* synthetic */ BufferedInputStream C;

    /* renamed from: z  reason: collision with root package name */
    public int f40761z;

    public final void b() {
        if (!this.f40759A && !this.f40760B) {
            int read = this.C.read();
            this.f40761z = read;
            boolean z2 = true;
            this.f40759A = true;
            if (read != -1) {
                z2 = false;
            }
            this.f40760B = z2;
        }
    }

    public boolean hasNext() {
        b();
        return !this.f40760B;
    }

    public byte p() {
        b();
        if (!this.f40760B) {
            byte b2 = (byte) this.f40761z;
            this.f40759A = false;
            return b2;
        }
        throw new NoSuchElementException("Input stream is over.");
    }
}
