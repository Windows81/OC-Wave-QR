package com.hansecom.abt.data.useCases.configurations;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.regularExpressions.RegularExpressionConfigItem;
import com.hansecom.abt.data.config.regularExpressions.RegularExpressionsConfiguration;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import timber.log.Timber;
import u.d;

@Singleton
@Metadata
public final class GetRegularExpressionUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final Json f33881a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f33882b = LazyKt.b(new d(this));

    public GetRegularExpressionUseCase(Json json) {
        Intrinsics.i(json, "json");
        this.f33881a = json;
    }

    public static final RegularExpressionsConfiguration b(GetRegularExpressionUseCase getRegularExpressionUseCase) {
        Map map;
        FirebaseRemoteConfigValue r2 = RemoteConfigKt.a(Firebase.f30878a).r(RemoteConfig.REGULAR_EXPRESSION.j());
        Intrinsics.h(r2, "getValue(...)");
        try {
            Json json = getRegularExpressionUseCase.f33881a;
            String d2 = r2.d();
            Intrinsics.h(d2, "asString(...)");
            json.a();
            Iterable<RegularExpressionConfigItem> iterable = (Iterable) json.b(new ArrayListSerializer(RegularExpressionConfigItem.Companion.serializer()), d2);
            map = new LinkedHashMap(RangesKt.e(MapsKt.e(CollectionsKt.x(iterable, 10)), 16));
            for (RegularExpressionConfigItem regularExpressionConfigItem : iterable) {
                Pair a2 = TuplesKt.a(regularExpressionConfigItem.b(), regularExpressionConfigItem.a());
                map.put(a2.e(), a2.f());
            }
        } catch (Throwable th) {
            Timber.f44337a.c(th);
            map = MapsKt.h();
        }
        String str = (String) map.get("FIRST_NAME");
        String str2 = ".*";
        if (str == null) {
            str = str2;
        }
        Regex regex = new Regex(str);
        String str3 = (String) map.get("PASSWORD");
        if (str3 == null) {
            str3 = str2;
        }
        Regex regex2 = new Regex(str3);
        String str4 = (String) map.get("LAST_NAME");
        if (str4 == null) {
            str4 = str2;
        }
        Regex regex3 = new Regex(str4);
        String str5 = (String) map.get("PHONE_NUMBER");
        if (str5 == null) {
            str5 = str2;
        }
        Regex regex4 = new Regex(str5);
        String str6 = (String) map.get("EMAIL");
        if (str6 == null) {
            str6 = str2;
        }
        Regex regex5 = new Regex(str6);
        String str7 = (String) map.get("SECURITY_QUESTION_ANSWER");
        if (str7 == null) {
            str7 = str2;
        }
        Regex regex6 = new Regex(str7);
        String str8 = (String) map.get("ACCOUNT_PIN");
        if (str8 != null) {
            str2 = str8;
        }
        return new RegularExpressionsConfiguration(regex, regex2, regex3, regex4, regex5, regex6, new Regex(str2));
    }

    public final RegularExpressionsConfiguration c() {
        return (RegularExpressionsConfiguration) this.f33882b.getValue();
    }

    public final RegularExpressionsConfiguration d() {
        return c();
    }
}
