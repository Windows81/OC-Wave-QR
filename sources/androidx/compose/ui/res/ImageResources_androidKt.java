package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ImageResources_androidKt {
    public static final ImageBitmap a(ImageBitmap.Companion companion, Resources resources, int i2) {
        Drawable drawable = resources.getDrawable(i2, (Resources.Theme) null);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AndroidImageBitmap_androidKt.c(((BitmapDrawable) drawable).getBitmap());
    }
}
