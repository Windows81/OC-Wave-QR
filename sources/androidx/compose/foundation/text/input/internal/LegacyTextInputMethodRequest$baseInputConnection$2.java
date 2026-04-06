package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LegacyTextInputMethodRequest$baseInputConnection$2 extends Lambda implements Function0<BaseInputConnection> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextInputMethodRequest f6253z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyTextInputMethodRequest$baseInputConnection$2(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
        super(0);
        this.f6253z = legacyTextInputMethodRequest;
    }

    /* renamed from: b */
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f6253z.i(), false);
    }
}
