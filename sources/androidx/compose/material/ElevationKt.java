package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ElevationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TweenSpec f7800a = new TweenSpec(120, 0, EasingKt.d(), 2, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final TweenSpec f7801b = new TweenSpec(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final TweenSpec f7802c = new TweenSpec(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, (DefaultConstructorMarker) null);

    public static final Object d(Animatable animatable, float f2, Interaction interaction, Interaction interaction2, Continuation continuation) {
        AnimationSpec a2 = interaction2 != null ? ElevationDefaults.f7799a.a(interaction2) : interaction != null ? ElevationDefaults.f7799a.b(interaction) : null;
        if (a2 != null) {
            Object f3 = Animatable.f(animatable, Dp.j(f2), a2, (Object) null, (Function1) null, continuation, 12, (Object) null);
            return f3 == IntrinsicsKt.f() ? f3 : Unit.f40552a;
        }
        Object t2 = animatable.t(Dp.j(f2), continuation);
        return t2 == IntrinsicsKt.f() ? t2 : Unit.f40552a;
    }
}
