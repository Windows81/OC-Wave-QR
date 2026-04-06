package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class FabPosition {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f7852b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f7853c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f7854d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f7855e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f7856a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return FabPosition.f7854d;
        }

        public final int b() {
            return FabPosition.f7855e;
        }

        public final int c() {
            return FabPosition.f7853c;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof FabPosition) && i2 == ((FabPosition) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f7853c) ? "FabPosition.Start" : f(i2, f7854d) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return e(this.f7856a, obj);
    }

    public int hashCode() {
        return g(this.f7856a);
    }

    public final /* synthetic */ int i() {
        return this.f7856a;
    }

    public String toString() {
        return h(this.f7856a);
    }
}
