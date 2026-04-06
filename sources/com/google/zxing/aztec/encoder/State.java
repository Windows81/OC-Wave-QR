package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.LinkedList;

final class State {

    /* renamed from: e  reason: collision with root package name */
    public static final State f32501e = new State(Token.f32506b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f32502a;

    /* renamed from: b  reason: collision with root package name */
    public final Token f32503b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32504c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32505d;

    public State(Token token, int i2, int i3, int i4) {
        this.f32503b = token;
        this.f32502a = i2;
        this.f32504c = i3;
        this.f32505d = i4;
    }

    public static int b(State state) {
        int i2 = state.f32504c;
        if (i2 > 62) {
            return 21;
        }
        if (i2 > 31) {
            return 20;
        }
        return i2 > 0 ? 10 : 0;
    }

    public State a(int i2) {
        Token token = this.f32503b;
        int i3 = this.f32502a;
        int i4 = this.f32505d;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder.f32494c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            token = token.a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f32504c;
        State state = new State(token, i3, i8 + 1, i4 + ((i8 == 0 || i8 == 31) ? 18 : i8 == 62 ? 9 : 8));
        return state.f32504c == 2078 ? state.c(i2 + 1) : state;
    }

    public State c(int i2) {
        int i3 = this.f32504c;
        return i3 == 0 ? this : new State(this.f32503b.b(i2 - i3, i3), this.f32502a, 0, this.f32505d);
    }

    public int d() {
        return this.f32504c;
    }

    public int e() {
        return this.f32505d;
    }

    public int f() {
        return this.f32502a;
    }

    public boolean g(State state) {
        int i2 = this.f32505d + (HighLevelEncoder.f32494c[this.f32502a][state.f32502a] >> 16);
        int i3 = this.f32504c;
        int i4 = state.f32504c;
        if (i3 < i4) {
            i2 += b(state) - b(this);
        } else if (i3 > i4 && i4 > 0) {
            i2 += 10;
        }
        return i2 <= state.f32505d;
    }

    public State h(int i2, int i3) {
        int i4 = this.f32505d;
        Token token = this.f32503b;
        int i5 = this.f32502a;
        if (i2 != i5) {
            int i6 = HighLevelEncoder.f32494c[i5][i2];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            token = token.a(i7, i8);
            i4 += i8;
        }
        int i9 = i2 == 2 ? 4 : 5;
        return new State(token.a(i3, i9), i2, 0, i4 + i9);
    }

    public State i(int i2, int i3) {
        Token token = this.f32503b;
        int i4 = this.f32502a;
        int i5 = i4 == 2 ? 4 : 5;
        return new State(token.a(HighLevelEncoder.f32496e[i4][i2], i5).a(i3, 5), this.f32502a, 0, this.f32505d + i5 + 5);
    }

    public BitArray j(byte[] bArr) {
        LinkedList<Token> linkedList = new LinkedList<>();
        for (Token token = c(bArr.length).f32503b; token != null; token = token.d()) {
            linkedList.addFirst(token);
        }
        BitArray bitArray = new BitArray();
        for (Token c2 : linkedList) {
            c2.c(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{HighLevelEncoder.f32493b[this.f32502a], Integer.valueOf(this.f32505d), Integer.valueOf(this.f32504c)});
    }
}
