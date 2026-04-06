package androidx.compose.ui.graphics.layer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class CompositingStrategy {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16309b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16310c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16311d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16312e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f16313a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return CompositingStrategy.f16310c;
        }

        public final int b() {
            return CompositingStrategy.f16312e;
        }

        public final int c() {
            return CompositingStrategy.f16311d;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof CompositingStrategy) && i2 == ((CompositingStrategy) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return "CompositingStrategy(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f16313a, obj);
    }

    public int hashCode() {
        return g(this.f16313a);
    }

    public final /* synthetic */ int i() {
        return this.f16313a;
    }

    public String toString() {
        return h(this.f16313a);
    }
}
