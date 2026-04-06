package androidx.compose.ui.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class InputMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16742b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16743c = d(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16744d = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f16745a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return InputMode.f16744d;
        }

        public final int b() {
            return InputMode.f16743c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ InputMode(int i2) {
        this.f16745a = i2;
    }

    public static final /* synthetic */ InputMode c(int i2) {
        return new InputMode(i2);
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof InputMode) && i2 == ((InputMode) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f16743c) ? "Touch" : f(i2, f16744d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f16745a, obj);
    }

    public int hashCode() {
        return g(this.f16745a);
    }

    public final /* synthetic */ int i() {
        return this.f16745a;
    }

    public String toString() {
        return h(this.f16745a);
    }
}
