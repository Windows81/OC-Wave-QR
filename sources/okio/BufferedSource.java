package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata
public interface BufferedSource extends Source, ReadableByteChannel {
    long A1();

    InputStream B1();

    int D1(Options options);

    String M(long j2);

    String M0(Charset charset);

    ByteString R(long j2);

    boolean V0(long j2);

    String a1();

    int c1();

    byte[] e1(long j2);

    byte[] h0();

    boolean l0();

    short l1();

    long p1();

    BufferedSource peek();

    void q0(Buffer buffer, long j2);

    long r1(Sink sink);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    Buffer s();

    void skip(long j2);

    long v0();

    void v1(long j2);

    String x0(long j2);
}
