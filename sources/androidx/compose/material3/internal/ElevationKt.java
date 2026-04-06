package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
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
    public static final Easing f12243a;

    /* renamed from: b  reason: collision with root package name */
    public static final TweenSpec f12244b = new TweenSpec(120, 0, EasingKt.d(), 2, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final TweenSpec f12245c;

    /* renamed from: d  reason: collision with root package name */
    public static final TweenSpec f12246d;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        f12243a = cubicBezierEasing;
        CubicBezierEasing cubicBezierEasing2 = cubicBezierEasing;
        f12245c = new TweenSpec(150, 0, cubicBezierEasing2, 2, (DefaultConstructorMarker) null);
        f12246d = new TweenSpec(120, 0, cubicBezierEasing2, 2, (DefaultConstructorMarker) null);
    }

    public static final Object d(Animatable animatable, float f2, Interaction interaction, Interaction interaction2, Continuation continuation) {
        AnimationSpec a2 = interaction2 != null ? ElevationDefaults.f12242a.a(interaction2) : interaction != null ? ElevationDefaults.f12242a.b(interaction) : null;
        if (a2 != null) {
            Object f3 = Animatable.f(animatable, Dp.j(f2), a2, (Object) null, (Function1) null, continuation, 12, (Object) null);
            return f3 == IntrinsicsKt.f() ? f3 : Unit.f40552a;
        }
        Object t2 = animatable.t(Dp.j(f2), continuation);
        return t2 == IntrinsicsKt.f() ? t2 : Unit.f40552a;
    }
}
