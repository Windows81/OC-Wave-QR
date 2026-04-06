package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class E3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f9895A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f9896z;

    public /* synthetic */ E3(long j2, State state) {
        this.f9896z = j2;
        this.f9895A = state;
    }

    public final Object invoke(Object obj) {
        return ModalBottomSheetKt.L(this.f9896z, this.f9895A, (DrawScope) obj);
    }
}
