package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextUndoOperation {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f6580i = new Companion((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final Saver f6581j = new TextUndoOperation$Companion$Saver$1();

    /* renamed from: a  reason: collision with root package name */
    public final int f6582a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6583b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6584c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6585d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6586e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6587f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6588g;

    /* renamed from: h  reason: collision with root package name */
    public final TextEditType f6589h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return TextUndoOperation.f6581j;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, j2, j3, j4, z2);
    }

    public final boolean b() {
        return this.f6588g;
    }

    public final TextDeleteType c() {
        return this.f6589h != TextEditType.Delete ? TextDeleteType.NotByUser : !TextRange.h(this.f6586e) ? TextDeleteType.NotByUser : TextRange.h(this.f6585d) ? TextRange.n(this.f6585d) > TextRange.n(this.f6586e) ? TextDeleteType.Start : TextDeleteType.End : (TextRange.n(this.f6585d) == TextRange.n(this.f6586e) && TextRange.n(this.f6585d) == this.f6582a) ? TextDeleteType.Inner : TextDeleteType.NotByUser;
    }

    public final int d() {
        return this.f6582a;
    }

    public final long e() {
        return this.f6586e;
    }

    public final String f() {
        return this.f6584c;
    }

    public final long g() {
        return this.f6585d;
    }

    public final String h() {
        return this.f6583b;
    }

    public final TextEditType i() {
        return this.f6589h;
    }

    public final long j() {
        return this.f6587f;
    }

    public TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2) {
        TextEditType textEditType;
        this.f6582a = i2;
        this.f6583b = str;
        this.f6584c = str2;
        this.f6585d = j2;
        this.f6586e = j3;
        this.f6587f = j4;
        this.f6588g = z2;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str.length() == 0 && str2.length() > 0) {
            textEditType = TextEditType.Insert;
        } else if (str.length() <= 0 || str2.length() != 0) {
            textEditType = TextEditType.Replace;
        } else {
            textEditType = TextEditType.Delete;
        }
        this.f6589h = textEditType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, j2, j3, (i3 & 32) != 0 ? UndoManager_jvmKt.a() : j4, (i3 & 64) != 0 ? true : z2, (DefaultConstructorMarker) null);
    }
}
