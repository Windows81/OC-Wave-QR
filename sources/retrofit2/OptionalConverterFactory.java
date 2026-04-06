package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import retrofit2.Converter;

public final class OptionalConverterFactory extends Converter.Factory {

    public static final class OptionalConverter<T> implements Converter<ResponseBody, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Converter f44171a;

        public OptionalConverter(Converter converter) {
            this.f44171a = converter;
        }

        /* renamed from: b */
        public Optional a(ResponseBody responseBody) {
            return Optional.ofNullable(this.f44171a.a(responseBody));
        }
    }

    public Converter d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.b(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.h(Converter.Factory.a(0, (ParameterizedType) type), annotationArr));
    }
}
