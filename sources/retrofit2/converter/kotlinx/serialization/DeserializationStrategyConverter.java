package retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import okhttp3.ResponseBody;
import retrofit2.Converter;

@Metadata
public final class DeserializationStrategyConverter<T> implements Converter<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    public final DeserializationStrategy f44317a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializer f44318b;

    public DeserializationStrategyConverter(DeserializationStrategy deserializationStrategy, Serializer serializer) {
        Intrinsics.i(deserializationStrategy, "loader");
        Intrinsics.i(serializer, "serializer");
        this.f44317a = deserializationStrategy;
        this.f44318b = serializer;
    }

    /* renamed from: b */
    public Object a(ResponseBody responseBody) {
        Intrinsics.i(responseBody, "value");
        return this.f44318b.a(this.f44317a, responseBody);
    }
}
