package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class FabPosition {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f10002b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f10003c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f10004d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f10005e = d(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f10006f = d(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f10007a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return FabPosition.f10005e;
        }

        public final int b() {
            return FabPosition.f10006f;
        }

        public final int c() {
            return FabPosition.f10003c;
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
        return f(i2, f10003c) ? "FabPosition.Start" : f(i2, f10004d) ? "FabPosition.Center" : f(i2, f10005e) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }

    public boolean equals(Object obj) {
        return e(this.f10007a, obj);
    }

    public int hashCode() {
        return g(this.f10007a);
    }

    public final /* synthetic */ int i() {
        return this.f10007a;
    }

    public String toString() {
        return h(this.f10007a);
    }
}
