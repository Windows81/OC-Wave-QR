package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class NavigationItemIconPosition {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f10462b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f10463c = b(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f10464d = b(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f10465a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return NavigationItemIconPosition.f10463c;
        }

        public Companion() {
        }
    }

    public static int b(int i2) {
        return i2;
    }

    public static boolean c(int i2, Object obj) {
        return (obj instanceof NavigationItemIconPosition) && i2 == ((NavigationItemIconPosition) obj).g();
    }

    public static final boolean d(int i2, int i3) {
        return i2 == i3;
    }

    public static int e(int i2) {
        return Integer.hashCode(i2);
    }

    public static String f(int i2) {
        return d(i2, f10463c) ? "Top" : d(i2, f10464d) ? "Start" : "Unknown";
    }

    public boolean equals(Object obj) {
        return c(this.f10465a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f10465a;
    }

    public int hashCode() {
        return e(this.f10465a);
    }

    public String toString() {
        return f(this.f10465a);
    }
}
