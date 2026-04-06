package z;

import android.app.Activity;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import com.hansecom.abt.ui.effects.BarcodeBrightnessEffectKt;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f44353A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Activity f44354z;

    public /* synthetic */ b(Activity activity, MutableState mutableState) {
        this.f44354z = activity;
        this.f44353A = mutableState;
    }

    public final Object invoke(Object obj) {
        return BarcodeBrightnessEffectKt.h(this.f44354z, this.f44353A, (DisposableEffectScope) obj);
    }
}
