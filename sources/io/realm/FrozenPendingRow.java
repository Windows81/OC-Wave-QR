package io.realm;

import io.realm.internal.InvalidRow;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsSet;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public enum FrozenPendingRow implements Row {
    INSTANCE;

    public OsMap A(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public OsSet B(long j2, RealmFieldType realmFieldType) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public NativeRealmAny C(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public boolean D(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public byte[] E(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public void F() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public double G(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public float H(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public String I(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public OsList M(long j2, RealmFieldType realmFieldType) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public OsMap N(long j2, RealmFieldType realmFieldType) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public RealmFieldType Q(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public Row R(OsSharedRealm osSharedRealm) {
        return InvalidRow.INSTANCE;
    }

    public long S() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public boolean d() {
        return false;
    }

    public Decimal128 f(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public String[] getColumnNames() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public void h(long j2, String str) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public boolean isLoaded() {
        return false;
    }

    public Table j() {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public void k(long j2, boolean z2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public OsSet l(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public ObjectId m(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public UUID n(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public boolean o(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public long p(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public OsList r(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public void t(long j2, long j3) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public Date x(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public boolean y(long j2) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }

    public long z(String str) {
        throw new IllegalStateException("This object was frozen while a query for it was still running.");
    }
}
