package coil.compose;

import kotlin.Metadata;

@Metadata
public interface EqualityDelegate {
    boolean b(Object obj, Object obj2);

    int c(Object obj);
}
