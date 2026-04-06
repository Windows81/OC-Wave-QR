package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata
public interface Sequence<T> {
    Iterator iterator();
}
