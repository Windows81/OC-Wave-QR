package coil.map;

import coil.request.Options;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata
public final class ByteArrayMapper implements Mapper<byte[], ByteBuffer> {
    /* renamed from: b */
    public ByteBuffer a(byte[] bArr, Options options) {
        return ByteBuffer.wrap(bArr);
    }
}
