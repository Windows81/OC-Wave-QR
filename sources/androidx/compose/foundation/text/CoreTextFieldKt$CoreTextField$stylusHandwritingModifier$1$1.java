package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LegacyPlatformTextInputServiceAdapter f5712A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5713z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1(boolean z2, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter) {
        super(0);
        this.f5713z = z2;
        this.f5712A = legacyPlatformTextInputServiceAdapter;
    }

    public final void invoke() {
        if (this.f5713z) {
            this.f5712A.k();
        }
    }
}
