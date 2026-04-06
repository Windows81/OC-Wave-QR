package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class FinalSnappingItem {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f3648b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f3649c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f3650d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f3651e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f3652a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return FinalSnappingItem.f3649c;
        }

        public final int b() {
            return FinalSnappingItem.f3650d;
        }

        public final int c() {
            return FinalSnappingItem.f3651e;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof FinalSnappingItem) && i2 == ((FinalSnappingItem) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return "FinalSnappingItem(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f3652a, obj);
    }

    public int hashCode() {
        return g(this.f3652a);
    }

    public final /* synthetic */ int i() {
        return this.f3652a;
    }

    public String toString() {
        return h(this.f3652a);
    }
}
