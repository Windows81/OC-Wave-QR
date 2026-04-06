package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextGranularity {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18455b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18456c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18457d = c(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f18458a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TextGranularity.f18456c;
        }

        public final int b() {
            return TextGranularity.f18457d;
        }

        public Companion() {
        }
    }

    public static int c(int i2) {
        return i2;
    }

    public static boolean d(int i2, Object obj) {
        return (obj instanceof TextGranularity) && i2 == ((TextGranularity) obj).h();
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        return "TextGranularity(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f18458a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f18458a;
    }

    public int hashCode() {
        return f(this.f18458a);
    }

    public String toString() {
        return g(this.f18458a);
    }
}
