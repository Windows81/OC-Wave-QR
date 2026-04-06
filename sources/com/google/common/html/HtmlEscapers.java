package com.google.common.html;

import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

@ElementTypesAreNonnullByDefault
public final class HtmlEscapers {

    /* renamed from: a  reason: collision with root package name */
    public static final Escaper f28936a = Escapers.a().b('\"', "&quot;").b('\'', "&#39;").b('&', "&amp;").b('<', "&lt;").b('>', "&gt;").c();
}
