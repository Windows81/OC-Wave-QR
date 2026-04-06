package retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

@Metadata
public final class SerializationStrategyConverter<T> implements Converter<T, RequestBody> {

    /* renamed from: a  reason: collision with root package name */
    public final MediaType f44321a;

    /* renamed from: b  reason: collision with root package name */
    public final SerializationStrategy f44322b;

    /* renamed from: c  reason: collision with root package name */
    public final Serializer f44323c;

    public SerializationStrategyConverter(MediaType mediaType, SerializationStrategy serializationStrategy, Serializer serializer) {
        Intrinsics.i(mediaType, "contentType");
        Intrinsics.i(serializationStrategy, "saver");
        Intrinsics.i(serializer, "serializer");
        this.f44321a = mediaType;
        this.f44322b = serializationStrategy;
        this.f44323c = serializer;
    }

    /* renamed from: b */
    public RequestBody a(Object obj) {
        return this.f44323c.d(this.f44321a, this.f44322b, obj);
    }
}
