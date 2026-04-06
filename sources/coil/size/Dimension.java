package coil.size;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class Dimension {

    @Metadata
    public static final class Pixels extends Dimension {

        /* renamed from: a  reason: collision with root package name */
        public final int f23691a;

        public Pixels(int i2) {
            super((DefaultConstructorMarker) null);
            this.f23691a = i2;
            if (i2 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pixels) && this.f23691a == ((Pixels) obj).f23691a;
        }

        public int hashCode() {
            return this.f23691a;
        }

        public String toString() {
            return String.valueOf(this.f23691a);
        }
    }

    @Metadata
    public static final class Undefined extends Dimension {

        /* renamed from: a  reason: collision with root package name */
        public static final Undefined f23692a = new Undefined();

        public Undefined() {
            super((DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ Dimension(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Dimension() {
    }
}
