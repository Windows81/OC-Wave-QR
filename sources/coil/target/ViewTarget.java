package coil.target;

import android.view.View;
import kotlin.Metadata;

@Metadata
public interface ViewTarget<T extends View> extends Target {

    @Metadata
    public static final class DefaultImpls {
    }

    View r();
}
