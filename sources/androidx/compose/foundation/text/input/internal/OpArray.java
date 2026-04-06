package androidx.compose.foundation.text.input.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
final class OpArray {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6261a;

    public static int[] a(int i2) {
        return b(new int[(i2 * 3)]);
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }

    public static final int[] c(int[] iArr, int i2) {
        int[] copyOf = Arrays.copyOf(iArr, i2 * 3);
        Intrinsics.h(copyOf, "copyOf(...)");
        return b(copyOf);
    }

    public static boolean d(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && Intrinsics.d(iArr, ((OpArray) obj).i());
    }

    public static final int e(int[] iArr) {
        return iArr.length / 3;
    }

    public static int f(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void g(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = i2 * 3;
        iArr[i6] = i3;
        iArr[i6 + 1] = i4;
        iArr[i6 + 2] = i5;
    }

    public static String h(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f6261a, obj);
    }

    public int hashCode() {
        return f(this.f6261a);
    }

    public final /* synthetic */ int[] i() {
        return this.f6261a;
    }

    public String toString() {
        return h(this.f6261a);
    }
}
