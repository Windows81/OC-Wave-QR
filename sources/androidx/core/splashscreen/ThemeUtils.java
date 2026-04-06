package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ThemeUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final ThemeUtils f20068a = new ThemeUtils();

    @Metadata
    public static final class Api31 {

        /* renamed from: a  reason: collision with root package name */
        public static final Api31 f20069a = new Api31();

        @JvmStatic
        public static final void a(Resources.Theme theme, View view) {
            Intrinsics.i(theme, "theme");
            Intrinsics.i(view, "decor");
            c(theme, view, (TypedValue) null, 4, (Object) null);
        }

        @JvmStatic
        public static final void b(Resources.Theme theme, View view, TypedValue typedValue) {
            Intrinsics.i(theme, "theme");
            Intrinsics.i(view, "decor");
            Intrinsics.i(typedValue, "tv");
            int i2 = (!theme.resolveAttribute(16844000, typedValue, true) || typedValue.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(16844140, typedValue, true) && typedValue.data != 0) {
                i2 |= 16;
            }
            WindowInsetsController a2 = view.getWindowInsetsController();
            Intrinsics.f(a2);
            a2.setSystemBarsAppearance(i2, 24);
        }

        public static /* synthetic */ void c(Resources.Theme theme, View view, TypedValue typedValue, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                typedValue = new TypedValue();
            }
            b(theme, view, typedValue);
        }
    }
}
