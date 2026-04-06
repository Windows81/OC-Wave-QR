package androidx.compose.foundation.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextHighlightType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f6084b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f6085c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f6086d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f6087a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TextHighlightType.f6086d;
        }

        public final int b() {
            return TextHighlightType.f6085c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextHighlightType(int i2) {
        this.f6087a = i2;
    }

    public static final /* synthetic */ TextHighlightType c(int i2) {
        return new TextHighlightType(i2);
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof TextHighlightType) && i2 == ((TextHighlightType) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return "TextHighlightType(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f6087a, obj);
    }

    public int hashCode() {
        return g(this.f6087a);
    }

    public final /* synthetic */ int i() {
        return this.f6087a;
    }

    public String toString() {
        return h(this.f6087a);
    }
}
