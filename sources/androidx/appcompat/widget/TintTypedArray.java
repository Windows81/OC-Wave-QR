package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;

public class TintTypedArray {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1322a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1323b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1324c;

    public static class Api21Impl {
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        public static int b(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f1322a = context;
        this.f1323b = typedArray;
    }

    public static TintTypedArray s(Context context, int i2, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static TintTypedArray t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static TintTypedArray u(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z2) {
        return this.f1323b.getBoolean(i2, z2);
    }

    public int b(int i2, int i3) {
        return this.f1323b.getColor(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = androidx.appcompat.content.res.AppCompatResources.a(r2.f1322a, (r0 = r2.f1323b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1323b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f1323b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f1322a
            android.content.res.ColorStateList r0 = androidx.appcompat.content.res.AppCompatResources.a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f1323b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.TintTypedArray.c(int):android.content.res.ColorStateList");
    }

    public int d(int i2, int i3) {
        return this.f1323b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.f1323b.getDimensionPixelSize(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f1323b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable f(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1323b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f1323b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f1322a
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f1323b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.TintTypedArray.f(int):android.graphics.drawable.Drawable");
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.f1323b.hasValue(i2) || (resourceId = this.f1323b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return AppCompatDrawableManager.b().d(this.f1322a, resourceId, true);
    }

    public float h(int i2, float f2) {
        return this.f1323b.getFloat(i2, f2);
    }

    public Typeface i(int i2, int i3, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f1323b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1324c == null) {
            this.f1324c = new TypedValue();
        }
        return ResourcesCompat.g(this.f1322a, resourceId, this.f1324c, i3, fontCallback);
    }

    public int j(int i2, int i3) {
        return this.f1323b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.f1323b.getInteger(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f1323b.getLayoutDimension(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.f1323b.getResourceId(i2, i3);
    }

    public String n(int i2) {
        return this.f1323b.getString(i2);
    }

    public CharSequence o(int i2) {
        return this.f1323b.getText(i2);
    }

    public CharSequence[] p(int i2) {
        return this.f1323b.getTextArray(i2);
    }

    public TypedArray q() {
        return this.f1323b;
    }

    public boolean r(int i2) {
        return this.f1323b.hasValue(i2);
    }

    public void v() {
        this.f1323b.recycle();
    }
}
