package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LinearGradient extends ShaderBrush {

    /* renamed from: e  reason: collision with root package name */
    public final List f16048e;

    /* renamed from: f  reason: collision with root package name */
    public final List f16049f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16050g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16051h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16052i;

    public /* synthetic */ LinearGradient(List list, List list2, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j2, j3, i2);
    }

    public long b() {
        float f2;
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f16050g >> 32));
        float f3 = Float.NaN;
        if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
            float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f16051h >> 32));
            if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                f2 = Math.abs(Float.intBitsToFloat((int) (this.f16050g >> 32)) - Float.intBitsToFloat((int) (this.f16051h >> 32)));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f16050g & 4294967295L));
                if (!Float.isInfinite(intBitsToFloat3) && !Float.isNaN(intBitsToFloat3)) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (this.f16051h & 4294967295L));
                    if (!Float.isInfinite(intBitsToFloat4) && !Float.isNaN(intBitsToFloat4)) {
                        f3 = Math.abs(Float.intBitsToFloat((int) (this.f16050g & 4294967295L)) - Float.intBitsToFloat((int) (this.f16051h & 4294967295L)));
                    }
                }
                return Size.d((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
            }
        }
        f2 = Float.NaN;
        float intBitsToFloat32 = Float.intBitsToFloat((int) (this.f16050g & 4294967295L));
        float intBitsToFloat42 = Float.intBitsToFloat((int) (this.f16051h & 4294967295L));
        f3 = Math.abs(Float.intBitsToFloat((int) (this.f16050g & 4294967295L)) - Float.intBitsToFloat((int) (this.f16051h & 4294967295L)));
        return Size.d((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    public Shader c(long j2) {
        return ShaderKt.a(Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f16050g >> 32)) == Float.POSITIVE_INFINITY ? j2 >> 32 : this.f16050g >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f16050g & 4294967295L)) == Float.POSITIVE_INFINITY ? j2 & 4294967295L : this.f16050g & 4294967295L)))) & 4294967295L)), Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f16051h & 4294967295L)) == Float.POSITIVE_INFINITY ? j2 & 4294967295L : this.f16051h & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f16051h >> 32)) == Float.POSITIVE_INFINITY ? j2 >> 32 : this.f16051h >> 32)))) << 32)), this.f16048e, this.f16049f, this.f16052i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return Intrinsics.d(this.f16048e, linearGradient.f16048e) && Intrinsics.d(this.f16049f, linearGradient.f16049f) && Offset.j(this.f16050g, linearGradient.f16050g) && Offset.j(this.f16051h, linearGradient.f16051h) && TileMode.g(this.f16052i, linearGradient.f16052i);
    }

    public int hashCode() {
        int hashCode = this.f16048e.hashCode() * 31;
        List list = this.f16049f;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.o(this.f16050g)) * 31) + Offset.o(this.f16051h)) * 31) + TileMode.h(this.f16052i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.f16050g & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & -9223372034707292160L) == 0) {
            str = "start=" + Offset.s(this.f16050g) + ", ";
        } else {
            str = str2;
        }
        if ((((9187343241974906880L ^ (this.f16051h & 9187343241974906880L)) - 4294967297L) & -9223372034707292160L) == 0) {
            str2 = "end=" + Offset.s(this.f16051h) + ", ";
        }
        return "LinearGradient(colors=" + this.f16048e + ", stops=" + this.f16049f + ", " + str + str2 + "tileMode=" + TileMode.i(this.f16052i) + ')';
    }

    public LinearGradient(List list, List list2, long j2, long j3, int i2) {
        this.f16048e = list;
        this.f16049f = list2;
        this.f16050g = j2;
        this.f16051h = j3;
        this.f16052i = i2;
    }
}
