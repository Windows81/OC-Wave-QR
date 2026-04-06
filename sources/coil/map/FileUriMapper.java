package coil.map;

import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class FileUriMapper implements Mapper<Uri, File> {
    public final boolean b(Uri uri) {
        if (Utils.r(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !Intrinsics.d(scheme, "file")) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return StringsKt.Q0(path, '/', false, 2, (Object) null) && Utils.i(uri) != null;
    }

    /* renamed from: c */
    public File a(Uri uri, Options options) {
        if (!b(uri)) {
            return null;
        }
        if (!Intrinsics.d(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
