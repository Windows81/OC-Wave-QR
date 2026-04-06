package coil.map;

import coil.request.Options;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata
public final class HttpUrlMapper implements Mapper<HttpUrl, String> {
    /* renamed from: b */
    public String a(HttpUrl httpUrl, Options options) {
        return httpUrl.toString();
    }
}
