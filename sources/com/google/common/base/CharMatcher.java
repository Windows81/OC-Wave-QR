package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;

@ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements Predicate<Character> {

    /* renamed from: com.google.common.base.CharMatcher$1  reason: invalid class name */
    class AnonymousClass1 extends NegatedFastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ String f27650A;

        public String toString() {
            return this.f27650A;
        }
    }

    public static final class And extends CharMatcher {

        /* renamed from: A  reason: collision with root package name */
        public final CharMatcher f27651A;

        /* renamed from: z  reason: collision with root package name */
        public final CharMatcher f27652z;

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f27652z = (CharMatcher) Preconditions.q(charMatcher);
            this.f27651A = (CharMatcher) Preconditions.q(charMatcher2);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            return this.f27652z.o(c2) && this.f27651A.o(c2);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27652z);
            String valueOf2 = String.valueOf(this.f27651A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19 + valueOf2.length());
            sb.append("CharMatcher.and(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class Any extends NamedFastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public static final Any f27653A = new Any();

        public Any() {
            super("CharMatcher.any()");
        }

        public CharMatcher b(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.q(charMatcher);
        }

        public int g(CharSequence charSequence) {
            return charSequence.length();
        }

        public int i(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public int j(CharSequence charSequence, int i2) {
            int length = charSequence.length();
            Preconditions.t(i2, length);
            if (i2 == length) {
                return -1;
            }
            return i2;
        }

        public boolean o(char c2) {
            return true;
        }

        public boolean p(CharSequence charSequence) {
            Preconditions.q(charSequence);
            return true;
        }

        public boolean q(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public CharMatcher r() {
            return CharMatcher.s();
        }

        public CharMatcher u(CharMatcher charMatcher) {
            Preconditions.q(charMatcher);
            return this;
        }
    }

    public static final class AnyOf extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public final char[] f27654z;

        public AnyOf(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f27654z = charArray;
            Arrays.sort(charArray);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            return Arrays.binarySearch(this.f27654z, c2) >= 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char a2 : this.f27654z) {
                sb.append(CharMatcher.v(a2));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    public static final class Ascii extends NamedFastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public static final Ascii f27655A = new Ascii();

        public Ascii() {
            super("CharMatcher.ascii()");
        }

        public boolean o(char c2) {
            return c2 <= 127;
        }
    }

    public static final class BitSetMatcher extends NamedFastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public final BitSet f27656A;

        public boolean o(char c2) {
            return this.f27656A.get(c2);
        }
    }

    public static final class BreakingWhitespace extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public static final CharMatcher f27657z = new BreakingWhitespace();

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            if (!(c2 == ' ' || c2 == 133 || c2 == 5760)) {
                if (c2 == 8199) {
                    return false;
                }
                if (!(c2 == 8287 || c2 == 12288 || c2 == 8232 || c2 == 8233)) {
                    switch (c2) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return c2 >= 8192 && c2 <= 8202;
                    }
                }
            }
            return true;
        }

        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    public static final class Digit extends RangesMatcher {
        public static final Digit C = new Digit();

        public Digit() {
            super("CharMatcher.digit()", y(), x());
        }

        public static char[] x() {
            char[] cArr = new char[37];
            for (int i2 = 0; i2 < 37; i2++) {
                cArr[i2] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i2) + 9);
            }
            return cArr;
        }

        public static char[] y() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }
    }

    public static abstract class FastMatcher extends CharMatcher {
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public CharMatcher r() {
            return new NegatedFastMatcher(this);
        }
    }

    public static final class ForPredicate extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public final Predicate f27658z;

        /* renamed from: e */
        public boolean apply(Character ch) {
            return this.f27658z.apply(Preconditions.q(ch));
        }

        public boolean o(char c2) {
            return this.f27658z.apply(Character.valueOf(c2));
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27658z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("CharMatcher.forPredicate(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class InRange extends FastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public final char f27659A;

        /* renamed from: z  reason: collision with root package name */
        public final char f27660z;

        public InRange(char c2, char c3) {
            Preconditions.d(c3 >= c2);
            this.f27660z = c2;
            this.f27659A = c3;
        }

        public boolean o(char c2) {
            return this.f27660z <= c2 && c2 <= this.f27659A;
        }

        public String toString() {
            String a2 = CharMatcher.v(this.f27660z);
            String a3 = CharMatcher.v(this.f27659A);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 27 + String.valueOf(a3).length());
            sb.append("CharMatcher.inRange('");
            sb.append(a2);
            sb.append("', '");
            sb.append(a3);
            sb.append("')");
            return sb.toString();
        }
    }

    public static final class Invisible extends RangesMatcher {
        public static final Invisible C = new Invisible();

        public Invisible() {
            super("CharMatcher.invisible()", "\u0000­؀؜۝܏࢐࣢ ᠎   ⁦　?﻿￹".toCharArray(), "  ­؅؜۝܏࢑࣢ ᠎‏ ⁤⁯　﻿￻".toCharArray());
        }
    }

    public static final class Is extends FastMatcher {

        /* renamed from: z  reason: collision with root package name */
        public final char f27661z;

        public Is(char c2) {
            this.f27661z = c2;
        }

        public CharMatcher b(CharMatcher charMatcher) {
            return charMatcher.o(this.f27661z) ? this : CharMatcher.s();
        }

        public boolean o(char c2) {
            return c2 == this.f27661z;
        }

        public CharMatcher r() {
            return CharMatcher.m(this.f27661z);
        }

        public String toString() {
            String a2 = CharMatcher.v(this.f27661z);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(a2);
            sb.append("')");
            return sb.toString();
        }

        public CharMatcher u(CharMatcher charMatcher) {
            return charMatcher.o(this.f27661z) ? charMatcher : CharMatcher.super.u(charMatcher);
        }
    }

    public static final class IsEither extends FastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public final char f27662A;

        /* renamed from: z  reason: collision with root package name */
        public final char f27663z;

        public IsEither(char c2, char c3) {
            this.f27663z = c2;
            this.f27662A = c3;
        }

        public boolean o(char c2) {
            return c2 == this.f27663z || c2 == this.f27662A;
        }

        public String toString() {
            String a2 = CharMatcher.v(this.f27663z);
            String a3 = CharMatcher.v(this.f27662A);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 21 + String.valueOf(a3).length());
            sb.append("CharMatcher.anyOf(\"");
            sb.append(a2);
            sb.append(a3);
            sb.append("\")");
            return sb.toString();
        }
    }

    public static final class IsNot extends FastMatcher {

        /* renamed from: z  reason: collision with root package name */
        public final char f27664z;

        public IsNot(char c2) {
            this.f27664z = c2;
        }

        public CharMatcher b(CharMatcher charMatcher) {
            return charMatcher.o(this.f27664z) ? CharMatcher.super.b(charMatcher) : charMatcher;
        }

        public boolean o(char c2) {
            return c2 != this.f27664z;
        }

        public CharMatcher r() {
            return CharMatcher.k(this.f27664z);
        }

        public String toString() {
            String a2 = CharMatcher.v(this.f27664z);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 21);
            sb.append("CharMatcher.isNot('");
            sb.append(a2);
            sb.append("')");
            return sb.toString();
        }

        public CharMatcher u(CharMatcher charMatcher) {
            return charMatcher.o(this.f27664z) ? CharMatcher.c() : this;
        }
    }

    public static final class JavaDigit extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public static final JavaDigit f27665z = new JavaDigit();

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            return Character.isDigit(c2);
        }

        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    public static final class JavaIsoControl extends NamedFastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public static final JavaIsoControl f27666A = new JavaIsoControl();

        public JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        public boolean o(char c2) {
            return c2 <= 31 || (c2 >= 127 && c2 <= 159);
        }
    }

    public static final class JavaLetter extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public static final JavaLetter f27667z = new JavaLetter();

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            return Character.isLetter(c2);
        }

        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    public static final class JavaLetterOrDigit extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public static final JavaLetterOrDigit f27668z = new JavaLetterOrDigit();

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            return Character.isLetterOrDigit(c2);
        }

        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    public static final class JavaLowerCase extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public static final JavaLowerCase f27669z = new JavaLowerCase();

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            return Character.isLowerCase(c2);
        }

        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    public static final class JavaUpperCase extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public static final JavaUpperCase f27670z = new JavaUpperCase();

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            return Character.isUpperCase(c2);
        }

        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    public static abstract class NamedFastMatcher extends FastMatcher {

        /* renamed from: z  reason: collision with root package name */
        public final String f27671z;

        public NamedFastMatcher(String str) {
            this.f27671z = (String) Preconditions.q(str);
        }

        public final String toString() {
            return this.f27671z;
        }
    }

    public static class Negated extends CharMatcher {

        /* renamed from: z  reason: collision with root package name */
        public final CharMatcher f27672z;

        public Negated(CharMatcher charMatcher) {
            this.f27672z = (CharMatcher) Preconditions.q(charMatcher);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public int g(CharSequence charSequence) {
            return charSequence.length() - this.f27672z.g(charSequence);
        }

        public boolean o(char c2) {
            return !this.f27672z.o(c2);
        }

        public boolean p(CharSequence charSequence) {
            return this.f27672z.q(charSequence);
        }

        public boolean q(CharSequence charSequence) {
            return this.f27672z.p(charSequence);
        }

        public CharMatcher r() {
            return this.f27672z;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27672z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append(valueOf);
            sb.append(".negate()");
            return sb.toString();
        }
    }

    public static class NegatedFastMatcher extends Negated {
        public NegatedFastMatcher(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    public static final class None extends NamedFastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public static final None f27673A = new None();

        public None() {
            super("CharMatcher.none()");
        }

        public CharMatcher b(CharMatcher charMatcher) {
            Preconditions.q(charMatcher);
            return this;
        }

        public int g(CharSequence charSequence) {
            Preconditions.q(charSequence);
            return 0;
        }

        public int i(CharSequence charSequence) {
            Preconditions.q(charSequence);
            return -1;
        }

        public int j(CharSequence charSequence, int i2) {
            Preconditions.t(i2, charSequence.length());
            return -1;
        }

        public boolean o(char c2) {
            return false;
        }

        public boolean p(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public boolean q(CharSequence charSequence) {
            Preconditions.q(charSequence);
            return true;
        }

        public CharMatcher r() {
            return CharMatcher.c();
        }

        public CharMatcher u(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.q(charMatcher);
        }
    }

    public static final class Or extends CharMatcher {

        /* renamed from: A  reason: collision with root package name */
        public final CharMatcher f27674A;

        /* renamed from: z  reason: collision with root package name */
        public final CharMatcher f27675z;

        public Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f27675z = (CharMatcher) Preconditions.q(charMatcher);
            this.f27674A = (CharMatcher) Preconditions.q(charMatcher2);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            return this.f27675z.o(c2) || this.f27674A.o(c2);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27675z);
            String valueOf2 = String.valueOf(this.f27674A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
            sb.append("CharMatcher.or(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class RangesMatcher extends CharMatcher {

        /* renamed from: A  reason: collision with root package name */
        public final char[] f27676A;

        /* renamed from: B  reason: collision with root package name */
        public final char[] f27677B;

        /* renamed from: z  reason: collision with root package name */
        public final String f27678z;

        public RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.f27678z = str;
            this.f27676A = cArr;
            this.f27677B = cArr2;
            Preconditions.d(cArr.length == cArr2.length);
            int i2 = 0;
            while (i2 < cArr.length) {
                Preconditions.d(cArr[i2] <= cArr2[i2]);
                int i3 = i2 + 1;
                if (i3 < cArr.length) {
                    Preconditions.d(cArr2[i2] < cArr[i3]);
                }
                i2 = i3;
            }
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean o(char c2) {
            int binarySearch = Arrays.binarySearch(this.f27676A, c2);
            if (binarySearch >= 0) {
                return true;
            }
            int i2 = (~binarySearch) - 1;
            return i2 >= 0 && c2 <= this.f27677B[i2];
        }

        public String toString() {
            return this.f27678z;
        }
    }

    public static final class SingleWidth extends RangesMatcher {
        public static final SingleWidth C = new SingleWidth();

        public SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        }
    }

    public static final class Whitespace extends NamedFastMatcher {

        /* renamed from: A  reason: collision with root package name */
        public static final int f27679A = Integer.numberOfLeadingZeros(31);

        /* renamed from: B  reason: collision with root package name */
        public static final Whitespace f27680B = new Whitespace();

        public Whitespace() {
            super("CharMatcher.whitespace()");
        }

        public boolean o(char c2) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c2) >>> f27679A) == c2;
        }
    }

    public static CharMatcher c() {
        return Any.f27653A;
    }

    public static CharMatcher d(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new AnyOf(charSequence) : l(charSequence.charAt(0), charSequence.charAt(1)) : k(charSequence.charAt(0)) : s();
    }

    public static CharMatcher f() {
        return Ascii.f27655A;
    }

    public static CharMatcher h(char c2, char c3) {
        return new InRange(c2, c3);
    }

    public static CharMatcher k(char c2) {
        return new Is(c2);
    }

    public static IsEither l(char c2, char c3) {
        return new IsEither(c2, c3);
    }

    public static CharMatcher m(char c2) {
        return new IsNot(c2);
    }

    public static CharMatcher n() {
        return JavaIsoControl.f27666A;
    }

    public static CharMatcher s() {
        return None.f27673A;
    }

    public static CharMatcher t(CharSequence charSequence) {
        return d(charSequence).r();
    }

    public static String v(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static CharMatcher w() {
        return Whitespace.f27680B;
    }

    public CharMatcher b(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    /* renamed from: e */
    public boolean apply(Character ch) {
        return o(ch.charValue());
    }

    public int g(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (o(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public int i(CharSequence charSequence) {
        return j(charSequence, 0);
    }

    public int j(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        Preconditions.t(i2, length);
        while (i2 < length) {
            if (o(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public abstract boolean o(char c2);

    public boolean p(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!o(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean q(CharSequence charSequence) {
        return i(charSequence) == -1;
    }

    public CharMatcher r() {
        return new Negated(this);
    }

    public String toString() {
        return super.toString();
    }

    public CharMatcher u(CharMatcher charMatcher) {
        return new Or(this, charMatcher);
    }
}
