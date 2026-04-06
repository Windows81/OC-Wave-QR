package coil.map;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import coil.request.Options;
import kotlin.Metadata;

@Metadata
public final class ResourceIntMapper implements Mapper<Integer, Uri> {
    public /* bridge */ /* synthetic */ Object a(Object obj, Options options) {
        return c(((Number) obj).intValue(), options);
    }

    public final boolean b(int i2, Context context) {
        try {
            return context.getResources().getResourceEntryName(i2) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public Uri c(int i2, Options options) {
        if (!b(i2, options.g())) {
            return null;
        }
        return Uri.parse("android.resource://" + options.g().getPackageName() + '/' + i2);
    }
}
