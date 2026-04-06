package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class MarqueeAnimationMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f3104b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f3105c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f3106d = c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f3107a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return MarqueeAnimationMode.f3106d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ MarqueeAnimationMode(int i2) {
        this.f3107a = i2;
    }

    public static final /* synthetic */ MarqueeAnimationMode b(int i2) {
        return new MarqueeAnimationMode(i2);
    }

    public static int c(int i2) {
        return i2;
    }

    public static boolean d(int i2, Object obj) {
        return (obj instanceof MarqueeAnimationMode) && i2 == ((MarqueeAnimationMode) obj).h();
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        if (e(i2, f3105c)) {
            return "Immediately";
        }
        if (e(i2, f3106d)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i2).toString());
    }

    public boolean equals(Object obj) {
        return d(this.f3107a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f3107a;
    }

    public int hashCode() {
        return f(this.f3107a);
    }

    public String toString() {
        return g(this.f3107a);
    }
}
