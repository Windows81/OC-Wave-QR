package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public final class SelectKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function3 f41944a = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.f41950z;

    /* renamed from: b  reason: collision with root package name */
    public static final Symbol f41945b = new Symbol("STATE_REG");

    /* renamed from: c  reason: collision with root package name */
    public static final Symbol f41946c = new Symbol("STATE_COMPLETED");

    /* renamed from: d  reason: collision with root package name */
    public static final Symbol f41947d = new Symbol("STATE_CANCELLED");

    /* renamed from: e  reason: collision with root package name */
    public static final Symbol f41948e = new Symbol("NO_RESULT");

    /* renamed from: f  reason: collision with root package name */
    public static final Symbol f41949f = new Symbol("PARAM_CLAUSE_0");

    public static final TrySelectDetailedResult a(int i2) {
        if (i2 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i2 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i2 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i2 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i2).toString());
    }

    public static final Symbol i() {
        return f41949f;
    }

    public static final boolean j(CancellableContinuation cancellableContinuation, Function3 function3) {
        Object Z = cancellableContinuation.Z(Unit.f40552a, (Object) null, function3);
        if (Z == null) {
            return false;
        }
        cancellableContinuation.a0(Z);
        return true;
    }
}
