package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class ShortNavigationBarArrangement {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11014b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11015c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f11016d = c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f11017a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ShortNavigationBarArrangement.f11016d;
        }

        public final int b() {
            return ShortNavigationBarArrangement.f11015c;
        }

        public Companion() {
        }
    }

    public static int c(int i2) {
        return i2;
    }

    public static boolean d(int i2, Object obj) {
        return (obj instanceof ShortNavigationBarArrangement) && i2 == ((ShortNavigationBarArrangement) obj).h();
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        return e(i2, f11015c) ? "EqualWeight" : e(i2, f11016d) ? "Centered" : "Unknown";
    }

    public boolean equals(Object obj) {
        return d(this.f11017a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f11017a;
    }

    public int hashCode() {
        return f(this.f11017a);
    }

    public String toString() {
        return g(this.f11017a);
    }
}
