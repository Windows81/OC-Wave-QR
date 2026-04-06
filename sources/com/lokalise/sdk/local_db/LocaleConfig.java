package com.lokalise.sdk.local_db;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_lokalise_sdk_local_db_LocaleConfigRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class LocaleConfig extends RealmObject implements com_lokalise_sdk_local_db_LocaleConfigRealmProxyInterface {
    private boolean isDefault;
    @PrimaryKey
    private String langId;

    public LocaleConfig() {
        this((String) null, false, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
    }

    public final String getLangId() {
        return realmGet$langId();
    }

    public final boolean isDefault() {
        return realmGet$isDefault();
    }

    public boolean realmGet$isDefault() {
        return this.isDefault;
    }

    public String realmGet$langId() {
        return this.langId;
    }

    public void realmSet$isDefault(boolean z2) {
        this.isDefault = z2;
    }

    public void realmSet$langId(String str) {
        this.langId = str;
    }

    public final void setDefault(boolean z2) {
        realmSet$isDefault(z2);
    }

    public final void setLangId(String str) {
        Intrinsics.i(str, "<set-?>");
        realmSet$langId(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocaleConfig(String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
    }

    public LocaleConfig(String str, boolean z2) {
        Intrinsics.i(str, "langId");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
        realmSet$langId(str);
        realmSet$isDefault(z2);
    }
}
