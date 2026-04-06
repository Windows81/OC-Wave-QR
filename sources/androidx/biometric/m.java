package androidx.biometric;

import android.hardware.biometrics.PromptVerticalListContentView;
import androidx.biometric.PromptContentViewUtils;
import java.util.function.Consumer;

public final /* synthetic */ class m implements Consumer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PromptVerticalListContentView.Builder f1552z;

    public /* synthetic */ m(PromptVerticalListContentView.Builder builder) {
        this.f1552z = builder;
    }

    public final void accept(Object obj) {
        PromptContentViewUtils.Api35Impl.d(this.f1552z, (PromptContentItem) obj);
    }
}
