package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RippleKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TweenSpec f9086a = new TweenSpec(15, 0, EasingKt.e(), 2, (DefaultConstructorMarker) null);

    public static final DelegatableNode c(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0 function0) {
        return Ripple_androidKt.d(interactionSource, z2, f2, colorProducer, function0);
    }

    public static final AnimationSpec d(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? f9086a : interaction instanceof FocusInteraction.Focus ? new TweenSpec(45, 0, EasingKt.e(), 2, (DefaultConstructorMarker) null) : interaction instanceof DragInteraction.Start ? new TweenSpec(45, 0, EasingKt.e(), 2, (DefaultConstructorMarker) null) : f9086a;
    }

    public static final AnimationSpec e(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? f9086a : interaction instanceof FocusInteraction.Focus ? f9086a : interaction instanceof DragInteraction.Start ? new TweenSpec(150, 0, EasingKt.e(), 2, (DefaultConstructorMarker) null) : f9086a;
    }
}
