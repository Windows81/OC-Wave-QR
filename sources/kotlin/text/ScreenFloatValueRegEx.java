package kotlin.text;

import kotlin.Metadata;

@Metadata
final class ScreenFloatValueRegEx {

    /* renamed from: a  reason: collision with root package name */
    public static final ScreenFloatValueRegEx f41182a = new ScreenFloatValueRegEx();

    /* renamed from: b  reason: collision with root package name */
    public static final Regex f41183b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f41183b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
