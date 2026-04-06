package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import kotlin.Metadata;

@Metadata
final class BoundsHelperApi24Impl implements BoundsHelper {

    /* renamed from: b  reason: collision with root package name */
    public static final BoundsHelperApi24Impl f17661b = new BoundsHelperApi24Impl();

    public Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int b2 = AndroidWindowInfo_androidKt.g(activity);
            int i2 = rect.bottom;
            if (i2 + b2 == point.y) {
                rect.bottom = i2 + b2;
            } else {
                int i3 = rect.right;
                if (i3 + b2 == point.x) {
                    rect.right = i3 + b2;
                }
            }
        }
        return rect;
    }
}
