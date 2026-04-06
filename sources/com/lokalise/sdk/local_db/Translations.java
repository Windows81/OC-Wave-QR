package com.lokalise.sdk.local_db;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.com_lokalise_sdk_local_db_TranslationsRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class Translations extends RealmObject implements com_lokalise_sdk_local_db_TranslationsRealmProxyInterface {
    @Index
    private String key;
    private String langId;
    private int type;
    private String value;

    public Translations() {
        this((String) null, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final String getLangId() {
        return realmGet$langId();
    }

    public final int getType() {
        return realmGet$type();
    }

    public final String getValue() {
        return realmGet$value();
    }

    public String realmGet$key() {
        return this.key;
    }

    public String realmGet$langId() {
        return this.langId;
    }

    public int realmGet$type() {
        return this.type;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$key(String str) {
        this.key = str;
    }

    public void realmSet$langId(String str) {
        this.langId = str;
    }

    public void realmSet$type(int i2) {
        this.type = i2;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    public final void setKey(String str) {
        Intrinsics.i(str, "<set-?>");
        realmSet$key(str);
    }

    public final void setLangId(String str) {
        Intrinsics.i(str, "<set-?>");
        realmSet$langId(str);
    }

    public final void setType(int i2) {
        realmSet$type(i2);
    }

    public final void setValue(String str) {
        Intrinsics.i(str, "<set-?>");
        realmSet$value(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Translations(String str, String str2, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str3);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
    }

    public Translations(String str, String str2, int i2, String str3) {
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "value");
        Intrinsics.i(str3, "langId");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
        realmSet$key(str);
        realmSet$value(str2);
        realmSet$type(i2);
        realmSet$langId(str3);
    }
}
