package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    public final int G;
    public final int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionReference(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.G = i2;
        this.H = i3 >> 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && u().equals(functionReference.u()) && this.H == functionReference.H && this.G == functionReference.G && Intrinsics.d(q(), functionReference.q()) && Intrinsics.d(s(), functionReference.s());
        } else if (obj instanceof KFunction) {
            return obj.equals(i());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.G;
    }

    public int hashCode() {
        return (((s() == null ? 0 : s().hashCode() * 31) + getName().hashCode()) * 31) + u().hashCode();
    }

    public KCallable p() {
        return Reflection.a(this);
    }

    public String toString() {
        KCallable i2 = i();
        if (i2 != this) {
            return i2.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
