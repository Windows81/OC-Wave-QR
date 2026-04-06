package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TimePickerLayoutType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11517b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11518c = a(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f11519d = a(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f11520a;

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
        return (obj instanceof TimePickerLayoutType) && i2 == ((TimePickerLayoutType) obj).f();
    }

    public static final boolean c(int i2, int i3) {
        return i2 == i3;
    }

    public static int d(int i2) {
        return Integer.hashCode(i2);
    }

    public static String e(int i2) {
        return c(i2, f11518c) ? "Horizontal" : c(i2, f11519d) ? "Vertical" : "Unknown";
    }

    public boolean equals(Object obj) {
        return b(this.f11520a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f11520a;
    }

    public int hashCode() {
        return d(this.f11520a);
    }

    public String toString() {
        return e(this.f11520a);
    }
}
