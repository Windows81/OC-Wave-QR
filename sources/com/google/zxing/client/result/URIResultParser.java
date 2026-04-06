package com.google.zxing.client.result;

import java.util.regex.Pattern;

public final class URIResultParser extends ResultParser {

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f32577f = Pattern.compile("[-._~:/?#\\[\\]@!$&'()*+,;=%A-Za-z0-9]+");

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f32578g = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f32579h = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f32580i = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");
}
