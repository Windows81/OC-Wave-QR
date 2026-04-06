package androidx.compose.material3;

import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class V6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11714A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f11715B;
    public final /* synthetic */ ScrollableTabData C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Function3 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f11716z;

    public /* synthetic */ V6(float f2, Function2 function2, Function2 function22, ScrollableTabData scrollableTabData, int i2, Function3 function3) {
        this.f11716z = f2;
        this.f11714A = function2;
        this.f11715B = function22;
        this.C = scrollableTabData;
        this.D = i2;
        this.E = function3;
    }

    public final Object m(Object obj, Object obj2) {
        return TabRowKt$ScrollableTabRowWithSubcomposeImpl$1.f(this.f11716z, this.f11714A, this.f11715B, this.C, this.D, this.E, (SubcomposeMeasureScope) obj, (Constraints) obj2);
    }
}
