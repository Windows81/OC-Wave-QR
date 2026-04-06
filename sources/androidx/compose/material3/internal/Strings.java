package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Strings {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f12320b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f12321a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static int a(int i2) {
        return i2;
    }

    public static boolean b(int i2, Object obj) {
        return (obj instanceof Strings) && i2 == ((Strings) obj).e();
    }

    public static int c(int i2) {
        return Integer.hashCode(i2);
    }

    public static String d(int i2) {
        return "Strings(value=" + i2 + ')';
    }

    public final /* synthetic */ int e() {
        return this.f12321a;
    }

    public boolean equals(Object obj) {
        return b(this.f12321a, obj);
    }

    public int hashCode() {
        return c(this.f12321a);
    }

    public String toString() {
        return d(this.f12321a);
    }
}
