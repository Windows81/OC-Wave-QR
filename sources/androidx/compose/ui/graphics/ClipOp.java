package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class ClipOp {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15971b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f15972c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f15973d = c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f15974a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ClipOp.f15972c;
        }

        public final int b() {
            return ClipOp.f15973d;
        }

        public Companion() {
        }
    }

    public static int c(int i2) {
        return i2;
    }

    public static boolean d(int i2, Object obj) {
        return (obj instanceof ClipOp) && i2 == ((ClipOp) obj).h();
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        return e(i2, f15972c) ? "Difference" : e(i2, f15973d) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return d(this.f15974a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f15974a;
    }

    public int hashCode() {
        return f(this.f15974a);
    }

    public String toString() {
        return g(this.f15974a);
    }
}
