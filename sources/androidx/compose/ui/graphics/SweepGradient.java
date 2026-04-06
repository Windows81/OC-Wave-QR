package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SweepGradient extends ShaderBrush {

    /* renamed from: e  reason: collision with root package name */
    public final long f16140e;

    /* renamed from: f  reason: collision with root package name */
    public final List f16141f;

    /* renamed from: g  reason: collision with root package name */
    public final List f16142g;

    public Shader c(long j2) {
        long j3;
        long j4 = this.f16140e;
        if ((9223372034707292159L & j4) == 9205357640488583168L) {
            j3 = SizeKt.b(j2);
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j4 >> 32)) == Float.POSITIVE_INFINITY ? j2 >> 32 : this.f16140e >> 32));
            if (Float.intBitsToFloat((int) (this.f16140e & 4294967295L)) != Float.POSITIVE_INFINITY) {
                j2 = this.f16140e;
            }
            j3 = Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32));
        }
        return ShaderKt.c(j3, this.f16141f, this.f16142g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return Offset.j(this.f16140e, sweepGradient.f16140e) && Intrinsics.d(this.f16141f, sweepGradient.f16141f) && Intrinsics.d(this.f16142g, sweepGradient.f16142g);
    }

    public int hashCode() {
        int o2 = ((Offset.o(this.f16140e) * 31) + this.f16141f.hashCode()) * 31;
        List list = this.f16142g;
        return o2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        if ((this.f16140e & 9223372034707292159L) != 9205357640488583168L) {
            str = "center=" + Offset.s(this.f16140e) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.f16141f + ", stops=" + this.f16142g + ')';
    }
}
