package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class FocusDirection {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15729b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f15730c = j(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f15731d = j(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f15732e = j(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f15733f = j(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f15734g = j(5);

    /* renamed from: h  reason: collision with root package name */
    public static final int f15735h = j(6);

    /* renamed from: i  reason: collision with root package name */
    public static final int f15736i = j(7);

    /* renamed from: j  reason: collision with root package name */
    public static final int f15737j = j(8);

    /* renamed from: a  reason: collision with root package name */
    public final int f15738a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return FocusDirection.f15735h;
        }

        public final int b() {
            return FocusDirection.f15736i;
        }

        public final int c() {
            return FocusDirection.f15737j;
        }

        public final int d() {
            return FocusDirection.f15732e;
        }

        public final int e() {
            return FocusDirection.f15730c;
        }

        public final int f() {
            return FocusDirection.f15731d;
        }

        public final int g() {
            return FocusDirection.f15733f;
        }

        public final int h() {
            return FocusDirection.f15734g;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FocusDirection(int i2) {
        this.f15738a = i2;
    }

    public static final /* synthetic */ FocusDirection i(int i2) {
        return new FocusDirection(i2);
    }

    public static int j(int i2) {
        return i2;
    }

    public static boolean k(int i2, Object obj) {
        return (obj instanceof FocusDirection) && i2 == ((FocusDirection) obj).o();
    }

    public static final boolean l(int i2, int i3) {
        return i2 == i3;
    }

    public static int m(int i2) {
        return Integer.hashCode(i2);
    }

    public static String n(int i2) {
        return l(i2, f15730c) ? "Next" : l(i2, f15731d) ? "Previous" : l(i2, f15732e) ? "Left" : l(i2, f15733f) ? "Right" : l(i2, f15734g) ? "Up" : l(i2, f15735h) ? "Down" : l(i2, f15736i) ? "Enter" : l(i2, f15737j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f15738a, obj);
    }

    public int hashCode() {
        return m(this.f15738a);
    }

    public final /* synthetic */ int o() {
        return this.f15738a;
    }

    public String toString() {
        return n(this.f15738a);
    }
}
