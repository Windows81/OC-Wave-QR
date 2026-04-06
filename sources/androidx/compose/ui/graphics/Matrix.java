package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
@JvmInline
public final class Matrix {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16053b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final float[] f16054a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ Matrix(float[] fArr) {
        this.f16054a = fArr;
    }

    public static final /* synthetic */ Matrix a(float[] fArr) {
        return new Matrix(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.d(fArr, ((Matrix) obj).q());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j2) {
        if (fArr.length < 16) {
            return j2;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[7];
        float f8 = fArr[12];
        float f9 = fArr[13];
        float f10 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float f11 = ((float) 1) / (((f4 * intBitsToFloat) + (f7 * intBitsToFloat2)) + f10);
        if ((Float.floatToRawIntBits(f11) & Integer.MAX_VALUE) >= 2139095040) {
            f11 = 0.0f;
        }
        return Offset.e((((long) Float.floatToRawIntBits((((f2 * intBitsToFloat) + (f5 * intBitsToFloat2)) + f8) * f11)) << 32) | (((long) Float.floatToRawIntBits(f11 * ((f3 * intBitsToFloat) + (f6 * intBitsToFloat2) + f9))) & 4294967295L));
    }

    public static final void g(float[] fArr, MutableRect mutableRect) {
        float[] fArr2 = fArr;
        MutableRect mutableRect2 = mutableRect;
        if (fArr2.length >= 16) {
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[3];
            float f5 = fArr2[4];
            float f6 = fArr2[5];
            float f7 = fArr2[7];
            float f8 = fArr2[12];
            float f9 = fArr2[13];
            float f10 = fArr2[15];
            float b2 = mutableRect.b();
            float d2 = mutableRect.d();
            float c2 = mutableRect.c();
            float a2 = mutableRect.a();
            float f11 = f4 * b2;
            float f12 = f7 * d2;
            float f13 = 1.0f / ((f11 + f12) + f10);
            float f14 = 0.0f;
            float f15 = f12;
            if ((Float.floatToRawIntBits(f13) & Integer.MAX_VALUE) >= 2139095040) {
                f13 = 0.0f;
            }
            float f16 = f2 * b2;
            float f17 = f5 * d2;
            float f18 = b2 * f3;
            float f19 = d2 * f6;
            float f20 = f13 * (f16 + f17 + f8);
            float f21 = f7 * a2;
            float f22 = 1.0f / ((f11 + f21) + f10);
            float f23 = f13 * (f18 + f19 + f9);
            float f24 = (Float.floatToRawIntBits(f22) & Integer.MAX_VALUE) < 2139095040 ? f22 : 0.0f;
            float f25 = f5 * a2;
            float f26 = (f16 + f25 + f8) * f24;
            float f27 = f6 * a2;
            float f28 = f24 * (f18 + f27 + f9);
            float f29 = f4 * c2;
            float f30 = 1.0f / ((f29 + f15) + f10);
            if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
                f30 = 0.0f;
            }
            float f31 = f2 * c2;
            float f32 = f30 * (f31 + f17 + f8);
            float f33 = f3 * c2;
            float f34 = f30 * (f19 + f33 + f9);
            float f35 = 1.0f / ((f29 + f21) + f10);
            if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040) {
                f14 = f35;
            }
            float f36 = (f31 + f25 + f8) * f14;
            float f37 = f14 * (f33 + f27 + f9);
            float f38 = f20;
            MutableRect mutableRect3 = mutableRect;
            mutableRect3.i(Math.min(f38, Math.min(f26, Math.min(f32, f36))));
            float f39 = f23;
            mutableRect3.k(Math.min(f39, Math.min(f28, Math.min(f34, f37))));
            mutableRect3.j(Math.max(f38, Math.max(f26, Math.max(f32, f36))));
            mutableRect3.h(Math.max(f39, Math.max(f28, Math.max(f34, f37))));
        }
    }

    public static final void h(float[] fArr) {
        if (fArr.length >= 16) {
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 1.0f;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = 0.0f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 1.0f;
        }
    }

