package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.Easing;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AnchoredDraggableDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final AnchoredDraggableDefaults f3319a = new AnchoredDraggableDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final AnimationSpec f3320b = AnimationSpecKt.n(0, 0, (Easing) null, 7, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Function1 f3321c = AnchoredDraggableDefaults$PositionalThreshold$1.f3324z;

    /* renamed from: d  reason: collision with root package name */
    public static final DecayAnimationSpec f3322d = DecayAnimationSpecKt.c(0.0f, 0.0f, 3, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f3323e = 8;

    public final DecayAnimationSpec a() {
        return f3322d;
    }

    public final Function1 b() {
        return f3321c;
    }

    public final AnimationSpec c() {
        return f3320b;
    }
}
