package retrofit2.converter.scalars;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

final class ScalarRequestBodyConverter<T> implements Converter<T, RequestBody> {

    /* renamed from: a  reason: collision with root package name */
    public static final ScalarRequestBodyConverter f44326a = new ScalarRequestBodyConverter();

    /* renamed from: b  reason: collision with root package name */
    public static final MediaType f44327b = MediaType.e("text/plain; charset=UTF-8");

    /* renamed from: b */
    public RequestBody a(Object obj) {
        return RequestBody.c(f44327b, String.valueOf(obj));
    }
}
