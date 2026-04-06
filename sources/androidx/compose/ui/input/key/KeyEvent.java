package androidx.compose.ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class KeyEvent {

    /* renamed from: a  reason: collision with root package name */
    public final android.view.KeyEvent f16776a;

    public /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.f16776a = keyEvent;
    }

    public static final /* synthetic */ KeyEvent a(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    public static android.view.KeyEvent b(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && Intrinsics.d(keyEvent, ((KeyEvent) obj).f());
    }

    public static int d(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f16776a, obj);
    }

    public final /* synthetic */ android.view.KeyEvent f() {
        return this.f16776a;
    }

    public int hashCode() {
        return d(this.f16776a);
    }

    public String toString() {
        return e(this.f16776a);
    }
}
