package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class PointerKeyboardModifiers {

    /* renamed from: a  reason: collision with root package name */
    public final int f16932a;

    public /* synthetic */ PointerKeyboardModifiers(int i2) {
        this.f16932a = i2;
    }

    public static final /* synthetic */ PointerKeyboardModifiers a(int i2) {
        return new PointerKeyboardModifiers(i2);
    }

    public static int b(int i2) {
        return i2;
    }

    public static boolean c(int i2, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i2 == ((PointerKeyboardModifiers) obj).f();
    }

    public static int d(int i2) {
        return Integer.hashCode(i2);
    }

    public static String e(int i2) {
        return "PointerKeyboardModifiers(packedValue=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f16932a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f16932a;
    }

    public int hashCode() {
        return d(this.f16932a);
    }

    public String toString() {
        return e(this.f16932a);
    }
}
