package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class MultiParagraph$fillBoundingBoxes$1 extends Lambda implements Function1<ParagraphInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float[] f18295A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f18296B;
    public final /* synthetic */ Ref.FloatRef C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f18297z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiParagraph$fillBoundingBoxes$1(long j2, float[] fArr, Ref.IntRef intRef, Ref.FloatRef floatRef) {
        super(1);
        this.f18297z = j2;
        this.f18295A = fArr;
        this.f18296B = intRef;
        this.C = floatRef;
    }

    public final void b(ParagraphInfo paragraphInfo) {
        long j2 = this.f18297z;
        float[] fArr = this.f18295A;
        Ref.IntRef intRef = this.f18296B;
        Ref.FloatRef floatRef = this.C;
        long b2 = TextRangeKt.b(paragraphInfo.r(paragraphInfo.f() > TextRange.l(j2) ? paragraphInfo.f() : TextRange.l(j2)), paragraphInfo.r(paragraphInfo.b() < TextRange.k(j2) ? paragraphInfo.b() : TextRange.k(j2)));
        paragraphInfo.e().k(b2, fArr, intRef.f40906z);
        int j3 = intRef.f40906z + (TextRange.j(b2) * 4);
        for (int i2 = intRef.f40906z; i2 < j3; i2 += 4) {
            int i3 = i2 + 1;
            float f2 = fArr[i3];
            float f3 = floatRef.f40905z;
            fArr[i3] = f2 + f3;
            int i4 = i2 + 3;
            fArr[i4] = fArr[i4] + f3;
        }
        intRef.f40906z = j3;
        floatRef.f40905z += paragraphInfo.e().a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ParagraphInfo) obj);
        return Unit.f40552a;
    }
}
