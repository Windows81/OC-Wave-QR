package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TooltipAnchorPosition {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11568b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11569c = g(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f11570d = g(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f11571e = g(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f11572f = g(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f11573g = g(5);

    /* renamed from: h  reason: collision with root package name */
    public static final int f11574h = g(6);

    /* renamed from: a  reason: collision with root package name */
    public final int f11575a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TooltipAnchorPosition.f11569c;
        }

        public final int b() {
            return TooltipAnchorPosition.f11570d;
        }

        public final int c() {
            return TooltipAnchorPosition.f11574h;
        }

        public final int d() {
            return TooltipAnchorPosition.f11571e;
        }

        public final int e() {
            return TooltipAnchorPosition.f11572f;
        }

        public final int f() {
            return TooltipAnchorPosition.f11573g;
        }

        public Companion() {
        }
    }

    public static int g(int i2) {
        return i2;
    }

    public static boolean h(int i2, Object obj) {
        return (obj instanceof TooltipAnchorPosition) && i2 == ((TooltipAnchorPosition) obj).l();
    }

    public static final boolean i(int i2, int i3) {
        return i2 == i3;
    }

    public static int j(int i2) {
        return Integer.hashCode(i2);
    }

    public static String k(int i2) {
        return i(i2, f11569c) ? "Above" : i(i2, f11570d) ? "Below" : i(i2, f11571e) ? "Left" : i(i2, f11572f) ? "Right" : i(i2, f11573g) ? "Start" : i(i2, f11574h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f11575a, obj);
    }

    public int hashCode() {
        return j(this.f11575a);
    }

    public final /* synthetic */ int l() {
        return this.f11575a;
    }

    public String toString() {
        return k(this.f11575a);
    }
}
