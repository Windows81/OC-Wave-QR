package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;

public class AutofillIdCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17973a;

    public AutofillIdCompat(AutofillId autofillId) {
        this.f17973a = autofillId;
    }

    public static AutofillIdCompat b(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.f17973a;
    }
}
