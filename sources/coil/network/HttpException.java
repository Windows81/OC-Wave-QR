package coil.network;

import kotlin.Metadata;
import okhttp3.Response;

@Metadata
public final class HttpException extends RuntimeException {

    /* renamed from: z  reason: collision with root package name */
    public final Response f23532z;

    public HttpException(Response response) {
        super("HTTP " + response.f() + ": " + response.t());
        this.f23532z = response;
    }
}
