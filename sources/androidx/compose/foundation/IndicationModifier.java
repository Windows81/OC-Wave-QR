package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;

@Metadata
final class IndicationModifier implements DrawModifier {

    /* renamed from: z  reason: collision with root package name */
    public final IndicationInstance f3093z;

    public IndicationModifier(IndicationInstance indicationInstance) {
        this.f3093z = indicationInstance;
    }

    public void U(ContentDrawScope contentDrawScope) {
        this.f3093z.a(contentDrawScope);
    }
}
