package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;

@Metadata
public interface BottomAppBarScrollBehavior {
    DecayAnimationSpec a();

    AnimationSpec b();

    BottomAppBarState c();
}
