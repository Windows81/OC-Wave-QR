package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.core.R;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class GradientColorInflaterCompat {
    public static ColorStops a(ColorStops colorStops, int i2, int i3, boolean z2, int i4) {
        return colorStops != null ? colorStops : z2 ? new ColorStops(i2, i4, i3) : new ColorStops(i2, i3);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray i2 = TypedArrayUtils.i(resources, theme2, attributeSet, R.styleable.f19420B);
            float f2 = TypedArrayUtils.f(i2, xmlPullParser2, "startX", R.styleable.K, 0.0f);
            float f3 = TypedArrayUtils.f(i2, xmlPullParser2, "startY", R.styleable.L, 0.0f);
            float f4 = TypedArrayUtils.f(i2, xmlPullParser2, "endX", R.styleable.M, 0.0f);
            float f5 = TypedArrayUtils.f(i2, xmlPullParser2, "endY", R.styleable.N, 0.0f);
            float f6 = TypedArrayUtils.f(i2, xmlPullParser2, "centerX", R.styleable.F, 0.0f);
            float f7 = TypedArrayUtils.f(i2, xmlPullParser2, "centerY", R.styleable.G, 0.0f);
            int g2 = TypedArrayUtils.g(i2, xmlPullParser2, "type", R.styleable.E, 0);
            int b2 = TypedArrayUtils.b(i2, xmlPullParser2, "startColor", R.styleable.C, 0);
            boolean h2 = TypedArrayUtils.h(xmlPullParser2, "centerColor");
            int b3 = TypedArrayUtils.b(i2, xmlPullParser2, "centerColor", R.styleable.J, 0);
            int b4 = TypedArrayUtils.b(i2, xmlPullParser2, "endColor", R.styleable.D, 0);
            int g3 = TypedArrayUtils.g(i2, xmlPullParser2, "tileMode", R.styleable.I, 0);
            float f8 = f6;
            float f9 = TypedArrayUtils.f(i2, xmlPullParser2, "gradientRadius", R.styleable.H, 0.0f);
            i2.recycle();
            ColorStops a2 = a(c(resources, xmlPullParser, attributeSet, theme), b2, b4, h2, b3);
            if (g2 == 1) {
                float f10 = f8;
                if (f9 > 0.0f) {
                    int[] iArr = a2.f19737a;
                    return new RadialGradient(f10, f7, f9, iArr, a2.f19738b, d(g3));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g2 != 2) {
                return new LinearGradient(f2, f3, f4, f5, a2.f19737a, a2.f19738b, d(g3));
            } else {
                return new SweepGradient(f8, f7, a2.f19737a, a2.f19738b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.content.res.GradientColorInflaterCompat.ColorStops c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = androidx.core.R.styleable.O
            android.content.res.TypedArray r3 = androidx.core.content.res.TypedArrayUtils.i(r8, r11, r10, r3)
            int r5 = androidx.core.R.styleable.P
            boolean r5 = r3.hasValue(r5)
            int r6 = androidx.core.R.styleable.Q
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = androidx.core.R.styleable.P
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = androidx.core.R.styleable.Q
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r8 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r8.<init>((java.util.List) r4, (java.util.List) r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.GradientColorInflaterCompat.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.GradientColorInflaterCompat$ColorStops");
    }

    public static Shader.TileMode d(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final class ColorStops {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f19737a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f19738b;

        public ColorStops(List list, List list2) {
            int size = list.size();
            this.f19737a = new int[size];
            this.f19738b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f19737a[i2] = ((Integer) list.get(i2)).intValue();
                this.f19738b[i2] = ((Float) list2.get(i2)).floatValue();
            }
        }

        public ColorStops(int i2, int i3) {
            this.f19737a = new int[]{i2, i3};
            this.f19738b = new float[]{0.0f, 1.0f};
        }

        public ColorStops(int i2, int i3, int i4) {
            this.f19737a = new int[]{i2, i3, i4};
            this.f19738b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
