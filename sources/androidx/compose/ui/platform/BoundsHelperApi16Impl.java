package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import kotlin.Metadata;

@Metadata
final class BoundsHelperApi16Impl implements BoundsHelper {

    /* renamed from: b  reason: collision with root package name */
    public static final BoundsHelperApi16Impl f17660b = new BoundsHelperApi16Impl();

    public Rect a(Activity activity) {
        int i2;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i3 = point.x;
        if (i3 == 0 || (i2 = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i3;
            rect.bottom = i2;
        }
        return rect;
    }
}
