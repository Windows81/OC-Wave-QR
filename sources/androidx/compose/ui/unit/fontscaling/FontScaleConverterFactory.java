package androidx.compose.ui.unit.fontscaling;

import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.unit.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FontScaleConverterFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final FontScaleConverterFactory f19189a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f19190b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: c  reason: collision with root package name */
    public static volatile SparseArrayCompat f19191c = new SparseArrayCompat(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f19192d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f19193e = 8;

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        f19189a = fontScaleConverterFactory;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        f19192d = objArr;
        synchronized (objArr) {
            fontScaleConverterFactory.h(f19191c, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            fontScaleConverterFactory.h(f19191c, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            fontScaleConverterFactory.h(f19191c, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            fontScaleConverterFactory.h(f19191c, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            fontScaleConverterFactory.h(f19191c, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.f40552a;
        }
        if (fontScaleConverterFactory.e(f19191c.j(0)) - 0.01f > 1.03f) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.b("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public final FontScaleConverter a(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f2) {
        float[] fArr = f19190b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = f19190b[i2];
            fArr2[i2] = MathUtils.f19198a.b(fontScaleConverter.b(f3), fontScaleConverter2.b(f3), f2);
        }
        return new FontScaleConverterTable(f19190b, fArr2);
    }

    public final FontScaleConverter b(float f2) {
        FontScaleConverter fontScaleConverter;
        if (!f(f2)) {
            return null;
        }
        FontScaleConverter c2 = f19189a.c(f2);
        if (c2 != null) {
            return c2;
        }
        int i2 = f19191c.i(d(f2));
        if (i2 >= 0) {
            return (FontScaleConverter) f19191c.p(i2);
        }
        int i3 = -(i2 + 1);
        int i4 = i3 - 1;
        float f3 = 1.0f;
        if (i3 >= f19191c.o()) {
            FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f2});
            g(f2, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        if (i4 < 0) {
            float[] fArr = f19190b;
            fontScaleConverter = new FontScaleConverterTable(fArr, fArr);
        } else {
            f3 = e(f19191c.j(i4));
            fontScaleConverter = (FontScaleConverter) f19191c.p(i4);
        }
        FontScaleConverter a2 = a(fontScaleConverter, (FontScaleConverter) f19191c.p(i3), MathUtils.f19198a.a(0.0f, 1.0f, f3, e(f19191c.j(i3)), f2));
        g(f2, a2);
        return a2;
    }

    public final FontScaleConverter c(float f2) {
        return (FontScaleConverter) f19191c.g(d(f2));
    }

    public final int d(float f2) {
        return (int) (f2 * 100.0f);
    }

    public final float e(int i2) {
        return ((float) i2) / 100.0f;
    }

    public final boolean f(float f2) {
        return f2 >= 1.03f;
    }

    public final void g(float f2, FontScaleConverter fontScaleConverter) {
        synchronized (f19192d) {
            SparseArrayCompat e2 = f19191c.clone();
            f19189a.h(e2, f2, fontScaleConverter);
            f19191c = e2;
            Unit unit = Unit.f40552a;
        }
    }

    public final void h(SparseArrayCompat sparseArrayCompat, float f2, FontScaleConverter fontScaleConverter) {
        sparseArrayCompat.k(d(f2), fontScaleConverter);
    }
}
