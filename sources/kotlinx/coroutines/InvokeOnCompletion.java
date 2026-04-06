package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class InvokeOnCompletion extends JobNode {
    public final Function1 D;

    public InvokeOnCompletion(Function1 function1) {
        this.D = function1;
    }

    public boolean w() {
        return false;
    }

    public void x(Throwable th) {
        this.D.invoke(th);
    }
}
