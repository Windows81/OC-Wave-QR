package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.CharIterator;

@Metadata
public final class StringsKt__StringsKt$iterator$1 extends CharIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CharSequence f41185A;

    /* renamed from: z  reason: collision with root package name */
    public int f41186z;

    public StringsKt__StringsKt$iterator$1(CharSequence charSequence) {
        this.f41185A = charSequence;
    }

    public char b() {
        CharSequence charSequence = this.f41185A;
        int i2 = this.f41186z;
        this.f41186z = i2 + 1;
        return charSequence.charAt(i2);
    }

    public boolean hasNext() {
        return this.f41186z < this.f41185A.length();
    }
}
