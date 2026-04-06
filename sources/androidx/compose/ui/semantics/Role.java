package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Role {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18040b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18041c = k(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18042d = k(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18043e = k(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18044f = k(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18045g = k(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f18046h = k(5);

    /* renamed from: i  reason: collision with root package name */
    public static final int f18047i = k(6);

    /* renamed from: j  reason: collision with root package name */
    public static final int f18048j = k(7);

    /* renamed from: k  reason: collision with root package name */
    public static final int f18049k = k(8);

    /* renamed from: a  reason: collision with root package name */
    public final int f18050a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Role.f18041c;
        }

        public final int b() {
            return Role.f18049k;
        }

        public final int c() {
            return Role.f18042d;
        }

        public final int d() {
            return Role.f18047i;
        }

        public final int e() {
            return Role.f18046h;
        }

        public final int f() {
            return Role.f18044f;
        }

        public final int g() {
            return Role.f18043e;
        }

        public final int h() {
            return Role.f18045g;
        }

        public final int i() {
            return Role.f18048j;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Role(int i2) {
        this.f18050a = i2;
    }

    public static final /* synthetic */ Role j(int i2) {
        return new Role(i2);
    }

    public static int k(int i2) {
        return i2;
    }

    public static boolean l(int i2, Object obj) {
        return (obj instanceof Role) && i2 == ((Role) obj).p();
    }

    public static final boolean m(int i2, int i3) {
        return i2 == i3;
    }

    public static int n(int i2) {
        return Integer.hashCode(i2);
    }

    public static String o(int i2) {
        return m(i2, f18041c) ? "Button" : m(i2, f18042d) ? "Checkbox" : m(i2, f18043e) ? "Switch" : m(i2, f18044f) ? "RadioButton" : m(i2, f18045g) ? "Tab" : m(i2, f18046h) ? "Image" : m(i2, f18047i) ? "DropdownList" : m(i2, f18048j) ? "Picker" : m(i2, f18049k) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return l(this.f18050a, obj);
    }

    public int hashCode() {
        return n(this.f18050a);
    }

    public final /* synthetic */ int p() {
        return this.f18050a;
    }

    public String toString() {
        return o(this.f18050a);
    }
}
