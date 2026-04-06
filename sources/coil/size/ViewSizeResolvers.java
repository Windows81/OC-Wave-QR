package coil.size;

import android.view.View;
import kotlin.Metadata;

@Metadata
public final class ViewSizeResolvers {
    public static final ViewSizeResolver a(View view, boolean z2) {
        return new RealViewSizeResolver(view, z2);
    }

    public static /* synthetic */ ViewSizeResolver b(View view, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return a(view, z2);
    }
}
