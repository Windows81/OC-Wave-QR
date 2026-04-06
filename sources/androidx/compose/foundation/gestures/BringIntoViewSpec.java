package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Metadata;

@Metadata
public interface BringIntoViewSpec {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f3402a = Companion.f3403a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f3403a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final AnimationSpec f3404b = AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);

        /* renamed from: c  reason: collision with root package name */
        public static final BringIntoViewSpec f3405c = new BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1();

        public final float a(float f2, float f3, float f4) {
            float f5 = f3 + f2;
            if ((f2 >= 0.0f && f5 <= f4) || (f2 < 0.0f && f5 > f4)) {
                return 0.0f;
            }
            float f6 = f5 - f4;
            return Math.abs(f2) < Math.abs(f6) ? f2 : f6;
        }

        public final BringIntoViewSpec b() {
            return f3405c;
        }

        public final AnimationSpec c() {
            return f3404b;
        }
    }

    float a(float f2, float f3, float f4) {
        return f3402a.a(f2, f3, f4);
    }
}
