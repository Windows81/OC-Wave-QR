package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class IndicatorLineNode$trackFocusState$2<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IndicatorLineNode f10140A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f10141z;

    public IndicatorLineNode$trackFocusState$2(List list, IndicatorLineNode indicatorLineNode) {
        this.f10141z = list;
        this.f10140A = indicatorLineNode;
    }

    /* renamed from: a */
    public final Object c(Interaction interaction, Continuation continuation) {
        if (interaction instanceof FocusInteraction.Focus) {
            this.f10141z.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.f10141z.remove(((FocusInteraction.Unfocus) interaction).a());
        }
        boolean z2 = !this.f10141z.isEmpty();
        if (z2 != this.f10140A.U) {
            this.f10140A.U = z2;
            this.f10140A.w3();
        }
        return Unit.f40552a;
    }
}
