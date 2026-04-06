package androidx.compose.foundation.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextObfuscationMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f6088b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f6089c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f6090d = c(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f6091e = c(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f6092a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TextObfuscationMode.f6091e;
        }

        public final int b() {
            return TextObfuscationMode.f6090d;
        }

        public Companion() {
        }
    }

    public static int c(int i2) {
        return i2;
    }

    public static boolean d(int i2, Object obj) {
        return (obj instanceof TextObfuscationMode) && i2 == ((TextObfuscationMode) obj).h();
    }

    public static final boolean e(int i2, int i3) {
        return i2 == i3;
    }

    public static int f(int i2) {
        return Integer.hashCode(i2);
    }

    public static String g(int i2) {
        return "TextObfuscationMode(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f6092a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f6092a;
    }

    public int hashCode() {
        return f(this.f6092a);
    }

    public String toString() {
        return g(this.f6092a);
    }
}
