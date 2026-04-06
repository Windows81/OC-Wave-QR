package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

@Metadata
public final class AutofillSemanticCallback extends AutofillManager.AutofillCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final AutofillSemanticCallback f15586a = new AutofillSemanticCallback();

    public void onAutofillEvent(View view, int i2, int i3) {
        super.onAutofillEvent(view, i2, i3);
        Log.d("Autofill Status", i3 != 1 ? i3 != 2 ? i3 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
