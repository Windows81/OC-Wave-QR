package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public interface TextFieldLineLimits {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f6068a = Companion.f6069a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f6069a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final TextFieldLineLimits f6070b = new MultiLine(0, 0, 3, (DefaultConstructorMarker) null);

        public final TextFieldLineLimits a() {
            return f6070b;
        }
    }

    @Metadata
    public static final class SingleLine implements TextFieldLineLimits {

        /* renamed from: b  reason: collision with root package name */
        public static final SingleLine f6073b = new SingleLine();

        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    @Metadata
    public static final class MultiLine implements TextFieldLineLimits {

        /* renamed from: b  reason: collision with root package name */
        public final int f6071b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6072c;

        public MultiLine(int i2, int i3) {
            this.f6071b = i2;
            this.f6072c = i3;
            boolean z2 = false;
            if (1 <= i2 && i2 <= i3) {
                z2 = true;
            }
            if (!z2) {
                InlineClassHelperKt.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i2 + ", " + i3);
            }
        }

        public final int a() {
            return this.f6072c;
        }

        public final int b() {
            return this.f6071b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MultiLine.class != obj.getClass()) {
                return false;
            }
            MultiLine multiLine = (MultiLine) obj;
            return this.f6071b == multiLine.f6071b && this.f6072c == multiLine.f6072c;
        }

        public int hashCode() {
            return (this.f6071b * 31) + this.f6072c;
        }

        public String toString() {
            return "MultiLine(minHeightInLines=" + this.f6071b + ", maxHeightInLines=" + this.f6072c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MultiLine(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 1 : i2, (i4 & 2) != 0 ? Integer.MAX_VALUE : i3);
        }
    }
}
