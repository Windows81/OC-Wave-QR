package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata
public final class AndroidAutofill implements Autofill {

    /* renamed from: a  reason: collision with root package name */
    public final View f15554a;

    /* renamed from: b  reason: collision with root package name */
    public final AutofillTree f15555b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f15556c;

    /* renamed from: d  reason: collision with root package name */
    public AutofillId f15557d;

    public AndroidAutofill(View view, AutofillTree autofillTree) {
        this.f15554a = view;
        this.f15555b = autofillTree;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f15556c = autofillManager;
            view.setImportantForAutofill(1);
            AutofillIdCompat a2 = ViewCompatShims.a(view);
            AutofillId a3 = a2 != null ? a2.a() : null;
            if (a3 != null) {
                this.f15557d = a3;
            } else {
                InlineClassHelperKt.d("Required value was null.");
                throw new KotlinNothingValueException();
            }
        } else {
            throw new IllegalStateException("Autofill service could not be located.");
        }
    }

    public final AutofillManager a() {
        return this.f15556c;
    }

    public final AutofillTree b() {
        return this.f15555b;
    }

    public final AutofillId c() {
        return this.f15557d;
    }

    public final View d() {
        return this.f15554a;
    }
}
