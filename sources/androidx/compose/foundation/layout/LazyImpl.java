package androidx.compose.foundation.layout;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class LazyImpl implements Lazy<Integer> {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final String f4079A;

    /* renamed from: B  reason: collision with root package name */
    public int f4080B = -1;

    /* renamed from: z  reason: collision with root package name */
    public final Function0 f4081z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LazyImpl(Function0 function0, String str) {
        this.f4081z = function0;
        this.f4079A = str;
    }

    /* renamed from: a */
    public Integer getValue() {
        if (this.f4080B == -1) {
            this.f4080B = ((Number) this.f4081z.invoke()).intValue();
        }
        int i2 = this.f4080B;
        if (i2 != -1) {
            return Integer.valueOf(i2);
        }
        throw new IllegalStateException(this.f4079A);
    }

    public boolean b() {
        return this.f4080B != -1;
    }

    public String toString() {
        return b() ? String.valueOf(getValue().intValue()) : this.f4079A;
    }
}
