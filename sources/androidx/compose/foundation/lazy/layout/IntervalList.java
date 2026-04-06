package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public interface IntervalList<T> {

    @Metadata
    public static final class Interval<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f4777a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4778b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f4779c;

        public Interval(int i2, int i3, Object obj) {
            this.f4777a = i2;
            this.f4778b = i3;
            this.f4779c = obj;
            boolean z2 = false;
            if (!(i2 >= 0)) {
                InlineClassHelperKt.a("startIndex should be >= 0");
            }
            if (!(i3 > 0 ? true : z2)) {
                InlineClassHelperKt.a("size should be > 0");
            }
        }

        public final int a() {
            return this.f4778b;
        }

        public final int b() {
            return this.f4777a;
        }

        public final Object c() {
            return this.f4779c;
        }
    }

    void a(int i2, int i3, Function1 function1);

    int e();

    Interval get(int i2);
}
