package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
final class CenteredArray {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f17221a;

    public static int[] a(int[] iArr) {
        return iArr;
    }

    public static boolean b(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && Intrinsics.d(iArr, ((CenteredArray) obj).h());
    }

    public static final int c(int[] iArr, int i2) {
        return iArr[i2 + d(iArr)];
    }

    public static final int d(int[] iArr) {
        return iArr.length / 2;
    }

    public static int e(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void f(int[] iArr, int i2, int i3) {
        iArr[i2 + d(iArr)] = i3;
    }

    public static String g(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return b(this.f17221a, obj);
    }

    public final /* synthetic */ int[] h() {
        return this.f17221a;
    }

    public int hashCode() {
        return e(this.f17221a);
    }

    public String toString() {
        return g(this.f17221a);
    }
}
