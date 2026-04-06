package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(CallableReference.F, ((ClassBasedDeclarationContainer) kDeclarationContainer).i(), str, str2, (kDeclarationContainer instanceof KClass) ^ true ? 1 : 0);
    }

    public Object get(Object obj) {
        return a().k(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i2) {
        super(CallableReference.F, cls, str, str2, i2);
    }
}
