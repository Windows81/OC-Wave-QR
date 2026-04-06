package androidx.compose.ui.graphics;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public interface PathIterator extends Iterator<PathSegment>, KMappedMarker {

    @Metadata
    public enum ConicEvaluation {
        AsConic,
        AsQuadratics;

        static {
            ConicEvaluation[] d2;
            C = EnumEntriesKt.a(d2);
        }
    }

    boolean hasNext();

    PathSegment next();
}
