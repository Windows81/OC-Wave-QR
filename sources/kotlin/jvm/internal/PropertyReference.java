package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

public abstract class PropertyReference extends CallableReference implements KProperty {
    public final boolean G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        boolean z2 = false;
        this.G = (i2 & 2) == 2 ? true : z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return s().equals(propertyReference.s()) && getName().equals(propertyReference.getName()) && u().equals(propertyReference.u()) && Intrinsics.d(q(), propertyReference.q());
        } else if (obj instanceof KProperty) {
            return obj.equals(i());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((s().hashCode() * 31) + getName().hashCode()) * 31) + u().hashCode();
    }

    public KCallable i() {
        return this.G ? this : super.i();
    }

    public String toString() {
        KCallable i2 = i();
        if (i2 != this) {
            return i2.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public KProperty v() {
        if (!this.G) {
            return (KProperty) super.t();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
