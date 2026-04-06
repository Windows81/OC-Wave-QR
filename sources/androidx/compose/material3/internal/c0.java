package androidx.compose.material3.internal;

import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ColorProducer f12398A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Outline f12399z;

    public /* synthetic */ c0(Outline outline, ColorProducer colorProducer) {
        this.f12399z = outline;
        this.f12398A = colorProducer;
    }

    public final Object invoke(Object obj) {
        return TextFieldImplKt.P(this.f12399z, this.f12398A, (DrawScope) obj);
    }
}
