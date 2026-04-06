package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

class AppCompatTextViewAutoSizeHelper {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f1167l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap f1168m = new ConcurrentHashMap();

    /* renamed from: n  reason: collision with root package name */
    public static ConcurrentHashMap f1169n = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f1170a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1171b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f1172c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1173d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1174e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1175f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1176g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1177h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1178i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1179j;

    /* renamed from: k  reason: collision with root package name */
    public final Impl f1180k;

    public static final class Api16Impl {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i2, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    public static final class Api18Impl {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    public static final class Api23Impl {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3, TextView textView, TextPaint textPaint, Impl impl) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i3 == -1) {
                i3 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i3);
            try {
                impl.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    public static class Impl {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) AppCompatTextViewAutoSizeHelper.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public static class Impl23 extends Impl {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class Impl29 extends Impl23 {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public AppCompatTextViewAutoSizeHelper(TextView textView) {
        this.f1178i = textView;
        this.f1179j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1180k = new Impl29();
        } else {
            this.f1180k = new Impl23();
        }
    }

    public static Method k(String str) {
        try {
            Method method = (Method) f1168m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                f1168m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r4 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
        /*
            java.lang.reflect.Method r0 = k(r4)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x002a
        L_0x000a:
            r3 = move-exception
            goto L_0x000e
        L_0x000c:
            r3 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r3
        L_0x000f:
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.w(r0, r4, r3)
        L_0x002a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.m(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public void a() {
        if (n()) {
            if (this.f1171b) {
                if (this.f1178i.getMeasuredHeight() > 0 && this.f1178i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1180k.b(this.f1178i) ? 1048576 : (this.f1178i.getMeasuredWidth() - this.f1178i.getTotalPaddingLeft()) - this.f1178i.getTotalPaddingRight();
                    int height = (this.f1178i.getHeight() - this.f1178i.getCompoundPaddingBottom()) - this.f1178i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1167l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) measuredWidth;
                                rectF.bottom = (float) height;
                                float e2 = (float) e(rectF);
                                if (e2 != this.f1178i.getTextSize()) {
                                    t(0, e2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1171b = true;
        }
    }

    public final int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public final void c() {
        this.f1170a = 0;
        this.f1173d = -1.0f;
        this.f1174e = -1.0f;
        this.f1172c = -1.0f;
        this.f1175f = new int[0];
        this.f1171b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        return Api23Impl.a(charSequence, alignment, i2, i3, this.f1178i, this.f1177h, this.f1180k);
    }

    public final int e(RectF rectF) {
        int length = this.f1175f.length;
        if (length != 0) {
            int i2 = 1;
            int i3 = length - 1;
            int i4 = 0;
            while (i2 <= i3) {
                int i5 = (i2 + i3) / 2;
                if (x(this.f1175f[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i2;
                    i2 = i6;
                } else {
                    i4 = i5 - 1;
                    i3 = i4;
                }
            }
            return this.f1175f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public int f() {
        return Math.round(this.f1174e);
    }

    public int g() {
        return Math.round(this.f1173d);
    }

    public int h() {
        return Math.round(this.f1172c);
    }

    public int[] i() {
        return this.f1175f;
    }

    public int j() {
        return this.f1170a;
    }

    public void l(int i2) {
        TextPaint textPaint = this.f1177h;
        if (textPaint == null) {
            this.f1177h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1177h.set(this.f1178i.getPaint());
        this.f1177h.setTextSize((float) i2);
    }

    public boolean n() {
        return y() && this.f1170a != 0;
    }

    public void o(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1179j.obtainStyledAttributes(attributeSet, R.styleable.i0, i2, 0);
        TextView textView = this.f1178i;
        ViewCompat.S(textView, textView.getContext(), R.styleable.i0, attributeSet, obtainStyledAttributes, i2, 0);
        if (obtainStyledAttributes.hasValue(R.styleable.n0)) {
            this.f1170a = obtainStyledAttributes.getInt(R.styleable.n0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(R.styleable.m0) ? obtainStyledAttributes.getDimension(R.styleable.m0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(R.styleable.k0) ? obtainStyledAttributes.getDimension(R.styleable.k0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(R.styleable.j0) ? obtainStyledAttributes.getDimension(R.styleable.j0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(R.styleable.l0) && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.l0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f1170a = 0;
        } else if (this.f1170a == 1) {
            if (!this.f1176g) {
                DisplayMetrics displayMetrics = this.f1179j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i2, int i3, int i4, int i5) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1179j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(int[] iArr, int i2) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1179j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                this.f1175f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1176g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i2) {
        if (!y()) {
            return;
        }
        if (i2 == 0) {
            c();
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = this.f1179j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    public final void s(float f2) {
        if (f2 != this.f1178i.getPaint().getTextSize()) {
            this.f1178i.getPaint().setTextSize(f2);
            boolean a2 = Api18Impl.a(this.f1178i);
            if (this.f1178i.getLayout() != null) {
                this.f1171b = false;
                try {
                    Method k2 = k("nullLayouts");
                    if (k2 != null) {
                        k2.invoke(this.f1178i, (Object[]) null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!a2) {
                    this.f1178i.requestLayout();
                } else {
                    this.f1178i.forceLayout();
                }
                this.f1178i.invalidate();
            }
        }
    }

    public void t(int i2, float f2) {
        Context context = this.f1179j;
        s(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (!y() || this.f1170a != 1) {
            this.f1171b = false;
        } else {
            if (!this.f1176g || this.f1175f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1174e - this.f1173d) / this.f1172c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.f1173d + (((float) i2) * this.f1172c));
                }
                this.f1175f = b(iArr);
            }
            this.f1171b = true;
        }
        return this.f1171b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f1175f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        int[] iArr = this.f1175f;
        int length = iArr.length;
        boolean z2 = length > 0;
        this.f1176g = z2;
        if (z2) {
            this.f1170a = 1;
            this.f1173d = (float) iArr[0];
            this.f1174e = (float) iArr[length - 1];
            this.f1172c = -1.0f;
        }
        return z2;
    }

    public final boolean x(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1178i.getText();
        TransformationMethod transformationMethod = this.f1178i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1178i)) == null)) {
            text = transformation;
        }
        int b2 = Api16Impl.b(this.f1178i);
        l(i2);
        StaticLayout d2 = d(text, (Layout.Alignment) m(this.f1178i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b2);
        return (b2 == -1 || (d2.getLineCount() <= b2 && d2.getLineEnd(d2.getLineCount() - 1) == text.length())) && ((float) d2.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f1178i instanceof AppCompatEditText);
    }

    public final void z(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f1170a = 1;
            this.f1173d = f2;
            this.f1174e = f3;
            this.f1172c = f4;
            this.f1176g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }
}
