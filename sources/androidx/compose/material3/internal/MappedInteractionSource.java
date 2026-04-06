package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class MappedInteractionSource implements InteractionSource {

    /* renamed from: a  reason: collision with root package name */
    public final long f12297a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f12298b;

    /* renamed from: c  reason: collision with root package name */
    public final Flow f12299c;

    public Flow c() {
        return this.f12299c;
    }

    public final PressInteraction.Press f(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.p(press.a(), this.f12297a), (DefaultConstructorMarker) null);
    }
}
