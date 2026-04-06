package retrofit2;

import java.util.Objects;
import okhttp3.ResponseBody;

public final class Response<T> {

    /* renamed from: a  reason: collision with root package name */
    public final okhttp3.Response f44275a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f44276b;

    /* renamed from: c  reason: collision with root package name */
    public final ResponseBody f44277c;

    public Response(okhttp3.Response response, Object obj, ResponseBody responseBody) {
        this.f44275a = response;
        this.f44276b = obj;
        this.f44277c = responseBody;
    }

    public static Response c(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.r()) {
            return new Response(response, (Object) null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static Response h(Object obj, okhttp3.Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.r()) {
            return new Response(response, obj, (ResponseBody) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object a() {
        return this.f44276b;
    }

    public int b() {
        return this.f44275a.f();
    }

    public ResponseBody d() {
        return this.f44277c;
    }

    public boolean e() {
        return this.f44275a.r();
    }

    public String f() {
        return this.f44275a.t();
    }

    public okhttp3.Response g() {
        return this.f44275a;
    }

    public String toString() {
        return this.f44275a.toString();
    }
}
