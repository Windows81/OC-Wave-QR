package com.lokalise.sdk;

import com.lokalise.sdk.utils.ParsedAttrs;
import com.lokalise.sdk.utils.ParsedAttrsImplV26;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LokalisePreInterceptor$parsedAttrs$2 extends Lambda implements Function0<ParsedAttrs> {
    public static final LokalisePreInterceptor$parsedAttrs$2 INSTANCE = new LokalisePreInterceptor$parsedAttrs$2();

    public LokalisePreInterceptor$parsedAttrs$2() {
        super(0);
    }

    public final ParsedAttrs invoke() {
        return new ParsedAttrsImplV26();
    }
}
