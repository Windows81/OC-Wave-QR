package z;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.ui.effects.StatusBarColorEffectKt;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class h implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f44361A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f44362z;

    public /* synthetic */ h(boolean z2, int i2) {
        this.f44362z = z2;
        this.f44361A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return StatusBarColorEffectKt.g(this.f44362z, this.f44361A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
