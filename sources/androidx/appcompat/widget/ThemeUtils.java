package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.graphics.ColorUtils;

public class ThemeUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f1303a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1304b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1305c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1306d = {16843518};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1307e = {16842919};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1308f = {16842912};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1309g = {16842913};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f1310h = {-16842919, -16842908};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1311i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f1312j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.styleable.A0);
        try {
            if (!obtainStyledAttributes.hasValue(R.styleable.F0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList e2 = e(context, i2);
        if (e2 != null && e2.isStateful()) {
            return e2.getColorForState(f1304b, e2.getDefaultColor());
        }
        TypedValue f2 = f();
        context.getTheme().resolveAttribute(16842803, f2, true);
        return d(context, i2, f2.getFloat());
    }

    public static int c(Context context, int i2) {
        int[] iArr = f1312j;
        iArr[0] = i2;
        TintTypedArray t2 = TintTypedArray.t(context, (AttributeSet) null, iArr);
        try {
            return t2.b(0, 0);
        } finally {
            t2.v();
        }
    }

    public static int d(Context context, int i2, float f2) {
        int c2 = c(context, i2);
        return ColorUtils.f(c2, Math.round(((float) Color.alpha(c2)) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = f1312j;
        iArr[0] = i2;
        TintTypedArray t2 = TintTypedArray.t(context, (AttributeSet) null, iArr);
        try {
            return t2.c(0);
        } finally {
            t2.v();
        }
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f1303a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
