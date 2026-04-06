package retrofit2.converter.kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import retrofit2.Converter;
import retrofit2.Retrofit;

@Metadata
public final class Factory extends Converter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final MediaType f44319a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializer f44320b;

    public Factory(MediaType mediaType, Serializer serializer) {
        Intrinsics.i(mediaType, "contentType");
        Intrinsics.i(serializer, "serializer");
        this.f44319a = mediaType;
        this.f44320b = serializer;
    }

    public Converter c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        Intrinsics.i(type, "type");
        Intrinsics.i(annotationArr, "parameterAnnotations");
        Intrinsics.i(annotationArr2, "methodAnnotations");
        Intrinsics.i(retrofit, "retrofit");
        return new SerializationStrategyConverter(this.f44319a, this.f44320b.c(type), this.f44320b);
    }

    public Converter d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Intrinsics.i(type, "type");
        Intrinsics.i(annotationArr, "annotations");
        Intrinsics.i(retrofit, "retrofit");
        return new DeserializationStrategyConverter(this.f44320b.c(type), this.f44320b);
    }
}
