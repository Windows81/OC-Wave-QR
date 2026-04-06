package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class TextFieldLabelPosition {

    @Metadata
    public static final class Above extends TextFieldLabelPosition {

        /* renamed from: a  reason: collision with root package name */
        public final Alignment.Horizontal f11418a;

        public final Alignment.Horizontal a() {
            return this.f11418a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Above)) {
                return false;
            }
            return Intrinsics.d(this.f11418a, ((Above) obj).f11418a);
        }

        public int hashCode() {
            return this.f11418a.hashCode();
        }

        public String toString() {
            return "Above(alignment=" + this.f11418a + ')';
        }
    }

    public /* synthetic */ TextFieldLabelPosition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public TextFieldLabelPosition() {
    }

    @Metadata
    public static final class Attached extends TextFieldLabelPosition {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f11419a;

        /* renamed from: b  reason: collision with root package name */
        public final Alignment.Horizontal f11420b;

        /* renamed from: c  reason: collision with root package name */
        public final Alignment.Horizontal f11421c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Attached(boolean z2, Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? Alignment.f15444a.k() : horizontal, (i2 & 4) != 0 ? Alignment.f15444a.k() : horizontal2);
        }

        public final boolean a() {
            return this.f11419a;
        }

        public final Alignment.Horizontal b() {
            return this.f11421c;
        }

        public final Alignment.Horizontal c() {
            return this.f11420b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attached)) {
                return false;
            }
            Attached attached = (Attached) obj;
            return this.f11419a == attached.f11419a && Intrinsics.d(this.f11420b, attached.f11420b) && Intrinsics.d(this.f11421c, attached.f11421c);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f11419a) * 31) + this.f11420b.hashCode()) * 31) + this.f11421c.hashCode();
        }

        public String toString() {
            return "Attached(alwaysMinimize=" + this.f11419a + ", minimizedAlignment=" + this.f11420b + ", expandedAlignment=" + this.f11421c + ')';
        }

        public Attached(boolean z2, Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2) {
            super((DefaultConstructorMarker) null);
            this.f11419a = z2;
            this.f11420b = horizontal;
            this.f11421c = horizontal2;
        }
    }
}
