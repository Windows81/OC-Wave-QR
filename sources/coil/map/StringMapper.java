package coil.map;

import android.net.Uri;
import coil.request.Options;
import kotlin.Metadata;

@Metadata
public final class StringMapper implements Mapper<String, Uri> {
    /* renamed from: b */
    public Uri a(String str, Options options) {
        return Uri.parse(str);
    }
}
