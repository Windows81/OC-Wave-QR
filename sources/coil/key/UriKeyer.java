package coil.key;

import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UriKeyer implements Keyer<Uri> {
    /* renamed from: b */
    public String a(Uri uri, Options options) {
        if (!Intrinsics.d(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        sb.append(Utils.l(options.g().getResources().getConfiguration()));
        return sb.toString();
    }
}
