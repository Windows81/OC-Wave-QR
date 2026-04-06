package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DrawableUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1190a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1191b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f1192c = new Rect();

    public static class Api18Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f1193a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f1194b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f1195c;

        /* renamed from: d  reason: collision with root package name */
        public static final Field f1196d;

        /* renamed from: e  reason: collision with root package name */
        public static final Field f1197e;

        /* renamed from: f  reason: collision with root package name */
        public static final Field f1198f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0057  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x0040, NoSuchFieldException -> 0x003d }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x0040, NoSuchFieldException -> 0x003d }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0034 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0032, ClassNotFoundException -> 0x0030, NoSuchFieldException -> 0x002d }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002b }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0046 }
                r8 = r0
                goto L_0x0048
            L_0x002b:
                r7 = r1
                goto L_0x0046
            L_0x002d:
                r6 = r1
            L_0x002e:
                r7 = r6
                goto L_0x0046
            L_0x0030:
                r6 = r1
                goto L_0x002e
            L_0x0032:
                r6 = r1
                goto L_0x002e
            L_0x0034:
                r5 = r1
            L_0x0035:
                r6 = r5
                goto L_0x002e
            L_0x0037:
                r5 = r1
            L_0x0038:
                r6 = r5
                goto L_0x002e
            L_0x003a:
                r5 = r1
            L_0x003b:
                r6 = r5
                goto L_0x002e
            L_0x003d:
                r4 = r1
                r5 = r4
                goto L_0x0035
            L_0x0040:
                r4 = r1
                r5 = r4
                goto L_0x0038
            L_0x0043:
                r4 = r1
                r5 = r4
                goto L_0x003b
            L_0x0046:
                r3 = r1
                r8 = r2
            L_0x0048:
                if (r8 == 0) goto L_0x0057
                f1194b = r4
                f1195c = r5
                f1196d = r6
                f1197e = r7
                f1198f = r3
                f1193a = r0
                goto L_0x0063
            L_0x0057:
                f1194b = r1
                f1195c = r1
                f1196d = r1
                f1197e = r1
                f1198f = r1
                f1193a = r2
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.Api18Impl.<clinit>():void");
        }

        public static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1193a) {
                try {
                    Object invoke = f1194b.invoke(drawable, (Object[]) null);
                    if (invoke != null) {
                        return new Rect(f1195c.getInt(invoke), f1196d.getInt(invoke), f1197e.getInt(invoke), f1198f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return DrawableUtils.f1192c;
        }
    }

    public static class Api29Impl {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1190a);
        } else {
            drawable.setState(f1191b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return Api18Impl.a(DrawableCompat.p(drawable));
        }
        Insets a2 = Api29Impl.a(drawable);
        return new Rect(a2.left, a2.top, a2.right, a2.bottom);
    }

    public static PorterDuff.Mode e(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
