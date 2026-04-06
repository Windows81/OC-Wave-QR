package androidx.compose.ui.graphics;

import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class K implements DoubleUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f16044a;

    public /* synthetic */ K(Function1 function1) {
        this.f16044a = function1;
    }

    public final double applyAsDouble(double d2) {
        return ColorSpaceVerificationHelper.d(this.f16044a, d2);
    }
}
