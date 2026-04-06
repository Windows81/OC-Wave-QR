package retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.StringFormat;
import okhttp3.MediaType;
import retrofit2.Converter;
import retrofit2.converter.kotlinx.serialization.Serializer;

@Metadata
public final class KotlinSerializationConverterFactory {
    public static final Converter.Factory a(StringFormat stringFormat, MediaType mediaType) {
        Intrinsics.i(stringFormat, "<this>");
        Intrinsics.i(mediaType, "contentType");
        return new Factory(mediaType, new Serializer.FromString(stringFormat));
    }
}
