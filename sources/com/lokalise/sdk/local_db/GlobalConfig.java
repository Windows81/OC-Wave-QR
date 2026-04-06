package com.lokalise.sdk.local_db;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_lokalise_sdk_local_db_GlobalConfigRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class GlobalConfig extends RealmObject implements com_lokalise_sdk_local_db_GlobalConfigRealmProxyInterface {
    private long bundleId;
    private String lastKnownAppVersion;
    @PrimaryKey
    private String userUUID;

    public GlobalConfig() {
        this((String) null, 0, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
    }

    public final long getBundleId() {
        return realmGet$bundleId();
    }

    public final String getLastKnownAppVersion() {
        return realmGet$lastKnownAppVersion();
    }

    public final String getUserUUID() {
        return realmGet$userUUID();
    }

    public long realmGet$bundleId() {
        return this.bundleId;
    }

    public String realmGet$lastKnownAppVersion() {
        return this.lastKnownAppVersion;
    }

    public String realmGet$userUUID() {
        return this.userUUID;
    }

    public void realmSet$bundleId(long j2) {
        this.bundleId = j2;
    }

    public void realmSet$lastKnownAppVersion(String str) {
        this.lastKnownAppVersion = str;
    }

    public void realmSet$userUUID(String str) {
        this.userUUID = str;
    }

    public final void setBundleId(long j2) {
        realmSet$bundleId(j2);
    }

    public final void setLastKnownAppVersion(String str) {
        Intrinsics.i(str, "<set-?>");
        realmSet$lastKnownAppVersion(str);
    }

    public final void setUserUUID(String str) {
        Intrinsics.i(str, "<set-?>");
        realmSet$userUUID(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GlobalConfig(String str, long j2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : j2, (i2 & 4) != 0 ? "" : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
    }

    public GlobalConfig(String str, long j2, String str2) {
        Intrinsics.i(str, "userUUID");
        Intrinsics.i(str2, "lastKnownAppVersion");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).a();
        }
        realmSet$userUUID(str);
        realmSet$bundleId(j2);
        realmSet$lastKnownAppVersion(str2);
    }
}
