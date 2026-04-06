package okio.internal;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class ZipFilesKt$buildIndex$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(((ZipEntry) obj).a(), ((ZipEntry) obj2).a());
    }
}
