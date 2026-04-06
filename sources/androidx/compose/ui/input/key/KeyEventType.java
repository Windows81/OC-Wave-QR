package androidx.compose.ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class KeyEventType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16777b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16778c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16779d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16780e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f16781a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return KeyEventType.f16780e;
        }

        public final int b() {
            return KeyEventType.f16779d;
        }

        public final int c() {
            return KeyEventType.f16778c;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof KeyEventType) && i2 == ((KeyEventType) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f16779d) ? "KeyUp" : f(i2, f16780e) ? "KeyDown" : f(i2, f16778c) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f16781a, obj);
    }

    public int hashCode() {
        return g(this.f16781a);
    }

    public final /* synthetic */ int i() {
        return this.f16781a;
    }

    public String toString() {
        return h(this.f16781a);
    }
}
