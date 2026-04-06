package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

@Metadata
public interface PlatformAutofillManager {
    void a(View view, int i2, AutofillValue autofillValue);

    void b(View view, int i2, Rect rect);

    void c(View view, int i2, boolean z2);

    void cancel();

    void commit();

    void d(View view, int i2);

    void e(View view, int i2, Rect rect);
}
