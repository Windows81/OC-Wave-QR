package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class ProcessResult {

    /* renamed from: a  reason: collision with root package name */
    public final int f16940a;

    public static int a(int i2) {
        return i2;
    }

    public static boolean b(int i2, Object obj) {
        return (obj instanceof ProcessResult) && i2 == ((ProcessResult) obj).e();
    }

    public static int c(int i2) {
        return Integer.hashCode(i2);
    }

    public static String d(int i2) {
        return "ProcessResult(value=" + i2 + ')';
    }

    public final /* synthetic */ int e() {
        return this.f16940a;
    }

    public boolean equals(Object obj) {
        return b(this.f16940a, obj);
    }

    public int hashCode() {
        return c(this.f16940a);
    }

    public String toString() {
        return d(this.f16940a);
    }
}
