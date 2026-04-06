package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata
public final class AndroidWindowInfo_androidKt {
    public static final long d(AndroidComposeView androidComposeView) {
        Context context = androidComposeView.getContext();
        Activity e2 = e(context);
        if (e2 != null) {
            Rect a2 = BoundsHelper.f17658a.a().a(e2);
            int width = a2.width();
            return IntSize.c((((long) a2.height()) & 4294967295L) | (((long) width) << 32));
        }
        Configuration configuration = context.getResources().getConfiguration();
        float f2 = context.getResources().getDisplayMetrics().density;
        int round = Math.round(((float) configuration.screenWidthDp) * f2);
        return IntSize.c((((long) Math.round(((float) configuration.screenHeightDp) * f2)) & 4294967295L) | (((long) round) << 32));
    }

    public static final Activity e(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static final DisplayCutout f(Display display) {
        boolean z2 = true;
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class[]) null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance((Object[]) null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, new Object[]{newInstance});
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (r.a(obj)) {
                return s.a(obj);
            }
            return null;
        } catch (Exception e2) {
            if (!(e2 instanceof ClassNotFoundException ? true : e2 instanceof NoSuchMethodException ? true : e2 instanceof NoSuchFieldException ? true : e2 instanceof IllegalAccessException ? true : e2 instanceof InvocationTargetException)) {
                z2 = e2 instanceof InstantiationException;
            }
            if (z2) {
                return null;
            }
            throw e2;
        }
    }

    public static final int g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final void h(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
