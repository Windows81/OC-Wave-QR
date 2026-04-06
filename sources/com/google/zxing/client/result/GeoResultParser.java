package com.google.zxing.client.result;

import java.util.regex.Pattern;

public final class GeoResultParser extends ResultParser {

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f32558f = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);
}
