package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidParagraphIntrinsics$resolveTypeface$1 extends Lambda implements Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidParagraphIntrinsics f18964z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.f18964z = androidParagraphIntrinsics;
    }

    public final Typeface b(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3) {
        State a2 = this.f18964z.f().a(fontFamily, fontWeight, i2, i3);
        if (!(a2 instanceof TypefaceResult.Immutable)) {
            TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = new TypefaceDirtyTrackerLinkedList(a2, this.f18964z.f18961j);
            this.f18964z.f18961j = typefaceDirtyTrackerLinkedList;
            return typefaceDirtyTrackerLinkedList.a();
        }
        Object value = a2.getValue();
        Intrinsics.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) value;
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return b((FontFamily) obj, (FontWeight) obj2, ((FontStyle) obj3).i(), ((FontSynthesis) obj4).m());
    }
}
