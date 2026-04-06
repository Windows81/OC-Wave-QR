package androidx.compose.ui.focus;

import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Focusability {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15833b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f15834c = e(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f15835d = e(0);

    /* renamed from: e  reason: collision with root package name */
    public static final int f15836e = e(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f15837a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Focusability.f15834c;
        }

        public final int b() {
            return Focusability.f15836e;
        }

        public final int c() {
            return Focusability.f15835d;
        }

        public Companion() {
        }
    }

    public static final boolean d(int i2, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (g(i2, f15834c)) {
            return true;
        }
        if (g(i2, f15835d)) {
            return true ^ InputMode.f(((InputModeManager) CompositionLocalConsumerModifierNodeKt.a(compositionLocalConsumerModifierNode, CompositionLocalsKt.l())).a(), InputMode.f16742b.b());
        }
        if (g(i2, f15836e)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public static int e(int i2) {
        return i2;
    }

    public static boolean f(int i2, Object obj) {
        return (obj instanceof Focusability) && i2 == ((Focusability) obj).j();
    }

    public static final boolean g(int i2, int i3) {
        return i2 == i3;
    }

    public static int h(int i2) {
        return Integer.hashCode(i2);
    }

    public static String i(int i2) {
        if (g(i2, f15834c)) {
            return "Always";
        }
        if (g(i2, f15835d)) {
            return "SystemDefined";
        }
        if (g(i2, f15836e)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public boolean equals(Object obj) {
        return f(this.f15837a, obj);
    }

    public int hashCode() {
        return h(this.f15837a);
    }

    public final /* synthetic */ int j() {
        return this.f15837a;
    }

    public String toString() {
        return i(this.f15837a);
    }
}
