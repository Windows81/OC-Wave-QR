package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.KDeclarationContainer;

@Metadata
public interface ClassBasedDeclarationContainer extends KDeclarationContainer {
    Class i();
}
