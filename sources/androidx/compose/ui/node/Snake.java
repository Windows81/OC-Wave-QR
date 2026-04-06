package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
final class Snake {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f17450a;

    public static final void a(int[] iArr, IntStack intStack) {
        int i2;
        boolean z2 = false;
        int i3 = iArr[0];
        int i4 = iArr[1];
        if (d(iArr)) {
            i2 = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i3 += ((iArr[4] != 0) | f(iArr)) ^ true ? 1 : 0;
            if (iArr[4] != 0) {
                z2 = true;
            }
            i4 += ((f(iArr) ^ true) | z2) ^ true ? 1 : 0;
        } else {
            i2 = iArr[2] - iArr[0];
        }
        intStack.g(i3, i4, i2);
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }

    public static boolean c(int[] iArr, Object obj) {
        return (obj instanceof Snake) && Intrinsics.d(iArr, ((Snake) obj).h());
    }

    public static final boolean d(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    public static int e(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final boolean f(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    public static String g(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Snake(");
        boolean z2 = false;
        sb.append(iArr[0]);
        sb.append(',');
        sb.append(iArr[1]);
        sb.append(',');
        sb.append(iArr[2]);
        sb.append(',');
        sb.append(iArr[3]);
        sb.append(',');
        if (iArr[4] != 0) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(')');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return c(this.f17450a, obj);
    }

    public final /* synthetic */ int[] h() {
        return this.f17450a;
    }

    public int hashCode() {
        return e(this.f17450a);
    }

    public String toString() {
        return g(this.f17450a);
    }
}
