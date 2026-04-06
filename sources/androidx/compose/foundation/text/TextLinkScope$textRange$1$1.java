package androidx.compose.foundation.text;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextLinkScope$textRange$1$1 extends Lambda implements Function0<IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ IntRect f6006z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextLinkScope$textRange$1$1(IntRect intRect) {
        super(0);
        this.f6006z = intRect;
    }

    public final long b() {
        return this.f6006z.k();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return IntOffset.c(b());
    }
}
