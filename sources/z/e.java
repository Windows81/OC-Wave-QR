package z;

import androidx.compose.runtime.DisposableEffectScope;
import com.hansecom.abt.presentation.nfc.NfcHelper;
import com.hansecom.abt.ui.effects.NfcSuppressionEffectKt;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NfcHelper f44357z;

    public /* synthetic */ e(NfcHelper nfcHelper) {
        this.f44357z = nfcHelper;
    }

    public final Object invoke(Object obj) {
        return NfcSuppressionEffectKt.f(this.f44357z, (DisposableEffectScope) obj);
    }
}
