package androidx.compose.ui.hapticfeedback;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class HapticFeedbackType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16726b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f16727a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return PlatformHapticFeedbackType.f16729a.a();
        }

        public final int b() {
            return PlatformHapticFeedbackType.f16729a.b();
        }

        public final int c() {
            return PlatformHapticFeedbackType.f16729a.c();
        }

        public final int d() {
            return PlatformHapticFeedbackType.f16729a.d();
        }

        public final int e() {
            return PlatformHapticFeedbackType.f16729a.e();
        }

        public final int f() {
            return PlatformHapticFeedbackType.f16729a.f();
        }

        public final int g() {
            return PlatformHapticFeedbackType.f16729a.g();
        }

        public final int h() {
            return PlatformHapticFeedbackType.f16729a.h();
        }

        public final int i() {
            return PlatformHapticFeedbackType.f16729a.i();
        }

        public final int j() {
            return PlatformHapticFeedbackType.f16729a.j();
        }

        public final int k() {
            return PlatformHapticFeedbackType.f16729a.k();
        }

        public final int l() {
            return PlatformHapticFeedbackType.f16729a.l();
        }

        public Companion() {
        }
    }

    public static int a(int i2) {
        return i2;
    }

    public static boolean b(int i2, Object obj) {
        return (obj instanceof HapticFeedbackType) && i2 == ((HapticFeedbackType) obj).f();
    }

    public static final boolean c(int i2, int i3) {
        return i2 == i3;
    }

    public static int d(int i2) {
        return Integer.hashCode(i2);
    }

    public static String e(int i2) {
        Companion companion = f16726b;
        return c(i2, companion.a()) ? "Confirm" : c(i2, companion.b()) ? "ContextClick" : c(i2, companion.c()) ? "GestureEnd" : c(i2, companion.d()) ? "GestureThresholdActivate" : c(i2, companion.e()) ? "LongPress" : c(i2, companion.f()) ? "Reject" : c(i2, companion.g()) ? "SegmentFrequentTick" : c(i2, companion.h()) ? "SegmentTick" : c(i2, companion.i()) ? "TextHandleMove" : c(i2, companion.j()) ? "ToggleOff" : c(i2, companion.k()) ? "ToggleOn" : c(i2, companion.l()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return b(this.f16727a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f16727a;
    }

    public int hashCode() {
        return d(this.f16727a);
    }

    public String toString() {
        return e(this.f16727a);
    }
}
