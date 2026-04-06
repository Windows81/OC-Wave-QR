package androidx.lifecycle;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f21985z;

    public Transformations$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        Intrinsics.i(function1, "function");
        this.f21985z = function1;
    }

    public final /* synthetic */ void a(Object obj) {
        this.f21985z.invoke(obj);
    }

    public final Function d() {
        return this.f21985z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(d(), ((FunctionAdapter) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
