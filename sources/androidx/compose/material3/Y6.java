package androidx.compose.material3;

import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class Y6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11821A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f11822B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f11823z;

    public /* synthetic */ Y6(Function2 function2, Function2 function22, Function3 function3) {
        this.f11823z = function2;
        this.f11821A = function22;
        this.f11822B = function3;
    }

    public final Object m(Object obj, Object obj2) {
        return TabRowKt$TabRowWithSubcomposeImpl$1.f(this.f11823z, this.f11821A, this.f11822B, (SubcomposeMeasureScope) obj, (Constraints) obj2);
    }
}
