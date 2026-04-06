package z;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.ui.effects.StatusBarProtectionEffectKt;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class l implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f44370A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f44371B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f44372z;

    public /* synthetic */ l(long j2, int i2, int i3) {
        this.f44372z = j2;
        this.f44370A = i2;
        this.f44371B = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return StatusBarProtectionEffectKt.e(this.f44372z, this.f44370A, this.f44371B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
