package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class PointerEventType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16852b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16853c = h(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16854d = h(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16855e = h(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f16856f = h(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f16857g = h(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f16858h = h(5);

    /* renamed from: i  reason: collision with root package name */
    public static final int f16859i = h(6);

    /* renamed from: a  reason: collision with root package name */
    public final int f16860a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return PointerEventType.f16857g;
        }

        public final int b() {
            return PointerEventType.f16858h;
        }

        public final int c() {
            return PointerEventType.f16856f;
        }

        public final int d() {
            return PointerEventType.f16854d;
        }

        public final int e() {
            return PointerEventType.f16855e;
        }

        public final int f() {
            return PointerEventType.f16859i;
        }

        public final int g() {
            return PointerEventType.f16853c;
        }

        public Companion() {
        }
    }

    public static int h(int i2) {
        return i2;
    }

    public static boolean i(int i2, Object obj) {
        return (obj instanceof PointerEventType) && i2 == ((PointerEventType) obj).m();
    }

    public static final boolean j(int i2, int i3) {
        return i2 == i3;
    }

    public static int k(int i2) {
        return Integer.hashCode(i2);
    }

    public static String l(int i2) {
        return j(i2, f16854d) ? "Press" : j(i2, f16855e) ? "Release" : j(i2, f16856f) ? "Move" : j(i2, f16857g) ? "Enter" : j(i2, f16858h) ? "Exit" : j(i2, f16859i) ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return i(this.f16860a, obj);
    }

    public int hashCode() {
        return k(this.f16860a);
    }

    public final /* synthetic */ int m() {
        return this.f16860a;
    }

    public String toString() {
        return l(this.f16860a);
    }
}
