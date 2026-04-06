package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$1 extends Lambda implements Function1<LegacyTextInputMethodRequest, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter f6105A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ImeOptions f6106B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6107z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$1(TextFieldValue textFieldValue, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        super(1);
        this.f6107z = textFieldValue;
        this.f6105A = androidLegacyPlatformTextInputServiceAdapter;
        this.f6106B = imeOptions;
        this.C = function1;
        this.D = function12;
    }

    public final void b(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
        legacyTextInputMethodRequest.l(this.f6107z, this.f6105A.i(), this.f6106B, this.C, this.D);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LegacyTextInputMethodRequest) obj);
        return Unit.f40552a;
    }
}
