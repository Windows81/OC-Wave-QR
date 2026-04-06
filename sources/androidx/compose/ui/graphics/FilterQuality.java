package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class FilterQuality {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16003b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16004c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16005d = c(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16006e = c(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f16007f = c(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f16008a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return FilterQuality.f16005d;
        }

        public final int b() {
            return FilterQuality.f16004c;
        }

        public Companion() {
        }
    }

    public static int c(int i2) {
        return i2;
    }

    public static boolean d(int i2, Object obj) {
        return (obj instanceof FilterQuality) && i2 == ((FilterQuality) obj).h();
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        return e(i2, f16004c) ? "None" : e(i2, f16005d) ? "Low" : e(i2, f16006e) ? "Medium" : e(i2, f16007f) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return d(this.f16008a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f16008a;
    }

    public int hashCode() {
        return f(this.f16008a);
    }

    public String toString() {
        return g(this.f16008a);
    }
}
