package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;

@Metadata
public interface KType extends KAnnotatedElement {

    @Metadata
    public static final class DefaultImpls {
    }

    boolean c();

    List f();

    KClassifier g();
}
