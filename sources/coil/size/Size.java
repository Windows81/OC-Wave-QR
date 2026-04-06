package coil.size;

import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Size {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f23703c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final Size f23704d;

    /* renamed from: a  reason: collision with root package name */
    public final Dimension f23705a;

    /* renamed from: b  reason: collision with root package name */
    public final Dimension f23706b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        Dimension.Undefined undefined = Dimension.Undefined.f23692a;
        f23704d = new Size(undefined, undefined);
    }

    public Size(Dimension dimension, Dimension dimension2) {
        this.f23705a = dimension;
        this.f23706b = dimension2;
    }

    public final Dimension a() {
        return this.f23705a;
    }

    public final Dimension b() {
        return this.f23706b;
    }

    public final Dimension c() {
        return this.f23706b;
    }

    public final Dimension d() {
        return this.f23705a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return Intrinsics.d(this.f23705a, size.f23705a) && Intrinsics.d(this.f23706b, size.f23706b);
    }

    public int hashCode() {
        return (this.f23705a.hashCode() * 31) + this.f23706b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f23705a + ", height=" + this.f23706b + ')';
    }
}
