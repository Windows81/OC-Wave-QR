package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

@Metadata
public interface BufferedSink extends Sink, WritableByteChannel {
    BufferedSink K0(String str);

    long P0(Source source);

    BufferedSink Q0(long j2);

    BufferedSink V();

    void flush();

    BufferedSink k1(ByteString byteString);

    Buffer s();

    BufferedSink u0();

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i2, int i3);

    BufferedSink writeByte(int i2);

    BufferedSink writeInt(int i2);

    BufferedSink writeShort(int i2);

    BufferedSink x1(long j2);

    OutputStream y1();
}
