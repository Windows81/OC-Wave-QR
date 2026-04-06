package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;

@Metadata
public final class HeightInLinesModifierKt {
    public static final Modifier a(Modifier modifier, TextStyle textStyle, int i2, int i3) {
        return ComposedModifierKt.b(modifier, InspectableValueKt.b() ? new HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1(i2, i3, textStyle) : InspectableValueKt.a(), new HeightInLinesModifierKt$heightInLines$2(i2, i3, textStyle));
    }

    public static final void b(int i2, int i3) {
        boolean z2 = false;
        if (!(i2 > 0 && i3 > 0)) {
            InlineClassHelperKt.a("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("minLines " + i2 + " must be less than or equal to maxLines " + i3);
        }
    }
}
