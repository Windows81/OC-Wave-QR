package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TimePickerDisplayMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11464b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11465c = b(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f11466d = b(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f11467a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TimePickerDisplayMode.f11465c;
        }

        public Companion() {
        }
    }

    public static int b(int i2) {
        return i2;
    }

    public static boolean c(int i2, Object obj) {
        return (obj instanceof TimePickerDisplayMode) && i2 == ((TimePickerDisplayMode) obj).g();
    }

    public static final boolean d(int i2, int i3) {
        return i2 == i3;
    }

    public static int e(int i2) {
        return Integer.hashCode(i2);
    }

    public static String f(int i2) {
        return d(i2, f11465c) ? "Picker" : d(i2, f11466d) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return c(this.f11467a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f11467a;
    }

    public int hashCode() {
        return e(this.f11467a);
    }

    public String toString() {
        return f(this.f11467a);
    }
}
