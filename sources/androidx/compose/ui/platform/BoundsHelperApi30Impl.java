package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.Metadata;

@Metadata
final class BoundsHelperApi30Impl implements BoundsHelper {

    /* renamed from: b  reason: collision with root package name */
    public static final BoundsHelperApi30Impl f17664b = new BoundsHelperApi30Impl();

    public Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
