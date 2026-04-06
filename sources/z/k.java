package z;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.hansecom.abt.ui.effects.StatusBarProtectionEffectKt;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class k implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f44368A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f44369z;

    public /* synthetic */ k(long j2, float f2) {
        this.f44369z = j2;
        this.f44368A = f2;
    }

    public final Object invoke(Object obj) {
        return StatusBarProtectionEffectKt.d(this.f44369z, this.f44368A, (DrawScope) obj);
    }
}
