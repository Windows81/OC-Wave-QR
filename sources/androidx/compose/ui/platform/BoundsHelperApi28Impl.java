package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BoundsHelperApi28Impl implements BoundsHelper {

    /* renamed from: b  reason: collision with root package name */
    public static final BoundsHelperApi28Impl f17662b = new BoundsHelperApi28Impl();

    public Rect a(Activity activity) {
        DisplayCutout a2;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        boolean z2 = true;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
                Intrinsics.g(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", (Class[]) null).invoke(obj, (Object[]) null);
                Intrinsics.g(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException ? true : e2 instanceof NoSuchMethodException ? true : e2 instanceof IllegalAccessException)) {
                z2 = e2 instanceof InvocationTargetException;
            }
            if (z2) {
                AndroidWindowInfo_androidKt.h(activity, rect);
            } else {
                throw e2;
            }
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int b2 = AndroidWindowInfo_androidKt.g(activity);
            int i2 = rect.bottom;
            if (i2 + b2 == point.y) {
                rect.bottom = i2 + b2;
            } else {
                int i3 = rect.right;
                if (i3 + b2 == point.x) {
                    rect.right = i3 + b2;
                } else if (rect.left == b2) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (a2 = AndroidWindowInfo_androidKt.f(defaultDisplay)) != null) {
            if (rect.left == a2.getSafeInsetLeft()) {
                rect.left = 0;
            }
            if (point.x - rect.right == a2.getSafeInsetRight()) {
                rect.right += a2.getSafeInsetRight();
            }
            if (rect.top == a2.getSafeInsetTop()) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == a2.getSafeInsetBottom()) {
                rect.bottom += a2.getSafeInsetBottom();
            }
        }
        return rect;
    }
}
