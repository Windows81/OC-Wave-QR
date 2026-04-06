package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class ColorMatrix {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f15992a;

    public static float[] a(float[] fArr) {
        return fArr;
    }

    public static boolean b(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.d(fArr, ((ColorMatrix) obj).e());
    }

    public static int c(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static String d(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public final /* synthetic */ float[] e() {
        return this.f15992a;
    }

    public boolean equals(Object obj) {
        return b(this.f15992a, obj);
    }

    public int hashCode() {
        return c(this.f15992a);
    }

    public String toString() {
        return d(this.f15992a);
    }
}
