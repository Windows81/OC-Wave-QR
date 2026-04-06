package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BoundsHelperApi29Impl implements BoundsHelper {

    /* renamed from: b  reason: collision with root package name */
    public static final BoundsHelperApi29Impl f17663b = new BoundsHelperApi29Impl();

    public Rect a(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        boolean z2 = true;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
            Intrinsics.g(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException ? true : e2 instanceof NoSuchMethodException ? true : e2 instanceof IllegalAccessException)) {
                z2 = e2 instanceof InvocationTargetException;
            }
            if (z2) {
                return BoundsHelperApi28Impl.f17662b.a(activity);
            }
            throw e2;
        }
    }
}
