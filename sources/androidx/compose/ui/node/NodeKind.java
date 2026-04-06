package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class NodeKind<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f17405a;

    public static int a(int i2) {
        return i2;
    }

    public static boolean b(int i2, Object obj) {
        return (obj instanceof NodeKind) && i2 == ((NodeKind) obj).e();
    }

    public static int c(int i2) {
        return Integer.hashCode(i2);
    }

    public static String d(int i2) {
        return "NodeKind(mask=" + i2 + ')';
    }

    public final /* synthetic */ int e() {
        return this.f17405a;
    }

    public boolean equals(Object obj) {
        return b(this.f17405a, obj);
    }

    public int hashCode() {
        return c(this.f17405a);
    }

    public String toString() {
        return d(this.f17405a);
    }
}
