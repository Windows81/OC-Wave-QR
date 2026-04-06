package androidx.core.graphics;

import android.graphics.Paint;

public final class PaintCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f19778a = new ThreadLocal();

    public static class Api23Impl {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static class Api29Impl {
    }

    public static boolean a(Paint paint, String str) {
        return Api23Impl.a(paint, str);
    }
}
