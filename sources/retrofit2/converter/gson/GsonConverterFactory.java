package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;

public final class GsonConverterFactory extends Converter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f44311a;

    public GsonConverterFactory(Gson gson) {
        this.f44311a = gson;
    }

    public static GsonConverterFactory f(Gson gson) {
        if (gson != null) {
            return new GsonConverterFactory(gson);
        }
        throw new NullPointerException("gson == null");
    }

    public Converter c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.f44311a, this.f44311a.l(TypeToken.get(type)));
    }

    public Converter d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.f44311a, this.f44311a.l(TypeToken.get(type)));
    }
}
