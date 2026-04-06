package retrofit2;

import java.util.Objects;

public class HttpException extends RuntimeException {

    /* renamed from: A  reason: collision with root package name */
    public final String f44140A;

    /* renamed from: B  reason: collision with root package name */
    public final transient Response f44141B;

    /* renamed from: z  reason: collision with root package name */
    public final int f44142z;

    public HttpException(Response response) {
        super(b(response));
        this.f44142z = response.b();
        this.f44140A = response.f();
        this.f44141B = response;
    }

    public static String b(Response response) {
        Objects.requireNonNull(response, "response == null");
        return "HTTP " + response.b() + " " + response.f();
    }

    public int a() {
        return this.f44142z;
    }
}
