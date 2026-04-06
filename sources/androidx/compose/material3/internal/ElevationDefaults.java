package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;

@Metadata
final class ElevationDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ElevationDefaults f12242a = new ElevationDefaults();

    public final AnimationSpec a(Interaction interaction) {
        if (interaction instanceof PressInteraction.Press) {
            return ElevationKt.f12244b;
        }
        if (interaction instanceof DragInteraction.Start) {
            return ElevationKt.f12244b;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            return ElevationKt.f12244b;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return ElevationKt.f12244b;
        }
        return null;
    }

    public final AnimationSpec b(Interaction interaction) {
        if (interaction instanceof PressInteraction.Press) {
            return ElevationKt.f12245c;
        }
        if (interaction instanceof DragInteraction.Start) {
            return ElevationKt.f12245c;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            return ElevationKt.f12246d;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return ElevationKt.f12245c;
        }
        return null;
    }
}
