package androidx.compose.foundation.interaction;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface MutableInteractionSource extends InteractionSource {
    Object a(Interaction interaction, Continuation continuation);

    boolean b(Interaction interaction);
}
