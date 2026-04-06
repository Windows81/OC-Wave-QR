package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class DisplayMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f9856b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f9857c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f9858d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f9859a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return DisplayMode.f9858d;
        }

        public final int b() {
            return DisplayMode.f9857c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ DisplayMode(int i2) {
        this.f9859a = i2;
    }

    public static final /* synthetic */ DisplayMode c(int i2) {
        return new DisplayMode(i2);
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof DisplayMode) && i2 == ((DisplayMode) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f9857c) ? "Picker" : f(i2, f9858d) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f9859a, obj);
    }

    public int hashCode() {
        return g(this.f9859a);
    }

    public final /* synthetic */ int i() {
        return this.f9859a;
    }

    public String toString() {
        return h(this.f9859a);
    }
}
