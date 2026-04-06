package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public class ColorFilter {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15990b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final android.graphics.ColorFilter f15991a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ColorFilter b(Companion companion, long j2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = BlendMode.f15926b.z();
            }
            return companion.a(j2, i2);
        }

        public final ColorFilter a(long j2, int i2) {
            return new BlendModeColorFilter(j2, i2, (DefaultConstructorMarker) null);
        }

        public Companion() {
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f15991a = colorFilter;
    }

    public final android.graphics.ColorFilter a() {
        return this.f15991a;
    }
}
