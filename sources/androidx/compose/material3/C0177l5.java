package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.l5  reason: case insensitive filesystem */
public final /* synthetic */ class C0177l5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f12512A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f12513B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ Function1 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f12514z;

    public /* synthetic */ C0177l5(int i2, float f2, Function0 function0, long j2, long j3, Function1 function1) {
        this.f12514z = i2;
        this.f12512A = f2;
        this.f12513B = function0;
        this.C = j2;
        this.D = j3;
        this.E = function1;
    }

    public final Object invoke(Object obj) {
        return ProgressIndicatorKt.A(this.f12514z, this.f12512A, this.f12513B, this.C, this.D, this.E, (DrawScope) obj);
    }
}
