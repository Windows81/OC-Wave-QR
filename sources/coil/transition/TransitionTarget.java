package coil.transition;

import android.graphics.drawable.Drawable;
import coil.target.Target;
import kotlin.Metadata;

@Metadata
public interface TransitionTarget extends Target {

    @Metadata
    public static final class DefaultImpls {
    }

    Drawable f();
}
