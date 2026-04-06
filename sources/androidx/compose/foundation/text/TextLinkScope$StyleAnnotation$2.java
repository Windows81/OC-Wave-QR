package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextLinkScope$StyleAnnotation$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object[] f5999A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f6000B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6001z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextLinkScope$StyleAnnotation$2(TextLinkScope textLinkScope, Object[] objArr, Function1 function1, int i2) {
        super(2);
        this.f6001z = textLinkScope;
        this.f5999A = objArr;
        this.f6000B = function1;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        TextLinkScope textLinkScope = this.f6001z;
        Object[] objArr = this.f5999A;
        textLinkScope.c(Arrays.copyOf(objArr, objArr.length), this.f6000B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
