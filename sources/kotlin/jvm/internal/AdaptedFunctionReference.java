package kotlin.jvm.internal;

import java.io.Serializable;

public class AdaptedFunctionReference implements FunctionBase, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Class f40862A;

    /* renamed from: B  reason: collision with root package name */
    public final String f40863B;
    public final String C;
    public final boolean D;
    public final int E;
    public final int F;

    /* renamed from: z  reason: collision with root package name */
    public final Object f40864z;

    public AdaptedFunctionReference(int i2, Object obj, Class cls, String str, String str2, int i3) {
        this.f40864z = obj;
        this.f40862A = cls;
        this.f40863B = str;
        this.C = str2;
        this.D = (i3 & 1) == 1;
        this.E = i2;
        this.F = i3 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.D == adaptedFunctionReference.D && this.E == adaptedFunctionReference.E && this.F == adaptedFunctionReference.F && Intrinsics.d(this.f40864z, adaptedFunctionReference.f40864z) && Intrinsics.d(this.f40862A, adaptedFunctionReference.f40862A) && this.f40863B.equals(adaptedFunctionReference.f40863B) && this.C.equals(adaptedFunctionReference.C);
    }

    public int getArity() {
        return this.E;
    }

    public int hashCode() {
        Object obj = this.f40864z;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f40862A;
        if (cls != null) {
            i2 = cls.hashCode();
        }
        return ((((((((((hashCode + i2) * 31) + this.f40863B.hashCode()) * 31) + this.C.hashCode()) * 31) + (this.D ? 1231 : 1237)) * 31) + this.E) * 31) + this.F;
    }

    public String toString() {
        return Reflection.k(this);
    }
}
