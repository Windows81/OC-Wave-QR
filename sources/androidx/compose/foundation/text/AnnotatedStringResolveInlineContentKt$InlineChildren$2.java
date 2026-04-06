package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnnotatedStringResolveInlineContentKt$InlineChildren$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f5479A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f5480B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5481z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotatedStringResolveInlineContentKt$InlineChildren$2(AnnotatedString annotatedString, List list, int i2) {
        super(2);
        this.f5481z = annotatedString;
        this.f5479A = list;
        this.f5480B = i2;
    }

    public final void b(Composer composer, int i2) {
        AnnotatedStringResolveInlineContentKt.a(this.f5481z, this.f5479A, composer, RecomposeScopeImplKt.a(this.f5480B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
