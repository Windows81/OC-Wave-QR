package com.google.common.net;

import com.google.common.escape.Escaper;

@ElementTypesAreNonnullByDefault
public final class UrlEscapers {

    /* renamed from: a  reason: collision with root package name */
    public static final Escaper f29118a = new PercentEscaper("-_.*", true);

    /* renamed from: b  reason: collision with root package name */
    public static final Escaper f29119b = new PercentEscaper("-._~!$'()*,;&=@:+", false);

    /* renamed from: c  reason: collision with root package name */
    public static final Escaper f29120c = new PercentEscaper("-._~!$'()*,;&=@:+/?", false);
}
