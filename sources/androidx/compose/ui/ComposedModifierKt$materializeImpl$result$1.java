package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class ComposedModifierKt$materializeImpl$result$1 extends Lambda implements Function2<Modifier, Modifier.Element, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Composer f15483z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materializeImpl$result$1(Composer composer) {
        super(2);
        this.f15483z = composer;
    }

    /* renamed from: b */
    public final Modifier m(Modifier modifier, Modifier.Element element) {
        boolean z2 = element instanceof ComposedModifier;
        Modifier modifier2 = element;
        if (z2) {
            Function3 a2 = ((ComposedModifier) element).a();
            Intrinsics.g(a2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            modifier2 = ComposedModifierKt.d(this.f15483z, (Modifier) ((Function3) TypeIntrinsics.e(a2, 3)).d(Modifier.f15489d, this.f15483z, 0));
        }
        return modifier.o0(modifier2);
    }
}
