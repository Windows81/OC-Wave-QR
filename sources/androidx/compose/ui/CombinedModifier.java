package androidx.compose.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CombinedModifier implements Modifier {

    /* renamed from: A  reason: collision with root package name */
    public final Modifier f15470A;

    /* renamed from: z  reason: collision with root package name */
    public final Modifier f15471z;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.f15471z = modifier;
        this.f15470A = modifier2;
    }

    public Object C(Object obj, Function2 function2) {
        return this.f15470A.C(this.f15471z.C(obj, function2), function2);
    }

    public boolean P(Function1 function1) {
        return this.f15471z.P(function1) && this.f15470A.P(function1);
    }

    public final Modifier a() {
        return this.f15470A;
    }

    public final Modifier b() {
        return this.f15471z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            return Intrinsics.d(this.f15471z, combinedModifier.f15471z) && Intrinsics.d(this.f15470A, combinedModifier.f15470A);
        }
    }

    public int hashCode() {
        return this.f15471z.hashCode() + (this.f15470A.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) C("", CombinedModifier$toString$1.f15472z)) + ']';
    }
}
