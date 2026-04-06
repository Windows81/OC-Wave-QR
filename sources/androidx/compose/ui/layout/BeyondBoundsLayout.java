package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public interface BeyondBoundsLayout {

    @Metadata
    public interface BeyondBoundsScope {
        boolean a();
    }

    @JvmInline
    @Metadata
    public static final class LayoutDirection {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f17013b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f17014c = g(1);

        /* renamed from: d  reason: collision with root package name */
        public static final int f17015d = g(2);

        /* renamed from: e  reason: collision with root package name */
        public static final int f17016e = g(3);

        /* renamed from: f  reason: collision with root package name */
        public static final int f17017f = g(4);

        /* renamed from: g  reason: collision with root package name */
        public static final int f17018g = g(5);

        /* renamed from: h  reason: collision with root package name */
        public static final int f17019h = g(6);

        /* renamed from: a  reason: collision with root package name */
        public final int f17020a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return LayoutDirection.f17018g;
            }

            public final int b() {
                return LayoutDirection.f17015d;
            }

            public final int c() {
                return LayoutDirection.f17014c;
            }

            public final int d() {
                return LayoutDirection.f17019h;
            }

            public final int e() {
                return LayoutDirection.f17016e;
            }

            public final int f() {
                return LayoutDirection.f17017f;
            }

            public Companion() {
            }
        }

        public static int g(int i2) {
            return i2;
        }

        public static boolean h(int i2, Object obj) {
            return (obj instanceof LayoutDirection) && i2 == ((LayoutDirection) obj).l();
        }

        public static final boolean i(int i2, int i3) {
            return i2 == i3;
        }

        public static int j(int i2) {
            return Integer.hashCode(i2);
        }

        public static String k(int i2) {
            return i(i2, f17014c) ? "Before" : i(i2, f17015d) ? "After" : i(i2, f17016e) ? "Left" : i(i2, f17017f) ? "Right" : i(i2, f17018g) ? "Above" : i(i2, f17019h) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return h(this.f17020a, obj);
        }

        public int hashCode() {
            return j(this.f17020a);
        }

        public final /* synthetic */ int l() {
            return this.f17020a;
        }

        public String toString() {
            return k(this.f17020a);
        }
    }

    Object Y0(int i2, Function1 function1);
}
