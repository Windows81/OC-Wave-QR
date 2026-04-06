package androidx.compose.material;

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
    public static final ElevationDefaults f7799a = new ElevationDefaults();

    public final AnimationSpec a(Interaction interaction) {
        if (interaction instanceof PressInteraction.Press) {
            return ElevationKt.f7800a;
        }
        if (interaction instanceof DragInteraction.Start) {
            return ElevationKt.f7800a;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            return ElevationKt.f7800a;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return ElevationKt.f7800a;
        }
        return null;
    }

    public final AnimationSpec b(Interaction interaction) {
        if (interaction instanceof PressInteraction.Press) {
            return ElevationKt.f7801b;
        }
        if (interaction instanceof DragInteraction.Start) {
            return ElevationKt.f7801b;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            return ElevationKt.f7802c;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return ElevationKt.f7801b;
        }
        return null;
    }
}