    public static final void i(float[] fArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        float[] fArr2 = fArr;
        float f13 = f2;
        float f14 = f4;
        double d2 = ((double) f7) * 0.017453292519943295d;
        float sin = (float) Math.sin(d2);
        float cos = (float) Math.cos(d2);
        float f15 = -sin;
        float f16 = (f5 * cos) - (f6 * sin);
        float f17 = (f5 * sin) + (f6 * cos);
        double d3 = ((double) f8) * 0.017453292519943295d;
        float sin2 = (float) Math.sin(d3);
        float cos2 = (float) Math.cos(d3);
        float f18 = -sin2;
        float f19 = sin * sin2;
        float f20 = sin * cos2;
        float f21 = cos * sin2;
        float f22 = cos * cos2;
        float f23 = (f14 * cos2) + (f17 * sin2);
        float f24 = ((-f14) * sin2) + (f17 * cos2);
        float f25 = f16;
        double d4 = ((double) f9) * 0.017453292519943295d;
        float sin3 = (float) Math.sin(d4);
        float cos3 = (float) Math.cos(d4);
        float f26 = -sin3;
        float f27 = (f26 * cos2) + (cos3 * f19);
        float f28 = sin3 * cos;
        float f29 = cos * cos3;
        float f30 = ((cos2 * cos3) + (f19 * sin3)) * f10;
        float f31 = f28 * f10;
        float f32 = ((cos3 * f18) + (sin3 * f20)) * f10;
        float f33 = f27 * f11;
        float f34 = f29 * f11;
        float f35 = ((f26 * f18) + (cos3 * f20)) * f11;
        float f36 = f21 * f12;
        float f37 = f15 * f12;
        float f38 = f22 * f12;
        if (fArr2.length >= 16) {
            fArr2[0] = f30;
            fArr2[1] = f31;
            fArr2[2] = f32;
            fArr2[3] = 0.0f;
            fArr2[4] = f33;
            fArr2[5] = f34;
            fArr2[6] = f35;
            fArr2[7] = 0.0f;
            fArr2[8] = f36;
            fArr2[9] = f37;
            fArr2[10] = f38;
            fArr2[11] = 0.0f;
            float f39 = -f13;
            fArr2[12] = ((f30 * f39) - (f33 * f3)) + f23 + f13;
            fArr2[13] = ((f31 * f39) - (f34 * f3)) + f25 + f3;
            fArr2[14] = ((f39 * f32) - (f3 * f35)) + f24;
            fArr2[15] = 1.0f;
        }
    }

    public static final void j(float[] fArr, float f2) {
        float[] fArr2 = fArr;
        if (fArr2.length >= 16) {
            double d2 = ((double) f2) * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f3 = fArr2[1];
            float f4 = fArr2[2];
            float f5 = fArr2[5];
            float f6 = fArr2[6];
            float f7 = fArr2[9];
            float f8 = fArr2[10];
            float f9 = fArr2[13];
            float f10 = fArr2[14];
            fArr2[1] = (f3 * cos) - (f4 * sin);
            fArr2[2] = (f3 * sin) + (f4 * cos);
            fArr2[5] = (f5 * cos) - (f6 * sin);
            fArr2[6] = (f5 * sin) + (f6 * cos);
            fArr2[9] = (f7 * cos) - (f8 * sin);
            fArr2[10] = (f7 * sin) + (f8 * cos);
            fArr2[13] = (f9 * cos) - (f10 * sin);
            fArr2[14] = (f9 * sin) + (f10 * cos);
        }
    }

    public static final void k(float[] fArr, float f2) {
        float[] fArr2 = fArr;
        if (fArr2.length >= 16) {
            double d2 = ((double) f2) * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f3 = fArr2[0];
            float f4 = fArr2[4];
            float f5 = -sin;
            float f6 = fArr2[1];
            float f7 = fArr2[5];
            float f8 = fArr2[2];
            float f9 = fArr2[6];
            float f10 = fArr2[3];
            float f11 = fArr2[7];
            fArr2[0] = (cos * f3) + (sin * f4);
            fArr2[1] = (cos * f6) + (sin * f7);
            fArr2[2] = (cos * f8) + (sin * f9);
            fArr2[3] = (cos * f10) + (sin * f11);
            fArr2[4] = (f3 * f5) + (f4 * cos);
            fArr2[5] = (f6 * f5) + (f7 * cos);
            fArr2[6] = (f8 * f5) + (f9 * cos);
            fArr2[7] = (f5 * f10) + (cos * f11);
        }
    }

    public static final void l(float[] fArr, float f2, float f3, float f4) {
        if (fArr.length >= 16) {
            fArr[0] = fArr[0] * f2;
            fArr[1] = fArr[1] * f2;
            fArr[2] = fArr[2] * f2;
            fArr[3] = fArr[3] * f2;
            fArr[4] = fArr[4] * f3;
            fArr[5] = fArr[5] * f3;
            fArr[6] = fArr[6] * f3;
            fArr[7] = fArr[7] * f3;
            fArr[8] = fArr[8] * f4;
            fArr[9] = fArr[9] * f4;
            fArr[10] = fArr[10] * f4;
            fArr[11] = fArr[11] * f4;
        }
    }

