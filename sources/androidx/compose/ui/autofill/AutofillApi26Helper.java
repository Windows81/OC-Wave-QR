package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

@Metadata
public final class AutofillApi26Helper {

    /* renamed from: a  reason: collision with root package name */
    public static final AutofillApi26Helper f15576a = new AutofillApi26Helper();

    public final void A(ViewStructure viewStructure, int i2) {
        viewStructure.setVisibility(i2);
    }

    public final CharSequence B(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public final int a(ViewStructure viewStructure, int i2) {
        return viewStructure.addChildCount(i2);
    }

    public final AutofillValue b(String str) {
        return AutofillValue.forText(str);
    }

    public final boolean c(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean d(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean e(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean f(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final ViewStructure g(ViewStructure viewStructure, int i2) {
        return viewStructure.newChild(i2);
    }

    public final void h(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void i(ViewStructure viewStructure, AutofillId autofillId, int i2) {
        viewStructure.setAutofillId(autofillId, i2);
    }

    public final void j(ViewStructure viewStructure, int i2) {
        viewStructure.setAutofillType(i2);
    }

    public final void k(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public final void l(ViewStructure viewStructure, boolean z2) {
        viewStructure.setCheckable(z2);
    }

    public final void m(ViewStructure viewStructure, boolean z2) {
        viewStructure.setChecked(z2);
    }

    public final void n(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public final void o(ViewStructure viewStructure, boolean z2) {
        viewStructure.setClickable(z2);
    }

    public final void p(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public final void q(ViewStructure viewStructure, boolean z2) {
        viewStructure.setDataIsSensitive(z2);
    }

    public final void r(ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
        viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
    }

    public final void s(ViewStructure viewStructure, boolean z2) {
        viewStructure.setEnabled(z2);
    }

    public final void t(ViewStructure viewStructure, boolean z2) {
        viewStructure.setFocusable(z2);
    }

    public final void u(ViewStructure viewStructure, boolean z2) {
        viewStructure.setFocused(z2);
    }

    public final void v(ViewStructure viewStructure, int i2, String str, String str2, String str3) {
        viewStructure.setId(i2, str, str2, str3);
    }

    public final void w(ViewStructure viewStructure, int i2) {
        viewStructure.setInputType(i2);
    }

    public final void x(ViewStructure viewStructure, boolean z2) {
        viewStructure.setLongClickable(z2);
    }

    public final void y(ViewStructure viewStructure, boolean z2) {
        viewStructure.setSelected(z2);
    }

    public final void z(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }
}
