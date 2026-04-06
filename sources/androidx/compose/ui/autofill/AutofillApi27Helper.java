package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

@Metadata
public final class AutofillApi27Helper {

    /* renamed from: a  reason: collision with root package name */
    public static final AutofillApi27Helper f15577a = new AutofillApi27Helper();

    public final void a(View view, AutofillManager autofillManager, int i2, boolean z2) {
        autofillManager.notifyViewVisibilityChanged(view, i2, z2);
    }
}
