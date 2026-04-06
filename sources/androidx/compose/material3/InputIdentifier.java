package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class InputIdentifier {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f10146b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f10147c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f10148d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f10149e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f10150a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return InputIdentifier.f10149e;
        }

        public final int b() {
            return InputIdentifier.f10147c;
        }

        public final int c() {
            return InputIdentifier.f10148d;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof InputIdentifier) && i2 == ((InputIdentifier) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f10147c) ? "SingleDateInput" : f(i2, f10148d) ? "StartDateInput" : f(i2, f10149e) ? "EndDateInput" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f10150a, obj);
    }

    public int hashCode() {
        return g(this.f10150a);
    }

    public final /* synthetic */ int i() {
        return this.f10150a;
    }

    public String toString() {
        return h(this.f10150a);
    }
}
