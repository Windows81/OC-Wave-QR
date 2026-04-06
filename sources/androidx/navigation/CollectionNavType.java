package androidx.navigation;

import java.util.List;
import kotlin.Metadata;

@Metadata
public abstract class CollectionNavType<T> extends NavType<T> {
    public CollectionNavType(boolean z2) {
        super(z2);
    }

    public abstract Object k();

    public abstract List l(Object obj);
}
