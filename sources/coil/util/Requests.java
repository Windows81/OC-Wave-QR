package coil.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil.request.CachePolicy;
import coil.request.DefaultRequestOptions;
import coil.request.ImageRequest;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.ViewSizeResolver;
import coil.target.ViewTarget;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
/* renamed from: coil.util.-Requests  reason: invalid class name */
public final class Requests {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultRequestOptions f23734a = new DefaultRequestOptions((CoroutineDispatcher) null, (CoroutineDispatcher) null, (CoroutineDispatcher) null, (CoroutineDispatcher) null, (Transition.Factory) null, (Precision) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (CachePolicy) null, (CachePolicy) null, (CachePolicy) null, 32767, (DefaultConstructorMarker) null);

    @Metadata
    /* renamed from: coil.util.-Requests$WhenMappings */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23735a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                coil.size.Precision[] r0 = coil.size.Precision.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                coil.size.Precision r1 = coil.size.Precision.EXACT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                coil.size.Precision r1 = coil.size.Precision.INEXACT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                coil.size.Precision r1 = coil.size.Precision.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f23735a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.util.Requests.WhenMappings.<clinit>():void");
        }
    }

    public static final boolean a(ImageRequest imageRequest) {
        int i2 = WhenMappings.f23735a[imageRequest.H().ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else if ((imageRequest.q().m() != null || !(imageRequest.K() instanceof DisplaySizeResolver)) && (!(imageRequest.M() instanceof ViewTarget) || !(imageRequest.K() instanceof ViewSizeResolver) || !(((ViewTarget) imageRequest.M()).r() instanceof ImageView) || ((ViewTarget) imageRequest.M()).r() != ((ViewSizeResolver) imageRequest.K()).r())) {
                return false;
            }
        }
        return true;
    }

    public static final DefaultRequestOptions b() {
        return f23734a;
    }

    public static final Drawable c(ImageRequest imageRequest, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return Contexts.a(imageRequest.l(), num.intValue());
    }
}
