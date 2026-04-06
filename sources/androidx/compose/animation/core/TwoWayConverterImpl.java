package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f2781a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f2782b;

    public TwoWayConverterImpl(Function1 function1, Function1 function12) {
        this.f2781a = function1;
        this.f2782b = function12;
    }

    public Function1 a() {
        return this.f2781a;
    }

    public Function1 b() {
        return this.f2782b;
    }
}
