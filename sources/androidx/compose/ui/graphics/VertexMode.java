package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class VertexMode {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16153b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16154c = a(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16155d = a(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16156e = a(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f16157a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static int a(int i2) {
        return i2;
    }

    public static boolean b(int i2, Object obj) {
        return (obj instanceof VertexMode) && i2 == ((VertexMode) obj).f();
    }

    public static final boolean c(int i2, int i3) {
        return i2 == i3;
    }

    public static int d(int i2) {
        return Integer.hashCode(i2);
    }

    public static String e(int i2) {
        return c(i2, f16154c) ? "Triangles" : c(i2, f16155d) ? "TriangleStrip" : c(i2, f16156e) ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return b(this.f16157a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f16157a;
    }

    public int hashCode() {
        return d(this.f16157a);
    }

    public String toString() {
        return e(this.f16157a);
    }
}
