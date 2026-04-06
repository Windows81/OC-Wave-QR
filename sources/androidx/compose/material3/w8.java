package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class w8 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f14459A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f14460z;

    public /* synthetic */ w8(long j2, State state) {
        this.f14460z = j2;
        this.f14459A = state;
    }

    public final Object invoke(Object obj) {
        return WideNavigationRailKt.A(this.f14460z, this.f14459A, (DrawScope) obj);
    }
}
