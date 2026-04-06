package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;

@Metadata
public final class SelectableInfo {

    /* renamed from: g  reason: collision with root package name */
    public static final int f6769g = TextLayoutResult.f18478g;

    /* renamed from: a  reason: collision with root package name */
    public final long f6770a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6771b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6772c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6773d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6774e;

    /* renamed from: f  reason: collision with root package name */
    public final TextLayoutResult f6775f;

    public SelectableInfo(long j2, int i2, int i3, int i4, int i5, TextLayoutResult textLayoutResult) {
        this.f6770a = j2;
        this.f6771b = i2;
        this.f6772c = i3;
        this.f6773d = i4;
        this.f6774e = i5;
        this.f6775f = textLayoutResult;
    }

    public final Selection.AnchorInfo a(int i2) {
        return new Selection.AnchorInfo(SelectionLayoutKt.b(this.f6775f, i2), i2, this.f6770a);
    }

    public final ResolvedTextDirection b() {
        return SelectionLayoutKt.b(this.f6775f, this.f6773d);
    }

    public final String c() {
        return this.f6775f.l().j().k();
    }

    public final CrossStatus d() {
        int i2 = this.f6772c;
        int i3 = this.f6773d;
        return i2 < i3 ? CrossStatus.NOT_CROSSED : i2 > i3 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final int e() {
        return this.f6773d;
    }

    public final int f() {
        return this.f6774e;
    }

    public final int g() {
        return this.f6772c;
    }

    public final long h() {
        return this.f6770a;
    }

    public final int i() {
        return this.f6771b;
    }

    public final ResolvedTextDirection j() {
        return SelectionLayoutKt.b(this.f6775f, this.f6772c);
    }

    public final TextLayoutResult k() {
        return this.f6775f;
    }

    public final int l() {
        return c().length();
    }

    public final Selection m(int i2, int i3) {
        return new Selection(a(i2), a(i3), i2 > i3);
    }

    public final boolean n(SelectableInfo selectableInfo) {
        return (this.f6770a == selectableInfo.f6770a && this.f6772c == selectableInfo.f6772c && this.f6773d == selectableInfo.f6773d) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.f6770a + ", range=(" + this.f6772c + '-' + j() + ',' + this.f6773d + '-' + b() + "), prevOffset=" + this.f6774e + ')';
    }
}
