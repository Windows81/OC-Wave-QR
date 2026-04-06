package coil;

import android.content.Context;
import coil.ImageLoader;
import kotlin.Metadata;

@Metadata
public final class ImageLoaders {
    public static final ImageLoader a(Context context) {
        return new ImageLoader.Builder(context).b();
    }
}
