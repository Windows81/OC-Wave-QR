package androidx.core.view;

import android.view.Menu;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata
public final class MenuKt {
    public static final Iterator a(Menu menu) {
        return new MenuKt$iterator$1(menu);
    }
}
