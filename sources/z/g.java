package z;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.ui.effects.StatusBarColorEffectKt;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f44359A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f44360z;

    public /* synthetic */ g(boolean z2, int i2) {
        this.f44360z = z2;
        this.f44359A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return StatusBarColorEffectKt.f(this.f44360z, this.f44359A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
