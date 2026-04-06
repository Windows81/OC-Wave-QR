package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

@Metadata
public final class PlatformAutofillManagerImpl implements PlatformAutofillManager {

    /* renamed from: a  reason: collision with root package name */
    public final AutofillManager f15627a;

    public PlatformAutofillManagerImpl(AutofillManager autofillManager) {
        this.f15627a = autofillManager;
    }

    public void a(View view, int i2, AutofillValue autofillValue) {
        this.f15627a.notifyValueChanged(view, i2, autofillValue);
    }

    public void b(View view, int i2, Rect rect) {
        this.f15627a.requestAutofill(view, i2, rect);
    }

    public void c(View view, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT >= 27) {
            AutofillApi27Helper.f15577a.a(view, this.f15627a, i2, z2);
        }
    }

    public void cancel() {
        this.f15627a.cancel();
    }

    public void commit() {
        this.f15627a.commit();
    }

    public void d(View view, int i2) {
        this.f15627a.notifyViewExited(view, i2);
    }

    public void e(View view, int i2, Rect rect) {
        this.f15627a.notifyViewEntered(view, i2, rect);
    }
}
