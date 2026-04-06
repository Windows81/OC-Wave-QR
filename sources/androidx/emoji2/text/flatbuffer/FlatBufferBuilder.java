package androidx.emoji2.text.flatbuffer;

import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public class FlatBufferBuilder {

    public static class ByteBufferBackedInputStream extends InputStream {

        /* renamed from: z  reason: collision with root package name */
        public ByteBuffer f21365z;

        public int read() {
            try {
                return this.f21365z.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public static abstract class ByteBufferFactory {
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {

        /* renamed from: a  reason: collision with root package name */
        public static final HeapByteBufferFactory f21366a = new HeapByteBufferFactory();
    }
}
