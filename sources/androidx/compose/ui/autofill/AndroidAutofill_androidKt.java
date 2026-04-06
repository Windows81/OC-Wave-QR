package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;

@Metadata
public final class AndroidAutofill_androidKt {
    public static final void a(AndroidAutofill androidAutofill, SparseArray sparseArray) {
        if (!androidAutofill.b().a().isEmpty()) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f15576a;
                if (autofillApi26Helper.e(autofillValue)) {
                    androidAutofill.b().b(keyAt, autofillApi26Helper.B(autofillValue).toString());
                } else if (autofillApi26Helper.c(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: " + "b/138604541: Add onFill() callback for date");
                } else if (autofillApi26Helper.d(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: " + "b/138604541: Add onFill() callback for list");
                } else if (autofillApi26Helper.f(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: " + "b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        ViewStructure viewStructure2 = viewStructure;
        if (!androidAutofill.b().a().isEmpty()) {
            int a2 = AutofillApi26Helper.f15576a.a(viewStructure2, androidAutofill.b().a().size());
            for (Map.Entry entry : androidAutofill.b().a().entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                AutofillNode autofillNode = (AutofillNode) entry.getValue();
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f15576a;
                ViewStructure g2 = autofillApi26Helper.g(viewStructure2, a2);
                autofillApi26Helper.i(g2, androidAutofill.c(), intValue);
                autofillApi26Helper.v(g2, intValue, androidAutofill.d().getContext().getPackageName(), (String) null, (String) null);
                autofillApi26Helper.j(g2, ContentDataType_androidKt.b(ContentDataType.f15591a.a()));
                List a3 = autofillNode.a();
                ArrayList arrayList = new ArrayList(a3.size());
                int size = a3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(AndroidAutofillType_androidKt.a((AutofillType) a3.get(i2)));
                }
                autofillApi26Helper.h(g2, (String[]) arrayList.toArray(new String[0]));
                Rect b2 = autofillNode.b();
                if (b2 == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int round = Math.round(b2.o());
                    int round2 = Math.round(b2.r());
                    AutofillApi26Helper.f15576a.r(g2, round, round2, 0, 0, Math.round(b2.p()) - round, Math.round(b2.i()) - round2);
                }
                a2++;
            }
        }
    }
}
