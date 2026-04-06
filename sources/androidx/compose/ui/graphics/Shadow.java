package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Shadow {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f16116d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final Shadow f16117e = new Shadow(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f16118a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16119b;

    /* renamed from: c  reason: collision with root package name */
    public final float f16120c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Shadow a() {
            return Shadow.f16117e;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Shadow(long j2, long j3, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, f2);
    }

    public final float b() {
        return this.f16120c;
    }

    public final long c() {
        return this.f16118a;
    }

    public final long d() {
        return this.f16119b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.n(this.f16118a, shadow.f16118a) && Offset.j(this.f16119b, shadow.f16119b) && this.f16120c == shadow.f16120c;
    }

    public int hashCode() {
        return (((Color.t(this.f16118a) * 31) + Offset.o(this.f16119b)) * 31) + Float.hashCode(this.f16120c);
    }

    public String toString() {
        return "Shadow(color=" + Color.u(this.f16118a) + ", offset=" + Offset.s(this.f16119b) + ", blurRadius=" + this.f16120c + ')';
    }

    public Shadow(long j2, long j3, float f2) {
        this.f16118a = j2;
        this.f16119b = j3;
        this.f16120c = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Shadow(long j2, long j3, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ColorKt.d(4278190080L) : j2, (i2 & 2) != 0 ? Offset.f15855b.c() : j3, (i2 & 4) != 0 ? 0.0f : f2, (DefaultConstructorMarker) null);
    }
}
