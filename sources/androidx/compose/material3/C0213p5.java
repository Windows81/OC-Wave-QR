package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.p5  reason: case insensitive filesystem */
public final /* synthetic */ class C0213p5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12579A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f12580B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ ScaffoldKt$ScaffoldLayout$contentPadding$1$1 F;
    public final /* synthetic */ Function2 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f12581z;

    public /* synthetic */ C0213p5(WindowInsets windowInsets, Function2 function2, Function2 function22, Function2 function23, int i2, Function2 function24, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function25) {
        this.f12581z = windowInsets;
        this.f12579A = function2;
        this.f12580B = function22;
        this.C = function23;
        this.D = i2;
        this.E = function24;
        this.F = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.G = function25;
    }

    public final Object m(Object obj, Object obj2) {
        return ScaffoldKt.h(this.f12581z, this.f12579A, this.f12580B, this.C, this.D, this.E, this.F, this.G, (SubcomposeMeasureScope) obj, (Constraints) obj2);
    }
}