    public static final void m(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        if (fArr3.length >= 16 && fArr4.length >= 16) {
            float f2 = fArr3[0];
            float f3 = fArr4[0];
            float f4 = fArr3[1];
            float f5 = fArr4[4];
            float f6 = fArr3[2];
            float f7 = fArr4[8];
            float f8 = fArr3[3];
            float f9 = fArr4[12];
            float f10 = (f2 * f3) + (f4 * f5) + (f6 * f7) + (f8 * f9);
            float f11 = fArr4[1];
            float f12 = fArr4[5];
            float f13 = fArr4[9];
            float f14 = fArr4[13];
            float f15 = (f2 * f11) + (f4 * f12) + (f6 * f13) + (f8 * f14);
            float f16 = fArr4[2];
            float f17 = fArr4[6];
            float f18 = fArr4[10];
            float f19 = fArr4[14];
            float f20 = (f2 * f16) + (f4 * f17) + (f6 * f18) + (f8 * f19);
            float f21 = fArr4[3];
            float f22 = fArr4[7];
            float f23 = fArr4[11];
            float f24 = fArr4[15];
            float f25 = (f2 * f21) + (f4 * f22) + (f6 * f23) + (f8 * f24);
            float f26 = fArr3[4];
            float f27 = fArr3[5];
            float f28 = fArr3[6];
            float f29 = fArr3[7];
            float f30 = (f26 * f3) + (f27 * f5) + (f28 * f7) + (f29 * f9);
            float f31 = (f26 * f11) + (f27 * f12) + (f28 * f13) + (f29 * f14);
            float f32 = (f26 * f16) + (f27 * f17) + (f28 * f18) + (f29 * f19);
            float f33 = (f26 * f21) + (f27 * f22) + (f28 * f23) + (f29 * f24);
            float f34 = fArr3[8];
            float f35 = fArr3[9];
            float f36 = fArr3[10];
            float f37 = fArr3[11];
            float f38 = (f34 * f11) + (f35 * f12) + (f36 * f13) + (f37 * f14);
            float f39 = fArr3[12];
            float f40 = fArr3[13];
            float f41 = (f3 * f39) + (f5 * f40);
            float f42 = fArr3[14];
            float f43 = f41 + (f7 * f42);
            float f44 = fArr3[15];
            fArr3[0] = f10;
            fArr3[1] = f15;
            fArr3[2] = f20;
            fArr3[3] = f25;
            fArr3[4] = f30;
            fArr3[5] = f31;
            fArr3[6] = f32;
            fArr3[7] = f33;
            fArr3[8] = (f34 * f3) + (f35 * f5) + (f36 * f7) + (f37 * f9);
            fArr3[9] = f38;
            fArr3[10] = (f34 * f16) + (f35 * f17) + (f36 * f18) + (f37 * f19);
            fArr3[11] = (f34 * f21) + (f35 * f22) + (f36 * f23) + (f37 * f24);
            fArr3[12] = f43 + (f9 * f44);
            fArr3[13] = (f11 * f39) + (f12 * f40) + (f13 * f42) + (f14 * f44);
            fArr3[14] = (f16 * f39) + (f17 * f40) + (f18 * f42) + (f19 * f44);
            fArr3[15] = (f39 * f21) + (f40 * f22) + (f42 * f23) + (f44 * f24);
        }
    }

    public static String n(float[] fArr) {
        return StringsKt.j("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void o(float[] fArr, float f2, float f3, float f4) {
        if (fArr.length >= 16) {
            float f5 = (fArr[0] * f2) + (fArr[4] * f3) + (fArr[8] * f4) + fArr[12];
            float f6 = (fArr[1] * f2) + (fArr[5] * f3) + (fArr[9] * f4) + fArr[13];
            float f7 = (fArr[2] * f2) + (fArr[6] * f3) + (fArr[10] * f4) + fArr[14];
            fArr[12] = f5;
            fArr[13] = f6;
            fArr[14] = f7;
            fArr[15] = (fArr[3] * f2) + (fArr[7] * f3) + (fArr[11] * f4) + fArr[15];
        }
    }

    public static /* synthetic */ void p(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        o(fArr, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        return d(this.f16054a, obj);
    }

    public int hashCode() {
        return e(this.f16054a);
    }

    public final /* synthetic */ float[] q() {
        return this.f16054a;
    }

    public String toString() {
        return n(this.f16054a);
    }
}
