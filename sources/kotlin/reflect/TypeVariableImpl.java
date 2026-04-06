package kotlin.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TypeVariableImpl implements TypeVariable<GenericDeclaration>, TypeImpl {

    /* renamed from: z  reason: collision with root package name */
    public final KTypeParameter f41003z;

    public TypeVariableImpl(KTypeParameter kTypeParameter) {
        Intrinsics.i(kTypeParameter, "typeParameter");
        this.f41003z = kTypeParameter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            return Intrinsics.d(getName(), typeVariable.getName()) && Intrinsics.d(getGenericDeclaration(), typeVariable.getGenericDeclaration());
        }
    }

    public Type[] getBounds() {
        Iterable<KType> upperBounds = this.f41003z.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(upperBounds, 10));
        for (KType a2 : upperBounds) {
            arrayList.add(TypesJVMKt.c(a2, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f41003z));
    }

    public String getName() {
        return this.f41003z.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
