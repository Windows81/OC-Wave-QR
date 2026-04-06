package androidx.compose.ui.graphics;

import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class L implements DoubleUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f16045a;

    public /* synthetic */ L(Function1 function1) {
        this.f16045a = function1;
    }

    public final double applyAsDouble(double d2) {
        return ColorSpaceVerificationHelper.e(this.f16045a, d2);
    }
}
