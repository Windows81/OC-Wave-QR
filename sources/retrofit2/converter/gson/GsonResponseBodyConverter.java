package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import okhttp3.ResponseBody;
import retrofit2.Converter;

final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f44315a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter f44316b;

    public GsonResponseBodyConverter(Gson gson, TypeAdapter typeAdapter) {
        this.f44315a = gson;
        this.f44316b = typeAdapter;
    }

    /* renamed from: b */
    public Object a(ResponseBody responseBody) {
        JsonReader p2 = this.f44315a.p(responseBody.b());
        try {
            Object b2 = this.f44316b.b(p2);
            if (p2.S() == JsonToken.END_DOCUMENT) {
                return b2;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
