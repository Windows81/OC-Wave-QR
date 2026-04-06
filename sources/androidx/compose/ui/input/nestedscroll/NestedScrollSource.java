package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class NestedScrollSource {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16795b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16796c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f16797d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f16798e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f16799f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f16800g = c(3);

    /* renamed from: h  reason: collision with root package name */
    public static final int f16801h;

    /* renamed from: a  reason: collision with root package name */
    public final int f16802a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return NestedScrollSource.f16797d;
        }

        public final int b() {
            return NestedScrollSource.f16796c;
        }

        public Companion() {
        }
    }

    static {
        int c2 = c(1);
        f16796c = c2;
        int c3 = c(2);
        f16797d = c3;
        f16798e = c2;
        f16799f = c3;
        f16801h = c2;
    }

    public static int c(int i2) {
        return i2;
    }

    public static boolean d(int i2, Object obj) {
        return (obj instanceof NestedScrollSource) && i2 == ((NestedScrollSource) obj).h();
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        return e(i2, f16796c) ? "UserInput" : e(i2, f16797d) ? "SideEffect" : e(i2, f16800g) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return d(this.f16802a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f16802a;
    }

    public int hashCode() {
        return f(this.f16802a);
    }

    public String toString() {
        return g(this.f16802a);
    }
}
