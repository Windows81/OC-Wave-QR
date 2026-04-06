package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public interface CancelHandler extends NotCompleted {

    @Metadata
    public static final class UserSupplied implements CancelHandler {

        /* renamed from: z  reason: collision with root package name */
        public final Function1 f41367z;

        public UserSupplied(Function1 function1) {
            this.f41367z = function1;
        }

        public void e(Throwable th) {
            this.f41367z.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + DebugStringsKt.a(this.f41367z) + '@' + DebugStringsKt.b(this) + ']';
        }
    }

    void e(Throwable th);
}
