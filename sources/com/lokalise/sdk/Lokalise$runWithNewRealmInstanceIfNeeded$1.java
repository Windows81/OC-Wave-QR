package com.lokalise.sdk;

import com.lokalise.sdk.Lokalise;
import io.realm.Realm;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Lokalise$runWithNewRealmInstanceIfNeeded$1 extends Lambda implements Function0<Object> {
    final /* synthetic */ Object[] $formatArgs;
    final /* synthetic */ String $key;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Lokalise.TranslationType $type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Lokalise$runWithNewRealmInstanceIfNeeded$1(String str, Lokalise.TranslationType translationType, Locale locale, Object[] objArr) {
        super(0);
        this.$key = str;
        this.$type = translationType;
        this.$locale = locale;
        this.$formatArgs = objArr;
    }

    public final Object invoke() {
        if (Lokalise.threadExecutorRealmInstance == null) {
            Lokalise.threadExecutorRealmInstance = Lokalise.INSTANCE.newRealmInstance();
        }
        Lokalise lokalise = Lokalise.INSTANCE;
        String str = this.$key;
        Lokalise.TranslationType translationType = this.$type;
        Locale locale = this.$locale;
        Object[] objArr = this.$formatArgs;
        Realm access$getThreadExecutorRealmInstance$p = Lokalise.threadExecutorRealmInstance;
        if (access$getThreadExecutorRealmInstance$p == null) {
            Intrinsics.y("threadExecutorRealmInstance");
            access$getThreadExecutorRealmInstance$p = null;
        }
        return lokalise.m20sdkGetStringnbQUOxs(str, translationType, locale, objArr, access$getThreadExecutorRealmInstance$p);
    }
}
