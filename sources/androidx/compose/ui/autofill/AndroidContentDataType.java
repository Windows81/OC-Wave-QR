package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
final class AndroidContentDataType implements ContentDataType {

    /* renamed from: b  reason: collision with root package name */
    public final int f15574b;

    public /* synthetic */ AndroidContentDataType(int i2) {
        this.f15574b = i2;
    }

    public static final /* synthetic */ AndroidContentDataType a(int i2) {
        return new AndroidContentDataType(i2);
    }

    public static int b(int i2) {
        return i2;
    }

    public static boolean c(int i2, Object obj) {
        return (obj instanceof AndroidContentDataType) && i2 == ((AndroidContentDataType) obj).f();
    }

    public static int d(int i2) {
        return Integer.hashCode(i2);
    }

    public static String e(int i2) {
        return "AndroidContentDataType(androidAutofillType=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f15574b, obj);
    }

    public final /* synthetic */ int f() {
        return this.f15574b;
    }

    public int hashCode() {
        return d(this.f15574b);
    }

    public String toString() {
        return e(this.f15574b);
    }
}
