package io.realm.internal.android;

import java.text.ParsePosition;
import java.util.regex.Pattern;

public class JsonUtils {

    /* renamed from: a  reason: collision with root package name */
    public static Pattern f40248a = Pattern.compile("/Date\\((\\d*)(?:[+-]\\d*)?\\)/");

    /* renamed from: b  reason: collision with root package name */
    public static Pattern f40249b = Pattern.compile("-?\\d+");

    /* renamed from: c  reason: collision with root package name */
    public static ParsePosition f40250c = new ParsePosition(0);
}
