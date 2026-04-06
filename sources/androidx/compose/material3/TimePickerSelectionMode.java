package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TimePickerSelectionMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11521b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11522c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f11523d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f11524a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TimePickerSelectionMode.f11522c;
        }

        public final int b() {
            return TimePickerSelectionMode.f11523d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TimePickerSelectionMode(int i2) {
        this.f11524a = i2;
    }

    public static final /* synthetic */ TimePickerSelectionMode c(int i2) {
        return new TimePickerSelectionMode(i2);
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof TimePickerSelectionMode) && i2 == ((TimePickerSelectionMode) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f11522c) ? "Hour" : f(i2, f11523d) ? "Minute" : "";
    }

    public boolean equals(Object obj) {
        return e(this.f11524a, obj);
    }

    public int hashCode() {
        return g(this.f11524a);
    }

    public final /* synthetic */ int i() {
        return this.f11524a;
    }

    public String toString() {
        return h(this.f11524a);
    }
}
