package kotlin.reflect;

import kotlin.Metadata;

@Metadata
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    @Metadata
    public static final class DefaultImpls {
    }

    String b();

    String e();

    boolean h(Object obj);

    int hashCode();
}
