package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;

@Metadata
public interface KTypeParameter extends KClassifier {
    KVariance d();

    String getName();

    List getUpperBounds();
}
