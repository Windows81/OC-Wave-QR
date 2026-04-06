package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: A  reason: collision with root package name */
    public final ImageView f23714A;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && Intrinsics.d(r(), ((ImageViewTarget) obj).r());
    }

    public Drawable f() {
        return r().getDrawable();
    }

    public void h(Drawable drawable) {
        r().setImageDrawable(drawable);
    }

    public int hashCode() {
        return r().hashCode();
    }

    /* renamed from: n */
    public ImageView r() {
        return this.f23714A;
    }
}
