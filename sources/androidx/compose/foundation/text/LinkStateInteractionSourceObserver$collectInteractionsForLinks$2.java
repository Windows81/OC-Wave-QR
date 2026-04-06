package androidx.compose.foundation.text;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class LinkStateInteractionSourceObserver$collectInteractionsForLinks$2<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LinkStateInteractionSourceObserver f5816A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableObjectList f5817z;

    public LinkStateInteractionSourceObserver$collectInteractionsForLinks$2(MutableObjectList mutableObjectList, LinkStateInteractionSourceObserver linkStateInteractionSourceObserver) {
        this.f5817z = mutableObjectList;
        this.f5816A = linkStateInteractionSourceObserver;
    }

    /* renamed from: a */
    public final Object c(Interaction interaction, Continuation continuation) {
        int d2;
        boolean z2 = true;
        if (!(interaction instanceof HoverInteraction.Enter ? true : interaction instanceof FocusInteraction.Focus)) {
            z2 = interaction instanceof PressInteraction.Press;
        }
        if (z2) {
            this.f5817z.n(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.f5817z.y(((HoverInteraction.Exit) interaction).a());
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.f5817z.y(((FocusInteraction.Unfocus) interaction).a());
        } else if (interaction instanceof PressInteraction.Release) {
            this.f5817z.y(((PressInteraction.Release) interaction).a());
        } else if (interaction instanceof PressInteraction.Cancel) {
            this.f5817z.y(((PressInteraction.Cancel) interaction).a());
        }
        MutableObjectList mutableObjectList = this.f5817z;
        LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this.f5816A;
        Object[] objArr = mutableObjectList.f1937a;
        int i2 = mutableObjectList.f1938b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Interaction interaction2 = (Interaction) objArr[i4];
            if (interaction2 instanceof HoverInteraction.Enter) {
                d2 = linkStateInteractionSourceObserver.f5813c;
            } else if (interaction2 instanceof FocusInteraction.Focus) {
                d2 = linkStateInteractionSourceObserver.f5812b;
            } else if (interaction2 instanceof PressInteraction.Press) {
                d2 = linkStateInteractionSourceObserver.f5814d;
            }
            i3 |= d2;
        }
        this.f5816A.f5815e.k(i3);
        return Unit.f40552a;
    }
}
