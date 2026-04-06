package kotlin.jvm.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.reflect.KDeclarationContainer;

@Metadata
public class MutableLocalVariableReference extends MutablePropertyReference0 {
    public Object get() {
        Void unused = LocalVariableReferencesKt.b();
        throw new KotlinNothingValueException();
    }

    public KDeclarationContainer s() {
        Void unused = LocalVariableReferencesKt.b();
        throw new KotlinNothingValueException();
    }
}
