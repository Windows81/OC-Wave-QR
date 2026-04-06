package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CanvasUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final CanvasUtils f15966a = new CanvasUtils();

    /* renamed from: b  reason: collision with root package name */
    public static Method f15967b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f15968c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f15969d;

    public final void a(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            CanvasZHelper.f15970a.a(canvas, z2);
            return;
        }
        if (!f15969d) {
            Class<Canvas> cls = Canvas.class;
            if (i2 == 28) {
                try {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f15967b = (Method) declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                    f15968c = (Method) declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f15967b = cls.getDeclaredMethod("insertReorderBarrier", (Class[]) null);
                f15968c = cls.getDeclaredMethod("insertInorderBarrier", (Class[]) null);
            }
            Method method2 = f15967b;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f15968c;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f15969d = true;
        }
        if (z2) {
            try {
                Method method4 = f15967b;
                if (method4 != null) {
                    Intrinsics.f(method4);
                    method4.invoke(canvas, (Object[]) null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z2 && (method = f15968c) != null) {
            Intrinsics.f(method);
            method.invoke(canvas, (Object[]) null);
        }
    }
}
