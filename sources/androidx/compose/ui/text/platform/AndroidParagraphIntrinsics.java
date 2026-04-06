package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {

    /* renamed from: a  reason: collision with root package name */
    public final String f18952a;

    /* renamed from: b  reason: collision with root package name */
    public final TextStyle f18953b;

    /* renamed from: c  reason: collision with root package name */
    public final List f18954c;

    /* renamed from: d  reason: collision with root package name */
    public final List f18955d;

    /* renamed from: e  reason: collision with root package name */
    public final FontFamily.Resolver f18956e;

    /* renamed from: f  reason: collision with root package name */
    public final Density f18957f;

    /* renamed from: g  reason: collision with root package name */
    public final AndroidTextPaint f18958g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f18959h;

    /* renamed from: i  reason: collision with root package name */
    public final LayoutIntrinsics f18960i;

    /* renamed from: j  reason: collision with root package name */
    public TypefaceDirtyTrackerLinkedList f18961j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18962k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18963l;

    public AndroidParagraphIntrinsics(String str, TextStyle textStyle, List list, List list2, FontFamily.Resolver resolver, Density density) {
        Object obj;
        ArrayList arrayList;
        this.f18952a = str;
        this.f18953b = textStyle;
        this.f18954c = list;
        this.f18955d = list2;
        this.f18956e = resolver;
        this.f18957f = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.f18958g = androidTextPaint;
        this.f18962k = !AndroidParagraphIntrinsics_androidKt.c(textStyle) ? false : ((Boolean) EmojiCompatStatus.f18987a.a().getValue()).booleanValue();
        this.f18963l = AndroidParagraphIntrinsics_androidKt.d(textStyle.B(), textStyle.u());
        AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        TextPaintExtensions_androidKt.e(androidTextPaint, textStyle.E());
        SpanStyle N = textStyle.N();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((AnnotatedString.Range) obj).g() instanceof SpanStyle) {
                break;
            }
            i2++;
        }
        SpanStyle a2 = TextPaintExtensions_androidKt.a(androidTextPaint, N, androidParagraphIntrinsics$resolveTypeface$1, density, obj != null);
        if (a2 != null) {
            int size2 = this.f18954c.size() + 1;
            ArrayList arrayList2 = new ArrayList(size2);
            int i3 = 0;
            while (i3 < size2) {
                arrayList2.add(i3 == 0 ? new AnnotatedString.Range(a2, 0, this.f18952a.length()) : (AnnotatedString.Range) this.f18954c.get(i3 - 1));
                i3++;
            }
            arrayList = arrayList2;
        } else {
            arrayList = this.f18954c;
        }
        CharSequence a3 = AndroidParagraphHelper_androidKt.a(this.f18952a, this.f18958g.getTextSize(), this.f18953b, arrayList, this.f18955d, this.f18957f, androidParagraphIntrinsics$resolveTypeface$1, this.f18962k);
        this.f18959h = a3;
        this.f18960i = new LayoutIntrinsics(a3, this.f18958g, this.f18963l);
    }

    public boolean a() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.f18961j;
        return (typefaceDirtyTrackerLinkedList != null ? typefaceDirtyTrackerLinkedList.b() : false) || (!this.f18962k && AndroidParagraphIntrinsics_androidKt.c(this.f18953b) && ((Boolean) EmojiCompatStatus.f18987a.a().getValue()).booleanValue());
    }

    public float c() {
        return this.f18960i.j();
    }

    public final CharSequence e() {
        return this.f18959h;
    }

    public final FontFamily.Resolver f() {
        return this.f18956e;
    }

    public float g() {
        return this.f18960i.i();
    }

    public final LayoutIntrinsics h() {
        return this.f18960i;
    }

    public final TextStyle i() {
        return this.f18953b;
    }

    public final int j() {
        return this.f18963l;
    }

    public final AndroidTextPaint k() {
        return this.f18958g;
    }
}
