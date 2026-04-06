package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {

    /* renamed from: c  reason: collision with root package name */
    public static final MediaType f44312c = MediaType.e("application/json; charset=UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Gson f44313a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter f44314b;

    public GsonRequestBodyConverter(Gson gson, TypeAdapter typeAdapter) {
        this.f44313a = gson;
        this.f44314b = typeAdapter;
    }

    /* renamed from: b */
    public RequestBody a(Object obj) {
        Buffer buffer = new Buffer();
        JsonWriter q2 = this.f44313a.q(new OutputStreamWriter(buffer.y1(), StandardCharsets.UTF_8));
        this.f44314b.d(q2, obj);
        q2.close();
        return RequestBody.d(f44312c, buffer.X());
    }
}
