package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
public interface Animation<T, V extends AnimationVector> {

    @Metadata
    public static final class DefaultImpls {
    }

    boolean a();

    long b();

    TwoWayConverter c();

    AnimationVector d(long j2);

    boolean e(long j2) {
        return j2 >= b();
    }

    Object f(long j2);

    Object g();
}
