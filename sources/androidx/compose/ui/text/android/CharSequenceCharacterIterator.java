package androidx.compose.ui.text.android;

import java.text.CharacterIterator;
import kotlin.Metadata;

@Metadata
public final class CharSequenceCharacterIterator implements CharacterIterator {

    /* renamed from: A  reason: collision with root package name */
    public final int f18516A;

    /* renamed from: B  reason: collision with root package name */
    public final int f18517B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public final CharSequence f18518z;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i2, int i3) {
        this.f18518z = charSequence;
        this.f18516A = i2;
        this.f18517B = i3;
        this.C = i2;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i2 = this.C;
        if (i2 == this.f18517B) {
            return 65535;
        }
        return this.f18518z.charAt(i2);
    }

    public char first() {
        this.C = this.f18516A;
        return current();
    }

    public int getBeginIndex() {
        return this.f18516A;
    }

    public int getEndIndex() {
        return this.f18517B;
    }

    public int getIndex() {
        return this.C;
    }

    public char last() {
        int i2 = this.f18516A;
        int i3 = this.f18517B;
        if (i2 == i3) {
            this.C = i3;
            return 65535;
        }
        int i4 = i3 - 1;
        this.C = i4;
        return this.f18518z.charAt(i4);
    }

    public char next() {
        int i2 = this.C + 1;
        this.C = i2;
        int i3 = this.f18517B;
        if (i2 < i3) {
            return this.f18518z.charAt(i2);
        }
        this.C = i3;
        return 65535;
    }

    public char previous() {
        int i2 = this.C;
        if (i2 <= this.f18516A) {
            return 65535;
        }
        int i3 = i2 - 1;
        this.C = i3;
        return this.f18518z.charAt(i3);
    }

    public char setIndex(int i2) {
        int i3 = this.f18516A;
        if (i2 > this.f18517B || i3 > i2) {
            throw new IllegalArgumentException("invalid position");
        }
        this.C = i2;
        return current();
    }
}
