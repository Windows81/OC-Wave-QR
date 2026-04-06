package coil.map;

import android.content.res.Resources;
import android.net.Uri;
import coil.request.Options;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class ResourceUriMapper implements Mapper<Uri, Uri> {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r3.getAuthority();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(android.net.Uri r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "android.resource"
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r3.getAuthority()
            if (r0 == 0) goto L_0x0028
            boolean r0 = kotlin.text.StringsKt.l0(r0)
            if (r0 == 0) goto L_0x0019
            goto L_0x0028
        L_0x0019:
            java.util.List r3 = r3.getPathSegments()
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r0 = 2
            if (r3 != r0) goto L_0x0028
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.map.ResourceUriMapper.b(android.net.Uri):boolean");
    }

    /* renamed from: c */
    public Uri a(Uri uri, Options options) {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = options.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            return Uri.parse("android.resource://" + authority + '/' + identifier);
        }
        throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
    }
}
