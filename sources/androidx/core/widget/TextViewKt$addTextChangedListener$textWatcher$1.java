package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function4 f20470A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function4 f20471B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f20472z;

    public void afterTextChanged(Editable editable) {
        this.f20472z.invoke(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f20470A.j(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f20471B.j(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }
}
