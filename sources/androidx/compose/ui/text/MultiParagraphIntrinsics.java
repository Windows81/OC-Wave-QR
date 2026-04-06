package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f18301a;

    /* renamed from: b  reason: collision with root package name */
    public final List f18302b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f18303c;

    /* renamed from: d  reason: collision with root package name */
    public final Lazy f18304d;

    /* renamed from: e  reason: collision with root package name */
    public final List f18305e;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver) {
        AnnotatedString annotatedString2 = annotatedString;
        this.f18301a = annotatedString2;
        this.f18302b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f18303c = LazyKt.a(lazyThreadSafetyMode, new MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.f18304d = LazyKt.a(lazyThreadSafetyMode, new MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        ParagraphStyle M = textStyle.M();
        List j2 = AnnotatedStringKt.j(annotatedString2, M);
        ArrayList arrayList = new ArrayList(j2.size());
        int size = j2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) j2.get(i2);
            AnnotatedString c2 = AnnotatedStringKt.k(annotatedString2, range.h(), range.f());
            ParagraphStyle b2 = h((ParagraphStyle) range.g(), M);
            String k2 = c2.k();
            TextStyle I = textStyle.I(b2);
            List c3 = c2.c();
            if (c3 == null) {
                c3 = CollectionsKt.m();
            }
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.a(k2, I, c3, density, resolver, MultiParagraphIntrinsicsKt.b(f(), range.h(), range.f())), range.h(), range.f()));
        }
        this.f18305e = arrayList;
    }

    public boolean a() {
        List list = this.f18305e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ParagraphIntrinsicInfo) list.get(i2)).b().a()) {
                return true;
            }
        }
        return false;
    }

    public float c() {
        return ((Number) this.f18303c.getValue()).floatValue();
    }

    public final AnnotatedString d() {
        return this.f18301a;
    }

    public final List e() {
        return this.f18305e;
    }

    public final List f() {
        return this.f18302b;
    }

    public float g() {
        return ((Number) this.f18304d.getValue()).floatValue();
    }

    public final ParagraphStyle h(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        if (!TextDirection.j(paragraphStyle.i(), TextDirection.f19094b.f())) {
            return paragraphStyle;
        }
        return ParagraphStyle.b(paragraphStyle, 0, paragraphStyle2.i(), 0, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 509, (Object) null);
    }
}
