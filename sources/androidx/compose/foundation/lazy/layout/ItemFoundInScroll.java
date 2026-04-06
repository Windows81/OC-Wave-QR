package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
final class ItemFoundInScroll extends CancellationException {

    /* renamed from: A  reason: collision with root package name */
    public final AnimationState f4780A;

    /* renamed from: z  reason: collision with root package name */
    public final int f4781z;

    public ItemFoundInScroll(int i2, AnimationState animationState) {
        this.f4781z = i2;
        this.f4780A = animationState;
    }

    public final int a() {
        return this.f4781z;
    }

    public final AnimationState b() {
        return this.f4780A;
    }
}
