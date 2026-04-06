package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class KeyboardType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18852b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18853c = l(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18854d = l(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18855e = l(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18856f = l(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18857g = l(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f18858h = l(5);

    /* renamed from: i  reason: collision with root package name */
    public static final int f18859i = l(6);

    /* renamed from: j  reason: collision with root package name */
    public static final int f18860j = l(7);

    /* renamed from: k  reason: collision with root package name */
    public static final int f18861k = l(8);

    /* renamed from: l  reason: collision with root package name */
    public static final int f18862l = l(9);

    /* renamed from: a  reason: collision with root package name */
    public final int f18863a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return KeyboardType.f18855e;
        }

        public final int b() {
            return KeyboardType.f18862l;
        }

        public final int c() {
            return KeyboardType.f18859i;
        }

        public final int d() {
            return KeyboardType.f18856f;
        }

        public final int e() {
            return KeyboardType.f18861k;
        }

        public final int f() {
            return KeyboardType.f18860j;
        }

        public final int g() {
            return KeyboardType.f18857g;
        }

        public final int h() {
            return KeyboardType.f18854d;
        }

        public final int i() {
            return KeyboardType.f18853c;
        }

        public final int j() {
            return KeyboardType.f18858h;
        }

        public Companion() {
        }
    }

    public /* synthetic */ KeyboardType(int i2) {
        this.f18863a = i2;
    }

    public static final /* synthetic */ KeyboardType k(int i2) {
        return new KeyboardType(i2);
    }

    public static int l(int i2) {
        return i2;
    }

    public static boolean m(int i2, Object obj) {
        return (obj instanceof KeyboardType) && i2 == ((KeyboardType) obj).q();
    }

    public static final boolean n(int i2, int i3) {
        return i2 == i3;
    }

    public static int o(int i2) {
        return Integer.hashCode(i2);
    }

    public static String p(int i2) {
        return n(i2, f18853c) ? "Unspecified" : n(i2, f18854d) ? "Text" : n(i2, f18855e) ? "Ascii" : n(i2, f18856f) ? "Number" : n(i2, f18857g) ? "Phone" : n(i2, f18858h) ? "Uri" : n(i2, f18859i) ? "Email" : n(i2, f18860j) ? "Password" : n(i2, f18861k) ? "NumberPassword" : n(i2, f18862l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.f18863a, obj);
    }

    public int hashCode() {
        return o(this.f18863a);
    }

    public final /* synthetic */ int q() {
        return this.f18863a;
    }

    public String toString() {
        return p(this.f18863a);
    }
}
