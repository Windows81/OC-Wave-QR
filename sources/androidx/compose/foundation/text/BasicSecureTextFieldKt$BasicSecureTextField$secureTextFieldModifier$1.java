package androidx.compose.foundation.text;

import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1 f5496z = new BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1();

    public BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1() {
        super(1);
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.f0(semanticsPropertyReceiver, ContentType.f15598a.h());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
