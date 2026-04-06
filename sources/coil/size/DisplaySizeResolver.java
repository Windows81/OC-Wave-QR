package coil.size;

import android.content.Context;
import android.util.DisplayMetrics;
import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DisplaySizeResolver implements SizeResolver {

    /* renamed from: z  reason: collision with root package name */
    public final Context f23693z;

    public DisplaySizeResolver(Context context) {
        this.f23693z = context;
    }

    public Object c(Continuation continuation) {
        DisplayMetrics displayMetrics = this.f23693z.getResources().getDisplayMetrics();
        Dimension.Pixels a2 = Dimensions.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new Size(a2, a2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisplaySizeResolver) && Intrinsics.d(this.f23693z, ((DisplaySizeResolver) obj).f23693z);
    }

    public int hashCode() {
        return this.f23693z.hashCode();
    }
}
