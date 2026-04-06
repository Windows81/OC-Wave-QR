package coil.fetch;

import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.Buffer;

@Metadata
public final class ByteBufferFetcher implements Fetcher {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f23435a;

    /* renamed from: b  reason: collision with root package name */
    public final Options f23436b;

    @Metadata
    public static final class Factory implements Fetcher.Factory<ByteBuffer> {
        /* renamed from: b */
        public Fetcher a(ByteBuffer byteBuffer, Options options, ImageLoader imageLoader) {
            return new ByteBufferFetcher(byteBuffer, options);
        }
    }

    public ByteBufferFetcher(ByteBuffer byteBuffer, Options options) {
        this.f23435a = byteBuffer;
        this.f23436b = options;
    }

    /* JADX INFO: finally extract failed */
    public Object a(Continuation continuation) {
        try {
            Buffer buffer = new Buffer();
            buffer.write(this.f23435a);
            this.f23435a.position(0);
            return new SourceResult(ImageSources.a(buffer, this.f23436b.g()), (String) null, DataSource.MEMORY);
        } catch (Throwable th) {
            this.f23435a.position(0);
            throw th;
        }
    }
}
