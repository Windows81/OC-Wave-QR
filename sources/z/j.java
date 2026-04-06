package z;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.ui.effects.StatusBarColorEffectKt;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class j implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f44366A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f44367z;

    public /* synthetic */ j(boolean z2, int i2) {
        this.f44367z = z2;
        this.f44366A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return StatusBarColorEffectKt.i(this.f44367z, this.f44366A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
