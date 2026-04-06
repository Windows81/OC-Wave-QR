package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextLinkScope$LinksComposables$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5995A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f5996z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$2(TextLinkScope textLinkScope, int i2) {
        super(2);
        this.f5996z = textLinkScope;
        this.f5995A = i2;
    }

    public final void b(Composer composer, int i2) {
        this.f5996z.b(composer, RecomposeScopeImplKt.a(this.f5995A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
