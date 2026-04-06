package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RadialGradient extends ShaderBrush {

    /* renamed from: e  reason: collision with root package name */
    public final List f16103e;

    /* renamed from: f  reason: collision with root package name */
    public final List f16104f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16105g;

    /* renamed from: h  reason: collision with root package name */
    public final float f16106h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16107i;

    public long b() {
        if ((Float.floatToRawIntBits(this.f16106h) & Integer.MAX_VALUE) >= 2139095040) {
            return Size.f15876b.a();
        }
        float f2 = this.f16106h;
        float f3 = (float) 2;
        return Size.d((((long) Float.floatToRawIntBits(f2 * f3)) << 32) | (((long) Float.floatToRawIntBits(f2 * f3)) & 4294967295L));
    }

    public Shader c(long j2) {
        float f2;
        float f3;
        long j3 = this.f16105g;
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            long b2 = SizeKt.b(j2);
            f2 = Float.intBitsToFloat((int) (b2 >> 32));
            f3 = Float.intBitsToFloat((int) (b2 & 4294967295L));
        } else {
            f2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j3 >> 32)) == Float.POSITIVE_INFINITY ? j2 >> 32 : this.f16105g >> 32));
            f3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f16105g & 4294967295L)) == Float.POSITIVE_INFINITY ? j2 & 4294967295L : this.f16105g & 4294967295L));
        }
        List list = this.f16103e;
        List list2 = this.f16104f;
        long e2 = Offset.e((((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f3))));
        float f4 = this.f16106h;
        return ShaderKt.b(e2, f4 == Float.POSITIVE_INFINITY ? Size.h(j2) / ((float) 2) : f4, list, list2, this.f16107i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return Intrinsics.d(this.f16103e, radialGradient.f16103e) && Intrinsics.d(this.f16104f, radialGradient.f16104f) && Offset.j(this.f16105g, radialGradient.f16105g) && this.f16106h == radialGradient.f16106h && TileMode.g(this.f16107i, radialGradient.f16107i);
    }

    public int hashCode() {
        int hashCode = this.f16103e.hashCode() * 31;
        List list = this.f16104f;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.o(this.f16105g)) * 31) + Float.hashCode(this.f16106h)) * 31) + TileMode.h(this.f16107i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.f16105g & 9223372034707292159L) != 9205357640488583168L) {
            str = "center=" + Offset.s(this.f16105g) + ", ";
        } else {
            str = str2;
        }
        if ((Float.floatToRawIntBits(this.f16106h) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.f16106h + ", ";
        }
        return "RadialGradient(colors=" + this.f16103e + ", stops=" + this.f16104f + ", " + str + str2 + "tileMode=" + TileMode.i(this.f16107i) + ')';
    }
}
