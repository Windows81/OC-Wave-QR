package com.hansecom.abt.api;

import com.hansecom.abt.R;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;

@Metadata
public final class NotAuthorizedException extends LocalizedException {

    /* renamed from: A  reason: collision with root package name */
    public final String f33118A;

    /* renamed from: B  reason: collision with root package name */
    public final String f33119B;

    public NotAuthorizedException(String str, String str2) {
        super(StringValueKt.c(R.string.S3));
        this.f33118A = str;
        this.f33119B = str2;
    }

    public final String b() {
        return this.f33118A;
    }
}
