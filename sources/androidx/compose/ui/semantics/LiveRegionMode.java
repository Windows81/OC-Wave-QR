package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class LiveRegionMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18031b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18032c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18033d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f18034a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return LiveRegionMode.f18033d;
        }

        public final int b() {
            return LiveRegionMode.f18032c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ LiveRegionMode(int i2) {
        this.f18034a = i2;
    }

    public static final /* synthetic */ LiveRegionMode c(int i2) {
        return new LiveRegionMode(i2);
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof LiveRegionMode) && i2 == ((LiveRegionMode) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f18032c) ? "Polite" : f(i2, f18033d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f18034a, obj);
    }

    public int hashCode() {
        return g(this.f18034a);
    }

    public final /* synthetic */ int i() {
        return this.f18034a;
    }

    public String toString() {
        return h(this.f18034a);
    }
}
