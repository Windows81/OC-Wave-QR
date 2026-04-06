package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import kotlin.Metadata;

@Metadata
interface BoundsHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f17658a = Companion.f17659a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f17659a = new Companion();

        public final BoundsHelper a() {
            int i2 = Build.VERSION.SDK_INT;
            return i2 >= 30 ? BoundsHelperApi30Impl.f17664b : i2 >= 29 ? BoundsHelperApi29Impl.f17663b : i2 >= 28 ? BoundsHelperApi28Impl.f17662b : BoundsHelperApi24Impl.f17661b;
        }
    }

    Rect a(Activity activity);
}
