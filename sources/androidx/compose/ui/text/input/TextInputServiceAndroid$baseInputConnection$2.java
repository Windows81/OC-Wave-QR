package androidx.compose.ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextInputServiceAndroid$baseInputConnection$2 extends Lambda implements Function0<BaseInputConnection> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextInputServiceAndroid f18919z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.f18919z = textInputServiceAndroid;
    }

    /* renamed from: b */
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f18919z.q(), false);
    }
}
